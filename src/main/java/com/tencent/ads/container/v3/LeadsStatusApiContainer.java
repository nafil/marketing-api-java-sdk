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
import com.tencent.ads.api.v3.LeadsStatusApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.LeadsStatusUpdateRequest;
import com.tencent.ads.model.v3.LeadsStatusUpdateResponse;
import com.tencent.ads.model.v3.LeadsStatusUpdateResponseData;

public class LeadsStatusApiContainer extends ApiContainer {

  @Inject LeadsStatusApi api;

  /**
   * 外部线索状态更新
   *
   * @param data (required)
   * @return LeadsStatusUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public LeadsStatusUpdateResponseData leadsStatusUpdate(
      LeadsStatusUpdateRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    LeadsStatusUpdateResponse resp = api.leadsStatusUpdate(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
