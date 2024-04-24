/*
 * Alerts API
 * You can manage the following alert functionalities on the ThousandEyes platform using the Alerts API:  * **Alerts**: Retrieve alert details. Alerts are assigned to tests through alert rules.  * **Alert Rules**: Conditions that you configure in order to highlight or be notified of events of interest in your ThousandEyes tests. When an alert rule’s conditions are met, the associated alert is triggered and the alert becomes active. It remains active until the alert is cleared. Alert rules are reusable across multiple tests..  * **Alert Suppression Windows**: Suppress alerts for tests during periods such as planned maintenance. Windows can be one-time events or recurring events to handle periodic occurrences such as monthly downtime for maintenance.  For more information about the alerts, see [Alerts](https://docs.thousandeyes.com/product-documentation/alerts). 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.alerts.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.alerts.model.AlertMetricDetailEnd;
import com.thousandeyes.api.alerts.model.AlertMetricDetailStart;
import com.thousandeyes.api.alerts.model.State;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AlertMetricDetail
 */
@JsonPropertyOrder({
  AlertMetricDetail.JSON_PROPERTY_END,
  AlertMetricDetail.JSON_PROPERTY_ID,
  AlertMetricDetail.JSON_PROPERTY_NAME,
  AlertMetricDetail.JSON_PROPERTY_START,
  AlertMetricDetail.JSON_PROPERTY_STATE,
  AlertMetricDetail.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T13:50:10.220222+01:00[Europe/Lisbon]")
public class AlertMetricDetail {
  public static final String JSON_PROPERTY_END = "end";
  private AlertMetricDetailEnd end;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_START = "start";
  private AlertMetricDetailStart start;

  public static final String JSON_PROPERTY_STATE = "state";
  private State state;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public AlertMetricDetail() { 
  }

  public AlertMetricDetail end(AlertMetricDetailEnd end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AlertMetricDetailEnd getEnd() {
    return end;
  }


  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnd(AlertMetricDetailEnd end) {
    this.end = end;
  }


  public AlertMetricDetail id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique metric detail id.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public AlertMetricDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Geolocation of the alert.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public AlertMetricDetail start(AlertMetricDetailStart start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AlertMetricDetailStart getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStart(AlertMetricDetailStart start) {
    this.start = start;
  }


  public AlertMetricDetail state(State state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public State getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(State state) {
    this.state = state;
  }


  public AlertMetricDetail type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the alert metric.
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  /**
   * Return true if this AlertMetricDetail object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertMetricDetail alertMetricDetail = (AlertMetricDetail) o;
    return Objects.equals(this.end, alertMetricDetail.end) &&
        Objects.equals(this.id, alertMetricDetail.id) &&
        Objects.equals(this.name, alertMetricDetail.name) &&
        Objects.equals(this.start, alertMetricDetail.start) &&
        Objects.equals(this.state, alertMetricDetail.state) &&
        Objects.equals(this.type, alertMetricDetail.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, id, name, start, state, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertMetricDetail {\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

