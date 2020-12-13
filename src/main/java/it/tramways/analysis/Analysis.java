package it.tramways.analysis;

import it.tramways.analysis.api.model.AnalysisResult;
import it.tramways.core.model.Identifiable;

public interface Analysis extends Identifiable {

    AnalysisResult run();

}
