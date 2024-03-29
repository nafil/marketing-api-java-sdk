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

/** 回传信息结构 */
@ApiModel(description = "回传信息结构")
public class LeadsUpdateInfoStruct {
  @SerializedName("outer_leads_id")
  private String outerLeadsId = null;

  @SerializedName("leads_id")
  private Long leadsId = null;

  @SerializedName("click_id")
  private String clickId = null;

  @SerializedName("leads_user_type")
  private LeadsUserType leadsUserType = null;

  @SerializedName("leads_user_wechat_appid")
  private String leadsUserWechatAppid = null;

  @SerializedName("leads_user_id")
  private String leadsUserId = null;

  @SerializedName("leads_tel")
  private String leadsTel = null;

  @SerializedName("leads_qq")
  private Long leadsQq = null;

  @SerializedName("leads_wechat")
  private String leadsWechat = null;

  @SerializedName("leads_name")
  private String leadsName = null;

  @SerializedName("leads_gender")
  private LeadsGenderType leadsGender = null;

  @SerializedName("leads_email")
  private String leadsEmail = null;

  @SerializedName("leads_area")
  private String leadsArea = null;

  @SerializedName("bundle")
  private String bundle = null;

  @SerializedName("memo")
  private String memo = null;

  @SerializedName("shop_name")
  private String shopName = null;

  public LeadsUpdateInfoStruct outerLeadsId(String outerLeadsId) {
    this.outerLeadsId = outerLeadsId;
    return this;
  }

  /**
   * Get outerLeadsId
   *
   * @return outerLeadsId
   */
  @ApiModelProperty(value = "")
  public String getOuterLeadsId() {
    return outerLeadsId;
  }

  public void setOuterLeadsId(String outerLeadsId) {
    this.outerLeadsId = outerLeadsId;
  }

  public LeadsUpdateInfoStruct leadsId(Long leadsId) {
    this.leadsId = leadsId;
    return this;
  }

  /**
   * Get leadsId
   *
   * @return leadsId
   */
  @ApiModelProperty(value = "")
  public Long getLeadsId() {
    return leadsId;
  }

  public void setLeadsId(Long leadsId) {
    this.leadsId = leadsId;
  }

  public LeadsUpdateInfoStruct clickId(String clickId) {
    this.clickId = clickId;
    return this;
  }

  /**
   * Get clickId
   *
   * @return clickId
   */
  @ApiModelProperty(value = "")
  public String getClickId() {
    return clickId;
  }

  public void setClickId(String clickId) {
    this.clickId = clickId;
  }

  public LeadsUpdateInfoStruct leadsUserType(LeadsUserType leadsUserType) {
    this.leadsUserType = leadsUserType;
    return this;
  }

  /**
   * Get leadsUserType
   *
   * @return leadsUserType
   */
  @ApiModelProperty(value = "")
  public LeadsUserType getLeadsUserType() {
    return leadsUserType;
  }

  public void setLeadsUserType(LeadsUserType leadsUserType) {
    this.leadsUserType = leadsUserType;
  }

  public LeadsUpdateInfoStruct leadsUserWechatAppid(String leadsUserWechatAppid) {
    this.leadsUserWechatAppid = leadsUserWechatAppid;
    return this;
  }

  /**
   * Get leadsUserWechatAppid
   *
   * @return leadsUserWechatAppid
   */
  @ApiModelProperty(value = "")
  public String getLeadsUserWechatAppid() {
    return leadsUserWechatAppid;
  }

  public void setLeadsUserWechatAppid(String leadsUserWechatAppid) {
    this.leadsUserWechatAppid = leadsUserWechatAppid;
  }

  public LeadsUpdateInfoStruct leadsUserId(String leadsUserId) {
    this.leadsUserId = leadsUserId;
    return this;
  }

  /**
   * Get leadsUserId
   *
   * @return leadsUserId
   */
  @ApiModelProperty(value = "")
  public String getLeadsUserId() {
    return leadsUserId;
  }

  public void setLeadsUserId(String leadsUserId) {
    this.leadsUserId = leadsUserId;
  }

  public LeadsUpdateInfoStruct leadsTel(String leadsTel) {
    this.leadsTel = leadsTel;
    return this;
  }

  /**
   * Get leadsTel
   *
   * @return leadsTel
   */
  @ApiModelProperty(value = "")
  public String getLeadsTel() {
    return leadsTel;
  }

  public void setLeadsTel(String leadsTel) {
    this.leadsTel = leadsTel;
  }

  public LeadsUpdateInfoStruct leadsQq(Long leadsQq) {
    this.leadsQq = leadsQq;
    return this;
  }

  /**
   * Get leadsQq
   *
   * @return leadsQq
   */
  @ApiModelProperty(value = "")
  public Long getLeadsQq() {
    return leadsQq;
  }

  public void setLeadsQq(Long leadsQq) {
    this.leadsQq = leadsQq;
  }

