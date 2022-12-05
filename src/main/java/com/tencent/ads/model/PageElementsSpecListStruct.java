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
import java.util.Objects;

/** 页面组件列表, 页面顺序与生成的原生页的顺序一致 */
@ApiModel(description = "页面组件列表, 页面顺序与生成的原生页的顺序一致")
public class PageElementsSpecListStruct {
  @SerializedName("element_type")
  private CanvasPageElementType elementType = null;

  @SerializedName("top_image_spec")
  private TopImageSpec topImageSpec = null;

  @SerializedName("top_slider_spec")
  private TopSliderSpec topSliderSpec = null;

  @SerializedName("top_video_spec")
  private TopVideoSpec topVideoSpec = null;

  @SerializedName("image_spec")
  private ImageSpec imageSpec = null;

  @SerializedName("slider_spec")
  private SliderSpec sliderSpec = null;

  @SerializedName("video_spec")
  private VideoSpec videoSpec = null;

  @SerializedName("text_spec")
  private TextSpec textSpec = null;

  @SerializedName("app_download_spec")
  private CanvasAppDownloadSpecType appDownloadSpec = null;

  @SerializedName("weapp_spec")
  private WeappSpec weappSpec = null;

  @SerializedName("gh_spec")
  private GhSpec ghSpec = null;

  @SerializedName("enterprise_wx_spec")
  private EnterpriseWxSpec enterpriseWxSpec = null;

  @SerializedName("image_text_spec")
  private ImageTextSpec imageTextSpec = null;

  public PageElementsSpecListStruct elementType(CanvasPageElementType elementType) {
    this.elementType = elementType;
    return this;
  }

  /**
   * Get elementType
   *
   * @return elementType
   */
  @ApiModelProperty(value = "")
  public CanvasPageElementType getElementType() {
    return elementType;
  }

  public void setElementType(CanvasPageElementType elementType) {
    this.elementType = elementType;
  }

  public PageElementsSpecListStruct topImageSpec(TopImageSpec topImageSpec) {
    this.topImageSpec = topImageSpec;
    return this;
  }

  /**
   * Get topImageSpec
   *
   * @return topImageSpec
   */
  @ApiModelProperty(value = "")
  public TopImageSpec getTopImageSpec() {
    return topImageSpec;
  }

  public void setTopImageSpec(TopImageSpec topImageSpec) {
    this.topImageSpec = topImageSpec;
  }

  public PageElementsSpecListStruct topSliderSpec(TopSliderSpec topSliderSpec) {
    this.topSliderSpec = topSliderSpec;
    return this;
  }

  /**
   * Get topSliderSpec
   *
   * @return topSliderSpec
   */
  @ApiModelProperty(value = "")
  public TopSliderSpec getTopSliderSpec() {
    return topSliderSpec;
  }

  public void setTopSliderSpec(TopSliderSpec topSliderSpec) {
    this.topSliderSpec = topSliderSpec;
  }

  public PageElementsSpecListStruct topVideoSpec(TopVideoSpec topVideoSpec) {
    this.topVideoSpec = topVideoSpec;
    return this;
  }

  /**
   * Get topVideoSpec
   *
   * @return topVideoSpec
   */
  @ApiModelProperty(value = "")
  public TopVideoSpec getTopVideoSpec() {
    return topVideoSpec;
  }

  public void setTopVideoSpec(TopVideoSpec topVideoSpec) {
    this.topVideoSpec = topVideoSpec;
  }

  public PageElementsSpecListStruct imageSpec(ImageSpec imageSpec) {
    this.imageSpec = imageSpec;
    return this;
  }

  /**
   * Get imageSpec
   *
   * @return imageSpec
   */
  @ApiModelProperty(value = "")
  public ImageSpec getImageSpec() {
    return imageSpec;
  }

  public void setImageSpec(ImageSpec imageSpec) {
    this.imageSpec = imageSpec;
  }

  public PageElementsSpecListStruct sliderSpec(SliderSpec sliderSpec) {
    this.sliderSpec = sliderSpec;
    return this;
  }

  /**
   * Get sliderSpec
   *
   * @return sliderSpec
   */
  @ApiModelProperty(value = "")
  public SliderSpec getSliderSpec() {
    return sliderSpec;
  }

  public void setSliderSpec(SliderSpec sliderSpec) {
    this.sliderSpec = sliderSpec;
  }

  public PageElementsSpecListStruct videoSpec(VideoSpec videoSpec) {
    this.videoSpec = videoSpec;
    return this;
  }

  /**
   * Get videoSpec
   *
   * @return videoSpec
   */
  @ApiModelProperty(value = "")
  public VideoSpec getVideoSpec() {
    return videoSpec;
  }

  public void setVideoSpec(VideoSpec videoSpec) {
    this.videoSpec = videoSpec;
  }

