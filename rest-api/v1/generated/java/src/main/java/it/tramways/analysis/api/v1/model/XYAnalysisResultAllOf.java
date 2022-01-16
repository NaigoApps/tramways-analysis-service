/*
 * Tramways Analysis API
 * Tramways Analysis API
 *
 * The version of the OpenAPI document: 1.0.0
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
import it.tramways.analysis.api.v1.model.XYPoint;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * XYAnalysisResultAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-14T00:30:02.311+01:00[Europe/Berlin]")
public class XYAnalysisResultAllOf {
  public static final String SERIALIZED_NAME_X_LABEL = "xLabel";
  @SerializedName(SERIALIZED_NAME_X_LABEL)
  private String xLabel;

  public static final String SERIALIZED_NAME_Y_LABEL = "yLabel";
  @SerializedName(SERIALIZED_NAME_Y_LABEL)
  private String yLabel;

  public static final String SERIALIZED_NAME_POINTS = "points";
  @SerializedName(SERIALIZED_NAME_POINTS)
  private List<XYPoint> points = null;

  public XYAnalysisResultAllOf() { 
  }

  public XYAnalysisResultAllOf xLabel(String xLabel) {
    
    this.xLabel = xLabel;
    return this;
  }

   /**
   * Get xLabel
   * @return xLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getxLabel() {
    return xLabel;
  }


  public void setxLabel(String xLabel) {
    this.xLabel = xLabel;
  }


  public XYAnalysisResultAllOf yLabel(String yLabel) {
    
    this.yLabel = yLabel;
    return this;
  }

   /**
   * Get yLabel
   * @return yLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getyLabel() {
    return yLabel;
  }


  public void setyLabel(String yLabel) {
    this.yLabel = yLabel;
  }


  public XYAnalysisResultAllOf points(List<XYPoint> points) {
    
    this.points = points;
    return this;
  }

  public XYAnalysisResultAllOf addPointsItem(XYPoint pointsItem) {
    if (this.points == null) {
      this.points = new ArrayList<XYPoint>();
    }
    this.points.add(pointsItem);
    return this;
  }

   /**
   * Get points
   * @return points
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    XYAnalysisResultAllOf xyAnalysisResultAllOf = (XYAnalysisResultAllOf) o;
    return Objects.equals(this.xLabel, xyAnalysisResultAllOf.xLabel) &&
        Objects.equals(this.yLabel, xyAnalysisResultAllOf.yLabel) &&
        Objects.equals(this.points, xyAnalysisResultAllOf.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xLabel, yLabel, points);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XYAnalysisResultAllOf {\n");
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

