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

/** 修改后的创意元素，填写要求同adcreative_elements，当且仅当 online_enabled &#x3D; true 时，此字段允许写入 */
@ApiModel(description = "修改后的创意元素，填写要求同adcreative_elements，当且仅当 online_enabled = true 时，此字段允许写入")
public class RevisedAdcreativeElements {
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

  @SerializedName("countdown")
  private Long countdown = null;

  @SerializedName("countdown_price")
  private String countdownPrice = null;

  @SerializedName("countdown_time_type")
  private AdCreativeCountdownTimeType countdownTimeType = null;

  @SerializedName("mini_program_id")
  private String miniProgramId = null;

  @SerializedName("mini_program_path")
  private String miniProgramPath = null;

  @SerializedName("mini_program_paths")
  private List<String> miniProgramPaths = null;

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

  @SerializedName("video_popup_url")
  private String videoPopupUrl = null;

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

  @SerializedName("shop_image")
  private String shopImage = null;

  @SerializedName("head_line")
  private String headLine = null;

  @SerializedName("shop_image_struct")
  private AdCreativeShopImageStruct shopImageStruct = null;

  @SerializedName("chosen_button")
  private ChosenButton chosenButton = null;

  @SerializedName("living_desc_struct")
  private AdCreativeLivingDescStruct livingDescStruct = null;

  @SerializedName("floating_zone_struct")
  private FloatingZone floatingZoneStruct = null;

