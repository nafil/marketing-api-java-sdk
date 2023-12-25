package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import java.util.List;

public class GetAdcreativeTemplateList {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public String siteSet = null;

  public String campaignType = null;

  public String promotedObjectType = null;

  public List<String> dynamicAbilityType = null;

  public Boolean isDynamicCreative = null;

  public List<Long> wechatSceneSpecPosition = null;

  public Long adcreativeTemplateId = null;

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

  public AdcreativeTemplateListGetResponseData getAdcreativeTemplateList() throws Exception {
    AdcreativeTemplateListGetResponseData response =
        tencentAds
            .adcreativeTemplateList()
            .adcreativeTemplateListGet(
                accountId,
                siteSet,
                campaignType,
                promotedObjectType,
                dynamicAbilityType,
                isDynamicCreative,
                wechatSceneSpecPosition,
                adcreativeTemplateId,
                page,
                pageSize,
                fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetAdcreativeTemplateList getAdcreativeTemplateList = new GetAdcreativeTemplateList();
      getAdcreativeTemplateList.init();
      AdcreativeTemplateListGetResponseData response =
          getAdcreativeTemplateList.getAdcreativeTemplateList();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
