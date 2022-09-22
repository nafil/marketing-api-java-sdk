/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 1.3
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.tencent.ads.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** iOS应用信息元素 */
@ApiModel(description = "iOS应用信息元素")
public class DeepLinkAppIosSpec {
  @SerializedName("deep_link_url")
  private String deepLinkUrl = null;

  @SerializedName("app_ios_id")
  private String appIosId = null;

  public DeepLinkAppIosSpec deepLinkUrl(String deepLinkUrl) {
    this.deepLinkUrl = deepLinkUrl;
    return this;
  }

  /**
   * Get deepLinkUrl
   *
   * @return deepLinkUrl
   */
  @ApiModelProperty(value = "")
  public String getDeepLinkUrl() {
    return deepLinkUrl;
  }

  public void setDeepLinkUrl(String deepLinkUrl) {
    this.deepLinkUrl = deepLinkUrl;
  }

  public DeepLinkAppIosSpec appIosId(String appIosId) {
    this.appIosId = appIosId;
    return this;
  }

  /**
   * Get appIosId
   *
   * @return appIosId
   */
  @ApiModelProperty(value = "")
  public String getAppIosId() {
    return appIosId;
  }

  public void setAppIosId(String appIosId) {
    this.appIosId = appIosId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeepLinkAppIosSpec deepLinkAppIosSpec = (DeepLinkAppIosSpec) o;
    return Objects.equals(this.deepLinkUrl, deepLinkAppIosSpec.deepLinkUrl)
        && Objects.equals(this.appIosId, deepLinkAppIosSpec.appIosId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deepLinkUrl, appIosId);
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