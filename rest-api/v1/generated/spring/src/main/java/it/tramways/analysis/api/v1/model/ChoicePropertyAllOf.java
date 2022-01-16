package it.tramways.analysis.api.v1.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.tramways.analysis.api.v1.model.ChoiceElement;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * ChoicePropertyAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-14T00:29:58.422+01:00[Europe/Berlin]")
public class ChoicePropertyAllOf   {
  @JsonProperty("choices")
  @Valid
  private List<ChoiceElement> choices = null;

  @JsonProperty("value")
  private String value;

  public ChoicePropertyAllOf choices(List<ChoiceElement> choices) {
    this.choices = choices;
    return this;
  }

  public ChoicePropertyAllOf addChoicesItem(ChoiceElement choicesItem) {
    if (this.choices == null) {
      this.choices = new ArrayList<>();
    }
    this.choices.add(choicesItem);
    return this;
  }

  /**
   * Get choices
   * @return choices
  */
  @ApiModelProperty(value = "")

  @Valid

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
  */
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

