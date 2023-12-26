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
import com.tencent.ads.api.v3.FundsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.FundsGetResponse;
import com.tencent.ads.model.v3.FundsGetResponseData;
import java.util.List;

public class FundsApiContainer extends ApiContainer {

  @Inject FundsApi api;

  /**
   * 获取资金账户信息
   *
   * @param advertiserId (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return FundsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public FundsGetResponseData fundsGet(Long advertiserId, List<String> fields, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    FundsGetResponse resp = api.fundsGet(advertiserId, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}