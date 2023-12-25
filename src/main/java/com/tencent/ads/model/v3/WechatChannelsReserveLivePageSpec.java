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

/** 视频号直播预约落地页信息 */
@ApiModel(description = "视频号直播预约落地页信息")
public class WechatChannelsReserveLivePageSpec {
  @SerializedName("reserve_id")
  private String reserveId = null;

  public WechatChannelsReserveLivePageSpec reserveId(String reserveId) {
    this.reserveId = reserveId;
    return this;
  }

  /**
   * Get reserveId
   *
   * @return reserveId
   */
  @ApiModelProperty(value = "")
  public String getReserveId() {
    return reserveId;
  }

  public void setReserveId(String reserveId) {
    this.reserveId = reserveId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WechatChannelsReserveLivePageSpec wechatChannelsReserveLivePageSpec =
        (WechatChannelsReserveLivePageSpec) o;
    return Objects.equals(this.reserveId, wechatChannelsReserveLivePageSpec.reserveId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reserveId);
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
