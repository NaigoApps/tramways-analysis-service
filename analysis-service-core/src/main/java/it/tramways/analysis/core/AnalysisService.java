package it.tramways.analysis.core;

import it.tramways.analysis.api.v1.model.AnalysisRequest;

public interface AnalysisService {

    void requestAnalysis(AnalysisRequest request);

}
