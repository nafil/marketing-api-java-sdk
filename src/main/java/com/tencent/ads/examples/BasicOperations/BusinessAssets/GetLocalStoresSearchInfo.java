package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import java.util.List;

public class GetLocalStoresSearchInfo {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public String keyWord = null;

  public Long page = null;

  public Long pageSize = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public LocalStoresSearchInfoGetResponseData getLocalStoresSearchInfo() throws Exception {
    LocalStoresSearchInfoGetResponseData response =
        tencentAds
            .localStoresSearchInfo()
            .localStoresSearchInfoGet(accountId, keyWord, page, pageSize, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetLocalStoresSearchInfo getLocalStoresSearchInfo = new GetLocalStoresSearchInfo();
      getLocalStoresSearchInfo.init();
      LocalStoresSearchInfoGetResponseData response =
          getLocalStoresSearchInfo.getLocalStoresSearchInfo();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
