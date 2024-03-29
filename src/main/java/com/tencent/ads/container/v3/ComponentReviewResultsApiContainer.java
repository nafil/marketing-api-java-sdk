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
import com.tencent.ads.api.v3.ComponentReviewResultsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.ComponentReviewResultsGetResponse;
import com.tencent.ads.model.v3.ComponentReviewResultsGetResponseData;
import java.util.List;

public class ComponentReviewResultsApiContainer extends ApiContainer {

  @Inject ComponentReviewResultsApi api;

  /**
   * 查询组件审核结果
   *
   * @param accountId (required)
   * @param componentIdList (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return ComponentReviewResultsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ComponentReviewResultsGetResponseData componentReviewResultsGet(
      Long accountId, List<Long> componentIdList, List<String> fields, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    ComponentReviewResultsGetResponse resp =
        api.componentReviewResultsGet(accountId, componentIdList, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
