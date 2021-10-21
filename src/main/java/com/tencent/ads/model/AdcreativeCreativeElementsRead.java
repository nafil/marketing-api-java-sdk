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
public class AdcreativeCreativeElementsRead {
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

  @SerializedName("countdown_expiring_timestamp")
  private Long countdownExpiringTimestamp = null;

  public AdcreativeCreativeElementsRead image(String image) {
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

  public AdcreativeCreativeElementsRead image2(String image2) {
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

  public AdcreativeCreativeElementsRead image3(String image3) {
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

  public AdcreativeCreativeElementsRead title(String title) {
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

  public AdcreativeCreativeElementsRead description(String description) {
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

  public AdcreativeCreativeElementsRead corporate(AdcreativeCorporate corporate) {
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

  public AdcreativeCreativeElementsRead video(String video) {
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

  public AdcreativeCreativeElementsRead deepLinkType(String deepLinkType) {
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

  public AdcreativeCreativeElementsRead linkNameType(LinkNameType linkNameType) {
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

  public AdcreativeCreativeElementsRead imageList(List<String> imageList) {
    this.imageList = imageList;
    return this;
  }

  public AdcreativeCreativeElementsRead addImageListItem(String imageListItem) {
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

  public AdcreativeCreativeElementsRead elementStory(
      List<AdcreativeElementStoryArrayItem> elementStory) {
    this.elementStory = elementStory;
    return this;
  }

  public AdcreativeCreativeElementsRead addElementStoryItem(
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

  public AdcreativeCreativeElementsRead url(String url) {
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

  public AdcreativeCreativeElementsRead buttonText(String buttonText) {
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

  public AdcreativeCreativeElementsRead bottomText(String bottomText) {
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

  public AdcreativeCreativeElementsRead excitationText(String excitationText) {
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

  public AdcreativeCreativeElementsRead countdownBegin(Long countdownBegin) {
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

  public AdcreativeCreativeElementsRead countdownPrice(String countdownPrice) {
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

  public AdcreativeCreativeElementsRead countdownTimeType(
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

  public AdcreativeCreativeElementsRead label(List<CreativeLabel> label) {
    this.label = label;
    return this;
  }

  public AdcreativeCreativeElementsRead addLabelItem(CreativeLabel labelItem) {
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

  public AdcreativeCreativeElementsRead productTags(List<String> productTags) {
    this.productTags = productTags;
    return this;
  }

  public AdcreativeCreativeElementsRead addProductTagsItem(String productTagsItem) {
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

  public AdcreativeCreativeElementsRead logoDescription(String logoDescription) {
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

  public AdcreativeCreativeElementsRead logo(String logo) {
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

  public AdcreativeCreativeElementsRead leftButton(String leftButton) {
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

  public AdcreativeCreativeElementsRead rightButton(String rightButton) {
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

  public AdcreativeCreativeElementsRead leftBottomTxt(String leftBottomTxt) {
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

  public AdcreativeCreativeElementsRead animationEffect(String animationEffect) {
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

  public AdcreativeCreativeElementsRead phone(String phone) {
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

  public AdcreativeCreativeElementsRead caption(String caption) {
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

  public AdcreativeCreativeElementsRead logoPage(AdcreativeLogoPage logoPage) {
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

  public AdcreativeCreativeElementsRead videoPopupUrl(String videoPopupUrl) {
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

  public AdcreativeCreativeElementsRead videoPopupButton(
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

  public AdcreativeCreativeElementsRead videoPopupButtonText(String videoPopupButtonText) {
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

  public AdcreativeCreativeElementsRead videoPopupButtonUrl(String videoPopupButtonUrl) {
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

  public AdcreativeCreativeElementsRead buttonUrl(String buttonUrl) {
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

  public AdcreativeCreativeElementsRead longVideo1(String longVideo1) {
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

  public AdcreativeCreativeElementsRead longVideo2(String longVideo2) {
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

  public AdcreativeCreativeElementsRead shortVideoStruct(ShortVideoStruct shortVideoStruct) {
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

  public AdcreativeCreativeElementsRead qzoneVideoPageId(String qzoneVideoPageId) {
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

  public AdcreativeCreativeElementsRead qq(String qq) {
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

  public AdcreativeCreativeElementsRead leftCanvas(String leftCanvas) {
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

  public AdcreativeCreativeElementsRead rightCanvas(String rightCanvas) {
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

  public AdcreativeCreativeElementsRead sunText(String sunText) {
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

  public AdcreativeCreativeElementsRead cloudText(String cloudText) {
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

  public AdcreativeCreativeElementsRead overcastText(String overcastText) {
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

  public AdcreativeCreativeElementsRead rainText(String rainText) {
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

  public AdcreativeCreativeElementsRead snowText(String snowText) {
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

  public AdcreativeCreativeElementsRead fogText(String fogText) {
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

  public AdcreativeCreativeElementsRead sandText(String sandText) {
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

  public AdcreativeCreativeElementsRead hazeText(String hazeText) {
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

  public AdcreativeCreativeElementsRead labelledImg(AdcreativeLabelledImg labelledImg) {
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

  public AdcreativeCreativeElementsRead shareImg(String shareImg) {
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

  public AdcreativeCreativeElementsRead longVideoStruct(LongVideoStruct longVideoStruct) {
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

  public AdcreativeCreativeElementsRead bannerContent(AdcreativeBannerContent bannerContent) {
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

  public AdcreativeCreativeElementsRead cardContent(AdcreativeCardContent cardContent) {
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

  public AdcreativeCreativeElementsRead brand(AdCreativeBrand brand) {
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

  public AdcreativeCreativeElementsRead fullScreenImage(String fullScreenImage) {
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

  public AdcreativeCreativeElementsRead zipUrl(String zipUrl) {
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

  public AdcreativeCreativeElementsRead endPage(AdCreativeEndPage endPage) {
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

  public AdcreativeCreativeElementsRead shopImage(String shopImage) {
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

  public AdcreativeCreativeElementsRead headLine(String headLine) {
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

  public AdcreativeCreativeElementsRead shopImageStruct(AdCreativeShopImageStruct shopImageStruct) {
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

  public AdcreativeCreativeElementsRead countdownExpiringTimestamp(
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
    AdcreativeCreativeElementsRead adcreativeCreativeElementsRead =
        (AdcreativeCreativeElementsRead) o;
    return Objects.equals(this.image, adcreativeCreativeElementsRead.image)
        && Objects.equals(this.image2, adcreativeCreativeElementsRead.image2)
        && Objects.equals(this.image3, adcreativeCreativeElementsRead.image3)
        && Objects.equals(this.title, adcreativeCreativeElementsRead.title)
        && Objects.equals(this.description, adcreativeCreativeElementsRead.description)
        && Objects.equals(this.corporate, adcreativeCreativeElementsRead.corporate)
        && Objects.equals(this.video, adcreativeCreativeElementsRead.video)
        && Objects.equals(this.deepLinkType, adcreativeCreativeElementsRead.deepLinkType)
        && Objects.equals(this.linkNameType, adcreativeCreativeElementsRead.linkNameType)
        && Objects.equals(this.imageList, adcreativeCreativeElementsRead.imageList)
        && Objects.equals(this.elementStory, adcreativeCreativeElementsRead.elementStory)
        && Objects.equals(this.url, adcreativeCreativeElementsRead.url)
        && Objects.equals(this.buttonText, adcreativeCreativeElementsRead.buttonText)
        && Objects.equals(this.bottomText, adcreativeCreativeElementsRead.bottomText)
        && Objects.equals(this.excitationText, adcreativeCreativeElementsRead.excitationText)
        && Objects.equals(this.countdownBegin, adcreativeCreativeElementsRead.countdownBegin)
        && Objects.equals(this.countdownPrice, adcreativeCreativeElementsRead.countdownPrice)
        && Objects.equals(this.countdownTimeType, adcreativeCreativeElementsRead.countdownTimeType)
        && Objects.equals(this.label, adcreativeCreativeElementsRead.label)
        && Objects.equals(this.productTags, adcreativeCreativeElementsRead.productTags)
        && Objects.equals(this.logoDescription, adcreativeCreativeElementsRead.logoDescription)
        && Objects.equals(this.logo, adcreativeCreativeElementsRead.logo)
        && Objects.equals(this.leftButton, adcreativeCreativeElementsRead.leftButton)
        && Objects.equals(this.rightButton, adcreativeCreativeElementsRead.rightButton)
        && Objects.equals(this.leftBottomTxt, adcreativeCreativeElementsRead.leftBottomTxt)
        && Objects.equals(this.animationEffect, adcreativeCreativeElementsRead.animationEffect)
        && Objects.equals(this.phone, adcreativeCreativeElementsRead.phone)
        && Objects.equals(this.caption, adcreativeCreativeElementsRead.caption)
        && Objects.equals(this.logoPage, adcreativeCreativeElementsRead.logoPage)
        && Objects.equals(this.videoPopupUrl, adcreativeCreativeElementsRead.videoPopupUrl)
        && Objects.equals(this.videoPopupButton, adcreativeCreativeElementsRead.videoPopupButton)
        && Objects.equals(
            this.videoPopupButtonText, adcreativeCreativeElementsRead.videoPopupButtonText)
        && Objects.equals(
            this.videoPopupButtonUrl, adcreativeCreativeElementsRead.videoPopupButtonUrl)
        && Objects.equals(this.buttonUrl, adcreativeCreativeElementsRead.buttonUrl)
        && Objects.equals(this.longVideo1, adcreativeCreativeElementsRead.longVideo1)
        && Objects.equals(this.longVideo2, adcreativeCreativeElementsRead.longVideo2)
        && Objects.equals(this.shortVideoStruct, adcreativeCreativeElementsRead.shortVideoStruct)
        && Objects.equals(this.qzoneVideoPageId, adcreativeCreativeElementsRead.qzoneVideoPageId)
        && Objects.equals(this.qq, adcreativeCreativeElementsRead.qq)
        && Objects.equals(this.leftCanvas, adcreativeCreativeElementsRead.leftCanvas)
        && Objects.equals(this.rightCanvas, adcreativeCreativeElementsRead.rightCanvas)
        && Objects.equals(this.sunText, adcreativeCreativeElementsRead.sunText)
        && Objects.equals(this.cloudText, adcreativeCreativeElementsRead.cloudText)
        && Objects.equals(this.overcastText, adcreativeCreativeElementsRead.overcastText)
        && Objects.equals(this.rainText, adcreativeCreativeElementsRead.rainText)
        && Objects.equals(this.snowText, adcreativeCreativeElementsRead.snowText)
        && Objects.equals(this.fogText, adcreativeCreativeElementsRead.fogText)
        && Objects.equals(this.sandText, adcreativeCreativeElementsRead.sandText)
        && Objects.equals(this.hazeText, adcreativeCreativeElementsRead.hazeText)
        && Objects.equals(this.labelledImg, adcreativeCreativeElementsRead.labelledImg)
        && Objects.equals(this.shareImg, adcreativeCreativeElementsRead.shareImg)
        && Objects.equals(this.longVideoStruct, adcreativeCreativeElementsRead.longVideoStruct)
        && Objects.equals(this.bannerContent, adcreativeCreativeElementsRead.bannerContent)
        && Objects.equals(this.cardContent, adcreativeCreativeElementsRead.cardContent)
        && Objects.equals(this.brand, adcreativeCreativeElementsRead.brand)
        && Objects.equals(this.fullScreenImage, adcreativeCreativeElementsRead.fullScreenImage)
        && Objects.equals(this.zipUrl, adcreativeCreativeElementsRead.zipUrl)
        && Objects.equals(this.endPage, adcreativeCreativeElementsRead.endPage)
        && Objects.equals(this.shopImage, adcreativeCreativeElementsRead.shopImage)
        && Objects.equals(this.headLine, adcreativeCreativeElementsRead.headLine)
        && Objects.equals(this.shopImageStruct, adcreativeCreativeElementsRead.shopImageStruct)
        && Objects.equals(
            this.countdownExpiringTimestamp,
            adcreativeCreativeElementsRead.countdownExpiringTimestamp);
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
