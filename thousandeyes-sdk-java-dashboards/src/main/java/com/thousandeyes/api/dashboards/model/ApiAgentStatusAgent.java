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
import com.thousandeyes.api.dashboards.model.ApiAgentLocation;
import com.thousandeyes.api.dashboards.model.ApiAgentStatusIpInfo;
import com.thousandeyes.api.dashboards.model.EnterpriseAgentState;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Agent shown in agent status widget.
 */
@JsonPropertyOrder({
  ApiAgentStatusAgent.JSON_PROPERTY_AGENT_ID,
  ApiAgentStatusAgent.JSON_PROPERTY_STATUS,
  ApiAgentStatusAgent.JSON_PROPERTY_IP_INFO,
  ApiAgentStatusAgent.JSON_PROPERTY_AGENT_NAME,
  ApiAgentStatusAgent.JSON_PROPERTY_LOCATION
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T13:50:10.275061+01:00[Europe/Lisbon]")
public class ApiAgentStatusAgent {
  public static final String JSON_PROPERTY_AGENT_ID = "agentId";
  private String agentId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private EnterpriseAgentState status;

  public static final String JSON_PROPERTY_IP_INFO = "ipInfo";
  private ApiAgentStatusIpInfo ipInfo;

  public static final String JSON_PROPERTY_AGENT_NAME = "agentName";
  private String agentName;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private ApiAgentLocation location;

  public ApiAgentStatusAgent() { 
  }

  public ApiAgentStatusAgent agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }

   /**
   * Identifier of the agent.
   * @return agentId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAgentId() {
    return agentId;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }


  public ApiAgentStatusAgent status(EnterpriseAgentState status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EnterpriseAgentState getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(EnterpriseAgentState status) {
    this.status = status;
  }


  public ApiAgentStatusAgent ipInfo(ApiAgentStatusIpInfo ipInfo) {
    this.ipInfo = ipInfo;
    return this;
  }

   /**
   * Get ipInfo
   * @return ipInfo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiAgentStatusIpInfo getIpInfo() {
    return ipInfo;
  }


  @JsonProperty(JSON_PROPERTY_IP_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpInfo(ApiAgentStatusIpInfo ipInfo) {
    this.ipInfo = ipInfo;
  }


  public ApiAgentStatusAgent agentName(String agentName) {
    this.agentName = agentName;
    return this;
  }

   /**
   * Name of the agent
   * @return agentName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAgentName() {
    return agentName;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgentName(String agentName) {
    this.agentName = agentName;
  }


  public ApiAgentStatusAgent location(ApiAgentLocation location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiAgentLocation getLocation() {
    return location;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocation(ApiAgentLocation location) {
    this.location = location;
  }


  /**
   * Return true if this ApiAgentStatusAgent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiAgentStatusAgent apiAgentStatusAgent = (ApiAgentStatusAgent) o;
    return Objects.equals(this.agentId, apiAgentStatusAgent.agentId) &&
        Objects.equals(this.status, apiAgentStatusAgent.status) &&
        Objects.equals(this.ipInfo, apiAgentStatusAgent.ipInfo) &&
        Objects.equals(this.agentName, apiAgentStatusAgent.agentName) &&
        Objects.equals(this.location, apiAgentStatusAgent.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, status, ipInfo, agentName, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiAgentStatusAgent {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    ipInfo: ").append(toIndentedString(ipInfo)).append("\n");
    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
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

