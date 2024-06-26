package com.tencent.ads.examples.v3.AccountManagement.Qualification;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.FilteringStruct;
import com.tencent.ads.v3.TencentAds;
import java.util.Arrays;
import java.util.List;

public class GetQualifications {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public String qualificationType = "ADDITIONAL_INDUSTRY_QUALIFICATION";

  public List<FilteringStruct> filtering = null;

  public List<String> fields =
      Arrays.asList(
          "industry_qualifications",
          "ad_qualifications",
          "additional_industry_qualifications",
          "industry_qualifications_wechat",
          "ad_qualifications_wechat");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public QualificationsGetResponseData getQualifications() throws Exception {
    QualificationsGetResponseData response =
        tencentAds
            .qualifications()
            .qualificationsGet(accountId, qualificationType, filtering, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetQualifications getQualifications = new GetQualifications();
      getQualifications.init();
      QualificationsGetResponseData response = getQualifications.getQualifications();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
