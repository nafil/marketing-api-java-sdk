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
import com.tencent.ads.model.v3.WechatChannelsAdAccountWechatBindingAddRequest;
import com.tencent.ads.model.v3.WechatChannelsAdAccountWechatBindingAddResponse;
import com.tencent.ads.model.v3.WechatChannelsAdAccountWechatBindingGetResponse;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WechatChannelsAdAccountWechatBindingApi {
  private ApiClient apiClient;

  public WechatChannelsAdAccountWechatBindingApi() {
    this(Configuration.getV3DefaultApiClient());
  }

  public WechatChannelsAdAccountWechatBindingApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for wechatChannelsAdAccountWechatBindingAdd
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call wechatChannelsAdAccountWechatBindingAddCall(
      WechatChannelsAdAccountWechatBindingAddRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/wechat_channels_ad_account_wechat_binding/add";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {"application/json", "application/xml"};
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
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAuthNames,
        progressRequestListener);
  }

  @SuppressWarnings("rawtypes")
  private com.squareup.okhttp.Call wechatChannelsAdAccountWechatBindingAddValidateBeforeCall(
      WechatChannelsAdAccountWechatBindingAddRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(
          "Missing the required parameter 'data' when calling wechatChannelsAdAccountWechatBindingAdd(Async)");
    }

    com.squareup.okhttp.Call call =
        wechatChannelsAdAccountWechatBindingAddCall(
            data, progressListener, progressRequestListener, headerPair);
    return call;
  }

  /**
   * 视频号开户绑定微信号
   *
   * @param data (required)
   * @return WechatChannelsAdAccountWechatBindingAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public WechatChannelsAdAccountWechatBindingAddResponse wechatChannelsAdAccountWechatBindingAdd(
      WechatChannelsAdAccountWechatBindingAddRequest data, String... headerPair)
      throws ApiException {
    ApiResponse<WechatChannelsAdAccountWechatBindingAddResponse> resp =
        wechatChannelsAdAccountWechatBindingAddWithHttpInfo(data, headerPair);
    return resp.getData();
  }

  /**
   * 视频号开户绑定微信号
   *
   * @param data (required)
   * @return ApiResponse&lt;WechatChannelsAdAccountWechatBindingAddResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<WechatChannelsAdAccountWechatBindingAddResponse>
      wechatChannelsAdAccountWechatBindingAddWithHttpInfo(
          WechatChannelsAdAccountWechatBindingAddRequest data, String... headerPair)
          throws ApiException {
    com.squareup.okhttp.Call call =
        wechatChannelsAdAccountWechatBindingAddValidateBeforeCall(data, null, null, headerPair);
    Type localVarReturnType =
        new TypeToken<WechatChannelsAdAccountWechatBindingAddResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 视频号开户绑定微信号 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call wechatChannelsAdAccountWechatBindingAddAsync(
      WechatChannelsAdAccountWechatBindingAddRequest data,
      final ApiCallback<WechatChannelsAdAccountWechatBindingAddResponse> callback,
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
        wechatChannelsAdAccountWechatBindingAddValidateBeforeCall(
            data, progressListener, progressRequestListener, headerPair);
    Type localVarReturnType =
        new TypeToken<WechatChannelsAdAccountWechatBindingAddResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  /**
   * Build call for wechatChannelsAdAccountWechatBindingGet
   *
   * @param accountId (required)
   * @param wechatBindAuthToken (required)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call wechatChannelsAdAccountWechatBindingGetCall(
      Long accountId,
      String wechatBindAuthToken,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/wechat_channels_ad_account_wechat_binding/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (accountId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
    if (wechatBindAuthToken != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair("wechat_bind_auth_token", wechatBindAuthToken));
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
  private com.squareup.okhttp.Call wechatChannelsAdAccountWechatBindingGetValidateBeforeCall(
      Long accountId,
      String wechatBindAuthToken,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling wechatChannelsAdAccountWechatBindingGet(Async)");
    }

    // verify the required parameter 'wechatBindAuthToken' is set
    if (wechatBindAuthToken == null) {
      throw new ApiException(
          "Missing the required parameter 'wechatBindAuthToken' when calling wechatChannelsAdAccountWechatBindingGet(Async)");
    }

    com.squareup.okhttp.Call call =
        wechatChannelsAdAccountWechatBindingGetCall(
            accountId,
            wechatBindAuthToken,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    return call;
  }

  /**
   * 视频号开户绑定微信状态查询
   *
   * @param accountId (required)
   * @param wechatBindAuthToken (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return WechatChannelsAdAccountWechatBindingGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public WechatChannelsAdAccountWechatBindingGetResponse wechatChannelsAdAccountWechatBindingGet(
      Long accountId, String wechatBindAuthToken, List<String> fields, String... headerPair)
      throws ApiException {
    ApiResponse<WechatChannelsAdAccountWechatBindingGetResponse> resp =
        wechatChannelsAdAccountWechatBindingGetWithHttpInfo(
            accountId, wechatBindAuthToken, fields, headerPair);
    return resp.getData();
  }

  /**
   * 视频号开户绑定微信状态查询
   *
   * @param accountId (required)
   * @param wechatBindAuthToken (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;WechatChannelsAdAccountWechatBindingGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<WechatChannelsAdAccountWechatBindingGetResponse>
      wechatChannelsAdAccountWechatBindingGetWithHttpInfo(
          Long accountId, String wechatBindAuthToken, List<String> fields, String... headerPair)
          throws ApiException {
    com.squareup.okhttp.Call call =
        wechatChannelsAdAccountWechatBindingGetValidateBeforeCall(
            accountId, wechatBindAuthToken, fields, null, null, headerPair);
    Type localVarReturnType =
        new TypeToken<WechatChannelsAdAccountWechatBindingGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 视频号开户绑定微信状态查询 (asynchronously)
   *
   * @param accountId (required)
   * @param wechatBindAuthToken (required)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call wechatChannelsAdAccountWechatBindingGetAsync(
      Long accountId,
      String wechatBindAuthToken,
      List<String> fields,
      final ApiCallback<WechatChannelsAdAccountWechatBindingGetResponse> callback,
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
        wechatChannelsAdAccountWechatBindingGetValidateBeforeCall(
            accountId,
            wechatBindAuthToken,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    Type localVarReturnType =
        new TypeToken<WechatChannelsAdAccountWechatBindingGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}
