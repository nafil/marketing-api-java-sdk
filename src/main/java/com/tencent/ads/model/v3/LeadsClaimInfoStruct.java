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
public class LeadsClaimInfoStruct {
  @SerializedName("outer_leads_id")
  private String outerLeadsId = null;

  @SerializedName("leads_user_type")
  private LeadsUserType leadsUserType = null;

  @SerializedName("leads_user_wechat_appid")
  private String leadsUserWechatAppid = null;

  @SerializedName("leads_user_id")
  private String leadsUserId = null;

  @SerializedName("campaign_id")
  private Long campaignId = null;

  @SerializedName("adgroup_id")
  private String adgroupId = null;

  @SerializedName("wechat_agency_id")
  private String wechatAgencyId = null;

  public LeadsClaimInfoStruct outerLeadsId(String outerLeadsId) {
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

  public LeadsClaimInfoStruct leadsUserType(LeadsUserType leadsUserType) {
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

  public LeadsClaimInfoStruct leadsUserWechatAppid(String leadsUserWechatAppid) {
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

  public LeadsClaimInfoStruct leadsUserId(String leadsUserId) {
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

  public LeadsClaimInfoStruct campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Get campaignId
   *
   * @return campaignId
   */
  @ApiModelProperty(value = "")
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public LeadsClaimInfoStruct adgroupId(String adgroupId) {
    this.adgroupId = adgroupId;
    return this;
  }

  /**
   * Get adgroupId
   *
   * @return adgroupId
   */
  @ApiModelProperty(value = "")
  public String getAdgroupId() {
    return adgroupId;
  }

  public void setAdgroupId(String adgroupId) {
    this.adgroupId = adgroupId;
  }

  public LeadsClaimInfoStruct wechatAgencyId(String wechatAgencyId) {
    this.wechatAgencyId = wechatAgencyId;
    return this;
  }

  /**
   * Get wechatAgencyId
   *
   * @return wechatAgencyId
   */
  @ApiModelProperty(value = "")
  public String getWechatAgencyId() {
    return wechatAgencyId;
  }

  public void setWechatAgencyId(String wechatAgencyId) {
    this.wechatAgencyId = wechatAgencyId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadsClaimInfoStruct leadsClaimInfoStruct = (LeadsClaimInfoStruct) o;
    return Objects.equals(this.outerLeadsId, leadsClaimInfoStruct.outerLeadsId)
        && Objects.equals(this.leadsUserType, leadsClaimInfoStruct.leadsUserType)
        && Objects.equals(this.leadsUserWechatAppid, leadsClaimInfoStruct.leadsUserWechatAppid)
        && Objects.equals(this.leadsUserId, leadsClaimInfoStruct.leadsUserId)
        && Objects.equals(this.campaignId, leadsClaimInfoStruct.campaignId)
        && Objects.equals(this.adgroupId, leadsClaimInfoStruct.adgroupId)
        && Objects.equals(this.wechatAgencyId, leadsClaimInfoStruct.wechatAgencyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        outerLeadsId,
        leadsUserType,
        leadsUserWechatAppid,
        leadsUserId,
        campaignId,
        adgroupId,
        wechatAgencyId);
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
