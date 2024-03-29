/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 3.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.tencent.ads.api.v3;

import com.google.gson.reflect.TypeToken;
import com.tencent.ads.ApiCallback;
import com.tencent.ads.ApiClient;
import com.tencent.ads.ApiException;
import com.tencent.ads.ApiResponse;
import com.tencent.ads.Configuration;
import com.tencent.ads.Pair;
import com.tencent.ads.ProgressRequestBody;
import com.tencent.ads.ProgressResponseBody;
import com.tencent.ads.model.v3.AgencyGetResponse;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgencyApi {
  private ApiClient apiClient;

  public AgencyApi() {
    this(Configuration.getV3DefaultApiClient());
  }

  public AgencyApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for agencyGet
   *
   * @param fields (required)
   * @param page (required)
   * @param pageSize (required)
   * @param accountId (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call agencyGetCall(
      List<String> fields,
      Long page,
      Long pageSize,
      Long accountId,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/agency/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (accountId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
    if (fields != null)
      localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "fields", fields));
    if (page != null) localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
    if (pageSize != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {"text/plain"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    if (headerPair != null && headerPair.length > 0) {
      if (headerPair.length % 2 != 0) {
        throw new UnsupportedOperationException("Parameter headerPair must be paired");
      }
      for (int i = 0; i < headerPair.length / 2; i++) {
        localVarHeaderParams.put(headerPair[i], headerPair[i * 2 + 1]);
      }
    }

    if (progressListener != null) {
      apiClient
          .getHttpClient()
          .networkInterceptors()
          .add(
              new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(
                    com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                  com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                  return originalResponse
                      .newBuilder()
                      .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                      .build();
                }
              });
    }

    String[] localVarAuthNames = new String[] {"accessToken", "nonce", "timestamp"};
    return apiClient.buildCall(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAuthNames,
        progressRequestListener);
  }

  @SuppressWarnings("rawtypes")
  private com.squareup.okhttp.Call agencyGetValidateBeforeCall(
      List<String> fields,
      Long page,
      Long pageSize,
      Long accountId,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    // verify the required parameter 'fields' is set
    if (fields == null) {
      throw new ApiException(
          "Missing the required parameter 'fields' when calling agencyGet(Async)");
    }

    // verify the required parameter 'page' is set
    if (page == null) {
      throw new ApiException("Missing the required parameter 'page' when calling agencyGet(Async)");
    }

    // verify the required parameter 'pageSize' is set
    if (pageSize == null) {
      throw new ApiException(
          "Missing the required parameter 'pageSize' when calling agencyGet(Async)");
    }

    com.squareup.okhttp.Call call =
        agencyGetCall(
            fields,
            page,
            pageSize,
            accountId,
            progressListener,
            progressRequestListener,
            headerPair);
    return call;
  }

  /**
   * 查询腾讯广告服务商信息
   *
   * @param fields (required)
   * @param page (required)
   * @param pageSize (required)
   * @param accountId (optional)
   * @return AgencyGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AgencyGetResponse agencyGet(
      List<String> fields, Long page, Long pageSize, Long accountId, String... headerPair)
      throws ApiException {
    ApiResponse<AgencyGetResponse> resp =
        agencyGetWithHttpInfo(fields, page, pageSize, accountId, headerPair);
    return resp.getData();
  }

  /**
   * 查询腾讯广告服务商信息
   *
   * @param fields (required)
   * @param page (required)
   * @param pageSize (required)
   * @param accountId (optional)
   * @return ApiResponse&lt;AgencyGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<AgencyGetResponse> agencyGetWithHttpInfo(
      List<String> fields, Long page, Long pageSize, Long accountId, String... headerPair)
      throws ApiException {
    com.squareup.okhttp.Call call =
        agencyGetValidateBeforeCall(fields, page, pageSize, accountId, null, null, headerPair);
    Type localVarReturnType = new TypeToken<AgencyGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 查询腾讯广告服务商信息 (asynchronously)
   *
   * @param fields (required)
   * @param page (required)
   * @param pageSize (required)
   * @param accountId (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call agencyGetAsync(
      List<String> fields,
      Long page,
      Long pageSize,
      Long accountId,
      final ApiCallback<AgencyGetResponse> callback,
      String... headerPair)
      throws ApiException {

    ProgressResponseBody.ProgressListener progressListener = null;
    ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

    if (callback != null) {
      progressListener =
          new ProgressResponseBody.ProgressListener() {
            @Override
            public void update(long bytesRead, long contentLength, boolean done) {
              callback.onDownloadProgress(bytesRead, contentLength, done);
            }
          };

      progressRequestListener =
          new ProgressRequestBody.ProgressRequestListener() {
            @Override
            public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
              callback.onUploadProgress(bytesWritten, contentLength, done);
            }
          };
    }

    com.squareup.okhttp.Call call =
        agencyGetValidateBeforeCall(
            fields,
            page,
            pageSize,
            accountId,
            progressListener,
            progressRequestListener,
            headerPair);
    Type localVarReturnType = new TypeToken<AgencyGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}
