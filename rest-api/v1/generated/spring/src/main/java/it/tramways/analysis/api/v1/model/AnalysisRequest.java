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
 * AnalysisRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-14T00:29:58.422+01:00[Europe/Berlin]")
public class AnalysisRequest   {
  @JsonProperty("projectId")
  private String projectId;

  @JsonProperty("mapId")
  private String mapId;

  @JsonProperty("analysisTypeId")
  private String analysisTypeId;

  @JsonProperty("parameters")
  @Valid
  private List<Property> parameters = null;

  public AnalysisRequest projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   * @return projectId
  */
  @ApiModelProperty(value = "")


  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public AnalysisRequest mapId(String mapId) {
    this.mapId = mapId;
    return this;
  }

  /**
   * Get mapId
   * @return mapId
  */
  @ApiModelProperty(value = "")


  public String getMapId() {
    return mapId;
  }

  public void setMapId(String mapId) {
    this.mapId = mapId;
  }

  public AnalysisRequest analysisTypeId(String analysisTypeId) {
    this.analysisTypeId = analysisTypeId;
    return this;
  }

  /**
   * Get analysisTypeId
   * @return analysisTypeId
  */
  @ApiModelProperty(value = "")


  public String getAnalysisTypeId() {
    return analysisTypeId;
  }

  public void setAnalysisTypeId(String analysisTypeId) {
    this.analysisTypeId = analysisTypeId;
  }

  public AnalysisRequest parameters(List<Property> parameters) {
    this.parameters = parameters;
    return this;
  }

  public AnalysisRequest addParametersItem(Property parametersItem) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalysisRequest analysisRequest = (AnalysisRequest) o;
    return Objects.equals(this.projectId, analysisRequest.projectId) &&
        Objects.equals(this.mapId, analysisRequest.mapId) &&
        Objects.equals(this.analysisTypeId, analysisRequest.analysisTypeId) &&
        Objects.equals(this.parameters, analysisRequest.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, mapId, analysisTypeId, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalysisRequest {\n");
    
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    mapId: ").append(toIndentedString(mapId)).append("\n");
    sb.append("    analysisTypeId: ").append(toIndentedString(analysisTypeId)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

