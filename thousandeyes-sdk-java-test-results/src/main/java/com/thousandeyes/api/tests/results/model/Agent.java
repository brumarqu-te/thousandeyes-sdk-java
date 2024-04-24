/*
 * Test Results API
 * Get test result metrics for Cloud and Enterprise Agent tests.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.tests.results.model;

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
 * Agent
 */
@JsonPropertyOrder({
  Agent.JSON_PROPERTY_AGENT_ID,
  Agent.JSON_PROPERTY_AGENT_NAME,
  Agent.JSON_PROPERTY_COUNTRY_ID,
  Agent.JSON_PROPERTY_LOCATION
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T13:50:10.983792+01:00[Europe/Lisbon]")
public class Agent {
  public static final String JSON_PROPERTY_AGENT_ID = "agentId";
  private String agentId;

  public static final String JSON_PROPERTY_AGENT_NAME = "agentName";
  private String agentName;

  public static final String JSON_PROPERTY_COUNTRY_ID = "countryId";
  private String countryId;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private String location;

  public Agent() { 
  }

  @JsonCreator
  public Agent(
    @JsonProperty(JSON_PROPERTY_AGENT_ID) String agentId, 
    @JsonProperty(JSON_PROPERTY_AGENT_NAME) String agentName, 
    @JsonProperty(JSON_PROPERTY_COUNTRY_ID) String countryId, 
    @JsonProperty(JSON_PROPERTY_LOCATION) String location
  ) {
  this();
    this.agentId = agentId;
    this.agentName = agentName;
    this.countryId = countryId;
    this.location = location;
  }

   /**
   * Unique agent ID
   * @return agentId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAgentId() {
    return agentId;
  }




   /**
   * Agent name
   * @return agentName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAgentName() {
    return agentName;
  }




   /**
   * 2-digit ISO country code
   * @return countryId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryId() {
    return countryId;
  }




   /**
   * Location of the agent.
   * @return location
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocation() {
    return location;
  }




  /**
   * Return true if this Agent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Agent agent = (Agent) o;
    return Objects.equals(this.agentId, agent.agentId) &&
        Objects.equals(this.agentName, agent.agentName) &&
        Objects.equals(this.countryId, agent.countryId) &&
        Objects.equals(this.location, agent.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, agentName, countryId, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Agent {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

