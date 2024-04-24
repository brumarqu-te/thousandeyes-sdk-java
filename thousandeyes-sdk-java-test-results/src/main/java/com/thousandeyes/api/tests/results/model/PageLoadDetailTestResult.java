/*
 * Test Results API
 * Get test result metrics for Cloud and Enterprise Agent tests.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.tests.results.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.tests.results.model.Agent;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PageLoadDetailTestResult
 */
@JsonPropertyOrder({
  PageLoadDetailTestResult.JSON_PROPERTY_DATE,
  PageLoadDetailTestResult.JSON_PROPERTY_ROUND_ID,
  PageLoadDetailTestResult.JSON_PROPERTY_LINKS,
  PageLoadDetailTestResult.JSON_PROPERTY_AGENT,
  PageLoadDetailTestResult.JSON_PROPERTY_RESPONSE_TIME,
  PageLoadDetailTestResult.JSON_PROPERTY_TOTAL_SIZE,
  PageLoadDetailTestResult.JSON_PROPERTY_NUM_OBJECTS,
  PageLoadDetailTestResult.JSON_PROPERTY_NUM_ERRORS,
  PageLoadDetailTestResult.JSON_PROPERTY_DOM_LOAD_TIME,
  PageLoadDetailTestResult.JSON_PROPERTY_PAGE_LOAD_TIME,
  PageLoadDetailTestResult.JSON_PROPERTY_HAR
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T13:50:10.983792+01:00[Europe/Lisbon]")
public class PageLoadDetailTestResult {
  public static final String JSON_PROPERTY_DATE = "date";
  private OffsetDateTime date;

  public static final String JSON_PROPERTY_ROUND_ID = "roundId";
  private Integer roundId;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private Object links;

  public static final String JSON_PROPERTY_AGENT = "agent";
  private Agent agent;

  public static final String JSON_PROPERTY_RESPONSE_TIME = "responseTime";
  private Double responseTime;

  public static final String JSON_PROPERTY_TOTAL_SIZE = "totalSize";
  private Integer totalSize;

  public static final String JSON_PROPERTY_NUM_OBJECTS = "numObjects";
  private Integer numObjects;

  public static final String JSON_PROPERTY_NUM_ERRORS = "numErrors";
  private Integer numErrors;

  public static final String JSON_PROPERTY_DOM_LOAD_TIME = "domLoadTime";
  private Integer domLoadTime;

  public static final String JSON_PROPERTY_PAGE_LOAD_TIME = "pageLoadTime";
  private Integer pageLoadTime;

  public static final String JSON_PROPERTY_HAR = "har";
  private Object har;

  public PageLoadDetailTestResult() { 
  }

  @JsonCreator
  public PageLoadDetailTestResult(
    @JsonProperty(JSON_PROPERTY_DATE) OffsetDateTime date, 
    @JsonProperty(JSON_PROPERTY_ROUND_ID) Integer roundId, 
    @JsonProperty(JSON_PROPERTY_RESPONSE_TIME) Double responseTime, 
    @JsonProperty(JSON_PROPERTY_TOTAL_SIZE) Integer totalSize, 
    @JsonProperty(JSON_PROPERTY_NUM_OBJECTS) Integer numObjects, 
    @JsonProperty(JSON_PROPERTY_NUM_ERRORS) Integer numErrors, 
    @JsonProperty(JSON_PROPERTY_DOM_LOAD_TIME) Integer domLoadTime, 
    @JsonProperty(JSON_PROPERTY_PAGE_LOAD_TIME) Integer pageLoadTime, 
    @JsonProperty(JSON_PROPERTY_HAR) Object har
  ) {
  this();
    this.date = date;
    this.roundId = roundId;
    this.responseTime = responseTime;
    this.totalSize = totalSize;
    this.numObjects = numObjects;
    this.numErrors = numErrors;
    this.domLoadTime = domLoadTime;
    this.pageLoadTime = pageLoadTime;
    this.har = har;
  }

   /**
   * Data point date UTC (ISO date-time format).
   * @return date
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDate() {
    return date;
  }




   /**
   * Epoch time (seconds) indicating the start time of the round
   * @return roundId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROUND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRoundId() {
    return roundId;
  }




  public PageLoadDetailTestResult links(Object links) {
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

  public Object getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(Object links) {
    this.links = links;
  }


  public PageLoadDetailTestResult agent(Agent agent) {
    this.agent = agent;
    return this;
  }

   /**
   * Get agent
   * @return agent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Agent getAgent() {
    return agent;
  }


  @JsonProperty(JSON_PROPERTY_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgent(Agent agent) {
    this.agent = agent;
  }


   /**
   * Time to first byte in milliseconds
   * @return responseTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getResponseTime() {
    return responseTime;
  }




   /**
   * Sum of wire size of all objects on page in bytes
   * @return totalSize
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalSize() {
    return totalSize;
  }




   /**
   * Number of objects found on the page
   * @return numObjects
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUM_OBJECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumObjects() {
    return numObjects;
  }




   /**
   * Number of objects which encountered errors during download
   * @return numErrors
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUM_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumErrors() {
    return numErrors;
  }




   /**
   * Time to interaction in milliseconds
   * @return domLoadTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOM_LOAD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDomLoadTime() {
    return domLoadTime;
  }




   /**
   * Time to completely load page in milliseconds
   * @return pageLoadTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_LOAD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageLoadTime() {
    return pageLoadTime;
  }




   /**
   * See [HAR specification](http://www.softwareishard.com/blog/har-12-spec/) for details
   * @return har
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getHar() {
    return har;
  }




  /**
   * Return true if this PageLoadDetailTestResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageLoadDetailTestResult pageLoadDetailTestResult = (PageLoadDetailTestResult) o;
    return Objects.equals(this.date, pageLoadDetailTestResult.date) &&
        Objects.equals(this.roundId, pageLoadDetailTestResult.roundId) &&
        Objects.equals(this.links, pageLoadDetailTestResult.links) &&
        Objects.equals(this.agent, pageLoadDetailTestResult.agent) &&
        Objects.equals(this.responseTime, pageLoadDetailTestResult.responseTime) &&
        Objects.equals(this.totalSize, pageLoadDetailTestResult.totalSize) &&
        Objects.equals(this.numObjects, pageLoadDetailTestResult.numObjects) &&
        Objects.equals(this.numErrors, pageLoadDetailTestResult.numErrors) &&
        Objects.equals(this.domLoadTime, pageLoadDetailTestResult.domLoadTime) &&
        Objects.equals(this.pageLoadTime, pageLoadDetailTestResult.pageLoadTime) &&
        Objects.equals(this.har, pageLoadDetailTestResult.har);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, roundId, links, agent, responseTime, totalSize, numObjects, numErrors, domLoadTime, pageLoadTime, har);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageLoadDetailTestResult {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    responseTime: ").append(toIndentedString(responseTime)).append("\n");
    sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
    sb.append("    numObjects: ").append(toIndentedString(numObjects)).append("\n");
    sb.append("    numErrors: ").append(toIndentedString(numErrors)).append("\n");
    sb.append("    domLoadTime: ").append(toIndentedString(domLoadTime)).append("\n");
    sb.append("    pageLoadTime: ").append(toIndentedString(pageLoadTime)).append("\n");
    sb.append("    har: ").append(toIndentedString(har)).append("\n");
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

