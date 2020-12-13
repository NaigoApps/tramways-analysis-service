package it.tramways.analysis;

import it.tramways.properties.api.model.ChoiceElement;
import it.tramways.properties.api.model.ChoiceProperty;
import it.tramways.properties.api.model.DecimalProperty;
import it.tramways.properties.api.model.Distribution;
import it.tramways.properties.api.model.DistributionProperty;
import it.tramways.properties.api.model.DistributionType;
import it.tramways.properties.api.model.ExponentialDistribution;
import it.tramways.properties.api.model.IntegerProperty;
import it.tramways.properties.api.model.Property;
import it.tramways.properties.api.model.StringProperty;
import it.tramways.properties.api.model.UniformDistribution;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public final class Properties {

    private Properties() {
    }

    public static IntegerProperty intProperty(String name, Integer value) {
        IntegerProperty property = new IntegerProperty();
        property.setName(name);
        property.setValue(value);
        property.setPropertyType(IntegerProperty.class.getSimpleName());
        return property;
    }

    public static DecimalProperty decimalProperty(String name, BigDecimal value) {
        DecimalProperty property = new DecimalProperty();
        property.setName(name);
        property.setValue(value);
        property.setPropertyType(DecimalProperty.class.getSimpleName());
        return property;
    }

    public static StringProperty stringProperty(String name, String value) {
        StringProperty property = new StringProperty();
        property.setName(name);
        property.setValue(value);
        property.setPropertyType(StringProperty.class.getSimpleName());
        return property;
    }

    public static ChoiceProperty choiceProperty(String name, String value,
        ChoiceElement... elements) {
        ChoiceProperty property = new ChoiceProperty();
        property.setName(name);
        property.setValue(value);
        property.setChoices(Arrays.asList(elements));
        property.setPropertyType(ChoiceProperty.class.getSimpleName());
        return property;
    }

    public static ChoiceElement choiceElement(String id, String label) {
        ChoiceElement element = new ChoiceElement();
        element.setId(id);
        element.setLabel(label);
        return element;
    }

    public static DistributionProperty uniformDistributionProperty(String name) {
        UniformDistribution distribution = new UniformDistribution();
        distribution.setLeft(BigDecimal.ZERO);
        distribution.setRight(BigDecimal.ONE);
        distribution.setDistributionType(DistributionType.UNIFORM);

        DistributionProperty property = new DistributionProperty();
        property.setName(name);
        property.setPropertyType(DistributionProperty.class.getSimpleName());
        property.setValue(distribution);
        return property;
    }

    public static DistributionProperty exponentialDistributionProperty(String name) {
        ExponentialDistribution distribution = new ExponentialDistribution();
        distribution.setLambda(BigDecimal.ONE);
        distribution.setDistributionType(DistributionType.EXPONENTIAL);

        DistributionProperty property = new DistributionProperty();
        property.setName(name);
        property.setPropertyType(DistributionProperty.class.getSimpleName());
        property.setValue(distribution);
        return property;
    }

    public static String findString(List<Property> props, Enum<?> name) {
        return findString(new DefaultPropertySource(props), name.name(), null);
    }

    public static String findString(List<Property> props, String name) {
        return findString(new DefaultPropertySource(props), name, null);
    }

    public static String findString(PropertySource props, String name) {
        return findString(props, name, null);
    }

    public static String findString(PropertySource props, String name, String def) {
        StringProperty property = props.findProperty(name, StringProperty.class);
        return property != null ? property.getValue() : def;
    }

    public static Integer findInteger(PropertySource source, String name) {
        IntegerProperty property = source.findProperty(name, IntegerProperty.class);
        return property != null ? property.getValue() : null;
    }

    public static Distribution findDistribution(PropertySource source, String name) {
        DistributionProperty property = source.findProperty(name, DistributionProperty.class);
        return property != null ? property.getValue() : null;
    }

    public static String findChoice(PropertySource propertySource, Enum<?> name) {
        ChoiceProperty property = propertySource.findProperty(name.name(), ChoiceProperty.class);
        return property != null ? property.getValue() : null;
    }
}