package com.tencent.ads.examples.v3.AudienceManagement.CustomAudiences;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.CustomAudiencesUpdateRequest;
import com.tencent.ads.model.v3.CustomAudiencesUpdateResponse;
import com.tencent.ads.v3.TencentAds;

public class UpdateCustomAudiences {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public CustomAudiencesUpdateRequest data = new CustomAudiencesUpdateRequest();
  public String description = "SDK sample updated";
  public Long audienceId = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);

    data.setDescription(description);

    data.setAudienceId(audienceId);
  }

  public CustomAudiencesUpdateResponse updateCustomAudiences() throws Exception {
    CustomAudiencesUpdateResponse response =
        tencentAds.customAudiences().customAudiencesUpdate(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      UpdateCustomAudiences updateCustomAudiences = new UpdateCustomAudiences();
      updateCustomAudiences.init();
      CustomAudiencesUpdateResponse response = updateCustomAudiences.updateCustomAudiences();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
