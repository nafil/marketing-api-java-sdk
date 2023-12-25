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

/** 渠道号信息 */
@ApiModel(description = "渠道号信息")
public class UpdateSplitChannelStruct {
  @SerializedName("channel_id")
  private String channelId = null;

  @SerializedName("channel_name")
  private String channelName = null;

  public UpdateSplitChannelStruct channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * Get channelId
   *
   * @return channelId
   */
  @ApiModelProperty(value = "")
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public UpdateSplitChannelStruct channelName(String channelName) {
    this.channelName = channelName;
    return this;
  }

  /**
   * Get channelName
   *
   * @return channelName
   */
  @ApiModelProperty(value = "")
  public String getChannelName() {
    return channelName;
  }

  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSplitChannelStruct updateSplitChannelStruct = (UpdateSplitChannelStruct) o;
    return Objects.equals(this.channelId, updateSplitChannelStruct.channelId)
        && Objects.equals(this.channelName, updateSplitChannelStruct.channelName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, channelName);
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
