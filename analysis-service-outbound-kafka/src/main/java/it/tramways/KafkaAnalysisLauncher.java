package it.tramways;

import it.tramways.analysis.api.AnalysisLauncher;
import it.tramways.analysis.api.v1.model.AnalysisRequest;
import it.tramways.analysis.commons.kafka.AnalysisKafkaTopicsUtility;
import it.tramways.analysis.commons.kafka.messages.AnalysisRequestMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaAnalysisLauncher implements AnalysisLauncher {

    private final KafkaTemplate<Integer, AnalysisRequestMessage> analysisLaunchTemplate;

    @Autowired
    public KafkaAnalysisLauncher(
            KafkaTemplate<Integer, AnalysisRequestMessage> analysisLaunchTemplate
    ) {
        this.analysisLaunchTemplate = analysisLaunchTemplate;
    }

    @Override
    public void launch(String analysisUuid, AnalysisRequest request) {
        analysisLaunchTemplate.send(getLaunchTopic(request), createAnalysisRequestMessage(analysisUuid, request));
    }

    private AnalysisRequestMessage createAnalysisRequestMessage(String analysisUuid, AnalysisRequest request) {
        AnalysisRequestMessage msg = new AnalysisRequestMessage();
        msg.setAnalysisUuid(analysisUuid);
        msg.setBody(request);
        return msg;
    }

    private String getLaunchTopic(AnalysisRequest request) {
        return AnalysisKafkaTopicsUtility.getAnalysisLaunchTopic(request.getAnalysisTypeId());
    }
}
