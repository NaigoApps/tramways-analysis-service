package it.tramways.analysis;

import it.tramways.properties.api.model.Property;
import java.util.List;

public interface PropertiesCollector {

    void collectProperty(Property property);
    List<Property> listProperties();

}
