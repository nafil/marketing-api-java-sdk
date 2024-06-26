package com.tencent.ads.examples.v3.BusinessAssets.Pages;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.v3.TencentAds;
import java.util.List;

public class GetXijingPageList {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long pageId = null;

  public String pageServiceId = null;

  public String pageName = null;

  public List<String> pageType = null;

  public String pageLastModifyStartTime = null;

  public String pageLastModifyEndTime = null;

  public Long pageSize = null;

  public Long pageIndex = null;

  public List<String> pagePublishStatus = null;

  public List<String> pageStatus = null;

  public String pageSource = null;

  public Long pageOwnerId = null;

  public Long appId = null;

  public String appType = null;

  public String queryType = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public XijingPageListGetResponseData getXijingPageList() throws Exception {
    XijingPageListGetResponseData response =
        tencentAds
            .xijingPageList()
            .xijingPageListGet(
                accountId,
                pageId,
                pageServiceId,
                pageName,
                pageType,
                pageLastModifyStartTime,
                pageLastModifyEndTime,
                pageSize,
                pageIndex,
                pagePublishStatus,
                pageStatus,
                pageSource,
                pageOwnerId,
                appId,
                appType,
                queryType,
                fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetXijingPageList getXijingPageList = new GetXijingPageList();
      getXijingPageList.init();
      XijingPageListGetResponseData response = getXijingPageList.getXijingPageList();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
