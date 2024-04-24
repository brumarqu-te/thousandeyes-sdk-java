/*
 * Instant Tests API
 * The Instant Tests API endpoint lets you create and run new instant tests. You will need to be a regular user or have the following permissions:   * `API Access`   * `View tests`  The response does not include the immediate test results. Use the Test Results endpoints to get test results after creating and executing an instant test. You can find the URLs for these endpoints in the _links section of the test definition that is returned when you create the instant test. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.tests.instant.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.tests.instant.model.TestAuthType;
import com.thousandeyes.api.tests.instant.model.TestCustomHeaders;
import com.thousandeyes.api.tests.instant.model.TestPageLoadingStrategy;
import com.thousandeyes.api.tests.instant.model.TestPathTraceMode;
import com.thousandeyes.api.tests.instant.model.TestProbeMode;
import com.thousandeyes.api.tests.instant.model.TestProtocol;
import com.thousandeyes.api.tests.instant.model.TestSslVersionId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PageLoadProperties
 */
@JsonPropertyOrder({
  PageLoadProperties.JSON_PROPERTY_AUTH_TYPE,
  PageLoadProperties.JSON_PROPERTY_BANDWIDTH_MEASUREMENTS,
  PageLoadProperties.JSON_PROPERTY_CLIENT_CERTIFICATE,
  PageLoadProperties.JSON_PROPERTY_CONTENT_REGEX,
  PageLoadProperties.JSON_PROPERTY_CUSTOM_HEADERS,
  PageLoadProperties.JSON_PROPERTY_DESIRED_STATUS_CODE,
  PageLoadProperties.JSON_PROPERTY_FOLLOW_REDIRECTS,
  PageLoadProperties.JSON_PROPERTY_HTTP_TARGET_TIME,
  PageLoadProperties.JSON_PROPERTY_HTTP_TIME_LIMIT,
  PageLoadProperties.JSON_PROPERTY_HTTP_VERSION,
  PageLoadProperties.JSON_PROPERTY_INCLUDE_HEADERS,
  PageLoadProperties.JSON_PROPERTY_MTU_MEASUREMENTS,
  PageLoadProperties.JSON_PROPERTY_NETWORK_MEASUREMENTS,
  PageLoadProperties.JSON_PROPERTY_NUM_PATH_TRACES,
  PageLoadProperties.JSON_PROPERTY_PAGE_LOAD_TARGET_TIME,
  PageLoadProperties.JSON_PROPERTY_PAGE_LOAD_TIME_LIMIT,
  PageLoadProperties.JSON_PROPERTY_PASSWORD,
  PageLoadProperties.JSON_PROPERTY_PATH_TRACE_MODE,
  PageLoadProperties.JSON_PROPERTY_PROBE_MODE,
  PageLoadProperties.JSON_PROPERTY_PROTOCOL,
  PageLoadProperties.JSON_PROPERTY_SSL_VERSION,
  PageLoadProperties.JSON_PROPERTY_SSL_VERSION_ID,
  PageLoadProperties.JSON_PROPERTY_URL,
  PageLoadProperties.JSON_PROPERTY_USE_NTLM,
  PageLoadProperties.JSON_PROPERTY_USER_AGENT,
  PageLoadProperties.JSON_PROPERTY_USERNAME,
  PageLoadProperties.JSON_PROPERTY_VERIFY_CERTIFICATE,
  PageLoadProperties.JSON_PROPERTY_ALLOW_UNSAFE_LEGACY_RENEGOTIATION,
  PageLoadProperties.JSON_PROPERTY_BLOCK_DOMAINS,
  PageLoadProperties.JSON_PROPERTY_DISABLE_SCREENSHOT,
  PageLoadProperties.JSON_PROPERTY_ALLOW_MIC_AND_CAMERA,
  PageLoadProperties.JSON_PROPERTY_ALLOW_GEOLOCATION,
  PageLoadProperties.JSON_PROPERTY_BROWSER_LANGUAGE,
  PageLoadProperties.JSON_PROPERTY_PAGE_LOADING_STRATEGY,
  PageLoadProperties.JSON_PROPERTY_FIXED_PACKET_RATE,
  PageLoadProperties.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T10:36:00.321258+01:00[Europe/London]")
public class PageLoadProperties {
  public static final String JSON_PROPERTY_AUTH_TYPE = "authType";
  private TestAuthType authType = TestAuthType.NONE;

  public static final String JSON_PROPERTY_BANDWIDTH_MEASUREMENTS = "bandwidthMeasurements";
  private Boolean bandwidthMeasurements;

  public static final String JSON_PROPERTY_CLIENT_CERTIFICATE = "clientCertificate";
  private String clientCertificate;

  public static final String JSON_PROPERTY_CONTENT_REGEX = "contentRegex";
  private String contentRegex;

  public static final String JSON_PROPERTY_CUSTOM_HEADERS = "customHeaders";
  private TestCustomHeaders customHeaders;

  public static final String JSON_PROPERTY_DESIRED_STATUS_CODE = "desiredStatusCode";
  private String desiredStatusCode = "200";

  public static final String JSON_PROPERTY_FOLLOW_REDIRECTS = "followRedirects";
  private Boolean followRedirects = true;

  public static final String JSON_PROPERTY_HTTP_TARGET_TIME = "httpTargetTime";
  private Integer httpTargetTime;

  public static final String JSON_PROPERTY_HTTP_TIME_LIMIT = "httpTimeLimit";
  private Integer httpTimeLimit = 5;

  public static final String JSON_PROPERTY_HTTP_VERSION = "httpVersion";
  private Integer httpVersion = 2;

  public static final String JSON_PROPERTY_INCLUDE_HEADERS = "includeHeaders";
  private Boolean includeHeaders = true;

  public static final String JSON_PROPERTY_MTU_MEASUREMENTS = "mtuMeasurements";
  private Boolean mtuMeasurements;

  public static final String JSON_PROPERTY_NETWORK_MEASUREMENTS = "networkMeasurements";
  private Boolean networkMeasurements = true;

  public static final String JSON_PROPERTY_NUM_PATH_TRACES = "numPathTraces";
  private Integer numPathTraces = 3;

  public static final String JSON_PROPERTY_PAGE_LOAD_TARGET_TIME = "pageLoadTargetTime";
  private Integer pageLoadTargetTime;

  public static final String JSON_PROPERTY_PAGE_LOAD_TIME_LIMIT = "pageLoadTimeLimit";
  private Integer pageLoadTimeLimit = 10;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_PATH_TRACE_MODE = "pathTraceMode";
  private TestPathTraceMode pathTraceMode = TestPathTraceMode.CLASSIC;

  public static final String JSON_PROPERTY_PROBE_MODE = "probeMode";
  private TestProbeMode probeMode = TestProbeMode.AUTO;

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private TestProtocol protocol = TestProtocol.TCP;

  public static final String JSON_PROPERTY_SSL_VERSION = "sslVersion";
  private String sslVersion;

  public static final String JSON_PROPERTY_SSL_VERSION_ID = "sslVersionId";
  private TestSslVersionId sslVersionId;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_USE_NTLM = "useNtlm";
  private Boolean useNtlm;

  public static final String JSON_PROPERTY_USER_AGENT = "userAgent";
  private String userAgent;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_VERIFY_CERTIFICATE = "verifyCertificate";
  private Boolean verifyCertificate = false;

  public static final String JSON_PROPERTY_ALLOW_UNSAFE_LEGACY_RENEGOTIATION = "allowUnsafeLegacyRenegotiation";
  private Boolean allowUnsafeLegacyRenegotiation = true;

  public static final String JSON_PROPERTY_BLOCK_DOMAINS = "blockDomains";
  private String blockDomains;

  public static final String JSON_PROPERTY_DISABLE_SCREENSHOT = "disableScreenshot";
  private Boolean disableScreenshot = false;

  public static final String JSON_PROPERTY_ALLOW_MIC_AND_CAMERA = "allowMicAndCamera";
  private Boolean allowMicAndCamera = false;

  public static final String JSON_PROPERTY_ALLOW_GEOLOCATION = "allowGeolocation";
  private Boolean allowGeolocation = false;

  public static final String JSON_PROPERTY_BROWSER_LANGUAGE = "browserLanguage";
  private String browserLanguage;

  public static final String JSON_PROPERTY_PAGE_LOADING_STRATEGY = "pageLoadingStrategy";
  private TestPageLoadingStrategy pageLoadingStrategy = TestPageLoadingStrategy.NORMAL;

  public static final String JSON_PROPERTY_FIXED_PACKET_RATE = "fixedPacketRate";
  private Integer fixedPacketRate;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public PageLoadProperties() { 
  }

  @JsonCreator
  public PageLoadProperties(
    @JsonProperty(JSON_PROPERTY_SSL_VERSION) String sslVersion, 
    @JsonProperty(JSON_PROPERTY_TYPE) String type
  ) {
  this();
    this.sslVersion = sslVersion;
    this.type = type;
  }

  public PageLoadProperties authType(TestAuthType authType) {
    this.authType = authType;
    return this;
  }

   /**
   * Get authType
   * @return authType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestAuthType getAuthType() {
    return authType;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthType(TestAuthType authType) {
    this.authType = authType;
  }


  public PageLoadProperties bandwidthMeasurements(Boolean bandwidthMeasurements) {
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


  public PageLoadProperties clientCertificate(String clientCertificate) {
    this.clientCertificate = clientCertificate;
    return this;
  }

   /**
   * String representation (containing newline characters) of client certificate, the private key must be placed first, then the certificate.
   * @return clientCertificate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientCertificate() {
    return clientCertificate;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientCertificate(String clientCertificate) {
    this.clientCertificate = clientCertificate;
  }


  public PageLoadProperties contentRegex(String contentRegex) {
    this.contentRegex = contentRegex;
    return this;
  }

   /**
   * Verify content using a regular expression. This field does not require escaping.
   * @return contentRegex
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT_REGEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContentRegex() {
    return contentRegex;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_REGEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentRegex(String contentRegex) {
    this.contentRegex = contentRegex;
  }


  public PageLoadProperties customHeaders(TestCustomHeaders customHeaders) {
    this.customHeaders = customHeaders;
    return this;
  }

   /**
   * Get customHeaders
   * @return customHeaders
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestCustomHeaders getCustomHeaders() {
    return customHeaders;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomHeaders(TestCustomHeaders customHeaders) {
    this.customHeaders = customHeaders;
  }


  public PageLoadProperties desiredStatusCode(String desiredStatusCode) {
    this.desiredStatusCode = desiredStatusCode;
    return this;
  }

   /**
   * Specify the HTTP status code value that indicates a successful response.
   * @return desiredStatusCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESIRED_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDesiredStatusCode() {
    return desiredStatusCode;
  }


  @JsonProperty(JSON_PROPERTY_DESIRED_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDesiredStatusCode(String desiredStatusCode) {
    this.desiredStatusCode = desiredStatusCode;
  }


  public PageLoadProperties followRedirects(Boolean followRedirects) {
    this.followRedirects = followRedirects;
    return this;
  }

   /**
   * To disable following HTTP/301 or HTTP/302 redirect directives, set this parameter to false.
   * @return followRedirects
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FOLLOW_REDIRECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFollowRedirects() {
    return followRedirects;
  }


  @JsonProperty(JSON_PROPERTY_FOLLOW_REDIRECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFollowRedirects(Boolean followRedirects) {
    this.followRedirects = followRedirects;
  }


  public PageLoadProperties httpTargetTime(Integer httpTargetTime) {
    this.httpTargetTime = httpTargetTime;
    return this;
  }

   /**
   * Target time for HTTP server completion, specified in milliseconds.
   * minimum: 100
   * maximum: 5000
   * @return httpTargetTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTTP_TARGET_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHttpTargetTime() {
    return httpTargetTime;
  }


  @JsonProperty(JSON_PROPERTY_HTTP_TARGET_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHttpTargetTime(Integer httpTargetTime) {
    this.httpTargetTime = httpTargetTime;
  }


  public PageLoadProperties httpTimeLimit(Integer httpTimeLimit) {
    this.httpTimeLimit = httpTimeLimit;
    return this;
  }

   /**
   * HTTP time limit in seconds.
   * minimum: 5
   * maximum: 60
   * @return httpTimeLimit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTTP_TIME_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHttpTimeLimit() {
    return httpTimeLimit;
  }


  @JsonProperty(JSON_PROPERTY_HTTP_TIME_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHttpTimeLimit(Integer httpTimeLimit) {
    this.httpTimeLimit = httpTimeLimit;
  }


  public PageLoadProperties httpVersion(Integer httpVersion) {
    this.httpVersion = httpVersion;
    return this;
  }

   /**
   * HTTP protocol version. Set to &#39;2&#39; to prefer HTTP/2, or &#39;1&#39; to use only HTTP/1.1.
   * minimum: 1
   * maximum: 2
   * @return httpVersion
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTTP_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHttpVersion() {
    return httpVersion;
  }


  @JsonProperty(JSON_PROPERTY_HTTP_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHttpVersion(Integer httpVersion) {
    this.httpVersion = httpVersion;
  }


  public PageLoadProperties includeHeaders(Boolean includeHeaders) {
    this.includeHeaders = includeHeaders;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; to capture response headers for objects loaded by the test.
   * @return includeHeaders
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeHeaders() {
    return includeHeaders;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeHeaders(Boolean includeHeaders) {
    this.includeHeaders = includeHeaders;
  }


  public PageLoadProperties mtuMeasurements(Boolean mtuMeasurements) {
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


  public PageLoadProperties networkMeasurements(Boolean networkMeasurements) {
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


  public PageLoadProperties numPathTraces(Integer numPathTraces) {
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


  public PageLoadProperties pageLoadTargetTime(Integer pageLoadTargetTime) {
    this.pageLoadTargetTime = pageLoadTargetTime;
    return this;
  }

   /**
   * Target time for page load completion, specified in seconds and cannot exceed the &#x60;pageLoadTimeLimit&#x60;.
   * minimum: 1
   * maximum: 30
   * @return pageLoadTargetTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_LOAD_TARGET_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageLoadTargetTime() {
    return pageLoadTargetTime;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_LOAD_TARGET_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageLoadTargetTime(Integer pageLoadTargetTime) {
    this.pageLoadTargetTime = pageLoadTargetTime;
  }


  public PageLoadProperties pageLoadTimeLimit(Integer pageLoadTimeLimit) {
    this.pageLoadTimeLimit = pageLoadTimeLimit;
    return this;
  }

   /**
   * Page load time limit. Must be larger than the &#x60;httpTimeLimit&#x60;.
   * minimum: 5
   * maximum: 60
   * @return pageLoadTimeLimit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_LOAD_TIME_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageLoadTimeLimit() {
    return pageLoadTimeLimit;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_LOAD_TIME_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageLoadTimeLimit(Integer pageLoadTimeLimit) {
    this.pageLoadTimeLimit = pageLoadTimeLimit;
  }


  public PageLoadProperties password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password for Basic/NTLM authentication.
   * @return password
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(String password) {
    this.password = password;
  }


  public PageLoadProperties pathTraceMode(TestPathTraceMode pathTraceMode) {
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


  public PageLoadProperties probeMode(TestProbeMode probeMode) {
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


  public PageLoadProperties protocol(TestProtocol protocol) {
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


   /**
   * Reflects the verbose SSL protocol version used by a test.
   * @return sslVersion
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SSL_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSslVersion() {
    return sslVersion;
  }




  public PageLoadProperties sslVersionId(TestSslVersionId sslVersionId) {
    this.sslVersionId = sslVersionId;
    return this;
  }

   /**
   * Get sslVersionId
   * @return sslVersionId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SSL_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestSslVersionId getSslVersionId() {
    return sslVersionId;
  }


  @JsonProperty(JSON_PROPERTY_SSL_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSslVersionId(TestSslVersionId sslVersionId) {
    this.sslVersionId = sslVersionId;
  }


  public PageLoadProperties url(String url) {
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


  public PageLoadProperties useNtlm(Boolean useNtlm) {
    this.useNtlm = useNtlm;
    return this;
  }

   /**
   * Set to true to use NTLM, false to use Basic Authentication. Requires username and password to be set.
   * @return useNtlm
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USE_NTLM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUseNtlm() {
    return useNtlm;
  }


  @JsonProperty(JSON_PROPERTY_USE_NTLM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseNtlm(Boolean useNtlm) {
    this.useNtlm = useNtlm;
  }


  public PageLoadProperties userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

   /**
   * User-agent string to be provided during the test.
   * @return userAgent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserAgent() {
    return userAgent;
  }


  @JsonProperty(JSON_PROPERTY_USER_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }


  public PageLoadProperties username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Username for Basic/NTLM authentication.
   * @return username
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsername(String username) {
    this.username = username;
  }


  public PageLoadProperties verifyCertificate(Boolean verifyCertificate) {
    this.verifyCertificate = verifyCertificate;
    return this;
  }

   /**
   * Ignore or acknowledge certificate errors. Set to false to ignore certificate errors.
   * @return verifyCertificate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERIFY_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVerifyCertificate() {
    return verifyCertificate;
  }


  @JsonProperty(JSON_PROPERTY_VERIFY_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerifyCertificate(Boolean verifyCertificate) {
    this.verifyCertificate = verifyCertificate;
  }


  public PageLoadProperties allowUnsafeLegacyRenegotiation(Boolean allowUnsafeLegacyRenegotiation) {
    this.allowUnsafeLegacyRenegotiation = allowUnsafeLegacyRenegotiation;
    return this;
  }

   /**
   * Allows TLS renegotiation with servers not supporting RFC 5746. Default Set to true to allow unsafe legacy renegotiation.
   * @return allowUnsafeLegacyRenegotiation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_UNSAFE_LEGACY_RENEGOTIATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowUnsafeLegacyRenegotiation() {
    return allowUnsafeLegacyRenegotiation;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_UNSAFE_LEGACY_RENEGOTIATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowUnsafeLegacyRenegotiation(Boolean allowUnsafeLegacyRenegotiation) {
    this.allowUnsafeLegacyRenegotiation = allowUnsafeLegacyRenegotiation;
  }


  public PageLoadProperties blockDomains(String blockDomains) {
    this.blockDomains = blockDomains;
    return this;
  }

   /**
   * Domains or full object URLs to be excluded from metrics and waterfall data for transaction tests.
   * @return blockDomains
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLOCK_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBlockDomains() {
    return blockDomains;
  }


  @JsonProperty(JSON_PROPERTY_BLOCK_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlockDomains(String blockDomains) {
    this.blockDomains = blockDomains;
  }


  public PageLoadProperties disableScreenshot(Boolean disableScreenshot) {
    this.disableScreenshot = disableScreenshot;
    return this;
  }

   /**
   * Enables or disables screenshots on error. Set true to not capture
   * @return disableScreenshot
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISABLE_SCREENSHOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDisableScreenshot() {
    return disableScreenshot;
  }


  @JsonProperty(JSON_PROPERTY_DISABLE_SCREENSHOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisableScreenshot(Boolean disableScreenshot) {
    this.disableScreenshot = disableScreenshot;
  }


  public PageLoadProperties allowMicAndCamera(Boolean allowMicAndCamera) {
    this.allowMicAndCamera = allowMicAndCamera;
    return this;
  }

   /**
   * Set true allow the use of a fake mic and camera in the browser.
   * @return allowMicAndCamera
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_MIC_AND_CAMERA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowMicAndCamera() {
    return allowMicAndCamera;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_MIC_AND_CAMERA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowMicAndCamera(Boolean allowMicAndCamera) {
    this.allowMicAndCamera = allowMicAndCamera;
  }


  public PageLoadProperties allowGeolocation(Boolean allowGeolocation) {
    this.allowGeolocation = allowGeolocation;
    return this;
  }

   /**
   * Set true to use the agent’s geolocation by the web page.
   * @return allowGeolocation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_GEOLOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowGeolocation() {
    return allowGeolocation;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_GEOLOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowGeolocation(Boolean allowGeolocation) {
    this.allowGeolocation = allowGeolocation;
  }


  public PageLoadProperties browserLanguage(String browserLanguage) {
    this.browserLanguage = browserLanguage;
    return this;
  }

   /**
   * Set one of the available browser language that you want to use to configure the browser.
   * @return browserLanguage
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BROWSER_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrowserLanguage() {
    return browserLanguage;
  }


  @JsonProperty(JSON_PROPERTY_BROWSER_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrowserLanguage(String browserLanguage) {
    this.browserLanguage = browserLanguage;
  }


  public PageLoadProperties pageLoadingStrategy(TestPageLoadingStrategy pageLoadingStrategy) {
    this.pageLoadingStrategy = pageLoadingStrategy;
    return this;
  }

   /**
   * Get pageLoadingStrategy
   * @return pageLoadingStrategy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_LOADING_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestPageLoadingStrategy getPageLoadingStrategy() {
    return pageLoadingStrategy;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_LOADING_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageLoadingStrategy(TestPageLoadingStrategy pageLoadingStrategy) {
    this.pageLoadingStrategy = pageLoadingStrategy;
  }


  public PageLoadProperties fixedPacketRate(Integer fixedPacketRate) {
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




  /**
   * Return true if this PageLoadProperties object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageLoadProperties pageLoadProperties = (PageLoadProperties) o;
    return Objects.equals(this.authType, pageLoadProperties.authType) &&
        Objects.equals(this.bandwidthMeasurements, pageLoadProperties.bandwidthMeasurements) &&
        Objects.equals(this.clientCertificate, pageLoadProperties.clientCertificate) &&
        Objects.equals(this.contentRegex, pageLoadProperties.contentRegex) &&
        Objects.equals(this.customHeaders, pageLoadProperties.customHeaders) &&
        Objects.equals(this.desiredStatusCode, pageLoadProperties.desiredStatusCode) &&
        Objects.equals(this.followRedirects, pageLoadProperties.followRedirects) &&
        Objects.equals(this.httpTargetTime, pageLoadProperties.httpTargetTime) &&
        Objects.equals(this.httpTimeLimit, pageLoadProperties.httpTimeLimit) &&
        Objects.equals(this.httpVersion, pageLoadProperties.httpVersion) &&
        Objects.equals(this.includeHeaders, pageLoadProperties.includeHeaders) &&
        Objects.equals(this.mtuMeasurements, pageLoadProperties.mtuMeasurements) &&
        Objects.equals(this.networkMeasurements, pageLoadProperties.networkMeasurements) &&
        Objects.equals(this.numPathTraces, pageLoadProperties.numPathTraces) &&
        Objects.equals(this.pageLoadTargetTime, pageLoadProperties.pageLoadTargetTime) &&
        Objects.equals(this.pageLoadTimeLimit, pageLoadProperties.pageLoadTimeLimit) &&
        Objects.equals(this.password, pageLoadProperties.password) &&
        Objects.equals(this.pathTraceMode, pageLoadProperties.pathTraceMode) &&
        Objects.equals(this.probeMode, pageLoadProperties.probeMode) &&
        Objects.equals(this.protocol, pageLoadProperties.protocol) &&
        Objects.equals(this.sslVersion, pageLoadProperties.sslVersion) &&
        Objects.equals(this.sslVersionId, pageLoadProperties.sslVersionId) &&
        Objects.equals(this.url, pageLoadProperties.url) &&
        Objects.equals(this.useNtlm, pageLoadProperties.useNtlm) &&
        Objects.equals(this.userAgent, pageLoadProperties.userAgent) &&
        Objects.equals(this.username, pageLoadProperties.username) &&
        Objects.equals(this.verifyCertificate, pageLoadProperties.verifyCertificate) &&
        Objects.equals(this.allowUnsafeLegacyRenegotiation, pageLoadProperties.allowUnsafeLegacyRenegotiation) &&
        Objects.equals(this.blockDomains, pageLoadProperties.blockDomains) &&
        Objects.equals(this.disableScreenshot, pageLoadProperties.disableScreenshot) &&
        Objects.equals(this.allowMicAndCamera, pageLoadProperties.allowMicAndCamera) &&
        Objects.equals(this.allowGeolocation, pageLoadProperties.allowGeolocation) &&
        Objects.equals(this.browserLanguage, pageLoadProperties.browserLanguage) &&
        Objects.equals(this.pageLoadingStrategy, pageLoadProperties.pageLoadingStrategy) &&
        Objects.equals(this.fixedPacketRate, pageLoadProperties.fixedPacketRate) &&
        Objects.equals(this.type, pageLoadProperties.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, bandwidthMeasurements, clientCertificate, contentRegex, customHeaders, desiredStatusCode, followRedirects, httpTargetTime, httpTimeLimit, httpVersion, includeHeaders, mtuMeasurements, networkMeasurements, numPathTraces, pageLoadTargetTime, pageLoadTimeLimit, password, pathTraceMode, probeMode, protocol, sslVersion, sslVersionId, url, useNtlm, userAgent, username, verifyCertificate, allowUnsafeLegacyRenegotiation, blockDomains, disableScreenshot, allowMicAndCamera, allowGeolocation, browserLanguage, pageLoadingStrategy, fixedPacketRate, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageLoadProperties {\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    bandwidthMeasurements: ").append(toIndentedString(bandwidthMeasurements)).append("\n");
    sb.append("    clientCertificate: ").append(toIndentedString(clientCertificate)).append("\n");
    sb.append("    contentRegex: ").append(toIndentedString(contentRegex)).append("\n");
    sb.append("    customHeaders: ").append(toIndentedString(customHeaders)).append("\n");
    sb.append("    desiredStatusCode: ").append(toIndentedString(desiredStatusCode)).append("\n");
    sb.append("    followRedirects: ").append(toIndentedString(followRedirects)).append("\n");
    sb.append("    httpTargetTime: ").append(toIndentedString(httpTargetTime)).append("\n");
    sb.append("    httpTimeLimit: ").append(toIndentedString(httpTimeLimit)).append("\n");
    sb.append("    httpVersion: ").append(toIndentedString(httpVersion)).append("\n");
    sb.append("    includeHeaders: ").append(toIndentedString(includeHeaders)).append("\n");
    sb.append("    mtuMeasurements: ").append(toIndentedString(mtuMeasurements)).append("\n");
    sb.append("    networkMeasurements: ").append(toIndentedString(networkMeasurements)).append("\n");
    sb.append("    numPathTraces: ").append(toIndentedString(numPathTraces)).append("\n");
    sb.append("    pageLoadTargetTime: ").append(toIndentedString(pageLoadTargetTime)).append("\n");
    sb.append("    pageLoadTimeLimit: ").append(toIndentedString(pageLoadTimeLimit)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    pathTraceMode: ").append(toIndentedString(pathTraceMode)).append("\n");
    sb.append("    probeMode: ").append(toIndentedString(probeMode)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    sslVersion: ").append(toIndentedString(sslVersion)).append("\n");
    sb.append("    sslVersionId: ").append(toIndentedString(sslVersionId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    useNtlm: ").append(toIndentedString(useNtlm)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    verifyCertificate: ").append(toIndentedString(verifyCertificate)).append("\n");
    sb.append("    allowUnsafeLegacyRenegotiation: ").append(toIndentedString(allowUnsafeLegacyRenegotiation)).append("\n");
    sb.append("    blockDomains: ").append(toIndentedString(blockDomains)).append("\n");
    sb.append("    disableScreenshot: ").append(toIndentedString(disableScreenshot)).append("\n");
    sb.append("    allowMicAndCamera: ").append(toIndentedString(allowMicAndCamera)).append("\n");
    sb.append("    allowGeolocation: ").append(toIndentedString(allowGeolocation)).append("\n");
    sb.append("    browserLanguage: ").append(toIndentedString(browserLanguage)).append("\n");
    sb.append("    pageLoadingStrategy: ").append(toIndentedString(pageLoadingStrategy)).append("\n");
    sb.append("    fixedPacketRate: ").append(toIndentedString(fixedPacketRate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

