package com.tencent.ads.examples.v3.AdsManagement.DynamicCreatives;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.FilteringStruct;
import com.tencent.ads.v3.TencentAds;
import java.util.Arrays;
import java.util.List;

public class GetDynamicCreatives {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public List<FilteringStruct> filtering = null;

  public Long page = null;

  public Long pageSize = null;

  public List<String> fields = Arrays.asList("dynamic_creative_id", "dynamic_creative_name");

  public Boolean isDeleted = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public DynamicCreativesGetResponseData getDynamicCreatives() throws Exception {
    DynamicCreativesGetResponseData response =
        tencentAds
            .dynamicCreatives()
            .dynamicCreativesGet(accountId, filtering, page, pageSize, fields, isDeleted);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetDynamicCreatives getDynamicCreatives = new GetDynamicCreatives();
      getDynamicCreatives.init();
      DynamicCreativesGetResponseData response = getDynamicCreatives.getDynamicCreatives();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}