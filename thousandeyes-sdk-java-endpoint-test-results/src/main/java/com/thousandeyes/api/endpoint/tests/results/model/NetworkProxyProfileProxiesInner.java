/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.tests.results.model;

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
 * NetworkProxyProfileProxiesInner
 */
@JsonPropertyOrder({
  NetworkProxyProfileProxiesInner.JSON_PROPERTY_BYPASS,
  NetworkProxyProfileProxiesInner.JSON_PROPERTY_PROXY
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T13:50:10.282697+01:00[Europe/Lisbon]")
public class NetworkProxyProfileProxiesInner {
  public static final String JSON_PROPERTY_BYPASS = "bypass";
  private String bypass;

  public static final String JSON_PROPERTY_PROXY = "proxy";
  private String proxy;

  public NetworkProxyProfileProxiesInner() { 
  }

  @JsonCreator
  public NetworkProxyProfileProxiesInner(
    @JsonProperty(JSON_PROPERTY_BYPASS) String bypass, 
    @JsonProperty(JSON_PROPERTY_PROXY) String proxy
  ) {
  this();
    this.bypass = bypass;
    this.proxy = proxy;
  }

   /**
   * Proxy bypass expression.
   * @return bypass
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BYPASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBypass() {
    return bypass;
  }




   /**
   * Proxy mode.
   * @return proxy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROXY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProxy() {
    return proxy;
  }




  /**
   * Return true if this NetworkProxyProfile_proxies_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkProxyProfileProxiesInner networkProxyProfileProxiesInner = (NetworkProxyProfileProxiesInner) o;
    return Objects.equals(this.bypass, networkProxyProfileProxiesInner.bypass) &&
        Objects.equals(this.proxy, networkProxyProfileProxiesInner.proxy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bypass, proxy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkProxyProfileProxiesInner {\n");
    sb.append("    bypass: ").append(toIndentedString(bypass)).append("\n");
    sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
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

