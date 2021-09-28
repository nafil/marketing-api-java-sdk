/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 1.3
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.tencent.ads.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 返回结构 */
@ApiModel(description = "返回结构")
public class AdcreativesGetListStruct {
  @SerializedName("campaign_id")
  private Long campaignId = null;

  @SerializedName("adcreative_id")
  private Long adcreativeId = null;

  @SerializedName("outer_adcreative_id")
  private Long outerAdcreativeId = null;

  @SerializedName("adcreative_name")
  private String adcreativeName = null;

  @SerializedName("page_type")
  private PageTypeRead pageType = null;

  @SerializedName("page_spec")
  private PageSpec pageSpec = null;

  @SerializedName("link_page_type")
  private LinkPageType linkPageType = null;

  @SerializedName("link_name_type")
  private LinkUrlLinkNameType linkNameType = null;

  @SerializedName("link_page_spec")
  private LinkPageSpec linkPageSpec = null;

  @SerializedName("conversion_data_type")
  private ConversionDataType conversionDataType = null;

  @SerializedName("conversion_target_type")
  private ConversionTargetType conversionTargetType = null;

  @SerializedName("qq_mini_game_tracking_query_string")
  private String qqMiniGameTrackingQueryString = null;

  @SerializedName("deep_link_url")
  private String deepLinkUrl = null;

  @SerializedName("android_deep_link_app_id")
  private String androidDeepLinkAppId = null;

  @SerializedName("ios_deep_link_app_id")
  private String iosDeepLinkAppId = null;

  @SerializedName("universal_link_url")
  private String universalLinkUrl = null;

  @SerializedName("site_set")
  private List<String> siteSet = null;

  @SerializedName("automatic_site_enabled")
  private Boolean automaticSiteEnabled = null;

  @SerializedName("promoted_object_type")
  private PromotedObjectType promotedObjectType = null;

  @SerializedName("promoted_object_id")
  private String promotedObjectId = null;

  @SerializedName("profile_id")
  private Long profileId = null;

  @SerializedName("created_time")
  private Long createdTime = null;

  @SerializedName("last_modified_time")
  private Long lastModifiedTime = null;

  @SerializedName("share_content_spec")
  private ShareContentSpec shareContentSpec = null;

  @SerializedName("dynamic_adcreative_spec")
  private DynamicAdcreativeSpec dynamicAdcreativeSpec = null;

  @SerializedName("is_deleted")
  private Boolean isDeleted = null;

  @SerializedName("is_dynamic_creative")
  private Boolean isDynamicCreative = null;

  @SerializedName("component_id")
  private Long componentId = null;

  @SerializedName("online_enabled")
  private Boolean onlineEnabled = null;

  @SerializedName("revised_adcreative_spec")
  private RevisedAdcreativeSpec revisedAdcreativeSpec = null;

  @SerializedName("union_market_switch")
  private Boolean unionMarketSwitch = null;

  @SerializedName("playable_page_material_id")
  private String playablePageMaterialId = null;

  @SerializedName("video_end_page")
  private VideoEndPageSpec videoEndPage = null;

  @SerializedName("feeds_video_comment_switch")
  private Boolean feedsVideoCommentSwitch = null;

  @SerializedName("webview_url")
  private String webviewUrl = null;

  @SerializedName("simple_canvas_sub_type")
  private SimpleCanvasSubType simpleCanvasSubType = null;

  @SerializedName("floating_zone")
  private FloatingZone floatingZone = null;

  @SerializedName("marketing_pendant_image_id")
  private String marketingPendantImageId = null;

  @SerializedName("countdown_switch")
  private Boolean countdownSwitch = null;

  @SerializedName("page_track_url")
  private String pageTrackUrl = null;

  @SerializedName("barrage_list")
  private List<BarrageListReadStruct> barrageList = null;

  @SerializedName("app_gift_pack_code")
  private AppGiftPackCode appGiftPackCode = null;

  @SerializedName("enable_breakthrough_siteset")
  private Boolean enableBreakthroughSiteset = null;

  @SerializedName("creative_template_version_type")
  private CreativeTemplateVersionType creativeTemplateVersionType = null;

