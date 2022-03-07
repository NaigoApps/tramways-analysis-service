package it.tramways.analysis.api;

import it.tramways.analysis.api.v1.model.AnalysisRequest;

public interface AnalysisLauncher {

    void launch(String analysisUuid, AnalysisRequest analysis);

}
