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
import com.tencent.ads.model.v3.AdgroupsAddRequest;
import com.tencent.ads.model.v3.AdgroupsAddResponse;
import com.tencent.ads.model.v3.AdgroupsDeleteRequest;
import com.tencent.ads.model.v3.AdgroupsDeleteResponse;
import com.tencent.ads.model.v3.AdgroupsGetResponse;
import com.tencent.ads.model.v3.AdgroupsUpdateRequest;
import com.tencent.ads.model.v3.AdgroupsUpdateResponse;
import com.tencent.ads.model.v3.FilteringStruct;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdgroupsApi {
  private ApiClient apiClient;

  public AdgroupsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AdgroupsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for adgroupsAdd
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call adgroupsAddCall(
      AdgroupsAddRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/adgroups/add";

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
  private com.squareup.okhttp.Call adgroupsAddValidateBeforeCall(
      AdgroupsAddRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(
          "Missing the required parameter 'data' when calling adgroupsAdd(Async)");
    }

    com.squareup.okhttp.Call call =
        adgroupsAddCall(data, progressListener, progressRequestListener, headerPair);
    return call;
  }

  /**
   * 创建广告组
   *
   * @param data (required)
   * @return AdgroupsAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AdgroupsAddResponse adgroupsAdd(AdgroupsAddRequest data, String... headerPair)
      throws ApiException {
    ApiResponse<AdgroupsAddResponse> resp = adgroupsAddWithHttpInfo(data, headerPair);
    return resp.getData();
  }

  /**
   * 创建广告组
   *
   * @param data (required)
   * @return ApiResponse&lt;AdgroupsAddResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<AdgroupsAddResponse> adgroupsAddWithHttpInfo(
      AdgroupsAddRequest data, String... headerPair) throws ApiException {
    com.squareup.okhttp.Call call = adgroupsAddValidateBeforeCall(data, null, null, headerPair);
    Type localVarReturnType = new TypeToken<AdgroupsAddResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 创建广告组 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call adgroupsAddAsync(
      AdgroupsAddRequest data,
      final ApiCallback<AdgroupsAddResponse> callback,
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
        adgroupsAddValidateBeforeCall(data, progressListener, progressRequestListener, headerPair);
    Type localVarReturnType = new TypeToken<AdgroupsAddResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  /**
   * Build call for adgroupsDelete
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call adgroupsDeleteCall(
      AdgroupsDeleteRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/adgroups/delete";

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
  private com.squareup.okhttp.Call adgroupsDeleteValidateBeforeCall(
      AdgroupsDeleteRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(
          "Missing the required parameter 'data' when calling adgroupsDelete(Async)");
    }

    com.squareup.okhttp.Call call =
        adgroupsDeleteCall(data, progressListener, progressRequestListener, headerPair);
    return call;
  }

  /**
   * 删除广告组
   *
   * @param data (required)
   * @return AdgroupsDeleteResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AdgroupsDeleteResponse adgroupsDelete(AdgroupsDeleteRequest data, String... headerPair)
      throws ApiException {
    ApiResponse<AdgroupsDeleteResponse> resp = adgroupsDeleteWithHttpInfo(data, headerPair);
    return resp.getData();
  }

  /**
   * 删除广告组
   *
   * @param data (required)
   * @return ApiResponse&lt;AdgroupsDeleteResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<AdgroupsDeleteResponse> adgroupsDeleteWithHttpInfo(
      AdgroupsDeleteRequest data, String... headerPair) throws ApiException {
    com.squareup.okhttp.Call call = adgroupsDeleteValidateBeforeCall(data, null, null, headerPair);
    Type localVarReturnType = new TypeToken<AdgroupsDeleteResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 删除广告组 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call adgroupsDeleteAsync(
      AdgroupsDeleteRequest data,
      final ApiCallback<AdgroupsDeleteResponse> callback,
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
        adgroupsDeleteValidateBeforeCall(
            data, progressListener, progressRequestListener, headerPair);
    Type localVarReturnType = new TypeToken<AdgroupsDeleteResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  /**
   * Build call for adgroupsGet
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param isDeleted (optional)
   * @param fields (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call adgroupsGetCall(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      Boolean isDeleted,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/adgroups/get";

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
    if (isDeleted != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("is_deleted", isDeleted));
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
  private com.squareup.okhttp.Call adgroupsGetValidateBeforeCall(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      Boolean isDeleted,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling adgroupsGet(Async)");
    }

    com.squareup.okhttp.Call call =
        adgroupsGetCall(
            accountId,
            filtering,
            page,
            pageSize,
            isDeleted,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    return call;
  }

  /**
   * 获取广告组
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param isDeleted (optional)
   * @param fields (optional)
   * @return AdgroupsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AdgroupsGetResponse adgroupsGet(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      Boolean isDeleted,
      List<String> fields,
      String... headerPair)
      throws ApiException {
    ApiResponse<AdgroupsGetResponse> resp =
        adgroupsGetWithHttpInfo(
            accountId, filtering, page, pageSize, isDeleted, fields, headerPair);
    return resp.getData();
  }

  /**
   * 获取广告组
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param isDeleted (optional)
   * @param fields (optional)
   * @return ApiResponse&lt;AdgroupsGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<AdgroupsGetResponse> adgroupsGetWithHttpInfo(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      Boolean isDeleted,
      List<String> fields,
      String... headerPair)
      throws ApiException {
    com.squareup.okhttp.Call call =
        adgroupsGetValidateBeforeCall(
            accountId, filtering, page, pageSize, isDeleted, fields, null, null, headerPair);
    Type localVarReturnType = new TypeToken<AdgroupsGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 获取广告组 (asynchronously)
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param isDeleted (optional)
   * @param fields (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call adgroupsGetAsync(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      Boolean isDeleted,
      List<String> fields,
      final ApiCallback<AdgroupsGetResponse> callback,
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
        adgroupsGetValidateBeforeCall(
            accountId,
            filtering,
            page,
            pageSize,
            isDeleted,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    Type localVarReturnType = new TypeToken<AdgroupsGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  /**
   * Build call for adgroupsUpdate
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call adgroupsUpdateCall(
      AdgroupsUpdateRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/adgroups/update";

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
  private com.squareup.okhttp.Call adgroupsUpdateValidateBeforeCall(
      AdgroupsUpdateRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(
          "Missing the required parameter 'data' when calling adgroupsUpdate(Async)");
    }

    com.squareup.okhttp.Call call =
        adgroupsUpdateCall(data, progressListener, progressRequestListener, headerPair);
    return call;
  }

  /**
   * 更新广告组
   *
   * @param data (required)
   * @return AdgroupsUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AdgroupsUpdateResponse adgroupsUpdate(AdgroupsUpdateRequest data, String... headerPair)
      throws ApiException {
    ApiResponse<AdgroupsUpdateResponse> resp = adgroupsUpdateWithHttpInfo(data, headerPair);
    return resp.getData();
  }

  /**
   * 更新广告组
   *
   * @param data (required)
   * @return ApiResponse&lt;AdgroupsUpdateResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<AdgroupsUpdateResponse> adgroupsUpdateWithHttpInfo(
      AdgroupsUpdateRequest data, String... headerPair) throws ApiException {
    com.squareup.okhttp.Call call = adgroupsUpdateValidateBeforeCall(data, null, null, headerPair);
    Type localVarReturnType = new TypeToken<AdgroupsUpdateResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 更新广告组 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call adgroupsUpdateAsync(
      AdgroupsUpdateRequest data,
      final ApiCallback<AdgroupsUpdateResponse> callback,
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
        adgroupsUpdateValidateBeforeCall(
            data, progressListener, progressRequestListener, headerPair);
    Type localVarReturnType = new TypeToken<AdgroupsUpdateResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}