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
import com.tencent.ads.api.v3.BidwordFlowApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.BidwordFlowGetResponse;
import com.tencent.ads.model.v3.BidwordFlowGetResponseData;
import com.tencent.ads.model.v3.OrderByStructInfo;
import java.util.List;

public class BidwordFlowApiContainer extends ApiContainer {

  @Inject BidwordFlowApi api;

  /**
   * 查询关键词流量接口
   *
   * @param accountId (required)
   * @param bidwordList (required)
   * @param orderBy (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return BidwordFlowGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public BidwordFlowGetResponseData bidwordFlowGet(
      Long accountId,
      List<String> bidwordList,
      List<OrderByStructInfo> orderBy,
      List<String> fields,
      String... headerPair)
      throws ApiException, TencentAdsResponseException {
    BidwordFlowGetResponse resp =
        api.bidwordFlowGet(accountId, bidwordList, orderBy, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
