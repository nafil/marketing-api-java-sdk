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
import com.tencent.ads.api.v3.MarketingTargetAssetsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.MarketingTargetAssetsAddRequest;
import com.tencent.ads.model.v3.MarketingTargetAssetsAddResponse;
import com.tencent.ads.model.v3.MarketingTargetAssetsAddResponseData;
import com.tencent.ads.model.v3.MarketingTargetAssetsDeleteRequest;
import com.tencent.ads.model.v3.MarketingTargetAssetsDeleteResponse;
import com.tencent.ads.model.v3.MarketingTargetAssetsGetResponse;
import com.tencent.ads.model.v3.MarketingTargetAssetsGetResponseData;
import com.tencent.ads.model.v3.MarketingTargetAssetsUpdateRequest;
import com.tencent.ads.model.v3.MarketingTargetAssetsUpdateResponse;
import java.util.List;

public class MarketingTargetAssetsApiContainer extends ApiContainer {

  @Inject MarketingTargetAssetsApi api;

  /**
   * 创建推广内容资产
   *
   * @param data (required)
   * @return MarketingTargetAssetsAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public MarketingTargetAssetsAddResponseData marketingTargetAssetsAdd(
      MarketingTargetAssetsAddRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    MarketingTargetAssetsAddResponse resp = api.marketingTargetAssetsAdd(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 删除推广内容资产
   *
   * @param data (required)
   * @return MarketingTargetAssetsDeleteResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public MarketingTargetAssetsDeleteResponse marketingTargetAssetsDelete(
      MarketingTargetAssetsDeleteRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    MarketingTargetAssetsDeleteResponse resp = api.marketingTargetAssetsDelete(data, headerPair);
    handleResponse(gson.toJson(resp));

    return resp;
  }

  /**
   * 获取可投放推广内容资产列表
   *
   * @param accountId (required)
   * @param marketingTargetType (required)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return MarketingTargetAssetsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public MarketingTargetAssetsGetResponseData marketingTargetAssetsGet(
      Long accountId,
      String marketingTargetType,
      Long page,
      Long pageSize,
      List<String> fields,
      String... headerPair)
      throws ApiException, TencentAdsResponseException {
    MarketingTargetAssetsGetResponse resp =
        api.marketingTargetAssetsGet(
            accountId, marketingTargetType, page, pageSize, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 更新推广内容资产
   *
   * @param data (required)
   * @return MarketingTargetAssetsUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public MarketingTargetAssetsUpdateResponse marketingTargetAssetsUpdate(
      MarketingTargetAssetsUpdateRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    MarketingTargetAssetsUpdateResponse resp = api.marketingTargetAssetsUpdate(data, headerPair);
    handleResponse(gson.toJson(resp));

    return resp;
  }
}
