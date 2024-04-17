/*
 * Endpoint Agent Labels API
 * Manage labels applied to endpoint agents using this API. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.labels.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.endpoint.labels.model.Filter;
import com.thousandeyes.api.endpoint.labels.model.MatchType;
import com.thousandeyes.api.endpoint.labels.model.SelfLinksLinks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * LabelsLabelsInner
 */
@JsonPropertyOrder({
  LabelsLabelsInner.JSON_PROPERTY_LINKS,
  LabelsLabelsInner.JSON_PROPERTY_ID,
  LabelsLabelsInner.JSON_PROPERTY_NAME,
  LabelsLabelsInner.JSON_PROPERTY_COLOR,
  LabelsLabelsInner.JSON_PROPERTY_MATCH_TYPE,
  LabelsLabelsInner.JSON_PROPERTY_FILTERS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-17T14:20:01.595867+01:00[Europe/Lisbon]")
public class LabelsLabelsInner {
  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinksLinks links;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_COLOR = "color";
  private String color;

  public static final String JSON_PROPERTY_MATCH_TYPE = "matchType";
  private MatchType matchType;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<Filter> filters;

  public LabelsLabelsInner() { 
  }

  @JsonCreator
  public LabelsLabelsInner(
    @JsonProperty(JSON_PROPERTY_ID) String id
  ) {
  this();
    this.id = id;
  }

  public LabelsLabelsInner links(SelfLinksLinks links) {
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

  public SelfLinksLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(SelfLinksLinks links) {
    this.links = links;
  }


   /**
   * Label identifier.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




  public LabelsLabelsInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The label name.
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


  public LabelsLabelsInner color(String color) {
    this.color = color;
    return this;
  }

   /**
   * UI color
   * @return color
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getColor() {
    return color;
  }


  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColor(String color) {
    this.color = color;
  }


  public LabelsLabelsInner matchType(MatchType matchType) {
    this.matchType = matchType;
    return this;
  }

   /**
   * Get matchType
   * @return matchType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MATCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MatchType getMatchType() {
    return matchType;
  }


  @JsonProperty(JSON_PROPERTY_MATCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatchType(MatchType matchType) {
    this.matchType = matchType;
  }


  public LabelsLabelsInner filters(List<Filter> filters) {
    this.filters = filters;
    return this;
  }

  public LabelsLabelsInner addFiltersItem(Filter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * The filters combined using the matchType to determine the label&#39;s match.
   * @return filters
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Filter> getFilters() {
    return filters;
  }


  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilters(List<Filter> filters) {
    this.filters = filters;
  }


  /**
   * Return true if this Labels_labels_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelsLabelsInner labelsLabelsInner = (LabelsLabelsInner) o;
    return Objects.equals(this.links, labelsLabelsInner.links) &&
        Objects.equals(this.id, labelsLabelsInner.id) &&
        Objects.equals(this.name, labelsLabelsInner.name) &&
        Objects.equals(this.color, labelsLabelsInner.color) &&
        Objects.equals(this.matchType, labelsLabelsInner.matchType) &&
        Objects.equals(this.filters, labelsLabelsInner.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, name, color, matchType, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelsLabelsInner {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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

