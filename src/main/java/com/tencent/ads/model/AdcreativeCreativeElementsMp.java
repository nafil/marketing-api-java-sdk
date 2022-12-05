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

/** 创意元素 */
@ApiModel(description = "创意元素")
public class AdcreativeCreativeElementsMp {
  @SerializedName("image")
  private String image = null;

  @SerializedName("image2")
  private String image2 = null;

  @SerializedName("image3")
  private String image3 = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("corporate")
  private AdcreativeCorporate corporate = null;

  @SerializedName("video")
  private String video = null;

  @SerializedName("deep_link_type")
  private String deepLinkType = null;

  @SerializedName("link_name_type")
  private LinkNameType linkNameType = null;

  @SerializedName("image_list")
  private List<String> imageList = null;

  @SerializedName("element_story")
  private List<AdcreativeElementStoryArrayItem> elementStory = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("button_text")
  private String buttonText = null;

  @SerializedName("bottom_text")
  private String bottomText = null;

  @SerializedName("excitation_text")
  private String excitationText = null;

  @SerializedName("countdown_begin")
  private Long countdownBegin = null;

  @SerializedName("countdown_expiring_timestamp")
  private Long countdownExpiringTimestamp = null;

  @SerializedName("countdown_price")
  private String countdownPrice = null;

  @SerializedName("countdown_time_type")
  private AdCreativeCountdownTimeType countdownTimeType = null;

  @SerializedName("label")
  private List<CreativeLabel> label = null;

  @SerializedName("product_tags")
  private List<String> productTags = null;

  @SerializedName("logo_description")
  private String logoDescription = null;

  @SerializedName("logo")
  private String logo = null;

  @SerializedName("left_bottom_txt")
  private String leftBottomTxt = null;

  @SerializedName("animation_effect")
  private String animationEffect = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("short_video_struct")
  private ShortVideoStruct shortVideoStruct = null;

  @SerializedName("long_video_struct")
  private LongVideoStruct longVideoStruct = null;

  @SerializedName("banner_content")
  private AdcreativeBannerContent bannerContent = null;

  @SerializedName("card_content")
  private AdcreativeCardContent cardContent = null;

  @SerializedName("video_popup_button")
  private AdcreativeVideoPopupButton videoPopupButton = null;

  @SerializedName("button_url")
  private String buttonUrl = null;

  @SerializedName("brand")
  private AdCreativeBrand brand = null;

  @SerializedName("caption")
  private String caption = null;

  @SerializedName("labelled_img")
  private AdcreativeLabelledImg labelledImg = null;

  @SerializedName("full_screen_image")
  private String fullScreenImage = null;

  @SerializedName("zip_url")
  private String zipUrl = null;

  @SerializedName("end_page")
  private AdCreativeEndPage endPage = null;

  @SerializedName("head_line")
  private String headLine = null;

  @SerializedName("shop_image_struct")
  private AdCreativeShopImageStruct shopImageStruct = null;

  @SerializedName("chosen_button")
  private ChosenButton chosenButton = null;

  @SerializedName("living_desc_struct")
  private AdCreativeLivingDescStruct livingDescStruct = null;

  @SerializedName("left_button")
  private String leftButton = null;

  @SerializedName("right_button")
  private String rightButton = null;

  @SerializedName("left_canvas")
  private String leftCanvas = null;

  @SerializedName("right_canvas")
  private String rightCanvas = null;

  @SerializedName("floating_zone_struct")
  private FloatingZone floatingZoneStruct = null;

  @SerializedName("canvas_share_image")
  private String canvasShareImage = null;

  @SerializedName("wegame_info_spec")
  private WegameInfoSpec wegameInfoSpec = null;

  @SerializedName("wechat_channels_spec")
  private AdCreativeWechatChannelsSpec wechatChannelsSpec = null;

  @SerializedName("finder_object_visibility")
  private Boolean finderObjectVisibility = null;

  @SerializedName("image_list_jump_info")
  private List<LandingPageStructure> imageListJumpInfo = null;

  @SerializedName("button_text_jump_info")
  private LandingPageStructure buttonTextJumpInfo = null;

