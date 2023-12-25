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
import com.tencent.ads.api.v3.VideosApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.FilteringStruct;
import com.tencent.ads.model.v3.VideosAddResponse;
import com.tencent.ads.model.v3.VideosAddResponseData;
import com.tencent.ads.model.v3.VideosDeleteResponse;
import com.tencent.ads.model.v3.VideosDeleteResponseData;
import com.tencent.ads.model.v3.VideosGetResponse;
import com.tencent.ads.model.v3.VideosGetResponseData;
import com.tencent.ads.model.v3.VideosUpdateResponse;
import com.tencent.ads.model.v3.VideosUpdateResponseData;
import java.io.File;
import java.util.List;

public class VideosApiContainer extends ApiContainer {

  @Inject VideosApi api;

  /**
   * 添加视频文件
   *
   * @param accountId (required)
   * @param videoFile (required)
   * @param signature (required)
   * @param description (optional)
   * @param adcreativeTemplateId (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return VideosAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public VideosAddResponseData videosAdd(
      Long accountId,
      File videoFile,
      String signature,
      String description,
      Long adcreativeTemplateId,
      List<String> fields,
      String... headerPair)
      throws ApiException, TencentAdsResponseException {
    VideosAddResponse resp =
        api.videosAdd(
            accountId, videoFile, signature, description, adcreativeTemplateId, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 删除视频
   *
   * @param accountId (required)
   * @param videoId (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return VideosDeleteResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public VideosDeleteResponseData videosDelete(
      Long accountId, Long videoId, List<String> fields, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    VideosDeleteResponse resp = api.videosDelete(accountId, videoId, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 获取视频文件
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param labelId (optional)
   * @param businessScenario (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return VideosGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public VideosGetResponseData videosGet(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      Long labelId,
      Long businessScenario,
      List<String> fields,
      String... headerPair)
      throws ApiException, TencentAdsResponseException {
    VideosGetResponse resp =
        api.videosGet(
            accountId, filtering, page, pageSize, labelId, businessScenario, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 修改视频信息
   *
   * @param accountId (required)
   * @param videoId (required)
   * @param description (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return VideosUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public VideosUpdateResponseData videosUpdate(
      Long accountId, Long videoId, String description, List<String> fields, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    VideosUpdateResponse resp =
        api.videosUpdate(accountId, videoId, description, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
