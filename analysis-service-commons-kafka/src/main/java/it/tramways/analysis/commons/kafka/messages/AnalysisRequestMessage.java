package it.tramways.analysis.commons.kafka.messages;


import it.tramways.analysis.api.v1.model.AnalysisRequest;

public class AnalysisRequestMessage {

    private String analysisUuid;
    private AnalysisRequest body;

    public String getAnalysisUuid() {
        return analysisUuid;
    }

    public void setAnalysisUuid(String analysisUuid) {
        this.analysisUuid = analysisUuid;
    }

    public AnalysisRequest getBody() {
        return body;
    }

    public void setBody(AnalysisRequest body) {
        this.body = body;
    }
}
