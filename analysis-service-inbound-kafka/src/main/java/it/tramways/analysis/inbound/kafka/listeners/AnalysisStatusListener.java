package it.tramways.analysis.inbound.kafka.listeners;

import it.tramways.analysis.commons.kafka.messages.AnalysisStatusMessage;
import it.tramways.analysis.core.AnalysisService;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.MessageListener;
import org.springframework.stereotype.Component;

@Component
public class AnalysisStatusListener implements MessageListener<Integer, AnalysisStatusMessage> {

    private final AnalysisService analysisService;

    public AnalysisStatusListener(AnalysisService analysisService) {
        this.analysisService = analysisService;
    }

    @Override
    public void onMessage(ConsumerRecord<Integer, AnalysisStatusMessage> message) {
        analysisService.updateAnalysisStatus(message.value().getAnalysisUuid(), message.value().getBody());
    }
}
