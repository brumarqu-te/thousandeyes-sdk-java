/*
 * Endpoint Tests API
 *  Manage endpoint agent dynamic and scheduled tests using the Endpoint Tests API. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.api.endpoint.tests;

import static com.thousandeyes.api.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.api.client.RequestUtil.urlEncode;

import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.client.ApiException;
import com.thousandeyes.api.client.ApiResponse;
import com.thousandeyes.api.client.ApiRequest;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.api.endpoint.tests.model.Error;
import com.thousandeyes.api.endpoint.tests.model.GetEndpointTestsList200Response;
import com.thousandeyes.api.endpoint.tests.model.UnauthorizedError;

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

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T10:36:00.232828+01:00[Europe/London]")
public class ListEndpointScheduledTestsApi {
  private final ApiClient apiClient;

  public ListEndpointScheduledTestsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * List endpoint scheduled tests
   * Returns a list of all endpoint scheduled tests configured in ThousandEyes. This list does not contain saved events.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return GetEndpointTestsList200Response
   * @throws ApiException if fails to make API call
   */
  public GetEndpointTestsList200Response getEndpointTestsList(String aid) throws ApiException {
    ApiResponse<GetEndpointTestsList200Response> response = getEndpointTestsListWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List endpoint scheduled tests
   * Returns a list of all endpoint scheduled tests configured in ThousandEyes. This list does not contain saved events.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;GetEndpointTestsList200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEndpointTestsList200Response> getEndpointTestsListWithHttpInfo(String aid) throws ApiException {
    getEndpointTestsListValidateRequest();

    var requestBuilder = getEndpointTestsListRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), GetEndpointTestsList200Response.class);
  }

  private void getEndpointTestsListValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getEndpointTestsListRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/endpoint/tests/scheduled-tests";
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
