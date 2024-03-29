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

/** 已发布版本落地页 App信息 */
@ApiModel(description = "已发布版本落地页 App信息")
public class PublishAppId {
  @SerializedName("android_app_id")
  private Long androidAppId = null;

  @SerializedName("ios_app_id")
  private Long iosAppId = null;

  public PublishAppId androidAppId(Long androidAppId) {
    this.androidAppId = androidAppId;
    return this;
  }

  /**
   * Get androidAppId
   *
   * @return androidAppId
   */
  @ApiModelProperty(value = "")
  public Long getAndroidAppId() {
    return androidAppId;
  }

  public void setAndroidAppId(Long androidAppId) {
    this.androidAppId = androidAppId;
  }

  public PublishAppId iosAppId(Long iosAppId) {
    this.iosAppId = iosAppId;
    return this;
  }

  /**
   * Get iosAppId
   *
   * @return iosAppId
   */
  @ApiModelProperty(value = "")
  public Long getIosAppId() {
    return iosAppId;
  }

  public void setIosAppId(Long iosAppId) {
    this.iosAppId = iosAppId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublishAppId publishAppId = (PublishAppId) o;
    return Objects.equals(this.androidAppId, publishAppId.androidAppId)
        && Objects.equals(this.iosAppId, publishAppId.iosAppId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(androidAppId, iosAppId);
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
