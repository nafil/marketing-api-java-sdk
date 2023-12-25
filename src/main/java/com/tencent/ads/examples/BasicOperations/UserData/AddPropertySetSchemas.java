package com.tencent.ads.examples.BasicOperations.UserData;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.PropertySetSchemasAddRequest;
import com.tencent.ads.model.PropertySetSchemasAddResponse;

public class AddPropertySetSchemas {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public PropertySetSchemasAddRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public PropertySetSchemasAddResponse addPropertySetSchemas() throws Exception {
    PropertySetSchemasAddResponse response =
        tencentAds.propertySetSchemas().propertySetSchemasAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddPropertySetSchemas addPropertySetSchemas = new AddPropertySetSchemas();
      addPropertySetSchemas.init();
      PropertySetSchemasAddResponse response = addPropertySetSchemas.addPropertySetSchemas();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
