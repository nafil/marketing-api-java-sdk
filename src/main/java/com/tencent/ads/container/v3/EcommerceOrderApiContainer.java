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
import com.tencent.ads.api.v3.EcommerceOrderApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.DateRange;
import com.tencent.ads.model.v3.EcommerceOrderGetResponse;
import com.tencent.ads.model.v3.EcommerceOrderGetResponseData;
import com.tencent.ads.model.v3.EcommerceOrderUpdateRequest;
import com.tencent.ads.model.v3.EcommerceOrderUpdateResponse;
import com.tencent.ads.model.v3.FilteringStruct;
import java.util.List;

public class EcommerceOrderApiContainer extends ApiContainer {

  @Inject EcommerceOrderApi api;

  /**
   * 获取订单
   *
   * @param accountId (required)
   * @param dateRange (required)
   * @param filtering (optional)
   * @param date (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return EcommerceOrderGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public EcommerceOrderGetResponseData ecommerceOrderGet(
      Long accountId,
      DateRange dateRange,
      List<FilteringStruct> filtering,
      String date,
      Long page,
      Long pageSize,
      List<String> fields,
      String... headerPair)
      throws ApiException, TencentAdsResponseException {
    EcommerceOrderGetResponse resp =
        api.ecommerceOrderGet(
            accountId, dateRange, filtering, date, page, pageSize, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 更新订单
   *
   * @param data (required)
   * @return EcommerceOrderUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public EcommerceOrderUpdateResponse ecommerceOrderUpdate(
      EcommerceOrderUpdateRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    EcommerceOrderUpdateResponse resp = api.ecommerceOrderUpdate(data, headerPair);
    handleResponse(gson.toJson(resp));

    return resp;
  }
}