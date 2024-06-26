package com.tencent.ads.examples.v3.Tools.WechatChannelCommentsManager;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.ObjectCommentFlagUpdateRequest;
import com.tencent.ads.model.v3.ObjectCommentFlagUpdateResponse;
import com.tencent.ads.v3.TencentAds;

public class UpdateObjectCommentFlag {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public ObjectCommentFlagUpdateRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public ObjectCommentFlagUpdateResponse updateObjectCommentFlag() throws Exception {
    ObjectCommentFlagUpdateResponse response =
        tencentAds.objectCommentFlag().objectCommentFlagUpdate(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      UpdateObjectCommentFlag updateObjectCommentFlag = new UpdateObjectCommentFlag();
      updateObjectCommentFlag.init();
      ObjectCommentFlagUpdateResponse response = updateObjectCommentFlag.updateObjectCommentFlag();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
