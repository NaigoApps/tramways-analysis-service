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
 * Distribution
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-17T23:33:43.660141500+01:00[Europe/Berlin]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "distributionType", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = ExponentialDistribution.class, name = "EXPONENTIAL"),
  @JsonSubTypes.Type(value = UniformDistribution.class, name = "UNIFORM"),
})

public class Distribution   {
  @JsonProperty("distributionType")
  private String distributionType;

  public Distribution distributionType(String distributionType) {
    this.distributionType = distributionType;
    return this;
  }

  /**
   * Get distributionType
   * @return distributionType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDistributionType() {
    return distributionType;
  }

  public void setDistributionType(String distributionType) {
    this.distributionType = distributionType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Distribution distribution = (Distribution) o;
    return Objects.equals(this.distributionType, distribution.distributionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distributionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Distribution {\n");
    
    sb.append("    distributionType: ").append(toIndentedString(distributionType)).append("\n");
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

