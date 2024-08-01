/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.tests.results.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.endpoint.tests.results.model.Link;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A links object containing a related link for forward pagination.
 */
@JsonPropertyOrder({
  PaginationNextAndSelfLink.JSON_PROPERTY_NEXT,
  PaginationNextAndSelfLink.JSON_PROPERTY_SELF
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class PaginationNextAndSelfLink {
  public static final String JSON_PROPERTY_NEXT = "next";
  private Link next;

  public static final String JSON_PROPERTY_SELF = "self";
  private Link self;

  public PaginationNextAndSelfLink() { 
  }

  public PaginationNextAndSelfLink next(Link next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Link getNext() {
    return next;
  }


  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNext(Link next) {
    this.next = next;
  }


  public PaginationNextAndSelfLink self(Link self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Link getSelf() {
    return self;
  }


  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelf(Link self) {
    this.self = self;
  }


  /**
   * Return true if this PaginationNextAndSelfLink object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginationNextAndSelfLink paginationNextAndSelfLink = (PaginationNextAndSelfLink) o;
    return Objects.equals(this.next, paginationNextAndSelfLink.next) &&
        Objects.equals(this.self, paginationNextAndSelfLink.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(next, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginationNextAndSelfLink {\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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

