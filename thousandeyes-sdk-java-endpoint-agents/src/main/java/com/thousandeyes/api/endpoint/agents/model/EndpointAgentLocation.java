/*
 * Endpoint Agents API
 * Manage ThousandEyes Endpoint Agents using this API.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.agents.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Approximate location of the agent.
 */
@JsonPropertyOrder({
  EndpointAgentLocation.JSON_PROPERTY_LATITUDE,
  EndpointAgentLocation.JSON_PROPERTY_LONGITUDE,
  EndpointAgentLocation.JSON_PROPERTY_LOCATION_NAME
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-17T14:20:01.720354+01:00[Europe/Lisbon]")
public class EndpointAgentLocation {
  public static final String JSON_PROPERTY_LATITUDE = "latitude";
  private Double latitude;

  public static final String JSON_PROPERTY_LONGITUDE = "longitude";
  private Double longitude;

  public static final String JSON_PROPERTY_LOCATION_NAME = "locationName";
  private String locationName;

  public EndpointAgentLocation() { 
  }

  @JsonCreator
  public EndpointAgentLocation(
    @JsonProperty(JSON_PROPERTY_LATITUDE) Double latitude, 
    @JsonProperty(JSON_PROPERTY_LONGITUDE) Double longitude, 
    @JsonProperty(JSON_PROPERTY_LOCATION_NAME) String locationName
  ) {
  this();
    this.latitude = latitude;
    this.longitude = longitude;
    this.locationName = locationName;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getLatitude() {
    return latitude;
  }




   /**
   * Get longitude
   * @return longitude
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getLongitude() {
    return longitude;
  }




   /**
   * Get locationName
   * @return locationName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocationName() {
    return locationName;
  }




  /**
   * Return true if this EndpointAgentLocation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointAgentLocation endpointAgentLocation = (EndpointAgentLocation) o;
    return Objects.equals(this.latitude, endpointAgentLocation.latitude) &&
        Objects.equals(this.longitude, endpointAgentLocation.longitude) &&
        Objects.equals(this.locationName, endpointAgentLocation.locationName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude, locationName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointAgentLocation {\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
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

