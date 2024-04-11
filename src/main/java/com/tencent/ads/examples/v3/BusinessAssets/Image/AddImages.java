package com.tencent.ads.examples.v3.BusinessAssets.Image;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.v3.TencentAds;
import java.io.File;

public class AddImages {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public String uploadType = "UPLOAD_TYPE_FILE";

  public String signature = null;

  public File file = new File("YOUR IMAGE FILE PATH");

  public String bytes = null;

  public String imageUsage = null;

  public String description = null;

  public Long resizeWidth = null;

  public Long resizeHeight = null;

  public Long resizeFileSize = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public ImagesAddResponseData addImages() throws Exception {
    ImagesAddResponseData response =
        tencentAds
            .images()
            .imagesAdd(
                accountId,
                uploadType,
                signature,
                file,
                bytes,
                imageUsage,
                description,
                resizeWidth,
                resizeHeight,
                resizeFileSize);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddImages addImages = new AddImages();
      addImages.init();
      ImagesAddResponseData response = addImages.addImages();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
