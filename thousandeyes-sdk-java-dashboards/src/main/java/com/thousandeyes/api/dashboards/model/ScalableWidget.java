/*
 * Dashboards API
 * Manage ThousandEyes Dashboards.
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
import com.thousandeyes.api.dashboards.model.ApiWidgetFixedYScalePrefix;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ScalableWidget
 */
@JsonPropertyOrder({
  ScalableWidget.JSON_PROPERTY_MIN_SCALE,
  ScalableWidget.JSON_PROPERTY_MAX_SCALE,
  ScalableWidget.JSON_PROPERTY_UNIT
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T13:50:10.275061+01:00[Europe/Lisbon]")
public class ScalableWidget {
  public static final String JSON_PROPERTY_MIN_SCALE = "minScale";
  private Float minScale;

  public static final String JSON_PROPERTY_MAX_SCALE = "maxScale";
  private Float maxScale;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private ApiWidgetFixedYScalePrefix unit;

  public ScalableWidget() { 
  }

  public ScalableWidget minScale(Float minScale) {
    this.minScale = minScale;
    return this;
  }

   /**
   * Minimum scale configured in the widget.
   * @return minScale
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN_SCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getMinScale() {
    return minScale;
  }


  @JsonProperty(JSON_PROPERTY_MIN_SCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinScale(Float minScale) {
    this.minScale = minScale;
  }


  public ScalableWidget maxScale(Float maxScale) {
    this.maxScale = maxScale;
    return this;
  }

   /**
   * Maximum scale configured in the widget.
   * @return maxScale
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_SCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getMaxScale() {
    return maxScale;
  }


  @JsonProperty(JSON_PROPERTY_MAX_SCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxScale(Float maxScale) {
    this.maxScale = maxScale;
  }


  public ScalableWidget unit(ApiWidgetFixedYScalePrefix unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiWidgetFixedYScalePrefix getUnit() {
    return unit;
  }


  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnit(ApiWidgetFixedYScalePrefix unit) {
    this.unit = unit;
  }


  /**
   * Return true if this ScalableWidget object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScalableWidget scalableWidget = (ScalableWidget) o;
    return Objects.equals(this.minScale, scalableWidget.minScale) &&
        Objects.equals(this.maxScale, scalableWidget.maxScale) &&
        Objects.equals(this.unit, scalableWidget.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minScale, maxScale, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScalableWidget {\n");
    sb.append("    minScale: ").append(toIndentedString(minScale)).append("\n");
    sb.append("    maxScale: ").append(toIndentedString(maxScale)).append("\n");
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

