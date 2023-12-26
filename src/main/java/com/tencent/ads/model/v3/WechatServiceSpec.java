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

/** 微信客服元素 */
@ApiModel(description = "微信客服元素")
public class WechatServiceSpec {
  @SerializedName("wechat_service_url")
  private String wechatServiceUrl = null;

  public WechatServiceSpec wechatServiceUrl(String wechatServiceUrl) {
    this.wechatServiceUrl = wechatServiceUrl;
    return this;
  }

  /**
   * Get wechatServiceUrl
   *
   * @return wechatServiceUrl
   */
  @ApiModelProperty(value = "")
  public String getWechatServiceUrl() {
    return wechatServiceUrl;
  }

  public void setWechatServiceUrl(String wechatServiceUrl) {
    this.wechatServiceUrl = wechatServiceUrl;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WechatServiceSpec wechatServiceSpec = (WechatServiceSpec) o;
    return Objects.equals(this.wechatServiceUrl, wechatServiceSpec.wechatServiceUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wechatServiceUrl);
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