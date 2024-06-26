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

/** 返回结构 */
@ApiModel(description = "返回结构")
public class DynamicAdImagesGetListStruct {
  @SerializedName("image_id")
  private String imageId = null;

  @SerializedName("dynamic_ad_template_id")
  private Long dynamicAdTemplateId = null;

  @SerializedName("width")
  private Long width = null;

  @SerializedName("height")
  private Long height = null;

  @SerializedName("sample_image_url")
  private String sampleImageUrl = null;

  public DynamicAdImagesGetListStruct imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

  /**
   * Get imageId
   *
   * @return imageId
   */
  @ApiModelProperty(value = "")
  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public DynamicAdImagesGetListStruct dynamicAdTemplateId(Long dynamicAdTemplateId) {
    this.dynamicAdTemplateId = dynamicAdTemplateId;
    return this;
  }

  /**
   * Get dynamicAdTemplateId
   *
   * @return dynamicAdTemplateId
   */
  @ApiModelProperty(value = "")
  public Long getDynamicAdTemplateId() {
    return dynamicAdTemplateId;
  }

  public void setDynamicAdTemplateId(Long dynamicAdTemplateId) {
    this.dynamicAdTemplateId = dynamicAdTemplateId;
  }

  public DynamicAdImagesGetListStruct width(Long width) {
    this.width = width;
    return this;
  }

  /**
   * Get width
   *
   * @return width
   */
  @ApiModelProperty(value = "")
  public Long getWidth() {
    return width;
  }

  public void setWidth(Long width) {
    this.width = width;
  }

  public DynamicAdImagesGetListStruct height(Long height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   *
   * @return height
   */
  @ApiModelProperty(value = "")
  public Long getHeight() {
    return height;
  }

  public void setHeight(Long height) {
    this.height = height;
  }

  public DynamicAdImagesGetListStruct sampleImageUrl(String sampleImageUrl) {
    this.sampleImageUrl = sampleImageUrl;
    return this;
  }

  /**
   * Get sampleImageUrl
   *
   * @return sampleImageUrl
   */
  @ApiModelProperty(value = "")
  public String getSampleImageUrl() {
    return sampleImageUrl;
  }

  public void setSampleImageUrl(String sampleImageUrl) {
    this.sampleImageUrl = sampleImageUrl;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicAdImagesGetListStruct dynamicAdImagesGetListStruct = (DynamicAdImagesGetListStruct) o;
    return Objects.equals(this.imageId, dynamicAdImagesGetListStruct.imageId)
        && Objects.equals(
            this.dynamicAdTemplateId, dynamicAdImagesGetListStruct.dynamicAdTemplateId)
        && Objects.equals(this.width, dynamicAdImagesGetListStruct.width)
        && Objects.equals(this.height, dynamicAdImagesGetListStruct.height)
        && Objects.equals(this.sampleImageUrl, dynamicAdImagesGetListStruct.sampleImageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageId, dynamicAdTemplateId, width, height, sampleImageUrl);
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
