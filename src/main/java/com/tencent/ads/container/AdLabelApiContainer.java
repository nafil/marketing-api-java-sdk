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
import com.tencent.ads.api.AdLabelApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.AdLabelGetResponse;
import com.tencent.ads.model.AdLabelGetResponseData;
import java.util.List;

public class AdLabelApiContainer extends ApiContainer {

  @Inject AdLabelApi api;

  /**
   * 获取广告标签
   *
   * @param accountId (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return AdLabelGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AdLabelGetResponseData adLabelGet(
      Long accountId, List<String> fields, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    AdLabelGetResponse resp = api.adLabelGet(accountId, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
