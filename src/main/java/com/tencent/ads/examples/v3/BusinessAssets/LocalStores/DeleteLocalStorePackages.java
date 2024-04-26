package com.tencent.ads.examples.v3.BusinessAssets.LocalStores;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.LocalStorePackagesDeleteRequest;
import com.tencent.ads.v3.TencentAds;

public class DeleteLocalStorePackages {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public LocalStorePackagesDeleteRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public LocalStorePackagesDeleteResponseData deleteLocalStorePackages() throws Exception {
    LocalStorePackagesDeleteResponseData response =
        tencentAds.localStorePackages().localStorePackagesDelete(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      DeleteLocalStorePackages deleteLocalStorePackages = new DeleteLocalStorePackages();
      deleteLocalStorePackages.init();
      LocalStorePackagesDeleteResponseData response =
          deleteLocalStorePackages.deleteLocalStorePackages();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
