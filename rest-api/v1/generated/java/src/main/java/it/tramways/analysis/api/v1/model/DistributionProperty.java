/*
 * Tramways Analysis API
 * Tramways Analysis API
 *
 * The version of the OpenAPI document: 1.0.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package it.tramways.analysis.api.v1.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.tramways.analysis.api.v1.model.Distribution;
import it.tramways.analysis.api.v1.model.DistributionPropertyAllOf;
import it.tramways.analysis.api.v1.model.Property;
import java.io.IOException;

/**
 * DistributionProperty
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-23T18:21:41.517640500+01:00[Europe/Berlin]")
public class DistributionProperty extends Property {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Distribution value;

  public DistributionProperty() { 
    this.propertyType = this.getClass().getSimpleName();
  }

  public DistributionProperty value(Distribution value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Distribution getValue() {
    return value;
  }


  public void setValue(Distribution value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributionProperty distributionProperty = (DistributionProperty) o;
    return Objects.equals(this.value, distributionProperty.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributionProperty {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

