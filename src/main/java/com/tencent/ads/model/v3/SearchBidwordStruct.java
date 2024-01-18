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

/** 关键词信息 */
@ApiModel(description = "关键词信息")
public class SearchBidwordStruct {
  @SerializedName("campaign_id")
  private Long campaignId = null;

  @SerializedName("adgroup_id")
  private Long adgroupId = null;

  @SerializedName("bidword")
  private String bidword = null;

  @SerializedName("bid_price")
  private Long bidPrice = null;

  @SerializedName("use_group_price")
  private UseGroupPriceType useGroupPrice = null;

  @SerializedName("match_type")
  private BidwordMatchType matchType = null;

  @SerializedName("configured_status")
  private BidwordPauseType configuredStatus = null;

  public SearchBidwordStruct campaignId(Long campaignId) {
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

  public SearchBidwordStruct adgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
    return this;
  }

  /**
   * Get adgroupId
   *
   * @return adgroupId
   */
  @ApiModelProperty(value = "")
  public Long getAdgroupId() {
    return adgroupId;
  }

  public void setAdgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
  }

  public SearchBidwordStruct bidword(String bidword) {
    this.bidword = bidword;
    return this;
  }

  /**
   * Get bidword
   *
   * @return bidword
   */
  @ApiModelProperty(value = "")
  public String getBidword() {
    return bidword;
  }

  public void setBidword(String bidword) {
    this.bidword = bidword;
  }

  public SearchBidwordStruct bidPrice(Long bidPrice) {
    this.bidPrice = bidPrice;
    return this;
  }

  /**
   * Get bidPrice
   *
   * @return bidPrice
   */
  @ApiModelProperty(value = "")
  public Long getBidPrice() {
    return bidPrice;
  }

  public void setBidPrice(Long bidPrice) {
    this.bidPrice = bidPrice;
  }

  public SearchBidwordStruct useGroupPrice(UseGroupPriceType useGroupPrice) {
    this.useGroupPrice = useGroupPrice;
    return this;
  }

  /**
   * Get useGroupPrice
   *
   * @return useGroupPrice
   */
  @ApiModelProperty(value = "")
  public UseGroupPriceType getUseGroupPrice() {
    return useGroupPrice;
  }

  public void setUseGroupPrice(UseGroupPriceType useGroupPrice) {
    this.useGroupPrice = useGroupPrice;
  }

  public SearchBidwordStruct matchType(BidwordMatchType matchType) {
    this.matchType = matchType;
    return this;
  }

  /**
   * Get matchType
   *
   * @return matchType
   */
  @ApiModelProperty(value = "")
  public BidwordMatchType getMatchType() {
    return matchType;
  }

  public void setMatchType(BidwordMatchType matchType) {
    this.matchType = matchType;
  }

  public SearchBidwordStruct configuredStatus(BidwordPauseType configuredStatus) {
    this.configuredStatus = configuredStatus;
    return this;
  }

  /**
   * Get configuredStatus
   *
   * @return configuredStatus
   */
  @ApiModelProperty(value = "")
  public BidwordPauseType getConfiguredStatus() {
    return configuredStatus;
  }

  public void setConfiguredStatus(BidwordPauseType configuredStatus) {
    this.configuredStatus = configuredStatus;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchBidwordStruct searchBidwordStruct = (SearchBidwordStruct) o;
    return Objects.equals(this.campaignId, searchBidwordStruct.campaignId)
        && Objects.equals(this.adgroupId, searchBidwordStruct.adgroupId)
        && Objects.equals(this.bidword, searchBidwordStruct.bidword)
        && Objects.equals(this.bidPrice, searchBidwordStruct.bidPrice)
        && Objects.equals(this.useGroupPrice, searchBidwordStruct.useGroupPrice)
        && Objects.equals(this.matchType, searchBidwordStruct.matchType)
        && Objects.equals(this.configuredStatus, searchBidwordStruct.configuredStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        campaignId, adgroupId, bidword, bidPrice, useGroupPrice, matchType, configuredStatus);
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
