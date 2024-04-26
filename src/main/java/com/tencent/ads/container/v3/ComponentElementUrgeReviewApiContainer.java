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
import com.tencent.ads.api.v3.ComponentElementUrgeReviewApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.ComponentElementUrgeReviewAddRequest;
import com.tencent.ads.model.v3.ComponentElementUrgeReviewAddResponse;
import com.tencent.ads.model.v3.ComponentElementUrgeReviewAddResponseData;
import com.tencent.ads.model.v3.ComponentElementUrgeReviewGetResponse;
import com.tencent.ads.model.v3.ComponentElementUrgeReviewGetResponseData;
import java.util.List;

public class ComponentElementUrgeReviewApiContainer extends ApiContainer {

  @Inject ComponentElementUrgeReviewApi api;

  /**
   * 创意组件元素催审
   *
   * @param data (required)
   * @return ComponentElementUrgeReviewAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ComponentElementUrgeReviewAddResponseData componentElementUrgeReviewAdd(
      ComponentElementUrgeReviewAddRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    ComponentElementUrgeReviewAddResponse resp =
        api.componentElementUrgeReviewAdd(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 获取创意组件元素催审状态
   *
   * @param accountId (required)
   * @param dynamicCreativeId (required)
   * @param componentIdList (optional)
   * @param elementFingerprintList (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ComponentElementUrgeReviewGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ComponentElementUrgeReviewGetResponseData componentElementUrgeReviewGet(
      Long accountId,
      Long dynamicCreativeId,
      List<Long> componentIdList,
      List<String> elementFingerprintList,
      List<String> fields,
      String... headerPair)
      throws ApiException, TencentAdsResponseException {
    ComponentElementUrgeReviewGetResponse resp =
        api.componentElementUrgeReviewGet(
            accountId,
            dynamicCreativeId,
            componentIdList,
            elementFingerprintList,
            fields,
            headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
