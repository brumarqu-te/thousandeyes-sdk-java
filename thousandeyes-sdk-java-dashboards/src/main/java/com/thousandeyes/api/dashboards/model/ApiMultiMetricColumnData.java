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
import com.thousandeyes.api.dashboards.model.ApiDashboardAsw;
import com.thousandeyes.api.dashboards.model.ApiWidgetDataPoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The data presented within a single column of a Multi-Metric table.
 */
@JsonPropertyOrder({
  ApiMultiMetricColumnData.JSON_PROPERTY_COLUMN_ID,
  ApiMultiMetricColumnData.JSON_PROPERTY_BIN_SIZE,
  ApiMultiMetricColumnData.JSON_PROPERTY_POINTS,
  ApiMultiMetricColumnData.JSON_PROPERTY_STATUS,
  ApiMultiMetricColumnData.JSON_PROPERTY_ALERT_SUPPRESSION_WINDOWS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-18T12:55:02.220586+01:00[Europe/Lisbon]")
public class ApiMultiMetricColumnData {
  public static final String JSON_PROPERTY_COLUMN_ID = "columnId";
  private String columnId;

  public static final String JSON_PROPERTY_BIN_SIZE = "binSize";
  private Long binSize;

  public static final String JSON_PROPERTY_POINTS = "points";
  private List<ApiWidgetDataPoint> points;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_ALERT_SUPPRESSION_WINDOWS = "alertSuppressionWindows";
  private List<ApiDashboardAsw> alertSuppressionWindows;

  public ApiMultiMetricColumnData() { 
  }

  public ApiMultiMetricColumnData columnId(String columnId) {
    this.columnId = columnId;
    return this;
  }

   /**
   * Identifier of the column.
   * @return columnId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLUMN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getColumnId() {
    return columnId;
  }


  @JsonProperty(JSON_PROPERTY_COLUMN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColumnId(String columnId) {
    this.columnId = columnId;
  }


  public ApiMultiMetricColumnData binSize(Long binSize) {
    this.binSize = binSize;
    return this;
  }

   /**
   * Duration of each bin.
   * @return binSize
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BIN_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBinSize() {
    return binSize;
  }


  @JsonProperty(JSON_PROPERTY_BIN_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBinSize(Long binSize) {
    this.binSize = binSize;
  }


  public ApiMultiMetricColumnData points(List<ApiWidgetDataPoint> points) {
    this.points = points;
    return this;
  }

  public ApiMultiMetricColumnData addPointsItem(ApiWidgetDataPoint pointsItem) {
    if (this.points == null) {
      this.points = new ArrayList<>();
    }
    this.points.add(pointsItem);
    return this;
  }

   /**
   * Get points
   * @return points
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiWidgetDataPoint> getPoints() {
    return points;
  }


  @JsonProperty(JSON_PROPERTY_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPoints(List<ApiWidgetDataPoint> points) {
    this.points = points;
  }


  public ApiMultiMetricColumnData status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Message for not fully configured card or no data.
   * @return status
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public ApiMultiMetricColumnData alertSuppressionWindows(List<ApiDashboardAsw> alertSuppressionWindows) {
    this.alertSuppressionWindows = alertSuppressionWindows;
    return this;
  }

  public ApiMultiMetricColumnData addAlertSuppressionWindowsItem(ApiDashboardAsw alertSuppressionWindowsItem) {
    if (this.alertSuppressionWindows == null) {
      this.alertSuppressionWindows = new ArrayList<>();
    }
    this.alertSuppressionWindows.add(alertSuppressionWindowsItem);
    return this;
  }

   /**
   * Get alertSuppressionWindows
   * @return alertSuppressionWindows
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERT_SUPPRESSION_WINDOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiDashboardAsw> getAlertSuppressionWindows() {
    return alertSuppressionWindows;
  }


  @JsonProperty(JSON_PROPERTY_ALERT_SUPPRESSION_WINDOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlertSuppressionWindows(List<ApiDashboardAsw> alertSuppressionWindows) {
    this.alertSuppressionWindows = alertSuppressionWindows;
  }


  /**
   * Return true if this ApiMultiMetricColumnData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiMultiMetricColumnData apiMultiMetricColumnData = (ApiMultiMetricColumnData) o;
    return Objects.equals(this.columnId, apiMultiMetricColumnData.columnId) &&
        Objects.equals(this.binSize, apiMultiMetricColumnData.binSize) &&
        Objects.equals(this.points, apiMultiMetricColumnData.points) &&
        Objects.equals(this.status, apiMultiMetricColumnData.status) &&
        Objects.equals(this.alertSuppressionWindows, apiMultiMetricColumnData.alertSuppressionWindows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnId, binSize, points, status, alertSuppressionWindows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiMultiMetricColumnData {\n");
    sb.append("    columnId: ").append(toIndentedString(columnId)).append("\n");
    sb.append("    binSize: ").append(toIndentedString(binSize)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    alertSuppressionWindows: ").append(toIndentedString(alertSuppressionWindows)).append("\n");
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

