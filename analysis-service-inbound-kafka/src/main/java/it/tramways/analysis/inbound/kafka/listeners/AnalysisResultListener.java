package it.tramways.analysis.inbound.kafka.listeners;

import it.tramways.analysis.commons.kafka.messages.AnalysisResultMessage;
import it.tramways.analysis.core.AnalysisService;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.MessageListener;
import org.springframework.stereotype.Component;

@Component
public class AnalysisResultListener implements MessageListener<Integer, AnalysisResultMessage> {

    private final AnalysisService analysisService;

    public AnalysisResultListener(AnalysisService analysisService) {
        this.analysisService = analysisService;
    }

    @Override
    public void onMessage(ConsumerRecord<Integer, AnalysisResultMessage> message) {
        analysisService.updateAnalysisResult(message.value().getAnalysisUuid(), message.value().getBody());
    }

}
