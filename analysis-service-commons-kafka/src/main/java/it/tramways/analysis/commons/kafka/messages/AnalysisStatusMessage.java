package it.tramways.analysis.commons.kafka.messages;

import it.tramways.analysis.api.v1.model.AnalysisStatus;

public class AnalysisStatusMessage {

    private String analysisUuid;
    private AnalysisStatus body;

    public String getAnalysisUuid() {
        return analysisUuid;
    }

    public void setAnalysisUuid(String analysisUuid) {
        this.analysisUuid = analysisUuid;
    }

    public AnalysisStatus getBody() {
        return body;
    }

    public void setBody(AnalysisStatus body) {
        this.body = body;
    }
}
