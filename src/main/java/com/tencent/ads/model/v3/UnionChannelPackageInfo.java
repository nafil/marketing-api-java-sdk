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

/** 广告渠道包任务处理信息 */
@ApiModel(description = "广告渠道包任务处理信息")
public class UnionChannelPackageInfo {
  @SerializedName("android_union_app_id")
  private Long androidUnionAppId = null;

  @SerializedName("package_name")
  private String packageName = null;

  @SerializedName("status")
  private UnionChannelTaskStatus status = null;

  @SerializedName("created_time")
  private Long createdTime = null;

  @SerializedName("last_modified_time")
  private Long lastModifiedTime = null;

  public UnionChannelPackageInfo androidUnionAppId(Long androidUnionAppId) {
    this.androidUnionAppId = androidUnionAppId;
    return this;
  }

  /**
   * Get androidUnionAppId
   *
   * @return androidUnionAppId
   */
  @ApiModelProperty(value = "")
  public Long getAndroidUnionAppId() {
    return androidUnionAppId;
  }

  public void setAndroidUnionAppId(Long androidUnionAppId) {
    this.androidUnionAppId = androidUnionAppId;
  }

  public UnionChannelPackageInfo packageName(String packageName) {
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

  public UnionChannelPackageInfo status(UnionChannelTaskStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  @ApiModelProperty(value = "")
  public UnionChannelTaskStatus getStatus() {
    return status;
  }

  public void setStatus(UnionChannelTaskStatus status) {
    this.status = status;
  }

  public UnionChannelPackageInfo createdTime(Long createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   *
   * @return createdTime
   */
  @ApiModelProperty(value = "")
  public Long getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Long createdTime) {
    this.createdTime = createdTime;
  }

  public UnionChannelPackageInfo lastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  /**
   * Get lastModifiedTime
   *
   * @return lastModifiedTime
   */
  @ApiModelProperty(value = "")
  public Long getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnionChannelPackageInfo unionChannelPackageInfo = (UnionChannelPackageInfo) o;
    return Objects.equals(this.androidUnionAppId, unionChannelPackageInfo.androidUnionAppId)
        && Objects.equals(this.packageName, unionChannelPackageInfo.packageName)
        && Objects.equals(this.status, unionChannelPackageInfo.status)
        && Objects.equals(this.createdTime, unionChannelPackageInfo.createdTime)
        && Objects.equals(this.lastModifiedTime, unionChannelPackageInfo.lastModifiedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(androidUnionAppId, packageName, status, createdTime, lastModifiedTime);
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
