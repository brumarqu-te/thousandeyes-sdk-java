/*
 * Instant Tests API
 * The Instant Tests API endpoint lets you create and run new instant tests. You will need to be a regular user or have the following permissions:   * `API Access`   * `View tests`  The response does not include the immediate test results. Use the Test Results endpoints to get test results after creating and executing an instant test. You can find the URLs for these endpoints in the _links section of the test definition that is returned when you create the instant test. 
 *
 * The version of the OpenAPI document: 7.0.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests.instant.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.tests.instant.model.ApiRequestAssertionName;
import com.thousandeyes.sdk.tests.instant.model.ApiRequestAssertionOperator;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ApiRequestAssertion
 */
@JsonPropertyOrder({
  ApiRequestAssertion.JSON_PROPERTY_NAME,
  ApiRequestAssertion.JSON_PROPERTY_OPERATOR,
  ApiRequestAssertion.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class ApiRequestAssertion {
  public static final String JSON_PROPERTY_NAME = "name";
  private ApiRequestAssertionName name;

  public static final String JSON_PROPERTY_OPERATOR = "operator";
  private ApiRequestAssertionOperator operator;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public ApiRequestAssertion() { 
  }

  public ApiRequestAssertion name(ApiRequestAssertionName name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiRequestAssertionName getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(ApiRequestAssertionName name) {
    this.name = name;
  }


  public ApiRequestAssertion operator(ApiRequestAssertionOperator operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiRequestAssertionOperator getOperator() {
    return operator;
  }


  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperator(ApiRequestAssertionOperator operator) {
    this.operator = operator;
  }


  public ApiRequestAssertion value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the assertion. If name &#x3D; &#x60;status-code&#x60;, the status code to assert. If name &#x3D; &#x60;response-body&#x60;, the lookup value to assert.
   * @return value
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(String value) {
    this.value = value;
  }


  /**
   * Return true if this ApiRequestAssertion object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiRequestAssertion apiRequestAssertion = (ApiRequestAssertion) o;
    return Objects.equals(this.name, apiRequestAssertion.name) &&
        Objects.equals(this.operator, apiRequestAssertion.operator) &&
        Objects.equals(this.value, apiRequestAssertion.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, operator, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiRequestAssertion {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

