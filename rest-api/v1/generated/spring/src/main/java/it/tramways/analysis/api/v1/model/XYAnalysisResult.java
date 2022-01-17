package it.tramways.analysis.api.v1.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.tramways.analysis.api.v1.model.AnalysisResult;
import it.tramways.analysis.api.v1.model.XYAnalysisResultAllOf;
import it.tramways.analysis.api.v1.model.XYPoint;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * XYAnalysisResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-17T23:33:43.660141500+01:00[Europe/Berlin]")
public class XYAnalysisResult extends AnalysisResult  {
  @JsonProperty("xLabel")
  private String xLabel;

  @JsonProperty("yLabel")
  private String yLabel;

  @JsonProperty("points")
  @Valid
  private List<XYPoint> points = null;

  public XYAnalysisResult xLabel(String xLabel) {
    this.xLabel = xLabel;
    return this;
  }

  /**
   * Get xLabel
   * @return xLabel
  */
  @ApiModelProperty(value = "")


  public String getxLabel() {
    return xLabel;
  }

  public void setxLabel(String xLabel) {
    this.xLabel = xLabel;
  }

  public XYAnalysisResult yLabel(String yLabel) {
    this.yLabel = yLabel;
    return this;
  }

  /**
   * Get yLabel
   * @return yLabel
  */
  @ApiModelProperty(value = "")


  public String getyLabel() {
    return yLabel;
  }

  public void setyLabel(String yLabel) {
    this.yLabel = yLabel;
  }

  public XYAnalysisResult points(List<XYPoint> points) {
    this.points = points;
    return this;
  }

  public XYAnalysisResult addPointsItem(XYPoint pointsItem) {
    if (this.points == null) {
      this.points = new ArrayList<>();
    }
    this.points.add(pointsItem);
    return this;
  }

  /**
   * Get points
   * @return points
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<XYPoint> getPoints() {
    return points;
  }

  public void setPoints(List<XYPoint> points) {
    this.points = points;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XYAnalysisResult xyAnalysisResult = (XYAnalysisResult) o;
    return Objects.equals(this.xLabel, xyAnalysisResult.xLabel) &&
        Objects.equals(this.yLabel, xyAnalysisResult.yLabel) &&
        Objects.equals(this.points, xyAnalysisResult.points) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xLabel, yLabel, points, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XYAnalysisResult {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    xLabel: ").append(toIndentedString(xLabel)).append("\n");
    sb.append("    yLabel: ").append(toIndentedString(yLabel)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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

