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

/** 更新应用宝渠道包接口任务所需条件 */
@ApiModel(description = "更新应用宝渠道包接口任务所需条件")
public class UpdateAndroidChannelPackageSpec {
  @SerializedName("channel_package_id")
  private String channelPackageId = null;

  @SerializedName("download_url")
  private String downloadUrl = null;

  public UpdateAndroidChannelPackageSpec channelPackageId(String channelPackageId) {
    this.channelPackageId = channelPackageId;
    return this;
  }

  /**
   * Get channelPackageId
   *
   * @return channelPackageId
   */
  @ApiModelProperty(value = "")
  public String getChannelPackageId() {
    return channelPackageId;
  }

  public void setChannelPackageId(String channelPackageId) {
    this.channelPackageId = channelPackageId;
  }

  public UpdateAndroidChannelPackageSpec downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

  /**
   * Get downloadUrl
   *
   * @return downloadUrl
   */
  @ApiModelProperty(value = "")
  public String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAndroidChannelPackageSpec updateAndroidChannelPackageSpec =
        (UpdateAndroidChannelPackageSpec) o;
    return Objects.equals(this.channelPackageId, updateAndroidChannelPackageSpec.channelPackageId)
        && Objects.equals(this.downloadUrl, updateAndroidChannelPackageSpec.downloadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelPackageId, downloadUrl);
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
