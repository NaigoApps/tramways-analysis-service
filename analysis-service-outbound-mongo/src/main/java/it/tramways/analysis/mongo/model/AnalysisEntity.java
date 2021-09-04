package it.tramways.analysis.mongo.model;

import it.tramways.analysis.api.v1.model.Analysis;

public class AnalysisEntity extends Analysis {

    private String id;

    public static AnalysisEntity from(Analysis analysis) {
        AnalysisEntity result = new AnalysisEntity();
        result.setUuid(analysis.getUuid());
        result.setName(analysis.getName());
        result.setProjectUuid(analysis.getProjectUuid());
        result.setStatus(analysis.getStatus());
        result.setResult(analysis.getResult());
        return result;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
