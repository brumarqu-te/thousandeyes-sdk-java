/*
 * Tags API
 * The ThousandEyes Tags API provides a tagging system with key/value pairs. It allows you to tag assets within the ThousandEyes platform (such as agents, tests, or alert rules) with meaningful metadata. For example: `branch:sfo`, `branch:nyc`, and `team:netops`.  This feature provides:  * Support for automation. * Powerful and flexible reports/dashboards. * Support for third-party integrations.  Things to note with the ThousandEyes Tags API:  * Tags are backwards-compatible with existing labels. * Tags are separated by Tests (CEA), Agents (CEA), Endpoint Agents, Scheduled Endpoint Tests, and Reports. A single tag can only apply to one type of target object, so each tag must specify the target type of object via a `type` field. * Tags are defined in a single table so that they can be represented using a single model - `Tag`. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.api.tags;

import static com.thousandeyes.api.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.api.client.RequestUtil.urlEncode;

import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.client.ApiException;
import com.thousandeyes.api.client.ApiResponse;
import com.thousandeyes.api.client.ApiRequest;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.api.tags.model.ApiError;
import com.thousandeyes.api.tags.model.BulkTagAssignment;
import com.thousandeyes.api.tags.model.BulkTagAssignments;
import com.thousandeyes.api.tags.model.Error;
import com.thousandeyes.api.tags.model.TagAssignment;
import com.thousandeyes.api.tags.model.UnauthorizedError;

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

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T10:36:00.130474+01:00[Europe/London]")
public class TagAssignmentApi {
  private final ApiClient apiClient;

  public TagAssignmentApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Assign tag to multiple objects
   * Assigns a tag to one or more objects. This endpoint has cumulative behavior: The tag is assigned to the specified objects, and the previous assignments persist. No unassignment takes place.
   * @param id ID of the tag to associate (required)
   * @param tagAssignment  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return BulkTagAssignment
   * @throws ApiException if fails to make API call
   */
  public BulkTagAssignment assignTag(String id, TagAssignment tagAssignment, String aid) throws ApiException {
    ApiResponse<BulkTagAssignment> response = assignTagWithHttpInfo(id, tagAssignment, aid);
    return response.getData();
  }

  /**
   * Assign tag to multiple objects
   * Assigns a tag to one or more objects. This endpoint has cumulative behavior: The tag is assigned to the specified objects, and the previous assignments persist. No unassignment takes place.
   * @param id ID of the tag to associate (required)
   * @param tagAssignment  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;BulkTagAssignment&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<BulkTagAssignment> assignTagWithHttpInfo(String id, TagAssignment tagAssignment, String aid) throws ApiException {
    assignTagValidateRequest(id, tagAssignment);

    var requestBuilder = assignTagRequestBuilder(id, tagAssignment, aid);

    return apiClient.send(requestBuilder.build(), BulkTagAssignment.class);
  }

  private void assignTagValidateRequest(String id, TagAssignment tagAssignment) throws ApiException {
      // verify the required parameter 'id' is set
      if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling assignTag");
      }
      // verify the required parameter 'tagAssignment' is set
      if (tagAssignment == null) {
        throw new ApiException(400, "Missing the required parameter 'tagAssignment' when calling assignTag");
      }
  }

  private ApiRequest.ApiRequestBuilder assignTagRequestBuilder(String id, TagAssignment tagAssignment, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/tags/{id}/assign"
        .replace("{id}", urlEncode(id.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    requestBuilder.requestBody(tagAssignment);
    return requestBuilder;
  }
  /**
   * Assign multiple tags to multiple objects
   * Assigns the specified tags to the specified objects. This endpoint has cumulative behavior: The tags are assigned to the specified objects, and the previous assignments persist. No unassignment takes place.
   * @param bulkTagAssignments  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return BulkTagAssignments
   * @throws ApiException if fails to make API call
   */
  public BulkTagAssignments bulkAssignTag(BulkTagAssignments bulkTagAssignments, String aid) throws ApiException {
    ApiResponse<BulkTagAssignments> response = bulkAssignTagWithHttpInfo(bulkTagAssignments, aid);
    return response.getData();
  }

  /**
   * Assign multiple tags to multiple objects
   * Assigns the specified tags to the specified objects. This endpoint has cumulative behavior: The tags are assigned to the specified objects, and the previous assignments persist. No unassignment takes place.
   * @param bulkTagAssignments  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;BulkTagAssignments&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<BulkTagAssignments> bulkAssignTagWithHttpInfo(BulkTagAssignments bulkTagAssignments, String aid) throws ApiException {
    bulkAssignTagValidateRequest(bulkTagAssignments);

    var requestBuilder = bulkAssignTagRequestBuilder(bulkTagAssignments, aid);

    return apiClient.send(requestBuilder.build(), BulkTagAssignments.class);
  }

  private void bulkAssignTagValidateRequest(BulkTagAssignments bulkTagAssignments) throws ApiException {
      // verify the required parameter 'bulkTagAssignments' is set
      if (bulkTagAssignments == null) {
        throw new ApiException(400, "Missing the required parameter 'bulkTagAssignments' when calling bulkAssignTag");
      }
  }

  private ApiRequest.ApiRequestBuilder bulkAssignTagRequestBuilder(BulkTagAssignments bulkTagAssignments, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/tags/assign";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    requestBuilder.requestBody(bulkTagAssignments);
    return requestBuilder;
  }
  /**
   * Remove multiple tags from multiple objects
   * Removes the specified tags from one or more objects.
   * @param bulkTagAssignments  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return BulkTagAssignments
   * @throws ApiException if fails to make API call
   */
  public BulkTagAssignments bulkUnAssignTag(BulkTagAssignments bulkTagAssignments, String aid) throws ApiException {
    ApiResponse<BulkTagAssignments> response = bulkUnAssignTagWithHttpInfo(bulkTagAssignments, aid);
    return response.getData();
  }

  /**
   * Remove multiple tags from multiple objects
   * Removes the specified tags from one or more objects.
   * @param bulkTagAssignments  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;BulkTagAssignments&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<BulkTagAssignments> bulkUnAssignTagWithHttpInfo(BulkTagAssignments bulkTagAssignments, String aid) throws ApiException {
    bulkUnAssignTagValidateRequest(bulkTagAssignments);

    var requestBuilder = bulkUnAssignTagRequestBuilder(bulkTagAssignments, aid);

    return apiClient.send(requestBuilder.build(), BulkTagAssignments.class);
  }

  private void bulkUnAssignTagValidateRequest(BulkTagAssignments bulkTagAssignments) throws ApiException {
      // verify the required parameter 'bulkTagAssignments' is set
      if (bulkTagAssignments == null) {
        throw new ApiException(400, "Missing the required parameter 'bulkTagAssignments' when calling bulkUnAssignTag");
      }
  }

  private ApiRequest.ApiRequestBuilder bulkUnAssignTagRequestBuilder(BulkTagAssignments bulkTagAssignments, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/tags/unassign";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    requestBuilder.requestBody(bulkTagAssignments);
    return requestBuilder;
  }
  /**
   * Remove tag from multiple objects
   * Removes a tag from one or more objects.
   * @param id ID of the tag to associate (required)
   * @param tagAssignment  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void unassignTag(String id, TagAssignment tagAssignment, String aid) throws ApiException {
    unassignTagWithHttpInfo(id, tagAssignment, aid);
  }

  /**
   * Remove tag from multiple objects
   * Removes a tag from one or more objects.
   * @param id ID of the tag to associate (required)
   * @param tagAssignment  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> unassignTagWithHttpInfo(String id, TagAssignment tagAssignment, String aid) throws ApiException {
    unassignTagValidateRequest(id, tagAssignment);

    var requestBuilder = unassignTagRequestBuilder(id, tagAssignment, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void unassignTagValidateRequest(String id, TagAssignment tagAssignment) throws ApiException {
      // verify the required parameter 'id' is set
      if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling unassignTag");
      }
      // verify the required parameter 'tagAssignment' is set
      if (tagAssignment == null) {
        throw new ApiException(400, "Missing the required parameter 'tagAssignment' when calling unassignTag");
      }
  }

  private ApiRequest.ApiRequestBuilder unassignTagRequestBuilder(String id, TagAssignment tagAssignment, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/tags/{id}/unassign"
        .replace("{id}", urlEncode(id.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/problem+json, application/json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    requestBuilder.requestBody(tagAssignment);
    return requestBuilder;
  }
}
