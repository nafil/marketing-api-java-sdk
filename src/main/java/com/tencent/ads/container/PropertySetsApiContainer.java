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
import com.tencent.ads.api.PropertySetsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.PropertySetsAddRequest;
import com.tencent.ads.model.PropertySetsAddResponse;
import com.tencent.ads.model.PropertySetsAddResponseData;
import com.tencent.ads.model.PropertySetsGetResponse;
import com.tencent.ads.model.PropertySetsGetResponseData;
import java.util.List;

public class PropertySetsApiContainer extends ApiContainer {

  @Inject PropertySetsApi api;

  /**
   * 创建属性数据源
   *
   * @param data (required)
   * @return PropertySetsAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public PropertySetsAddResponseData propertySetsAdd(
      PropertySetsAddRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    PropertySetsAddResponse resp = api.propertySetsAdd(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 获取属性数据源
   *
   * @param accountId (required)
   * @param propertySetId (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return PropertySetsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public PropertySetsGetResponseData propertySetsGet(
      Long accountId,
      Long propertySetId,
      Long page,
      Long pageSize,
      List<String> fields,
      String... headerPair)
      throws ApiException, TencentAdsResponseException {
    PropertySetsGetResponse resp =
        api.propertySetsGet(accountId, propertySetId, page, pageSize, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
