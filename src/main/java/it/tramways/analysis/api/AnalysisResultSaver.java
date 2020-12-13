package it.tramways.analysis.api;

import it.tramways.analysis.api.model.AnalysisResult;
import it.tramways.analysis.api.model.AnalysisStatus;
import it.tramways.analysis.persistable.Analysis;
import it.tramways.analysis.persistable.AnalysisRepositoryImpl;
import javax.inject.Inject;
import javax.transaction.Transactional;

@Transactional
public class AnalysisResultSaver {

    @Inject
    private AnalysisRepositoryImpl analysisRepository;

    public void persistAnalysisResult(String analysisId,
        AnalysisResult result, boolean ok) {
        Analysis persistable = analysisRepository.findByUuid(analysisId);
        persistable.setResult(result);
        if (ok) {
            persistable.setStatus(AnalysisStatus.DONE);
        } else {
            persistable.setStatus(AnalysisStatus.ERROR);
        }
    }

}
