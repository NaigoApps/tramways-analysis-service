package it.tramways.analysis;

import it.tramways.properties.api.model.Property;

public interface PropertySource {
    Property findProperty(String name);
    <T extends Property> T findProperty(String name, Class<T> type);
}
