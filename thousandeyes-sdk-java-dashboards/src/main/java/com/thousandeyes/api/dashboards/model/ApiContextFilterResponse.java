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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.thousandeyes.api.dashboards.model.ApiDashboardFilterUserDetails;
import com.thousandeyes.api.dashboards.model.ApiDataSourceFilters;
import com.thousandeyes.api.dashboards.model.SelfLinksLinks;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Response containing dashboard filter settings and context details.
 */
@JsonPropertyOrder({
  ApiContextFilterResponse.JSON_PROPERTY_LINKS,
  ApiContextFilterResponse.JSON_PROPERTY_CONTEXT,
  ApiContextFilterResponse.JSON_PROPERTY_AID,
  ApiContextFilterResponse.JSON_PROPERTY_ID,
  ApiContextFilterResponse.JSON_PROPERTY_NAME,
  ApiContextFilterResponse.JSON_PROPERTY_DESCRIPTION,
  ApiContextFilterResponse.JSON_PROPERTY_CREATED_BY,
  ApiContextFilterResponse.JSON_PROPERTY_MODIFIED_DATE,
  ApiContextFilterResponse.JSON_PROPERTY_CREATED_DATE,
  ApiContextFilterResponse.JSON_PROPERTY_MODIFIED_BY
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T10:36:00.397550+01:00[Europe/London]")
public class ApiContextFilterResponse {
  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinksLinks links;

  public static final String JSON_PROPERTY_CONTEXT = "context";
  private Set<ApiDataSourceFilters> context = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_AID = "aid";
  private String aid;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private ApiDashboardFilterUserDetails createdBy;

  public static final String JSON_PROPERTY_MODIFIED_DATE = "modifiedDate";
  private OffsetDateTime modifiedDate;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private OffsetDateTime createdDate;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modifiedBy";
  private ApiDashboardFilterUserDetails modifiedBy;

  public ApiContextFilterResponse() { 
  }

  public ApiContextFilterResponse links(SelfLinksLinks links) {
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


  public ApiContextFilterResponse context(Set<ApiDataSourceFilters> context) {
    this.context = context;
    return this;
  }

  public ApiContextFilterResponse addContextItem(ApiDataSourceFilters contextItem) {
    if (this.context == null) {
      this.context = new LinkedHashSet<>();
    }
    this.context.add(contextItem);
    return this;
  }

   /**
   * List of filters to be applied to a dashboard.
   * @return context
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<ApiDataSourceFilters> getContext() {
    return context;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContext(Set<ApiDataSourceFilters> context) {
    this.context = context;
  }


  public ApiContextFilterResponse aid(String aid) {
    this.aid = aid;
    return this;
  }

   /**
   * Account group ID of the filter.
   * @return aid
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAid() {
    return aid;
  }


  @JsonProperty(JSON_PROPERTY_AID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAid(String aid) {
    this.aid = aid;
  }


  public ApiContextFilterResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique ID of the dashboard filter.
   * @return id
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public ApiContextFilterResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the dashboard filter, this must be unique.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public ApiContextFilterResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * An optional description of the filter.
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public ApiContextFilterResponse createdBy(ApiDashboardFilterUserDetails createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDashboardFilterUserDetails getCreatedBy() {
    return createdBy;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedBy(ApiDashboardFilterUserDetails createdBy) {
    this.createdBy = createdBy;
  }


  public ApiContextFilterResponse modifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Timestamp when the filter was last modified.
   * @return modifiedDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }


  @JsonProperty(JSON_PROPERTY_MODIFIED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  public ApiContextFilterResponse createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Timestamp when the filter was created.
   * @return createdDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public ApiContextFilterResponse modifiedBy(ApiDashboardFilterUserDetails modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * Get modifiedBy
   * @return modifiedBy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDashboardFilterUserDetails getModifiedBy() {
    return modifiedBy;
  }


  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModifiedBy(ApiDashboardFilterUserDetails modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  /**
   * Return true if this ApiContextFilterResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiContextFilterResponse apiContextFilterResponse = (ApiContextFilterResponse) o;
    return Objects.equals(this.links, apiContextFilterResponse.links) &&
        Objects.equals(this.context, apiContextFilterResponse.context) &&
        Objects.equals(this.aid, apiContextFilterResponse.aid) &&
        Objects.equals(this.id, apiContextFilterResponse.id) &&
        Objects.equals(this.name, apiContextFilterResponse.name) &&
        Objects.equals(this.description, apiContextFilterResponse.description) &&
        Objects.equals(this.createdBy, apiContextFilterResponse.createdBy) &&
        Objects.equals(this.modifiedDate, apiContextFilterResponse.modifiedDate) &&
        Objects.equals(this.createdDate, apiContextFilterResponse.createdDate) &&
        Objects.equals(this.modifiedBy, apiContextFilterResponse.modifiedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, context, aid, id, name, description, createdBy, modifiedDate, createdDate, modifiedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiContextFilterResponse {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
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

