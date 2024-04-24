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

package com.thousandeyes.api.tests;

import static com.thousandeyes.api.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.api.client.RequestUtil.urlEncode;

import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.client.ApiException;
import com.thousandeyes.api.client.ApiResponse;
import com.thousandeyes.api.client.ApiRequest;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.api.tests.model.Error;
import com.thousandeyes.api.tests.model.Expand;
import com.thousandeyes.api.tests.model.GetHttpServerTests200Response;
import com.thousandeyes.api.tests.model.HttpServerTest;
import java.net.URI;
import com.thousandeyes.api.tests.model.UnauthorizedError;
import com.thousandeyes.api.tests.model.UpdateHttpServerTest;
import com.thousandeyes.api.tests.model.ValidationError;

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

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T13:50:11.174036+01:00[Europe/Lisbon]")
public class HttpServerApi {
  private final ApiClient apiClient;

  public HttpServerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create HTTP Server test
   * Creates a new HTTP Server test. This method requires Account Admin permissions. 
   * @param updateHttpServerTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return HttpServerTest
   * @throws ApiException if fails to make API call
   */
  public HttpServerTest createHttpServerTest(UpdateHttpServerTest updateHttpServerTest, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<HttpServerTest> response = createHttpServerTestWithHttpInfo(updateHttpServerTest, aid, expand);
    return response.getData();
  }

  /**
   * Create HTTP Server test
   * Creates a new HTTP Server test. This method requires Account Admin permissions. 
   * @param updateHttpServerTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;HttpServerTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<HttpServerTest> createHttpServerTestWithHttpInfo(UpdateHttpServerTest updateHttpServerTest, String aid, List<Expand> expand) throws ApiException {
    createHttpServerTestValidateRequest(updateHttpServerTest);

    var requestBuilder = createHttpServerTestRequestBuilder(updateHttpServerTest, aid, expand);

    return apiClient.send(requestBuilder.build(), HttpServerTest.class);
  }

  private void createHttpServerTestValidateRequest(UpdateHttpServerTest updateHttpServerTest) throws ApiException {
      // verify the required parameter 'updateHttpServerTest' is set
      if (updateHttpServerTest == null) {
        throw new ApiException(400, "Missing the required parameter 'updateHttpServerTest' when calling createHttpServerTest");
      }
  }

  private ApiRequest.ApiRequestBuilder createHttpServerTestRequestBuilder(UpdateHttpServerTest updateHttpServerTest, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/tests/http-server";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    requestBuilder.requestBody(updateHttpServerTest);
    return requestBuilder;
  }
  /**
   * Delete HTTP Server test
   * Deletes the specified HTTP Server test. This method requires Account Admin permissions.
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteHttpServerTest(String testId, String aid) throws ApiException {
    deleteHttpServerTestWithHttpInfo(testId, aid);
  }

  /**
   * Delete HTTP Server test
   * Deletes the specified HTTP Server test. This method requires Account Admin permissions.
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteHttpServerTestWithHttpInfo(String testId, String aid) throws ApiException {
    deleteHttpServerTestValidateRequest(testId);

    var requestBuilder = deleteHttpServerTestRequestBuilder(testId, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteHttpServerTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling deleteHttpServerTest");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteHttpServerTestRequestBuilder(String testId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/v7/tests/http-server/{testId}"
        .replace("{testId}", urlEncode(testId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    return requestBuilder;
  }
  /**
   * Get HTTP Server test
   * Returns details for a HTTP Server test, including name, intervals, targets, alert rules and agents.
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return HttpServerTest
   * @throws ApiException if fails to make API call
   */
  public HttpServerTest getHttpServerTest(String testId, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<HttpServerTest> response = getHttpServerTestWithHttpInfo(testId, aid, expand);
    return response.getData();
  }

  /**
   * Get HTTP Server test
   * Returns details for a HTTP Server test, including name, intervals, targets, alert rules and agents.
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;HttpServerTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<HttpServerTest> getHttpServerTestWithHttpInfo(String testId, String aid, List<Expand> expand) throws ApiException {
    getHttpServerTestValidateRequest(testId);

    var requestBuilder = getHttpServerTestRequestBuilder(testId, aid, expand);

    return apiClient.send(requestBuilder.build(), HttpServerTest.class);
  }

  private void getHttpServerTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getHttpServerTest");
      }
  }

  private ApiRequest.ApiRequestBuilder getHttpServerTestRequestBuilder(String testId, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/tests/http-server/{testId}"
        .replace("{testId}", urlEncode(testId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    return requestBuilder;
  }
  /**
   * List HTTP Server tests
   * Returns a list of all HTTP Server tests and saved events.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return GetHttpServerTests200Response
   * @throws ApiException if fails to make API call
   */
  public GetHttpServerTests200Response getHttpServerTests(String aid) throws ApiException {
    ApiResponse<GetHttpServerTests200Response> response = getHttpServerTestsWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List HTTP Server tests
   * Returns a list of all HTTP Server tests and saved events.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;GetHttpServerTests200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetHttpServerTests200Response> getHttpServerTestsWithHttpInfo(String aid) throws ApiException {
    getHttpServerTestsValidateRequest();

    var requestBuilder = getHttpServerTestsRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), GetHttpServerTests200Response.class);
  }

  private void getHttpServerTestsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getHttpServerTestsRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/tests/http-server";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    return requestBuilder;
  }
  /**
   * Update HTTP Server test
   * Updates a HTTP Server test. The target test cannot be a live share or saved event. This method requires Account Admin permissions.
   * @param testId ID of the test (required)
   * @param updateHttpServerTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return HttpServerTest
   * @throws ApiException if fails to make API call
   */
  public HttpServerTest updateHttpServerTest(String testId, UpdateHttpServerTest updateHttpServerTest, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<HttpServerTest> response = updateHttpServerTestWithHttpInfo(testId, updateHttpServerTest, aid, expand);
    return response.getData();
  }

  /**
   * Update HTTP Server test
   * Updates a HTTP Server test. The target test cannot be a live share or saved event. This method requires Account Admin permissions.
   * @param testId ID of the test (required)
   * @param updateHttpServerTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;HttpServerTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<HttpServerTest> updateHttpServerTestWithHttpInfo(String testId, UpdateHttpServerTest updateHttpServerTest, String aid, List<Expand> expand) throws ApiException {
    updateHttpServerTestValidateRequest(testId, updateHttpServerTest);

    var requestBuilder = updateHttpServerTestRequestBuilder(testId, updateHttpServerTest, aid, expand);

    return apiClient.send(requestBuilder.build(), HttpServerTest.class);
  }

  private void updateHttpServerTestValidateRequest(String testId, UpdateHttpServerTest updateHttpServerTest) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling updateHttpServerTest");
      }
      // verify the required parameter 'updateHttpServerTest' is set
      if (updateHttpServerTest == null) {
        throw new ApiException(400, "Missing the required parameter 'updateHttpServerTest' when calling updateHttpServerTest");
      }
  }

  private ApiRequest.ApiRequestBuilder updateHttpServerTestRequestBuilder(String testId, UpdateHttpServerTest updateHttpServerTest, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PUT");

    String path = "/v7/tests/http-server/{testId}"
        .replace("{testId}", urlEncode(testId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    requestBuilder.requestBody(updateHttpServerTest);
    return requestBuilder;
  }
}