  @SerializedName("adcreative_template_id")
  private Long adcreativeTemplateId = null;

  @SerializedName("adcreative_elements")
  private AdcreativeCreativeElementsReadMp adcreativeElements = null;

  public AdcreativesGetListStruct campaignId(Long campaignId) {
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

  public AdcreativesGetListStruct adcreativeId(Long adcreativeId) {
    this.adcreativeId = adcreativeId;
    return this;
  }

  /**
   * Get adcreativeId
   *
   * @return adcreativeId
   */
  @ApiModelProperty(value = "")
  public Long getAdcreativeId() {
    return adcreativeId;
  }

  public void setAdcreativeId(Long adcreativeId) {
    this.adcreativeId = adcreativeId;
  }

  public AdcreativesGetListStruct outerAdcreativeId(Long outerAdcreativeId) {
    this.outerAdcreativeId = outerAdcreativeId;
    return this;
  }

  /**
   * Get outerAdcreativeId
   *
   * @return outerAdcreativeId
   */
  @ApiModelProperty(value = "")
  public Long getOuterAdcreativeId() {
    return outerAdcreativeId;
  }

  public void setOuterAdcreativeId(Long outerAdcreativeId) {
    this.outerAdcreativeId = outerAdcreativeId;
  }

  public AdcreativesGetListStruct adcreativeName(String adcreativeName) {
    this.adcreativeName = adcreativeName;
    return this;
  }

  /**
   * Get adcreativeName
   *
   * @return adcreativeName
   */
  @ApiModelProperty(value = "")
  public String getAdcreativeName() {
    return adcreativeName;
  }

  public void setAdcreativeName(String adcreativeName) {
    this.adcreativeName = adcreativeName;
  }

  public AdcreativesGetListStruct pageType(PageTypeRead pageType) {
    this.pageType = pageType;
    return this;
  }

  /**
   * Get pageType
   *
   * @return pageType
   */
  @ApiModelProperty(value = "")
  public PageTypeRead getPageType() {
    return pageType;
  }

  public void setPageType(PageTypeRead pageType) {
    this.pageType = pageType;
  }

  public AdcreativesGetListStruct pageSpec(PageSpec pageSpec) {
    this.pageSpec = pageSpec;
    return this;
  }

  /**
   * Get pageSpec
   *
   * @return pageSpec
   */
  @ApiModelProperty(value = "")
  public PageSpec getPageSpec() {
    return pageSpec;
  }

  public void setPageSpec(PageSpec pageSpec) {
    this.pageSpec = pageSpec;
  }

  public AdcreativesGetListStruct linkPageType(LinkPageType linkPageType) {
    this.linkPageType = linkPageType;
    return this;
  }

  /**
   * Get linkPageType
   *
   * @return linkPageType
   */
  @ApiModelProperty(value = "")
  public LinkPageType getLinkPageType() {
    return linkPageType;
  }

  public void setLinkPageType(LinkPageType linkPageType) {
    this.linkPageType = linkPageType;
  }

  public AdcreativesGetListStruct linkNameType(LinkUrlLinkNameType linkNameType) {
    this.linkNameType = linkNameType;
    return this;
  }

  /**
   * Get linkNameType
   *
   * @return linkNameType
   */
  @ApiModelProperty(value = "")
  public LinkUrlLinkNameType getLinkNameType() {
    return linkNameType;
  }

  public void setLinkNameType(LinkUrlLinkNameType linkNameType) {
    this.linkNameType = linkNameType;
  }

  public AdcreativesGetListStruct linkPageSpec(LinkPageSpec linkPageSpec) {
    this.linkPageSpec = linkPageSpec;
    return this;
  }

  /**
   * Get linkPageSpec
   *
   * @return linkPageSpec
   */
  @ApiModelProperty(value = "")
  public LinkPageSpec getLinkPageSpec() {
    return linkPageSpec;
  }

  public void setLinkPageSpec(LinkPageSpec linkPageSpec) {
    this.linkPageSpec = linkPageSpec;
  }

  public AdcreativesGetListStruct conversionDataType(ConversionDataType conversionDataType) {
    this.conversionDataType = conversionDataType;
    return this;
  }

  /**
   * Get conversionDataType
   *
   * @return conversionDataType
   */
  @ApiModelProperty(value = "")
  public ConversionDataType getConversionDataType() {
    return conversionDataType;
  }

  public void setConversionDataType(ConversionDataType conversionDataType) {
    this.conversionDataType = conversionDataType;
  }

  public AdcreativesGetListStruct conversionTargetType(ConversionTargetType conversionTargetType) {
    this.conversionTargetType = conversionTargetType;
    return this;
  }

  /**
   * Get conversionTargetType
   *
   * @return conversionTargetType
   */
  @ApiModelProperty(value = "")
  public ConversionTargetType getConversionTargetType() {
    return conversionTargetType;
  }

  public void setConversionTargetType(ConversionTargetType conversionTargetType) {
    this.conversionTargetType = conversionTargetType;
  }

  public AdcreativesGetListStruct qqMiniGameTrackingQueryString(
      String qqMiniGameTrackingQueryString) {
    this.qqMiniGameTrackingQueryString = qqMiniGameTrackingQueryString;
    return this;
  }

  /**
   * Get qqMiniGameTrackingQueryString
   *
   * @return qqMiniGameTrackingQueryString
   */
  @ApiModelProperty(value = "")
  public String getQqMiniGameTrackingQueryString() {
    return qqMiniGameTrackingQueryString;
  }

  public void setQqMiniGameTrackingQueryString(String qqMiniGameTrackingQueryString) {
    this.qqMiniGameTrackingQueryString = qqMiniGameTrackingQueryString;
  }

  public AdcreativesGetListStruct deepLinkUrl(String deepLinkUrl) {
    this.deepLinkUrl = deepLinkUrl;
    return this;
  }

  /**
   * Get deepLinkUrl
   *
   * @return deepLinkUrl
   */
  @ApiModelProperty(value = "")
  public String getDeepLinkUrl() {
    return deepLinkUrl;
  }

  public void setDeepLinkUrl(String deepLinkUrl) {
    this.deepLinkUrl = deepLinkUrl;
  }

  public AdcreativesGetListStruct androidDeepLinkAppId(String androidDeepLinkAppId) {
    this.androidDeepLinkAppId = androidDeepLinkAppId;
    return this;
  }

  /**
   * Get androidDeepLinkAppId
   *
   * @return androidDeepLinkAppId
   */
  @ApiModelProperty(value = "")
  public String getAndroidDeepLinkAppId() {
    return androidDeepLinkAppId;
  }

  public void setAndroidDeepLinkAppId(String androidDeepLinkAppId) {
    this.androidDeepLinkAppId = androidDeepLinkAppId;
  }

  public AdcreativesGetListStruct iosDeepLinkAppId(String iosDeepLinkAppId) {
    this.iosDeepLinkAppId = iosDeepLinkAppId;
    return this;
  }

  /**
   * Get iosDeepLinkAppId
   *
   * @return iosDeepLinkAppId
   */
  @ApiModelProperty(value = "")
  public String getIosDeepLinkAppId() {
    return iosDeepLinkAppId;
  }

  public void setIosDeepLinkAppId(String iosDeepLinkAppId) {
    this.iosDeepLinkAppId = iosDeepLinkAppId;
  }

  public AdcreativesGetListStruct universalLinkUrl(String universalLinkUrl) {
    this.universalLinkUrl = universalLinkUrl;
    return this;
  }

  /**
   * Get universalLinkUrl
   *
   * @return universalLinkUrl
   */
  @ApiModelProperty(value = "")
  public String getUniversalLinkUrl() {
    return universalLinkUrl;
  }

  public void setUniversalLinkUrl(String universalLinkUrl) {
    this.universalLinkUrl = universalLinkUrl;
  }

  public AdcreativesGetListStruct siteSet(List<String> siteSet) {
    this.siteSet = siteSet;
    return this;
  }

  public AdcreativesGetListStruct addSiteSetItem(String siteSetItem) {
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

  public AdcreativesGetListStruct automaticSiteEnabled(Boolean automaticSiteEnabled) {
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

  public AdcreativesGetListStruct promotedObjectType(PromotedObjectType promotedObjectType) {
    this.promotedObjectType = promotedObjectType;
    return this;
  }

  /**
   * Get promotedObjectType
   *
   * @return promotedObjectType
   */
  @ApiModelProperty(value = "")
  public PromotedObjectType getPromotedObjectType() {
    return promotedObjectType;
  }

  public void setPromotedObjectType(PromotedObjectType promotedObjectType) {
    this.promotedObjectType = promotedObjectType;
  }

  public AdcreativesGetListStruct promotedObjectId(String promotedObjectId) {
    this.promotedObjectId = promotedObjectId;
    return this;
  }

  /**
   * Get promotedObjectId
   *
   * @return promotedObjectId
   */
  @ApiModelProperty(value = "")
  public String getPromotedObjectId() {
    return promotedObjectId;
  }

  public void setPromotedObjectId(String promotedObjectId) {
    this.promotedObjectId = promotedObjectId;
  }

  public AdcreativesGetListStruct profileId(Long profileId) {
    this.profileId = profileId;
    return this;
  }

  /**
   * Get profileId
   *
   * @return profileId
   */
  @ApiModelProperty(value = "")
  public Long getProfileId() {
    return profileId;
  }

  public void setProfileId(Long profileId) {
    this.profileId = profileId;
  }

  public AdcreativesGetListStruct createdTime(Long createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   *
   * @return createdTime
   */
  @ApiModelProperty(value = "")
  public Long getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Long createdTime) {
    this.createdTime = createdTime;
  }

  public AdcreativesGetListStruct lastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  /**
   * Get lastModifiedTime
   *
   * @return lastModifiedTime
   */
  @ApiModelProperty(value = "")
  public Long getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public AdcreativesGetListStruct shareContentSpec(ShareContentSpec shareContentSpec) {
    this.shareContentSpec = shareContentSpec;
    return this;
  }

  /**
   * Get shareContentSpec
   *
   * @return shareContentSpec
   */
  @ApiModelProperty(value = "")
  public ShareContentSpec getShareContentSpec() {
    return shareContentSpec;
  }

  public void setShareContentSpec(ShareContentSpec shareContentSpec) {
    this.shareContentSpec = shareContentSpec;
  }

  public AdcreativesGetListStruct dynamicAdcreativeSpec(
      DynamicAdcreativeSpec dynamicAdcreativeSpec) {
    this.dynamicAdcreativeSpec = dynamicAdcreativeSpec;
    return this;
  }

  /**
   * Get dynamicAdcreativeSpec
   *
   * @return dynamicAdcreativeSpec
   */
  @ApiModelProperty(value = "")
  public DynamicAdcreativeSpec getDynamicAdcreativeSpec() {
    return dynamicAdcreativeSpec;
  }

  public void setDynamicAdcreativeSpec(DynamicAdcreativeSpec dynamicAdcreativeSpec) {
    this.dynamicAdcreativeSpec = dynamicAdcreativeSpec;
  }

  public AdcreativesGetListStruct isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Get isDeleted
   *
   * @return isDeleted
   */
  @ApiModelProperty(value = "")
  public Boolean isIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public AdcreativesGetListStruct isDynamicCreative(Boolean isDynamicCreative) {
    this.isDynamicCreative = isDynamicCreative;
    return this;
  }

  /**
   * Get isDynamicCreative
   *
   * @return isDynamicCreative
   */
  @ApiModelProperty(value = "")
  public Boolean isIsDynamicCreative() {
    return isDynamicCreative;
  }

  public void setIsDynamicCreative(Boolean isDynamicCreative) {
    this.isDynamicCreative = isDynamicCreative;
  }

  public AdcreativesGetListStruct componentId(Long componentId) {
    this.componentId = componentId;
    return this;
  }

  /**
   * Get componentId
   *
   * @return componentId
   */
  @ApiModelProperty(value = "")
  public Long getComponentId() {
    return componentId;
  }

  public void setComponentId(Long componentId) {
    this.componentId = componentId;
  }

  public AdcreativesGetListStruct onlineEnabled(Boolean onlineEnabled) {
    this.onlineEnabled = onlineEnabled;
    return this;
  }

  /**
   * Get onlineEnabled
   *
   * @return onlineEnabled
   */
  @ApiModelProperty(value = "")
  public Boolean isOnlineEnabled() {
    return onlineEnabled;
  }

  public void setOnlineEnabled(Boolean onlineEnabled) {
    this.onlineEnabled = onlineEnabled;
  }

  public AdcreativesGetListStruct revisedAdcreativeSpec(
      RevisedAdcreativeSpec revisedAdcreativeSpec) {
    this.revisedAdcreativeSpec = revisedAdcreativeSpec;
    return this;
  }

  /**
   * Get revisedAdcreativeSpec
   *
   * @return revisedAdcreativeSpec
   */
  @ApiModelProperty(value = "")
  public RevisedAdcreativeSpec getRevisedAdcreativeSpec() {
    return revisedAdcreativeSpec;
  }

  public void setRevisedAdcreativeSpec(RevisedAdcreativeSpec revisedAdcreativeSpec) {
    this.revisedAdcreativeSpec = revisedAdcreativeSpec;
  }

  public AdcreativesGetListStruct unionMarketSwitch(Boolean unionMarketSwitch) {
    this.unionMarketSwitch = unionMarketSwitch;
    return this;
  }

  /**
   * Get unionMarketSwitch
   *
   * @return unionMarketSwitch
   */
  @ApiModelProperty(value = "")
  public Boolean isUnionMarketSwitch() {
    return unionMarketSwitch;
  }

  public void setUnionMarketSwitch(Boolean unionMarketSwitch) {
    this.unionMarketSwitch = unionMarketSwitch;
  }

  public AdcreativesGetListStruct playablePageMaterialId(String playablePageMaterialId) {
    this.playablePageMaterialId = playablePageMaterialId;
    return this;
  }

  /**
   * Get playablePageMaterialId
   *
   * @return playablePageMaterialId
   */
  @ApiModelProperty(value = "")
  public String getPlayablePageMaterialId() {
    return playablePageMaterialId;
  }

  public void setPlayablePageMaterialId(String playablePageMaterialId) {
    this.playablePageMaterialId = playablePageMaterialId;
  }

  public AdcreativesGetListStruct videoEndPage(VideoEndPageSpec videoEndPage) {
    this.videoEndPage = videoEndPage;
    return this;
  }

  /**
   * Get videoEndPage
   *
   * @return videoEndPage
   */
  @ApiModelProperty(value = "")
  public VideoEndPageSpec getVideoEndPage() {
    return videoEndPage;
  }

  public void setVideoEndPage(VideoEndPageSpec videoEndPage) {
    this.videoEndPage = videoEndPage;
  }

  public AdcreativesGetListStruct feedsVideoCommentSwitch(Boolean feedsVideoCommentSwitch) {
    this.feedsVideoCommentSwitch = feedsVideoCommentSwitch;
    return this;
  }

  /**
   * Get feedsVideoCommentSwitch
   *
   * @return feedsVideoCommentSwitch
   */
  @ApiModelProperty(value = "")
  public Boolean isFeedsVideoCommentSwitch() {
    return feedsVideoCommentSwitch;
  }

  public void setFeedsVideoCommentSwitch(Boolean feedsVideoCommentSwitch) {
    this.feedsVideoCommentSwitch = feedsVideoCommentSwitch;
  }

  public AdcreativesGetListStruct webviewUrl(String webviewUrl) {
    this.webviewUrl = webviewUrl;
    return this;
  }

  /**
   * Get webviewUrl
   *
   * @return webviewUrl
   */
  @ApiModelProperty(value = "")
  public String getWebviewUrl() {
    return webviewUrl;
  }

  public void setWebviewUrl(String webviewUrl) {
    this.webviewUrl = webviewUrl;
  }

  public AdcreativesGetListStruct simpleCanvasSubType(SimpleCanvasSubType simpleCanvasSubType) {
    this.simpleCanvasSubType = simpleCanvasSubType;
    return this;
  }

  /**
   * Get simpleCanvasSubType
   *
   * @return simpleCanvasSubType
   */
  @ApiModelProperty(value = "")
  public SimpleCanvasSubType getSimpleCanvasSubType() {
    return simpleCanvasSubType;
  }

  public void setSimpleCanvasSubType(SimpleCanvasSubType simpleCanvasSubType) {
    this.simpleCanvasSubType = simpleCanvasSubType;
  }

  public AdcreativesGetListStruct floatingZone(FloatingZone floatingZone) {
    this.floatingZone = floatingZone;
    return this;
  }

  /**
   * Get floatingZone
   *
   * @return floatingZone
   */
  @ApiModelProperty(value = "")
  public FloatingZone getFloatingZone() {
    return floatingZone;
  }

  public void setFloatingZone(FloatingZone floatingZone) {
    this.floatingZone = floatingZone;
  }

  public AdcreativesGetListStruct marketingPendantImageId(String marketingPendantImageId) {
    this.marketingPendantImageId = marketingPendantImageId;
    return this;
  }

  /**
   * Get marketingPendantImageId
   *
   * @return marketingPendantImageId
   */
  @ApiModelProperty(value = "")
  public String getMarketingPendantImageId() {
    return marketingPendantImageId;
  }

  public void setMarketingPendantImageId(String marketingPendantImageId) {
    this.marketingPendantImageId = marketingPendantImageId;
  }

  public AdcreativesGetListStruct countdownSwitch(Boolean countdownSwitch) {
    this.countdownSwitch = countdownSwitch;
    return this;
  }

  /**
   * Get countdownSwitch
   *
   * @return countdownSwitch
   */
  @ApiModelProperty(value = "")
  public Boolean isCountdownSwitch() {
    return countdownSwitch;
  }

  public void setCountdownSwitch(Boolean countdownSwitch) {
    this.countdownSwitch = countdownSwitch;
  }

  public AdcreativesGetListStruct pageTrackUrl(String pageTrackUrl) {
    this.pageTrackUrl = pageTrackUrl;
    return this;
  }

  /**
   * Get pageTrackUrl
   *
   * @return pageTrackUrl
   */
  @ApiModelProperty(value = "")
  public String getPageTrackUrl() {
    return pageTrackUrl;
  }

  public void setPageTrackUrl(String pageTrackUrl) {
    this.pageTrackUrl = pageTrackUrl;
  }

  public AdcreativesGetListStruct barrageList(List<BarrageListReadStruct> barrageList) {
    this.barrageList = barrageList;
    return this;
  }

  public AdcreativesGetListStruct addBarrageListItem(BarrageListReadStruct barrageListItem) {
    if (this.barrageList == null) {
      this.barrageList = new ArrayList<BarrageListReadStruct>();
    }
    this.barrageList.add(barrageListItem);
    return this;
  }

  /**
   * Get barrageList
   *
   * @return barrageList
   */
  @ApiModelProperty(value = "")
  public List<BarrageListReadStruct> getBarrageList() {
    return barrageList;
  }

  public void setBarrageList(List<BarrageListReadStruct> barrageList) {
    this.barrageList = barrageList;
  }

  public AdcreativesGetListStruct appGiftPackCode(AppGiftPackCode appGiftPackCode) {
    this.appGiftPackCode = appGiftPackCode;
    return this;
  }

  /**
   * Get appGiftPackCode
   *
   * @return appGiftPackCode
   */
  @ApiModelProperty(value = "")
  public AppGiftPackCode getAppGiftPackCode() {
    return appGiftPackCode;
  }

  public void setAppGiftPackCode(AppGiftPackCode appGiftPackCode) {
    this.appGiftPackCode = appGiftPackCode;
  }

  public AdcreativesGetListStruct enableBreakthroughSiteset(Boolean enableBreakthroughSiteset) {
    this.enableBreakthroughSiteset = enableBreakthroughSiteset;
    return this;
  }

  /**
   * Get enableBreakthroughSiteset
   *
   * @return enableBreakthroughSiteset
   */
  @ApiModelProperty(value = "")
  public Boolean isEnableBreakthroughSiteset() {
    return enableBreakthroughSiteset;
  }

  public void setEnableBreakthroughSiteset(Boolean enableBreakthroughSiteset) {
    this.enableBreakthroughSiteset = enableBreakthroughSiteset;
  }

  public AdcreativesGetListStruct creativeTemplateVersionType(
      CreativeTemplateVersionType creativeTemplateVersionType) {
    this.creativeTemplateVersionType = creativeTemplateVersionType;
    return this;
  }

  /**
   * Get creativeTemplateVersionType
   *
   * @return creativeTemplateVersionType
   */
  @ApiModelProperty(value = "")
  public CreativeTemplateVersionType getCreativeTemplateVersionType() {
    return creativeTemplateVersionType;
  }

  public void setCreativeTemplateVersionType(
      CreativeTemplateVersionType creativeTemplateVersionType) {
    this.creativeTemplateVersionType = creativeTemplateVersionType;
  }

  public AdcreativesGetListStruct adcreativeTemplateId(Long adcreativeTemplateId) {
    this.adcreativeTemplateId = adcreativeTemplateId;
    return this;
  }

  /**
   * Get adcreativeTemplateId
   *
   * @return adcreativeTemplateId
   */
  @ApiModelProperty(value = "")
  public Long getAdcreativeTemplateId() {
    return adcreativeTemplateId;
  }

  public void setAdcreativeTemplateId(Long adcreativeTemplateId) {
    this.adcreativeTemplateId = adcreativeTemplateId;
  }

  public AdcreativesGetListStruct adcreativeElements(
      AdcreativeCreativeElementsReadMp adcreativeElements) {
    this.adcreativeElements = adcreativeElements;
    return this;
  }

  /**
   * Get adcreativeElements
   *
   * @return adcreativeElements
   */
  @ApiModelProperty(value = "")
  public AdcreativeCreativeElementsReadMp getAdcreativeElements() {
    return adcreativeElements;
  }

  public void setAdcreativeElements(AdcreativeCreativeElementsReadMp adcreativeElements) {
    this.adcreativeElements = adcreativeElements;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdcreativesGetListStruct adcreativesGetListStruct = (AdcreativesGetListStruct) o;
    return Objects.equals(this.campaignId, adcreativesGetListStruct.campaignId)
        && Objects.equals(this.adcreativeId, adcreativesGetListStruct.adcreativeId)
        && Objects.equals(this.outerAdcreativeId, adcreativesGetListStruct.outerAdcreativeId)
        && Objects.equals(this.adcreativeName, adcreativesGetListStruct.adcreativeName)
        && Objects.equals(this.pageType, adcreativesGetListStruct.pageType)
        && Objects.equals(this.pageSpec, adcreativesGetListStruct.pageSpec)
        && Objects.equals(this.linkPageType, adcreativesGetListStruct.linkPageType)
        && Objects.equals(this.linkNameType, adcreativesGetListStruct.linkNameType)
        && Objects.equals(this.linkPageSpec, adcreativesGetListStruct.linkPageSpec)
        && Objects.equals(this.conversionDataType, adcreativesGetListStruct.conversionDataType)
        && Objects.equals(this.conversionTargetType, adcreativesGetListStruct.conversionTargetType)
        && Objects.equals(
            this.qqMiniGameTrackingQueryString,
            adcreativesGetListStruct.qqMiniGameTrackingQueryString)
        && Objects.equals(this.deepLinkUrl, adcreativesGetListStruct.deepLinkUrl)
        && Objects.equals(this.androidDeepLinkAppId, adcreativesGetListStruct.androidDeepLinkAppId)
        && Objects.equals(this.iosDeepLinkAppId, adcreativesGetListStruct.iosDeepLinkAppId)
        && Objects.equals(this.universalLinkUrl, adcreativesGetListStruct.universalLinkUrl)
        && Objects.equals(this.siteSet, adcreativesGetListStruct.siteSet)
        && Objects.equals(this.automaticSiteEnabled, adcreativesGetListStruct.automaticSiteEnabled)
        && Objects.equals(this.promotedObjectType, adcreativesGetListStruct.promotedObjectType)
        && Objects.equals(this.promotedObjectId, adcreativesGetListStruct.promotedObjectId)
        && Objects.equals(this.profileId, adcreativesGetListStruct.profileId)
        && Objects.equals(this.createdTime, adcreativesGetListStruct.createdTime)
        && Objects.equals(this.lastModifiedTime, adcreativesGetListStruct.lastModifiedTime)
        && Objects.equals(this.shareContentSpec, adcreativesGetListStruct.shareContentSpec)
        && Objects.equals(
            this.dynamicAdcreativeSpec, adcreativesGetListStruct.dynamicAdcreativeSpec)
        && Objects.equals(this.isDeleted, adcreativesGetListStruct.isDeleted)
        && Objects.equals(this.isDynamicCreative, adcreativesGetListStruct.isDynamicCreative)
        && Objects.equals(this.componentId, adcreativesGetListStruct.componentId)
        && Objects.equals(this.onlineEnabled, adcreativesGetListStruct.onlineEnabled)
        && Objects.equals(
            this.revisedAdcreativeSpec, adcreativesGetListStruct.revisedAdcreativeSpec)
        && Objects.equals(this.unionMarketSwitch, adcreativesGetListStruct.unionMarketSwitch)
        && Objects.equals(
            this.playablePageMaterialId, adcreativesGetListStruct.playablePageMaterialId)
        && Objects.equals(this.videoEndPage, adcreativesGetListStruct.videoEndPage)
        && Objects.equals(
            this.feedsVideoCommentSwitch, adcreativesGetListStruct.feedsVideoCommentSwitch)
        && Objects.equals(this.webviewUrl, adcreativesGetListStruct.webviewUrl)
        && Objects.equals(this.simpleCanvasSubType, adcreativesGetListStruct.simpleCanvasSubType)
        && Objects.equals(this.floatingZone, adcreativesGetListStruct.floatingZone)
        && Objects.equals(
            this.marketingPendantImageId, adcreativesGetListStruct.marketingPendantImageId)
        && Objects.equals(this.countdownSwitch, adcreativesGetListStruct.countdownSwitch)
        && Objects.equals(this.pageTrackUrl, adcreativesGetListStruct.pageTrackUrl)
        && Objects.equals(this.barrageList, adcreativesGetListStruct.barrageList)
        && Objects.equals(this.appGiftPackCode, adcreativesGetListStruct.appGiftPackCode)
        && Objects.equals(
            this.enableBreakthroughSiteset, adcreativesGetListStruct.enableBreakthroughSiteset)
        && Objects.equals(
            this.creativeTemplateVersionType, adcreativesGetListStruct.creativeTemplateVersionType)
        && Objects.equals(this.adcreativeTemplateId, adcreativesGetListStruct.adcreativeTemplateId)
        && Objects.equals(this.adcreativeElements, adcreativesGetListStruct.adcreativeElements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        campaignId,
        adcreativeId,
        outerAdcreativeId,
        adcreativeName,
        pageType,
        pageSpec,
        linkPageType,
        linkNameType,
        linkPageSpec,
        conversionDataType,
        conversionTargetType,
        qqMiniGameTrackingQueryString,
        deepLinkUrl,
        androidDeepLinkAppId,
        iosDeepLinkAppId,
        universalLinkUrl,
        siteSet,
        automaticSiteEnabled,
        promotedObjectType,
        promotedObjectId,
        profileId,
        createdTime,
        lastModifiedTime,
        shareContentSpec,
        dynamicAdcreativeSpec,
        isDeleted,
        isDynamicCreative,
        componentId,
        onlineEnabled,
        revisedAdcreativeSpec,
        unionMarketSwitch,
        playablePageMaterialId,
        videoEndPage,
        feedsVideoCommentSwitch,
        webviewUrl,
        simpleCanvasSubType,
        floatingZone,
        marketingPendantImageId,
        countdownSwitch,
        pageTrackUrl,
        barrageList,
        appGiftPackCode,
        enableBreakthroughSiteset,
        creativeTemplateVersionType,
        adcreativeTemplateId,
        adcreativeElements);
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
