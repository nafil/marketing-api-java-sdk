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
import com.tencent.ads.api.v3.VideoChannelLiveDataApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.VideoChannelLiveDataGetRequest;
import com.tencent.ads.model.v3.VideoChannelLiveDataGetResponse;
import com.tencent.ads.model.v3.VideoChannelLiveDataGetResponseData;

public class VideoChannelLiveDataApiContainer extends ApiContainer {

  @Inject VideoChannelLiveDataApi api;

  /**
   * 获取直播数据
   *
   * @param data (required)
   * @return VideoChannelLiveDataGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public VideoChannelLiveDataGetResponseData videoChannelLiveDataGet(
      VideoChannelLiveDataGetRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    VideoChannelLiveDataGetResponse resp = api.videoChannelLiveDataGet(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
