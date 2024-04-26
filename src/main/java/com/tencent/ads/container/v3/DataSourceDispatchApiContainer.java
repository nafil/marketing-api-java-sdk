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
import com.tencent.ads.api.v3.DataSourceDispatchApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.DataSourceDispatchGetResponse;
import com.tencent.ads.model.v3.DataSourceDispatchGetResponseData;
import java.util.List;

public class DataSourceDispatchApiContainer extends ApiContainer {

  @Inject DataSourceDispatchApi api;

  /**
   * 数据源分发关系获取
   *
   * @param accountId (required)
   * @param userActionSetId (optional)
   * @param type (optional)
   * @param name (optional)
   * @param scenes (optional)
   * @param switchType (optional)
   * @param accessWay (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return DataSourceDispatchGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public DataSourceDispatchGetResponseData dataSourceDispatchGet(
      Long accountId,
      Long userActionSetId,
      String type,
      String name,
      List<String> scenes,
      String switchType,
      String accessWay,
      List<String> fields,
      String... headerPair)
      throws ApiException, TencentAdsResponseException {
    DataSourceDispatchGetResponse resp =
        api.dataSourceDispatchGet(
            accountId,
            userActionSetId,
            type,
            name,
            scenes,
            switchType,
            accessWay,
            fields,
            headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}