  public AdcreativeCreativeElementsMp image(String image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   *
   * @return image
   */
  @ApiModelProperty(value = "")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public AdcreativeCreativeElementsMp image2(String image2) {
    this.image2 = image2;
    return this;
  }

  /**
   * Get image2
   *
   * @return image2
   */
  @ApiModelProperty(value = "")
  public String getImage2() {
    return image2;
  }

  public void setImage2(String image2) {
    this.image2 = image2;
  }

  public AdcreativeCreativeElementsMp image3(String image3) {
    this.image3 = image3;
    return this;
  }

  /**
   * Get image3
   *
   * @return image3
   */
  @ApiModelProperty(value = "")
  public String getImage3() {
    return image3;
  }

  public void setImage3(String image3) {
    this.image3 = image3;
  }

  public AdcreativeCreativeElementsMp title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   *
   * @return title
   */
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AdcreativeCreativeElementsMp description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   *
   * @return description
   */
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AdcreativeCreativeElementsMp corporate(AdcreativeCorporate corporate) {
    this.corporate = corporate;
    return this;
  }

  /**
   * Get corporate
   *
   * @return corporate
   */
  @ApiModelProperty(value = "")
  public AdcreativeCorporate getCorporate() {
    return corporate;
  }

  public void setCorporate(AdcreativeCorporate corporate) {
    this.corporate = corporate;
  }

  public AdcreativeCreativeElementsMp video(String video) {
    this.video = video;
    return this;
  }

  /**
   * Get video
   *
   * @return video
   */
  @ApiModelProperty(value = "")
  public String getVideo() {
    return video;
  }

  public void setVideo(String video) {
    this.video = video;
  }

  public AdcreativeCreativeElementsMp deepLinkType(String deepLinkType) {
    this.deepLinkType = deepLinkType;
    return this;
  }

  /**
   * Get deepLinkType
   *
   * @return deepLinkType
   */
  @ApiModelProperty(value = "")
  public String getDeepLinkType() {
    return deepLinkType;
  }

  public void setDeepLinkType(String deepLinkType) {
    this.deepLinkType = deepLinkType;
  }

  public AdcreativeCreativeElementsMp linkNameType(LinkNameType linkNameType) {
    this.linkNameType = linkNameType;
    return this;
  }

  /**
   * Get linkNameType
   *
   * @return linkNameType
   */
  @ApiModelProperty(value = "")
  public LinkNameType getLinkNameType() {
    return linkNameType;
  }

  public void setLinkNameType(LinkNameType linkNameType) {
    this.linkNameType = linkNameType;
  }

  public AdcreativeCreativeElementsMp imageList(List<String> imageList) {
    this.imageList = imageList;
    return this;
  }

  public AdcreativeCreativeElementsMp addImageListItem(String imageListItem) {
    if (this.imageList == null) {
      this.imageList = new ArrayList<String>();
    }
    this.imageList.add(imageListItem);
    return this;
  }

  /**
   * Get imageList
   *
   * @return imageList
   */
  @ApiModelProperty(value = "")
  public List<String> getImageList() {
    return imageList;
  }

  public void setImageList(List<String> imageList) {
    this.imageList = imageList;
  }

  public AdcreativeCreativeElementsMp elementStory(
      List<AdcreativeElementStoryArrayItem> elementStory) {
    this.elementStory = elementStory;
    return this;
  }

  public AdcreativeCreativeElementsMp addElementStoryItem(
      AdcreativeElementStoryArrayItem elementStoryItem) {
    if (this.elementStory == null) {
      this.elementStory = new ArrayList<AdcreativeElementStoryArrayItem>();
    }
    this.elementStory.add(elementStoryItem);
    return this;
  }

  /**
   * Get elementStory
   *
   * @return elementStory
   */
  @ApiModelProperty(value = "")
  public List<AdcreativeElementStoryArrayItem> getElementStory() {
    return elementStory;
  }

  public void setElementStory(List<AdcreativeElementStoryArrayItem> elementStory) {
    this.elementStory = elementStory;
  }

  public AdcreativeCreativeElementsMp url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   *
   * @return url
   */
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public AdcreativeCreativeElementsMp buttonText(String buttonText) {
    this.buttonText = buttonText;
    return this;
  }

  /**
   * Get buttonText
   *
   * @return buttonText
   */
  @ApiModelProperty(value = "")
  public String getButtonText() {
    return buttonText;
  }

  public void setButtonText(String buttonText) {
    this.buttonText = buttonText;
  }

  public AdcreativeCreativeElementsMp bottomText(String bottomText) {
    this.bottomText = bottomText;
    return this;
  }

  /**
   * Get bottomText
   *
   * @return bottomText
   */
  @ApiModelProperty(value = "")
  public String getBottomText() {
    return bottomText;
  }

  public void setBottomText(String bottomText) {
    this.bottomText = bottomText;
  }

  public AdcreativeCreativeElementsMp excitationText(String excitationText) {
    this.excitationText = excitationText;
    return this;
  }

  /**
   * Get excitationText
   *
   * @return excitationText
   */
  @ApiModelProperty(value = "")
  public String getExcitationText() {
    return excitationText;
  }

  public void setExcitationText(String excitationText) {
    this.excitationText = excitationText;
  }

  public AdcreativeCreativeElementsMp countdownBegin(Long countdownBegin) {
    this.countdownBegin = countdownBegin;
    return this;
  }

  /**
   * Get countdownBegin
   *
   * @return countdownBegin
   */
  @ApiModelProperty(value = "")
  public Long getCountdownBegin() {
    return countdownBegin;
  }

  public void setCountdownBegin(Long countdownBegin) {
    this.countdownBegin = countdownBegin;
  }

  public AdcreativeCreativeElementsMp countdownExpiringTimestamp(Long countdownExpiringTimestamp) {
    this.countdownExpiringTimestamp = countdownExpiringTimestamp;
    return this;
  }

  /**
   * Get countdownExpiringTimestamp
   *
   * @return countdownExpiringTimestamp
   */
  @ApiModelProperty(value = "")
  public Long getCountdownExpiringTimestamp() {
    return countdownExpiringTimestamp;
  }

  public void setCountdownExpiringTimestamp(Long countdownExpiringTimestamp) {
    this.countdownExpiringTimestamp = countdownExpiringTimestamp;
  }

  public AdcreativeCreativeElementsMp countdownPrice(String countdownPrice) {
    this.countdownPrice = countdownPrice;
    return this;
  }

  /**
   * Get countdownPrice
   *
   * @return countdownPrice
   */
  @ApiModelProperty(value = "")
  public String getCountdownPrice() {
    return countdownPrice;
  }

  public void setCountdownPrice(String countdownPrice) {
    this.countdownPrice = countdownPrice;
  }

  public AdcreativeCreativeElementsMp countdownTimeType(
      AdCreativeCountdownTimeType countdownTimeType) {
    this.countdownTimeType = countdownTimeType;
    return this;
  }

  /**
   * Get countdownTimeType
   *
   * @return countdownTimeType
   */
  @ApiModelProperty(value = "")
  public AdCreativeCountdownTimeType getCountdownTimeType() {
    return countdownTimeType;
  }

  public void setCountdownTimeType(AdCreativeCountdownTimeType countdownTimeType) {
    this.countdownTimeType = countdownTimeType;
  }

  public AdcreativeCreativeElementsMp label(List<CreativeLabel> label) {
    this.label = label;
    return this;
  }

  public AdcreativeCreativeElementsMp addLabelItem(CreativeLabel labelItem) {
    if (this.label == null) {
      this.label = new ArrayList<CreativeLabel>();
    }
    this.label.add(labelItem);
    return this;
  }

  /**
   * Get label
   *
   * @return label
   */
  @ApiModelProperty(value = "")
  public List<CreativeLabel> getLabel() {
    return label;
  }

  public void setLabel(List<CreativeLabel> label) {
    this.label = label;
  }

  public AdcreativeCreativeElementsMp productTags(List<String> productTags) {
    this.productTags = productTags;
    return this;
  }

  public AdcreativeCreativeElementsMp addProductTagsItem(String productTagsItem) {
    if (this.productTags == null) {
      this.productTags = new ArrayList<String>();
    }
    this.productTags.add(productTagsItem);
    return this;
  }

  /**
   * Get productTags
   *
   * @return productTags
   */
  @ApiModelProperty(value = "")
  public List<String> getProductTags() {
    return productTags;
  }

  public void setProductTags(List<String> productTags) {
    this.productTags = productTags;
  }

  public AdcreativeCreativeElementsMp logoDescription(String logoDescription) {
    this.logoDescription = logoDescription;
    return this;
  }

  /**
   * Get logoDescription
   *
   * @return logoDescription
   */
  @ApiModelProperty(value = "")
  public String getLogoDescription() {
    return logoDescription;
  }

  public void setLogoDescription(String logoDescription) {
    this.logoDescription = logoDescription;
  }

  public AdcreativeCreativeElementsMp logo(String logo) {
    this.logo = logo;
    return this;
  }

  /**
   * Get logo
   *
   * @return logo
   */
  @ApiModelProperty(value = "")
  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public AdcreativeCreativeElementsMp leftBottomTxt(String leftBottomTxt) {
    this.leftBottomTxt = leftBottomTxt;
    return this;
  }

  /**
   * Get leftBottomTxt
   *
   * @return leftBottomTxt
   */
  @ApiModelProperty(value = "")
  public String getLeftBottomTxt() {
    return leftBottomTxt;
  }

  public void setLeftBottomTxt(String leftBottomTxt) {
    this.leftBottomTxt = leftBottomTxt;
  }

  public AdcreativeCreativeElementsMp animationEffect(String animationEffect) {
    this.animationEffect = animationEffect;
    return this;
  }

  /**
   * Get animationEffect
   *
   * @return animationEffect
   */
  @ApiModelProperty(value = "")
  public String getAnimationEffect() {
    return animationEffect;
  }

  public void setAnimationEffect(String animationEffect) {
    this.animationEffect = animationEffect;
  }

  public AdcreativeCreativeElementsMp phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   *
   * @return phone
   */
  @ApiModelProperty(value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public AdcreativeCreativeElementsMp shortVideoStruct(ShortVideoStruct shortVideoStruct) {
    this.shortVideoStruct = shortVideoStruct;
    return this;
  }

  /**
   * Get shortVideoStruct
   *
   * @return shortVideoStruct
   */
  @ApiModelProperty(value = "")
  public ShortVideoStruct getShortVideoStruct() {
    return shortVideoStruct;
  }

  public void setShortVideoStruct(ShortVideoStruct shortVideoStruct) {
    this.shortVideoStruct = shortVideoStruct;
  }

  public AdcreativeCreativeElementsMp longVideoStruct(LongVideoStruct longVideoStruct) {
    this.longVideoStruct = longVideoStruct;
    return this;
  }

  /**
   * Get longVideoStruct
   *
   * @return longVideoStruct
   */
  @ApiModelProperty(value = "")
  public LongVideoStruct getLongVideoStruct() {
    return longVideoStruct;
  }

  public void setLongVideoStruct(LongVideoStruct longVideoStruct) {
    this.longVideoStruct = longVideoStruct;
  }

  public AdcreativeCreativeElementsMp bannerContent(AdcreativeBannerContent bannerContent) {
    this.bannerContent = bannerContent;
    return this;
  }

  /**
   * Get bannerContent
   *
   * @return bannerContent
   */
  @ApiModelProperty(value = "")
  public AdcreativeBannerContent getBannerContent() {
    return bannerContent;
  }

  public void setBannerContent(AdcreativeBannerContent bannerContent) {
    this.bannerContent = bannerContent;
  }

  public AdcreativeCreativeElementsMp cardContent(AdcreativeCardContent cardContent) {
    this.cardContent = cardContent;
    return this;
  }

  /**
   * Get cardContent
   *
   * @return cardContent
   */
  @ApiModelProperty(value = "")
  public AdcreativeCardContent getCardContent() {
    return cardContent;
  }

  public void setCardContent(AdcreativeCardContent cardContent) {
    this.cardContent = cardContent;
  }

  public AdcreativeCreativeElementsMp videoPopupButton(
      AdcreativeVideoPopupButton videoPopupButton) {
    this.videoPopupButton = videoPopupButton;
    return this;
  }

  /**
   * Get videoPopupButton
   *
   * @return videoPopupButton
   */
  @ApiModelProperty(value = "")
  public AdcreativeVideoPopupButton getVideoPopupButton() {
    return videoPopupButton;
  }

  public void setVideoPopupButton(AdcreativeVideoPopupButton videoPopupButton) {
    this.videoPopupButton = videoPopupButton;
  }

  public AdcreativeCreativeElementsMp buttonUrl(String buttonUrl) {
    this.buttonUrl = buttonUrl;
    return this;
  }

  /**
   * Get buttonUrl
   *
   * @return buttonUrl
   */
  @ApiModelProperty(value = "")
  public String getButtonUrl() {
    return buttonUrl;
  }

  public void setButtonUrl(String buttonUrl) {
    this.buttonUrl = buttonUrl;
  }

  public AdcreativeCreativeElementsMp brand(AdCreativeBrand brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Get brand
   *
   * @return brand
   */
  @ApiModelProperty(value = "")
  public AdCreativeBrand getBrand() {
    return brand;
  }

  public void setBrand(AdCreativeBrand brand) {
    this.brand = brand;
  }

  public AdcreativeCreativeElementsMp caption(String caption) {
    this.caption = caption;
    return this;
  }

  /**
   * Get caption
   *
   * @return caption
   */
  @ApiModelProperty(value = "")
  public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }

  public AdcreativeCreativeElementsMp labelledImg(AdcreativeLabelledImg labelledImg) {
    this.labelledImg = labelledImg;
    return this;
  }

  /**
   * Get labelledImg
   *
   * @return labelledImg
   */
  @ApiModelProperty(value = "")
  public AdcreativeLabelledImg getLabelledImg() {
    return labelledImg;
  }

  public void setLabelledImg(AdcreativeLabelledImg labelledImg) {
    this.labelledImg = labelledImg;
  }

  public AdcreativeCreativeElementsMp fullScreenImage(String fullScreenImage) {
    this.fullScreenImage = fullScreenImage;
    return this;
  }

  /**
   * Get fullScreenImage
   *
   * @return fullScreenImage
   */
  @ApiModelProperty(value = "")
  public String getFullScreenImage() {
    return fullScreenImage;
  }

  public void setFullScreenImage(String fullScreenImage) {
    this.fullScreenImage = fullScreenImage;
  }

  public AdcreativeCreativeElementsMp zipUrl(String zipUrl) {
    this.zipUrl = zipUrl;
    return this;
  }

  /**
   * Get zipUrl
   *
   * @return zipUrl
   */
  @ApiModelProperty(value = "")
  public String getZipUrl() {
    return zipUrl;
  }

  public void setZipUrl(String zipUrl) {
    this.zipUrl = zipUrl;
  }

  public AdcreativeCreativeElementsMp endPage(AdCreativeEndPage endPage) {
    this.endPage = endPage;
    return this;
  }

  /**
   * Get endPage
   *
   * @return endPage
   */
  @ApiModelProperty(value = "")
  public AdCreativeEndPage getEndPage() {
    return endPage;
  }

  public void setEndPage(AdCreativeEndPage endPage) {
    this.endPage = endPage;
  }

  public AdcreativeCreativeElementsMp headLine(String headLine) {
    this.headLine = headLine;
    return this;
  }

  /**
   * Get headLine
   *
   * @return headLine
   */
  @ApiModelProperty(value = "")
  public String getHeadLine() {
    return headLine;
  }

  public void setHeadLine(String headLine) {
    this.headLine = headLine;
  }

  public AdcreativeCreativeElementsMp shopImageStruct(AdCreativeShopImageStruct shopImageStruct) {
    this.shopImageStruct = shopImageStruct;
    return this;
  }

  /**
   * Get shopImageStruct
   *
   * @return shopImageStruct
   */
  @ApiModelProperty(value = "")
  public AdCreativeShopImageStruct getShopImageStruct() {
    return shopImageStruct;
  }

  public void setShopImageStruct(AdCreativeShopImageStruct shopImageStruct) {
    this.shopImageStruct = shopImageStruct;
  }

  public AdcreativeCreativeElementsMp chosenButton(ChosenButton chosenButton) {
    this.chosenButton = chosenButton;
    return this;
  }

  /**
   * Get chosenButton
   *
   * @return chosenButton
   */
  @ApiModelProperty(value = "")
  public ChosenButton getChosenButton() {
    return chosenButton;
  }

  public void setChosenButton(ChosenButton chosenButton) {
    this.chosenButton = chosenButton;
  }

  public AdcreativeCreativeElementsMp livingDescStruct(
      AdCreativeLivingDescStruct livingDescStruct) {
    this.livingDescStruct = livingDescStruct;
    return this;
  }

  /**
   * Get livingDescStruct
   *
   * @return livingDescStruct
   */
  @ApiModelProperty(value = "")
  public AdCreativeLivingDescStruct getLivingDescStruct() {
    return livingDescStruct;
  }

  public void setLivingDescStruct(AdCreativeLivingDescStruct livingDescStruct) {
    this.livingDescStruct = livingDescStruct;
  }

  public AdcreativeCreativeElementsMp leftButton(String leftButton) {
    this.leftButton = leftButton;
    return this;
  }

  /**
   * Get leftButton
   *
   * @return leftButton
   */
  @ApiModelProperty(value = "")
  public String getLeftButton() {
    return leftButton;
  }

  public void setLeftButton(String leftButton) {
    this.leftButton = leftButton;
  }

  public AdcreativeCreativeElementsMp rightButton(String rightButton) {
    this.rightButton = rightButton;
    return this;
  }

  /**
   * Get rightButton
   *
   * @return rightButton
   */
  @ApiModelProperty(value = "")
  public String getRightButton() {
    return rightButton;
  }

  public void setRightButton(String rightButton) {
    this.rightButton = rightButton;
  }

  public AdcreativeCreativeElementsMp leftCanvas(String leftCanvas) {
    this.leftCanvas = leftCanvas;
    return this;
  }

  /**
   * Get leftCanvas
   *
   * @return leftCanvas
   */
  @ApiModelProperty(value = "")
  public String getLeftCanvas() {
    return leftCanvas;
  }

  public void setLeftCanvas(String leftCanvas) {
    this.leftCanvas = leftCanvas;
  }

  public AdcreativeCreativeElementsMp rightCanvas(String rightCanvas) {
    this.rightCanvas = rightCanvas;
    return this;
  }

  /**
   * Get rightCanvas
   *
   * @return rightCanvas
   */
  @ApiModelProperty(value = "")
  public String getRightCanvas() {
    return rightCanvas;
  }

  public void setRightCanvas(String rightCanvas) {
    this.rightCanvas = rightCanvas;
  }

  public AdcreativeCreativeElementsMp floatingZoneStruct(FloatingZone floatingZoneStruct) {
    this.floatingZoneStruct = floatingZoneStruct;
    return this;
  }

  /**
   * Get floatingZoneStruct
   *
   * @return floatingZoneStruct
   */
  @ApiModelProperty(value = "")
  public FloatingZone getFloatingZoneStruct() {
    return floatingZoneStruct;
  }

  public void setFloatingZoneStruct(FloatingZone floatingZoneStruct) {
    this.floatingZoneStruct = floatingZoneStruct;
  }

  public AdcreativeCreativeElementsMp canvasShareImage(String canvasShareImage) {
    this.canvasShareImage = canvasShareImage;
    return this;
  }

  /**
   * Get canvasShareImage
   *
   * @return canvasShareImage
   */
  @ApiModelProperty(value = "")
  public String getCanvasShareImage() {
    return canvasShareImage;
  }

  public void setCanvasShareImage(String canvasShareImage) {
    this.canvasShareImage = canvasShareImage;
  }

  public AdcreativeCreativeElementsMp wegameInfoSpec(WegameInfoSpec wegameInfoSpec) {
    this.wegameInfoSpec = wegameInfoSpec;
    return this;
  }

  /**
   * Get wegameInfoSpec
   *
   * @return wegameInfoSpec
   */
  @ApiModelProperty(value = "")
  public WegameInfoSpec getWegameInfoSpec() {
    return wegameInfoSpec;
  }

  public void setWegameInfoSpec(WegameInfoSpec wegameInfoSpec) {
    this.wegameInfoSpec = wegameInfoSpec;
  }

  public AdcreativeCreativeElementsMp wechatChannelsSpec(
      AdCreativeWechatChannelsSpec wechatChannelsSpec) {
    this.wechatChannelsSpec = wechatChannelsSpec;
    return this;
  }

  /**
   * Get wechatChannelsSpec
   *
   * @return wechatChannelsSpec
   */
  @ApiModelProperty(value = "")
  public AdCreativeWechatChannelsSpec getWechatChannelsSpec() {
    return wechatChannelsSpec;
  }

  public void setWechatChannelsSpec(AdCreativeWechatChannelsSpec wechatChannelsSpec) {
    this.wechatChannelsSpec = wechatChannelsSpec;
  }

  public AdcreativeCreativeElementsMp finderObjectVisibility(Boolean finderObjectVisibility) {
    this.finderObjectVisibility = finderObjectVisibility;
    return this;
  }

  /**
   * Get finderObjectVisibility
   *
   * @return finderObjectVisibility
   */
  @ApiModelProperty(value = "")
  public Boolean isFinderObjectVisibility() {
    return finderObjectVisibility;
  }

  public void setFinderObjectVisibility(Boolean finderObjectVisibility) {
    this.finderObjectVisibility = finderObjectVisibility;
  }

  public AdcreativeCreativeElementsMp imageListJumpInfo(
      List<LandingPageStructure> imageListJumpInfo) {
    this.imageListJumpInfo = imageListJumpInfo;
    return this;
  }

  public AdcreativeCreativeElementsMp addImageListJumpInfoItem(
      LandingPageStructure imageListJumpInfoItem) {
    if (this.imageListJumpInfo == null) {
      this.imageListJumpInfo = new ArrayList<LandingPageStructure>();
    }
    this.imageListJumpInfo.add(imageListJumpInfoItem);
    return this;
  }

  /**
   * Get imageListJumpInfo
   *
   * @return imageListJumpInfo
   */
  @ApiModelProperty(value = "")
  public List<LandingPageStructure> getImageListJumpInfo() {
    return imageListJumpInfo;
  }

  public void setImageListJumpInfo(List<LandingPageStructure> imageListJumpInfo) {
    this.imageListJumpInfo = imageListJumpInfo;
  }

  public AdcreativeCreativeElementsMp buttonTextJumpInfo(LandingPageStructure buttonTextJumpInfo) {
    this.buttonTextJumpInfo = buttonTextJumpInfo;
    return this;
  }

  /**
   * Get buttonTextJumpInfo
   *
   * @return buttonTextJumpInfo
   */
  @ApiModelProperty(value = "")
  public LandingPageStructure getButtonTextJumpInfo() {
    return buttonTextJumpInfo;
  }

  public void setButtonTextJumpInfo(LandingPageStructure buttonTextJumpInfo) {
    this.buttonTextJumpInfo = buttonTextJumpInfo;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdcreativeCreativeElementsMp adcreativeCreativeElementsMp = (AdcreativeCreativeElementsMp) o;
    return Objects.equals(this.image, adcreativeCreativeElementsMp.image)
        && Objects.equals(this.image2, adcreativeCreativeElementsMp.image2)
        && Objects.equals(this.image3, adcreativeCreativeElementsMp.image3)
        && Objects.equals(this.title, adcreativeCreativeElementsMp.title)
        && Objects.equals(this.description, adcreativeCreativeElementsMp.description)
        && Objects.equals(this.corporate, adcreativeCreativeElementsMp.corporate)
        && Objects.equals(this.video, adcreativeCreativeElementsMp.video)
        && Objects.equals(this.deepLinkType, adcreativeCreativeElementsMp.deepLinkType)
        && Objects.equals(this.linkNameType, adcreativeCreativeElementsMp.linkNameType)
        && Objects.equals(this.imageList, adcreativeCreativeElementsMp.imageList)
        && Objects.equals(this.elementStory, adcreativeCreativeElementsMp.elementStory)
        && Objects.equals(this.url, adcreativeCreativeElementsMp.url)
        && Objects.equals(this.buttonText, adcreativeCreativeElementsMp.buttonText)
        && Objects.equals(this.bottomText, adcreativeCreativeElementsMp.bottomText)
        && Objects.equals(this.excitationText, adcreativeCreativeElementsMp.excitationText)
        && Objects.equals(this.countdownBegin, adcreativeCreativeElementsMp.countdownBegin)
        && Objects.equals(
            this.countdownExpiringTimestamp,
            adcreativeCreativeElementsMp.countdownExpiringTimestamp)
        && Objects.equals(this.countdownPrice, adcreativeCreativeElementsMp.countdownPrice)
        && Objects.equals(this.countdownTimeType, adcreativeCreativeElementsMp.countdownTimeType)
        && Objects.equals(this.label, adcreativeCreativeElementsMp.label)
        && Objects.equals(this.productTags, adcreativeCreativeElementsMp.productTags)
        && Objects.equals(this.logoDescription, adcreativeCreativeElementsMp.logoDescription)
        && Objects.equals(this.logo, adcreativeCreativeElementsMp.logo)
        && Objects.equals(this.leftBottomTxt, adcreativeCreativeElementsMp.leftBottomTxt)
        && Objects.equals(this.animationEffect, adcreativeCreativeElementsMp.animationEffect)
        && Objects.equals(this.phone, adcreativeCreativeElementsMp.phone)
        && Objects.equals(this.shortVideoStruct, adcreativeCreativeElementsMp.shortVideoStruct)
        && Objects.equals(this.longVideoStruct, adcreativeCreativeElementsMp.longVideoStruct)
        && Objects.equals(this.bannerContent, adcreativeCreativeElementsMp.bannerContent)
        && Objects.equals(this.cardContent, adcreativeCreativeElementsMp.cardContent)
        && Objects.equals(this.videoPopupButton, adcreativeCreativeElementsMp.videoPopupButton)
        && Objects.equals(this.buttonUrl, adcreativeCreativeElementsMp.buttonUrl)
        && Objects.equals(this.brand, adcreativeCreativeElementsMp.brand)
        && Objects.equals(this.caption, adcreativeCreativeElementsMp.caption)
        && Objects.equals(this.labelledImg, adcreativeCreativeElementsMp.labelledImg)
        && Objects.equals(this.fullScreenImage, adcreativeCreativeElementsMp.fullScreenImage)
        && Objects.equals(this.zipUrl, adcreativeCreativeElementsMp.zipUrl)
        && Objects.equals(this.endPage, adcreativeCreativeElementsMp.endPage)
        && Objects.equals(this.headLine, adcreativeCreativeElementsMp.headLine)
        && Objects.equals(this.shopImageStruct, adcreativeCreativeElementsMp.shopImageStruct)
        && Objects.equals(this.chosenButton, adcreativeCreativeElementsMp.chosenButton)
        && Objects.equals(this.livingDescStruct, adcreativeCreativeElementsMp.livingDescStruct)
        && Objects.equals(this.leftButton, adcreativeCreativeElementsMp.leftButton)
        && Objects.equals(this.rightButton, adcreativeCreativeElementsMp.rightButton)
        && Objects.equals(this.leftCanvas, adcreativeCreativeElementsMp.leftCanvas)
        && Objects.equals(this.rightCanvas, adcreativeCreativeElementsMp.rightCanvas)
        && Objects.equals(this.floatingZoneStruct, adcreativeCreativeElementsMp.floatingZoneStruct)
        && Objects.equals(this.canvasShareImage, adcreativeCreativeElementsMp.canvasShareImage)
        && Objects.equals(this.wegameInfoSpec, adcreativeCreativeElementsMp.wegameInfoSpec)
        && Objects.equals(this.wechatChannelsSpec, adcreativeCreativeElementsMp.wechatChannelsSpec)
        && Objects.equals(
            this.finderObjectVisibility, adcreativeCreativeElementsMp.finderObjectVisibility)
        && Objects.equals(this.imageListJumpInfo, adcreativeCreativeElementsMp.imageListJumpInfo)
        && Objects.equals(this.buttonTextJumpInfo, adcreativeCreativeElementsMp.buttonTextJumpInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        image,
        image2,
        image3,
        title,
        description,
        corporate,
        video,
        deepLinkType,
        linkNameType,
        imageList,
        elementStory,
        url,
        buttonText,
        bottomText,
        excitationText,
        countdownBegin,
        countdownExpiringTimestamp,
        countdownPrice,
        countdownTimeType,
        label,
        productTags,
        logoDescription,
        logo,
        leftBottomTxt,
        animationEffect,
        phone,
        shortVideoStruct,
        longVideoStruct,
        bannerContent,
        cardContent,
        videoPopupButton,
        buttonUrl,
        brand,
        caption,
        labelledImg,
        fullScreenImage,
        zipUrl,
        endPage,
        headLine,
        shopImageStruct,
        chosenButton,
        livingDescStruct,
        leftButton,
        rightButton,
        leftCanvas,
        rightCanvas,
        floatingZoneStruct,
        canvasShareImage,
        wegameInfoSpec,
        wechatChannelsSpec,
        finderObjectVisibility,
        imageListJumpInfo,
        buttonTextJumpInfo);
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
