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
import com.tencent.ads.api.v3.MaterialLabelsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.MaterialLabelsAddRequest;
import com.tencent.ads.model.v3.MaterialLabelsAddResponse;
import com.tencent.ads.model.v3.MaterialLabelsAddResponseData;
import com.tencent.ads.model.v3.MaterialLabelsBindRequest;
import com.tencent.ads.model.v3.MaterialLabelsBindResponse;
import com.tencent.ads.model.v3.MaterialLabelsBindResponseData;
import com.tencent.ads.model.v3.MaterialLabelsDeleteRequest;
import com.tencent.ads.model.v3.MaterialLabelsDeleteResponse;
import com.tencent.ads.model.v3.MaterialLabelsGetResponse;
import com.tencent.ads.model.v3.MaterialLabelsGetResponseData;
import com.tencent.ads.model.v3.MaterialLabelsUpdateRequest;
import com.tencent.ads.model.v3.MaterialLabelsUpdateResponse;
import com.tencent.ads.model.v3.OrderByStruct;
import java.util.List;

public class MaterialLabelsApiContainer extends ApiContainer {

  @Inject MaterialLabelsApi api;

  /**
   * 创建素材标签
   *
   * @param data (required)
   * @return MaterialLabelsAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public MaterialLabelsAddResponseData materialLabelsAdd(
      MaterialLabelsAddRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    MaterialLabelsAddResponse resp = api.materialLabelsAdd(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 绑定标签素材关联关系
   *
   * @param data (required)
   * @return MaterialLabelsBindResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public MaterialLabelsBindResponseData materialLabelsBind(
      MaterialLabelsBindRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    MaterialLabelsBindResponse resp = api.materialLabelsBind(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 删除素材标签
   *
   * @param data (required)
   * @return MaterialLabelsDeleteResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public MaterialLabelsDeleteResponse materialLabelsDelete(
      MaterialLabelsDeleteRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    MaterialLabelsDeleteResponse resp = api.materialLabelsDelete(data, headerPair);
    handleResponse(gson.toJson(resp));

    return resp;
  }

  /**
   * 获取素材标签列表
   *
   * @param accountId (required)
   * @param labelId (optional)
   * @param labelName (optional)
   * @param firstLabelLevelIdList 一级标签类目ID列表 (optional)
   * @param secondLabelLevelIdList 二级标签类目ID列表 (optional)
   * @param needCount (optional)
   * @param businessScenario (optional)
   * @param orderBy (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return MaterialLabelsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public MaterialLabelsGetResponseData materialLabelsGet(
      Long accountId,
      Long labelId,
      String labelName,
      List<Long> firstLabelLevelIdList,
      List<Long> secondLabelLevelIdList,
      Boolean needCount,
      String businessScenario,
      List<OrderByStruct> orderBy,
      Long page,
      Long pageSize,
      List<String> fields,
      String... headerPair)
      throws ApiException, TencentAdsResponseException {
    MaterialLabelsGetResponse resp =
        api.materialLabelsGet(
            accountId,
            labelId,
            labelName,
            firstLabelLevelIdList,
            secondLabelLevelIdList,
            needCount,
            businessScenario,
            orderBy,
            page,
            pageSize,
            fields,
            headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 更新素材标签
   *
   * @param data (required)
   * @return MaterialLabelsUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public MaterialLabelsUpdateResponse materialLabelsUpdate(
      MaterialLabelsUpdateRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    MaterialLabelsUpdateResponse resp = api.materialLabelsUpdate(data, headerPair);
    handleResponse(gson.toJson(resp));

    return resp;
  }
}
