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

package com.tencent.ads.container.v3;

import com.google.inject.Inject;
import com.tencent.ads.ApiContainer;
import com.tencent.ads.ApiException;
import com.tencent.ads.anno.*;
import com.tencent.ads.api.v3.AsyncReportsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.AsyncReportsAddRequest;
import com.tencent.ads.model.v3.AsyncReportsAddResponse;
import com.tencent.ads.model.v3.AsyncReportsAddResponseData;
import com.tencent.ads.model.v3.AsyncReportsGetRequest;
import com.tencent.ads.model.v3.AsyncReportsGetResponse;
import com.tencent.ads.model.v3.AsyncReportsGetResponseData;

public class AsyncReportsApiContainer extends ApiContainer {

  @Inject AsyncReportsApi api;

  /**
   * 创建异步报表任务
   *
   * @param data (required)
   * @return AsyncReportsAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AsyncReportsAddResponseData asyncReportsAdd(
      AsyncReportsAddRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    AsyncReportsAddResponse resp = api.asyncReportsAdd(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 获取异步报表任务
   *
   * @param data (required)
   * @return AsyncReportsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AsyncReportsGetResponseData asyncReportsGet(
      AsyncReportsGetRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    AsyncReportsGetResponse resp = api.asyncReportsGet(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
