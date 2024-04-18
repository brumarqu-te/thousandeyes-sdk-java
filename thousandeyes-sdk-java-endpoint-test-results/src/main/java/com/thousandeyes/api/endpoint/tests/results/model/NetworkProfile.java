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
import com.thousandeyes.api.endpoint.tests.results.model.EthernetProfile;
import com.thousandeyes.api.endpoint.tests.results.model.InterfaceHardwareType;
import com.thousandeyes.api.endpoint.tests.results.model.NetworkInterface;
import com.thousandeyes.api.endpoint.tests.results.model.NetworkProxyProfile;
import com.thousandeyes.api.endpoint.tests.results.model.NetworkWirelessProfile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * NetworkProfile
 */
@JsonPropertyOrder({
  NetworkProfile.JSON_PROPERTY_IP_ADDRESS,
  NetworkProfile.JSON_PROPERTY_SUBNET_MASK,
  NetworkProfile.JSON_PROPERTY_PUBLIC_IP_ADDRESS,
  NetworkProfile.JSON_PROPERTY_LOCAL_PREFIX,
  NetworkProfile.JSON_PROPERTY_PUBLIC_IP_RANGE,
  NetworkProfile.JSON_PROPERTY_DNS_SERVERS,
  NetworkProfile.JSON_PROPERTY_HARDWARE_TYPE,
  NetworkProfile.JSON_PROPERTY_INTERFACE_NAME,
  NetworkProfile.JSON_PROPERTY_ERROR,
  NetworkProfile.JSON_PROPERTY_GATEWAY,
  NetworkProfile.JSON_PROPERTY_WIRELESS_PROFILE,
  NetworkProfile.JSON_PROPERTY_PROXY_PROFILE,
  NetworkProfile.JSON_PROPERTY_ETHERNET_PROFILE,
  NetworkProfile.JSON_PROPERTY_PREVIOUS_INTERFACE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-18T12:55:02.083600+01:00[Europe/Lisbon]")
public class NetworkProfile {
  public static final String JSON_PROPERTY_IP_ADDRESS = "ipAddress";
  private String ipAddress;

  public static final String JSON_PROPERTY_SUBNET_MASK = "subnetMask";
  private String subnetMask;

  public static final String JSON_PROPERTY_PUBLIC_IP_ADDRESS = "publicIpAddress";
  private String publicIpAddress;

  public static final String JSON_PROPERTY_LOCAL_PREFIX = "localPrefix";
  private String localPrefix;

  public static final String JSON_PROPERTY_PUBLIC_IP_RANGE = "publicIpRange";
  private String publicIpRange;

  public static final String JSON_PROPERTY_DNS_SERVERS = "dnsServers";
  private List<String> dnsServers;

  public static final String JSON_PROPERTY_HARDWARE_TYPE = "hardwareType";
  private InterfaceHardwareType hardwareType;

  public static final String JSON_PROPERTY_INTERFACE_NAME = "interfaceName";
  private String interfaceName;

  public static final String JSON_PROPERTY_ERROR = "error";
  private String error;

  public static final String JSON_PROPERTY_GATEWAY = "gateway";
  private String gateway;

  public static final String JSON_PROPERTY_WIRELESS_PROFILE = "wirelessProfile";
  private NetworkWirelessProfile wirelessProfile;

  public static final String JSON_PROPERTY_PROXY_PROFILE = "proxyProfile";
  private NetworkProxyProfile proxyProfile;

  public static final String JSON_PROPERTY_ETHERNET_PROFILE = "ethernetProfile";
  private EthernetProfile ethernetProfile;

  public static final String JSON_PROPERTY_PREVIOUS_INTERFACE = "previousInterface";
  private NetworkInterface previousInterface;

  public NetworkProfile() { 
  }

  @JsonCreator
  public NetworkProfile(
    @JsonProperty(JSON_PROPERTY_IP_ADDRESS) String ipAddress, 
    @JsonProperty(JSON_PROPERTY_SUBNET_MASK) String subnetMask, 
    @JsonProperty(JSON_PROPERTY_PUBLIC_IP_ADDRESS) String publicIpAddress, 
    @JsonProperty(JSON_PROPERTY_LOCAL_PREFIX) String localPrefix, 
    @JsonProperty(JSON_PROPERTY_PUBLIC_IP_RANGE) String publicIpRange, 
    @JsonProperty(JSON_PROPERTY_DNS_SERVERS) List<String> dnsServers, 
    @JsonProperty(JSON_PROPERTY_INTERFACE_NAME) String interfaceName, 
    @JsonProperty(JSON_PROPERTY_ERROR) String error, 
    @JsonProperty(JSON_PROPERTY_GATEWAY) String gateway
  ) {
  this();
    this.ipAddress = ipAddress;
    this.subnetMask = subnetMask;
    this.publicIpAddress = publicIpAddress;
    this.localPrefix = localPrefix;
    this.publicIpRange = publicIpRange;
    this.dnsServers = dnsServers;
    this.interfaceName = interfaceName;
    this.error = error;
    this.gateway = gateway;
  }

   /**
   * Network IP address.
   * @return ipAddress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIpAddress() {
    return ipAddress;
  }




   /**
   * Network subnet mask.
   * @return subnetMask
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBNET_MASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubnetMask() {
    return subnetMask;
  }




   /**
   * Network public IP address.
   * @return publicIpAddress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPublicIpAddress() {
    return publicIpAddress;
  }




   /**
   * Network local prefix.
   * @return localPrefix
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCAL_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocalPrefix() {
    return localPrefix;
  }




   /**
   * Network public IP range.
   * @return publicIpRange
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_IP_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPublicIpRange() {
    return publicIpRange;
  }




   /**
   * Network DNS servers.
   * @return dnsServers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DNS_SERVERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDnsServers() {
    return dnsServers;
  }




  public NetworkProfile hardwareType(InterfaceHardwareType hardwareType) {
    this.hardwareType = hardwareType;
    return this;
  }

   /**
   * Get hardwareType
   * @return hardwareType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HARDWARE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InterfaceHardwareType getHardwareType() {
    return hardwareType;
  }


  @JsonProperty(JSON_PROPERTY_HARDWARE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHardwareType(InterfaceHardwareType hardwareType) {
    this.hardwareType = hardwareType;
  }


   /**
   * Network interface name.
   * @return interfaceName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERFACE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInterfaceName() {
    return interfaceName;
  }




   /**
   * Only present when there is an error
   * @return error
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getError() {
    return error;
  }




   /**
   * Network gateway address.
   * @return gateway
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GATEWAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGateway() {
    return gateway;
  }




  public NetworkProfile wirelessProfile(NetworkWirelessProfile wirelessProfile) {
    this.wirelessProfile = wirelessProfile;
    return this;
  }

   /**
   * Get wirelessProfile
   * @return wirelessProfile
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIRELESS_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NetworkWirelessProfile getWirelessProfile() {
    return wirelessProfile;
  }


  @JsonProperty(JSON_PROPERTY_WIRELESS_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWirelessProfile(NetworkWirelessProfile wirelessProfile) {
    this.wirelessProfile = wirelessProfile;
  }


  public NetworkProfile proxyProfile(NetworkProxyProfile proxyProfile) {
    this.proxyProfile = proxyProfile;
    return this;
  }

   /**
   * Get proxyProfile
   * @return proxyProfile
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROXY_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NetworkProxyProfile getProxyProfile() {
    return proxyProfile;
  }


  @JsonProperty(JSON_PROPERTY_PROXY_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProxyProfile(NetworkProxyProfile proxyProfile) {
    this.proxyProfile = proxyProfile;
  }


  public NetworkProfile ethernetProfile(EthernetProfile ethernetProfile) {
    this.ethernetProfile = ethernetProfile;
    return this;
  }

   /**
   * Get ethernetProfile
   * @return ethernetProfile
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ETHERNET_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EthernetProfile getEthernetProfile() {
    return ethernetProfile;
  }


  @JsonProperty(JSON_PROPERTY_ETHERNET_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEthernetProfile(EthernetProfile ethernetProfile) {
    this.ethernetProfile = ethernetProfile;
  }


  public NetworkProfile previousInterface(NetworkInterface previousInterface) {
    this.previousInterface = previousInterface;
    return this;
  }

   /**
   * Get previousInterface
   * @return previousInterface
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREVIOUS_INTERFACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NetworkInterface getPreviousInterface() {
    return previousInterface;
  }


  @JsonProperty(JSON_PROPERTY_PREVIOUS_INTERFACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreviousInterface(NetworkInterface previousInterface) {
    this.previousInterface = previousInterface;
  }


  /**
   * Return true if this NetworkProfile object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkProfile networkProfile = (NetworkProfile) o;
    return Objects.equals(this.ipAddress, networkProfile.ipAddress) &&
        Objects.equals(this.subnetMask, networkProfile.subnetMask) &&
        Objects.equals(this.publicIpAddress, networkProfile.publicIpAddress) &&
        Objects.equals(this.localPrefix, networkProfile.localPrefix) &&
        Objects.equals(this.publicIpRange, networkProfile.publicIpRange) &&
        Objects.equals(this.dnsServers, networkProfile.dnsServers) &&
        Objects.equals(this.hardwareType, networkProfile.hardwareType) &&
        Objects.equals(this.interfaceName, networkProfile.interfaceName) &&
        Objects.equals(this.error, networkProfile.error) &&
        Objects.equals(this.gateway, networkProfile.gateway) &&
        Objects.equals(this.wirelessProfile, networkProfile.wirelessProfile) &&
        Objects.equals(this.proxyProfile, networkProfile.proxyProfile) &&
        Objects.equals(this.ethernetProfile, networkProfile.ethernetProfile) &&
        Objects.equals(this.previousInterface, networkProfile.previousInterface);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddress, subnetMask, publicIpAddress, localPrefix, publicIpRange, dnsServers, hardwareType, interfaceName, error, gateway, wirelessProfile, proxyProfile, ethernetProfile, previousInterface);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkProfile {\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    subnetMask: ").append(toIndentedString(subnetMask)).append("\n");
    sb.append("    publicIpAddress: ").append(toIndentedString(publicIpAddress)).append("\n");
    sb.append("    localPrefix: ").append(toIndentedString(localPrefix)).append("\n");
    sb.append("    publicIpRange: ").append(toIndentedString(publicIpRange)).append("\n");
    sb.append("    dnsServers: ").append(toIndentedString(dnsServers)).append("\n");
    sb.append("    hardwareType: ").append(toIndentedString(hardwareType)).append("\n");
    sb.append("    interfaceName: ").append(toIndentedString(interfaceName)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    wirelessProfile: ").append(toIndentedString(wirelessProfile)).append("\n");
    sb.append("    proxyProfile: ").append(toIndentedString(proxyProfile)).append("\n");
    sb.append("    ethernetProfile: ").append(toIndentedString(ethernetProfile)).append("\n");
    sb.append("    previousInterface: ").append(toIndentedString(previousInterface)).append("\n");
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

