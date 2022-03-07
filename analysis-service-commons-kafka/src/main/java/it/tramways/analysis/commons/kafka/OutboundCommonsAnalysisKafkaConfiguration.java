package it.tramways.analysis.commons.kafka;

import it.tramways.analysis.commons.kafka.templates.AnalysisResultTemplate;
import it.tramways.analysis.commons.kafka.templates.AnalysisStatusTemplate;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class OutboundCommonsAnalysisKafkaConfiguration {

    @Bean
    public AnalysisResultTemplate analysisResultTemplate() {
        return new AnalysisResultTemplate(createProducerFactory());
    }

    @Bean
    public AnalysisStatusTemplate analysisStatusTemplate() {
        AnalysisStatusTemplate result = new AnalysisStatusTemplate(createProducerFactory());
        result.setDefaultTopic(AnalysisKafkaTopicsUtility.getAnalysisStatusTopic());
        return result;
    }

    private <T> DefaultKafkaProducerFactory<Integer, T> createProducerFactory() {
        return new DefaultKafkaProducerFactory<>(defaultProps(), new IntegerSerializer(), new JsonSerializer<>());
    }

    private Map<String, Object> defaultProps() {
        Map<String, Object> props = new HashMap<>();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "http://192.168.1.249:9092");
        return props;
    }

}
