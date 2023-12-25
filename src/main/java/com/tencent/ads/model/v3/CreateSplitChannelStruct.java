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
public class CreateSplitChannelStruct {
  @SerializedName("channel_id")
  private String channelId = null;

  @SerializedName("channel_name")
  private String channelName = null;

  @SerializedName("customized_channel_id")
  private String customizedChannelId = null;

  public CreateSplitChannelStruct channelId(String channelId) {
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

  public CreateSplitChannelStruct channelName(String channelName) {
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

  public CreateSplitChannelStruct customizedChannelId(String customizedChannelId) {
    this.customizedChannelId = customizedChannelId;
    return this;
  }

  /**
   * Get customizedChannelId
   *
   * @return customizedChannelId
   */
  @ApiModelProperty(value = "")
  public String getCustomizedChannelId() {
    return customizedChannelId;
  }

  public void setCustomizedChannelId(String customizedChannelId) {
    this.customizedChannelId = customizedChannelId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSplitChannelStruct createSplitChannelStruct = (CreateSplitChannelStruct) o;
    return Objects.equals(this.channelId, createSplitChannelStruct.channelId)
        && Objects.equals(this.channelName, createSplitChannelStruct.channelName)
        && Objects.equals(this.customizedChannelId, createSplitChannelStruct.customizedChannelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, channelName, customizedChannelId);
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
