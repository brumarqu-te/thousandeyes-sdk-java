/*
 * Tests API
 * This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.tests.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.tests.model.FtpServerRequestType;
import com.thousandeyes.api.tests.model.TestInterval;
import com.thousandeyes.api.tests.model.TestIpv6Policy;
import com.thousandeyes.api.tests.model.TestPathTraceMode;
import com.thousandeyes.api.tests.model.TestProbeMode;
import com.thousandeyes.api.tests.model.TestProtocol;
import com.thousandeyes.api.tests.model.TestRequestAllOfAgents;
import com.thousandeyes.api.tests.model.UnexpandedInstantTestLinks;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UpdateFtpServerTest
 */
@JsonPropertyOrder({
  UpdateFtpServerTest.JSON_PROPERTY_INTERVAL,
  UpdateFtpServerTest.JSON_PROPERTY_ALERTS_ENABLED,
  UpdateFtpServerTest.JSON_PROPERTY_ENABLED,
  UpdateFtpServerTest.JSON_PROPERTY_ALERT_RULES,
  UpdateFtpServerTest.JSON_PROPERTY_CREATED_BY,
  UpdateFtpServerTest.JSON_PROPERTY_CREATED_DATE,
  UpdateFtpServerTest.JSON_PROPERTY_DESCRIPTION,
  UpdateFtpServerTest.JSON_PROPERTY_LIVE_SHARE,
  UpdateFtpServerTest.JSON_PROPERTY_MODIFIED_BY,
  UpdateFtpServerTest.JSON_PROPERTY_MODIFIED_DATE,
  UpdateFtpServerTest.JSON_PROPERTY_SAVED_EVENT,
  UpdateFtpServerTest.JSON_PROPERTY_TEST_ID,
  UpdateFtpServerTest.JSON_PROPERTY_TEST_NAME,
  UpdateFtpServerTest.JSON_PROPERTY_TYPE,
  UpdateFtpServerTest.JSON_PROPERTY_LINKS,
  UpdateFtpServerTest.JSON_PROPERTY_LABELS,
  UpdateFtpServerTest.JSON_PROPERTY_SHARED_WITH_ACCOUNTS,
  UpdateFtpServerTest.JSON_PROPERTY_BANDWIDTH_MEASUREMENTS,
  UpdateFtpServerTest.JSON_PROPERTY_DOWNLOAD_LIMIT,
  UpdateFtpServerTest.JSON_PROPERTY_FTP_TARGET_TIME,
  UpdateFtpServerTest.JSON_PROPERTY_FTP_TIME_LIMIT,
  UpdateFtpServerTest.JSON_PROPERTY_MTU_MEASUREMENTS,
  UpdateFtpServerTest.JSON_PROPERTY_NETWORK_MEASUREMENTS,
  UpdateFtpServerTest.JSON_PROPERTY_NUM_PATH_TRACES,
  UpdateFtpServerTest.JSON_PROPERTY_PASSWORD,
  UpdateFtpServerTest.JSON_PROPERTY_PATH_TRACE_MODE,
  UpdateFtpServerTest.JSON_PROPERTY_PROBE_MODE,
  UpdateFtpServerTest.JSON_PROPERTY_PROTOCOL,
  UpdateFtpServerTest.JSON_PROPERTY_REQUEST_TYPE,
  UpdateFtpServerTest.JSON_PROPERTY_URL,
  UpdateFtpServerTest.JSON_PROPERTY_USE_ACTIVE_FTP,
  UpdateFtpServerTest.JSON_PROPERTY_USE_EXPLICIT_FTPS,
  UpdateFtpServerTest.JSON_PROPERTY_USERNAME,
  UpdateFtpServerTest.JSON_PROPERTY_FIXED_PACKET_RATE,
  UpdateFtpServerTest.JSON_PROPERTY_IPV6_POLICY,
  UpdateFtpServerTest.JSON_PROPERTY_AGENTS,
  UpdateFtpServerTest.JSON_PROPERTY_BGP_MEASUREMENTS,
  UpdateFtpServerTest.JSON_PROPERTY_USE_PUBLIC_BGP,
  UpdateFtpServerTest.JSON_PROPERTY_MONITORS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T10:36:00.628181+01:00[Europe/London]")
public class UpdateFtpServerTest {
  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private TestInterval interval;

  public static final String JSON_PROPERTY_ALERTS_ENABLED = "alertsEnabled";
  private Boolean alertsEnabled;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled = true;

  public static final String JSON_PROPERTY_ALERT_RULES = "alertRules";
  private List<String> alertRules;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private String createdBy;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private OffsetDateTime createdDate;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LIVE_SHARE = "liveShare";
  private Boolean liveShare;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modifiedBy";
  private String modifiedBy;

  public static final String JSON_PROPERTY_MODIFIED_DATE = "modifiedDate";
  private OffsetDateTime modifiedDate;

  public static final String JSON_PROPERTY_SAVED_EVENT = "savedEvent";
  private Boolean savedEvent;

  public static final String JSON_PROPERTY_TEST_ID = "testId";
  private String testId;

  public static final String JSON_PROPERTY_TEST_NAME = "testName";
  private String testName;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private UnexpandedInstantTestLinks links;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private List<String> labels;

  public static final String JSON_PROPERTY_SHARED_WITH_ACCOUNTS = "sharedWithAccounts";
  private List<String> sharedWithAccounts;

  public static final String JSON_PROPERTY_BANDWIDTH_MEASUREMENTS = "bandwidthMeasurements";
  private Boolean bandwidthMeasurements;

  public static final String JSON_PROPERTY_DOWNLOAD_LIMIT = "downloadLimit";
  private Integer downloadLimit;

  public static final String JSON_PROPERTY_FTP_TARGET_TIME = "ftpTargetTime";
  private Integer ftpTargetTime;

  public static final String JSON_PROPERTY_FTP_TIME_LIMIT = "ftpTimeLimit";
  private Integer ftpTimeLimit = 10;

  public static final String JSON_PROPERTY_MTU_MEASUREMENTS = "mtuMeasurements";
  private Boolean mtuMeasurements;

  public static final String JSON_PROPERTY_NETWORK_MEASUREMENTS = "networkMeasurements";
  private Boolean networkMeasurements = true;

  public static final String JSON_PROPERTY_NUM_PATH_TRACES = "numPathTraces";
  private Integer numPathTraces = 3;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_PATH_TRACE_MODE = "pathTraceMode";
  private TestPathTraceMode pathTraceMode = TestPathTraceMode.CLASSIC;

  public static final String JSON_PROPERTY_PROBE_MODE = "probeMode";
  private TestProbeMode probeMode = TestProbeMode.AUTO;

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private TestProtocol protocol = TestProtocol.TCP;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "requestType";
  private FtpServerRequestType requestType;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_USE_ACTIVE_FTP = "useActiveFtp";
  private Boolean useActiveFtp = false;

  public static final String JSON_PROPERTY_USE_EXPLICIT_FTPS = "useExplicitFtps";
  private Boolean useExplicitFtps;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_FIXED_PACKET_RATE = "fixedPacketRate";
  private Integer fixedPacketRate;

  public static final String JSON_PROPERTY_IPV6_POLICY = "ipv6Policy";
  private TestIpv6Policy ipv6Policy = TestIpv6Policy.USE_AGENT_POLICY;

  public static final String JSON_PROPERTY_AGENTS = "agents";
  private List<TestRequestAllOfAgents> agents;

  public static final String JSON_PROPERTY_BGP_MEASUREMENTS = "bgpMeasurements";
  private Boolean bgpMeasurements = true;

  public static final String JSON_PROPERTY_USE_PUBLIC_BGP = "usePublicBgp";
  private Boolean usePublicBgp = true;

  public static final String JSON_PROPERTY_MONITORS = "monitors";
  private List<String> monitors;

  public UpdateFtpServerTest() { 
  }

  @JsonCreator
  public UpdateFtpServerTest(
    @JsonProperty(JSON_PROPERTY_CREATED_BY) String createdBy, 
    @JsonProperty(JSON_PROPERTY_CREATED_DATE) OffsetDateTime createdDate, 
    @JsonProperty(JSON_PROPERTY_LIVE_SHARE) Boolean liveShare, 
    @JsonProperty(JSON_PROPERTY_MODIFIED_BY) String modifiedBy, 
    @JsonProperty(JSON_PROPERTY_MODIFIED_DATE) OffsetDateTime modifiedDate, 
    @JsonProperty(JSON_PROPERTY_SAVED_EVENT) Boolean savedEvent, 
    @JsonProperty(JSON_PROPERTY_TEST_ID) String testId, 
    @JsonProperty(JSON_PROPERTY_TYPE) String type
  ) {
  this();
    this.createdBy = createdBy;
    this.createdDate = createdDate;
    this.liveShare = liveShare;
    this.modifiedBy = modifiedBy;
    this.modifiedDate = modifiedDate;
    this.savedEvent = savedEvent;
    this.testId = testId;
    this.type = type;
  }

  public UpdateFtpServerTest interval(TestInterval interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TestInterval getInterval() {
    return interval;
  }


  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInterval(TestInterval interval) {
    this.interval = interval;
  }


  public UpdateFtpServerTest alertsEnabled(Boolean alertsEnabled) {
    this.alertsEnabled = alertsEnabled;
    return this;
  }

   /**
   * Indicates if alerts are enabled.
   * @return alertsEnabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERTS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAlertsEnabled() {
    return alertsEnabled;
  }


  @JsonProperty(JSON_PROPERTY_ALERTS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlertsEnabled(Boolean alertsEnabled) {
    this.alertsEnabled = alertsEnabled;
  }


  public UpdateFtpServerTest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Test is enabled.
   * @return enabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public UpdateFtpServerTest alertRules(List<String> alertRules) {
    this.alertRules = alertRules;
    return this;
  }

  public UpdateFtpServerTest addAlertRulesItem(String alertRulesItem) {
    if (this.alertRules == null) {
      this.alertRules = new ArrayList<>();
    }
    this.alertRules.add(alertRulesItem);
    return this;
  }

   /**
   * List of alert rules IDs to apply to the test (get &#x60;ruleId&#x60; from &#x60;/alerts/rules&#x60; endpoint. If &#x60;alertsEnabled&#x60; is set to &#x60;true&#x60; and &#x60;alertRules&#x60; is not included on test creation or update, applicable user default alert rules will be used)
   * @return alertRules
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERT_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAlertRules() {
    return alertRules;
  }


  @JsonProperty(JSON_PROPERTY_ALERT_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlertRules(List<String> alertRules) {
    this.alertRules = alertRules;
  }


   /**
   * User that created the test.
   * @return createdBy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedBy() {
    return createdBy;
  }




   /**
   * UTC created date (ISO date-time format).
   * @return createdDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }




  public UpdateFtpServerTest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the test.
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


   /**
   * Indicates if the test is shared with the account group.
   * @return liveShare
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIVE_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLiveShare() {
    return liveShare;
  }




   /**
   * User that modified the test.
   * @return modifiedBy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModifiedBy() {
    return modifiedBy;
  }




   /**
   * UTC last modification date (ISO date-time format).
   * @return modifiedDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }




   /**
   * Indicates if the test is a saved event.
   * @return savedEvent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SAVED_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSavedEvent() {
    return savedEvent;
  }




   /**
   * Each test is assigned an unique ID; this is used to access test information and results from other endpoints.
   * @return testId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTestId() {
    return testId;
  }




  public UpdateFtpServerTest testName(String testName) {
    this.testName = testName;
    return this;
  }

   /**
   * The name of the test. Test name must be unique.
   * @return testName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTestName() {
    return testName;
  }


  @JsonProperty(JSON_PROPERTY_TEST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestName(String testName) {
    this.testName = testName;
  }


   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }




  public UpdateFtpServerTest links(UnexpandedInstantTestLinks links) {
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

  public UnexpandedInstantTestLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(UnexpandedInstantTestLinks links) {
    this.links = links;
  }


  public UpdateFtpServerTest labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public UpdateFtpServerTest addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Contains list of test label IDs (get &#x60;labelId&#x60; from &#x60;/labels&#x60; endpoint)
   * @return labels
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getLabels() {
    return labels;
  }


  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabels(List<String> labels) {
    this.labels = labels;
  }


  public UpdateFtpServerTest sharedWithAccounts(List<String> sharedWithAccounts) {
    this.sharedWithAccounts = sharedWithAccounts;
    return this;
  }

  public UpdateFtpServerTest addSharedWithAccountsItem(String sharedWithAccountsItem) {
    if (this.sharedWithAccounts == null) {
      this.sharedWithAccounts = new ArrayList<>();
    }
    this.sharedWithAccounts.add(sharedWithAccountsItem);
    return this;
  }

   /**
   * Contains list of account group IDs. Test is shared with the listed account groups (get &#x60;aid&#x60; from &#x60;/account-groups&#x60; endpoint)
   * @return sharedWithAccounts
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHARED_WITH_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSharedWithAccounts() {
    return sharedWithAccounts;
  }


  @JsonProperty(JSON_PROPERTY_SHARED_WITH_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharedWithAccounts(List<String> sharedWithAccounts) {
    this.sharedWithAccounts = sharedWithAccounts;
  }


  public UpdateFtpServerTest bandwidthMeasurements(Boolean bandwidthMeasurements) {
    this.bandwidthMeasurements = bandwidthMeasurements;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; to enable bandwidth measurements, only applies to Enterprise agents assigned to the test.
   * @return bandwidthMeasurements
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BANDWIDTH_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBandwidthMeasurements() {
    return bandwidthMeasurements;
  }


  @JsonProperty(JSON_PROPERTY_BANDWIDTH_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBandwidthMeasurements(Boolean bandwidthMeasurements) {
    this.bandwidthMeasurements = bandwidthMeasurements;
  }


  public UpdateFtpServerTest downloadLimit(Integer downloadLimit) {
    this.downloadLimit = downloadLimit;
    return this;
  }

   /**
   * Specify maximum number of bytes to download from the target object.
   * @return downloadLimit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOWNLOAD_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDownloadLimit() {
    return downloadLimit;
  }


  @JsonProperty(JSON_PROPERTY_DOWNLOAD_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDownloadLimit(Integer downloadLimit) {
    this.downloadLimit = downloadLimit;
  }


  public UpdateFtpServerTest ftpTargetTime(Integer ftpTargetTime) {
    this.ftpTargetTime = ftpTargetTime;
    return this;
  }

   /**
   * Target time for operation completion; specified in milliseconds.
   * minimum: 1000
   * maximum: 6000
   * @return ftpTargetTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FTP_TARGET_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFtpTargetTime() {
    return ftpTargetTime;
  }


  @JsonProperty(JSON_PROPERTY_FTP_TARGET_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFtpTargetTime(Integer ftpTargetTime) {
    this.ftpTargetTime = ftpTargetTime;
  }


  public UpdateFtpServerTest ftpTimeLimit(Integer ftpTimeLimit) {
    this.ftpTimeLimit = ftpTimeLimit;
    return this;
  }

   /**
   * Set the time limit for the test in seconds.
   * minimum: 10
   * maximum: 60
   * @return ftpTimeLimit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FTP_TIME_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFtpTimeLimit() {
    return ftpTimeLimit;
  }


  @JsonProperty(JSON_PROPERTY_FTP_TIME_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFtpTimeLimit(Integer ftpTimeLimit) {
    this.ftpTimeLimit = ftpTimeLimit;
  }


  public UpdateFtpServerTest mtuMeasurements(Boolean mtuMeasurements) {
    this.mtuMeasurements = mtuMeasurements;
    return this;
  }

   /**
   * Set &#x60;true&#x60; to measure MTU sizes on network from agents to the target.
   * @return mtuMeasurements
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MTU_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMtuMeasurements() {
    return mtuMeasurements;
  }


  @JsonProperty(JSON_PROPERTY_MTU_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMtuMeasurements(Boolean mtuMeasurements) {
    this.mtuMeasurements = mtuMeasurements;
  }


  public UpdateFtpServerTest networkMeasurements(Boolean networkMeasurements) {
    this.networkMeasurements = networkMeasurements;
    return this;
  }

   /**
   * Enable or disable network measurements. Set to true to enable or false to disable network measurements.
   * @return networkMeasurements
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNetworkMeasurements() {
    return networkMeasurements;
  }


  @JsonProperty(JSON_PROPERTY_NETWORK_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetworkMeasurements(Boolean networkMeasurements) {
    this.networkMeasurements = networkMeasurements;
  }


  public UpdateFtpServerTest numPathTraces(Integer numPathTraces) {
    this.numPathTraces = numPathTraces;
    return this;
  }

   /**
   * Number of path traces executed by the agent.
   * minimum: 1
   * maximum: 10
   * @return numPathTraces
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUM_PATH_TRACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumPathTraces() {
    return numPathTraces;
  }


  @JsonProperty(JSON_PROPERTY_NUM_PATH_TRACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumPathTraces(Integer numPathTraces) {
    this.numPathTraces = numPathTraces;
  }


  public UpdateFtpServerTest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password for Basic/NTLM authentication.
   * @return password
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPassword(String password) {
    this.password = password;
  }


  public UpdateFtpServerTest pathTraceMode(TestPathTraceMode pathTraceMode) {
    this.pathTraceMode = pathTraceMode;
    return this;
  }

   /**
   * Get pathTraceMode
   * @return pathTraceMode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATH_TRACE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestPathTraceMode getPathTraceMode() {
    return pathTraceMode;
  }


  @JsonProperty(JSON_PROPERTY_PATH_TRACE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPathTraceMode(TestPathTraceMode pathTraceMode) {
    this.pathTraceMode = pathTraceMode;
  }


  public UpdateFtpServerTest probeMode(TestProbeMode probeMode) {
    this.probeMode = probeMode;
    return this;
  }

   /**
   * Get probeMode
   * @return probeMode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROBE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestProbeMode getProbeMode() {
    return probeMode;
  }


  @JsonProperty(JSON_PROPERTY_PROBE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProbeMode(TestProbeMode probeMode) {
    this.probeMode = probeMode;
  }


  public UpdateFtpServerTest protocol(TestProtocol protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestProtocol getProtocol() {
    return protocol;
  }


  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProtocol(TestProtocol protocol) {
    this.protocol = protocol;
  }


  public UpdateFtpServerTest requestType(FtpServerRequestType requestType) {
    this.requestType = requestType;
    return this;
  }

   /**
   * Get requestType
   * @return requestType
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FtpServerRequestType getRequestType() {
    return requestType;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRequestType(FtpServerRequestType requestType) {
    this.requestType = requestType;
  }


  public UpdateFtpServerTest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Target for the test.
   * @return url
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(String url) {
    this.url = url;
  }


  public UpdateFtpServerTest useActiveFtp(Boolean useActiveFtp) {
    this.useActiveFtp = useActiveFtp;
    return this;
  }

   /**
   * Explicitly set the flag to use active FTP.
   * @return useActiveFtp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USE_ACTIVE_FTP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUseActiveFtp() {
    return useActiveFtp;
  }


  @JsonProperty(JSON_PROPERTY_USE_ACTIVE_FTP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseActiveFtp(Boolean useActiveFtp) {
    this.useActiveFtp = useActiveFtp;
  }


  public UpdateFtpServerTest useExplicitFtps(Boolean useExplicitFtps) {
    this.useExplicitFtps = useExplicitFtps;
    return this;
  }

   /**
   * Use explicit FTPS (ftp over SSL). By default, tests will autodetect when it is appropriate to use FTPS.
   * @return useExplicitFtps
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USE_EXPLICIT_FTPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUseExplicitFtps() {
    return useExplicitFtps;
  }


  @JsonProperty(JSON_PROPERTY_USE_EXPLICIT_FTPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseExplicitFtps(Boolean useExplicitFtps) {
    this.useExplicitFtps = useExplicitFtps;
  }


  public UpdateFtpServerTest username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Username for Basic/NTLM authentication.
   * @return username
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUsername(String username) {
    this.username = username;
  }


  public UpdateFtpServerTest fixedPacketRate(Integer fixedPacketRate) {
    this.fixedPacketRate = fixedPacketRate;
    return this;
  }

   /**
   * Sets packets rate sent to measure the network in packets per second.
   * minimum: 0
   * maximum: 100
   * @return fixedPacketRate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIXED_PACKET_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFixedPacketRate() {
    return fixedPacketRate;
  }


  @JsonProperty(JSON_PROPERTY_FIXED_PACKET_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFixedPacketRate(Integer fixedPacketRate) {
    this.fixedPacketRate = fixedPacketRate;
  }


  public UpdateFtpServerTest ipv6Policy(TestIpv6Policy ipv6Policy) {
    this.ipv6Policy = ipv6Policy;
    return this;
  }

   /**
   * Get ipv6Policy
   * @return ipv6Policy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IPV6_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestIpv6Policy getIpv6Policy() {
    return ipv6Policy;
  }


  @JsonProperty(JSON_PROPERTY_IPV6_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpv6Policy(TestIpv6Policy ipv6Policy) {
    this.ipv6Policy = ipv6Policy;
  }


  public UpdateFtpServerTest agents(List<TestRequestAllOfAgents> agents) {
    this.agents = agents;
    return this;
  }

  public UpdateFtpServerTest addAgentsItem(TestRequestAllOfAgents agentsItem) {
    if (this.agents == null) {
      this.agents = new ArrayList<>();
    }
    this.agents.add(agentsItem);
    return this;
  }

   /**
   * Contains list of object with required &#x60;agentId&#x60; and optional &#x60;sourceIpAddress&#x60;
   * @return agents
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TestRequestAllOfAgents> getAgents() {
    return agents;
  }


  @JsonProperty(JSON_PROPERTY_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgents(List<TestRequestAllOfAgents> agents) {
    this.agents = agents;
  }


  public UpdateFtpServerTest bgpMeasurements(Boolean bgpMeasurements) {
    this.bgpMeasurements = bgpMeasurements;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; to enable bgp measurements.
   * @return bgpMeasurements
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BGP_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBgpMeasurements() {
    return bgpMeasurements;
  }


  @JsonProperty(JSON_PROPERTY_BGP_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBgpMeasurements(Boolean bgpMeasurements) {
    this.bgpMeasurements = bgpMeasurements;
  }


  public UpdateFtpServerTest usePublicBgp(Boolean usePublicBgp) {
    this.usePublicBgp = usePublicBgp;
    return this;
  }

   /**
   * Indicate if all available public BGP monitors should be used, when ommited defaults to &#x60;bgpMeasurements&#x60; value.
   * @return usePublicBgp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USE_PUBLIC_BGP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUsePublicBgp() {
    return usePublicBgp;
  }


  @JsonProperty(JSON_PROPERTY_USE_PUBLIC_BGP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsePublicBgp(Boolean usePublicBgp) {
    this.usePublicBgp = usePublicBgp;
  }


  public UpdateFtpServerTest monitors(List<String> monitors) {
    this.monitors = monitors;
    return this;
  }

  public UpdateFtpServerTest addMonitorsItem(String monitorsItem) {
    if (this.monitors == null) {
      this.monitors = new ArrayList<>();
    }
    this.monitors.add(monitorsItem);
    return this;
  }

   /**
   * Contains list of BGP monitor IDs (get &#x60;monitorId&#x60; from &#x60;/monitors&#x60; endpoint)
   * @return monitors
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getMonitors() {
    return monitors;
  }


  @JsonProperty(JSON_PROPERTY_MONITORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonitors(List<String> monitors) {
    this.monitors = monitors;
  }


  /**
   * Return true if this UpdateFtpServerTest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFtpServerTest updateFtpServerTest = (UpdateFtpServerTest) o;
    return Objects.equals(this.interval, updateFtpServerTest.interval) &&
        Objects.equals(this.alertsEnabled, updateFtpServerTest.alertsEnabled) &&
        Objects.equals(this.enabled, updateFtpServerTest.enabled) &&
        Objects.equals(this.alertRules, updateFtpServerTest.alertRules) &&
        Objects.equals(this.createdBy, updateFtpServerTest.createdBy) &&
        Objects.equals(this.createdDate, updateFtpServerTest.createdDate) &&
        Objects.equals(this.description, updateFtpServerTest.description) &&
        Objects.equals(this.liveShare, updateFtpServerTest.liveShare) &&
        Objects.equals(this.modifiedBy, updateFtpServerTest.modifiedBy) &&
        Objects.equals(this.modifiedDate, updateFtpServerTest.modifiedDate) &&
        Objects.equals(this.savedEvent, updateFtpServerTest.savedEvent) &&
        Objects.equals(this.testId, updateFtpServerTest.testId) &&
        Objects.equals(this.testName, updateFtpServerTest.testName) &&
        Objects.equals(this.type, updateFtpServerTest.type) &&
        Objects.equals(this.links, updateFtpServerTest.links) &&
        Objects.equals(this.labels, updateFtpServerTest.labels) &&
        Objects.equals(this.sharedWithAccounts, updateFtpServerTest.sharedWithAccounts) &&
        Objects.equals(this.bandwidthMeasurements, updateFtpServerTest.bandwidthMeasurements) &&
        Objects.equals(this.downloadLimit, updateFtpServerTest.downloadLimit) &&
        Objects.equals(this.ftpTargetTime, updateFtpServerTest.ftpTargetTime) &&
        Objects.equals(this.ftpTimeLimit, updateFtpServerTest.ftpTimeLimit) &&
        Objects.equals(this.mtuMeasurements, updateFtpServerTest.mtuMeasurements) &&
        Objects.equals(this.networkMeasurements, updateFtpServerTest.networkMeasurements) &&
        Objects.equals(this.numPathTraces, updateFtpServerTest.numPathTraces) &&
        Objects.equals(this.password, updateFtpServerTest.password) &&
        Objects.equals(this.pathTraceMode, updateFtpServerTest.pathTraceMode) &&
        Objects.equals(this.probeMode, updateFtpServerTest.probeMode) &&
        Objects.equals(this.protocol, updateFtpServerTest.protocol) &&
        Objects.equals(this.requestType, updateFtpServerTest.requestType) &&
        Objects.equals(this.url, updateFtpServerTest.url) &&
        Objects.equals(this.useActiveFtp, updateFtpServerTest.useActiveFtp) &&
        Objects.equals(this.useExplicitFtps, updateFtpServerTest.useExplicitFtps) &&
        Objects.equals(this.username, updateFtpServerTest.username) &&
        Objects.equals(this.fixedPacketRate, updateFtpServerTest.fixedPacketRate) &&
        Objects.equals(this.ipv6Policy, updateFtpServerTest.ipv6Policy) &&
        Objects.equals(this.agents, updateFtpServerTest.agents) &&
        Objects.equals(this.bgpMeasurements, updateFtpServerTest.bgpMeasurements) &&
        Objects.equals(this.usePublicBgp, updateFtpServerTest.usePublicBgp) &&
        Objects.equals(this.monitors, updateFtpServerTest.monitors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, alertsEnabled, enabled, alertRules, createdBy, createdDate, description, liveShare, modifiedBy, modifiedDate, savedEvent, testId, testName, type, links, labels, sharedWithAccounts, bandwidthMeasurements, downloadLimit, ftpTargetTime, ftpTimeLimit, mtuMeasurements, networkMeasurements, numPathTraces, password, pathTraceMode, probeMode, protocol, requestType, url, useActiveFtp, useExplicitFtps, username, fixedPacketRate, ipv6Policy, agents, bgpMeasurements, usePublicBgp, monitors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateFtpServerTest {\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    alertsEnabled: ").append(toIndentedString(alertsEnabled)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    alertRules: ").append(toIndentedString(alertRules)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    liveShare: ").append(toIndentedString(liveShare)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    savedEvent: ").append(toIndentedString(savedEvent)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    sharedWithAccounts: ").append(toIndentedString(sharedWithAccounts)).append("\n");
    sb.append("    bandwidthMeasurements: ").append(toIndentedString(bandwidthMeasurements)).append("\n");
    sb.append("    downloadLimit: ").append(toIndentedString(downloadLimit)).append("\n");
    sb.append("    ftpTargetTime: ").append(toIndentedString(ftpTargetTime)).append("\n");
    sb.append("    ftpTimeLimit: ").append(toIndentedString(ftpTimeLimit)).append("\n");
    sb.append("    mtuMeasurements: ").append(toIndentedString(mtuMeasurements)).append("\n");
    sb.append("    networkMeasurements: ").append(toIndentedString(networkMeasurements)).append("\n");
    sb.append("    numPathTraces: ").append(toIndentedString(numPathTraces)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    pathTraceMode: ").append(toIndentedString(pathTraceMode)).append("\n");
    sb.append("    probeMode: ").append(toIndentedString(probeMode)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    useActiveFtp: ").append(toIndentedString(useActiveFtp)).append("\n");
    sb.append("    useExplicitFtps: ").append(toIndentedString(useExplicitFtps)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    fixedPacketRate: ").append(toIndentedString(fixedPacketRate)).append("\n");
    sb.append("    ipv6Policy: ").append(toIndentedString(ipv6Policy)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    bgpMeasurements: ").append(toIndentedString(bgpMeasurements)).append("\n");
    sb.append("    usePublicBgp: ").append(toIndentedString(usePublicBgp)).append("\n");
    sb.append("    monitors: ").append(toIndentedString(monitors)).append("\n");
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

