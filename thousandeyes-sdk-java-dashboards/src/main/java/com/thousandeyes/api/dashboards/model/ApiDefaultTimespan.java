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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ApiDefaultTimespan
 */
@JsonPropertyOrder({
  ApiDefaultTimespan.JSON_PROPERTY_DURATION,
  ApiDefaultTimespan.JSON_PROPERTY_START,
  ApiDefaultTimespan.JSON_PROPERTY_END
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-18T12:55:02.220586+01:00[Europe/Lisbon]")
public class ApiDefaultTimespan {
  public static final String JSON_PROPERTY_DURATION = "duration";
  private Long duration;

  public static final String JSON_PROPERTY_START = "start";
  private OffsetDateTime start;

  public static final String JSON_PROPERTY_END = "end";
  private OffsetDateTime end;

  public ApiDefaultTimespan() { 
  }

  public ApiDefaultTimespan duration(Long duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Relative timespan in seconds.
   * @return duration
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(Long duration) {
    this.duration = duration;
  }


  public ApiDefaultTimespan start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * UTC start date of the timespan range (ISO date-time format).
   * @return start
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStart(OffsetDateTime start) {
    this.start = start;
  }


  public ApiDefaultTimespan end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

   /**
   * UTC end date of the timespan range (ISO date-time format).
   * @return end
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEnd() {
    return end;
  }


  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }


  /**
   * Return true if this ApiDefaultTimespan object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiDefaultTimespan apiDefaultTimespan = (ApiDefaultTimespan) o;
    return Objects.equals(this.duration, apiDefaultTimespan.duration) &&
        Objects.equals(this.start, apiDefaultTimespan.start) &&
        Objects.equals(this.end, apiDefaultTimespan.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiDefaultTimespan {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

