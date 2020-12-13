package it.tramways.analysis.api;

import it.tramways.analysis.api.model.Analysis;
import it.tramways.analysis.api.model.AnalysisDescription;
import it.tramways.analysis.api.model.AnalysisRequest;
import it.tramways.analysis.api.model.AnalysisResponse;
import it.tramways.analysis.api.model.AnalysisType;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class AnalysisController implements AnalysisApi{

    @Autowired
    private AnalysisServiceAdapter service;

    @Override
    public ResponseEntity<Void> deleteAnalysis(String mapId, String analysisId) {
        return null;
    }

    @Override
    public ResponseEntity<Analysis> getAnalysis(String mapId, String analysisId) {
        return null;
    }

    @Override
    public ResponseEntity<List<AnalysisDescription>> getMapAnalysis(String mapId) {
        return null;
    }

    @Override
    public ResponseEntity<List<AnalysisType>> getAvailableAnalysis(@NotNull @Valid String projectId,
        @NotNull @Valid String mapId) {
        return null;
    }

    @Override
    public ResponseEntity<AnalysisResponse> launchAnalysis(String mapId,
        @Valid AnalysisRequest analysisRequest) {
        return null;
    }
}
