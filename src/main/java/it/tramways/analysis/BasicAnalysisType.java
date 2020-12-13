package it.tramways.analysis;

import it.tramways.properties.api.model.Property;
import it.tramways.roadmaps.api.model.RoadMapContent;
import java.util.List;

public abstract class BasicAnalysisType implements AnalysisType {

    @Override
    public void prepareAnalysis(RoadMapContent map, List<Property> parameters,
        PropertiesCollector propertiesCollector,
        MessagesCollector messagesCollector) {
        parameters.forEach(parameter -> {
            parameter.setValid(true);
            propertiesCollector.collectProperty(parameter);
        });
        String name = Properties
            .findString(parameters, DefaultAnalysisProperties.ANALYSIS_NAME.name());
        if (name == null) {
            propertiesCollector.collectProperty(PropertyBuilder
                .string(DefaultAnalysisProperties.ANALYSIS_NAME, "Analysis name"));
        }
    }

}
