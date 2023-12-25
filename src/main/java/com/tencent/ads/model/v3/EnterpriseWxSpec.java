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

/** 添加商家微信组件元素 */
@ApiModel(description = "添加商家微信组件元素")
public class EnterpriseWxSpec {
  @SerializedName("corp_id")
  private String corpId = null;

  @SerializedName("group_id")
  private Long groupId = null;

  @SerializedName("btn_title")
  private String btnTitle = null;

  @SerializedName("font_color")
  private String fontColor = null;

  @SerializedName("btn_bg_color_theme")
  private String btnBgColorTheme = null;

  @SerializedName("btn_border_color_theme")
  private String btnBorderColorTheme = null;

  @SerializedName("btn_font_type")
  private Long btnFontType = null;

  @SerializedName("padding_top")
  private Long paddingTop = null;

  @SerializedName("padding_bottom")
  private Long paddingBottom = null;

  @SerializedName("use_icon")
  private Long useIcon = null;

  public EnterpriseWxSpec corpId(String corpId) {
    this.corpId = corpId;
    return this;
  }

  /**
   * Get corpId
   *
   * @return corpId
   */
  @ApiModelProperty(value = "")
  public String getCorpId() {
    return corpId;
  }

  public void setCorpId(String corpId) {
    this.corpId = corpId;
  }

  public EnterpriseWxSpec groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Get groupId
   *
   * @return groupId
   */
  @ApiModelProperty(value = "")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public EnterpriseWxSpec btnTitle(String btnTitle) {
    this.btnTitle = btnTitle;
    return this;
  }

  /**
   * Get btnTitle
   *
   * @return btnTitle
   */
  @ApiModelProperty(value = "")
  public String getBtnTitle() {
    return btnTitle;
  }

  public void setBtnTitle(String btnTitle) {
    this.btnTitle = btnTitle;
  }

  public EnterpriseWxSpec fontColor(String fontColor) {
    this.fontColor = fontColor;
    return this;
  }

  /**
   * Get fontColor
   *
   * @return fontColor
   */
  @ApiModelProperty(value = "")
  public String getFontColor() {
    return fontColor;
  }

  public void setFontColor(String fontColor) {
    this.fontColor = fontColor;
  }

  public EnterpriseWxSpec btnBgColorTheme(String btnBgColorTheme) {
    this.btnBgColorTheme = btnBgColorTheme;
    return this;
  }

  /**
   * Get btnBgColorTheme
   *
   * @return btnBgColorTheme
   */
  @ApiModelProperty(value = "")
  public String getBtnBgColorTheme() {
    return btnBgColorTheme;
  }

  public void setBtnBgColorTheme(String btnBgColorTheme) {
    this.btnBgColorTheme = btnBgColorTheme;
  }

  public EnterpriseWxSpec btnBorderColorTheme(String btnBorderColorTheme) {
    this.btnBorderColorTheme = btnBorderColorTheme;
    return this;
  }

  /**
   * Get btnBorderColorTheme
   *
   * @return btnBorderColorTheme
   */
  @ApiModelProperty(value = "")
  public String getBtnBorderColorTheme() {
    return btnBorderColorTheme;
  }

  public void setBtnBorderColorTheme(String btnBorderColorTheme) {
    this.btnBorderColorTheme = btnBorderColorTheme;
  }

  public EnterpriseWxSpec btnFontType(Long btnFontType) {
    this.btnFontType = btnFontType;
    return this;
  }

  /**
   * Get btnFontType
   *
   * @return btnFontType
   */
  @ApiModelProperty(value = "")
  public Long getBtnFontType() {
    return btnFontType;
  }

  public void setBtnFontType(Long btnFontType) {
    this.btnFontType = btnFontType;
  }

  public EnterpriseWxSpec paddingTop(Long paddingTop) {
    this.paddingTop = paddingTop;
    return this;
  }

  /**
   * Get paddingTop
   *
   * @return paddingTop
   */
  @ApiModelProperty(value = "")
  public Long getPaddingTop() {
    return paddingTop;
  }

  public void setPaddingTop(Long paddingTop) {
    this.paddingTop = paddingTop;
  }

  public EnterpriseWxSpec paddingBottom(Long paddingBottom) {
    this.paddingBottom = paddingBottom;
    return this;
  }

  /**
   * Get paddingBottom
   *
   * @return paddingBottom
   */
  @ApiModelProperty(value = "")
  public Long getPaddingBottom() {
    return paddingBottom;
  }

  public void setPaddingBottom(Long paddingBottom) {
    this.paddingBottom = paddingBottom;
  }

  public EnterpriseWxSpec useIcon(Long useIcon) {
    this.useIcon = useIcon;
    return this;
  }

  /**
   * Get useIcon
   *
   * @return useIcon
   */
  @ApiModelProperty(value = "")
  public Long getUseIcon() {
    return useIcon;
  }

  public void setUseIcon(Long useIcon) {
    this.useIcon = useIcon;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseWxSpec enterpriseWxSpec = (EnterpriseWxSpec) o;
    return Objects.equals(this.corpId, enterpriseWxSpec.corpId)
        && Objects.equals(this.groupId, enterpriseWxSpec.groupId)
        && Objects.equals(this.btnTitle, enterpriseWxSpec.btnTitle)
        && Objects.equals(this.fontColor, enterpriseWxSpec.fontColor)
        && Objects.equals(this.btnBgColorTheme, enterpriseWxSpec.btnBgColorTheme)
        && Objects.equals(this.btnBorderColorTheme, enterpriseWxSpec.btnBorderColorTheme)
        && Objects.equals(this.btnFontType, enterpriseWxSpec.btnFontType)
        && Objects.equals(this.paddingTop, enterpriseWxSpec.paddingTop)
        && Objects.equals(this.paddingBottom, enterpriseWxSpec.paddingBottom)
        && Objects.equals(this.useIcon, enterpriseWxSpec.useIcon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        corpId,
        groupId,
        btnTitle,
        fontColor,
        btnBgColorTheme,
        btnBorderColorTheme,
        btnFontType,
        paddingTop,
        paddingBottom,
        useIcon);
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
