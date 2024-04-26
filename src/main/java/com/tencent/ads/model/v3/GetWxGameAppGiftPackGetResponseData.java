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

/** GetWxGameAppGiftPackGetResponseData */
public class GetWxGameAppGiftPackGetResponseData {
  @SerializedName("act_gift_info")
  private ActGiftInfo actGiftInfo = null;

  public GetWxGameAppGiftPackGetResponseData actGiftInfo(ActGiftInfo actGiftInfo) {
    this.actGiftInfo = actGiftInfo;
    return this;
  }

  /**
   * Get actGiftInfo
   *
   * @return actGiftInfo
   */
  @ApiModelProperty(value = "")
  public ActGiftInfo getActGiftInfo() {
    return actGiftInfo;
  }

  public void setActGiftInfo(ActGiftInfo actGiftInfo) {
    this.actGiftInfo = actGiftInfo;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetWxGameAppGiftPackGetResponseData getWxGameAppGiftPackGetResponseData =
        (GetWxGameAppGiftPackGetResponseData) o;
    return Objects.equals(this.actGiftInfo, getWxGameAppGiftPackGetResponseData.actGiftInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actGiftInfo);
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