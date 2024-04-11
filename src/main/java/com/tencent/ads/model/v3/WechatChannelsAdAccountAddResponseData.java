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

/** WechatChannelsAdAccountAddResponseData */
public class WechatChannelsAdAccountAddResponseData {
  @SerializedName("wechat_channels_ad_account_id")
  private Long wechatChannelsAdAccountId = null;

  public WechatChannelsAdAccountAddResponseData wechatChannelsAdAccountId(
      Long wechatChannelsAdAccountId) {
    this.wechatChannelsAdAccountId = wechatChannelsAdAccountId;
    return this;
  }

  /**
   * Get wechatChannelsAdAccountId
   *
   * @return wechatChannelsAdAccountId
   */
  @ApiModelProperty(value = "")
  public Long getWechatChannelsAdAccountId() {
    return wechatChannelsAdAccountId;
  }

  public void setWechatChannelsAdAccountId(Long wechatChannelsAdAccountId) {
    this.wechatChannelsAdAccountId = wechatChannelsAdAccountId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WechatChannelsAdAccountAddResponseData wechatChannelsAdAccountAddResponseData =
        (WechatChannelsAdAccountAddResponseData) o;
    return Objects.equals(
        this.wechatChannelsAdAccountId,
        wechatChannelsAdAccountAddResponseData.wechatChannelsAdAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wechatChannelsAdAccountId);
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
