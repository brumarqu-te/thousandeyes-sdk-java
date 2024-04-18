/*
 * Dashboards API
 * Manage ThousandEyes Dashboards
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.dashboards.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.dashboards.model.LegacyDurationUnit;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Specifies a fixed timespan for data aggregation.
 */
@JsonPropertyOrder({
  ApiDuration.JSON_PROPERTY_VALUE,
  ApiDuration.JSON_PROPERTY_UNIT
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-18T12:55:02.220586+01:00[Europe/Lisbon]")
public class ApiDuration {
  public static final String JSON_PROPERTY_VALUE = "value";
  private Integer value;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private LegacyDurationUnit unit;

  public ApiDuration() { 
  }

  public ApiDuration value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * Timespan value.
   * @return value
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(Integer value) {
    this.value = value;
  }


  public ApiDuration unit(LegacyDurationUnit unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
   * @deprecated
  **/
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LegacyDurationUnit getUnit() {
    return unit;
  }


  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnit(LegacyDurationUnit unit) {
    this.unit = unit;
  }


  /**
   * Return true if this ApiDuration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiDuration apiDuration = (ApiDuration) o;
    return Objects.equals(this.value, apiDuration.value) &&
        Objects.equals(this.unit, apiDuration.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiDuration {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

