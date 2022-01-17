package it.tramways;

import it.tramways.analysis.api.v1.model.AnalysisRequest;
import org.apache.kafka.clients.consumer.ConsumerConfig;
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
public class OutboundAnalysisKafkaConfiguration {

    @Bean
    public KafkaTemplate<Integer, AnalysisRequest> analysisLaunchTemplate() {
        return new KafkaTemplate<>(createProducerFactory());
    }

    private <T> DefaultKafkaProducerFactory<Integer, T> createProducerFactory() {
        return new DefaultKafkaProducerFactory<>(defaultProps(), new IntegerSerializer(), new JsonSerializer<>());
    }

    private Map<String, Object> defaultProps() {
        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        return props;
    }

}
