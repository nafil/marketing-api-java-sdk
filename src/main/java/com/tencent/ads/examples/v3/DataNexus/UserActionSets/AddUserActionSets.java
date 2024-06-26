package com.tencent.ads.examples.v3.DataNexus.UserActionSets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.UserActionSetsAddRequest;
import com.tencent.ads.v3.TencentAds;

public class AddUserActionSets {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public UserActionSetsAddRequest data = new UserActionSetsAddRequest();
  public String name = "SDK数据源5ede252f5d953";
  public AmUserActionSetType type = AmUserActionSetType.WEB;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);

    data.setName(name);

    data.setType(type);
  }

  public UserActionSetsAddResponseData addUserActionSets() throws Exception {
    UserActionSetsAddResponseData response = tencentAds.userActionSets().userActionSetsAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddUserActionSets addUserActionSets = new AddUserActionSets();
      addUserActionSets.init();
      UserActionSetsAddResponseData response = addUserActionSets.addUserActionSets();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
