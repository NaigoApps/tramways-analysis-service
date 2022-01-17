package it.tramways.analysis.api;

import it.tramways.analysis.api.v1.model.Analysis;
import it.tramways.analysis.api.v1.model.AnalysisDescription;
import it.tramways.analysis.api.v1.model.AnalysisRequest;

import java.util.List;

public interface AnalysisLauncher {

    void launch(AnalysisRequest analysis);

}
