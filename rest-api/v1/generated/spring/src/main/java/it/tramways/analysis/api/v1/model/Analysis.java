package it.tramways.analysis.api.v1.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.tramways.analysis.api.v1.model.AnalysisResult;
import it.tramways.analysis.api.v1.model.AnalysisStatus;
import it.tramways.analysis.api.v1.model.Property;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Analysis
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-23T18:21:37.178204400+01:00[Europe/Berlin]")
public class Analysis   {
  @JsonProperty("uuid")
  private String uuid;

  @JsonProperty("projectUuid")
  private String projectUuid;

  @JsonProperty("mapId")
  private String mapId;

  @JsonProperty("analysisType")
  private String analysisType;

  @JsonProperty("name")
  private String name;

  @JsonProperty("parameters")
  @Valid
  private List<Property> parameters = null;

  @JsonProperty("status")
  private AnalysisStatus status;

  @JsonProperty("result")
  private AnalysisResult result;

  public Analysis uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Get uuid
   * @return uuid
  */
  @ApiModelProperty(value = "")


  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public Analysis projectUuid(String projectUuid) {
    this.projectUuid = projectUuid;
    return this;
  }

  /**
   * Get projectUuid
   * @return projectUuid
  */
  @ApiModelProperty(value = "")


  public String getProjectUuid() {
    return projectUuid;
  }

  public void setProjectUuid(String projectUuid) {
    this.projectUuid = projectUuid;
  }

  public Analysis mapId(String mapId) {
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

  public Analysis analysisType(String analysisType) {
    this.analysisType = analysisType;
    return this;
  }

  /**
   * Get analysisType
   * @return analysisType
  */
  @ApiModelProperty(value = "")


  public String getAnalysisType() {
    return analysisType;
  }

  public void setAnalysisType(String analysisType) {
    this.analysisType = analysisType;
  }

  public Analysis name(String name) {
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

  public Analysis parameters(List<Property> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Analysis addParametersItem(Property parametersItem) {
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

  public Analysis status(AnalysisStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")

  @Valid

  public AnalysisStatus getStatus() {
    return status;
  }

  public void setStatus(AnalysisStatus status) {
    this.status = status;
  }

  public Analysis result(AnalysisResult result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
  */
  @ApiModelProperty(value = "")

  @Valid

  public AnalysisResult getResult() {
    return result;
  }

  public void setResult(AnalysisResult result) {
    this.result = result;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Analysis analysis = (Analysis) o;
    return Objects.equals(this.uuid, analysis.uuid) &&
        Objects.equals(this.projectUuid, analysis.projectUuid) &&
        Objects.equals(this.mapId, analysis.mapId) &&
        Objects.equals(this.analysisType, analysis.analysisType) &&
        Objects.equals(this.name, analysis.name) &&
        Objects.equals(this.parameters, analysis.parameters) &&
        Objects.equals(this.status, analysis.status) &&
        Objects.equals(this.result, analysis.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, projectUuid, mapId, analysisType, name, parameters, status, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Analysis {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
    sb.append("    mapId: ").append(toIndentedString(mapId)).append("\n");
    sb.append("    analysisType: ").append(toIndentedString(analysisType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

