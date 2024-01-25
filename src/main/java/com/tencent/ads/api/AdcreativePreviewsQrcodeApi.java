/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 1.3
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.tencent.ads.api;

import com.google.gson.reflect.TypeToken;
import com.tencent.ads.ApiCallback;
import com.tencent.ads.ApiClient;
import com.tencent.ads.ApiException;
import com.tencent.ads.ApiResponse;
import com.tencent.ads.Configuration;
import com.tencent.ads.Pair;
import com.tencent.ads.ProgressRequestBody;
import com.tencent.ads.ProgressResponseBody;
import com.tencent.ads.model.AdcreativePreviewsQrcodeGetResponse;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdcreativePreviewsQrcodeApi {
  private ApiClient apiClient;

  public AdcreativePreviewsQrcodeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AdcreativePreviewsQrcodeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for adcreativePreviewsQrcodeGet
   *
   * @param accountId (required)
   * @param adgroupId (required)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call adcreativePreviewsQrcodeGetCall(
      Long accountId,
      Long adgroupId,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/adcreative_previews_qrcode/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (accountId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
    if (adgroupId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("adgroup_id", adgroupId));
    if (fields != null)
      localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "fields", fields));

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
  private com.squareup.okhttp.Call adcreativePreviewsQrcodeGetValidateBeforeCall(
      Long accountId,
      Long adgroupId,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling adcreativePreviewsQrcodeGet(Async)");
    }

    // verify the required parameter 'adgroupId' is set
    if (adgroupId == null) {
      throw new ApiException(
          "Missing the required parameter 'adgroupId' when calling adcreativePreviewsQrcodeGet(Async)");
    }

    com.squareup.okhttp.Call call =
        adcreativePreviewsQrcodeGetCall(
            accountId, adgroupId, fields, progressListener, progressRequestListener, headerPair);
    return call;
  }

  /**
   * 获取广告预览二维码
   *
   * @param accountId (required)
   * @param adgroupId (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return AdcreativePreviewsQrcodeGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AdcreativePreviewsQrcodeGetResponse adcreativePreviewsQrcodeGet(
      Long accountId, Long adgroupId, List<String> fields, String... headerPair)
      throws ApiException {
    ApiResponse<AdcreativePreviewsQrcodeGetResponse> resp =
        adcreativePreviewsQrcodeGetWithHttpInfo(accountId, adgroupId, fields, headerPair);
    return resp.getData();
  }

  /**
   * 获取广告预览二维码
   *
   * @param accountId (required)
   * @param adgroupId (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;AdcreativePreviewsQrcodeGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<AdcreativePreviewsQrcodeGetResponse> adcreativePreviewsQrcodeGetWithHttpInfo(
      Long accountId, Long adgroupId, List<String> fields, String... headerPair)
      throws ApiException {
    com.squareup.okhttp.Call call =
        adcreativePreviewsQrcodeGetValidateBeforeCall(
            accountId, adgroupId, fields, null, null, headerPair);
    Type localVarReturnType = new TypeToken<AdcreativePreviewsQrcodeGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 获取广告预览二维码 (asynchronously)
   *
   * @param accountId (required)
   * @param adgroupId (required)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call adcreativePreviewsQrcodeGetAsync(
      Long accountId,
      Long adgroupId,
      List<String> fields,
      final ApiCallback<AdcreativePreviewsQrcodeGetResponse> callback,
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
        adcreativePreviewsQrcodeGetValidateBeforeCall(
            accountId, adgroupId, fields, progressListener, progressRequestListener, headerPair);
    Type localVarReturnType = new TypeToken<AdcreativePreviewsQrcodeGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}
