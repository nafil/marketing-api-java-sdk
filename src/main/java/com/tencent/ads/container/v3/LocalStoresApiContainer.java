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
import com.tencent.ads.api.v3.LocalStoresApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.FilteringStruct;
import com.tencent.ads.model.v3.LocalStoresAddRequest;
import com.tencent.ads.model.v3.LocalStoresAddResponse;
import com.tencent.ads.model.v3.LocalStoresAddResponseData;
import com.tencent.ads.model.v3.LocalStoresDeleteRequest;
import com.tencent.ads.model.v3.LocalStoresDeleteResponse;
import com.tencent.ads.model.v3.LocalStoresDeleteResponseData;
import com.tencent.ads.model.v3.LocalStoresGetResponse;
import com.tencent.ads.model.v3.LocalStoresGetResponseData;
import com.tencent.ads.model.v3.LocalStoresUpdateRequest;
import com.tencent.ads.model.v3.LocalStoresUpdateResponse;
import com.tencent.ads.model.v3.LocalStoresUpdateResponseData;
import java.util.List;

public class LocalStoresApiContainer extends ApiContainer {

  @Inject LocalStoresApi api;

  /**
   * 批量录入门店
   *
   * @param data (required)
   * @return LocalStoresAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public LocalStoresAddResponseData localStoresAdd(LocalStoresAddRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    LocalStoresAddResponse resp = api.localStoresAdd(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 批量删除门店信息
   *
   * @param data (required)
   * @return LocalStoresDeleteResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public LocalStoresDeleteResponseData localStoresDelete(
      LocalStoresDeleteRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    LocalStoresDeleteResponse resp = api.localStoresDelete(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 查询门店信息
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return LocalStoresGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public LocalStoresGetResponseData localStoresGet(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields,
      String... headerPair)
      throws ApiException, TencentAdsResponseException {
    LocalStoresGetResponse resp =
        api.localStoresGet(accountId, filtering, page, pageSize, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 更新门店信息
   *
   * @param data (required)
   * @return LocalStoresUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public LocalStoresUpdateResponseData localStoresUpdate(
      LocalStoresUpdateRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    LocalStoresUpdateResponse resp = api.localStoresUpdate(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
