/*
 * Tramways Analysis API
 * Tramways Analysis API
 *
 * The version of the OpenAPI document: 1.0.3
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
import it.tramways.analysis.api.v1.model.ChoiceElement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ChoicePropertyAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-17T23:33:48.022355900+01:00[Europe/Berlin]")
public class ChoicePropertyAllOf {
  public static final String SERIALIZED_NAME_CHOICES = "choices";
  @SerializedName(SERIALIZED_NAME_CHOICES)
  private List<ChoiceElement> choices = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public ChoicePropertyAllOf() { 
  }

  public ChoicePropertyAllOf choices(List<ChoiceElement> choices) {
    
    this.choices = choices;
    return this;
  }

  public ChoicePropertyAllOf addChoicesItem(ChoiceElement choicesItem) {
    if (this.choices == null) {
      this.choices = new ArrayList<ChoiceElement>();
    }
    this.choices.add(choicesItem);
    return this;
  }

   /**
   * Get choices
   * @return choices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ChoiceElement> getChoices() {
    return choices;
  }


  public void setChoices(List<ChoiceElement> choices) {
    this.choices = choices;
  }


  public ChoicePropertyAllOf value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
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
    ChoicePropertyAllOf choicePropertyAllOf = (ChoicePropertyAllOf) o;
    return Objects.equals(this.choices, choicePropertyAllOf.choices) &&
        Objects.equals(this.value, choicePropertyAllOf.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(choices, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChoicePropertyAllOf {\n");
    sb.append("    choices: ").append(toIndentedString(choices)).append("\n");
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

