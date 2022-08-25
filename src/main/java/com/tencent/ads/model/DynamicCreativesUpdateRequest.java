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
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** DynamicCreativesUpdateRequest */
public class DynamicCreativesUpdateRequest {
  @SerializedName("dynamic_creative_id")
  private Long dynamicCreativeId = null;

  @SerializedName("dynamic_creative_template_id")
  private Long dynamicCreativeTemplateId = null;

  @SerializedName("dynamic_creative_elements")
  private DynamicCreativeElements dynamicCreativeElements = null;

  @SerializedName("deep_link_url")
  private String deepLinkUrl = null;

  @SerializedName("impression_tracking_url")
  private String impressionTrackingUrl = null;

  @SerializedName("click_tracking_url")
  private String clickTrackingUrl = null;

  @SerializedName("feeds_video_comment_switch")
  private Boolean feedsVideoCommentSwitch = null;

  @SerializedName("union_market_switch")
  private Boolean unionMarketSwitch = null;

  @SerializedName("page_type")
  private DestinationType pageType = null;

  @SerializedName("page_spec")
  private DynamicCreativePageSpec pageSpec = null;

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

  @SerializedName("android_deep_link_app_id")
  private String androidDeepLinkAppId = null;

  @SerializedName("ios_deep_link_app_id")
  private String iosDeepLinkAppId = null;

  @SerializedName("universal_link_url")
  private String universalLinkUrl = null;

  @SerializedName("share_content_spec")
  private ShareContentSpec shareContentSpec = null;

  @SerializedName("profile_id")
  private Long profileId = null;

  @SerializedName("component_id")
  private Long componentId = null;

  @SerializedName("online_enabled")
  private Boolean onlineEnabled = null;

  @SerializedName("revised_adcreative_spec")
  private RevisedAdcreativeSpec revisedAdcreativeSpec = null;

  @SerializedName("video_end_page")
  private VideoEndPageSpec videoEndPage = null;

  @SerializedName("webview_url")
  private String webviewUrl = null;

  @SerializedName("simple_canvas_sub_type")
  private SimpleCanvasSubType simpleCanvasSubType = null;

  @SerializedName("floating_zone")
  private FloatingZone floatingZone = null;

  @SerializedName("marketing_pendant_image_id")
  private String marketingPendantImageId = null;

  @SerializedName("barrage_list")
  private List<BarrageListCreateStruct> barrageList = null;

  @SerializedName("countdown_switch")
  private Boolean countdownSwitch = null;

  @SerializedName("app_gift_pack_code")
  private AppGiftPackCode appGiftPackCode = null;

  @SerializedName("union_market_spec")
  private UnionMarketSpec unionMarketSpec = null;

  @SerializedName("auto_derived_program_creative_switch")
  private Boolean autoDerivedProgramCreativeSwitch = null;

  @SerializedName("head_click_type")
  private HeadClickType headClickType = null;

  @SerializedName("head_click_spec")
  private HeadClickSpec headClickSpec = null;

  @SerializedName("account_id")
  private Long accountId = null;

  public DynamicCreativesUpdateRequest dynamicCreativeId(Long dynamicCreativeId) {
    this.dynamicCreativeId = dynamicCreativeId;
    return this;
  }

  /**
   * Get dynamicCreativeId
   *
   * @return dynamicCreativeId
   */
  @ApiModelProperty(value = "")
  public Long getDynamicCreativeId() {
    return dynamicCreativeId;
  }

  public void setDynamicCreativeId(Long dynamicCreativeId) {
    this.dynamicCreativeId = dynamicCreativeId;
  }

  public DynamicCreativesUpdateRequest dynamicCreativeTemplateId(Long dynamicCreativeTemplateId) {
    this.dynamicCreativeTemplateId = dynamicCreativeTemplateId;
    return this;
  }

  /**
   * Get dynamicCreativeTemplateId
   *
   * @return dynamicCreativeTemplateId
   */
  @ApiModelProperty(value = "")
  public Long getDynamicCreativeTemplateId() {
    return dynamicCreativeTemplateId;
  }

  public void setDynamicCreativeTemplateId(Long dynamicCreativeTemplateId) {
    this.dynamicCreativeTemplateId = dynamicCreativeTemplateId;
  }

  public DynamicCreativesUpdateRequest dynamicCreativeElements(
      DynamicCreativeElements dynamicCreativeElements) {
    this.dynamicCreativeElements = dynamicCreativeElements;
    return this;
  }

