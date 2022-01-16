package it.tramways;

import inbound.AnalysisService;
import it.tramways.analysis.commons.kafka.AnalysisKafkaTopicsUtility;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.IntegerDeserializer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ContainerProperties;
import org.springframework.kafka.listener.KafkaMessageListenerContainer;
import org.springframework.kafka.listener.MessageListener;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class AnalysisResultReceiverConfiguration {

    private AnalysisService analysisService;

    @Autowired
    public AnalysisResultReceiverConfiguration(
            AnalysisService analysisService
    ) {
        this.analysisService = analysisService;
    }


    @Bean
    public NewTopic analysisResultTopic() {
        return TopicBuilder.name(getAnalysisResultTopic()).build();
    }

    private String getAnalysisResultTopic() {
        return AnalysisKafkaTopicsUtility.getAnalysisResultTopic();
    }

    @Bean
    public ContainerProperties containerProperties() {
        ContainerProperties containerProps = new ContainerProperties(getAnalysisResultTopic());
//        containerProps.setMessageListener((MessageListener<Integer, String>) integerStringConsumerRecord -> launcher.launch());
        return containerProps;
    }

    @Bean
    public KafkaMessageListenerContainer<Integer, String> messageListenerContainer(ContainerProperties containerProps) {
        Map<String, Object> props = consumerProps();
        DefaultKafkaConsumerFactory<Integer, String> cf =
                new DefaultKafkaConsumerFactory<>(props);
        return new KafkaMessageListenerContainer<>(cf, containerProps);
    }

    private Map<String, Object> consumerProps() {
        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "analysis");
//        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, true);
//        props.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "100");
//        props.put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, "15000");
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, IntegerDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        return props;
    }
}
