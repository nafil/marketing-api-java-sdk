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

/** 进入小程序组件元素 */
@ApiModel(description = "进入小程序组件元素")
public class FloatWeappSpec {
  @SerializedName("weapp_username")
  private String weappUsername = null;

  @SerializedName("weapp_path")
  private String weappPath = null;

  @SerializedName("btn_title")
  private String btnTitle = null;

  @SerializedName("btn_bg_color_theme")
  private String btnBgColorTheme = null;

  @SerializedName("font_color")
  private String fontColor = null;

  @SerializedName("btn_font_type")
  private Long btnFontType = null;

  public FloatWeappSpec weappUsername(String weappUsername) {
    this.weappUsername = weappUsername;
    return this;
  }

  /**
   * Get weappUsername
   *
   * @return weappUsername
   */
  @ApiModelProperty(value = "")
  public String getWeappUsername() {
    return weappUsername;
  }

  public void setWeappUsername(String weappUsername) {
    this.weappUsername = weappUsername;
  }

  public FloatWeappSpec weappPath(String weappPath) {
    this.weappPath = weappPath;
    return this;
  }

  /**
   * Get weappPath
   *
   * @return weappPath
   */
  @ApiModelProperty(value = "")
  public String getWeappPath() {
    return weappPath;
  }

  public void setWeappPath(String weappPath) {
    this.weappPath = weappPath;
  }

  public FloatWeappSpec btnTitle(String btnTitle) {
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

  public FloatWeappSpec btnBgColorTheme(String btnBgColorTheme) {
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

  public FloatWeappSpec fontColor(String fontColor) {
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

  public FloatWeappSpec btnFontType(Long btnFontType) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FloatWeappSpec floatWeappSpec = (FloatWeappSpec) o;
    return Objects.equals(this.weappUsername, floatWeappSpec.weappUsername)
        && Objects.equals(this.weappPath, floatWeappSpec.weappPath)
        && Objects.equals(this.btnTitle, floatWeappSpec.btnTitle)
        && Objects.equals(this.btnBgColorTheme, floatWeappSpec.btnBgColorTheme)
        && Objects.equals(this.fontColor, floatWeappSpec.fontColor)
        && Objects.equals(this.btnFontType, floatWeappSpec.btnFontType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        weappUsername, weappPath, btnTitle, btnBgColorTheme, fontColor, btnFontType);
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
