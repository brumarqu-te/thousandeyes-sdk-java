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
import com.thousandeyes.api.endpoint.tests.results.model.ConditionalOperator;
import com.thousandeyes.api.endpoint.tests.results.model.TestsDataThresholdFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * All filters are applied based on the conditional operator (and/or).
 */
@JsonPropertyOrder({
  TestsDataThresholdFilters.JSON_PROPERTY_FILTERS,
  TestsDataThresholdFilters.JSON_PROPERTY_CONDITIONAL_OPERATOR
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-17T14:20:01.893850+01:00[Europe/Lisbon]")
public class TestsDataThresholdFilters {
  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<TestsDataThresholdFilter> filters;

  public static final String JSON_PROPERTY_CONDITIONAL_OPERATOR = "conditionalOperator";
  private ConditionalOperator conditionalOperator;

  public TestsDataThresholdFilters() { 
  }

  public TestsDataThresholdFilters filters(List<TestsDataThresholdFilter> filters) {
    this.filters = filters;
    return this;
  }

  public TestsDataThresholdFilters addFiltersItem(TestsDataThresholdFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TestsDataThresholdFilter> getFilters() {
    return filters;
  }


  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilters(List<TestsDataThresholdFilter> filters) {
    this.filters = filters;
  }


  public TestsDataThresholdFilters conditionalOperator(ConditionalOperator conditionalOperator) {
    this.conditionalOperator = conditionalOperator;
    return this;
  }

   /**
   * Get conditionalOperator
   * @return conditionalOperator
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONDITIONAL_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConditionalOperator getConditionalOperator() {
    return conditionalOperator;
  }


  @JsonProperty(JSON_PROPERTY_CONDITIONAL_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConditionalOperator(ConditionalOperator conditionalOperator) {
    this.conditionalOperator = conditionalOperator;
  }


  /**
   * Return true if this TestsDataThresholdFilters object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestsDataThresholdFilters testsDataThresholdFilters = (TestsDataThresholdFilters) o;
    return Objects.equals(this.filters, testsDataThresholdFilters.filters) &&
        Objects.equals(this.conditionalOperator, testsDataThresholdFilters.conditionalOperator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, conditionalOperator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestsDataThresholdFilters {\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    conditionalOperator: ").append(toIndentedString(conditionalOperator)).append("\n");
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

