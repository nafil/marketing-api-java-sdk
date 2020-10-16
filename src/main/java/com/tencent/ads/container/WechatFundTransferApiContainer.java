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
import com.tencent.ads.api.WechatFundTransferApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.WechatFundTransferAddRequest;
import com.tencent.ads.model.WechatFundTransferAddResponse;

public class WechatFundTransferApiContainer extends ApiContainer {

  @Inject WechatFundTransferApi api;

  /**
   * 微信服务商子客之间转账
   *
   * @param data (required)
   * @return WechatFundTransferAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public WechatFundTransferAddResponse wechatFundTransferAdd(WechatFundTransferAddRequest data)
      throws ApiException, TencentAdsResponseException {
    WechatFundTransferAddResponse resp = api.wechatFundTransferAdd(data);
    handleResponse(gson.toJson(resp));

    return resp;
  }
}