  /**
   * Get dynamicCreativeElements
   *
   * @return dynamicCreativeElements
   */
  @ApiModelProperty(value = "")
  public DynamicCreativeElements getDynamicCreativeElements() {
    return dynamicCreativeElements;
  }

  public void setDynamicCreativeElements(DynamicCreativeElements dynamicCreativeElements) {
    this.dynamicCreativeElements = dynamicCreativeElements;
  }

  public DynamicCreativesUpdateRequest deepLinkUrl(String deepLinkUrl) {
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

  public DynamicCreativesUpdateRequest impressionTrackingUrl(String impressionTrackingUrl) {
    this.impressionTrackingUrl = impressionTrackingUrl;
    return this;
  }

  /**
   * Get impressionTrackingUrl
   *
   * @return impressionTrackingUrl
   */
  @ApiModelProperty(value = "")
  public String getImpressionTrackingUrl() {
    return impressionTrackingUrl;
  }

  public void setImpressionTrackingUrl(String impressionTrackingUrl) {
    this.impressionTrackingUrl = impressionTrackingUrl;
  }

  public DynamicCreativesUpdateRequest clickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
    return this;
  }

  /**
   * Get clickTrackingUrl
   *
   * @return clickTrackingUrl
   */
  @ApiModelProperty(value = "")
  public String getClickTrackingUrl() {
    return clickTrackingUrl;
  }

