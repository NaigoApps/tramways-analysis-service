package it.tramways.analysis.api.v1.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.tramways.analysis.api.v1.model.Property;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * AnalysisResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-12T12:53:06.696+01:00[Europe/Berlin]")
public class AnalysisResponse   {
  @JsonProperty("warnings")
  @Valid
  private List<String> warnings = null;

  @JsonProperty("parameters")
  @Valid
  private List<Property> parameters = null;

  @JsonProperty("ok")
  private Boolean ok;

  public AnalysisResponse warnings(List<String> warnings) {
    this.warnings = warnings;
    return this;
  }

  public AnalysisResponse addWarningsItem(String warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

  /**
   * Get warnings
   * @return warnings
  */
  @ApiModelProperty(value = "")


  public List<String> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<String> warnings) {
    this.warnings = warnings;
  }

  public AnalysisResponse parameters(List<Property> parameters) {
    this.parameters = parameters;
    return this;
  }

  public AnalysisResponse addParametersItem(Property parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

  /**
   * Get parameters
   * @return parameters
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Property> getParameters() {
    return parameters;
  }

  public void setParameters(List<Property> parameters) {
    this.parameters = parameters;
  }

  public AnalysisResponse ok(Boolean ok) {
    this.ok = ok;
    return this;
  }

  /**
   * Get ok
   * @return ok
  */
  @ApiModelProperty(value = "")


  public Boolean getOk() {
    return ok;
  }

  public void setOk(Boolean ok) {
    this.ok = ok;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalysisResponse analysisResponse = (AnalysisResponse) o;
    return Objects.equals(this.warnings, analysisResponse.warnings) &&
        Objects.equals(this.parameters, analysisResponse.parameters) &&
        Objects.equals(this.ok, analysisResponse.ok);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warnings, parameters, ok);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalysisResponse {\n");
    
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
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