  public PageElementsSpecListStruct textSpec(TextSpec textSpec) {
    this.textSpec = textSpec;
    return this;
  }

  /**
   * Get textSpec
   *
   * @return textSpec
   */
  @ApiModelProperty(value = "")
  public TextSpec getTextSpec() {
    return textSpec;
  }

  public void setTextSpec(TextSpec textSpec) {
    this.textSpec = textSpec;
  }

  public PageElementsSpecListStruct appDownloadSpec(CanvasAppDownloadSpecType appDownloadSpec) {
    this.appDownloadSpec = appDownloadSpec;
    return this;
  }

  /**
   * Get appDownloadSpec
   *
   * @return appDownloadSpec
   */
  @ApiModelProperty(value = "")
  public CanvasAppDownloadSpecType getAppDownloadSpec() {
    return appDownloadSpec;
  }

  public void setAppDownloadSpec(CanvasAppDownloadSpecType appDownloadSpec) {
    this.appDownloadSpec = appDownloadSpec;
  }

  public PageElementsSpecListStruct weappSpec(WeappSpec weappSpec) {
    this.weappSpec = weappSpec;
    return this;
  }

  /**
   * Get weappSpec
   *
   * @return weappSpec
   */
  @ApiModelProperty(value = "")
  public WeappSpec getWeappSpec() {
    return weappSpec;
  }

  public void setWeappSpec(WeappSpec weappSpec) {
    this.weappSpec = weappSpec;
  }

  public PageElementsSpecListStruct ghSpec(GhSpec ghSpec) {
    this.ghSpec = ghSpec;
    return this;
  }

  /**
   * Get ghSpec
   *
   * @return ghSpec
   */
  @ApiModelProperty(value = "")
  public GhSpec getGhSpec() {
    return ghSpec;
  }

  public void setGhSpec(GhSpec ghSpec) {
    this.ghSpec = ghSpec;
  }

  public PageElementsSpecListStruct enterpriseWxSpec(EnterpriseWxSpec enterpriseWxSpec) {
    this.enterpriseWxSpec = enterpriseWxSpec;
    return this;
  }

  /**
   * Get enterpriseWxSpec
   *
   * @return enterpriseWxSpec
   */
  @ApiModelProperty(value = "")
  public EnterpriseWxSpec getEnterpriseWxSpec() {
    return enterpriseWxSpec;
  }

  public void setEnterpriseWxSpec(EnterpriseWxSpec enterpriseWxSpec) {
    this.enterpriseWxSpec = enterpriseWxSpec;
  }

  public PageElementsSpecListStruct imageTextSpec(ImageTextSpec imageTextSpec) {
    this.imageTextSpec = imageTextSpec;
    return this;
  }

  /**
   * Get imageTextSpec
   *
   * @return imageTextSpec
   */
  @ApiModelProperty(value = "")
  public ImageTextSpec getImageTextSpec() {
    return imageTextSpec;
  }

  public void setImageTextSpec(ImageTextSpec imageTextSpec) {
    this.imageTextSpec = imageTextSpec;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageElementsSpecListStruct pageElementsSpecListStruct = (PageElementsSpecListStruct) o;
    return Objects.equals(this.elementType, pageElementsSpecListStruct.elementType)
        && Objects.equals(this.topImageSpec, pageElementsSpecListStruct.topImageSpec)
        && Objects.equals(this.topSliderSpec, pageElementsSpecListStruct.topSliderSpec)
        && Objects.equals(this.topVideoSpec, pageElementsSpecListStruct.topVideoSpec)
        && Objects.equals(this.imageSpec, pageElementsSpecListStruct.imageSpec)
        && Objects.equals(this.sliderSpec, pageElementsSpecListStruct.sliderSpec)
        && Objects.equals(this.videoSpec, pageElementsSpecListStruct.videoSpec)
        && Objects.equals(this.textSpec, pageElementsSpecListStruct.textSpec)
        && Objects.equals(this.appDownloadSpec, pageElementsSpecListStruct.appDownloadSpec)
        && Objects.equals(this.weappSpec, pageElementsSpecListStruct.weappSpec)
        && Objects.equals(this.ghSpec, pageElementsSpecListStruct.ghSpec)
        && Objects.equals(this.enterpriseWxSpec, pageElementsSpecListStruct.enterpriseWxSpec)
        && Objects.equals(this.imageTextSpec, pageElementsSpecListStruct.imageTextSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        elementType,
        topImageSpec,
        topSliderSpec,
        topVideoSpec,
        imageSpec,
        sliderSpec,
        videoSpec,
        textSpec,
        appDownloadSpec,
        weappSpec,
        ghSpec,
        enterpriseWxSpec,
        imageTextSpec);
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
