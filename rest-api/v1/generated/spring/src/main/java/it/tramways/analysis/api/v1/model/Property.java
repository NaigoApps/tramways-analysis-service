package it.tramways.analysis.api.v1.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Property
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-17T23:33:43.660141500+01:00[Europe/Berlin]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "propertyType", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = ChoiceProperty.class, name = "ChoiceProperty"),
  @JsonSubTypes.Type(value = DecimalProperty.class, name = "DecimalProperty"),
  @JsonSubTypes.Type(value = DistributionProperty.class, name = "DistributionProperty"),
  @JsonSubTypes.Type(value = IntegerProperty.class, name = "IntegerProperty"),
  @JsonSubTypes.Type(value = StringProperty.class, name = "StringProperty"),
})

public class Property   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("propertyType")
  private String propertyType;

  @JsonProperty("valid")
  private Boolean valid;

  public Property name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Property description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Property propertyType(String propertyType) {
    this.propertyType = propertyType;
    return this;
  }

  /**
   * Get propertyType
   * @return propertyType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getPropertyType() {
    return propertyType;
  }

  public void setPropertyType(String propertyType) {
    this.propertyType = propertyType;
  }

  public Property valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
  */
  @ApiModelProperty(value = "")


  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Property property = (Property) o;
    return Objects.equals(this.name, property.name) &&
        Objects.equals(this.description, property.description) &&
        Objects.equals(this.propertyType, property.propertyType) &&
        Objects.equals(this.valid, property.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, propertyType, valid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Property {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    propertyType: ").append(toIndentedString(propertyType)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

