/*
 * Usage API
 *  These usage endpoints define the following operations:  * **Usage**: Retrieve usage data for the specified time period (default is one month).          * Users must have the `View Billing` permission to access this endpoint.     * This endpoint offers visibility across all account groups within the organization.     * Users with `View Billing` permission in multiple organizations should query the endpoint with the `aid` query string parameter (see optional parameters) for each organization.  * **Quotas**: Obtain organization and account usage quotas. Additionally, users with the appropriate permissions can create, update, or delete these quotas.          * Users must have the necessary permissions to perform quota-related actions.  Refer to the Usage API endpoints for detailed usage instructions and optional parameters. 
 *
 * The version of the OpenAPI document: 7.0.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.usage.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.usage.model.OrganizationQuotaAssignment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * OrganizationsQuotasAssign
 */
@JsonPropertyOrder({
  OrganizationsQuotasAssign.JSON_PROPERTY_ORGANIZATIONS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class OrganizationsQuotasAssign {
  public static final String JSON_PROPERTY_ORGANIZATIONS = "organizations";
  private List<OrganizationQuotaAssignment> organizations = new ArrayList<>();

  public OrganizationsQuotasAssign() { 
  }

  public OrganizationsQuotasAssign organizations(List<OrganizationQuotaAssignment> organizations) {
    this.organizations = organizations;
    return this;
  }

  public OrganizationsQuotasAssign addOrganizationsItem(OrganizationQuotaAssignment organizationsItem) {
    if (this.organizations == null) {
      this.organizations = new ArrayList<>();
    }
    this.organizations.add(organizationsItem);
    return this;
  }

   /**
   * Get organizations
   * @return organizations
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORGANIZATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OrganizationQuotaAssignment> getOrganizations() {
    return organizations;
  }


  @JsonProperty(JSON_PROPERTY_ORGANIZATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrganizations(List<OrganizationQuotaAssignment> organizations) {
    this.organizations = organizations;
  }


  /**
   * Return true if this OrganizationsQuotasAssign object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationsQuotasAssign organizationsQuotasAssign = (OrganizationsQuotasAssign) o;
    return Objects.equals(this.organizations, organizationsQuotasAssign.organizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationsQuotasAssign {\n");
    sb.append("    organizations: ").append(toIndentedString(organizations)).append("\n");
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