  public void setClickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
  }

  public DynamicCreativesUpdateRequest feedsVideoCommentSwitch(Boolean feedsVideoCommentSwitch) {
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

  public DynamicCreativesUpdateRequest unionMarketSwitch(Boolean unionMarketSwitch) {
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

  public DynamicCreativesUpdateRequest pageType(DestinationType pageType) {
    this.pageType = pageType;
    return this;
  }

  /**
   * Get pageType
   *
   * @return pageType
   */
  @ApiModelProperty(value = "")
  public DestinationType getPageType() {
    return pageType;
  }

  public void setPageType(DestinationType pageType) {
    this.pageType = pageType;
  }

  public DynamicCreativesUpdateRequest pageSpec(DynamicCreativePageSpec pageSpec) {
    this.pageSpec = pageSpec;
    return this;
  }

  /**
   * Get pageSpec
   *
   * @return pageSpec
   */
  @ApiModelProperty(value = "")
  public DynamicCreativePageSpec getPageSpec() {
    return pageSpec;
  }

  public void setPageSpec(DynamicCreativePageSpec pageSpec) {
    this.pageSpec = pageSpec;
  }

  public DynamicCreativesUpdateRequest linkPageType(LinkPageType linkPageType) {
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

  public DynamicCreativesUpdateRequest linkNameType(LinkUrlLinkNameType linkNameType) {
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

  public DynamicCreativesUpdateRequest linkPageSpec(LinkPageSpec linkPageSpec) {
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

  public DynamicCreativesUpdateRequest conversionDataType(ConversionDataType conversionDataType) {
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

  public DynamicCreativesUpdateRequest conversionTargetType(
      ConversionTargetType conversionTargetType) {
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

  public DynamicCreativesUpdateRequest qqMiniGameTrackingQueryString(
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

  public DynamicCreativesUpdateRequest androidDeepLinkAppId(String androidDeepLinkAppId) {
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

  public DynamicCreativesUpdateRequest iosDeepLinkAppId(String iosDeepLinkAppId) {
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

  public DynamicCreativesUpdateRequest universalLinkUrl(String universalLinkUrl) {
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

  public DynamicCreativesUpdateRequest shareContentSpec(ShareContentSpec shareContentSpec) {
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

  public DynamicCreativesUpdateRequest profileId(Long profileId) {
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

  public DynamicCreativesUpdateRequest componentId(Long componentId) {
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

  public DynamicCreativesUpdateRequest onlineEnabled(Boolean onlineEnabled) {
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

  public DynamicCreativesUpdateRequest revisedAdcreativeSpec(
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

  public DynamicCreativesUpdateRequest videoEndPage(VideoEndPageSpec videoEndPage) {
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

  public DynamicCreativesUpdateRequest webviewUrl(String webviewUrl) {
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

  public DynamicCreativesUpdateRequest simpleCanvasSubType(
      SimpleCanvasSubType simpleCanvasSubType) {
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

  public DynamicCreativesUpdateRequest floatingZone(FloatingZone floatingZone) {
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

  public DynamicCreativesUpdateRequest marketingPendantImageId(String marketingPendantImageId) {
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

  public DynamicCreativesUpdateRequest barrageList(List<BarrageListCreateStruct> barrageList) {
    this.barrageList = barrageList;
    return this;
  }

  public DynamicCreativesUpdateRequest addBarrageListItem(BarrageListCreateStruct barrageListItem) {
    if (this.barrageList == null) {
      this.barrageList = new ArrayList<BarrageListCreateStruct>();
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
  public List<BarrageListCreateStruct> getBarrageList() {
    return barrageList;
  }

  public void setBarrageList(List<BarrageListCreateStruct> barrageList) {
    this.barrageList = barrageList;
  }

  public DynamicCreativesUpdateRequest countdownSwitch(Boolean countdownSwitch) {
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

  public DynamicCreativesUpdateRequest appGiftPackCode(AppGiftPackCode appGiftPackCode) {
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

  public DynamicCreativesUpdateRequest unionMarketSpec(UnionMarketSpec unionMarketSpec) {
    this.unionMarketSpec = unionMarketSpec;
    return this;
  }

  /**
   * Get unionMarketSpec
   *
   * @return unionMarketSpec
   */
  @ApiModelProperty(value = "")
  public UnionMarketSpec getUnionMarketSpec() {
    return unionMarketSpec;
  }

  public void setUnionMarketSpec(UnionMarketSpec unionMarketSpec) {
    this.unionMarketSpec = unionMarketSpec;
  }

  public DynamicCreativesUpdateRequest autoDerivedProgramCreativeSwitch(
      Boolean autoDerivedProgramCreativeSwitch) {
    this.autoDerivedProgramCreativeSwitch = autoDerivedProgramCreativeSwitch;
    return this;
  }

  /**
   * Get autoDerivedProgramCreativeSwitch
   *
   * @return autoDerivedProgramCreativeSwitch
   */
  @ApiModelProperty(value = "")
  public Boolean isAutoDerivedProgramCreativeSwitch() {
    return autoDerivedProgramCreativeSwitch;
  }

  public void setAutoDerivedProgramCreativeSwitch(Boolean autoDerivedProgramCreativeSwitch) {
    this.autoDerivedProgramCreativeSwitch = autoDerivedProgramCreativeSwitch;
  }

  public DynamicCreativesUpdateRequest headClickType(HeadClickType headClickType) {
    this.headClickType = headClickType;
    return this;
  }

  /**
   * Get headClickType
   *
   * @return headClickType
   */
  @ApiModelProperty(value = "")
  public HeadClickType getHeadClickType() {
    return headClickType;
  }

  public void setHeadClickType(HeadClickType headClickType) {
    this.headClickType = headClickType;
  }

  public DynamicCreativesUpdateRequest headClickSpec(HeadClickSpec headClickSpec) {
    this.headClickSpec = headClickSpec;
    return this;
  }

  /**
   * Get headClickSpec
   *
   * @return headClickSpec
   */
  @ApiModelProperty(value = "")
  public HeadClickSpec getHeadClickSpec() {
    return headClickSpec;
  }

  public void setHeadClickSpec(HeadClickSpec headClickSpec) {
    this.headClickSpec = headClickSpec;
  }

  public DynamicCreativesUpdateRequest accountId(Long accountId) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicCreativesUpdateRequest dynamicCreativesUpdateRequest = (DynamicCreativesUpdateRequest) o;
    return Objects.equals(this.dynamicCreativeId, dynamicCreativesUpdateRequest.dynamicCreativeId)
        && Objects.equals(
            this.dynamicCreativeTemplateId, dynamicCreativesUpdateRequest.dynamicCreativeTemplateId)
        && Objects.equals(
            this.dynamicCreativeElements, dynamicCreativesUpdateRequest.dynamicCreativeElements)
        && Objects.equals(this.deepLinkUrl, dynamicCreativesUpdateRequest.deepLinkUrl)
        && Objects.equals(
            this.impressionTrackingUrl, dynamicCreativesUpdateRequest.impressionTrackingUrl)
        && Objects.equals(this.clickTrackingUrl, dynamicCreativesUpdateRequest.clickTrackingUrl)
        && Objects.equals(
            this.feedsVideoCommentSwitch, dynamicCreativesUpdateRequest.feedsVideoCommentSwitch)
        && Objects.equals(this.unionMarketSwitch, dynamicCreativesUpdateRequest.unionMarketSwitch)
        && Objects.equals(this.pageType, dynamicCreativesUpdateRequest.pageType)
        && Objects.equals(this.pageSpec, dynamicCreativesUpdateRequest.pageSpec)
        && Objects.equals(this.linkPageType, dynamicCreativesUpdateRequest.linkPageType)
        && Objects.equals(this.linkNameType, dynamicCreativesUpdateRequest.linkNameType)
        && Objects.equals(this.linkPageSpec, dynamicCreativesUpdateRequest.linkPageSpec)
        && Objects.equals(this.conversionDataType, dynamicCreativesUpdateRequest.conversionDataType)
        && Objects.equals(
            this.conversionTargetType, dynamicCreativesUpdateRequest.conversionTargetType)
        && Objects.equals(
            this.qqMiniGameTrackingQueryString,
            dynamicCreativesUpdateRequest.qqMiniGameTrackingQueryString)
        && Objects.equals(
            this.androidDeepLinkAppId, dynamicCreativesUpdateRequest.androidDeepLinkAppId)
        && Objects.equals(this.iosDeepLinkAppId, dynamicCreativesUpdateRequest.iosDeepLinkAppId)
        && Objects.equals(this.universalLinkUrl, dynamicCreativesUpdateRequest.universalLinkUrl)
        && Objects.equals(this.shareContentSpec, dynamicCreativesUpdateRequest.shareContentSpec)
        && Objects.equals(this.profileId, dynamicCreativesUpdateRequest.profileId)
        && Objects.equals(this.componentId, dynamicCreativesUpdateRequest.componentId)
        && Objects.equals(this.onlineEnabled, dynamicCreativesUpdateRequest.onlineEnabled)
        && Objects.equals(
            this.revisedAdcreativeSpec, dynamicCreativesUpdateRequest.revisedAdcreativeSpec)
        && Objects.equals(this.videoEndPage, dynamicCreativesUpdateRequest.videoEndPage)
        && Objects.equals(this.webviewUrl, dynamicCreativesUpdateRequest.webviewUrl)
        && Objects.equals(
            this.simpleCanvasSubType, dynamicCreativesUpdateRequest.simpleCanvasSubType)
        && Objects.equals(this.floatingZone, dynamicCreativesUpdateRequest.floatingZone)
        && Objects.equals(
            this.marketingPendantImageId, dynamicCreativesUpdateRequest.marketingPendantImageId)
        && Objects.equals(this.barrageList, dynamicCreativesUpdateRequest.barrageList)
        && Objects.equals(this.countdownSwitch, dynamicCreativesUpdateRequest.countdownSwitch)
        && Objects.equals(this.appGiftPackCode, dynamicCreativesUpdateRequest.appGiftPackCode)
        && Objects.equals(this.unionMarketSpec, dynamicCreativesUpdateRequest.unionMarketSpec)
        && Objects.equals(
            this.autoDerivedProgramCreativeSwitch,
            dynamicCreativesUpdateRequest.autoDerivedProgramCreativeSwitch)
        && Objects.equals(this.headClickType, dynamicCreativesUpdateRequest.headClickType)
        && Objects.equals(this.headClickSpec, dynamicCreativesUpdateRequest.headClickSpec)
        && Objects.equals(this.accountId, dynamicCreativesUpdateRequest.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dynamicCreativeId,
        dynamicCreativeTemplateId,
        dynamicCreativeElements,
        deepLinkUrl,
        impressionTrackingUrl,
        clickTrackingUrl,
        feedsVideoCommentSwitch,
        unionMarketSwitch,
        pageType,
        pageSpec,
        linkPageType,
        linkNameType,
        linkPageSpec,
        conversionDataType,
        conversionTargetType,
        qqMiniGameTrackingQueryString,
        androidDeepLinkAppId,
        iosDeepLinkAppId,
        universalLinkUrl,
        shareContentSpec,
        profileId,
        componentId,
        onlineEnabled,
        revisedAdcreativeSpec,
        videoEndPage,
        webviewUrl,
        simpleCanvasSubType,
        floatingZone,
        marketingPendantImageId,
        barrageList,
        countdownSwitch,
        appGiftPackCode,
        unionMarketSpec,
        autoDerivedProgramCreativeSwitch,
        headClickType,
        headClickSpec,
        accountId);
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
