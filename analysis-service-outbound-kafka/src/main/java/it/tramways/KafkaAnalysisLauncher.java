package it.tramways;

import it.tramways.analysis.api.AnalysisLauncher;
import it.tramways.analysis.api.v1.model.Analysis;
import it.tramways.analysis.api.v1.model.AnalysisRequest;
import it.tramways.analysis.commons.kafka.AnalysisKafkaTopicsUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaAnalysisLauncher implements AnalysisLauncher {

    private final KafkaTemplate<Integer, AnalysisRequest> analysisLaunchTemplate;

    @Autowired
    public KafkaAnalysisLauncher(
            KafkaTemplate<Integer, AnalysisRequest> analysisLaunchTemplate
    ) {
        this.analysisLaunchTemplate = analysisLaunchTemplate;
    }

    @Override
    public void launch(AnalysisRequest analysis) {
        analysisLaunchTemplate.send(getLaunchTopic(analysis), analysis);
    }

    private String getLaunchTopic(AnalysisRequest analysis) {
        return AnalysisKafkaTopicsUtility.getAnalysisLaunchTopic(analysis.getAnalysisTypeId());
    }
}
