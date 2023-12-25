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

/** ConversionsAddRequest */
public class ConversionsAddRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("conversion_name")
  private String conversionName = null;

  @SerializedName("access_type")
  private AccessType accessType = null;

  @SerializedName("conversion_scene")
  private ConversionScene conversionScene = null;

  @SerializedName("marketing_carrier_id")
  private String marketingCarrierId = null;

  @SerializedName("app_android_channel_package_id")
  private String appAndroidChannelPackageId = null;

  @SerializedName("claim_type")
  private ClaimType claimType = null;

  @SerializedName("feedback_url")
  private String feedbackUrl = null;

  @SerializedName("landing_page_url")
  private String landingPageUrl = null;

  @SerializedName("mini_program_id")
  private String miniProgramId = null;

  @SerializedName("self_attributed")
  private Boolean selfAttributed = null;

  @SerializedName("optimization_goal")
  private OptimizationGoal optimizationGoal = null;

  @SerializedName("deep_behavior_optimization_goal")
  private OptimizationGoal deepBehaviorOptimizationGoal = null;

  @SerializedName("deep_worth_optimization_goal")
  private ConversionOptimizationGoal deepWorthOptimizationGoal = null;

  @SerializedName("deep_worth_advanced_goal")
  private ConversionOptimizationGoal deepWorthAdvancedGoal = null;

  @SerializedName("user_action_set_id")
  private Long userActionSetId = null;

  @SerializedName("conversion_link_id")
  private Long conversionLinkId = null;

  @SerializedName("impression_feedback_url")
  private String impressionFeedbackUrl = null;

  @SerializedName("attribution_window")
  private Long attributionWindow = null;

  @SerializedName("deep_behavior_advanced_goal")
  private OptimizationGoal deepBehaviorAdvancedGoal = null;

  @SerializedName("deep_optimization_goal_type")
  private DeepOptimizationGoalType deepOptimizationGoalType = null;

  @SerializedName("forward_link_assist")
  private OptimizationGoal forwardLinkAssist = null;

  public ConversionsAddRequest accountId(Long accountId) {
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

  public ConversionsAddRequest conversionName(String conversionName) {
    this.conversionName = conversionName;
    return this;
  }

  /**
   * Get conversionName
   *
   * @return conversionName
   */
  @ApiModelProperty(value = "")
  public String getConversionName() {
    return conversionName;
  }

  public void setConversionName(String conversionName) {
    this.conversionName = conversionName;
  }

  public ConversionsAddRequest accessType(AccessType accessType) {
    this.accessType = accessType;
    return this;
  }

  /**
   * Get accessType
   *
   * @return accessType
   */
  @ApiModelProperty(value = "")
  public AccessType getAccessType() {
    return accessType;
  }

  public void setAccessType(AccessType accessType) {
    this.accessType = accessType;
  }

  public ConversionsAddRequest conversionScene(ConversionScene conversionScene) {
    this.conversionScene = conversionScene;
    return this;
  }

  /**
   * Get conversionScene
   *
   * @return conversionScene
   */
  @ApiModelProperty(value = "")
  public ConversionScene getConversionScene() {
    return conversionScene;
  }

  public void setConversionScene(ConversionScene conversionScene) {
    this.conversionScene = conversionScene;
  }

  public ConversionsAddRequest marketingCarrierId(String marketingCarrierId) {
    this.marketingCarrierId = marketingCarrierId;
    return this;
  }

  /**
   * Get marketingCarrierId
   *
   * @return marketingCarrierId
   */
  @ApiModelProperty(value = "")
  public String getMarketingCarrierId() {
    return marketingCarrierId;
  }

  public void setMarketingCarrierId(String marketingCarrierId) {
    this.marketingCarrierId = marketingCarrierId;
  }

  public ConversionsAddRequest appAndroidChannelPackageId(String appAndroidChannelPackageId) {
    this.appAndroidChannelPackageId = appAndroidChannelPackageId;
    return this;
  }

  /**
   * Get appAndroidChannelPackageId
   *
   * @return appAndroidChannelPackageId
   */
  @ApiModelProperty(value = "")
  public String getAppAndroidChannelPackageId() {
    return appAndroidChannelPackageId;
  }

  public void setAppAndroidChannelPackageId(String appAndroidChannelPackageId) {
    this.appAndroidChannelPackageId = appAndroidChannelPackageId;
  }

  public ConversionsAddRequest claimType(ClaimType claimType) {
    this.claimType = claimType;
    return this;
  }

  /**
   * Get claimType
   *
   * @return claimType
   */
  @ApiModelProperty(value = "")
  public ClaimType getClaimType() {
    return claimType;
  }

  public void setClaimType(ClaimType claimType) {
    this.claimType = claimType;
  }

  public ConversionsAddRequest feedbackUrl(String feedbackUrl) {
    this.feedbackUrl = feedbackUrl;
    return this;
  }

  /**
   * Get feedbackUrl
   *
   * @return feedbackUrl
   */
  @ApiModelProperty(value = "")
  public String getFeedbackUrl() {
    return feedbackUrl;
  }

  public void setFeedbackUrl(String feedbackUrl) {
    this.feedbackUrl = feedbackUrl;
  }

  public ConversionsAddRequest landingPageUrl(String landingPageUrl) {
    this.landingPageUrl = landingPageUrl;
    return this;
  }

  /**
   * Get landingPageUrl
   *
   * @return landingPageUrl
   */
  @ApiModelProperty(value = "")
  public String getLandingPageUrl() {
    return landingPageUrl;
  }

  public void setLandingPageUrl(String landingPageUrl) {
    this.landingPageUrl = landingPageUrl;
  }

  public ConversionsAddRequest miniProgramId(String miniProgramId) {
    this.miniProgramId = miniProgramId;
    return this;
  }

  /**
   * Get miniProgramId
   *
   * @return miniProgramId
   */
  @ApiModelProperty(value = "")
  public String getMiniProgramId() {
    return miniProgramId;
  }

  public void setMiniProgramId(String miniProgramId) {
    this.miniProgramId = miniProgramId;
  }

  public ConversionsAddRequest selfAttributed(Boolean selfAttributed) {
    this.selfAttributed = selfAttributed;
    return this;
  }

  /**
   * Get selfAttributed
   *
   * @return selfAttributed
   */
  @ApiModelProperty(value = "")
  public Boolean isSelfAttributed() {
    return selfAttributed;
  }

  public void setSelfAttributed(Boolean selfAttributed) {
    this.selfAttributed = selfAttributed;
  }

  public ConversionsAddRequest optimizationGoal(OptimizationGoal optimizationGoal) {
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

  public ConversionsAddRequest deepBehaviorOptimizationGoal(
      OptimizationGoal deepBehaviorOptimizationGoal) {
    this.deepBehaviorOptimizationGoal = deepBehaviorOptimizationGoal;
    return this;
  }

  /**
   * Get deepBehaviorOptimizationGoal
   *
   * @return deepBehaviorOptimizationGoal
   */
  @ApiModelProperty(value = "")
  public OptimizationGoal getDeepBehaviorOptimizationGoal() {
    return deepBehaviorOptimizationGoal;
  }

  public void setDeepBehaviorOptimizationGoal(OptimizationGoal deepBehaviorOptimizationGoal) {
    this.deepBehaviorOptimizationGoal = deepBehaviorOptimizationGoal;
  }

  public ConversionsAddRequest deepWorthOptimizationGoal(
      ConversionOptimizationGoal deepWorthOptimizationGoal) {
    this.deepWorthOptimizationGoal = deepWorthOptimizationGoal;
    return this;
  }

  /**
   * Get deepWorthOptimizationGoal
   *
   * @return deepWorthOptimizationGoal
   */
  @ApiModelProperty(value = "")
  public ConversionOptimizationGoal getDeepWorthOptimizationGoal() {
    return deepWorthOptimizationGoal;
  }

  public void setDeepWorthOptimizationGoal(ConversionOptimizationGoal deepWorthOptimizationGoal) {
    this.deepWorthOptimizationGoal = deepWorthOptimizationGoal;
  }

  public ConversionsAddRequest deepWorthAdvancedGoal(
      ConversionOptimizationGoal deepWorthAdvancedGoal) {
    this.deepWorthAdvancedGoal = deepWorthAdvancedGoal;
    return this;
  }

  /**
   * Get deepWorthAdvancedGoal
   *
   * @return deepWorthAdvancedGoal
   */
  @ApiModelProperty(value = "")
  public ConversionOptimizationGoal getDeepWorthAdvancedGoal() {
    return deepWorthAdvancedGoal;
  }

  public void setDeepWorthAdvancedGoal(ConversionOptimizationGoal deepWorthAdvancedGoal) {
    this.deepWorthAdvancedGoal = deepWorthAdvancedGoal;
  }

  public ConversionsAddRequest userActionSetId(Long userActionSetId) {
    this.userActionSetId = userActionSetId;
    return this;
  }

  /**
   * Get userActionSetId
   *
   * @return userActionSetId
   */
  @ApiModelProperty(value = "")
  public Long getUserActionSetId() {
    return userActionSetId;
  }

  public void setUserActionSetId(Long userActionSetId) {
    this.userActionSetId = userActionSetId;
  }

  public ConversionsAddRequest conversionLinkId(Long conversionLinkId) {
    this.conversionLinkId = conversionLinkId;
    return this;
  }

  /**
   * Get conversionLinkId
   *
   * @return conversionLinkId
   */
  @ApiModelProperty(value = "")
  public Long getConversionLinkId() {
    return conversionLinkId;
  }

  public void setConversionLinkId(Long conversionLinkId) {
    this.conversionLinkId = conversionLinkId;
  }

  public ConversionsAddRequest impressionFeedbackUrl(String impressionFeedbackUrl) {
    this.impressionFeedbackUrl = impressionFeedbackUrl;
    return this;
  }

  /**
   * Get impressionFeedbackUrl
   *
   * @return impressionFeedbackUrl
   */
  @ApiModelProperty(value = "")
  public String getImpressionFeedbackUrl() {
    return impressionFeedbackUrl;
  }

  public void setImpressionFeedbackUrl(String impressionFeedbackUrl) {
    this.impressionFeedbackUrl = impressionFeedbackUrl;
  }

  public ConversionsAddRequest attributionWindow(Long attributionWindow) {
    this.attributionWindow = attributionWindow;
    return this;
  }

  /**
   * Get attributionWindow
   *
   * @return attributionWindow
   */
  @ApiModelProperty(value = "")
  public Long getAttributionWindow() {
    return attributionWindow;
  }

  public void setAttributionWindow(Long attributionWindow) {
    this.attributionWindow = attributionWindow;
  }

  public ConversionsAddRequest deepBehaviorAdvancedGoal(OptimizationGoal deepBehaviorAdvancedGoal) {
    this.deepBehaviorAdvancedGoal = deepBehaviorAdvancedGoal;
    return this;
  }

  /**
   * Get deepBehaviorAdvancedGoal
   *
   * @return deepBehaviorAdvancedGoal
   */
  @ApiModelProperty(value = "")
  public OptimizationGoal getDeepBehaviorAdvancedGoal() {
    return deepBehaviorAdvancedGoal;
  }

  public void setDeepBehaviorAdvancedGoal(OptimizationGoal deepBehaviorAdvancedGoal) {
    this.deepBehaviorAdvancedGoal = deepBehaviorAdvancedGoal;
  }

  public ConversionsAddRequest deepOptimizationGoalType(
      DeepOptimizationGoalType deepOptimizationGoalType) {
    this.deepOptimizationGoalType = deepOptimizationGoalType;
    return this;
  }

  /**
   * Get deepOptimizationGoalType
   *
   * @return deepOptimizationGoalType
   */
  @ApiModelProperty(value = "")
  public DeepOptimizationGoalType getDeepOptimizationGoalType() {
    return deepOptimizationGoalType;
  }

  public void setDeepOptimizationGoalType(DeepOptimizationGoalType deepOptimizationGoalType) {
    this.deepOptimizationGoalType = deepOptimizationGoalType;
  }

  public ConversionsAddRequest forwardLinkAssist(OptimizationGoal forwardLinkAssist) {
    this.forwardLinkAssist = forwardLinkAssist;
    return this;
  }

  /**
   * Get forwardLinkAssist
   *
   * @return forwardLinkAssist
   */
  @ApiModelProperty(value = "")
  public OptimizationGoal getForwardLinkAssist() {
    return forwardLinkAssist;
  }

  public void setForwardLinkAssist(OptimizationGoal forwardLinkAssist) {
    this.forwardLinkAssist = forwardLinkAssist;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionsAddRequest conversionsAddRequest = (ConversionsAddRequest) o;
    return Objects.equals(this.accountId, conversionsAddRequest.accountId)
        && Objects.equals(this.conversionName, conversionsAddRequest.conversionName)
        && Objects.equals(this.accessType, conversionsAddRequest.accessType)
        && Objects.equals(this.conversionScene, conversionsAddRequest.conversionScene)
        && Objects.equals(this.marketingCarrierId, conversionsAddRequest.marketingCarrierId)
        && Objects.equals(
            this.appAndroidChannelPackageId, conversionsAddRequest.appAndroidChannelPackageId)
        && Objects.equals(this.claimType, conversionsAddRequest.claimType)
        && Objects.equals(this.feedbackUrl, conversionsAddRequest.feedbackUrl)
        && Objects.equals(this.landingPageUrl, conversionsAddRequest.landingPageUrl)
        && Objects.equals(this.miniProgramId, conversionsAddRequest.miniProgramId)
        && Objects.equals(this.selfAttributed, conversionsAddRequest.selfAttributed)
        && Objects.equals(this.optimizationGoal, conversionsAddRequest.optimizationGoal)
        && Objects.equals(
            this.deepBehaviorOptimizationGoal, conversionsAddRequest.deepBehaviorOptimizationGoal)
        && Objects.equals(
            this.deepWorthOptimizationGoal, conversionsAddRequest.deepWorthOptimizationGoal)
        && Objects.equals(this.deepWorthAdvancedGoal, conversionsAddRequest.deepWorthAdvancedGoal)
        && Objects.equals(this.userActionSetId, conversionsAddRequest.userActionSetId)
        && Objects.equals(this.conversionLinkId, conversionsAddRequest.conversionLinkId)
        && Objects.equals(this.impressionFeedbackUrl, conversionsAddRequest.impressionFeedbackUrl)
        && Objects.equals(this.attributionWindow, conversionsAddRequest.attributionWindow)
        && Objects.equals(
            this.deepBehaviorAdvancedGoal, conversionsAddRequest.deepBehaviorAdvancedGoal)
        && Objects.equals(
            this.deepOptimizationGoalType, conversionsAddRequest.deepOptimizationGoalType)
        && Objects.equals(this.forwardLinkAssist, conversionsAddRequest.forwardLinkAssist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        conversionName,
        accessType,
        conversionScene,
        marketingCarrierId,
        appAndroidChannelPackageId,
        claimType,
        feedbackUrl,
        landingPageUrl,
        miniProgramId,
        selfAttributed,
        optimizationGoal,
        deepBehaviorOptimizationGoal,
        deepWorthOptimizationGoal,
        deepWorthAdvancedGoal,
        userActionSetId,
        conversionLinkId,
        impressionFeedbackUrl,
        attributionWindow,
        deepBehaviorAdvancedGoal,
        deepOptimizationGoalType,
        forwardLinkAssist);
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
