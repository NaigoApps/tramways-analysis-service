package it.tramways;

import it.tramways.analysis.core.AnalysisService;
import it.tramways.analysis.api.v1.model.AnalysisResult;
import it.tramways.analysis.api.v1.model.AnalysisStatus;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.IntegerDeserializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ContainerProperties;
import org.springframework.kafka.listener.KafkaMessageListenerContainer;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import java.util.HashMap;
import java.util.Map;

import static it.tramways.analysis.commons.kafka.AnalysisKafkaTopicsUtility.getAnalysisResultTopic;
import static it.tramways.analysis.commons.kafka.AnalysisKafkaTopicsUtility.getAnalysisStatusTopic;

@Configuration
public class AnalysisResultReceiverConfiguration {

    private AnalysisService analysisService;

    //TODO WHY
    @Autowired
    public AnalysisResultReceiverConfiguration(
            AnalysisService analysisService
    ) {
        this.analysisService = analysisService;
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
    public KafkaMessageListenerContainer<Integer, AnalysisResult> analysisResultListenerContainer() {
        ContainerProperties containerProps = new ContainerProperties(getAnalysisResultTopic());
        //TODO
        //        containerProps.setMessageListener(requestListener);
//        containerProps.setGroupId(applicationConfig.getName());

        Map<String, Object> props = consumerProps();
        DefaultKafkaConsumerFactory<Integer, AnalysisResult> cf =
                new DefaultKafkaConsumerFactory<>(props, new IntegerDeserializer(), new JsonDeserializer<>(AnalysisResult.class));
        return new KafkaMessageListenerContainer<>(cf, containerProps);
    }

    @Bean
    public KafkaMessageListenerContainer<Integer, AnalysisStatus> analysisStatusListenerContainer() {
        ContainerProperties containerProps = new ContainerProperties(getAnalysisResultTopic());
        //TODO
        //        containerProps.setMessageListener(requestListener);
//        containerProps.setGroupId(applicationConfig.getName());

        Map<String, Object> props = consumerProps();
        DefaultKafkaConsumerFactory<Integer, AnalysisStatus> cf =
                new DefaultKafkaConsumerFactory<>(props, new IntegerDeserializer(), new JsonDeserializer<>(AnalysisStatus.class));
        return new KafkaMessageListenerContainer<>(cf, containerProps);
    }

    private Map<String, Object> consumerProps() {
        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        return props;
    }
}
