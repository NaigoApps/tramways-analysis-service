package it.tramways.analysis.commons.kafka.templates;

import it.tramways.analysis.commons.kafka.AnalysisKafkaTopicsUtility;
import it.tramways.analysis.commons.kafka.messages.AnalysisResultMessage;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

public class AnalysisResultTemplate extends KafkaTemplate<Integer, AnalysisResultMessage> {

    public AnalysisResultTemplate(ProducerFactory<Integer, AnalysisResultMessage> producerFactory) {
        super(producerFactory);
        setDefaultTopic(AnalysisKafkaTopicsUtility.getAnalysisResultTopic());
    }

}
