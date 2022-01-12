/*
 * Tramways Analysis API
 * Tramways Analysis API
 *
 * The version of the OpenAPI document: 1.0.0-SNAPSHOT
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
import java.io.IOException;
import java.math.BigDecimal;

/**
 * XYPoint
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-12T12:53:10.520+01:00[Europe/Berlin]")
public class XYPoint {
  public static final String SERIALIZED_NAME_X = "x";
  @SerializedName(SERIALIZED_NAME_X)
  private BigDecimal x;

  public static final String SERIALIZED_NAME_Y = "y";
  @SerializedName(SERIALIZED_NAME_Y)
  private BigDecimal y;

  public XYPoint() { 
  }

  public XYPoint x(BigDecimal x) {
    
    this.x = x;
    return this;
  }

   /**
   * Get x
   * @return x
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getX() {
    return x;
  }


  public void setX(BigDecimal x) {
    this.x = x;
  }


  public XYPoint y(BigDecimal y) {
    
    this.y = y;
    return this;
  }

   /**
   * Get y
   * @return y
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getY() {
    return y;
  }


  public void setY(BigDecimal y) {
    this.y = y;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XYPoint xyPoint = (XYPoint) o;
    return Objects.equals(this.x, xyPoint.x) &&
        Objects.equals(this.y, xyPoint.y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XYPoint {\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
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

