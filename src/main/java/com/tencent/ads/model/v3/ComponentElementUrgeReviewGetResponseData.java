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

/** ComponentElementUrgeReviewGetResponseData */
public class ComponentElementUrgeReviewGetResponseData {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("dynamic_creative_id")
  private Long dynamicCreativeId = null;

  @SerializedName("component_urge_info_list")
  private List<ComponentUrgeInfo> componentUrgeInfoList = null;

  @SerializedName("element_urge_info_list")
  private List<ElementUrgeInfo> elementUrgeInfoList = null;

  public ComponentElementUrgeReviewGetResponseData accountId(Long accountId) {
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

  public ComponentElementUrgeReviewGetResponseData dynamicCreativeId(Long dynamicCreativeId) {
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

  public ComponentElementUrgeReviewGetResponseData componentUrgeInfoList(
      List<ComponentUrgeInfo> componentUrgeInfoList) {
    this.componentUrgeInfoList = componentUrgeInfoList;
    return this;
  }

  public ComponentElementUrgeReviewGetResponseData addComponentUrgeInfoListItem(
      ComponentUrgeInfo componentUrgeInfoListItem) {
    if (this.componentUrgeInfoList == null) {
      this.componentUrgeInfoList = new ArrayList<ComponentUrgeInfo>();
    }
    this.componentUrgeInfoList.add(componentUrgeInfoListItem);
    return this;
  }

  /**
   * Get componentUrgeInfoList
   *
   * @return componentUrgeInfoList
   */
  @ApiModelProperty(value = "")
  public List<ComponentUrgeInfo> getComponentUrgeInfoList() {
    return componentUrgeInfoList;
  }

  public void setComponentUrgeInfoList(List<ComponentUrgeInfo> componentUrgeInfoList) {
    this.componentUrgeInfoList = componentUrgeInfoList;
  }

  public ComponentElementUrgeReviewGetResponseData elementUrgeInfoList(
      List<ElementUrgeInfo> elementUrgeInfoList) {
    this.elementUrgeInfoList = elementUrgeInfoList;
    return this;
  }

  public ComponentElementUrgeReviewGetResponseData addElementUrgeInfoListItem(
      ElementUrgeInfo elementUrgeInfoListItem) {
    if (this.elementUrgeInfoList == null) {
      this.elementUrgeInfoList = new ArrayList<ElementUrgeInfo>();
    }
    this.elementUrgeInfoList.add(elementUrgeInfoListItem);
    return this;
  }

  /**
   * Get elementUrgeInfoList
   *
   * @return elementUrgeInfoList
   */
  @ApiModelProperty(value = "")
  public List<ElementUrgeInfo> getElementUrgeInfoList() {
    return elementUrgeInfoList;
  }

  public void setElementUrgeInfoList(List<ElementUrgeInfo> elementUrgeInfoList) {
    this.elementUrgeInfoList = elementUrgeInfoList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentElementUrgeReviewGetResponseData componentElementUrgeReviewGetResponseData =
        (ComponentElementUrgeReviewGetResponseData) o;
    return Objects.equals(this.accountId, componentElementUrgeReviewGetResponseData.accountId)
        && Objects.equals(
            this.dynamicCreativeId, componentElementUrgeReviewGetResponseData.dynamicCreativeId)
        && Objects.equals(
            this.componentUrgeInfoList,
            componentElementUrgeReviewGetResponseData.componentUrgeInfoList)
        && Objects.equals(
            this.elementUrgeInfoList,
            componentElementUrgeReviewGetResponseData.elementUrgeInfoList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, dynamicCreativeId, componentUrgeInfoList, elementUrgeInfoList);
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
