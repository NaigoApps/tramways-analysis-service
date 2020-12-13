package it.tramways.analysis.persistable;

import it.tramways.analysis.api.model.AnalysisResult;
import it.tramways.analysis.api.model.AnalysisStatus;
import it.tramways.analysis.persistable.utils.AnalysisResultJsonMapper;
import it.tramways.core.model.persistable.BaseEntity;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "analysis")
public class Analysis extends BaseEntity {

    private static final AnalysisResultJsonMapper ANALYSIS_RESULT_CONVERTER = new AnalysisResultJsonMapper();

    @Enumerated(EnumType.STRING)
    private AnalysisStatus status;

    private String name;

    @Lob
    private String analysisResult;

    public void setResult(AnalysisResult result) {
        this.analysisResult = ANALYSIS_RESULT_CONVERTER.map(result);
    }

    public AnalysisResult getResult() {
        return ANALYSIS_RESULT_CONVERTER.map(this.analysisResult);
    }

    public void setStatus(AnalysisStatus status) {
        this.status = status;
    }

    public AnalysisStatus getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
