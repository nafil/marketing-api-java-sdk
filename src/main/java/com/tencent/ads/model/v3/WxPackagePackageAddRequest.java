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
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** WxPackagePackageAddRequest */
public class WxPackagePackageAddRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("package_name")
  private String packageName = null;

  @SerializedName("package_type")
  private WechatPackageType packageType = null;

  @SerializedName("wechat_ids")
  private String wechatIds = null;

  public WxPackagePackageAddRequest accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   *
   * @return accountId
   */
  @ApiModelProperty(value = "")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public WxPackagePackageAddRequest packageName(String packageName) {
    this.packageName = packageName;
    return this;
  }

  /**
   * Get packageName
   *
   * @return packageName
   */
  @ApiModelProperty(value = "")
  public String getPackageName() {
    return packageName;
  }

  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }

  public WxPackagePackageAddRequest packageType(WechatPackageType packageType) {
    this.packageType = packageType;
    return this;
  }

  /**
   * Get packageType
   *
   * @return packageType
   */
  @ApiModelProperty(value = "")
  public WechatPackageType getPackageType() {
    return packageType;
  }

  public void setPackageType(WechatPackageType packageType) {
    this.packageType = packageType;
  }

  public WxPackagePackageAddRequest wechatIds(String wechatIds) {
    this.wechatIds = wechatIds;
    return this;
  }

  /**
   * Get wechatIds
   *
   * @return wechatIds
   */
  @ApiModelProperty(value = "")
  public String getWechatIds() {
    return wechatIds;
  }

  public void setWechatIds(String wechatIds) {
    this.wechatIds = wechatIds;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WxPackagePackageAddRequest wxPackagePackageAddRequest = (WxPackagePackageAddRequest) o;
    return Objects.equals(this.accountId, wxPackagePackageAddRequest.accountId)
        && Objects.equals(this.packageName, wxPackagePackageAddRequest.packageName)
        && Objects.equals(this.packageType, wxPackagePackageAddRequest.packageType)
        && Objects.equals(this.wechatIds, wxPackagePackageAddRequest.wechatIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, packageName, packageType, wechatIds);
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
