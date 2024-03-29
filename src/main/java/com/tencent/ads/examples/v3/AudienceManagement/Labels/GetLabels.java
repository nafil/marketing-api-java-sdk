package com.tencent.ads.examples.v3.AudienceManagement.Labels;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.LabelsGetSingleFilter;
import com.tencent.ads.v3.TencentAds;
import java.util.Arrays;
import java.util.List;

public class GetLabels {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public List<LabelsGetSingleFilter> filtering = null;

  public Long page = null;

  public Long pageSize = null;

  public List<String> fields =
      Arrays.asList("label_id", "audience_id", "display_label_name", "description", "user_count");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public LabelsGetResponseData getLabels() throws Exception {
    LabelsGetResponseData response =
        tencentAds.labels().labelsGet(accountId, filtering, page, pageSize, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetLabels getLabels = new GetLabels();
      getLabels.init();
      LabelsGetResponseData response = getLabels.getLabels();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
