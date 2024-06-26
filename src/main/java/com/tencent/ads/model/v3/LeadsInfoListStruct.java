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

/** 线索数据信息结构 */
@ApiModel(description = "线索数据信息结构")
public class LeadsInfoListStruct {
  @SerializedName("video_channel_id")
  private String videoChannelId = null;

  @SerializedName("video_channel_name")
  private String videoChannelName = null;

  @SerializedName("date")
  private Long date = null;

  @SerializedName("dealer_id")
  private Long dealerId = null;

  @SerializedName("dealer_name")
  private String dealerName = null;

  @SerializedName("leads_cnt")
  private Long leadsCnt = null;

  @SerializedName("form_leads_cnt")
  private Long formLeadsCnt = null;

  @SerializedName("wecom_leads_cnt")
  private Long wecomLeadsCnt = null;

  @SerializedName("consult_leads_cnt")
  private Long consultLeadsCnt = null;

  @SerializedName("ad_leads_cnt")
  private Long adLeadsCnt = null;

  @SerializedName("natural_leads_cnt")
  private Long naturalLeadsCnt = null;

  public LeadsInfoListStruct videoChannelId(String videoChannelId) {
    this.videoChannelId = videoChannelId;
    return this;
  }

  /**
   * Get videoChannelId
   *
   * @return videoChannelId
   */
  @ApiModelProperty(value = "")
  public String getVideoChannelId() {
    return videoChannelId;
  }

  public void setVideoChannelId(String videoChannelId) {
    this.videoChannelId = videoChannelId;
  }

  public LeadsInfoListStruct videoChannelName(String videoChannelName) {
    this.videoChannelName = videoChannelName;
    return this;
  }

  /**
   * Get videoChannelName
   *
   * @return videoChannelName
   */
  @ApiModelProperty(value = "")
  public String getVideoChannelName() {
    return videoChannelName;
  }

  public void setVideoChannelName(String videoChannelName) {
    this.videoChannelName = videoChannelName;
  }

  public LeadsInfoListStruct date(Long date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   *
   * @return date
   */
  @ApiModelProperty(value = "")
  public Long getDate() {
    return date;
  }

  public void setDate(Long date) {
    this.date = date;
  }

  public LeadsInfoListStruct dealerId(Long dealerId) {
    this.dealerId = dealerId;
    return this;
  }

  /**
   * Get dealerId
   *
   * @return dealerId
   */
  @ApiModelProperty(value = "")
  public Long getDealerId() {
    return dealerId;
  }

  public void setDealerId(Long dealerId) {
    this.dealerId = dealerId;
  }

  public LeadsInfoListStruct dealerName(String dealerName) {
    this.dealerName = dealerName;
    return this;
  }

  /**
   * Get dealerName
   *
   * @return dealerName
   */
  @ApiModelProperty(value = "")
  public String getDealerName() {
    return dealerName;
  }

  public void setDealerName(String dealerName) {
    this.dealerName = dealerName;
  }

  public LeadsInfoListStruct leadsCnt(Long leadsCnt) {
    this.leadsCnt = leadsCnt;
    return this;
  }

  /**
   * Get leadsCnt
   *
   * @return leadsCnt
   */
  @ApiModelProperty(value = "")
  public Long getLeadsCnt() {
    return leadsCnt;
  }

  public void setLeadsCnt(Long leadsCnt) {
    this.leadsCnt = leadsCnt;
  }

  public LeadsInfoListStruct formLeadsCnt(Long formLeadsCnt) {
    this.formLeadsCnt = formLeadsCnt;
    return this;
  }

  /**
   * Get formLeadsCnt
   *
   * @return formLeadsCnt
   */
  @ApiModelProperty(value = "")
  public Long getFormLeadsCnt() {
    return formLeadsCnt;
  }

  public void setFormLeadsCnt(Long formLeadsCnt) {
    this.formLeadsCnt = formLeadsCnt;
  }

  public LeadsInfoListStruct wecomLeadsCnt(Long wecomLeadsCnt) {
    this.wecomLeadsCnt = wecomLeadsCnt;
    return this;
  }

  /**
   * Get wecomLeadsCnt
   *
   * @return wecomLeadsCnt
   */
  @ApiModelProperty(value = "")
  public Long getWecomLeadsCnt() {
    return wecomLeadsCnt;
  }

  public void setWecomLeadsCnt(Long wecomLeadsCnt) {
    this.wecomLeadsCnt = wecomLeadsCnt;
  }

  public LeadsInfoListStruct consultLeadsCnt(Long consultLeadsCnt) {
    this.consultLeadsCnt = consultLeadsCnt;
    return this;
  }

  /**
   * Get consultLeadsCnt
   *
   * @return consultLeadsCnt
   */
  @ApiModelProperty(value = "")
  public Long getConsultLeadsCnt() {
    return consultLeadsCnt;
  }

  public void setConsultLeadsCnt(Long consultLeadsCnt) {
    this.consultLeadsCnt = consultLeadsCnt;
  }

  public LeadsInfoListStruct adLeadsCnt(Long adLeadsCnt) {
    this.adLeadsCnt = adLeadsCnt;
    return this;
  }

  /**
   * Get adLeadsCnt
   *
   * @return adLeadsCnt
   */
  @ApiModelProperty(value = "")
  public Long getAdLeadsCnt() {
    return adLeadsCnt;
  }

  public void setAdLeadsCnt(Long adLeadsCnt) {
    this.adLeadsCnt = adLeadsCnt;
  }

  public LeadsInfoListStruct naturalLeadsCnt(Long naturalLeadsCnt) {
    this.naturalLeadsCnt = naturalLeadsCnt;
    return this;
  }

  /**
   * Get naturalLeadsCnt
   *
   * @return naturalLeadsCnt
   */
  @ApiModelProperty(value = "")
  public Long getNaturalLeadsCnt() {
    return naturalLeadsCnt;
  }

  public void setNaturalLeadsCnt(Long naturalLeadsCnt) {
    this.naturalLeadsCnt = naturalLeadsCnt;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadsInfoListStruct leadsInfoListStruct = (LeadsInfoListStruct) o;
    return Objects.equals(this.videoChannelId, leadsInfoListStruct.videoChannelId)
        && Objects.equals(this.videoChannelName, leadsInfoListStruct.videoChannelName)
        && Objects.equals(this.date, leadsInfoListStruct.date)
        && Objects.equals(this.dealerId, leadsInfoListStruct.dealerId)
        && Objects.equals(this.dealerName, leadsInfoListStruct.dealerName)
        && Objects.equals(this.leadsCnt, leadsInfoListStruct.leadsCnt)
        && Objects.equals(this.formLeadsCnt, leadsInfoListStruct.formLeadsCnt)
        && Objects.equals(this.wecomLeadsCnt, leadsInfoListStruct.wecomLeadsCnt)
        && Objects.equals(this.consultLeadsCnt, leadsInfoListStruct.consultLeadsCnt)
        && Objects.equals(this.adLeadsCnt, leadsInfoListStruct.adLeadsCnt)
        && Objects.equals(this.naturalLeadsCnt, leadsInfoListStruct.naturalLeadsCnt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        videoChannelId,
        videoChannelName,
        date,
        dealerId,
        dealerName,
        leadsCnt,
        formLeadsCnt,
        wecomLeadsCnt,
        consultLeadsCnt,
        adLeadsCnt,
        naturalLeadsCnt);
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
