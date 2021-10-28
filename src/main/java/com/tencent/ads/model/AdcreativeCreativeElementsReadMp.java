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
public class AdcreativeCreativeElementsReadMp {
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

  @SerializedName("left_button")
  private String leftButton = null;

  @SerializedName("right_button")
  private String rightButton = null;

  @SerializedName("left_bottom_txt")
  private String leftBottomTxt = null;

  @SerializedName("animation_effect")
  private String animationEffect = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("caption")
  private String caption = null;

  @SerializedName("logo_page")
  private AdcreativeLogoPage logoPage = null;

  @SerializedName("video_popup_url")
  private String videoPopupUrl = null;

  @SerializedName("video_popup_button")
  private AdcreativeVideoPopupButton videoPopupButton = null;

  @SerializedName("video_popup_button_text")
  private String videoPopupButtonText = null;

  @SerializedName("video_popup_button_url")
  private String videoPopupButtonUrl = null;

  @SerializedName("button_url")
  private String buttonUrl = null;

  @SerializedName("long_video1")
  private String longVideo1 = null;

  @SerializedName("long_video2")
  private String longVideo2 = null;

  @SerializedName("short_video_struct")
  private ShortVideoStruct shortVideoStruct = null;

  @SerializedName("qzone_video_page_id")
  private String qzoneVideoPageId = null;

  @SerializedName("qq")
  private String qq = null;

  @SerializedName("left_canvas")
  private String leftCanvas = null;

  @SerializedName("right_canvas")
  private String rightCanvas = null;

  @SerializedName("sun_text")
  private String sunText = null;

  @SerializedName("cloud_text")
  private String cloudText = null;

  @SerializedName("overcast_text")
  private String overcastText = null;

  @SerializedName("rain_text")
  private String rainText = null;

  @SerializedName("snow_text")
  private String snowText = null;

  @SerializedName("fog_text")
  private String fogText = null;

  @SerializedName("sand_text")
  private String sandText = null;

  @SerializedName("haze_text")
  private String hazeText = null;

  @SerializedName("labelled_img")
  private AdcreativeLabelledImg labelledImg = null;

  @SerializedName("share_img")
  private String shareImg = null;

  @SerializedName("long_video_struct")
  private LongVideoStruct longVideoStruct = null;

  @SerializedName("banner_content")
  private AdcreativeBannerContent bannerContent = null;

  @SerializedName("card_content")
  private AdcreativeCardContent cardContent = null;

  @SerializedName("brand")
  private AdCreativeBrand brand = null;

  @SerializedName("full_screen_image")
  private String fullScreenImage = null;

  @SerializedName("zip_url")
  private String zipUrl = null;

  @SerializedName("end_page")
  private AdCreativeEndPage endPage = null;

  @SerializedName("shop_image")
  private String shopImage = null;

  @SerializedName("head_line")
  private String headLine = null;

  @SerializedName("shop_image_struct")
  private AdCreativeShopImageStruct shopImageStruct = null;

  @SerializedName("chosen_button")
  private ChosenButton chosenButton = null;

  @SerializedName("countdown_expiring_timestamp")
  private Long countdownExpiringTimestamp = null;

