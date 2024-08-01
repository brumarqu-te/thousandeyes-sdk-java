/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.tests.results.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.endpoint.tests.results.model.DynamicTest;
import com.thousandeyes.sdk.endpoint.tests.results.model.PathVisDetailDynamicTestResult;
import com.thousandeyes.sdk.endpoint.tests.results.model.SelfLinks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PathVisDetailDynamicTestResults
 */
@JsonPropertyOrder({
  PathVisDetailDynamicTestResults.JSON_PROPERTY_RESULTS,
  PathVisDetailDynamicTestResults.JSON_PROPERTY_TEST,
  PathVisDetailDynamicTestResults.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class PathVisDetailDynamicTestResults {
  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<PathVisDetailDynamicTestResult> results = new ArrayList<>();

  public static final String JSON_PROPERTY_TEST = "test";
  private DynamicTest test;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinks links;

  public PathVisDetailDynamicTestResults() { 
  }

  public PathVisDetailDynamicTestResults results(List<PathVisDetailDynamicTestResult> results) {
    this.results = results;
    return this;
  }

  public PathVisDetailDynamicTestResults addResultsItem(PathVisDetailDynamicTestResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PathVisDetailDynamicTestResult> getResults() {
    return results;
  }


  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResults(List<PathVisDetailDynamicTestResult> results) {
    this.results = results;
  }


  public PathVisDetailDynamicTestResults test(DynamicTest test) {
    this.test = test;
    return this;
  }

   /**
   * Get test
   * @return test
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DynamicTest getTest() {
    return test;
  }


  @JsonProperty(JSON_PROPERTY_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTest(DynamicTest test) {
    this.test = test;
  }


  public PathVisDetailDynamicTestResults links(SelfLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SelfLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(SelfLinks links) {
    this.links = links;
  }


  /**
   * Return true if this PathVisDetailDynamicTestResults object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PathVisDetailDynamicTestResults pathVisDetailDynamicTestResults = (PathVisDetailDynamicTestResults) o;
    return Objects.equals(this.results, pathVisDetailDynamicTestResults.results) &&
        Objects.equals(this.test, pathVisDetailDynamicTestResults.test) &&
        Objects.equals(this.links, pathVisDetailDynamicTestResults.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, test, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PathVisDetailDynamicTestResults {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

