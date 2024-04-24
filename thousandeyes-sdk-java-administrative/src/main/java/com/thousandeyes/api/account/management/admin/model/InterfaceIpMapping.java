/*
 * Administrative API
 * ## Overview Manage users, accounts, and account groups in the ThousandEyes platform using the Administrative API. This API provides the following endpoints that define the operations to manage your organization:     * `/account-groups`: Account groups are used to divide an organization into different sections. These endpoints can be used to create, retrieve, update and delete account groups.   * `/users`: Create, retrieve, update and delete users within an organization.    * `/roles`: Create, retrieve and update roles for the current user.    * `/permissions`: Retrieve all assignable permissions. Used in the context of modifying roles.    * `/audit-user-events`: Retrieve all activity log events.    For more information about the administrative models, see [Account Management](https://docs.thousandeyes.com/product-documentation/user-management).
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.account.management.admin.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * InterfaceIpMapping
 */
@JsonPropertyOrder({
  InterfaceIpMapping.JSON_PROPERTY_INTERFACE_NAME,
  InterfaceIpMapping.JSON_PROPERTY_IP_ADDRESSES
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T13:50:10.152598+01:00[Europe/Lisbon]")
public class InterfaceIpMapping {
  public static final String JSON_PROPERTY_INTERFACE_NAME = "interfaceName";
  private String interfaceName;

  public static final String JSON_PROPERTY_IP_ADDRESSES = "ipAddresses";
  private List<String> ipAddresses = new ArrayList<>();

  public InterfaceIpMapping() { 
  }

  @JsonCreator
  public InterfaceIpMapping(
    @JsonProperty(JSON_PROPERTY_INTERFACE_NAME) String interfaceName, 
    @JsonProperty(JSON_PROPERTY_IP_ADDRESSES) List<String> ipAddresses
  ) {
  this();
    this.interfaceName = interfaceName;
    this.ipAddresses = ipAddresses;
  }

   /**
   * Name of the mapping
   * @return interfaceName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERFACE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInterfaceName() {
    return interfaceName;
  }




   /**
   * Array of ipAddress entries
   * @return ipAddresses
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getIpAddresses() {
    return ipAddresses;
  }




  /**
   * Return true if this InterfaceIpMapping object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InterfaceIpMapping interfaceIpMapping = (InterfaceIpMapping) o;
    return Objects.equals(this.interfaceName, interfaceIpMapping.interfaceName) &&
        Objects.equals(this.ipAddresses, interfaceIpMapping.ipAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interfaceName, ipAddresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterfaceIpMapping {\n");
    sb.append("    interfaceName: ").append(toIndentedString(interfaceName)).append("\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
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

