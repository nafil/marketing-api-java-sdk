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
import com.tencent.ads.api.v3.RtaApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.RtaInfoRequest;
import com.tencent.ads.model.v3.RtaInfoResponse;
import com.tencent.ads.model.v3.RtaInfoResponseData;

public class RtaApiContainer extends ApiContainer {

  @Inject RtaApi api;

  /**
   * 基本信息查询
   *
   * @param data (required)
   * @return RtaInfoResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public RtaInfoResponseData rtaInfo(RtaInfoRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    RtaInfoResponse resp = api.rtaInfo(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
