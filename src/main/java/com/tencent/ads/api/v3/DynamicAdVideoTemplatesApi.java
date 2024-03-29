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
import com.tencent.ads.model.v3.DynamicAdVideoTemplatesGetResponse;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DynamicAdVideoTemplatesApi {
  private ApiClient apiClient;

  public DynamicAdVideoTemplatesApi() {
    this(Configuration.getV3DefaultApiClient());
  }

  public DynamicAdVideoTemplatesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for dynamicAdVideoTemplatesGet
   *
   * @param accountId (required)
   * @param productCatalogId (required)
   * @param adcreativeTemplateId (required)
   * @param productMode (required)
   * @param supportChannel (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param templateIdList (optional)
   * @param templateName (optional)
   * @param dynamicAdTemplateOwnershipType (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call dynamicAdVideoTemplatesGetCall(
      Long accountId,
      Long productCatalogId,
      Long adcreativeTemplateId,
      String productMode,
      Boolean supportChannel,
      Long page,
      Long pageSize,
      List<Long> templateIdList,
      String templateName,
      String dynamicAdTemplateOwnershipType,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/dynamic_ad_video_templates/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (accountId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
    if (productCatalogId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("product_catalog_id", productCatalogId));
    if (adcreativeTemplateId != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair("adcreative_template_id", adcreativeTemplateId));
    if (productMode != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("product_mode", productMode));
    if (supportChannel != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("support_channel", supportChannel));
    if (page != null) localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
    if (pageSize != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
    if (templateIdList != null)
      localVarCollectionQueryParams.addAll(
          apiClient.parameterToPairs("multi", "template_id_list", templateIdList));
    if (templateName != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("template_name", templateName));
    if (dynamicAdTemplateOwnershipType != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair(
              "dynamic_ad_template_ownership_type", dynamicAdTemplateOwnershipType));
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
  private com.squareup.okhttp.Call dynamicAdVideoTemplatesGetValidateBeforeCall(
      Long accountId,
      Long productCatalogId,
      Long adcreativeTemplateId,
      String productMode,
      Boolean supportChannel,
      Long page,
      Long pageSize,
      List<Long> templateIdList,
      String templateName,
      String dynamicAdTemplateOwnershipType,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling dynamicAdVideoTemplatesGet(Async)");
    }

    // verify the required parameter 'productCatalogId' is set
    if (productCatalogId == null) {
      throw new ApiException(
          "Missing the required parameter 'productCatalogId' when calling dynamicAdVideoTemplatesGet(Async)");
    }

    // verify the required parameter 'adcreativeTemplateId' is set
    if (adcreativeTemplateId == null) {
      throw new ApiException(
          "Missing the required parameter 'adcreativeTemplateId' when calling dynamicAdVideoTemplatesGet(Async)");
    }

    // verify the required parameter 'productMode' is set
    if (productMode == null) {
      throw new ApiException(
          "Missing the required parameter 'productMode' when calling dynamicAdVideoTemplatesGet(Async)");
    }

    com.squareup.okhttp.Call call =
        dynamicAdVideoTemplatesGetCall(
            accountId,
            productCatalogId,
            adcreativeTemplateId,
            productMode,
            supportChannel,
            page,
            pageSize,
            templateIdList,
            templateName,
            dynamicAdTemplateOwnershipType,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    return call;
  }

  /**
   * 获取动态商品视频模板
   *
   * @param accountId (required)
   * @param productCatalogId (required)
   * @param adcreativeTemplateId (required)
   * @param productMode (required)
   * @param supportChannel (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param templateIdList (optional)
   * @param templateName (optional)
   * @param dynamicAdTemplateOwnershipType (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return DynamicAdVideoTemplatesGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public DynamicAdVideoTemplatesGetResponse dynamicAdVideoTemplatesGet(
      Long accountId,
      Long productCatalogId,
      Long adcreativeTemplateId,
      String productMode,
      Boolean supportChannel,
      Long page,
      Long pageSize,
      List<Long> templateIdList,
      String templateName,
      String dynamicAdTemplateOwnershipType,
      List<String> fields,
      String... headerPair)
      throws ApiException {
    ApiResponse<DynamicAdVideoTemplatesGetResponse> resp =
        dynamicAdVideoTemplatesGetWithHttpInfo(
            accountId,
            productCatalogId,
            adcreativeTemplateId,
            productMode,
            supportChannel,
            page,
            pageSize,
            templateIdList,
            templateName,
            dynamicAdTemplateOwnershipType,
            fields,
            headerPair);
    return resp.getData();
  }

  /**
   * 获取动态商品视频模板
   *
   * @param accountId (required)
   * @param productCatalogId (required)
   * @param adcreativeTemplateId (required)
   * @param productMode (required)
   * @param supportChannel (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param templateIdList (optional)
   * @param templateName (optional)
   * @param dynamicAdTemplateOwnershipType (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;DynamicAdVideoTemplatesGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<DynamicAdVideoTemplatesGetResponse> dynamicAdVideoTemplatesGetWithHttpInfo(
      Long accountId,
      Long productCatalogId,
      Long adcreativeTemplateId,
      String productMode,
      Boolean supportChannel,
      Long page,
      Long pageSize,
      List<Long> templateIdList,
      String templateName,
      String dynamicAdTemplateOwnershipType,
      List<String> fields,
      String... headerPair)
      throws ApiException {
    com.squareup.okhttp.Call call =
        dynamicAdVideoTemplatesGetValidateBeforeCall(
            accountId,
            productCatalogId,
            adcreativeTemplateId,
            productMode,
            supportChannel,
            page,
            pageSize,
            templateIdList,
            templateName,
            dynamicAdTemplateOwnershipType,
            fields,
            null,
            null,
            headerPair);
    Type localVarReturnType = new TypeToken<DynamicAdVideoTemplatesGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 获取动态商品视频模板 (asynchronously)
   *
   * @param accountId (required)
   * @param productCatalogId (required)
   * @param adcreativeTemplateId (required)
   * @param productMode (required)
   * @param supportChannel (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param templateIdList (optional)
   * @param templateName (optional)
   * @param dynamicAdTemplateOwnershipType (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call dynamicAdVideoTemplatesGetAsync(
      Long accountId,
      Long productCatalogId,
      Long adcreativeTemplateId,
      String productMode,
      Boolean supportChannel,
      Long page,
      Long pageSize,
      List<Long> templateIdList,
      String templateName,
      String dynamicAdTemplateOwnershipType,
      List<String> fields,
      final ApiCallback<DynamicAdVideoTemplatesGetResponse> callback,
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
        dynamicAdVideoTemplatesGetValidateBeforeCall(
            accountId,
            productCatalogId,
            adcreativeTemplateId,
            productMode,
            supportChannel,
            page,
            pageSize,
            templateIdList,
            templateName,
            dynamicAdTemplateOwnershipType,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    Type localVarReturnType = new TypeToken<DynamicAdVideoTemplatesGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}
