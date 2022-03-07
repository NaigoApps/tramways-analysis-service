package it.tramways.analysis.commons.kafka.templates;

import it.tramways.analysis.commons.kafka.AnalysisKafkaTopicsUtility;
import it.tramways.analysis.commons.kafka.messages.AnalysisResultMessage;
import it.tramways.analysis.commons.kafka.messages.AnalysisStatusMessage;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

public class AnalysisStatusTemplate extends KafkaTemplate<Integer, AnalysisStatusMessage> {

    public AnalysisStatusTemplate(ProducerFactory<Integer, AnalysisStatusMessage> producerFactory) {
        super(producerFactory);
        setDefaultTopic(AnalysisKafkaTopicsUtility.getAnalysisStatusTopic());
    }

}
