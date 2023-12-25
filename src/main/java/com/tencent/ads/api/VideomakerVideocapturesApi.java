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
import com.tencent.ads.model.VideomakerVideocapturesAddResponse;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VideomakerVideocapturesApi {
  private ApiClient apiClient;

  public VideomakerVideocapturesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VideomakerVideocapturesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for videomakerVideocapturesAdd
   *
   * @param accountId (required)
   * @param videoId (optional)
   * @param videoFile (optional)
   * @param signature (optional)
   * @param number (optional)
   * @param returnImageIds (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call videomakerVideocapturesAddCall(
      Long accountId,
      String videoId,
      File videoFile,
      String signature,
      Long number,
      Boolean returnImageIds,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/videomaker_videocaptures/add";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    if (accountId != null) localVarFormParams.put("account_id", accountId);
    if (videoId != null) localVarFormParams.put("video_id", videoId);
    if (videoFile != null) localVarFormParams.put("video_file", videoFile);
    if (signature != null) localVarFormParams.put("signature", signature);
    if (number != null) localVarFormParams.put("number", number);
    if (returnImageIds != null) localVarFormParams.put("return_image_ids", returnImageIds);

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
  private com.squareup.okhttp.Call videomakerVideocapturesAddValidateBeforeCall(
      Long accountId,
      String videoId,
      File videoFile,
      String signature,
      Long number,
      Boolean returnImageIds,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling videomakerVideocapturesAdd(Async)");
    }

    com.squareup.okhttp.Call call =
        videomakerVideocapturesAddCall(
            accountId,
            videoId,
            videoFile,
            signature,
            number,
            returnImageIds,
            progressListener,
            progressRequestListener,
            headerPair);
    return call;
  }

  /**
   * 生成视频封面图
   *
   * @param accountId (required)
   * @param videoId (optional)
   * @param videoFile (optional)
   * @param signature (optional)
   * @param number (optional)
   * @param returnImageIds (optional)
   * @return VideomakerVideocapturesAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public VideomakerVideocapturesAddResponse videomakerVideocapturesAdd(
      Long accountId,
      String videoId,
      File videoFile,
      String signature,
      Long number,
      Boolean returnImageIds,
      String... headerPair)
      throws ApiException {
    ApiResponse<VideomakerVideocapturesAddResponse> resp =
        videomakerVideocapturesAddWithHttpInfo(
            accountId, videoId, videoFile, signature, number, returnImageIds, headerPair);
    return resp.getData();
  }

  /**
   * 生成视频封面图
   *
   * @param accountId (required)
   * @param videoId (optional)
   * @param videoFile (optional)
   * @param signature (optional)
   * @param number (optional)
   * @param returnImageIds (optional)
   * @return ApiResponse&lt;VideomakerVideocapturesAddResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<VideomakerVideocapturesAddResponse> videomakerVideocapturesAddWithHttpInfo(
      Long accountId,
      String videoId,
      File videoFile,
      String signature,
      Long number,
      Boolean returnImageIds,
      String... headerPair)
      throws ApiException {
    com.squareup.okhttp.Call call =
        videomakerVideocapturesAddValidateBeforeCall(
            accountId,
            videoId,
            videoFile,
            signature,
            number,
            returnImageIds,
            null,
            null,
            headerPair);
    Type localVarReturnType = new TypeToken<VideomakerVideocapturesAddResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 生成视频封面图 (asynchronously)
   *
   * @param accountId (required)
   * @param videoId (optional)
   * @param videoFile (optional)
   * @param signature (optional)
   * @param number (optional)
   * @param returnImageIds (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call videomakerVideocapturesAddAsync(
      Long accountId,
      String videoId,
      File videoFile,
      String signature,
      Long number,
      Boolean returnImageIds,
      final ApiCallback<VideomakerVideocapturesAddResponse> callback,
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
        videomakerVideocapturesAddValidateBeforeCall(
            accountId,
            videoId,
            videoFile,
            signature,
            number,
            returnImageIds,
            progressListener,
            progressRequestListener,
            headerPair);
    Type localVarReturnType = new TypeToken<VideomakerVideocapturesAddResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}
