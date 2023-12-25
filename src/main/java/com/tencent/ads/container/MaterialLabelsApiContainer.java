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

package com.tencent.ads.container;

import com.google.inject.Inject;
import com.tencent.ads.ApiContainer;
import com.tencent.ads.ApiException;
import com.tencent.ads.anno.*;
import com.tencent.ads.api.MaterialLabelsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.MaterialLabelsAddRequest;
import com.tencent.ads.model.MaterialLabelsAddResponse;
import com.tencent.ads.model.MaterialLabelsAddResponseData;
import com.tencent.ads.model.MaterialLabelsGetRequest;
import com.tencent.ads.model.MaterialLabelsGetResponse;
import com.tencent.ads.model.MaterialLabelsGetResponseData;

public class MaterialLabelsApiContainer extends ApiContainer {

  @Inject MaterialLabelsApi api;

  /**
   * 素材标签保存
   *
   * @param data (required)
   * @return MaterialLabelsAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public MaterialLabelsAddResponseData materialLabelsAdd(
      MaterialLabelsAddRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    MaterialLabelsAddResponse resp = api.materialLabelsAdd(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 素材标签列表
   *
   * @param data (required)
   * @return MaterialLabelsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public MaterialLabelsGetResponseData materialLabelsGet(
      MaterialLabelsGetRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    MaterialLabelsGetResponse resp = api.materialLabelsGet(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
