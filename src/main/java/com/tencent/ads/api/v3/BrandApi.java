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
import com.tencent.ads.model.v3.BrandAddResponse;
import com.tencent.ads.model.v3.BrandGetResponse;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BrandApi {
  private ApiClient apiClient;

  public BrandApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BrandApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for brandAdd
   *
   * @param accountId (required)
   * @param name (required)
   * @param brandImageFile (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call brandAddCall(
      Long accountId,
      String name,
      File brandImageFile,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/brand/add";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    if (accountId != null) localVarFormParams.put("account_id", accountId);
    if (name != null) localVarFormParams.put("name", name);
    if (brandImageFile != null) localVarFormParams.put("brand_image_file", brandImageFile);

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {"multipart/form-data"};
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
  private com.squareup.okhttp.Call brandAddValidateBeforeCall(
      Long accountId,
      String name,
      File brandImageFile,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling brandAdd(Async)");
    }

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException("Missing the required parameter 'name' when calling brandAdd(Async)");
    }

    // verify the required parameter 'brandImageFile' is set
    if (brandImageFile == null) {
      throw new ApiException(
          "Missing the required parameter 'brandImageFile' when calling brandAdd(Async)");
    }

    com.squareup.okhttp.Call call =
        brandAddCall(
            accountId, name, brandImageFile, progressListener, progressRequestListener, headerPair);
    return call;
  }

  /**
   * 创建品牌形象
   *
   * @param accountId (required)
   * @param name (required)
   * @param brandImageFile (required)
   * @return BrandAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public BrandAddResponse brandAdd(
      Long accountId, String name, File brandImageFile, String... headerPair) throws ApiException {
    try {
      ApiClient.setBasePathTLVal("https://api.e.qq.com/v3.0");
      ApiResponse<BrandAddResponse> resp =
          brandAddWithHttpInfo(accountId, name, brandImageFile, headerPair);
      return resp.getData();
    } finally {
      ApiClient.clearBasePathTLVal();
    }
  }

  /**
   * 创建品牌形象
   *
   * @param accountId (required)
   * @param name (required)
   * @param brandImageFile (required)
   * @return ApiResponse&lt;BrandAddResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<BrandAddResponse> brandAddWithHttpInfo(
      Long accountId, String name, File brandImageFile, String... headerPair) throws ApiException {
    com.squareup.okhttp.Call call =
        brandAddValidateBeforeCall(accountId, name, brandImageFile, null, null, headerPair);
    Type localVarReturnType = new TypeToken<BrandAddResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 创建品牌形象 (asynchronously)
   *
   * @param accountId (required)
   * @param name (required)
   * @param brandImageFile (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call brandAddAsync(
      Long accountId,
      String name,
      File brandImageFile,
      final ApiCallback<BrandAddResponse> callback,
      String... headerPair)
      throws ApiException {
    try {
      ApiClient.setBasePathTLVal("https://api.e.qq.com/v3.0");
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
          brandAddValidateBeforeCall(
              accountId,
              name,
              brandImageFile,
              progressListener,
              progressRequestListener,
              headerPair);
      Type localVarReturnType = new TypeToken<BrandAddResponse>() {}.getType();
      apiClient.executeAsync(call, localVarReturnType, callback);
      return call;
    } finally {
      ApiClient.clearBasePathTLVal();
    }
  }
  /**
   * Build call for brandGet
   *
   * @param accountId (required)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call brandGetCall(
      Long accountId,
      Long page,
      Long pageSize,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/brand/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (accountId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
    if (page != null) localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
    if (pageSize != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
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
  private com.squareup.okhttp.Call brandGetValidateBeforeCall(
      Long accountId,
      Long page,
      Long pageSize,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling brandGet(Async)");
    }

    com.squareup.okhttp.Call call =
        brandGetCall(
            accountId,
            page,
            pageSize,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    return call;
  }

  /**
   * 获取品牌形象列表
   *
   * @param accountId (required)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return BrandGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public BrandGetResponse brandGet(
      Long accountId, Long page, Long pageSize, List<String> fields, String... headerPair)
      throws ApiException {
    try {
      ApiClient.setBasePathTLVal("https://api.e.qq.com/v3.0");
      ApiResponse<BrandGetResponse> resp =
          brandGetWithHttpInfo(accountId, page, pageSize, fields, headerPair);
      return resp.getData();
    } finally {
      ApiClient.clearBasePathTLVal();
    }
  }

  /**
   * 获取品牌形象列表
   *
   * @param accountId (required)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;BrandGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<BrandGetResponse> brandGetWithHttpInfo(
      Long accountId, Long page, Long pageSize, List<String> fields, String... headerPair)
      throws ApiException {
    com.squareup.okhttp.Call call =
        brandGetValidateBeforeCall(accountId, page, pageSize, fields, null, null, headerPair);
    Type localVarReturnType = new TypeToken<BrandGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 获取品牌形象列表 (asynchronously)
   *
   * @param accountId (required)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call brandGetAsync(
      Long accountId,
      Long page,
      Long pageSize,
      List<String> fields,
      final ApiCallback<BrandGetResponse> callback,
      String... headerPair)
      throws ApiException {
    try {
      ApiClient.setBasePathTLVal("https://api.e.qq.com/v3.0");
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
          brandGetValidateBeforeCall(
              accountId,
              page,
              pageSize,
              fields,
              progressListener,
              progressRequestListener,
              headerPair);
      Type localVarReturnType = new TypeToken<BrandGetResponse>() {}.getType();
      apiClient.executeAsync(call, localVarReturnType, callback);
      return call;
    } finally {
      ApiClient.clearBasePathTLVal();
    }
  }
}
