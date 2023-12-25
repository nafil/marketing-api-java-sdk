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
import com.tencent.ads.api.AdcreativesApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.AdcreativesAddRequest;
import com.tencent.ads.model.AdcreativesAddResponse;
import com.tencent.ads.model.AdcreativesAddResponseData;
import com.tencent.ads.model.AdcreativesDeleteRequest;
import com.tencent.ads.model.AdcreativesDeleteResponse;
import com.tencent.ads.model.AdcreativesDeleteResponseData;
import com.tencent.ads.model.AdcreativesGetResponse;
import com.tencent.ads.model.AdcreativesGetResponseData;
import com.tencent.ads.model.AdcreativesUpdateRequest;
import com.tencent.ads.model.AdcreativesUpdateResponse;
import com.tencent.ads.model.AdcreativesUpdateResponseData;
import com.tencent.ads.model.FilteringStruct;
import java.util.List;

public class AdcreativesApiContainer extends ApiContainer {

  @Inject AdcreativesApi api;

  /**
   * 创建广告创意
   *
   * @param data (required)
   * @return AdcreativesAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AdcreativesAddResponseData adcreativesAdd(AdcreativesAddRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    AdcreativesAddResponse resp = api.adcreativesAdd(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 删除广告创意
   *
   * @param data (required)
   * @return AdcreativesDeleteResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AdcreativesDeleteResponseData adcreativesDelete(
      AdcreativesDeleteRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    AdcreativesDeleteResponse resp = api.adcreativesDelete(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 获取广告创意
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param isDeleted (optional)
   * @param linkPageTypeCompatible (optional)
   * @param weixinOfficialAccountsUpgradeEnabled (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return AdcreativesGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AdcreativesGetResponseData adcreativesGet(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      Boolean isDeleted,
      Boolean linkPageTypeCompatible,
      Boolean weixinOfficialAccountsUpgradeEnabled,
      List<String> fields,
      String... headerPair)
      throws ApiException, TencentAdsResponseException {
    AdcreativesGetResponse resp =
        api.adcreativesGet(
            accountId,
            filtering,
            page,
            pageSize,
            isDeleted,
            linkPageTypeCompatible,
            weixinOfficialAccountsUpgradeEnabled,
            fields,
            headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 更新广告创意
   *
   * @param data (required)
   * @return AdcreativesUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AdcreativesUpdateResponseData adcreativesUpdate(
      AdcreativesUpdateRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    AdcreativesUpdateResponse resp = api.adcreativesUpdate(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
