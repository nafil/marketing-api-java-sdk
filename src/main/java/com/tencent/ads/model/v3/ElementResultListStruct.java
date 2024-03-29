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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 元素粒度审核结果 */
@ApiModel(description = "元素粒度审核结果")
public class ElementResultListStruct {
  @SerializedName("image_id")
  private String imageId = null;

  @SerializedName("video_id")
  private String videoId = null;

  @SerializedName("element_name")
  private String elementName = null;

  @SerializedName("element_value")
  private String elementValue = null;

  @SerializedName("component_info")
  private ComponentInfoCanEmpty componentInfo = null;

  @SerializedName("element_type")
  private ReviewElementType elementType = null;

  @SerializedName("review_status")
  private ReviewResultStatus reviewStatus = null;

  @SerializedName("element_reject_detail_info")
  private List<ComponentElementRejectDetailInfoListStruct> elementRejectDetailInfo = null;

  public ElementResultListStruct imageId(String imageId) {
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

  public ElementResultListStruct videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

  /**
   * Get videoId
   *
   * @return videoId
   */
  @ApiModelProperty(value = "")
  public String getVideoId() {
    return videoId;
  }

  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }

  public ElementResultListStruct elementName(String elementName) {
    this.elementName = elementName;
    return this;
  }

  /**
   * Get elementName
   *
   * @return elementName
   */
  @ApiModelProperty(value = "")
  public String getElementName() {
    return elementName;
  }

  public void setElementName(String elementName) {
    this.elementName = elementName;
  }

  public ElementResultListStruct elementValue(String elementValue) {
    this.elementValue = elementValue;
    return this;
  }

  /**
   * Get elementValue
   *
   * @return elementValue
   */
  @ApiModelProperty(value = "")
  public String getElementValue() {
    return elementValue;
  }

  public void setElementValue(String elementValue) {
    this.elementValue = elementValue;
  }

  public ElementResultListStruct componentInfo(ComponentInfoCanEmpty componentInfo) {
    this.componentInfo = componentInfo;
    return this;
  }

  /**
   * Get componentInfo
   *
   * @return componentInfo
   */
  @ApiModelProperty(value = "")
  public ComponentInfoCanEmpty getComponentInfo() {
    return componentInfo;
  }

  public void setComponentInfo(ComponentInfoCanEmpty componentInfo) {
    this.componentInfo = componentInfo;
  }

  public ElementResultListStruct elementType(ReviewElementType elementType) {
    this.elementType = elementType;
    return this;
  }

  /**
   * Get elementType
   *
   * @return elementType
   */
  @ApiModelProperty(value = "")
  public ReviewElementType getElementType() {
    return elementType;
  }

  public void setElementType(ReviewElementType elementType) {
    this.elementType = elementType;
  }

  public ElementResultListStruct reviewStatus(ReviewResultStatus reviewStatus) {
    this.reviewStatus = reviewStatus;
    return this;
  }

  /**
   * Get reviewStatus
   *
   * @return reviewStatus
   */
  @ApiModelProperty(value = "")
  public ReviewResultStatus getReviewStatus() {
    return reviewStatus;
  }

  public void setReviewStatus(ReviewResultStatus reviewStatus) {
    this.reviewStatus = reviewStatus;
  }

  public ElementResultListStruct elementRejectDetailInfo(
      List<ComponentElementRejectDetailInfoListStruct> elementRejectDetailInfo) {
    this.elementRejectDetailInfo = elementRejectDetailInfo;
    return this;
  }

  public ElementResultListStruct addElementRejectDetailInfoItem(
      ComponentElementRejectDetailInfoListStruct elementRejectDetailInfoItem) {
    if (this.elementRejectDetailInfo == null) {
      this.elementRejectDetailInfo = new ArrayList<ComponentElementRejectDetailInfoListStruct>();
    }
    this.elementRejectDetailInfo.add(elementRejectDetailInfoItem);
    return this;
  }

  /**
   * Get elementRejectDetailInfo
   *
   * @return elementRejectDetailInfo
   */
  @ApiModelProperty(value = "")
  public List<ComponentElementRejectDetailInfoListStruct> getElementRejectDetailInfo() {
    return elementRejectDetailInfo;
  }

  public void setElementRejectDetailInfo(
      List<ComponentElementRejectDetailInfoListStruct> elementRejectDetailInfo) {
    this.elementRejectDetailInfo = elementRejectDetailInfo;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElementResultListStruct elementResultListStruct = (ElementResultListStruct) o;
    return Objects.equals(this.imageId, elementResultListStruct.imageId)
        && Objects.equals(this.videoId, elementResultListStruct.videoId)
        && Objects.equals(this.elementName, elementResultListStruct.elementName)
        && Objects.equals(this.elementValue, elementResultListStruct.elementValue)
        && Objects.equals(this.componentInfo, elementResultListStruct.componentInfo)
        && Objects.equals(this.elementType, elementResultListStruct.elementType)
        && Objects.equals(this.reviewStatus, elementResultListStruct.reviewStatus)
        && Objects.equals(
            this.elementRejectDetailInfo, elementResultListStruct.elementRejectDetailInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        imageId,
        videoId,
        elementName,
        elementValue,
        componentInfo,
        elementType,
        reviewStatus,
        elementRejectDetailInfo);
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
