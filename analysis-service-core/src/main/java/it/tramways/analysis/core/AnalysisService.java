package it.tramways.analysis.core;

import it.tramways.analysis.api.v1.model.*;

import java.util.List;

public interface AnalysisService {

    AnalysisDescription requestAnalysis(AnalysisRequest request);

    List<AnalysisDescription> getMapAnalysis(String project, String map);

    void updateAnalysisResult(String analysisUuid, AnalysisResult analysisResult);

    void updateAnalysisStatus(String analysisUuid, AnalysisStatus status);

    void deleteAnalysis(String analysisUuid);

    Analysis getAnalysis(String analysisId);

    Analysis updateAnalysisParameters(String analysisUuid, List<Property> parameters);
}
