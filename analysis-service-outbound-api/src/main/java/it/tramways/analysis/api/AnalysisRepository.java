package it.tramways.analysis.api;

import it.tramways.analysis.api.v1.model.Analysis;
import it.tramways.analysis.api.v1.model.AnalysisDescription;

import java.util.List;

public interface AnalysisRepository {

    List<AnalysisDescription> findProjectAnalysis(String projectUuid);

    List<AnalysisDescription> findMapAnalysis(String projectUuid, String mapUuid);

    Analysis findAnalysis(String uuid);

    Analysis createAnalysis(Analysis command);

    Analysis updateAnalysis(Analysis analysis);

    void deleteAnalysis(String uuid);

}
