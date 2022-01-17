package it.tramways.analysis.commons.kafka;

public class AnalysisKafkaTopicsUtility {

    private AnalysisKafkaTopicsUtility(){
        //Utility class
    }

    public static String getAnalysisLaunchTopic(String analysisService) {
        return AnalysisKafkaTopics.ANALYSIS_LAUNCH + "-" + analysisService;
    }

    public static String getAnalysisStatusTopic() {
        return AnalysisKafkaTopics.ANALYSIS_STATUS;
    }

    public static String getAnalysisResultTopic() {
        return AnalysisKafkaTopics.ANALYSIS_RESULT;
    }

}
