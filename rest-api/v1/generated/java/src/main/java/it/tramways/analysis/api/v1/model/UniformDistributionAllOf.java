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
import java.io.IOException;
import java.math.BigDecimal;

/**
 * UniformDistributionAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-14T00:30:02.311+01:00[Europe/Berlin]")
public class UniformDistributionAllOf {
  public static final String SERIALIZED_NAME_LEFT = "left";
  @SerializedName(SERIALIZED_NAME_LEFT)
  private BigDecimal left;

  public static final String SERIALIZED_NAME_RIGHT = "right";
  @SerializedName(SERIALIZED_NAME_RIGHT)
  private BigDecimal right;

  public UniformDistributionAllOf() { 
  }

  public UniformDistributionAllOf left(BigDecimal left) {
    
    this.left = left;
    return this;
  }

   /**
   * Get left
   * @return left
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getLeft() {
    return left;
  }


  public void setLeft(BigDecimal left) {
    this.left = left;
  }


  public UniformDistributionAllOf right(BigDecimal right) {
    
    this.right = right;
    return this;
  }

   /**
   * Get right
   * @return right
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getRight() {
    return right;
  }


  public void setRight(BigDecimal right) {
    this.right = right;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UniformDistributionAllOf uniformDistributionAllOf = (UniformDistributionAllOf) o;
    return Objects.equals(this.left, uniformDistributionAllOf.left) &&
        Objects.equals(this.right, uniformDistributionAllOf.right);
  }

  @Override
  public int hashCode() {
    return Objects.hash(left, right);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UniformDistributionAllOf {\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
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