  public LeadsUpdateInfoStruct leadsWechat(String leadsWechat) {
    this.leadsWechat = leadsWechat;
    return this;
  }

  /**
   * Get leadsWechat
   *
   * @return leadsWechat
   */
  @ApiModelProperty(value = "")
  public String getLeadsWechat() {
    return leadsWechat;
  }

  public void setLeadsWechat(String leadsWechat) {
    this.leadsWechat = leadsWechat;
  }

  public LeadsUpdateInfoStruct leadsName(String leadsName) {
    this.leadsName = leadsName;
    return this;
  }

  /**
   * Get leadsName
   *
   * @return leadsName
   */
  @ApiModelProperty(value = "")
  public String getLeadsName() {
    return leadsName;
  }

  public void setLeadsName(String leadsName) {
    this.leadsName = leadsName;
  }

  public LeadsUpdateInfoStruct leadsGender(LeadsGenderType leadsGender) {
    this.leadsGender = leadsGender;
    return this;
  }

  /**
   * Get leadsGender
   *
   * @return leadsGender
   */
  @ApiModelProperty(value = "")
  public LeadsGenderType getLeadsGender() {
    return leadsGender;
  }

  public void setLeadsGender(LeadsGenderType leadsGender) {
    this.leadsGender = leadsGender;
  }

  public LeadsUpdateInfoStruct leadsEmail(String leadsEmail) {
    this.leadsEmail = leadsEmail;
    return this;
  }

  /**
   * Get leadsEmail
   *
   * @return leadsEmail
   */
  @ApiModelProperty(value = "")
  public String getLeadsEmail() {
    return leadsEmail;
  }

  public void setLeadsEmail(String leadsEmail) {
    this.leadsEmail = leadsEmail;
  }

  public LeadsUpdateInfoStruct leadsArea(String leadsArea) {
    this.leadsArea = leadsArea;
    return this;
  }

  /**
   * Get leadsArea
   *
   * @return leadsArea
   */
  @ApiModelProperty(value = "")
  public String getLeadsArea() {
    return leadsArea;
  }

  public void setLeadsArea(String leadsArea) {
    this.leadsArea = leadsArea;
  }

  public LeadsUpdateInfoStruct bundle(String bundle) {
    this.bundle = bundle;
    return this;
  }

  /**
   * Get bundle
   *
   * @return bundle
   */
  @ApiModelProperty(value = "")
  public String getBundle() {
    return bundle;
  }

  public void setBundle(String bundle) {
    this.bundle = bundle;
  }

  public LeadsUpdateInfoStruct memo(String memo) {
    this.memo = memo;
    return this;
  }

  /**
   * Get memo
   *
   * @return memo
   */
  @ApiModelProperty(value = "")
  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }

  public LeadsUpdateInfoStruct shopName(String shopName) {
    this.shopName = shopName;
    return this;
  }

  /**
   * Get shopName
   *
   * @return shopName
   */
  @ApiModelProperty(value = "")
  public String getShopName() {
    return shopName;
  }

  public void setShopName(String shopName) {
    this.shopName = shopName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadsUpdateInfoStruct leadsUpdateInfoStruct = (LeadsUpdateInfoStruct) o;
    return Objects.equals(this.outerLeadsId, leadsUpdateInfoStruct.outerLeadsId)
        && Objects.equals(this.leadsId, leadsUpdateInfoStruct.leadsId)
        && Objects.equals(this.clickId, leadsUpdateInfoStruct.clickId)
        && Objects.equals(this.leadsUserType, leadsUpdateInfoStruct.leadsUserType)
        && Objects.equals(this.leadsUserWechatAppid, leadsUpdateInfoStruct.leadsUserWechatAppid)
        && Objects.equals(this.leadsUserId, leadsUpdateInfoStruct.leadsUserId)
        && Objects.equals(this.leadsTel, leadsUpdateInfoStruct.leadsTel)
        && Objects.equals(this.leadsQq, leadsUpdateInfoStruct.leadsQq)
        && Objects.equals(this.leadsWechat, leadsUpdateInfoStruct.leadsWechat)
        && Objects.equals(this.leadsName, leadsUpdateInfoStruct.leadsName)
        && Objects.equals(this.leadsGender, leadsUpdateInfoStruct.leadsGender)
        && Objects.equals(this.leadsEmail, leadsUpdateInfoStruct.leadsEmail)
        && Objects.equals(this.leadsArea, leadsUpdateInfoStruct.leadsArea)
        && Objects.equals(this.bundle, leadsUpdateInfoStruct.bundle)
        && Objects.equals(this.memo, leadsUpdateInfoStruct.memo)
        && Objects.equals(this.shopName, leadsUpdateInfoStruct.shopName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        outerLeadsId,
        leadsId,
        clickId,
        leadsUserType,
        leadsUserWechatAppid,
        leadsUserId,
        leadsTel,
        leadsQq,
        leadsWechat,
        leadsName,
        leadsGender,
        leadsEmail,
        leadsArea,
        bundle,
        memo,
        shopName);
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
