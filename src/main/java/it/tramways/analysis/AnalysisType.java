package it.tramways.analysis;

import it.tramways.properties.api.model.Property;
import it.tramways.roadmaps.api.model.RoadMapContent;
import java.util.List;

public interface AnalysisType {
	String getId();
	String getName();
	Analysis createAnalysis(NetworkMap networkMap, List<Property> parameters);
	void prepareAnalysis(RoadMapContent map, List<Property> parameters, PropertiesCollector propertiesCollector, MessagesCollector messagesCollector);
	List<Property> prepareAnalysis(String category);
}
