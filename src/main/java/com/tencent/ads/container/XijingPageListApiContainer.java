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
import com.tencent.ads.api.XijingPageListApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.XijingPageListGetResponse;
import com.tencent.ads.model.XijingPageListGetResponseData;
import java.util.List;

public class XijingPageListApiContainer extends ApiContainer {

  @Inject XijingPageListApi api;

  /**
   * 蹊径-获取落地页列表
   *
   * @param accountId (required)
   * @param pageId (optional)
   * @param pageServiceId (optional)
   * @param pageName (optional)
   * @param pageType (optional)
   * @param pageLastModifyStartTime (optional)
   * @param pageLastModifyEndTime (optional)
   * @param pageSize (optional)
   * @param pageIndex (optional)
   * @param pagePublishStatus (optional)
   * @param pageStatus (optional)
   * @param pageSource (optional)
   * @param pageOwnerId (optional)
   * @param appId (optional)
   * @param appType (optional)
   * @param queryType (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return XijingPageListGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public XijingPageListGetResponseData xijingPageListGet(
      Long accountId,
      Long pageId,
      String pageServiceId,
      String pageName,
      List<String> pageType,
      String pageLastModifyStartTime,
      String pageLastModifyEndTime,
      Long pageSize,
      Long pageIndex,
      List<String> pagePublishStatus,
      List<String> pageStatus,
      String pageSource,
      Long pageOwnerId,
      Long appId,
      String appType,
      String queryType,
      List<String> fields,
      String... headerPair)
      throws ApiException, TencentAdsResponseException {
    XijingPageListGetResponse resp =
        api.xijingPageListGet(
            accountId,
            pageId,
            pageServiceId,
            pageName,
            pageType,
            pageLastModifyStartTime,
            pageLastModifyEndTime,
            pageSize,
            pageIndex,
            pagePublishStatus,
            pageStatus,
            pageSource,
            pageOwnerId,
            appId,
            appType,
            queryType,
            fields,
            headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
