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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 礼包道具 */
@ApiModel(description = "礼包道具")
public class ActGiftInfo {
  @SerializedName("act_id")
  private String actId = null;

  @SerializedName("act_name")
  private String actName = null;

  @SerializedName("act_type")
  private Long actType = null;

  @SerializedName("gift_list")
  private List<Gift> giftList = null;

  @SerializedName("gift_bypass")
  private String giftBypass = null;

  public ActGiftInfo actId(String actId) {
    this.actId = actId;
    return this;
  }

  /**
   * Get actId
   *
   * @return actId
   */
  @ApiModelProperty(value = "")
  public String getActId() {
    return actId;
  }

  public void setActId(String actId) {
    this.actId = actId;
  }

  public ActGiftInfo actName(String actName) {
    this.actName = actName;
    return this;
  }

  /**
   * Get actName
   *
   * @return actName
   */
  @ApiModelProperty(value = "")
  public String getActName() {
    return actName;
  }

  public void setActName(String actName) {
    this.actName = actName;
  }

  public ActGiftInfo actType(Long actType) {
    this.actType = actType;
    return this;
  }

  /**
   * Get actType
   *
   * @return actType
   */
  @ApiModelProperty(value = "")
  public Long getActType() {
    return actType;
  }

  public void setActType(Long actType) {
    this.actType = actType;
  }

  public ActGiftInfo giftList(List<Gift> giftList) {
    this.giftList = giftList;
    return this;
  }

  public ActGiftInfo addGiftListItem(Gift giftListItem) {
    if (this.giftList == null) {
      this.giftList = new ArrayList<Gift>();
    }
    this.giftList.add(giftListItem);
    return this;
  }

  /**
   * Get giftList
   *
   * @return giftList
   */
  @ApiModelProperty(value = "")
  public List<Gift> getGiftList() {
    return giftList;
  }

  public void setGiftList(List<Gift> giftList) {
    this.giftList = giftList;
  }

  public ActGiftInfo giftBypass(String giftBypass) {
    this.giftBypass = giftBypass;
    return this;
  }

  /**
   * Get giftBypass
   *
   * @return giftBypass
   */
  @ApiModelProperty(value = "")
  public String getGiftBypass() {
    return giftBypass;
  }

  public void setGiftBypass(String giftBypass) {
    this.giftBypass = giftBypass;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActGiftInfo actGiftInfo = (ActGiftInfo) o;
    return Objects.equals(this.actId, actGiftInfo.actId)
        && Objects.equals(this.actName, actGiftInfo.actName)
        && Objects.equals(this.actType, actGiftInfo.actType)
        && Objects.equals(this.giftList, actGiftInfo.giftList)
        && Objects.equals(this.giftBypass, actGiftInfo.giftBypass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actId, actName, actType, giftList, giftBypass);
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
