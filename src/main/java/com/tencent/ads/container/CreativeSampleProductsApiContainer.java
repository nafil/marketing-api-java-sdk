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
import com.tencent.ads.api.CreativeSampleProductsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.CreativeSampleProductsGetResponse;
import com.tencent.ads.model.CreativeSampleProductsGetResponseData;
import java.util.List;

public class CreativeSampleProductsApiContainer extends ApiContainer {

  @Inject CreativeSampleProductsApi api;

  /**
   * 获取创意示例商品列表
   *
   * @param accountId (required)
   * @param productCatalogId (required)
   * @param productOuterIds (optional)
   * @param productSeriesId (optional)
   * @param templateId (optional)
   * @param templateType (optional)
   * @param imageId (optional)
   * @param videoId (optional)
   * @param productFields (optional)
   * @param limit (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return CreativeSampleProductsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public CreativeSampleProductsGetResponseData creativeSampleProductsGet(
      Long accountId,
      Long productCatalogId,
      List<String> productOuterIds,
      Long productSeriesId,
      Long templateId,
      String templateType,
      String imageId,
      String videoId,
      List<String> productFields,
      Long limit,
      List<String> fields,
      String... headerPair)
      throws ApiException, TencentAdsResponseException {
    CreativeSampleProductsGetResponse resp =
        api.creativeSampleProductsGet(
            accountId,
            productCatalogId,
            productOuterIds,
            productSeriesId,
            templateId,
            templateType,
            imageId,
            videoId,
            productFields,
            limit,
            fields,
            headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}