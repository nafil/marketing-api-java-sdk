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
import com.tencent.ads.model.PropertyFilesAddResponse;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PropertyFilesApi {
  private ApiClient apiClient;

  public PropertyFilesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PropertyFilesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for propertyFilesAdd
   *
   * @param accountId (required)
   * @param propertySetId (required)
   * @param sessionId (required)
   * @param fileName (required)
   * @param file (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call propertyFilesAddCall(
      Long accountId,
      Long propertySetId,
      Long sessionId,
      String fileName,
      File file,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/property_files/add";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    if (accountId != null) localVarFormParams.put("account_id", accountId);
    if (propertySetId != null) localVarFormParams.put("property_set_id", propertySetId);
    if (sessionId != null) localVarFormParams.put("session_id", sessionId);
    if (fileName != null) localVarFormParams.put("file_name", fileName);
    if (file != null) localVarFormParams.put("file", file);

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
  private com.squareup.okhttp.Call propertyFilesAddValidateBeforeCall(
      Long accountId,
      Long propertySetId,
      Long sessionId,
      String fileName,
      File file,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling propertyFilesAdd(Async)");
    }

    // verify the required parameter 'propertySetId' is set
    if (propertySetId == null) {
      throw new ApiException(
          "Missing the required parameter 'propertySetId' when calling propertyFilesAdd(Async)");
    }

    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(
          "Missing the required parameter 'sessionId' when calling propertyFilesAdd(Async)");
    }

    // verify the required parameter 'fileName' is set
    if (fileName == null) {
      throw new ApiException(
          "Missing the required parameter 'fileName' when calling propertyFilesAdd(Async)");
    }

    // verify the required parameter 'file' is set
    if (file == null) {
      throw new ApiException(
          "Missing the required parameter 'file' when calling propertyFilesAdd(Async)");
    }

    com.squareup.okhttp.Call call =
        propertyFilesAddCall(
            accountId,
            propertySetId,
            sessionId,
            fileName,
            file,
            progressListener,
            progressRequestListener,
            headerPair);
    return call;
  }

  /**
   * 上传属性数据文件
   *
   * @param accountId (required)
   * @param propertySetId (required)
   * @param sessionId (required)
   * @param fileName (required)
   * @param file (required)
   * @return PropertyFilesAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public PropertyFilesAddResponse propertyFilesAdd(
      Long accountId,
      Long propertySetId,
      Long sessionId,
      String fileName,
      File file,
      String... headerPair)
      throws ApiException {
    ApiResponse<PropertyFilesAddResponse> resp =
        propertyFilesAddWithHttpInfo(
            accountId, propertySetId, sessionId, fileName, file, headerPair);
    return resp.getData();
  }

  /**
   * 上传属性数据文件
   *
   * @param accountId (required)
   * @param propertySetId (required)
   * @param sessionId (required)
   * @param fileName (required)
   * @param file (required)
   * @return ApiResponse&lt;PropertyFilesAddResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<PropertyFilesAddResponse> propertyFilesAddWithHttpInfo(
      Long accountId,
      Long propertySetId,
      Long sessionId,
      String fileName,
      File file,
      String... headerPair)
      throws ApiException {
    com.squareup.okhttp.Call call =
        propertyFilesAddValidateBeforeCall(
            accountId, propertySetId, sessionId, fileName, file, null, null, headerPair);
    Type localVarReturnType = new TypeToken<PropertyFilesAddResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 上传属性数据文件 (asynchronously)
   *
   * @param accountId (required)
   * @param propertySetId (required)
   * @param sessionId (required)
   * @param fileName (required)
   * @param file (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call propertyFilesAddAsync(
      Long accountId,
      Long propertySetId,
      Long sessionId,
      String fileName,
      File file,
      final ApiCallback<PropertyFilesAddResponse> callback,
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
        propertyFilesAddValidateBeforeCall(
            accountId,
            propertySetId,
            sessionId,
            fileName,
            file,
            progressListener,
            progressRequestListener,
            headerPair);
    Type localVarReturnType = new TypeToken<PropertyFilesAddResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}
