package com.tencent.ads.examples.BasicOperations.Insights;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.ReportLandingPageRequest;

public class LandingPageReport {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public ReportLandingPageRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public ReportLandingPageResponseData landingpageReport() throws Exception {
    ReportLandingPageResponseData response = tencentAds.report().reportLandingPage(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      LandingPageReport landingpageReport = new LandingPageReport();
      landingpageReport.init();
      ReportLandingPageResponseData response = landingpageReport.landingpageReport();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
