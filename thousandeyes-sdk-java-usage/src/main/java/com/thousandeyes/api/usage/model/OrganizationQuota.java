/*
 * Usage API
 *  These usage endpoints define the following operations:  * **Usage**: Retrieve usage data for the specified time period (default is one month).          * Users must have the `View Billing` permission to access this endpoint.     * This endpoint offers visibility across all account groups within the organization.     * Users with `View Billing` permission in multiple organizations should query the endpoint with the `aid` query string parameter (see optional parameters) for each organization.  * **Quotas**: Obtain organization and account usage quotas. Additionally, users with the appropriate permissions can create, update, or delete these quotas.          * Users must have the necessary permissions to perform quota-related actions.  Refer to the Usage API endpoints for detailed usage instructions and optional parameters. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.usage.model;

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
 * OrganizationQuota
 */
@JsonPropertyOrder({
  OrganizationQuota.JSON_PROPERTY_VALUE,
  OrganizationQuota.JSON_PROPERTY_ORG_ID
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T13:50:10.908408+01:00[Europe/Lisbon]")
public class OrganizationQuota {
  public static final String JSON_PROPERTY_VALUE = "value";
  private Long value;

  public static final String JSON_PROPERTY_ORG_ID = "orgId";
  private String orgId;

  public OrganizationQuota() { 
  }

  public OrganizationQuota value(Long value) {
    this.value = value;
    return this;
  }

   /**
   * Value of the quota for the given Organization.
   * @return value
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(Long value) {
    this.value = value;
  }


  public OrganizationQuota orgId(String orgId) {
    this.orgId = orgId;
    return this;
  }

   /**
   * Unique ID of the organization.
   * @return orgId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrgId() {
    return orgId;
  }


  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }


  /**
   * Return true if this OrganizationQuota object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationQuota organizationQuota = (OrganizationQuota) o;
    return Objects.equals(this.value, organizationQuota.value) &&
        Objects.equals(this.orgId, organizationQuota.orgId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, orgId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationQuota {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
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

