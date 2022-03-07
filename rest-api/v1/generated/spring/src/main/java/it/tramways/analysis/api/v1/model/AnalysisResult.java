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
 * AnalysisResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-23T18:21:37.178204400+01:00[Europe/Berlin]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "resultType", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = StringAnalysisResult.class, name = "StringAnalysisResult"),
  @JsonSubTypes.Type(value = XYAnalysisResult.class, name = "XYAnalysisResult"),
})

public class AnalysisResult   {
  @JsonProperty("analysisUuid")
  private String analysisUuid;

  @JsonProperty("resultType")
  private String resultType;

  public AnalysisResult analysisUuid(String analysisUuid) {
    this.analysisUuid = analysisUuid;
    return this;
  }

  /**
   * Get analysisUuid
   * @return analysisUuid
  */
  @ApiModelProperty(value = "")


  public String getAnalysisUuid() {
    return analysisUuid;
  }

  public void setAnalysisUuid(String analysisUuid) {
    this.analysisUuid = analysisUuid;
  }

  public AnalysisResult resultType(String resultType) {
    this.resultType = resultType;
    return this;
  }

  /**
   * Get resultType
   * @return resultType
  */
  @ApiModelProperty(value = "")


  public String getResultType() {
    return resultType;
  }

  public void setResultType(String resultType) {
    this.resultType = resultType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalysisResult analysisResult = (AnalysisResult) o;
    return Objects.equals(this.analysisUuid, analysisResult.analysisUuid) &&
        Objects.equals(this.resultType, analysisResult.resultType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analysisUuid, resultType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalysisResult {\n");
    
    sb.append("    analysisUuid: ").append(toIndentedString(analysisUuid)).append("\n");
    sb.append("    resultType: ").append(toIndentedString(resultType)).append("\n");
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

