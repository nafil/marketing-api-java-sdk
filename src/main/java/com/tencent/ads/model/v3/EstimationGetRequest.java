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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** EstimationGetRequest */
public class EstimationGetRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("adgroup_id")
  private Long adgroupId = null;

  @SerializedName("adgroup_name")
  private String adgroupName = null;

  @SerializedName("marketing_goal")
  private MarketingGoal marketingGoal = null;

  @SerializedName("marketing_target_type")
  private MarketingTargetType marketingTargetType = null;

  @SerializedName("marketing_target_detail")
  private MarketingTargetDetail marketingTargetDetail = null;

  @SerializedName("marketing_sub_goal")
  private MarketingSubGoal marketingSubGoal = null;

  @SerializedName("marketing_carrier_type")
  private MarketingCarrierType marketingCarrierType = null;

  @SerializedName("marketing_carrier_detail")
  private MarketingCarrierDetail marketingCarrierDetail = null;

  @SerializedName("automatic_site_enabled")
  private Boolean automaticSiteEnabled = null;

  @SerializedName("site_set")
  private List<String> siteSet = null;

  @SerializedName("bid_mode")
  private BidMode bidMode = null;

  @SerializedName("bid_amount")
  private Long bidAmount = null;

  @SerializedName("optimization_goal")
  private OptimizationGoal optimizationGoal = null;

  @SerializedName("time_series")
  private String timeSeries = null;

  @SerializedName("targeting")
  private WriteTargetingSetting targeting = null;

  @SerializedName("scene_spec")
  private SceneTargetingForWrite sceneSpec = null;

  public EstimationGetRequest accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   *
   * @return accountId
   */
  @ApiModelProperty(value = "")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public EstimationGetRequest adgroupId(Long adgroupId) {
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

  public EstimationGetRequest adgroupName(String adgroupName) {
    this.adgroupName = adgroupName;
    return this;
  }

  /**
   * Get adgroupName
   *
   * @return adgroupName
   */
  @ApiModelProperty(value = "")
  public String getAdgroupName() {
    return adgroupName;
  }

  public void setAdgroupName(String adgroupName) {
    this.adgroupName = adgroupName;
  }

  public EstimationGetRequest marketingGoal(MarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
    return this;
  }

  /**
   * Get marketingGoal
   *
   * @return marketingGoal
   */
  @ApiModelProperty(value = "")
  public MarketingGoal getMarketingGoal() {
    return marketingGoal;
  }

  public void setMarketingGoal(MarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
  }

  public EstimationGetRequest marketingTargetType(MarketingTargetType marketingTargetType) {
    this.marketingTargetType = marketingTargetType;
    return this;
  }

  /**
   * Get marketingTargetType
   *
   * @return marketingTargetType
   */
  @ApiModelProperty(value = "")
  public MarketingTargetType getMarketingTargetType() {
    return marketingTargetType;
  }

  public void setMarketingTargetType(MarketingTargetType marketingTargetType) {
    this.marketingTargetType = marketingTargetType;
  }

  public EstimationGetRequest marketingTargetDetail(MarketingTargetDetail marketingTargetDetail) {
    this.marketingTargetDetail = marketingTargetDetail;
    return this;
  }

  /**
   * Get marketingTargetDetail
   *
   * @return marketingTargetDetail
   */
  @ApiModelProperty(value = "")
  public MarketingTargetDetail getMarketingTargetDetail() {
    return marketingTargetDetail;
  }

  public void setMarketingTargetDetail(MarketingTargetDetail marketingTargetDetail) {
    this.marketingTargetDetail = marketingTargetDetail;
  }

  public EstimationGetRequest marketingSubGoal(MarketingSubGoal marketingSubGoal) {
    this.marketingSubGoal = marketingSubGoal;
    return this;
  }

  /**
   * Get marketingSubGoal
   *
   * @return marketingSubGoal
   */
  @ApiModelProperty(value = "")
  public MarketingSubGoal getMarketingSubGoal() {
    return marketingSubGoal;
  }

  public void setMarketingSubGoal(MarketingSubGoal marketingSubGoal) {
    this.marketingSubGoal = marketingSubGoal;
  }

  public EstimationGetRequest marketingCarrierType(MarketingCarrierType marketingCarrierType) {
    this.marketingCarrierType = marketingCarrierType;
    return this;
  }

  /**
   * Get marketingCarrierType
   *
   * @return marketingCarrierType
   */
  @ApiModelProperty(value = "")
  public MarketingCarrierType getMarketingCarrierType() {
    return marketingCarrierType;
  }

  public void setMarketingCarrierType(MarketingCarrierType marketingCarrierType) {
    this.marketingCarrierType = marketingCarrierType;
  }

  public EstimationGetRequest marketingCarrierDetail(
      MarketingCarrierDetail marketingCarrierDetail) {
    this.marketingCarrierDetail = marketingCarrierDetail;
    return this;
  }

  /**
   * Get marketingCarrierDetail
   *
   * @return marketingCarrierDetail
   */
  @ApiModelProperty(value = "")
  public MarketingCarrierDetail getMarketingCarrierDetail() {
    return marketingCarrierDetail;
  }

  public void setMarketingCarrierDetail(MarketingCarrierDetail marketingCarrierDetail) {
    this.marketingCarrierDetail = marketingCarrierDetail;
  }

  public EstimationGetRequest automaticSiteEnabled(Boolean automaticSiteEnabled) {
    this.automaticSiteEnabled = automaticSiteEnabled;
    return this;
  }

  /**
   * Get automaticSiteEnabled
   *
   * @return automaticSiteEnabled
   */
  @ApiModelProperty(value = "")
  public Boolean isAutomaticSiteEnabled() {
    return automaticSiteEnabled;
  }

  public void setAutomaticSiteEnabled(Boolean automaticSiteEnabled) {
    this.automaticSiteEnabled = automaticSiteEnabled;
  }

  public EstimationGetRequest siteSet(List<String> siteSet) {
    this.siteSet = siteSet;
    return this;
  }

  public EstimationGetRequest addSiteSetItem(String siteSetItem) {
    if (this.siteSet == null) {
      this.siteSet = new ArrayList<String>();
    }
    this.siteSet.add(siteSetItem);
    return this;
  }

  /**
   * Get siteSet
   *
   * @return siteSet
   */
  @ApiModelProperty(value = "")
  public List<String> getSiteSet() {
    return siteSet;
  }

  public void setSiteSet(List<String> siteSet) {
    this.siteSet = siteSet;
  }

  public EstimationGetRequest bidMode(BidMode bidMode) {
    this.bidMode = bidMode;
    return this;
  }

  /**
   * Get bidMode
   *
   * @return bidMode
   */
  @ApiModelProperty(value = "")
  public BidMode getBidMode() {
    return bidMode;
  }

  public void setBidMode(BidMode bidMode) {
    this.bidMode = bidMode;
  }

  public EstimationGetRequest bidAmount(Long bidAmount) {
    this.bidAmount = bidAmount;
    return this;
  }

  /**
   * Get bidAmount
   *
   * @return bidAmount
   */
  @ApiModelProperty(value = "")
  public Long getBidAmount() {
    return bidAmount;
  }

  public void setBidAmount(Long bidAmount) {
    this.bidAmount = bidAmount;
  }

  public EstimationGetRequest optimizationGoal(OptimizationGoal optimizationGoal) {
    this.optimizationGoal = optimizationGoal;
    return this;
  }

  /**
   * Get optimizationGoal
   *
   * @return optimizationGoal
   */
  @ApiModelProperty(value = "")
  public OptimizationGoal getOptimizationGoal() {
    return optimizationGoal;
  }

  public void setOptimizationGoal(OptimizationGoal optimizationGoal) {
    this.optimizationGoal = optimizationGoal;
  }

  public EstimationGetRequest timeSeries(String timeSeries) {
    this.timeSeries = timeSeries;
    return this;
  }

  /**
   * Get timeSeries
   *
   * @return timeSeries
   */
  @ApiModelProperty(value = "")
  public String getTimeSeries() {
    return timeSeries;
  }

  public void setTimeSeries(String timeSeries) {
    this.timeSeries = timeSeries;
  }

  public EstimationGetRequest targeting(WriteTargetingSetting targeting) {
    this.targeting = targeting;
    return this;
  }

  /**
   * Get targeting
   *
   * @return targeting
   */
  @ApiModelProperty(value = "")
  public WriteTargetingSetting getTargeting() {
    return targeting;
  }

  public void setTargeting(WriteTargetingSetting targeting) {
    this.targeting = targeting;
  }

  public EstimationGetRequest sceneSpec(SceneTargetingForWrite sceneSpec) {
    this.sceneSpec = sceneSpec;
    return this;
  }

  /**
   * Get sceneSpec
   *
   * @return sceneSpec
   */
  @ApiModelProperty(value = "")
  public SceneTargetingForWrite getSceneSpec() {
    return sceneSpec;
  }

  public void setSceneSpec(SceneTargetingForWrite sceneSpec) {
    this.sceneSpec = sceneSpec;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EstimationGetRequest estimationGetRequest = (EstimationGetRequest) o;
    return Objects.equals(this.accountId, estimationGetRequest.accountId)
        && Objects.equals(this.adgroupId, estimationGetRequest.adgroupId)
        && Objects.equals(this.adgroupName, estimationGetRequest.adgroupName)
        && Objects.equals(this.marketingGoal, estimationGetRequest.marketingGoal)
        && Objects.equals(this.marketingTargetType, estimationGetRequest.marketingTargetType)
        && Objects.equals(this.marketingTargetDetail, estimationGetRequest.marketingTargetDetail)
        && Objects.equals(this.marketingSubGoal, estimationGetRequest.marketingSubGoal)
        && Objects.equals(this.marketingCarrierType, estimationGetRequest.marketingCarrierType)
        && Objects.equals(this.marketingCarrierDetail, estimationGetRequest.marketingCarrierDetail)
        && Objects.equals(this.automaticSiteEnabled, estimationGetRequest.automaticSiteEnabled)
        && Objects.equals(this.siteSet, estimationGetRequest.siteSet)
        && Objects.equals(this.bidMode, estimationGetRequest.bidMode)
        && Objects.equals(this.bidAmount, estimationGetRequest.bidAmount)
        && Objects.equals(this.optimizationGoal, estimationGetRequest.optimizationGoal)
        && Objects.equals(this.timeSeries, estimationGetRequest.timeSeries)
        && Objects.equals(this.targeting, estimationGetRequest.targeting)
        && Objects.equals(this.sceneSpec, estimationGetRequest.sceneSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        adgroupId,
        adgroupName,
        marketingGoal,
        marketingTargetType,
        marketingTargetDetail,
        marketingSubGoal,
        marketingCarrierType,
        marketingCarrierDetail,
        automaticSiteEnabled,
        siteSet,
        bidMode,
        bidAmount,
        optimizationGoal,
        timeSeries,
        targeting,
        sceneSpec);
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
