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

/** ElementAppealReviewAddRequest */
public class ElementAppealReviewAddRequest {
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

  @SerializedName("description")
  private String description = null;

  @SerializedName("image_list")
  private List<String> imageList = null;

  public ElementAppealReviewAddRequest accountId(Long accountId) {
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

  public ElementAppealReviewAddRequest dynamicCreativeId(Long dynamicCreativeId) {
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

  public ElementAppealReviewAddRequest componentId(Long componentId) {
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

  public ElementAppealReviewAddRequest elementId(Long elementId) {
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

  public ElementAppealReviewAddRequest elementType(ReviewElementType elementType) {
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

  public ElementAppealReviewAddRequest elementValue(String elementValue) {
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

  public ElementAppealReviewAddRequest elementFingerPrint(String elementFingerPrint) {
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

  public ElementAppealReviewAddRequest appealDemand(String appealDemand) {
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

  public ElementAppealReviewAddRequest appealReason(String appealReason) {
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

  public ElementAppealReviewAddRequest historyApprovalComponentId(Long historyApprovalComponentId) {
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

  public ElementAppealReviewAddRequest description(String description) {
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

  public ElementAppealReviewAddRequest imageList(List<String> imageList) {
    this.imageList = imageList;
    return this;
  }

  public ElementAppealReviewAddRequest addImageListItem(String imageListItem) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElementAppealReviewAddRequest elementAppealReviewAddRequest = (ElementAppealReviewAddRequest) o;
    return Objects.equals(this.accountId, elementAppealReviewAddRequest.accountId)
        && Objects.equals(this.dynamicCreativeId, elementAppealReviewAddRequest.dynamicCreativeId)
        && Objects.equals(this.componentId, elementAppealReviewAddRequest.componentId)
        && Objects.equals(this.elementId, elementAppealReviewAddRequest.elementId)
        && Objects.equals(this.elementType, elementAppealReviewAddRequest.elementType)
        && Objects.equals(this.elementValue, elementAppealReviewAddRequest.elementValue)
        && Objects.equals(this.elementFingerPrint, elementAppealReviewAddRequest.elementFingerPrint)
        && Objects.equals(this.appealDemand, elementAppealReviewAddRequest.appealDemand)
        && Objects.equals(this.appealReason, elementAppealReviewAddRequest.appealReason)
        && Objects.equals(
            this.historyApprovalComponentId,
            elementAppealReviewAddRequest.historyApprovalComponentId)
        && Objects.equals(this.description, elementAppealReviewAddRequest.description)
        && Objects.equals(this.imageList, elementAppealReviewAddRequest.imageList);
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
        description,
        imageList);
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
