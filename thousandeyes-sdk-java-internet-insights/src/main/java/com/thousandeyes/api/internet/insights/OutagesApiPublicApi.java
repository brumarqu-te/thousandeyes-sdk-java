/*
 * Internet Insights API
 * We are happy to announce the release of the Internet Insights API set. This limited release includes endpoints that:  * Make our catalog provider and Internet outage data accessible to API users. * Provide access to advanced filtering, which is part of our next-generation API efforts to allow API users to fine-tune queries across all of our APIs in a consistent manner.  Internet Insights provide visibility into core Internet infrastructure, including ISPs, DNS providers, IaaS, CDNs , and SaaS providers. It tracks the macro-level impact of Internet events on individual users and enterprise networks connecting at the edge of the Internet. These events include Outages, Routing hijacks and leaks, DDoS attacks, And political interference, among others.  Future releases of the Internet Insights API set will further unlock access to core Internet Insights functionality, unlocking potential integrations to enrich customer process flows. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.api.internet.insights;

import static com.thousandeyes.api.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.api.client.RequestUtil.urlEncode;

import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.client.ApiException;
import com.thousandeyes.api.client.ApiResponse;
import com.thousandeyes.api.client.ApiRequest;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.api.internet.insights.model.ApiApplicationOutageResponse;
import com.thousandeyes.api.internet.insights.model.ApiNetworkOutageResponse;
import com.thousandeyes.api.internet.insights.model.ApiOutageFilter;
import com.thousandeyes.api.internet.insights.model.ApiOutagesResponse;
import com.thousandeyes.api.internet.insights.model.Error;
import com.thousandeyes.api.internet.insights.model.UnauthorizedError;
import com.thousandeyes.api.internet.insights.model.ValidationError;

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

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T13:50:09.963174+01:00[Europe/Lisbon]")
public class OutagesApiPublicApi {
  private final ApiClient apiClient;

  public OutagesApiPublicApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Retrieve application outage
   * Returns the details of an application outage. 
   * @param outageId  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiApplicationOutageResponse
   * @throws ApiException if fails to make API call
   */
  public ApiApplicationOutageResponse getOutagesApp(String outageId, String aid) throws ApiException {
    ApiResponse<ApiApplicationOutageResponse> response = getOutagesAppWithHttpInfo(outageId, aid);
    return response.getData();
  }

  /**
   * Retrieve application outage
   * Returns the details of an application outage. 
   * @param outageId  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;ApiApplicationOutageResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ApiApplicationOutageResponse> getOutagesAppWithHttpInfo(String outageId, String aid) throws ApiException {
    getOutagesAppValidateRequest(outageId);

    var requestBuilder = getOutagesAppRequestBuilder(outageId, aid);

    return apiClient.send(requestBuilder.build(), ApiApplicationOutageResponse.class);
  }

  private void getOutagesAppValidateRequest(String outageId) throws ApiException {
      // verify the required parameter 'outageId' is set
      if (outageId == null) {
        throw new ApiException(400, "Missing the required parameter 'outageId' when calling getOutagesApp");
      }
  }

  private ApiRequest.ApiRequestBuilder getOutagesAppRequestBuilder(String outageId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/internet-insights/outages/app/{outageId}"
        .replace("{outageId}", urlEncode(outageId.toString()));
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
   * List network and application outages
   * Returns a list of network and application outages using a filter object. Advanced Filter persistance is not currently supported.  &lt;b&gt;Note:&lt;/b&gt; Support for pagination will be added in the future.   ## Samples Queries with Different Filter Permutations   ### Window  &#x60;&#x60;&#x60;  curl --location --request POST &#39;https://api.thousandeyes.com/v7/internet-insights/outages/filter&#39; --header &#39;Authorization: Bearer $token --header &#39;Accept-Encoding: application/gzip&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;window\&quot; : \&quot;1d\&quot;   }&#39; &#x60;&#x60;&#x60;  ### Date Range &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/internet-insights/outages/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{     \&quot;startDate\&quot;: \&quot;2022-03-01T01:30:00Z\&quot;,     \&quot;endDate\&quot;  : \&quot;2022-03-01T23:30:15Z\&quot;   }&#39; &#x60;&#x60;&#x60;  ### Date Range with Scope &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/internet-insights/outages/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{     \&quot;startDate\&quot;: \&quot;2022-03-01T01:30:00Z\&quot;,     \&quot;endDate\&quot;  : \&quot;2022-03-01T23:30:15Z\&quot;,     \&quot;outageScope\&quot;: \&quot;with-affected-test\&quot;   }&#39; &#x60;&#x60;&#x60; ### Date Range with Network &#x60;&#x60;&#x60;   curl --location --request POST &#39;https://api.thousandeyes.com/v7/internet-insights/outages/filter&#39;   --header &#39;Authorization: Bearer $token&#39;   --header &#39;Content-Type: application/json&#39;   --data-raw &#39;{       \&quot;startDate\&quot;: \&quot;2022-03-01T01:30:00Z\&quot;,       \&quot;endDate\&quot;  : \&quot;2022-03-01T23:30:15Z\&quot;,       \&quot;interfaceNetwork\&quot;:  [\&quot;Telianet\&quot;]     }&#39; &#x60;&#x60;&#x60;  ### Date Range with Application &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/internet-insights/outages/filter&#39;   --header &#39;Authorization: Bearer $token&#39;   --header &#39;Content-Type: application/json&#39;   --data-raw &#39;{       \&quot;startDate\&quot;: \&quot;2022-03-01T01:30:00Z\&quot;,       \&quot;endDate\&quot;  : \&quot;2022-03-01T23:30:15Z\&quot;,       \&quot;applicationName\&quot;: [\&quot;Google\&quot;]   }&#39; &#x60;&#x60;&#x60; ### Date Range with Provider &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/internet-insights/outages/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{       \&quot;startDate\&quot;: \&quot;2022-03-01T01:30:00Z\&quot;,       \&quot;endDate\&quot;  : \&quot;2022-03-01T23:30:15Z\&quot;,       \&quot;providerName\&quot;: [\&quot;Century Link\&quot;, \&quot;Microsoft\&quot;]   }&#39;  &#x60;&#x60;&#x60; ### Date Range with Application and Scope &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/internet-insights/outages/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{     \&quot;startDate\&quot;: \&quot;2022-03-01T01:30:00Z\&quot;,     \&quot;endDate\&quot;  : \&quot;2022-03-01T23:30:15Z\&quot;,     \&quot;outageScope\&quot;: \&quot;all\&quot;,     \&quot;applicationName\&quot;: [\&quot;Google\&quot;] }&#39; &#x60;&#x60;&#x60; 
   * @param apiOutageFilter  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiOutagesResponse
   * @throws ApiException if fails to make API call
   */
  public ApiOutagesResponse getOutagesFilter(ApiOutageFilter apiOutageFilter, String aid) throws ApiException {
    ApiResponse<ApiOutagesResponse> response = getOutagesFilterWithHttpInfo(apiOutageFilter, aid);
    return response.getData();
  }

  /**
   * List network and application outages
   * Returns a list of network and application outages using a filter object. Advanced Filter persistance is not currently supported.  &lt;b&gt;Note:&lt;/b&gt; Support for pagination will be added in the future.   ## Samples Queries with Different Filter Permutations   ### Window  &#x60;&#x60;&#x60;  curl --location --request POST &#39;https://api.thousandeyes.com/v7/internet-insights/outages/filter&#39; --header &#39;Authorization: Bearer $token --header &#39;Accept-Encoding: application/gzip&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;window\&quot; : \&quot;1d\&quot;   }&#39; &#x60;&#x60;&#x60;  ### Date Range &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/internet-insights/outages/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{     \&quot;startDate\&quot;: \&quot;2022-03-01T01:30:00Z\&quot;,     \&quot;endDate\&quot;  : \&quot;2022-03-01T23:30:15Z\&quot;   }&#39; &#x60;&#x60;&#x60;  ### Date Range with Scope &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/internet-insights/outages/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{     \&quot;startDate\&quot;: \&quot;2022-03-01T01:30:00Z\&quot;,     \&quot;endDate\&quot;  : \&quot;2022-03-01T23:30:15Z\&quot;,     \&quot;outageScope\&quot;: \&quot;with-affected-test\&quot;   }&#39; &#x60;&#x60;&#x60; ### Date Range with Network &#x60;&#x60;&#x60;   curl --location --request POST &#39;https://api.thousandeyes.com/v7/internet-insights/outages/filter&#39;   --header &#39;Authorization: Bearer $token&#39;   --header &#39;Content-Type: application/json&#39;   --data-raw &#39;{       \&quot;startDate\&quot;: \&quot;2022-03-01T01:30:00Z\&quot;,       \&quot;endDate\&quot;  : \&quot;2022-03-01T23:30:15Z\&quot;,       \&quot;interfaceNetwork\&quot;:  [\&quot;Telianet\&quot;]     }&#39; &#x60;&#x60;&#x60;  ### Date Range with Application &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/internet-insights/outages/filter&#39;   --header &#39;Authorization: Bearer $token&#39;   --header &#39;Content-Type: application/json&#39;   --data-raw &#39;{       \&quot;startDate\&quot;: \&quot;2022-03-01T01:30:00Z\&quot;,       \&quot;endDate\&quot;  : \&quot;2022-03-01T23:30:15Z\&quot;,       \&quot;applicationName\&quot;: [\&quot;Google\&quot;]   }&#39; &#x60;&#x60;&#x60; ### Date Range with Provider &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/internet-insights/outages/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{       \&quot;startDate\&quot;: \&quot;2022-03-01T01:30:00Z\&quot;,       \&quot;endDate\&quot;  : \&quot;2022-03-01T23:30:15Z\&quot;,       \&quot;providerName\&quot;: [\&quot;Century Link\&quot;, \&quot;Microsoft\&quot;]   }&#39;  &#x60;&#x60;&#x60; ### Date Range with Application and Scope &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/internet-insights/outages/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{     \&quot;startDate\&quot;: \&quot;2022-03-01T01:30:00Z\&quot;,     \&quot;endDate\&quot;  : \&quot;2022-03-01T23:30:15Z\&quot;,     \&quot;outageScope\&quot;: \&quot;all\&quot;,     \&quot;applicationName\&quot;: [\&quot;Google\&quot;] }&#39; &#x60;&#x60;&#x60; 
   * @param apiOutageFilter  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;ApiOutagesResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ApiOutagesResponse> getOutagesFilterWithHttpInfo(ApiOutageFilter apiOutageFilter, String aid) throws ApiException {
    getOutagesFilterValidateRequest(apiOutageFilter);

    var requestBuilder = getOutagesFilterRequestBuilder(apiOutageFilter, aid);

    return apiClient.send(requestBuilder.build(), ApiOutagesResponse.class);
  }

  private void getOutagesFilterValidateRequest(ApiOutageFilter apiOutageFilter) throws ApiException {
      // verify the required parameter 'apiOutageFilter' is set
      if (apiOutageFilter == null) {
        throw new ApiException(400, "Missing the required parameter 'apiOutageFilter' when calling getOutagesFilter");
      }
  }

  private ApiRequest.ApiRequestBuilder getOutagesFilterRequestBuilder(ApiOutageFilter apiOutageFilter, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/internet-insights/outages/filter";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    requestBuilder.requestBody(apiOutageFilter);
    return requestBuilder;
  }
  /**
   * Retrieve network outage
   * Returns the details of a network outage. 
   * @param outageId  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiNetworkOutageResponse
   * @throws ApiException if fails to make API call
   */
  public ApiNetworkOutageResponse getOutagesNet(String outageId, String aid) throws ApiException {
    ApiResponse<ApiNetworkOutageResponse> response = getOutagesNetWithHttpInfo(outageId, aid);
    return response.getData();
  }

  /**
   * Retrieve network outage
   * Returns the details of a network outage. 
   * @param outageId  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;ApiNetworkOutageResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ApiNetworkOutageResponse> getOutagesNetWithHttpInfo(String outageId, String aid) throws ApiException {
    getOutagesNetValidateRequest(outageId);

    var requestBuilder = getOutagesNetRequestBuilder(outageId, aid);

    return apiClient.send(requestBuilder.build(), ApiNetworkOutageResponse.class);
  }

  private void getOutagesNetValidateRequest(String outageId) throws ApiException {
      // verify the required parameter 'outageId' is set
      if (outageId == null) {
        throw new ApiException(400, "Missing the required parameter 'outageId' when calling getOutagesNet");
      }
  }

  private ApiRequest.ApiRequestBuilder getOutagesNetRequestBuilder(String outageId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/internet-insights/outages/net/{outageId}"
        .replace("{outageId}", urlEncode(outageId.toString()));
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
}