  public RevisedAdcreativeElements image(String image) {
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

  public RevisedAdcreativeElements image2(String image2) {
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

  public RevisedAdcreativeElements image3(String image3) {
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

  public RevisedAdcreativeElements title(String title) {
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

  public RevisedAdcreativeElements description(String description) {
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

  public RevisedAdcreativeElements corporate(AdcreativeCorporate corporate) {
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

  public RevisedAdcreativeElements video(String video) {
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

  public RevisedAdcreativeElements deepLinkType(String deepLinkType) {
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

  public RevisedAdcreativeElements linkNameType(LinkNameType linkNameType) {
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

  public RevisedAdcreativeElements imageList(List<String> imageList) {
    this.imageList = imageList;
    return this;
  }

  public RevisedAdcreativeElements addImageListItem(String imageListItem) {
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

  public RevisedAdcreativeElements elementStory(
      List<AdcreativeElementStoryArrayItem> elementStory) {
    this.elementStory = elementStory;
    return this;
  }

  public RevisedAdcreativeElements addElementStoryItem(
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

  public RevisedAdcreativeElements url(String url) {
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

  public RevisedAdcreativeElements buttonText(String buttonText) {
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

  public RevisedAdcreativeElements bottomText(String bottomText) {
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

  public RevisedAdcreativeElements excitationText(String excitationText) {
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

  public RevisedAdcreativeElements countdownBegin(Long countdownBegin) {
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

  public RevisedAdcreativeElements countdown(Long countdown) {
    this.countdown = countdown;
    return this;
  }

  /**
   * Get countdown
   *
   * @return countdown
   */
  @ApiModelProperty(value = "")
  public Long getCountdown() {
    return countdown;
  }

  public void setCountdown(Long countdown) {
    this.countdown = countdown;
  }

  public RevisedAdcreativeElements countdownPrice(String countdownPrice) {
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

  public RevisedAdcreativeElements countdownTimeType(
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

  public RevisedAdcreativeElements miniProgramId(String miniProgramId) {
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

  public RevisedAdcreativeElements miniProgramPath(String miniProgramPath) {
    this.miniProgramPath = miniProgramPath;
    return this;
  }

  /**
   * Get miniProgramPath
   *
   * @return miniProgramPath
   */
  @ApiModelProperty(value = "")
  public String getMiniProgramPath() {
    return miniProgramPath;
  }

  public void setMiniProgramPath(String miniProgramPath) {
    this.miniProgramPath = miniProgramPath;
  }

  public RevisedAdcreativeElements miniProgramPaths(List<String> miniProgramPaths) {
    this.miniProgramPaths = miniProgramPaths;
    return this;
  }

  public RevisedAdcreativeElements addMiniProgramPathsItem(String miniProgramPathsItem) {
    if (this.miniProgramPaths == null) {
      this.miniProgramPaths = new ArrayList<String>();
    }
    this.miniProgramPaths.add(miniProgramPathsItem);
    return this;
  }

  /**
   * Get miniProgramPaths
   *
   * @return miniProgramPaths
   */
  @ApiModelProperty(value = "")
  public List<String> getMiniProgramPaths() {
    return miniProgramPaths;
  }

  public void setMiniProgramPaths(List<String> miniProgramPaths) {
    this.miniProgramPaths = miniProgramPaths;
  }

  public RevisedAdcreativeElements label(List<CreativeLabel> label) {
    this.label = label;
    return this;
  }

  public RevisedAdcreativeElements addLabelItem(CreativeLabel labelItem) {
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

  public RevisedAdcreativeElements productTags(List<String> productTags) {
    this.productTags = productTags;
    return this;
  }

  public RevisedAdcreativeElements addProductTagsItem(String productTagsItem) {
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

  public RevisedAdcreativeElements logoDescription(String logoDescription) {
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

  public RevisedAdcreativeElements logo(String logo) {
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

  public RevisedAdcreativeElements leftBottomTxt(String leftBottomTxt) {
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

  public RevisedAdcreativeElements animationEffect(String animationEffect) {
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

  public RevisedAdcreativeElements phone(String phone) {
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

  public RevisedAdcreativeElements shortVideoStruct(ShortVideoStruct shortVideoStruct) {
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

  public RevisedAdcreativeElements longVideoStruct(LongVideoStruct longVideoStruct) {
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

  public RevisedAdcreativeElements bannerContent(AdcreativeBannerContent bannerContent) {
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

  public RevisedAdcreativeElements cardContent(AdcreativeCardContent cardContent) {
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

  public RevisedAdcreativeElements videoPopupUrl(String videoPopupUrl) {
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

  public RevisedAdcreativeElements videoPopupButton(AdcreativeVideoPopupButton videoPopupButton) {
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

  public RevisedAdcreativeElements buttonUrl(String buttonUrl) {
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

  public RevisedAdcreativeElements brand(AdCreativeBrand brand) {
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

  public RevisedAdcreativeElements caption(String caption) {
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

  public RevisedAdcreativeElements labelledImg(AdcreativeLabelledImg labelledImg) {
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

  public RevisedAdcreativeElements fullScreenImage(String fullScreenImage) {
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

  public RevisedAdcreativeElements zipUrl(String zipUrl) {
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

  public RevisedAdcreativeElements endPage(AdCreativeEndPage endPage) {
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

  public RevisedAdcreativeElements shopImage(String shopImage) {
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

  public RevisedAdcreativeElements headLine(String headLine) {
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

  public RevisedAdcreativeElements shopImageStruct(AdCreativeShopImageStruct shopImageStruct) {
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

  public RevisedAdcreativeElements chosenButton(ChosenButton chosenButton) {
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

  public RevisedAdcreativeElements livingDescStruct(AdCreativeLivingDescStruct livingDescStruct) {
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

  public RevisedAdcreativeElements floatingZoneStruct(FloatingZone floatingZoneStruct) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevisedAdcreativeElements revisedAdcreativeElements = (RevisedAdcreativeElements) o;
    return Objects.equals(this.image, revisedAdcreativeElements.image)
        && Objects.equals(this.image2, revisedAdcreativeElements.image2)
        && Objects.equals(this.image3, revisedAdcreativeElements.image3)
        && Objects.equals(this.title, revisedAdcreativeElements.title)
        && Objects.equals(this.description, revisedAdcreativeElements.description)
        && Objects.equals(this.corporate, revisedAdcreativeElements.corporate)
        && Objects.equals(this.video, revisedAdcreativeElements.video)
        && Objects.equals(this.deepLinkType, revisedAdcreativeElements.deepLinkType)
        && Objects.equals(this.linkNameType, revisedAdcreativeElements.linkNameType)
        && Objects.equals(this.imageList, revisedAdcreativeElements.imageList)
        && Objects.equals(this.elementStory, revisedAdcreativeElements.elementStory)
        && Objects.equals(this.url, revisedAdcreativeElements.url)
        && Objects.equals(this.buttonText, revisedAdcreativeElements.buttonText)
        && Objects.equals(this.bottomText, revisedAdcreativeElements.bottomText)
        && Objects.equals(this.excitationText, revisedAdcreativeElements.excitationText)
        && Objects.equals(this.countdownBegin, revisedAdcreativeElements.countdownBegin)
        && Objects.equals(this.countdown, revisedAdcreativeElements.countdown)
        && Objects.equals(this.countdownPrice, revisedAdcreativeElements.countdownPrice)
        && Objects.equals(this.countdownTimeType, revisedAdcreativeElements.countdownTimeType)
        && Objects.equals(this.miniProgramId, revisedAdcreativeElements.miniProgramId)
        && Objects.equals(this.miniProgramPath, revisedAdcreativeElements.miniProgramPath)
        && Objects.equals(this.miniProgramPaths, revisedAdcreativeElements.miniProgramPaths)
        && Objects.equals(this.label, revisedAdcreativeElements.label)
        && Objects.equals(this.productTags, revisedAdcreativeElements.productTags)
        && Objects.equals(this.logoDescription, revisedAdcreativeElements.logoDescription)
        && Objects.equals(this.logo, revisedAdcreativeElements.logo)
        && Objects.equals(this.leftBottomTxt, revisedAdcreativeElements.leftBottomTxt)
        && Objects.equals(this.animationEffect, revisedAdcreativeElements.animationEffect)
        && Objects.equals(this.phone, revisedAdcreativeElements.phone)
        && Objects.equals(this.shortVideoStruct, revisedAdcreativeElements.shortVideoStruct)
        && Objects.equals(this.longVideoStruct, revisedAdcreativeElements.longVideoStruct)
        && Objects.equals(this.bannerContent, revisedAdcreativeElements.bannerContent)
        && Objects.equals(this.cardContent, revisedAdcreativeElements.cardContent)
        && Objects.equals(this.videoPopupUrl, revisedAdcreativeElements.videoPopupUrl)
        && Objects.equals(this.videoPopupButton, revisedAdcreativeElements.videoPopupButton)
        && Objects.equals(this.buttonUrl, revisedAdcreativeElements.buttonUrl)
        && Objects.equals(this.brand, revisedAdcreativeElements.brand)
        && Objects.equals(this.caption, revisedAdcreativeElements.caption)
        && Objects.equals(this.labelledImg, revisedAdcreativeElements.labelledImg)
        && Objects.equals(this.fullScreenImage, revisedAdcreativeElements.fullScreenImage)
        && Objects.equals(this.zipUrl, revisedAdcreativeElements.zipUrl)
        && Objects.equals(this.endPage, revisedAdcreativeElements.endPage)
        && Objects.equals(this.shopImage, revisedAdcreativeElements.shopImage)
        && Objects.equals(this.headLine, revisedAdcreativeElements.headLine)
        && Objects.equals(this.shopImageStruct, revisedAdcreativeElements.shopImageStruct)
        && Objects.equals(this.chosenButton, revisedAdcreativeElements.chosenButton)
        && Objects.equals(this.livingDescStruct, revisedAdcreativeElements.livingDescStruct)
        && Objects.equals(this.floatingZoneStruct, revisedAdcreativeElements.floatingZoneStruct);
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
        countdown,
        countdownPrice,
        countdownTimeType,
        miniProgramId,
        miniProgramPath,
        miniProgramPaths,
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
        videoPopupUrl,
        videoPopupButton,
        buttonUrl,
        brand,
        caption,
        labelledImg,
        fullScreenImage,
        zipUrl,
        endPage,
        shopImage,
        headLine,
        shopImageStruct,
        chosenButton,
        livingDescStruct,
        floatingZoneStruct);
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
