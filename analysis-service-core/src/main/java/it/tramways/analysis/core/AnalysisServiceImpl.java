package it.tramways.analysis.core;

import it.tramways.analysis.api.AnalysisLauncher;
import it.tramways.analysis.api.AnalysisRepository;
import it.tramways.analysis.api.v1.model.Analysis;
import it.tramways.analysis.api.v1.model.AnalysisRequest;
import org.springframework.stereotype.Service;

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
    public void requestAnalysis(AnalysisRequest request) {
        Analysis analysis = new Analysis();
        analysis.setUuid(UUID.randomUUID().toString());
        analysis.setProjectUuid(request.getProjectId());
        analysis.setMapId(request.getMapId());
        analysis.setAnalysisType(request.getAnalysisTypeId());
        analysis.setName("Test analysis");
        analysis.setAnalysisType(request.getAnalysisTypeId());
        analysis.setParameters(request.getParameters());
        repository.createAnalysis(analysis);
        launcher.launch(request);
    }
}