  public AdcreativeCreativeElementsReadMp image(String image) {
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

  public AdcreativeCreativeElementsReadMp image2(String image2) {
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

  public AdcreativeCreativeElementsReadMp image3(String image3) {
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

  public AdcreativeCreativeElementsReadMp title(String title) {
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

  public AdcreativeCreativeElementsReadMp description(String description) {
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

  public AdcreativeCreativeElementsReadMp corporate(AdcreativeCorporate corporate) {
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

  public AdcreativeCreativeElementsReadMp video(String video) {
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

  public AdcreativeCreativeElementsReadMp deepLinkType(String deepLinkType) {
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

  public AdcreativeCreativeElementsReadMp linkNameType(LinkNameType linkNameType) {
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

  public AdcreativeCreativeElementsReadMp imageList(List<String> imageList) {
    this.imageList = imageList;
    return this;
  }

  public AdcreativeCreativeElementsReadMp addImageListItem(String imageListItem) {
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

  public AdcreativeCreativeElementsReadMp elementStory(
      List<AdcreativeElementStoryArrayItem> elementStory) {
    this.elementStory = elementStory;
    return this;
  }

  public AdcreativeCreativeElementsReadMp addElementStoryItem(
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

  public AdcreativeCreativeElementsReadMp url(String url) {
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

  public AdcreativeCreativeElementsReadMp buttonText(String buttonText) {
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

  public AdcreativeCreativeElementsReadMp bottomText(String bottomText) {
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

  public AdcreativeCreativeElementsReadMp excitationText(String excitationText) {
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

  public AdcreativeCreativeElementsReadMp countdownBegin(Long countdownBegin) {
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

  public AdcreativeCreativeElementsReadMp countdownPrice(String countdownPrice) {
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

  public AdcreativeCreativeElementsReadMp countdownTimeType(
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

  public AdcreativeCreativeElementsReadMp label(List<CreativeLabel> label) {
    this.label = label;
    return this;
  }

  public AdcreativeCreativeElementsReadMp addLabelItem(CreativeLabel labelItem) {
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

  public AdcreativeCreativeElementsReadMp productTags(List<String> productTags) {
    this.productTags = productTags;
    return this;
  }

  public AdcreativeCreativeElementsReadMp addProductTagsItem(String productTagsItem) {
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

  public AdcreativeCreativeElementsReadMp logoDescription(String logoDescription) {
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

  public AdcreativeCreativeElementsReadMp logo(String logo) {
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

  public AdcreativeCreativeElementsReadMp leftButton(String leftButton) {
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

  public AdcreativeCreativeElementsReadMp rightButton(String rightButton) {
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

  public AdcreativeCreativeElementsReadMp leftBottomTxt(String leftBottomTxt) {
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

  public AdcreativeCreativeElementsReadMp animationEffect(String animationEffect) {
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

  public AdcreativeCreativeElementsReadMp phone(String phone) {
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

  public AdcreativeCreativeElementsReadMp caption(String caption) {
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

  public AdcreativeCreativeElementsReadMp logoPage(AdcreativeLogoPage logoPage) {
    this.logoPage = logoPage;
    return this;
  }

  /**
   * Get logoPage
   *
   * @return logoPage
   */
  @ApiModelProperty(value = "")
  public AdcreativeLogoPage getLogoPage() {
    return logoPage;
  }

  public void setLogoPage(AdcreativeLogoPage logoPage) {
    this.logoPage = logoPage;
  }

  public AdcreativeCreativeElementsReadMp videoPopupUrl(String videoPopupUrl) {
    this.videoPopupUrl = videoPopupUrl;
    return this;
  }

  /**
   * Get videoPopupUrl
   *
   * @return videoPopupUrl
   */
  @ApiModelProperty(value = "")
  public String getVideoPopupUrl() {
    return videoPopupUrl;
  }

  public void setVideoPopupUrl(String videoPopupUrl) {
    this.videoPopupUrl = videoPopupUrl;
  }

  public AdcreativeCreativeElementsReadMp videoPopupButton(
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

  public AdcreativeCreativeElementsReadMp videoPopupButtonText(String videoPopupButtonText) {
    this.videoPopupButtonText = videoPopupButtonText;
    return this;
  }

  /**
   * Get videoPopupButtonText
   *
   * @return videoPopupButtonText
   */
  @ApiModelProperty(value = "")
  public String getVideoPopupButtonText() {
    return videoPopupButtonText;
  }

  public void setVideoPopupButtonText(String videoPopupButtonText) {
    this.videoPopupButtonText = videoPopupButtonText;
  }

  public AdcreativeCreativeElementsReadMp videoPopupButtonUrl(String videoPopupButtonUrl) {
    this.videoPopupButtonUrl = videoPopupButtonUrl;
    return this;
  }

  /**
   * Get videoPopupButtonUrl
   *
   * @return videoPopupButtonUrl
   */
  @ApiModelProperty(value = "")
  public String getVideoPopupButtonUrl() {
    return videoPopupButtonUrl;
  }

  public void setVideoPopupButtonUrl(String videoPopupButtonUrl) {
    this.videoPopupButtonUrl = videoPopupButtonUrl;
  }

  public AdcreativeCreativeElementsReadMp buttonUrl(String buttonUrl) {
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

  public AdcreativeCreativeElementsReadMp longVideo1(String longVideo1) {
    this.longVideo1 = longVideo1;
    return this;
  }

  /**
   * Get longVideo1
   *
   * @return longVideo1
   */
  @ApiModelProperty(value = "")
  public String getLongVideo1() {
    return longVideo1;
  }

  public void setLongVideo1(String longVideo1) {
    this.longVideo1 = longVideo1;
  }

  public AdcreativeCreativeElementsReadMp longVideo2(String longVideo2) {
    this.longVideo2 = longVideo2;
    return this;
  }

  /**
   * Get longVideo2
   *
   * @return longVideo2
   */
  @ApiModelProperty(value = "")
  public String getLongVideo2() {
    return longVideo2;
  }

  public void setLongVideo2(String longVideo2) {
    this.longVideo2 = longVideo2;
  }

  public AdcreativeCreativeElementsReadMp shortVideoStruct(ShortVideoStruct shortVideoStruct) {
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

  public AdcreativeCreativeElementsReadMp qzoneVideoPageId(String qzoneVideoPageId) {
    this.qzoneVideoPageId = qzoneVideoPageId;
    return this;
  }

  /**
   * Get qzoneVideoPageId
   *
   * @return qzoneVideoPageId
   */
  @ApiModelProperty(value = "")
  public String getQzoneVideoPageId() {
    return qzoneVideoPageId;
  }

  public void setQzoneVideoPageId(String qzoneVideoPageId) {
    this.qzoneVideoPageId = qzoneVideoPageId;
  }

  public AdcreativeCreativeElementsReadMp qq(String qq) {
    this.qq = qq;
    return this;
  }

  /**
   * Get qq
   *
   * @return qq
   */
  @ApiModelProperty(value = "")
  public String getQq() {
    return qq;
  }

  public void setQq(String qq) {
    this.qq = qq;
  }

  public AdcreativeCreativeElementsReadMp leftCanvas(String leftCanvas) {
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

  public AdcreativeCreativeElementsReadMp rightCanvas(String rightCanvas) {
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

  public AdcreativeCreativeElementsReadMp sunText(String sunText) {
    this.sunText = sunText;
    return this;
  }

  /**
   * Get sunText
   *
   * @return sunText
   */
  @ApiModelProperty(value = "")
  public String getSunText() {
    return sunText;
  }

  public void setSunText(String sunText) {
    this.sunText = sunText;
  }

  public AdcreativeCreativeElementsReadMp cloudText(String cloudText) {
    this.cloudText = cloudText;
    return this;
  }

  /**
   * Get cloudText
   *
   * @return cloudText
   */
  @ApiModelProperty(value = "")
  public String getCloudText() {
    return cloudText;
  }

  public void setCloudText(String cloudText) {
    this.cloudText = cloudText;
  }

  public AdcreativeCreativeElementsReadMp overcastText(String overcastText) {
    this.overcastText = overcastText;
    return this;
  }

  /**
   * Get overcastText
   *
   * @return overcastText
   */
  @ApiModelProperty(value = "")
  public String getOvercastText() {
    return overcastText;
  }

  public void setOvercastText(String overcastText) {
    this.overcastText = overcastText;
  }

  public AdcreativeCreativeElementsReadMp rainText(String rainText) {
    this.rainText = rainText;
    return this;
  }

  /**
   * Get rainText
   *
   * @return rainText
   */
  @ApiModelProperty(value = "")
  public String getRainText() {
    return rainText;
  }

  public void setRainText(String rainText) {
    this.rainText = rainText;
  }

  public AdcreativeCreativeElementsReadMp snowText(String snowText) {
    this.snowText = snowText;
    return this;
  }

  /**
   * Get snowText
   *
   * @return snowText
   */
  @ApiModelProperty(value = "")
  public String getSnowText() {
    return snowText;
  }

  public void setSnowText(String snowText) {
    this.snowText = snowText;
  }

  public AdcreativeCreativeElementsReadMp fogText(String fogText) {
    this.fogText = fogText;
    return this;
  }

  /**
   * Get fogText
   *
   * @return fogText
   */
  @ApiModelProperty(value = "")
  public String getFogText() {
    return fogText;
  }

  public void setFogText(String fogText) {
    this.fogText = fogText;
  }

  public AdcreativeCreativeElementsReadMp sandText(String sandText) {
    this.sandText = sandText;
    return this;
  }

  /**
   * Get sandText
   *
   * @return sandText
   */
  @ApiModelProperty(value = "")
  public String getSandText() {
    return sandText;
  }

  public void setSandText(String sandText) {
    this.sandText = sandText;
  }

  public AdcreativeCreativeElementsReadMp hazeText(String hazeText) {
    this.hazeText = hazeText;
    return this;
  }

  /**
   * Get hazeText
   *
   * @return hazeText
   */
  @ApiModelProperty(value = "")
  public String getHazeText() {
    return hazeText;
  }

  public void setHazeText(String hazeText) {
    this.hazeText = hazeText;
  }

  public AdcreativeCreativeElementsReadMp labelledImg(AdcreativeLabelledImg labelledImg) {
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

  public AdcreativeCreativeElementsReadMp shareImg(String shareImg) {
    this.shareImg = shareImg;
    return this;
  }

  /**
   * Get shareImg
   *
   * @return shareImg
   */
  @ApiModelProperty(value = "")
  public String getShareImg() {
    return shareImg;
  }

  public void setShareImg(String shareImg) {
    this.shareImg = shareImg;
  }

  public AdcreativeCreativeElementsReadMp longVideoStruct(LongVideoStruct longVideoStruct) {
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

  public AdcreativeCreativeElementsReadMp bannerContent(AdcreativeBannerContent bannerContent) {
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

  public AdcreativeCreativeElementsReadMp cardContent(AdcreativeCardContent cardContent) {
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

  public AdcreativeCreativeElementsReadMp brand(AdCreativeBrand brand) {
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

  public AdcreativeCreativeElementsReadMp fullScreenImage(String fullScreenImage) {
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

  public AdcreativeCreativeElementsReadMp zipUrl(String zipUrl) {
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

  public AdcreativeCreativeElementsReadMp endPage(AdCreativeEndPage endPage) {
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

  public AdcreativeCreativeElementsReadMp shopImage(String shopImage) {
    this.shopImage = shopImage;
    return this;
  }

  /**
   * Get shopImage
   *
   * @return shopImage
   */
  @ApiModelProperty(value = "")
  public String getShopImage() {
    return shopImage;
  }

  public void setShopImage(String shopImage) {
    this.shopImage = shopImage;
  }

  public AdcreativeCreativeElementsReadMp headLine(String headLine) {
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

  public AdcreativeCreativeElementsReadMp shopImageStruct(
      AdCreativeShopImageStruct shopImageStruct) {
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

  public AdcreativeCreativeElementsReadMp chosenButton(ChosenButton chosenButton) {
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

  public AdcreativeCreativeElementsReadMp countdownExpiringTimestamp(
      Long countdownExpiringTimestamp) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdcreativeCreativeElementsReadMp adcreativeCreativeElementsReadMp =
        (AdcreativeCreativeElementsReadMp) o;
    return Objects.equals(this.image, adcreativeCreativeElementsReadMp.image)
        && Objects.equals(this.image2, adcreativeCreativeElementsReadMp.image2)
        && Objects.equals(this.image3, adcreativeCreativeElementsReadMp.image3)
        && Objects.equals(this.title, adcreativeCreativeElementsReadMp.title)
        && Objects.equals(this.description, adcreativeCreativeElementsReadMp.description)
        && Objects.equals(this.corporate, adcreativeCreativeElementsReadMp.corporate)
        && Objects.equals(this.video, adcreativeCreativeElementsReadMp.video)
        && Objects.equals(this.deepLinkType, adcreativeCreativeElementsReadMp.deepLinkType)
        && Objects.equals(this.linkNameType, adcreativeCreativeElementsReadMp.linkNameType)
        && Objects.equals(this.imageList, adcreativeCreativeElementsReadMp.imageList)
        && Objects.equals(this.elementStory, adcreativeCreativeElementsReadMp.elementStory)
        && Objects.equals(this.url, adcreativeCreativeElementsReadMp.url)
        && Objects.equals(this.buttonText, adcreativeCreativeElementsReadMp.buttonText)
        && Objects.equals(this.bottomText, adcreativeCreativeElementsReadMp.bottomText)
        && Objects.equals(this.excitationText, adcreativeCreativeElementsReadMp.excitationText)
        && Objects.equals(this.countdownBegin, adcreativeCreativeElementsReadMp.countdownBegin)
        && Objects.equals(this.countdownPrice, adcreativeCreativeElementsReadMp.countdownPrice)
        && Objects.equals(
            this.countdownTimeType, adcreativeCreativeElementsReadMp.countdownTimeType)
        && Objects.equals(this.label, adcreativeCreativeElementsReadMp.label)
        && Objects.equals(this.productTags, adcreativeCreativeElementsReadMp.productTags)
        && Objects.equals(this.logoDescription, adcreativeCreativeElementsReadMp.logoDescription)
        && Objects.equals(this.logo, adcreativeCreativeElementsReadMp.logo)
        && Objects.equals(this.leftButton, adcreativeCreativeElementsReadMp.leftButton)
        && Objects.equals(this.rightButton, adcreativeCreativeElementsReadMp.rightButton)
        && Objects.equals(this.leftBottomTxt, adcreativeCreativeElementsReadMp.leftBottomTxt)
        && Objects.equals(this.animationEffect, adcreativeCreativeElementsReadMp.animationEffect)
        && Objects.equals(this.phone, adcreativeCreativeElementsReadMp.phone)
        && Objects.equals(this.caption, adcreativeCreativeElementsReadMp.caption)
        && Objects.equals(this.logoPage, adcreativeCreativeElementsReadMp.logoPage)
        && Objects.equals(this.videoPopupUrl, adcreativeCreativeElementsReadMp.videoPopupUrl)
        && Objects.equals(this.videoPopupButton, adcreativeCreativeElementsReadMp.videoPopupButton)
        && Objects.equals(
            this.videoPopupButtonText, adcreativeCreativeElementsReadMp.videoPopupButtonText)
        && Objects.equals(
            this.videoPopupButtonUrl, adcreativeCreativeElementsReadMp.videoPopupButtonUrl)
        && Objects.equals(this.buttonUrl, adcreativeCreativeElementsReadMp.buttonUrl)
        && Objects.equals(this.longVideo1, adcreativeCreativeElementsReadMp.longVideo1)
        && Objects.equals(this.longVideo2, adcreativeCreativeElementsReadMp.longVideo2)
        && Objects.equals(this.shortVideoStruct, adcreativeCreativeElementsReadMp.shortVideoStruct)
        && Objects.equals(this.qzoneVideoPageId, adcreativeCreativeElementsReadMp.qzoneVideoPageId)
        && Objects.equals(this.qq, adcreativeCreativeElementsReadMp.qq)
        && Objects.equals(this.leftCanvas, adcreativeCreativeElementsReadMp.leftCanvas)
        && Objects.equals(this.rightCanvas, adcreativeCreativeElementsReadMp.rightCanvas)
        && Objects.equals(this.sunText, adcreativeCreativeElementsReadMp.sunText)
        && Objects.equals(this.cloudText, adcreativeCreativeElementsReadMp.cloudText)
        && Objects.equals(this.overcastText, adcreativeCreativeElementsReadMp.overcastText)
        && Objects.equals(this.rainText, adcreativeCreativeElementsReadMp.rainText)
        && Objects.equals(this.snowText, adcreativeCreativeElementsReadMp.snowText)
        && Objects.equals(this.fogText, adcreativeCreativeElementsReadMp.fogText)
        && Objects.equals(this.sandText, adcreativeCreativeElementsReadMp.sandText)
        && Objects.equals(this.hazeText, adcreativeCreativeElementsReadMp.hazeText)
        && Objects.equals(this.labelledImg, adcreativeCreativeElementsReadMp.labelledImg)
        && Objects.equals(this.shareImg, adcreativeCreativeElementsReadMp.shareImg)
        && Objects.equals(this.longVideoStruct, adcreativeCreativeElementsReadMp.longVideoStruct)
        && Objects.equals(this.bannerContent, adcreativeCreativeElementsReadMp.bannerContent)
        && Objects.equals(this.cardContent, adcreativeCreativeElementsReadMp.cardContent)
        && Objects.equals(this.brand, adcreativeCreativeElementsReadMp.brand)
        && Objects.equals(this.fullScreenImage, adcreativeCreativeElementsReadMp.fullScreenImage)
        && Objects.equals(this.zipUrl, adcreativeCreativeElementsReadMp.zipUrl)
        && Objects.equals(this.endPage, adcreativeCreativeElementsReadMp.endPage)
        && Objects.equals(this.shopImage, adcreativeCreativeElementsReadMp.shopImage)
        && Objects.equals(this.headLine, adcreativeCreativeElementsReadMp.headLine)
        && Objects.equals(this.shopImageStruct, adcreativeCreativeElementsReadMp.shopImageStruct)
        && Objects.equals(this.chosenButton, adcreativeCreativeElementsReadMp.chosenButton)
        && Objects.equals(
            this.countdownExpiringTimestamp,
            adcreativeCreativeElementsReadMp.countdownExpiringTimestamp);
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
        countdownPrice,
        countdownTimeType,
        label,
        productTags,
        logoDescription,
        logo,
        leftButton,
        rightButton,
        leftBottomTxt,
        animationEffect,
        phone,
        caption,
        logoPage,
        videoPopupUrl,
        videoPopupButton,
        videoPopupButtonText,
        videoPopupButtonUrl,
        buttonUrl,
        longVideo1,
        longVideo2,
        shortVideoStruct,
        qzoneVideoPageId,
        qq,
        leftCanvas,
        rightCanvas,
        sunText,
        cloudText,
        overcastText,
        rainText,
        snowText,
        fogText,
        sandText,
        hazeText,
        labelledImg,
        shareImg,
        longVideoStruct,
        bannerContent,
        cardContent,
        brand,
        fullScreenImage,
        zipUrl,
        endPage,
        shopImage,
        headLine,
        shopImageStruct,
        chosenButton,
        countdownExpiringTimestamp);
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
