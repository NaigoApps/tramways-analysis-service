public class AnalysisKafkaTopicsService {

    public String getAnalysisLaunchTopic(String analysisService) {
        return AnalysisKafkaTopics.ANALYSIS_LAUNCHED + "-" + analysisService;
    }

}
