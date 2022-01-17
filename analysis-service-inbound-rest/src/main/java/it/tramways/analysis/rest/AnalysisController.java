package it.tramways.analysis.rest;

import it.tramways.analysis.core.AnalysisService;
import it.tramways.analysis.api.v1.AnalysisApi;
import it.tramways.analysis.api.v1.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tramways/rest")
public class AnalysisController implements AnalysisApi {

    private static final String ANALYSIS_TYPE = "analysis-type";

    @Autowired
    private AnalysisService analysisService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Override
    public ResponseEntity<Void> deleteAnalysis(String projectId, String mapId, String analysisId) {
        return null;
    }

    @Override
    public ResponseEntity<Analysis> getAnalysis(String projectId, String mapId, String analysisId) {
        return null;
    }

    @Override
    public ResponseEntity<List<AnalysisType>> getAvailableAnalysis(@NotNull @Valid String projectId,
                                                                   @NotNull @Valid String mapId) {
        return ResponseEntity.ok(discoveryClient.getServices().stream()
                .map(service -> discoveryClient.getInstances(service))
                .filter(instances -> !instances.isEmpty())
                .map(instances -> instances.iterator().next())
                .filter(isAnalysisService())
                .map(instance -> {
                    AnalysisType type = new AnalysisType();
                    type.setId(instance.getServiceId());
                    type.setName(instance.getMetadata().get(ANALYSIS_TYPE));
                    return type;
                }).collect(Collectors.toList()));
    }

    @Override
    public ResponseEntity<List<AnalysisDescription>> getMapAnalysis(String projectId,
                                                                    String mapId) {
        return null;
    }

    @Override
    public ResponseEntity<AnalysisResponse> launchAnalysis(@Valid AnalysisRequest analysisRequest) {
        return null;
    }

    private Predicate<ServiceInstance> isAnalysisService() {
        return instance -> instance.getMetadata().get(ANALYSIS_TYPE) != null;
    }
}
