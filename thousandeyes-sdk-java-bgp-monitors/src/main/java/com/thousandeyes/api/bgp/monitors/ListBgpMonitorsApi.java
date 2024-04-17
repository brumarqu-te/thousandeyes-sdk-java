/*
 * BGP Monitors API
 *  ## Overview Retrieve information about BGP monitors available for ThousandEyes account.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.api.bgp.monitors;

import static com.thousandeyes.api.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.api.client.RequestUtil.urlEncode;

import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.client.ApiException;
import com.thousandeyes.api.client.ApiResponse;
import com.thousandeyes.api.client.ApiRequest;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.api.bgp.monitors.model.Error;
import com.thousandeyes.api.bgp.monitors.model.GetBGPMonitors200Response;
import com.thousandeyes.api.bgp.monitors.model.UnauthorizedError;

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

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-17T14:20:00.837714+01:00[Europe/Lisbon]")
public class ListBgpMonitorsApi {
  private final ApiClient apiClient;

  public ListBgpMonitorsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * List BGP monitors
   * Retrieves a list of BGP monitors available to your account in ThousandEyes, including public and private feeds.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return GetBGPMonitors200Response
   * @throws ApiException if fails to make API call
   */
  public GetBGPMonitors200Response getBGPMonitors(String aid) throws ApiException {
    ApiResponse<GetBGPMonitors200Response> response = getBGPMonitorsWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List BGP monitors
   * Retrieves a list of BGP monitors available to your account in ThousandEyes, including public and private feeds.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;GetBGPMonitors200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetBGPMonitors200Response> getBGPMonitorsWithHttpInfo(String aid) throws ApiException {
    getBGPMonitorsValidateRequest();

    var requestBuilder = getBGPMonitorsRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), GetBGPMonitors200Response.class);
  }

  private void getBGPMonitorsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getBGPMonitorsRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/monitors";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/7.0.0"));
    return requestBuilder;
  }
}
