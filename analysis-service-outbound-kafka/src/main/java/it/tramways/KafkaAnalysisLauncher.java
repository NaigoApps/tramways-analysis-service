package it.tramways;

import it.tramways.analysis.api.AnalysisLauncher;
import it.tramways.analysis.api.v1.model.Analysis;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaTemplate;

public class KafkaAnalysisLauncher implements AnalysisLauncher {

    @KafkaListener(id = "myId", topics = "analysis")
    public void listen(String input) {
        System.out.println(input);
    }

    @Autowired
    private KafkaTemplate<String, String> template;

    public void send() {
        template.send("analysis", "data");
    }

    @Override
    public void launch(Analysis analysis) {

    }
}
