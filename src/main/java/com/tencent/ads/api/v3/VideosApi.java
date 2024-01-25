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
import com.tencent.ads.model.v3.FilteringStruct;
import com.tencent.ads.model.v3.VideosAddResponse;
import com.tencent.ads.model.v3.VideosDeleteRequest;
import com.tencent.ads.model.v3.VideosDeleteResponse;
import com.tencent.ads.model.v3.VideosGetResponse;
import com.tencent.ads.model.v3.VideosUpdateRequest;
import com.tencent.ads.model.v3.VideosUpdateResponse;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VideosApi {
  private ApiClient apiClient;

  public VideosApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VideosApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for videosAdd
   *
   * @param accountId (required)
   * @param videoFile (required)
   * @param signature (required)
   * @param description (optional)
   * @param adcreativeTemplateId (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call videosAddCall(
      Long accountId,
      File videoFile,
      String signature,
      String description,
      Long adcreativeTemplateId,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/videos/add";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    if (accountId != null) localVarFormParams.put("account_id", accountId);
    if (videoFile != null) localVarFormParams.put("video_file", videoFile);
    if (signature != null) localVarFormParams.put("signature", signature);
    if (description != null) localVarFormParams.put("description", description);
    if (adcreativeTemplateId != null)
      localVarFormParams.put("adcreative_template_id", adcreativeTemplateId);

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
  private com.squareup.okhttp.Call videosAddValidateBeforeCall(
      Long accountId,
      File videoFile,
      String signature,
      String description,
      Long adcreativeTemplateId,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling videosAdd(Async)");
    }

    // verify the required parameter 'videoFile' is set
    if (videoFile == null) {
      throw new ApiException(
          "Missing the required parameter 'videoFile' when calling videosAdd(Async)");
    }

    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(
          "Missing the required parameter 'signature' when calling videosAdd(Async)");
    }

    com.squareup.okhttp.Call call =
        videosAddCall(
            accountId,
            videoFile,
            signature,
            description,
            adcreativeTemplateId,
            progressListener,
            progressRequestListener,
            headerPair);
    return call;
  }

  /**
   * 添加视频文件
   *
   * @param accountId (required)
   * @param videoFile (required)
   * @param signature (required)
   * @param description (optional)
   * @param adcreativeTemplateId (optional)
   * @return VideosAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public VideosAddResponse videosAdd(
      Long accountId,
      File videoFile,
      String signature,
      String description,
      Long adcreativeTemplateId,
      String... headerPair)
      throws ApiException {
    try {
      ApiClient.setBasePathTLVal("https://api.e.qq.com/v3.0");
      ApiResponse<VideosAddResponse> resp =
          videosAddWithHttpInfo(
              accountId, videoFile, signature, description, adcreativeTemplateId, headerPair);
      return resp.getData();
    } finally {
      ApiClient.clearBasePathTLVal();
    }
  }

  /**
   * 添加视频文件
   *
   * @param accountId (required)
   * @param videoFile (required)
   * @param signature (required)
   * @param description (optional)
   * @param adcreativeTemplateId (optional)
   * @return ApiResponse&lt;VideosAddResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<VideosAddResponse> videosAddWithHttpInfo(
      Long accountId,
      File videoFile,
      String signature,
      String description,
      Long adcreativeTemplateId,
      String... headerPair)
      throws ApiException {
    com.squareup.okhttp.Call call =
        videosAddValidateBeforeCall(
            accountId,
            videoFile,
            signature,
            description,
            adcreativeTemplateId,
            null,
            null,
            headerPair);
    Type localVarReturnType = new TypeToken<VideosAddResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 添加视频文件 (asynchronously)
   *
   * @param accountId (required)
   * @param videoFile (required)
   * @param signature (required)
   * @param description (optional)
   * @param adcreativeTemplateId (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call videosAddAsync(
      Long accountId,
      File videoFile,
      String signature,
      String description,
      Long adcreativeTemplateId,
      final ApiCallback<VideosAddResponse> callback,
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
          videosAddValidateBeforeCall(
              accountId,
              videoFile,
              signature,
              description,
              adcreativeTemplateId,
              progressListener,
              progressRequestListener,
              headerPair);
      Type localVarReturnType = new TypeToken<VideosAddResponse>() {}.getType();
      apiClient.executeAsync(call, localVarReturnType, callback);
      return call;
    } finally {
      ApiClient.clearBasePathTLVal();
    }
  }
  /**
   * Build call for videosDelete
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call videosDeleteCall(
      VideosDeleteRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/videos/delete";

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
  private com.squareup.okhttp.Call videosDeleteValidateBeforeCall(
      VideosDeleteRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(
          "Missing the required parameter 'data' when calling videosDelete(Async)");
    }

    com.squareup.okhttp.Call call =
        videosDeleteCall(data, progressListener, progressRequestListener, headerPair);
    return call;
  }

  /**
   * 删除视频
   *
   * @param data (required)
   * @return VideosDeleteResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public VideosDeleteResponse videosDelete(VideosDeleteRequest data, String... headerPair)
      throws ApiException {
    try {
      ApiClient.setBasePathTLVal("https://api.e.qq.com/v3.0");
      ApiResponse<VideosDeleteResponse> resp = videosDeleteWithHttpInfo(data, headerPair);
      return resp.getData();
    } finally {
      ApiClient.clearBasePathTLVal();
    }
  }

  /**
   * 删除视频
   *
   * @param data (required)
   * @return ApiResponse&lt;VideosDeleteResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<VideosDeleteResponse> videosDeleteWithHttpInfo(
      VideosDeleteRequest data, String... headerPair) throws ApiException {
    com.squareup.okhttp.Call call = videosDeleteValidateBeforeCall(data, null, null, headerPair);
    Type localVarReturnType = new TypeToken<VideosDeleteResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 删除视频 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call videosDeleteAsync(
      VideosDeleteRequest data,
      final ApiCallback<VideosDeleteResponse> callback,
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
          videosDeleteValidateBeforeCall(
              data, progressListener, progressRequestListener, headerPair);
      Type localVarReturnType = new TypeToken<VideosDeleteResponse>() {}.getType();
      apiClient.executeAsync(call, localVarReturnType, callback);
      return call;
    } finally {
      ApiClient.clearBasePathTLVal();
    }
  }
  /**
   * Build call for videosGet
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param labelId (optional)
   * @param businessScenario (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call videosGetCall(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      Long labelId,
      Long businessScenario,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/videos/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (accountId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
    if (filtering != null)
      localVarCollectionQueryParams.addAll(
          apiClient.parameterToPairs("multi", "filtering", filtering));
    if (page != null) localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
    if (pageSize != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
    if (labelId != null) localVarQueryParams.addAll(apiClient.parameterToPair("label_id", labelId));
    if (businessScenario != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("business_scenario", businessScenario));
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
  private com.squareup.okhttp.Call videosGetValidateBeforeCall(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      Long labelId,
      Long businessScenario,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling videosGet(Async)");
    }

    com.squareup.okhttp.Call call =
        videosGetCall(
            accountId,
            filtering,
            page,
            pageSize,
            labelId,
            businessScenario,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    return call;
  }

  /**
   * 获取视频文件
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param labelId (optional)
   * @param businessScenario (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return VideosGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public VideosGetResponse videosGet(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      Long labelId,
      Long businessScenario,
      List<String> fields,
      String... headerPair)
      throws ApiException {
    try {
      ApiClient.setBasePathTLVal("https://api.e.qq.com/v3.0");
      ApiResponse<VideosGetResponse> resp =
          videosGetWithHttpInfo(
              accountId, filtering, page, pageSize, labelId, businessScenario, fields, headerPair);
      return resp.getData();
    } finally {
      ApiClient.clearBasePathTLVal();
    }
  }

  /**
   * 获取视频文件
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param labelId (optional)
   * @param businessScenario (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;VideosGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<VideosGetResponse> videosGetWithHttpInfo(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      Long labelId,
      Long businessScenario,
      List<String> fields,
      String... headerPair)
      throws ApiException {
    com.squareup.okhttp.Call call =
        videosGetValidateBeforeCall(
            accountId,
            filtering,
            page,
            pageSize,
            labelId,
            businessScenario,
            fields,
            null,
            null,
            headerPair);
    Type localVarReturnType = new TypeToken<VideosGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 获取视频文件 (asynchronously)
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param labelId (optional)
   * @param businessScenario (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call videosGetAsync(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      Long labelId,
      Long businessScenario,
      List<String> fields,
      final ApiCallback<VideosGetResponse> callback,
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
          videosGetValidateBeforeCall(
              accountId,
              filtering,
              page,
              pageSize,
              labelId,
              businessScenario,
              fields,
              progressListener,
              progressRequestListener,
              headerPair);
      Type localVarReturnType = new TypeToken<VideosGetResponse>() {}.getType();
      apiClient.executeAsync(call, localVarReturnType, callback);
      return call;
    } finally {
      ApiClient.clearBasePathTLVal();
    }
  }
  /**
   * Build call for videosUpdate
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call videosUpdateCall(
      VideosUpdateRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/videos/update";

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
  private com.squareup.okhttp.Call videosUpdateValidateBeforeCall(
      VideosUpdateRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(
          "Missing the required parameter 'data' when calling videosUpdate(Async)");
    }

    com.squareup.okhttp.Call call =
        videosUpdateCall(data, progressListener, progressRequestListener, headerPair);
    return call;
  }

  /**
   * 修改视频信息
   *
   * @param data (required)
   * @return VideosUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public VideosUpdateResponse videosUpdate(VideosUpdateRequest data, String... headerPair)
      throws ApiException {
    try {
      ApiClient.setBasePathTLVal("https://api.e.qq.com/v3.0");
      ApiResponse<VideosUpdateResponse> resp = videosUpdateWithHttpInfo(data, headerPair);
      return resp.getData();
    } finally {
      ApiClient.clearBasePathTLVal();
    }
  }

  /**
   * 修改视频信息
   *
   * @param data (required)
   * @return ApiResponse&lt;VideosUpdateResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<VideosUpdateResponse> videosUpdateWithHttpInfo(
      VideosUpdateRequest data, String... headerPair) throws ApiException {
    com.squareup.okhttp.Call call = videosUpdateValidateBeforeCall(data, null, null, headerPair);
    Type localVarReturnType = new TypeToken<VideosUpdateResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 修改视频信息 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call videosUpdateAsync(
      VideosUpdateRequest data,
      final ApiCallback<VideosUpdateResponse> callback,
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
          videosUpdateValidateBeforeCall(
              data, progressListener, progressRequestListener, headerPair);
      Type localVarReturnType = new TypeToken<VideosUpdateResponse>() {}.getType();
      apiClient.executeAsync(call, localVarReturnType, callback);
      return call;
    } finally {
      ApiClient.clearBasePathTLVal();
    }
  }
}
