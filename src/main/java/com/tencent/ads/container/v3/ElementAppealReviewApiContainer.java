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
import com.tencent.ads.api.v3.ElementAppealReviewApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.ElementAppealReviewAddRequest;
import com.tencent.ads.model.v3.ElementAppealReviewAddResponse;
import com.tencent.ads.model.v3.ElementAppealReviewGetResponse;
import com.tencent.ads.model.v3.ElementAppealReviewGetResponseData;
import java.util.List;

public class ElementAppealReviewApiContainer extends ApiContainer {

  @Inject ElementAppealReviewApi api;

  /**
   * 发起元素申诉复审
   *
   * @param data (required)
   * @return ElementAppealReviewAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ElementAppealReviewAddResponse elementAppealReviewAdd(
      ElementAppealReviewAddRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    ElementAppealReviewAddResponse resp = api.elementAppealReviewAdd(data, headerPair);
    handleResponse(gson.toJson(resp));

    return resp;
  }

  /**
   * 获取元素申诉复审结果
   *
   * @param accountId (required)
   * @param dynamicCreativeId (required)
   * @param componentId (required)
   * @param elementId (required)
   * @param elementFingerPrint (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return ElementAppealReviewGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ElementAppealReviewGetResponseData elementAppealReviewGet(
      Long accountId,
      Long dynamicCreativeId,
      Long componentId,
      Long elementId,
      String elementFingerPrint,
      List<String> fields,
      String... headerPair)
      throws ApiException, TencentAdsResponseException {
    ElementAppealReviewGetResponse resp =
        api.elementAppealReviewGet(
            accountId,
            dynamicCreativeId,
            componentId,
            elementId,
            elementFingerPrint,
            fields,
            headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
