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
import com.tencent.ads.api.v3.MarketingTargetAssetPropertiesApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.MarketingTargetAssetPropertiesGetResponse;
import com.tencent.ads.model.v3.MarketingTargetAssetPropertiesGetResponseData;
import java.util.List;

public class MarketingTargetAssetPropertiesApiContainer extends ApiContainer {

  @Inject MarketingTargetAssetPropertiesApi api;

  /**
   * 获取可用的推广内容资产属性
   *
   * @param organizationId (required)
   * @param marketingTargetType (required)
   * @param marketingAssetType (optional)
   * @param marketingAssetCategory (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return MarketingTargetAssetPropertiesGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public MarketingTargetAssetPropertiesGetResponseData marketingTargetAssetPropertiesGet(
      Long organizationId,
      String marketingTargetType,
      String marketingAssetType,
      String marketingAssetCategory,
      List<String> fields,
      String... headerPair)
      throws ApiException, TencentAdsResponseException {
    MarketingTargetAssetPropertiesGetResponse resp =
        api.marketingTargetAssetPropertiesGet(
            organizationId,
            marketingTargetType,
            marketingAssetType,
            marketingAssetCategory,
            fields,
            headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
