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

package com.thousandeyes.api.tests.results;

import static com.thousandeyes.api.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.api.client.RequestUtil.urlEncode;

import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.client.ApiException;
import com.thousandeyes.api.client.ApiResponse;
import com.thousandeyes.api.client.ApiRequest;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.api.tests.results.model.Error;
import com.thousandeyes.api.tests.results.model.GetTestResultsBgp200Response;
import com.thousandeyes.api.tests.results.model.GetTestResultsBgpPrefix200Response;
import java.time.OffsetDateTime;
import com.thousandeyes.api.tests.results.model.UnauthorizedError;
import com.thousandeyes.api.tests.results.model.ValidationError;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-18T12:55:02.084308+01:00[Europe/Lisbon]")
public class NetworkBgpTestMetricsApi {
  private final ApiClient apiClient;

  public NetworkBgpTestMetricsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get BGP test results
   * Returns a list of BGP monitors actively monitoring the destination&#39;s target prefix. This list includes information about the prefix, its associated AS Number, and provides details regarding reachability, path updates, and any changes in the path for the target network. 
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @return GetTestResultsBgp200Response
   * @throws ApiException if fails to make API call
   */
  public GetTestResultsBgp200Response getTestResultsBgp(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor) throws ApiException {
    ApiResponse<GetTestResultsBgp200Response> response = getTestResultsBgpWithHttpInfo(testId, aid, window, startDate, endDate, cursor);
    return response.getData();
  }

  /**
   * Get BGP test results
   * Returns a list of BGP monitors actively monitoring the destination&#39;s target prefix. This list includes information about the prefix, its associated AS Number, and provides details regarding reachability, path updates, and any changes in the path for the target network. 
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @return ApiResponse&lt;GetTestResultsBgp200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetTestResultsBgp200Response> getTestResultsBgpWithHttpInfo(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor) throws ApiException {
    getTestResultsBgpValidateRequest(testId);

    var requestBuilder = getTestResultsBgpRequestBuilder(testId, aid, window, startDate, endDate, cursor);

    return apiClient.send(requestBuilder.build(), GetTestResultsBgp200Response.class);
  }

  private void getTestResultsBgpValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getTestResultsBgp");
      }
  }

  private ApiRequest.ApiRequestBuilder getTestResultsBgpRequestBuilder(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/test-results/{testId}/bgp"
        .replace("{testId}", urlEncode(testId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("window", window));
    localVarQueryParams.addAll(parameterToPairs("startDate", startDate));
    localVarQueryParams.addAll(parameterToPairs("endDate", endDate));
    localVarQueryParams.addAll(parameterToPairs("cursor", cursor));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    return requestBuilder;
  }
  /**
   * Get BGP route test results by prefix
   * Returns an ordered list of networks crossed by a particular network prefix, including assigned monitors for the test and the paths taken to reach the destination. This is similar to revealing ASPath details found in a BGP Routing Information Base (rib) dump. 
   * @param testId Test ID (required)
   * @param prefixId The ID of the prefix. You can get &#x60;prefixId&#x60; from the &#x60;/test-results/{testId}/bgp&#x60; endpoint. (required)
   * @param roundId Round ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return GetTestResultsBgpPrefix200Response
   * @throws ApiException if fails to make API call
   */
  public GetTestResultsBgpPrefix200Response getTestResultsBgpPrefix(String testId, String prefixId, String roundId, String aid) throws ApiException {
    ApiResponse<GetTestResultsBgpPrefix200Response> response = getTestResultsBgpPrefixWithHttpInfo(testId, prefixId, roundId, aid);
    return response.getData();
  }

  /**
   * Get BGP route test results by prefix
   * Returns an ordered list of networks crossed by a particular network prefix, including assigned monitors for the test and the paths taken to reach the destination. This is similar to revealing ASPath details found in a BGP Routing Information Base (rib) dump. 
   * @param testId Test ID (required)
   * @param prefixId The ID of the prefix. You can get &#x60;prefixId&#x60; from the &#x60;/test-results/{testId}/bgp&#x60; endpoint. (required)
   * @param roundId Round ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;GetTestResultsBgpPrefix200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetTestResultsBgpPrefix200Response> getTestResultsBgpPrefixWithHttpInfo(String testId, String prefixId, String roundId, String aid) throws ApiException {
    getTestResultsBgpPrefixValidateRequest(testId, prefixId, roundId);

    var requestBuilder = getTestResultsBgpPrefixRequestBuilder(testId, prefixId, roundId, aid);

    return apiClient.send(requestBuilder.build(), GetTestResultsBgpPrefix200Response.class);
  }

  private void getTestResultsBgpPrefixValidateRequest(String testId, String prefixId, String roundId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getTestResultsBgpPrefix");
      }
      // verify the required parameter 'prefixId' is set
      if (prefixId == null) {
        throw new ApiException(400, "Missing the required parameter 'prefixId' when calling getTestResultsBgpPrefix");
      }
      // verify the required parameter 'roundId' is set
      if (roundId == null) {
        throw new ApiException(400, "Missing the required parameter 'roundId' when calling getTestResultsBgpPrefix");
      }
  }

  private ApiRequest.ApiRequestBuilder getTestResultsBgpPrefixRequestBuilder(String testId, String prefixId, String roundId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/test-results/{testId}/bgp/routes/prefix/{prefixId}/round/{roundId}"
        .replace("{testId}", urlEncode(testId.toString()))
        .replace("{prefixId}", urlEncode(prefixId.toString()))
        .replace("{roundId}", urlEncode(roundId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    return requestBuilder;
  }
}
