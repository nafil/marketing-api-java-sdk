package com.tencent.ads.examples.BasicOperations.AudiencesManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.UserPropertySetsUpdateRequest;
import com.tencent.ads.model.UserPropertySetsUpdateResponse;

public class UpdateUserPropertySets {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public UserPropertySetsUpdateRequest data = new UserPropertySetsUpdateRequest();
  public String description = "SDK sample";
  public Long userPropertySetId = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);

    data.setDescription(description);

    data.setUserPropertySetId(userPropertySetId);
  }

  public UserPropertySetsUpdateResponse updateUserPropertySets() throws Exception {
    UserPropertySetsUpdateResponse response =
        tencentAds.userPropertySets().userPropertySetsUpdate(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      UpdateUserPropertySets updateUserPropertySets = new UpdateUserPropertySets();
      updateUserPropertySets.init();
      UserPropertySetsUpdateResponse response = updateUserPropertySets.updateUserPropertySets();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
