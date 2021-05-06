package it.tramways;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaTemplate;

public class AnalysisLauncher {


    @Bean
    public NewTopic topic(){
        return TopicBuilder.name("analysis").build();
    }

    @KafkaListener(id = "myId", topics = "analysis")
    public void listen(String input){
        System.out.println(input);
    }

    @Autowired
    private KafkaTemplate<String, String> template;

    public void send(){
        template.send("analysis", "data");
    }

}
