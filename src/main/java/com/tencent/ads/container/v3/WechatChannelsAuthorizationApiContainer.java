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
import com.tencent.ads.api.v3.WechatChannelsAuthorizationApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.WechatChannelsAuthorizationAddRequest;
import com.tencent.ads.model.v3.WechatChannelsAuthorizationAddResponse;
import com.tencent.ads.model.v3.WechatChannelsAuthorizationAddResponseData;
import com.tencent.ads.model.v3.WechatChannelsAuthorizationDeleteRequest;
import com.tencent.ads.model.v3.WechatChannelsAuthorizationDeleteResponse;
import com.tencent.ads.model.v3.WechatChannelsAuthorizationDeleteResponseData;
import com.tencent.ads.model.v3.WechatChannelsAuthorizationGetResponse;
import com.tencent.ads.model.v3.WechatChannelsAuthorizationGetResponseData;
import com.tencent.ads.model.v3.WechatChannelsAuthorizationUpdateRequest;
import com.tencent.ads.model.v3.WechatChannelsAuthorizationUpdateResponse;
import com.tencent.ads.model.v3.WechatChannelsAuthorizationUpdateResponseData;
import java.util.List;

public class WechatChannelsAuthorizationApiContainer extends ApiContainer {

  @Inject WechatChannelsAuthorizationApi api;

  /**
   * 创建视频号授权
   *
   * @param data (required)
   * @return WechatChannelsAuthorizationAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public WechatChannelsAuthorizationAddResponseData wechatChannelsAuthorizationAdd(
      WechatChannelsAuthorizationAddRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    WechatChannelsAuthorizationAddResponse resp =
        api.wechatChannelsAuthorizationAdd(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 删除视频号授权
   *
   * @param data (required)
   * @return WechatChannelsAuthorizationDeleteResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public WechatChannelsAuthorizationDeleteResponseData wechatChannelsAuthorizationDelete(
      WechatChannelsAuthorizationDeleteRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    WechatChannelsAuthorizationDeleteResponse resp =
        api.wechatChannelsAuthorizationDelete(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 获取视频号授权记录列表
   *
   * @param accountId (required)
   * @param wechatChannelsAccountName (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return WechatChannelsAuthorizationGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public WechatChannelsAuthorizationGetResponseData wechatChannelsAuthorizationGet(
      Long accountId,
      String wechatChannelsAccountName,
      Long page,
      Long pageSize,
      List<String> fields,
      String... headerPair)
      throws ApiException, TencentAdsResponseException {
    WechatChannelsAuthorizationGetResponse resp =
        api.wechatChannelsAuthorizationGet(
            accountId, wechatChannelsAccountName, page, pageSize, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 更新视频号授权
   *
   * @param data (required)
   * @return WechatChannelsAuthorizationUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public WechatChannelsAuthorizationUpdateResponseData wechatChannelsAuthorizationUpdate(
      WechatChannelsAuthorizationUpdateRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    WechatChannelsAuthorizationUpdateResponse resp =
        api.wechatChannelsAuthorizationUpdate(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
