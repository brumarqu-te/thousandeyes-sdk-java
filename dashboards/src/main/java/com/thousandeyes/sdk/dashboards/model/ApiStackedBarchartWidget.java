/*
 * Dashboards API
 * Manage ThousandEyes Dashboards.
 *
 * The version of the OpenAPI document: 7.0.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.dashboards.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.dashboards.model.ApiAggregateProperty;
import com.thousandeyes.sdk.dashboards.model.ApiDuration;
import com.thousandeyes.sdk.dashboards.model.ApiWidgetMeasure;
import com.thousandeyes.sdk.dashboards.model.DashboardMetric;
import com.thousandeyes.sdk.dashboards.model.DashboardMetricDirection;
import com.thousandeyes.sdk.dashboards.model.LegacyWidgetSortDirection;
import com.thousandeyes.sdk.dashboards.model.LegacyWidgetSortProperty;
import com.thousandeyes.sdk.dashboards.model.MetricGroup;
import com.thousandeyes.sdk.dashboards.model.SelfLinks;
import com.thousandeyes.sdk.dashboards.model.StackedBarChartDatasource;
import com.thousandeyes.sdk.dashboards.model.VisualMode;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ApiStackedBarchartWidget
 */
@JsonPropertyOrder({
  ApiStackedBarchartWidget.JSON_PROPERTY_ID,
  ApiStackedBarchartWidget.JSON_PROPERTY_TITLE,
  ApiStackedBarchartWidget.JSON_PROPERTY_VISUAL_MODE,
  ApiStackedBarchartWidget.JSON_PROPERTY_EMBED_URL,
  ApiStackedBarchartWidget.JSON_PROPERTY_IS_EMBEDDED,
  ApiStackedBarchartWidget.JSON_PROPERTY_METRIC_GROUP,
  ApiStackedBarchartWidget.JSON_PROPERTY_DIRECTION,
  ApiStackedBarchartWidget.JSON_PROPERTY_METRIC,
  ApiStackedBarchartWidget.JSON_PROPERTY_FILTERS,
  ApiStackedBarchartWidget.JSON_PROPERTY_MEASURE,
  ApiStackedBarchartWidget.JSON_PROPERTY_FIXED_TIMESPAN,
  ApiStackedBarchartWidget.JSON_PROPERTY_API_LINK,
  ApiStackedBarchartWidget.JSON_PROPERTY_SHOULD_EXCLUDE_ALERT_SUPPRESSION_WINDOWS,
  ApiStackedBarchartWidget.JSON_PROPERTY_LINKS,
  ApiStackedBarchartWidget.JSON_PROPERTY_TYPE,
  ApiStackedBarchartWidget.JSON_PROPERTY_AXIS_GROUP_BY,
  ApiStackedBarchartWidget.JSON_PROPERTY_SORT_BY,
  ApiStackedBarchartWidget.JSON_PROPERTY_SORT_DIRECTION,
  ApiStackedBarchartWidget.JSON_PROPERTY_LIMIT,
  ApiStackedBarchartWidget.JSON_PROPERTY_SHOW_LABELS,
  ApiStackedBarchartWidget.JSON_PROPERTY_IS_HORIZONTAL_BAR_CHART,
  ApiStackedBarchartWidget.JSON_PROPERTY_DATA_SOURCE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class ApiStackedBarchartWidget {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_VISUAL_MODE = "visualMode";
  private VisualMode visualMode = VisualMode.FULL;

  public static final String JSON_PROPERTY_EMBED_URL = "embedUrl";
  private String embedUrl;

  public static final String JSON_PROPERTY_IS_EMBEDDED = "isEmbedded";
  private Boolean isEmbedded;

  public static final String JSON_PROPERTY_METRIC_GROUP = "metricGroup";
  private MetricGroup metricGroup;

  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private DashboardMetricDirection direction;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private DashboardMetric metric;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private Map<String, Set<Object>> filters = new HashMap<>();

  public static final String JSON_PROPERTY_MEASURE = "measure";
  private ApiWidgetMeasure measure;

  public static final String JSON_PROPERTY_FIXED_TIMESPAN = "fixedTimespan";
  private ApiDuration fixedTimespan;

  public static final String JSON_PROPERTY_API_LINK = "apiLink";
  private String apiLink;

  public static final String JSON_PROPERTY_SHOULD_EXCLUDE_ALERT_SUPPRESSION_WINDOWS = "shouldExcludeAlertSuppressionWindows";
  private Boolean shouldExcludeAlertSuppressionWindows;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinks links;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_AXIS_GROUP_BY = "axisGroupBy";
  private ApiAggregateProperty axisGroupBy;

  public static final String JSON_PROPERTY_SORT_BY = "sortBy";
  private LegacyWidgetSortProperty sortBy;

  public static final String JSON_PROPERTY_SORT_DIRECTION = "sortDirection";
  private LegacyWidgetSortDirection sortDirection;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit;

  public static final String JSON_PROPERTY_SHOW_LABELS = "showLabels";
  private Boolean showLabels;

  public static final String JSON_PROPERTY_IS_HORIZONTAL_BAR_CHART = "isHorizontalBarChart";
  private Boolean isHorizontalBarChart;

  public static final String JSON_PROPERTY_DATA_SOURCE = "dataSource";
  private StackedBarChartDatasource dataSource;

  public ApiStackedBarchartWidget() { 
  }

  @JsonCreator
  public ApiStackedBarchartWidget(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_EMBED_URL) String embedUrl, 
    @JsonProperty(JSON_PROPERTY_API_LINK) String apiLink
  ) {
  this();
    this.id = id;
    this.embedUrl = embedUrl;
    this.apiLink = apiLink;
  }

   /**
   * Identifier of the widget.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




  public ApiStackedBarchartWidget title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title of the widget
   * @return title
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public ApiStackedBarchartWidget visualMode(VisualMode visualMode) {
    this.visualMode = visualMode;
    return this;
  }

   /**
   * Get visualMode
   * @return visualMode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISUAL_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VisualMode getVisualMode() {
    return visualMode;
  }


  @JsonProperty(JSON_PROPERTY_VISUAL_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisualMode(VisualMode visualMode) {
    this.visualMode = visualMode;
  }


   /**
   * When &#x60;isEmbedded&#x60; is set to &#x60;true&#x60;, an &#x60;embedUrl&#x60; is provided.
   * @return embedUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMBED_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmbedUrl() {
    return embedUrl;
  }




  public ApiStackedBarchartWidget isEmbedded(Boolean isEmbedded) {
    this.isEmbedded = isEmbedded;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; if widget is marked as embedded; otherwise, set to &#x60;false&#x60;.
   * @return isEmbedded
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_EMBEDDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsEmbedded() {
    return isEmbedded;
  }


  @JsonProperty(JSON_PROPERTY_IS_EMBEDDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsEmbedded(Boolean isEmbedded) {
    this.isEmbedded = isEmbedded;
  }


  public ApiStackedBarchartWidget metricGroup(MetricGroup metricGroup) {
    this.metricGroup = metricGroup;
    return this;
  }

   /**
   * Get metricGroup
   * @return metricGroup
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MetricGroup getMetricGroup() {
    return metricGroup;
  }


  @JsonProperty(JSON_PROPERTY_METRIC_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetricGroup(MetricGroup metricGroup) {
    this.metricGroup = metricGroup;
  }


  public ApiStackedBarchartWidget direction(DashboardMetricDirection direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DashboardMetricDirection getDirection() {
    return direction;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirection(DashboardMetricDirection direction) {
    this.direction = direction;
  }


  public ApiStackedBarchartWidget metric(DashboardMetric metric) {
    this.metric = metric;
    return this;
  }

   /**
   * Get metric
   * @return metric
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DashboardMetric getMetric() {
    return metric;
  }


  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetric(DashboardMetric metric) {
    this.metric = metric;
  }


  public ApiStackedBarchartWidget filters(Map<String, Set<Object>> filters) {
    this.filters = filters;
    return this;
  }

  public ApiStackedBarchartWidget putFiltersItem(String key, Set<Object> filtersItem) {
    if (this.filters == null) {
      this.filters = new HashMap<>();
    }
    this.filters.put(key, filtersItem);
    return this;
  }

   /**
   * (Optional) Specifies the filters applied to the widget. When present, the &#x60;filters&#x60; property displays. Each filter object has two properties: &#x60;filterProperty&#x60; and &#x60;filterValue&#x60;. The &#x60;filterProperty&#x60; can be values like &#x60;AGENT&#x60;, &#x60;ENDPOINT_MACHINE_ID&#x60;, &#x60;TEST&#x60;, &#x60;MONITOR&#x60;, etc.  The &#x60;filterValue&#x60; represents an identifier array of the selected property.
   * @return filters
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Set<Object>> getFilters() {
    return filters;
  }


  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilters(Map<String, Set<Object>> filters) {
    this.filters = filters;
  }


  public ApiStackedBarchartWidget measure(ApiWidgetMeasure measure) {
    this.measure = measure;
    return this;
  }

   /**
   * Get measure
   * @return measure
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEASURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiWidgetMeasure getMeasure() {
    return measure;
  }


  @JsonProperty(JSON_PROPERTY_MEASURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeasure(ApiWidgetMeasure measure) {
    this.measure = measure;
  }


  public ApiStackedBarchartWidget fixedTimespan(ApiDuration fixedTimespan) {
    this.fixedTimespan = fixedTimespan;
    return this;
  }

   /**
   * Get fixedTimespan
   * @return fixedTimespan
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIXED_TIMESPAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDuration getFixedTimespan() {
    return fixedTimespan;
  }


  @JsonProperty(JSON_PROPERTY_FIXED_TIMESPAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFixedTimespan(ApiDuration fixedTimespan) {
    this.fixedTimespan = fixedTimespan;
  }


   /**
   * Get apiLink
   * @return apiLink
   * @deprecated
  **/
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApiLink() {
    return apiLink;
  }




  public ApiStackedBarchartWidget shouldExcludeAlertSuppressionWindows(Boolean shouldExcludeAlertSuppressionWindows) {
    this.shouldExcludeAlertSuppressionWindows = shouldExcludeAlertSuppressionWindows;
    return this;
  }

   /**
   * Excludes alert suppression window data if set to &#x60;true&#x60;.
   * @return shouldExcludeAlertSuppressionWindows
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOULD_EXCLUDE_ALERT_SUPPRESSION_WINDOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShouldExcludeAlertSuppressionWindows() {
    return shouldExcludeAlertSuppressionWindows;
  }


  @JsonProperty(JSON_PROPERTY_SHOULD_EXCLUDE_ALERT_SUPPRESSION_WINDOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShouldExcludeAlertSuppressionWindows(Boolean shouldExcludeAlertSuppressionWindows) {
    this.shouldExcludeAlertSuppressionWindows = shouldExcludeAlertSuppressionWindows;
  }


  public ApiStackedBarchartWidget links(SelfLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SelfLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(SelfLinks links) {
    this.links = links;
  }


  public ApiStackedBarchartWidget type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Bar Chart: Stacked widget type.
   * @return type
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


  public ApiStackedBarchartWidget axisGroupBy(ApiAggregateProperty axisGroupBy) {
    this.axisGroupBy = axisGroupBy;
    return this;
  }

   /**
   * Get axisGroupBy
   * @return axisGroupBy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AXIS_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiAggregateProperty getAxisGroupBy() {
    return axisGroupBy;
  }


  @JsonProperty(JSON_PROPERTY_AXIS_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAxisGroupBy(ApiAggregateProperty axisGroupBy) {
    this.axisGroupBy = axisGroupBy;
  }


  public ApiStackedBarchartWidget sortBy(LegacyWidgetSortProperty sortBy) {
    this.sortBy = sortBy;
    return this;
  }

   /**
   * Get sortBy
   * @return sortBy
   * @deprecated
  **/
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LegacyWidgetSortProperty getSortBy() {
    return sortBy;
  }


  @JsonProperty(JSON_PROPERTY_SORT_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortBy(LegacyWidgetSortProperty sortBy) {
    this.sortBy = sortBy;
  }


  public ApiStackedBarchartWidget sortDirection(LegacyWidgetSortDirection sortDirection) {
    this.sortDirection = sortDirection;
    return this;
  }

   /**
   * Get sortDirection
   * @return sortDirection
   * @deprecated
  **/
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LegacyWidgetSortDirection getSortDirection() {
    return sortDirection;
  }


  @JsonProperty(JSON_PROPERTY_SORT_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortDirection(LegacyWidgetSortDirection sortDirection) {
    this.sortDirection = sortDirection;
  }


  public ApiStackedBarchartWidget limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Limit configured in the widget.
   * @return limit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public ApiStackedBarchartWidget showLabels(Boolean showLabels) {
    this.showLabels = showLabels;
    return this;
  }

   /**
   * Get showLabels
   * @return showLabels
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShowLabels() {
    return showLabels;
  }


  @JsonProperty(JSON_PROPERTY_SHOW_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowLabels(Boolean showLabels) {
    this.showLabels = showLabels;
  }


  public ApiStackedBarchartWidget isHorizontalBarChart(Boolean isHorizontalBarChart) {
    this.isHorizontalBarChart = isHorizontalBarChart;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; to display bars horizontally in the widget.
   * @return isHorizontalBarChart
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_HORIZONTAL_BAR_CHART)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsHorizontalBarChart() {
    return isHorizontalBarChart;
  }


  @JsonProperty(JSON_PROPERTY_IS_HORIZONTAL_BAR_CHART)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsHorizontalBarChart(Boolean isHorizontalBarChart) {
    this.isHorizontalBarChart = isHorizontalBarChart;
  }


  public ApiStackedBarchartWidget dataSource(StackedBarChartDatasource dataSource) {
    this.dataSource = dataSource;
    return this;
  }

   /**
   * Get dataSource
   * @return dataSource
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StackedBarChartDatasource getDataSource() {
    return dataSource;
  }


  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataSource(StackedBarChartDatasource dataSource) {
    this.dataSource = dataSource;
  }


  /**
   * Return true if this ApiStackedBarchartWidget object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiStackedBarchartWidget apiStackedBarchartWidget = (ApiStackedBarchartWidget) o;
    return Objects.equals(this.id, apiStackedBarchartWidget.id) &&
        Objects.equals(this.title, apiStackedBarchartWidget.title) &&
        Objects.equals(this.visualMode, apiStackedBarchartWidget.visualMode) &&
        Objects.equals(this.embedUrl, apiStackedBarchartWidget.embedUrl) &&
        Objects.equals(this.isEmbedded, apiStackedBarchartWidget.isEmbedded) &&
        Objects.equals(this.metricGroup, apiStackedBarchartWidget.metricGroup) &&
        Objects.equals(this.direction, apiStackedBarchartWidget.direction) &&
        Objects.equals(this.metric, apiStackedBarchartWidget.metric) &&
        Objects.equals(this.filters, apiStackedBarchartWidget.filters) &&
        Objects.equals(this.measure, apiStackedBarchartWidget.measure) &&
        Objects.equals(this.fixedTimespan, apiStackedBarchartWidget.fixedTimespan) &&
        Objects.equals(this.apiLink, apiStackedBarchartWidget.apiLink) &&
        Objects.equals(this.shouldExcludeAlertSuppressionWindows, apiStackedBarchartWidget.shouldExcludeAlertSuppressionWindows) &&
        Objects.equals(this.links, apiStackedBarchartWidget.links) &&
        Objects.equals(this.type, apiStackedBarchartWidget.type) &&
        Objects.equals(this.axisGroupBy, apiStackedBarchartWidget.axisGroupBy) &&
        Objects.equals(this.sortBy, apiStackedBarchartWidget.sortBy) &&
        Objects.equals(this.sortDirection, apiStackedBarchartWidget.sortDirection) &&
        Objects.equals(this.limit, apiStackedBarchartWidget.limit) &&
        Objects.equals(this.showLabels, apiStackedBarchartWidget.showLabels) &&
        Objects.equals(this.isHorizontalBarChart, apiStackedBarchartWidget.isHorizontalBarChart) &&
        Objects.equals(this.dataSource, apiStackedBarchartWidget.dataSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, visualMode, embedUrl, isEmbedded, metricGroup, direction, metric, filters, measure, fixedTimespan, apiLink, shouldExcludeAlertSuppressionWindows, links, type, axisGroupBy, sortBy, sortDirection, limit, showLabels, isHorizontalBarChart, dataSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiStackedBarchartWidget {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    visualMode: ").append(toIndentedString(visualMode)).append("\n");
    sb.append("    embedUrl: ").append(toIndentedString(embedUrl)).append("\n");
    sb.append("    isEmbedded: ").append(toIndentedString(isEmbedded)).append("\n");
    sb.append("    metricGroup: ").append(toIndentedString(metricGroup)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    measure: ").append(toIndentedString(measure)).append("\n");
    sb.append("    fixedTimespan: ").append(toIndentedString(fixedTimespan)).append("\n");
    sb.append("    apiLink: ").append(toIndentedString(apiLink)).append("\n");
    sb.append("    shouldExcludeAlertSuppressionWindows: ").append(toIndentedString(shouldExcludeAlertSuppressionWindows)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    axisGroupBy: ").append(toIndentedString(axisGroupBy)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortDirection: ").append(toIndentedString(sortDirection)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    showLabels: ").append(toIndentedString(showLabels)).append("\n");
    sb.append("    isHorizontalBarChart: ").append(toIndentedString(isHorizontalBarChart)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
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

