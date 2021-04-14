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

/** 落地页配置结构 */
@ApiModel(description = "落地页配置结构")
public class XijingPageAddPagesStruct {
  @SerializedName("page_type")
  private TemplatesPageType pageType = null;

  @SerializedName("page_name")
  private String pageName = null;

  @SerializedName("page_title")
  private String pageTitle = null;

  @SerializedName("clipboard")
  private String clipboard = null;

  @SerializedName("mobile_app_id")
  private String mobileAppId = null;

  @SerializedName("page_template_id")
  private String pageTemplateId = null;

  @SerializedName("component_spec_list")
  private List<String> componentSpecList = null;

  public XijingPageAddPagesStruct pageType(TemplatesPageType pageType) {
    this.pageType = pageType;
    return this;
  }

  /**
   * Get pageType
   *
   * @return pageType
   */
  @ApiModelProperty(value = "")
  public TemplatesPageType getPageType() {
    return pageType;
  }

  public void setPageType(TemplatesPageType pageType) {
    this.pageType = pageType;
  }

  public XijingPageAddPagesStruct pageName(String pageName) {
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

  public XijingPageAddPagesStruct pageTitle(String pageTitle) {
    this.pageTitle = pageTitle;
    return this;
  }

  /**
   * Get pageTitle
   *
   * @return pageTitle
   */
  @ApiModelProperty(value = "")
  public String getPageTitle() {
    return pageTitle;
  }

  public void setPageTitle(String pageTitle) {
    this.pageTitle = pageTitle;
  }

  public XijingPageAddPagesStruct clipboard(String clipboard) {
    this.clipboard = clipboard;
    return this;
  }

  /**
   * Get clipboard
   *
   * @return clipboard
   */
  @ApiModelProperty(value = "")
  public String getClipboard() {
    return clipboard;
  }

  public void setClipboard(String clipboard) {
    this.clipboard = clipboard;
  }

  public XijingPageAddPagesStruct mobileAppId(String mobileAppId) {
    this.mobileAppId = mobileAppId;
    return this;
  }

  /**
   * Get mobileAppId
   *
   * @return mobileAppId
   */
  @ApiModelProperty(value = "")
  public String getMobileAppId() {
    return mobileAppId;
  }

  public void setMobileAppId(String mobileAppId) {
    this.mobileAppId = mobileAppId;
  }

  public XijingPageAddPagesStruct pageTemplateId(String pageTemplateId) {
    this.pageTemplateId = pageTemplateId;
    return this;
  }

  /**
   * Get pageTemplateId
   *
   * @return pageTemplateId
   */
  @ApiModelProperty(value = "")
  public String getPageTemplateId() {
    return pageTemplateId;
  }

  public void setPageTemplateId(String pageTemplateId) {
    this.pageTemplateId = pageTemplateId;
  }

  public XijingPageAddPagesStruct componentSpecList(List<String> componentSpecList) {
    this.componentSpecList = componentSpecList;
    return this;
  }

  public XijingPageAddPagesStruct addComponentSpecListItem(String componentSpecListItem) {
    if (this.componentSpecList == null) {
      this.componentSpecList = new ArrayList<String>();
    }
    this.componentSpecList.add(componentSpecListItem);
    return this;
  }

  /**
   * Get componentSpecList
   *
   * @return componentSpecList
   */
  @ApiModelProperty(value = "")
  public List<String> getComponentSpecList() {
    return componentSpecList;
  }

  public void setComponentSpecList(List<String> componentSpecList) {
    this.componentSpecList = componentSpecList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XijingPageAddPagesStruct xijingPageAddPagesStruct = (XijingPageAddPagesStruct) o;
    return Objects.equals(this.pageType, xijingPageAddPagesStruct.pageType)
        && Objects.equals(this.pageName, xijingPageAddPagesStruct.pageName)
        && Objects.equals(this.pageTitle, xijingPageAddPagesStruct.pageTitle)
        && Objects.equals(this.clipboard, xijingPageAddPagesStruct.clipboard)
        && Objects.equals(this.mobileAppId, xijingPageAddPagesStruct.mobileAppId)
        && Objects.equals(this.pageTemplateId, xijingPageAddPagesStruct.pageTemplateId)
        && Objects.equals(this.componentSpecList, xijingPageAddPagesStruct.componentSpecList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        pageType, pageName, pageTitle, clipboard, mobileAppId, pageTemplateId, componentSpecList);
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
