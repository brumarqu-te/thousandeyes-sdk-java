/*
 * Endpoint Tests API
 *  Manage endpoint agent dynamic and scheduled tests using the Endpoint Tests API. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.tests.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.endpoint.tests.model.EndpointTestProtocol;
import com.thousandeyes.api.endpoint.tests.model.TestInterval;
import com.thousandeyes.api.endpoint.tests.model.TestProbeMode;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EndpointNetworkTestUpdate
 */
@JsonPropertyOrder({
  EndpointNetworkTestUpdate.JSON_PROPERTY_INTERVAL,
  EndpointNetworkTestUpdate.JSON_PROPERTY_TEST_NAME,
  EndpointNetworkTestUpdate.JSON_PROPERTY_PROTOCOL,
  EndpointNetworkTestUpdate.JSON_PROPERTY_IS_ENABLED,
  EndpointNetworkTestUpdate.JSON_PROPERTY_TCP_PROBE_MODE,
  EndpointNetworkTestUpdate.JSON_PROPERTY_PORT,
  EndpointNetworkTestUpdate.JSON_PROPERTY_SERVER
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T13:50:10.117799+01:00[Europe/Lisbon]")
public class EndpointNetworkTestUpdate {
  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private TestInterval interval;

  public static final String JSON_PROPERTY_TEST_NAME = "testName";
  private String testName;

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private EndpointTestProtocol protocol = EndpointTestProtocol.ICMP;

  public static final String JSON_PROPERTY_IS_ENABLED = "isEnabled";
  private Boolean isEnabled = true;

  public static final String JSON_PROPERTY_TCP_PROBE_MODE = "tcpProbeMode";
  private TestProbeMode tcpProbeMode = TestProbeMode.AUTO;

  public static final String JSON_PROPERTY_PORT = "port";
  private Integer port = 49153;

  public static final String JSON_PROPERTY_SERVER = "server";
  private String server;

  public EndpointNetworkTestUpdate() { 
  }

  public EndpointNetworkTestUpdate interval(TestInterval interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestInterval getInterval() {
    return interval;
  }


  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterval(TestInterval interval) {
    this.interval = interval;
  }


  public EndpointNetworkTestUpdate testName(String testName) {
    this.testName = testName;
    return this;
  }

   /**
   * Name of the test.
   * @return testName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTestName() {
    return testName;
  }


  @JsonProperty(JSON_PROPERTY_TEST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestName(String testName) {
    this.testName = testName;
  }


  public EndpointNetworkTestUpdate protocol(EndpointTestProtocol protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EndpointTestProtocol getProtocol() {
    return protocol;
  }


  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProtocol(EndpointTestProtocol protocol) {
    this.protocol = protocol;
  }


  public EndpointNetworkTestUpdate isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Indicates if test is enabled.
   * @return isEnabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsEnabled() {
    return isEnabled;
  }


  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  public EndpointNetworkTestUpdate tcpProbeMode(TestProbeMode tcpProbeMode) {
    this.tcpProbeMode = tcpProbeMode;
    return this;
  }

   /**
   * Get tcpProbeMode
   * @return tcpProbeMode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TCP_PROBE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestProbeMode getTcpProbeMode() {
    return tcpProbeMode;
  }


  @JsonProperty(JSON_PROPERTY_TCP_PROBE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTcpProbeMode(TestProbeMode tcpProbeMode) {
    this.tcpProbeMode = tcpProbeMode;
  }


  public EndpointNetworkTestUpdate port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Target port.
   * minimum: 1
   * maximum: 65535
   * @return port
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPort() {
    return port;
  }


  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPort(Integer port) {
    this.port = port;
  }


  public EndpointNetworkTestUpdate server(String server) {
    this.server = server;
    return this;
  }

   /**
   * Target domain name or IP address.
   * @return server
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServer() {
    return server;
  }


  @JsonProperty(JSON_PROPERTY_SERVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServer(String server) {
    this.server = server;
  }


  /**
   * Return true if this EndpointNetworkTestUpdate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointNetworkTestUpdate endpointNetworkTestUpdate = (EndpointNetworkTestUpdate) o;
    return Objects.equals(this.interval, endpointNetworkTestUpdate.interval) &&
        Objects.equals(this.testName, endpointNetworkTestUpdate.testName) &&
        Objects.equals(this.protocol, endpointNetworkTestUpdate.protocol) &&
        Objects.equals(this.isEnabled, endpointNetworkTestUpdate.isEnabled) &&
        Objects.equals(this.tcpProbeMode, endpointNetworkTestUpdate.tcpProbeMode) &&
        Objects.equals(this.port, endpointNetworkTestUpdate.port) &&
        Objects.equals(this.server, endpointNetworkTestUpdate.server);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, testName, protocol, isEnabled, tcpProbeMode, port, server);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointNetworkTestUpdate {\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    tcpProbeMode: ").append(toIndentedString(tcpProbeMode)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
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

