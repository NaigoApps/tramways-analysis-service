package it.tramways.analysis.api;

import it.tramways.analysis.api.v1.model.Analysis;
import it.tramways.analysis.api.v1.model.AnalysisDescription;

import java.util.List;

public interface AnalysisLauncher {

    void launch(Analysis analysis);

}
