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

/** XijingComplexTemplateGetResponseData */
public class XijingComplexTemplateGetResponseData {
  @SerializedName("page_template_id")
  private String pageTemplateId = null;

  @SerializedName("page_template_name")
  private String pageTemplateName = null;

  @SerializedName("page_template_cover_url")
  private String pageTemplateCoverUrl = null;

  @SerializedName("page_name")
  private String pageName = null;

  @SerializedName("page_title")
  private String pageTitle = null;

  @SerializedName("page_config")
  private List<XjConfigStruct> pageConfig = null;

  public XijingComplexTemplateGetResponseData pageTemplateId(String pageTemplateId) {
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

  public XijingComplexTemplateGetResponseData pageTemplateName(String pageTemplateName) {
    this.pageTemplateName = pageTemplateName;
    return this;
  }

  /**
   * Get pageTemplateName
   *
   * @return pageTemplateName
   */
  @ApiModelProperty(value = "")
  public String getPageTemplateName() {
    return pageTemplateName;
  }

  public void setPageTemplateName(String pageTemplateName) {
    this.pageTemplateName = pageTemplateName;
  }

  public XijingComplexTemplateGetResponseData pageTemplateCoverUrl(String pageTemplateCoverUrl) {
    this.pageTemplateCoverUrl = pageTemplateCoverUrl;
    return this;
  }

  /**
   * Get pageTemplateCoverUrl
   *
   * @return pageTemplateCoverUrl
   */
  @ApiModelProperty(value = "")
  public String getPageTemplateCoverUrl() {
    return pageTemplateCoverUrl;
  }

  public void setPageTemplateCoverUrl(String pageTemplateCoverUrl) {
    this.pageTemplateCoverUrl = pageTemplateCoverUrl;
  }

  public XijingComplexTemplateGetResponseData pageName(String pageName) {
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

  public XijingComplexTemplateGetResponseData pageTitle(String pageTitle) {
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

  public XijingComplexTemplateGetResponseData pageConfig(List<XjConfigStruct> pageConfig) {
    this.pageConfig = pageConfig;
    return this;
  }

  public XijingComplexTemplateGetResponseData addPageConfigItem(XjConfigStruct pageConfigItem) {
    if (this.pageConfig == null) {
      this.pageConfig = new ArrayList<XjConfigStruct>();
    }
    this.pageConfig.add(pageConfigItem);
    return this;
  }

  /**
   * Get pageConfig
   *
   * @return pageConfig
   */
  @ApiModelProperty(value = "")
  public List<XjConfigStruct> getPageConfig() {
    return pageConfig;
  }

  public void setPageConfig(List<XjConfigStruct> pageConfig) {
    this.pageConfig = pageConfig;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XijingComplexTemplateGetResponseData xijingComplexTemplateGetResponseData =
        (XijingComplexTemplateGetResponseData) o;
    return Objects.equals(this.pageTemplateId, xijingComplexTemplateGetResponseData.pageTemplateId)
        && Objects.equals(
            this.pageTemplateName, xijingComplexTemplateGetResponseData.pageTemplateName)
        && Objects.equals(
            this.pageTemplateCoverUrl, xijingComplexTemplateGetResponseData.pageTemplateCoverUrl)
        && Objects.equals(this.pageName, xijingComplexTemplateGetResponseData.pageName)
        && Objects.equals(this.pageTitle, xijingComplexTemplateGetResponseData.pageTitle)
        && Objects.equals(this.pageConfig, xijingComplexTemplateGetResponseData.pageConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        pageTemplateId, pageTemplateName, pageTemplateCoverUrl, pageName, pageTitle, pageConfig);
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
