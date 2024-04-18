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
 * WebTransactionTestResult
 */
@JsonPropertyOrder({
  WebTransactionTestResult.JSON_PROPERTY_DATE,
  WebTransactionTestResult.JSON_PROPERTY_ROUND_ID,
  WebTransactionTestResult.JSON_PROPERTY_LINKS,
  WebTransactionTestResult.JSON_PROPERTY_AGENT,
  WebTransactionTestResult.JSON_PROPERTY_COMPONENT_ERRORS,
  WebTransactionTestResult.JSON_PROPERTY_TRANSACTION_TIME,
  WebTransactionTestResult.JSON_PROPERTY_ERROR_TYPE,
  WebTransactionTestResult.JSON_PROPERTY_ERROR_DETAILS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-18T12:55:02.084308+01:00[Europe/Lisbon]")
public class WebTransactionTestResult {
  public static final String JSON_PROPERTY_DATE = "date";
  private OffsetDateTime date;

  public static final String JSON_PROPERTY_ROUND_ID = "roundId";
  private Integer roundId;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private Object links;

  public static final String JSON_PROPERTY_AGENT = "agent";
  private Agent agent;

  public static final String JSON_PROPERTY_COMPONENT_ERRORS = "componentErrors";
  private Integer componentErrors;

  public static final String JSON_PROPERTY_TRANSACTION_TIME = "transactionTime";
  private Integer transactionTime;

  public static final String JSON_PROPERTY_ERROR_TYPE = "errorType";
  private String errorType;

  public static final String JSON_PROPERTY_ERROR_DETAILS = "errorDetails";
  private String errorDetails;

  public WebTransactionTestResult() { 
  }

  @JsonCreator
  public WebTransactionTestResult(
    @JsonProperty(JSON_PROPERTY_DATE) OffsetDateTime date, 
    @JsonProperty(JSON_PROPERTY_ROUND_ID) Integer roundId, 
    @JsonProperty(JSON_PROPERTY_COMPONENT_ERRORS) Integer componentErrors, 
    @JsonProperty(JSON_PROPERTY_TRANSACTION_TIME) Integer transactionTime, 
    @JsonProperty(JSON_PROPERTY_ERROR_TYPE) String errorType, 
    @JsonProperty(JSON_PROPERTY_ERROR_DETAILS) String errorDetails
  ) {
  this();
    this.date = date;
    this.roundId = roundId;
    this.componentErrors = componentErrors;
    this.transactionTime = transactionTime;
    this.errorType = errorType;
    this.errorDetails = errorDetails;
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




  public WebTransactionTestResult links(Object links) {
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


  public WebTransactionTestResult agent(Agent agent) {
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
   * Number of components which did not successfully load
   * @return componentErrors
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENT_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getComponentErrors() {
    return componentErrors;
  }




   /**
   * Elapsed execution time of the web transaction script in milliseconds
   * @return transactionTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSACTION_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTransactionTime() {
    return transactionTime;
  }




   /**
   * Type of error encountered; corresponds to phase of connection
   * @return errorType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorType() {
    return errorType;
  }




   /**
   * Error details, if an error were encountered
   * @return errorDetails
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorDetails() {
    return errorDetails;
  }




  /**
   * Return true if this WebTransactionTestResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebTransactionTestResult webTransactionTestResult = (WebTransactionTestResult) o;
    return Objects.equals(this.date, webTransactionTestResult.date) &&
        Objects.equals(this.roundId, webTransactionTestResult.roundId) &&
        Objects.equals(this.links, webTransactionTestResult.links) &&
        Objects.equals(this.agent, webTransactionTestResult.agent) &&
        Objects.equals(this.componentErrors, webTransactionTestResult.componentErrors) &&
        Objects.equals(this.transactionTime, webTransactionTestResult.transactionTime) &&
        Objects.equals(this.errorType, webTransactionTestResult.errorType) &&
        Objects.equals(this.errorDetails, webTransactionTestResult.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, roundId, links, agent, componentErrors, transactionTime, errorType, errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebTransactionTestResult {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    componentErrors: ").append(toIndentedString(componentErrors)).append("\n");
    sb.append("    transactionTime: ").append(toIndentedString(transactionTime)).append("\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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

