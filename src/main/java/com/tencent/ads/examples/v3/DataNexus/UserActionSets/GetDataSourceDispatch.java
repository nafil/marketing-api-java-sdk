package com.tencent.ads.examples.v3.DataNexus.UserActionSets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.v3.TencentAds;
import java.util.List;

public class GetDataSourceDispatch {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long userActionSetId = null;

  public String type = null;

  public String name = null;

  public List<String> scenes = null;

  public String switchType = null;

  public String accessWay = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public DataSourceDispatchGetResponseData getDataSourceDispatch() throws Exception {
    DataSourceDispatchGetResponseData response =
        tencentAds
            .dataSourceDispatch()
            .dataSourceDispatchGet(
                accountId, userActionSetId, type, name, scenes, switchType, accessWay, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetDataSourceDispatch getDataSourceDispatch = new GetDataSourceDispatch();
      getDataSourceDispatch.init();
      DataSourceDispatchGetResponseData response = getDataSourceDispatch.getDataSourceDispatch();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
