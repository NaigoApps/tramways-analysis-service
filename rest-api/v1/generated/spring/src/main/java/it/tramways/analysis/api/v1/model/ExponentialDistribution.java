package it.tramways.analysis.api.v1.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.tramways.analysis.api.v1.model.Distribution;
import it.tramways.analysis.api.v1.model.ExponentialDistributionAllOf;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * ExponentialDistribution
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-23T18:21:37.178204400+01:00[Europe/Berlin]")
public class ExponentialDistribution extends Distribution  {
  @JsonProperty("lambda")
  private BigDecimal lambda;

  public ExponentialDistribution lambda(BigDecimal lambda) {
    this.lambda = lambda;
    return this;
  }

  /**
   * Get lambda
   * @return lambda
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getLambda() {
    return lambda;
  }

  public void setLambda(BigDecimal lambda) {
    this.lambda = lambda;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExponentialDistribution exponentialDistribution = (ExponentialDistribution) o;
    return Objects.equals(this.lambda, exponentialDistribution.lambda) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lambda, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExponentialDistribution {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    lambda: ").append(toIndentedString(lambda)).append("\n");
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

