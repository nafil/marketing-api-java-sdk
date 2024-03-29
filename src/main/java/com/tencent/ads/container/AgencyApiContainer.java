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
import com.tencent.ads.api.AgencyApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.AgencyGetResponse;
import com.tencent.ads.model.AgencyGetResponseData;
import java.util.List;

public class AgencyApiContainer extends ApiContainer {

  @Inject AgencyApi api;

  /**
   * 查询腾讯广告服务商信息
   *
   * @param fields (required)
   * @param page (required)
   * @param pageSize (required)
   * @param accountId (optional)
   * @return AgencyGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AgencyGetResponseData agencyGet(
      List<String> fields, Long page, Long pageSize, Long accountId, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    AgencyGetResponse resp = api.agencyGet(fields, page, pageSize, accountId, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
