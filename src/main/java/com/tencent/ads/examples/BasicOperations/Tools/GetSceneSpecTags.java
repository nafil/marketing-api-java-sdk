package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import java.util.List;

public class GetSceneSpecTags {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public String type = null;

  public Long accountId = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public SceneSpecTagsGetResponseData getSceneSpecTags() throws Exception {
    SceneSpecTagsGetResponseData response =
        tencentAds.sceneSpecTags().sceneSpecTagsGet(type, accountId, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetSceneSpecTags getSceneSpecTags = new GetSceneSpecTags();
      getSceneSpecTags.init();
      SceneSpecTagsGetResponseData response = getSceneSpecTags.getSceneSpecTags();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
