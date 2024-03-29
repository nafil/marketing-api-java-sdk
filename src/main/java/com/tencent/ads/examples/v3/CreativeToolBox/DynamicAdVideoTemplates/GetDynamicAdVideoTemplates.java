package com.tencent.ads.examples.v3.CreativeToolBox.DynamicAdVideoTemplates;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.v3.TencentAds;
import java.util.List;

public class GetDynamicAdVideoTemplates {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long productCatalogId = null;

  public Long adcreativeTemplateId = null;

  public String productMode = null;

  public Boolean supportChannel = null;

  public Long page = null;

  public Long pageSize = null;

  public List<Long> templateIdList = null;

  public String templateName = null;

  public String dynamicAdTemplateOwnershipType = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public DynamicAdVideoTemplatesGetResponseData getDynamicAdVideoTemplates() throws Exception {
    DynamicAdVideoTemplatesGetResponseData response =
        tencentAds
            .dynamicAdVideoTemplates()
            .dynamicAdVideoTemplatesGet(
                accountId,
                productCatalogId,
                adcreativeTemplateId,
                productMode,
                supportChannel,
                page,
                pageSize,
                templateIdList,
                templateName,
                dynamicAdTemplateOwnershipType,
                fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetDynamicAdVideoTemplates getDynamicAdVideoTemplates = new GetDynamicAdVideoTemplates();
      getDynamicAdVideoTemplates.init();
      DynamicAdVideoTemplatesGetResponseData response =
          getDynamicAdVideoTemplates.getDynamicAdVideoTemplates();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
