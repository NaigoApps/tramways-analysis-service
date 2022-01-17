package it.tramways.analysis.commons.kafka;

import it.tramways.analysis.api.v1.model.AnalysisResult;
import it.tramways.analysis.api.v1.model.AnalysisStatus;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class OutboundCommonsAnalysisKafkaConfiguration {

    @Bean
    public KafkaTemplate<Integer, AnalysisResult> analysisResultTemplate() {
        KafkaTemplate<Integer, AnalysisResult> result = new KafkaTemplate<>(createProducerFactory());
        result.setDefaultTopic(AnalysisKafkaTopicsUtility.getAnalysisResultTopic());
        return result;
    }

    @Bean
    public KafkaTemplate<Integer, AnalysisStatus> analysisStatusTemplate() {
        KafkaTemplate<Integer, AnalysisStatus> result = new KafkaTemplate<>(createProducerFactory());
        result.setDefaultTopic(AnalysisKafkaTopicsUtility.getAnalysisStatusTopic());
        return result;
    }

    private <T> DefaultKafkaProducerFactory<Integer, T> createProducerFactory() {
        return new DefaultKafkaProducerFactory<>(defaultProps(), new IntegerSerializer(), new JsonSerializer<>());
    }

    private Map<String, Object> defaultProps() {
        Map<String, Object> props = new HashMap<>();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        return props;
    }

}
