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
public class PagesGetListStruct {
  @SerializedName("page_type")
  private PageType pageType = null;

  @SerializedName("page_id")
  private Long pageId = null;

  @SerializedName("page_name")
  private String pageName = null;

  @SerializedName("page_url")
  private String pageUrl = null;

  @SerializedName("page_status")
  private PageStatus pageStatus = null;

  @SerializedName("owner_account_id")
  private Long ownerAccountId = null;

  @SerializedName("created_time")
  private Long createdTime = null;

  @SerializedName("last_modified_time")
  private Long lastModifiedTime = null;

  @SerializedName("disable_code")
  private Long disableCode = null;

  @SerializedName("disable_message")
  private String disableMessage = null;

  public PagesGetListStruct pageType(PageType pageType) {
    this.pageType = pageType;
    return this;
  }

  /**
   * Get pageType
   *
   * @return pageType
   */
  @ApiModelProperty(value = "")
  public PageType getPageType() {
    return pageType;
  }

  public void setPageType(PageType pageType) {
    this.pageType = pageType;
  }

  public PagesGetListStruct pageId(Long pageId) {
    this.pageId = pageId;
    return this;
  }

  /**
   * Get pageId
   *
   * @return pageId
   */
  @ApiModelProperty(value = "")
  public Long getPageId() {
    return pageId;
  }

  public void setPageId(Long pageId) {
    this.pageId = pageId;
  }

  public PagesGetListStruct pageName(String pageName) {
    this.pageName = pageName;
    return this;
  }

  /**
   * Get pageName
   *
   * @return pageName
   */
  @ApiModelProperty(value = "")
  public String getPageName() {
    return pageName;
  }

  public void setPageName(String pageName) {
    this.pageName = pageName;
  }

  public PagesGetListStruct pageUrl(String pageUrl) {
    this.pageUrl = pageUrl;
    return this;
  }

  /**
   * Get pageUrl
   *
   * @return pageUrl
   */
  @ApiModelProperty(value = "")
  public String getPageUrl() {
    return pageUrl;
  }

  public void setPageUrl(String pageUrl) {
    this.pageUrl = pageUrl;
  }

  public PagesGetListStruct pageStatus(PageStatus pageStatus) {
    this.pageStatus = pageStatus;
    return this;
  }

  /**
   * Get pageStatus
   *
   * @return pageStatus
   */
  @ApiModelProperty(value = "")
  public PageStatus getPageStatus() {
    return pageStatus;
  }

  public void setPageStatus(PageStatus pageStatus) {
    this.pageStatus = pageStatus;
  }

  public PagesGetListStruct ownerAccountId(Long ownerAccountId) {
    this.ownerAccountId = ownerAccountId;
    return this;
  }

  /**
   * Get ownerAccountId
   *
   * @return ownerAccountId
   */
  @ApiModelProperty(value = "")
  public Long getOwnerAccountId() {
    return ownerAccountId;
  }

  public void setOwnerAccountId(Long ownerAccountId) {
    this.ownerAccountId = ownerAccountId;
  }

  public PagesGetListStruct createdTime(Long createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   *
   * @return createdTime
   */
  @ApiModelProperty(value = "")
  public Long getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Long createdTime) {
    this.createdTime = createdTime;
  }

  public PagesGetListStruct lastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  /**
   * Get lastModifiedTime
   *
   * @return lastModifiedTime
   */
  @ApiModelProperty(value = "")
  public Long getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public PagesGetListStruct disableCode(Long disableCode) {
    this.disableCode = disableCode;
    return this;
  }

  /**
   * Get disableCode
   *
   * @return disableCode
   */
  @ApiModelProperty(value = "")
  public Long getDisableCode() {
    return disableCode;
  }

  public void setDisableCode(Long disableCode) {
    this.disableCode = disableCode;
  }

  public PagesGetListStruct disableMessage(String disableMessage) {
    this.disableMessage = disableMessage;
    return this;
  }

  /**
   * Get disableMessage
   *
   * @return disableMessage
   */
  @ApiModelProperty(value = "")
  public String getDisableMessage() {
    return disableMessage;
  }

  public void setDisableMessage(String disableMessage) {
    this.disableMessage = disableMessage;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagesGetListStruct pagesGetListStruct = (PagesGetListStruct) o;
    return Objects.equals(this.pageType, pagesGetListStruct.pageType)
        && Objects.equals(this.pageId, pagesGetListStruct.pageId)
        && Objects.equals(this.pageName, pagesGetListStruct.pageName)
        && Objects.equals(this.pageUrl, pagesGetListStruct.pageUrl)
        && Objects.equals(this.pageStatus, pagesGetListStruct.pageStatus)
        && Objects.equals(this.ownerAccountId, pagesGetListStruct.ownerAccountId)
        && Objects.equals(this.createdTime, pagesGetListStruct.createdTime)
        && Objects.equals(this.lastModifiedTime, pagesGetListStruct.lastModifiedTime)
        && Objects.equals(this.disableCode, pagesGetListStruct.disableCode)
        && Objects.equals(this.disableMessage, pagesGetListStruct.disableMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        pageType,
        pageId,
        pageName,
        pageUrl,
        pageStatus,
        ownerAccountId,
        createdTime,
        lastModifiedTime,
        disableCode,
        disableMessage);
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
