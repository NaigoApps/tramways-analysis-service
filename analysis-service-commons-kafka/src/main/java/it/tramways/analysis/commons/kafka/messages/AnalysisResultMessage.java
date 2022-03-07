package it.tramways.analysis.commons.kafka.messages;

import it.tramways.analysis.api.v1.model.AnalysisResult;

public class AnalysisResultMessage {

    private String analysisUuid;
    private AnalysisResult body;

    public String getAnalysisUuid() {
        return analysisUuid;
    }

    public void setAnalysisUuid(String analysisUuid) {
        this.analysisUuid = analysisUuid;
    }

    public AnalysisResult getBody() {
        return body;
    }

    public void setBody(AnalysisResult body) {
        this.body = body;
    }
}
