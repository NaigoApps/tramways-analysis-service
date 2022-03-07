package it.tramways.analysis.core;

import it.tramways.analysis.api.AnalysisLauncher;
import it.tramways.analysis.api.AnalysisRepository;
import it.tramways.analysis.api.v1.model.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AnalysisServiceImpl implements AnalysisService {

    private final AnalysisRepository repository;
    private final AnalysisLauncher launcher;

    public AnalysisServiceImpl(
            AnalysisRepository repository,
            AnalysisLauncher launcher
    ) {
        this.repository = repository;
        this.launcher = launcher;
    }

    @Override
    public AnalysisDescription requestAnalysis(AnalysisRequest request) {
        Analysis analysis = new Analysis();
        analysis.setUuid(UUID.randomUUID().toString());
        analysis.setProjectUuid(request.getProjectId());
        analysis.setMapId(request.getMapId());
        analysis.setAnalysisType(request.getAnalysisTypeId());
        analysis.setName("Test analysis");
        analysis.setAnalysisType(request.getAnalysisTypeId());
        analysis.setParameters(request.getParameters());
        Analysis createdAnalysis = repository.createAnalysis(analysis);
        launcher.launch(createdAnalysis.getUuid(), request);
        return convertAnalysis(createdAnalysis);
    }

    private AnalysisDescription convertAnalysis(Analysis entity) {
        AnalysisDescription result = new AnalysisDescription();
        result.setUuid(entity.getUuid());
        result.setName(entity.getName());
        result.setStatus(entity.getStatus());
        return result;
    }

    @Override
    public List<AnalysisDescription> getMapAnalysis(String project, String map) {
        return repository.findMapAnalysis(project, map);
    }

    @Override
    public void updateAnalysisResult(String analysisUuid, AnalysisResult analysisResult) {
        Analysis analysis = repository.findAnalysis(analysisUuid);
        analysis.setResult(analysisResult);
        repository.updateAnalysis(analysis);
    }

    @Override
    public void updateAnalysisStatus(String analysisUuid, AnalysisStatus analysisStatus) {
        Analysis analysis = repository.findAnalysis(analysisUuid);
        analysis.setStatus(analysisStatus);
        repository.updateAnalysis(analysis);
    }

    @Override
    public void deleteAnalysis(String analysisUuid) {
        repository.deleteAnalysis(analysisUuid);
    }

    @Override
    public Analysis getAnalysis(String analysisId) {
        return repository.findAnalysis(analysisId);
    }

    @Override
    public Analysis updateAnalysisParameters(String analysisUuid, List<Property> parameters) {
        Analysis analysis = repository.findAnalysis(analysisUuid);
        analysis.setParameters(parameters);
        repository.updateAnalysis(analysis);
        return analysis;
    }

}
