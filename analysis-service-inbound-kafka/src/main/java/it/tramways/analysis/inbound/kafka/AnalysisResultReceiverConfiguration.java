package it.tramways.analysis.inbound.kafka;

import it.tramways.analysis.commons.kafka.messages.AnalysisResultMessage;
import it.tramways.analysis.commons.kafka.messages.AnalysisStatusMessage;
import it.tramways.analysis.inbound.kafka.listeners.AnalysisResultListener;
import it.tramways.analysis.inbound.kafka.listeners.AnalysisStatusListener;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.IntegerDeserializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ContainerProperties;
import org.springframework.kafka.listener.KafkaMessageListenerContainer;
import org.springframework.kafka.support.serializer.ErrorHandlingDeserializer;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import java.util.HashMap;
import java.util.Map;

import static it.tramways.analysis.commons.kafka.AnalysisKafkaTopicsUtility.getAnalysisResultTopic;
import static it.tramways.analysis.commons.kafka.AnalysisKafkaTopicsUtility.getAnalysisStatusTopic;

@Configuration
public class AnalysisResultReceiverConfiguration {

    private final String applicationName;
    private final AnalysisResultListener resultListener;
    private final AnalysisStatusListener statusListener;

    @Autowired
    public AnalysisResultReceiverConfiguration(
            @Value("${spring.application.name}") String applicationName,
            AnalysisResultListener resultListener,
            AnalysisStatusListener statusListener
    ) {
        this.applicationName = applicationName;
        this.resultListener = resultListener;
        this.statusListener = statusListener;
    }


    @Bean
    public NewTopic analysisStatusTopic() {
        return TopicBuilder.name(getAnalysisStatusTopic()).build();
    }

    @Bean
    public NewTopic analysisResultTopic() {
        return TopicBuilder.name(getAnalysisResultTopic()).build();
    }

    @Bean
    public KafkaMessageListenerContainer<Integer, AnalysisResultMessage> analysisResultListenerContainer() {
        ContainerProperties containerProps = new ContainerProperties(getAnalysisResultTopic());
        containerProps.setMessageListener(resultListener);
        containerProps.setGroupId(applicationName);

        Map<String, Object> props = consumerProps();
        DefaultKafkaConsumerFactory<Integer, AnalysisResultMessage> cf =
                new DefaultKafkaConsumerFactory<>(props, new IntegerDeserializer(), createDeserializer(AnalysisResultMessage.class));
        return new KafkaMessageListenerContainer<>(cf, containerProps);
    }

    @Bean
    public KafkaMessageListenerContainer<Integer, AnalysisStatusMessage> analysisStatusListenerContainer() {
        ContainerProperties containerProps = new ContainerProperties(getAnalysisStatusTopic());
        containerProps.setMessageListener(statusListener);
        containerProps.setGroupId(applicationName);

        Map<String, Object> props = consumerProps();
        DefaultKafkaConsumerFactory<Integer, AnalysisStatusMessage> cf =
                new DefaultKafkaConsumerFactory<>(props, new IntegerDeserializer(), createDeserializer(AnalysisStatusMessage.class));
        return new KafkaMessageListenerContainer<>(cf, containerProps);
    }

    private <T> ErrorHandlingDeserializer<T> createDeserializer(Class<T> targetClass) {
        return new ErrorHandlingDeserializer<>(new JsonDeserializer<>(targetClass));
    }

    private Map<String, Object> consumerProps() {
        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "http://192.168.1.249:9092");
        return props;
    }
}
