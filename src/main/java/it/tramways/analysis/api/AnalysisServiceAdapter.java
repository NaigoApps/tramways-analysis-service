package it.tramways.analysis.api;

import it.tramways.analysis.Analysis;
import it.tramways.analysis.AnalysisType;
import it.tramways.analysis.MessagesCollector;
import it.tramways.analysis.PropertiesCollector;
import it.tramways.analysis.api.model.AnalysisRequest;
import it.tramways.analysis.api.model.AnalysisResponse;
import it.tramways.analysis.api.model.AnalysisResultType;
import it.tramways.analysis.api.model.StringAnalysisResult;
import java.util.Collections;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import javax.enterprise.event.Event;
import javax.enterprise.event.Observes;
import javax.enterprise.event.TransactionPhase;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import tramways.DefaultMessagesCollector;
import tramways.core.model.analysis.Analysis;
import tramways.core.model.analysis.AnalysisType;
import tramways.core.model.analysis.AnalysisTypeFactory;
import tramways.core.model.analysis.DefaultAnalysisProperties;
import tramways.core.model.analysis.DefaultPropertiesCollector;
import tramways.core.model.analysis.PropertiesCollector;
import tramways.core.model.persistable.projects.Project;
import tramways.core.model.persistable.projects.RoadMap;
import tramways.core.model.properties.Properties;
import tramways.core.model.roadmap.NetworkMap;
import tramways.core.model.roadmap.RoadMapNetworkMapper;
import tramways.dto.mappers.AnalysisTypeMapper;
import tramways.inbound.RestUtils;
import tramways.inbound.api.AnalysisApiService;
import tramways.inbound.model.AnalysisRequest;
import tramways.inbound.model.AnalysisResponse;
import tramways.inbound.model.AnalysisResultType;
import tramways.inbound.model.AnalysisStatus;
import tramways.inbound.model.RoadMapContent;
import tramways.inbound.model.StringAnalysisResult;
import tramways.outbound.ProjectRepository;
import tramways.services.MessagesCollector;

@Transactional
public class AnalysisServiceAdapter implements AnalysisApi {

    @Inject
    Event<AnalysisEvent> analysisEvent;

    @Inject
    private AnalysisTypeFactory factory;

    @Inject
    private AnalysisTypeMapper mapper;

    @Inject
    private ProjectRepository projectRepository;

    @Inject
    private AnalysisResultSaver saver;

    @Override
    public Response getAvailableAnalysis(String projectId, String mapId,
        SecurityContext securityContext) {
        Project project = projectRepository.findById(projectId);
        RoadMap map = project.getMap(mapId);
        RoadMapContent mapContent = map.getContent();
        return RestUtils.ok(
            factory.getTypes().stream()
                .map(type -> mapper.map(type, mapContent, Collections.emptyList()))
                .collect(Collectors.toList()));
    }

    @Override
    public Response launchAnalysis(AnalysisRequest request, SecurityContext securityContext) {
        AnalysisType analysisType = factory.getType(request.getAnalysisTypeId());
        Project project = projectRepository.findById(request.getProjectId());
        RoadMap map = project.getMap(request.getMapId());
        NetworkMap networkMap = new RoadMapNetworkMapper(map.getContent()).map();

        MessagesCollector messagesCollector = new DefaultMessagesCollector();
        PropertiesCollector propertiesCollector = new DefaultPropertiesCollector();

        analysisType.prepareAnalysis(map.getContent(), request.getParameters(), propertiesCollector,
            messagesCollector);
        if (propertiesCollector.listProperties().stream()
            .allMatch(prop -> Boolean.TRUE.equals(prop.getValid()))
            && messagesCollector.listMessages().isEmpty()) {
            Analysis analysis = analysisType.createAnalysis(networkMap, request.getParameters());

            tramways.core.model.persistable.projects.Analysis persistable = new tramways.core.model.persistable.projects.Analysis();
            persistable.setName(Properties.findString(request.getParameters(),
                DefaultAnalysisProperties.ANALYSIS_NAME.name()));
            persistable.setStatus(AnalysisStatus.IN_PROGRESS);
            map.addAnalysis(persistable);

            TransactionSynchronizationManager
                .registerSynchronization(new TransactionSynchronization() {
                    @Override
                    public void afterCommit() {
                        runAnalysis(analysis);
                    }
                });
        }

        return createResponse(messagesCollector, propertiesCollector);
    }

    private Response createResponse(MessagesCollector messagesCollector,
        PropertiesCollector propertiesCollector) {
        AnalysisResponse response = new AnalysisResponse();
        response.setWarnings(messagesCollector.listMessages());
        response.setParameters(propertiesCollector.listProperties());
        response.setOk(
            messagesCollector.listMessages().isEmpty() && propertiesCollector.listProperties()
                .isEmpty());

        return Response.ok(response).build();
    }

    public void runAnalysis(Analysis analysis) {
        CompletableFuture.supplyAsync(analysis::run).handle((result, error) -> {
            if (error == null) {
                saver.persistAnalysisResult(analysis.getUuid(), result, true);
            } else {
                LoggerFactory.getLogger(getClass()).error("Error", error);
                StringAnalysisResult errorResult = new StringAnalysisResult();
                errorResult.setResultType(AnalysisResultType.STRING);
                errorResult.setMessage(error.getMessage());
                saver.persistAnalysisResult(analysis.getUuid(), errorResult, false);
            }
            return null;
        });
    }
}
