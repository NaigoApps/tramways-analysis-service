package it.tramways.analysis.commons.kafka;

import it.tramways.analysis.api.v1.model.AnalysisResult;
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
public class OutboundKafkaConfiguration {

    /**
     * Sets up Kafka-Spring producer factory
     *
     * @return ProducerFactory
     */
    @Bean
    public ProducerFactory<Integer, AnalysisResult> producerFactory() {
        return new DefaultKafkaProducerFactory<>(producerProps(), new IntegerSerializer(), new JsonSerializer<>());
    }

    /**
     * Sets up channel for analysis result
     *
     * @return ProducerFactory
     */
    @Bean
    public KafkaTemplate<Integer, AnalysisResult> analysisResultTemplate() {
        return new KafkaTemplate<>(producerFactory());
    }

    private Map<String, Object> producerProps() {
        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        return props;
    }

}
