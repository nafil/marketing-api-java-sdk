/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 3.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.tencent.ads.model.v3;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** 应用直达数据 */
@ApiModel(description = "应用直达数据")
public class AppDeepLinkPageSpec {
  @SerializedName("android_deep_link_app_id")
  private String androidDeepLinkAppId = null;

  @SerializedName("android_deep_link_url")
  private String androidDeepLinkUrl = null;

  @SerializedName("ios_deep_link_app_id")
  private String iosDeepLinkAppId = null;

  @SerializedName("ios_deep_link_url")
  private String iosDeepLinkUrl = null;

  @SerializedName("universal_link_url")
  private String universalLinkUrl = null;

  public AppDeepLinkPageSpec androidDeepLinkAppId(String androidDeepLinkAppId) {
    this.androidDeepLinkAppId = androidDeepLinkAppId;
    return this;
  }

  /**
   * Get androidDeepLinkAppId
   *
   * @return androidDeepLinkAppId
   */
  @ApiModelProperty(value = "")
  public String getAndroidDeepLinkAppId() {
    return androidDeepLinkAppId;
  }

  public void setAndroidDeepLinkAppId(String androidDeepLinkAppId) {
    this.androidDeepLinkAppId = androidDeepLinkAppId;
  }

  public AppDeepLinkPageSpec androidDeepLinkUrl(String androidDeepLinkUrl) {
    this.androidDeepLinkUrl = androidDeepLinkUrl;
    return this;
  }

  /**
   * Get androidDeepLinkUrl
   *
   * @return androidDeepLinkUrl
   */
  @ApiModelProperty(value = "")
  public String getAndroidDeepLinkUrl() {
    return androidDeepLinkUrl;
  }

  public void setAndroidDeepLinkUrl(String androidDeepLinkUrl) {
    this.androidDeepLinkUrl = androidDeepLinkUrl;
  }

  public AppDeepLinkPageSpec iosDeepLinkAppId(String iosDeepLinkAppId) {
    this.iosDeepLinkAppId = iosDeepLinkAppId;
    return this;
  }

  /**
   * Get iosDeepLinkAppId
   *
   * @return iosDeepLinkAppId
   */
  @ApiModelProperty(value = "")
  public String getIosDeepLinkAppId() {
    return iosDeepLinkAppId;
  }

  public void setIosDeepLinkAppId(String iosDeepLinkAppId) {
    this.iosDeepLinkAppId = iosDeepLinkAppId;
  }

  public AppDeepLinkPageSpec iosDeepLinkUrl(String iosDeepLinkUrl) {
    this.iosDeepLinkUrl = iosDeepLinkUrl;
    return this;
  }

  /**
   * Get iosDeepLinkUrl
   *
   * @return iosDeepLinkUrl
   */
  @ApiModelProperty(value = "")
  public String getIosDeepLinkUrl() {
    return iosDeepLinkUrl;
  }

  public void setIosDeepLinkUrl(String iosDeepLinkUrl) {
    this.iosDeepLinkUrl = iosDeepLinkUrl;
  }

  public AppDeepLinkPageSpec universalLinkUrl(String universalLinkUrl) {
    this.universalLinkUrl = universalLinkUrl;
    return this;
  }

  /**
   * Get universalLinkUrl
   *
   * @return universalLinkUrl
   */
  @ApiModelProperty(value = "")
  public String getUniversalLinkUrl() {
    return universalLinkUrl;
  }

  public void setUniversalLinkUrl(String universalLinkUrl) {
    this.universalLinkUrl = universalLinkUrl;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppDeepLinkPageSpec appDeepLinkPageSpec = (AppDeepLinkPageSpec) o;
    return Objects.equals(this.androidDeepLinkAppId, appDeepLinkPageSpec.androidDeepLinkAppId)
        && Objects.equals(this.androidDeepLinkUrl, appDeepLinkPageSpec.androidDeepLinkUrl)
        && Objects.equals(this.iosDeepLinkAppId, appDeepLinkPageSpec.iosDeepLinkAppId)
        && Objects.equals(this.iosDeepLinkUrl, appDeepLinkPageSpec.iosDeepLinkUrl)
        && Objects.equals(this.universalLinkUrl, appDeepLinkPageSpec.universalLinkUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        androidDeepLinkAppId,
        androidDeepLinkUrl,
        iosDeepLinkAppId,
        iosDeepLinkUrl,
        universalLinkUrl);
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
