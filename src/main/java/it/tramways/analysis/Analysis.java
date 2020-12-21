package it.tramways.analysis;

import it.tramways.analysis.api.model.AnalysisResult;
import it.tramways.core.Identifiable;

public interface Analysis extends Identifiable {

    AnalysisResult run();

}
