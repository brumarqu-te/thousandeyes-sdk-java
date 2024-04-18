/*
 * Tags API
 * The ThousandEyes Tags API provides a tagging system with key/value pairs. It allows you to tag assets within the ThousandEyes platform (such as agents, tests, or alert rules) with meaningful metadata. For example: `branch:sfo`, `branch:nyc`, and `team:netops`.  This feature allows for: * Better support for automation. * Powerful and flexible reports/dashboards. * Support for third-party integrations.  Things to note with the ThousandEyes Tags API: * Tags are backwards-compatible with existing labels. * Tags are separated by Tests (CEA), Agents (CEA), Endpoint Agents, Scheduled Endpoint Tests, and Reports. A single tag can only apply to one type of target object, so each tag must specify the target type of object via a `type` field. * Tags are defined in a single table so that they can be represented using a single model - `Tag`.     
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.tags.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.tags.model.GetTag;
import com.thousandeyes.api.tags.model.TagBulkCreateError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * BulkTagResponse
 */
@JsonPropertyOrder({
  BulkTagResponse.JSON_PROPERTY_TAGS,
  BulkTagResponse.JSON_PROPERTY_ERRORS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-18T12:55:01.957080+01:00[Europe/Lisbon]")
public class BulkTagResponse {
  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<GetTag> tags;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<TagBulkCreateError> errors;

  public BulkTagResponse() { 
  }

  @JsonCreator
  public BulkTagResponse(
    @JsonProperty(JSON_PROPERTY_ERRORS) List<TagBulkCreateError> errors
  ) {
  this();
    this.errors = errors;
  }

  public BulkTagResponse tags(List<GetTag> tags) {
    this.tags = tags;
    return this;
  }

  public BulkTagResponse addTagsItem(GetTag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetTag> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(List<GetTag> tags) {
    this.tags = tags;
  }


   /**
   * Get errors
   * @return errors
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TagBulkCreateError> getErrors() {
    return errors;
  }




  /**
   * Return true if this BulkTagResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkTagResponse bulkTagResponse = (BulkTagResponse) o;
    return Objects.equals(this.tags, bulkTagResponse.tags) &&
        Objects.equals(this.errors, bulkTagResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkTagResponse {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

