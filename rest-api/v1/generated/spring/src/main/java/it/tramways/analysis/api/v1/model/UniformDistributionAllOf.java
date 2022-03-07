package it.tramways.analysis.api.v1.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * UniformDistributionAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-23T18:21:37.178204400+01:00[Europe/Berlin]")
public class UniformDistributionAllOf   {
  @JsonProperty("left")
  private BigDecimal left;

  @JsonProperty("right")
  private BigDecimal right;

  public UniformDistributionAllOf left(BigDecimal left) {
    this.left = left;
    return this;
  }

  /**
   * Get left
   * @return left
  */
  @ApiModelProperty(value = "")

  @Valid

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
  */
  @ApiModelProperty(value = "")

  @Valid

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

