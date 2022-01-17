package it.tramways.analysis.api.v1.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.tramways.analysis.api.v1.model.Distribution;
import it.tramways.analysis.api.v1.model.UniformDistributionAllOf;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * UniformDistribution
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-17T23:33:43.660141500+01:00[Europe/Berlin]")
public class UniformDistribution extends Distribution  {
  @JsonProperty("left")
  private BigDecimal left;

  @JsonProperty("right")
  private BigDecimal right;

  public UniformDistribution left(BigDecimal left) {
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

  public UniformDistribution right(BigDecimal right) {
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
    UniformDistribution uniformDistribution = (UniformDistribution) o;
    return Objects.equals(this.left, uniformDistribution.left) &&
        Objects.equals(this.right, uniformDistribution.right) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(left, right, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UniformDistribution {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

