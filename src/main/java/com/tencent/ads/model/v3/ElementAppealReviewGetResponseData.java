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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ElementAppealReviewGetResponseData */
public class ElementAppealReviewGetResponseData {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("dynamic_creative_id")
  private Long dynamicCreativeId = null;

  @SerializedName("component_id")
  private Long componentId = null;

  @SerializedName("element_id")
  private Long elementId = null;

  @SerializedName("element_type")
  private ReviewElementType elementType = null;

  @SerializedName("element_value")
  private String elementValue = null;

  @SerializedName("element_finger_print")
  private String elementFingerPrint = null;

  @SerializedName("appeal_demand")
  private String appealDemand = null;

  @SerializedName("appeal_reason")
  private String appealReason = null;

  @SerializedName("history_approval_component_id")
  private Long historyApprovalComponentId = null;

  @SerializedName("appeal_result")
  private String appealResult = null;

  @SerializedName("appeal_status")
  private AppealStatus appealStatus = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("image_list")
  private List<String> imageList = null;

  @SerializedName("reply_image_url_list")
  private List<String> replyImageUrlList = null;

  public ElementAppealReviewGetResponseData accountId(Long accountId) {
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

  public ElementAppealReviewGetResponseData dynamicCreativeId(Long dynamicCreativeId) {
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

  public ElementAppealReviewGetResponseData componentId(Long componentId) {
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

  public ElementAppealReviewGetResponseData elementId(Long elementId) {
    this.elementId = elementId;
    return this;
  }

  /**
   * Get elementId
   *
   * @return elementId
   */
  @ApiModelProperty(value = "")
  public Long getElementId() {
    return elementId;
  }

  public void setElementId(Long elementId) {
    this.elementId = elementId;
  }

  public ElementAppealReviewGetResponseData elementType(ReviewElementType elementType) {
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

  public ElementAppealReviewGetResponseData elementValue(String elementValue) {
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

  public ElementAppealReviewGetResponseData elementFingerPrint(String elementFingerPrint) {
    this.elementFingerPrint = elementFingerPrint;
    return this;
  }

  /**
   * Get elementFingerPrint
   *
   * @return elementFingerPrint
   */
  @ApiModelProperty(value = "")
  public String getElementFingerPrint() {
    return elementFingerPrint;
  }

  public void setElementFingerPrint(String elementFingerPrint) {
    this.elementFingerPrint = elementFingerPrint;
  }

  public ElementAppealReviewGetResponseData appealDemand(String appealDemand) {
    this.appealDemand = appealDemand;
    return this;
  }

  /**
   * Get appealDemand
   *
   * @return appealDemand
   */
  @ApiModelProperty(value = "")
  public String getAppealDemand() {
    return appealDemand;
  }

  public void setAppealDemand(String appealDemand) {
    this.appealDemand = appealDemand;
  }

  public ElementAppealReviewGetResponseData appealReason(String appealReason) {
    this.appealReason = appealReason;
    return this;
  }

  /**
   * Get appealReason
   *
   * @return appealReason
   */
  @ApiModelProperty(value = "")
  public String getAppealReason() {
    return appealReason;
  }

  public void setAppealReason(String appealReason) {
    this.appealReason = appealReason;
  }

  public ElementAppealReviewGetResponseData historyApprovalComponentId(
      Long historyApprovalComponentId) {
    this.historyApprovalComponentId = historyApprovalComponentId;
    return this;
  }

  /**
   * Get historyApprovalComponentId
   *
   * @return historyApprovalComponentId
   */
  @ApiModelProperty(value = "")
  public Long getHistoryApprovalComponentId() {
    return historyApprovalComponentId;
  }

  public void setHistoryApprovalComponentId(Long historyApprovalComponentId) {
    this.historyApprovalComponentId = historyApprovalComponentId;
  }

  public ElementAppealReviewGetResponseData appealResult(String appealResult) {
    this.appealResult = appealResult;
    return this;
  }

  /**
   * Get appealResult
   *
   * @return appealResult
   */
  @ApiModelProperty(value = "")
  public String getAppealResult() {
    return appealResult;
  }

  public void setAppealResult(String appealResult) {
    this.appealResult = appealResult;
  }

  public ElementAppealReviewGetResponseData appealStatus(AppealStatus appealStatus) {
    this.appealStatus = appealStatus;
    return this;
  }

  /**
   * Get appealStatus
   *
   * @return appealStatus
   */
  @ApiModelProperty(value = "")
  public AppealStatus getAppealStatus() {
    return appealStatus;
  }

  public void setAppealStatus(AppealStatus appealStatus) {
    this.appealStatus = appealStatus;
  }

  public ElementAppealReviewGetResponseData description(String description) {
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

  public ElementAppealReviewGetResponseData imageList(List<String> imageList) {
    this.imageList = imageList;
    return this;
  }

  public ElementAppealReviewGetResponseData addImageListItem(String imageListItem) {
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

  public ElementAppealReviewGetResponseData replyImageUrlList(List<String> replyImageUrlList) {
    this.replyImageUrlList = replyImageUrlList;
    return this;
  }

  public ElementAppealReviewGetResponseData addReplyImageUrlListItem(String replyImageUrlListItem) {
    if (this.replyImageUrlList == null) {
      this.replyImageUrlList = new ArrayList<String>();
    }
    this.replyImageUrlList.add(replyImageUrlListItem);
    return this;
  }

  /**
   * Get replyImageUrlList
   *
   * @return replyImageUrlList
   */
  @ApiModelProperty(value = "")
  public List<String> getReplyImageUrlList() {
    return replyImageUrlList;
  }

  public void setReplyImageUrlList(List<String> replyImageUrlList) {
    this.replyImageUrlList = replyImageUrlList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElementAppealReviewGetResponseData elementAppealReviewGetResponseData =
        (ElementAppealReviewGetResponseData) o;
    return Objects.equals(this.accountId, elementAppealReviewGetResponseData.accountId)
        && Objects.equals(
            this.dynamicCreativeId, elementAppealReviewGetResponseData.dynamicCreativeId)
        && Objects.equals(this.componentId, elementAppealReviewGetResponseData.componentId)
        && Objects.equals(this.elementId, elementAppealReviewGetResponseData.elementId)
        && Objects.equals(this.elementType, elementAppealReviewGetResponseData.elementType)
        && Objects.equals(this.elementValue, elementAppealReviewGetResponseData.elementValue)
        && Objects.equals(
            this.elementFingerPrint, elementAppealReviewGetResponseData.elementFingerPrint)
        && Objects.equals(this.appealDemand, elementAppealReviewGetResponseData.appealDemand)
        && Objects.equals(this.appealReason, elementAppealReviewGetResponseData.appealReason)
        && Objects.equals(
            this.historyApprovalComponentId,
            elementAppealReviewGetResponseData.historyApprovalComponentId)
        && Objects.equals(this.appealResult, elementAppealReviewGetResponseData.appealResult)
        && Objects.equals(this.appealStatus, elementAppealReviewGetResponseData.appealStatus)
        && Objects.equals(this.description, elementAppealReviewGetResponseData.description)
        && Objects.equals(this.imageList, elementAppealReviewGetResponseData.imageList)
        && Objects.equals(
            this.replyImageUrlList, elementAppealReviewGetResponseData.replyImageUrlList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        dynamicCreativeId,
        componentId,
        elementId,
        elementType,
        elementValue,
        elementFingerPrint,
        appealDemand,
        appealReason,
        historyApprovalComponentId,
        appealResult,
        appealStatus,
        description,
        imageList,
        replyImageUrlList);
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
