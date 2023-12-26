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
import com.tencent.ads.api.v3.AdDiagnosisApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.AdDiagnosisGetResponse;
import com.tencent.ads.model.v3.AdDiagnosisGetResponseData;
import java.util.List;

public class AdDiagnosisApiContainer extends ApiContainer {

  @Inject AdDiagnosisApi api;

  /**
   * 获取广告诊断信息
   *
   * @param accountId (required)
   * @param adgroupIdList (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return AdDiagnosisGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AdDiagnosisGetResponseData adDiagnosisGet(
      Long accountId, List<Long> adgroupIdList, List<String> fields, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    AdDiagnosisGetResponse resp = api.adDiagnosisGet(accountId, adgroupIdList, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}