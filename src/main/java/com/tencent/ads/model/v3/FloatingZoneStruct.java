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

/** 轮播组件 */
@ApiModel(description = "轮播组件")
public class FloatingZoneStruct {
  @SerializedName("floating_zone_switch")
  private Boolean floatingZoneSwitch = null;

  @SerializedName("floating_zone_image_id")
  private String floatingZoneImageId = null;

  @SerializedName("floating_zone_name")
  private String floatingZoneName = null;

  @SerializedName("floating_zone_desc")
  private String floatingZoneDesc = null;

  @SerializedName("floating_zone_button_text")
  private String floatingZoneButtonText = null;

  @SerializedName("floating_zone_show_app_property_switch")
  private Boolean floatingZoneShowAppPropertySwitch = null;

  @SerializedName("floating_zone_type")
  private CreativeFloatingZoneType floatingZoneType = null;

  @SerializedName("floating_zone_single_image_id")
  private String floatingZoneSingleImageId = null;

  @SerializedName("button_base_text")
  private String buttonBaseText = null;

  @SerializedName("jump_info")
  private JumpinfoStruct jumpInfo = null;

  @SerializedName("floating_zone_info_type")
  private FloatingZoneInfoType floatingZoneInfoType = null;

  public FloatingZoneStruct floatingZoneSwitch(Boolean floatingZoneSwitch) {
    this.floatingZoneSwitch = floatingZoneSwitch;
    return this;
  }

  /**
   * Get floatingZoneSwitch
   *
   * @return floatingZoneSwitch
   */
  @ApiModelProperty(value = "")
  public Boolean isFloatingZoneSwitch() {
    return floatingZoneSwitch;
  }

  public void setFloatingZoneSwitch(Boolean floatingZoneSwitch) {
    this.floatingZoneSwitch = floatingZoneSwitch;
  }

  public FloatingZoneStruct floatingZoneImageId(String floatingZoneImageId) {
    this.floatingZoneImageId = floatingZoneImageId;
    return this;
  }

  /**
   * Get floatingZoneImageId
   *
   * @return floatingZoneImageId
   */
  @ApiModelProperty(value = "")
  public String getFloatingZoneImageId() {
    return floatingZoneImageId;
  }

  public void setFloatingZoneImageId(String floatingZoneImageId) {
    this.floatingZoneImageId = floatingZoneImageId;
  }

  public FloatingZoneStruct floatingZoneName(String floatingZoneName) {
    this.floatingZoneName = floatingZoneName;
    return this;
  }

  /**
   * Get floatingZoneName
   *
   * @return floatingZoneName
   */
  @ApiModelProperty(value = "")
  public String getFloatingZoneName() {
    return floatingZoneName;
  }

  public void setFloatingZoneName(String floatingZoneName) {
    this.floatingZoneName = floatingZoneName;
  }

  public FloatingZoneStruct floatingZoneDesc(String floatingZoneDesc) {
    this.floatingZoneDesc = floatingZoneDesc;
    return this;
  }

  /**
   * Get floatingZoneDesc
   *
   * @return floatingZoneDesc
   */
  @ApiModelProperty(value = "")
  public String getFloatingZoneDesc() {
    return floatingZoneDesc;
  }

  public void setFloatingZoneDesc(String floatingZoneDesc) {
    this.floatingZoneDesc = floatingZoneDesc;
  }

  public FloatingZoneStruct floatingZoneButtonText(String floatingZoneButtonText) {
    this.floatingZoneButtonText = floatingZoneButtonText;
    return this;
  }

  /**
   * Get floatingZoneButtonText
   *
   * @return floatingZoneButtonText
   */
  @ApiModelProperty(value = "")
  public String getFloatingZoneButtonText() {
    return floatingZoneButtonText;
  }

  public void setFloatingZoneButtonText(String floatingZoneButtonText) {
    this.floatingZoneButtonText = floatingZoneButtonText;
  }

  public FloatingZoneStruct floatingZoneShowAppPropertySwitch(
      Boolean floatingZoneShowAppPropertySwitch) {
    this.floatingZoneShowAppPropertySwitch = floatingZoneShowAppPropertySwitch;
    return this;
  }

  /**
   * Get floatingZoneShowAppPropertySwitch
   *
   * @return floatingZoneShowAppPropertySwitch
   */
  @ApiModelProperty(value = "")
  public Boolean isFloatingZoneShowAppPropertySwitch() {
    return floatingZoneShowAppPropertySwitch;
  }

  public void setFloatingZoneShowAppPropertySwitch(Boolean floatingZoneShowAppPropertySwitch) {
    this.floatingZoneShowAppPropertySwitch = floatingZoneShowAppPropertySwitch;
  }

  public FloatingZoneStruct floatingZoneType(CreativeFloatingZoneType floatingZoneType) {
    this.floatingZoneType = floatingZoneType;
    return this;
  }

  /**
   * Get floatingZoneType
   *
   * @return floatingZoneType
   */
  @ApiModelProperty(value = "")
  public CreativeFloatingZoneType getFloatingZoneType() {
    return floatingZoneType;
  }

  public void setFloatingZoneType(CreativeFloatingZoneType floatingZoneType) {
    this.floatingZoneType = floatingZoneType;
  }

  public FloatingZoneStruct floatingZoneSingleImageId(String floatingZoneSingleImageId) {
    this.floatingZoneSingleImageId = floatingZoneSingleImageId;
    return this;
  }

  /**
   * Get floatingZoneSingleImageId
   *
   * @return floatingZoneSingleImageId
   */
  @ApiModelProperty(value = "")
  public String getFloatingZoneSingleImageId() {
    return floatingZoneSingleImageId;
  }

  public void setFloatingZoneSingleImageId(String floatingZoneSingleImageId) {
    this.floatingZoneSingleImageId = floatingZoneSingleImageId;
  }

  public FloatingZoneStruct buttonBaseText(String buttonBaseText) {
    this.buttonBaseText = buttonBaseText;
    return this;
  }

  /**
   * Get buttonBaseText
   *
   * @return buttonBaseText
   */
  @ApiModelProperty(value = "")
  public String getButtonBaseText() {
    return buttonBaseText;
  }

  public void setButtonBaseText(String buttonBaseText) {
    this.buttonBaseText = buttonBaseText;
  }

  public FloatingZoneStruct jumpInfo(JumpinfoStruct jumpInfo) {
    this.jumpInfo = jumpInfo;
    return this;
  }

  /**
   * Get jumpInfo
   *
   * @return jumpInfo
   */
  @ApiModelProperty(value = "")
  public JumpinfoStruct getJumpInfo() {
    return jumpInfo;
  }

  public void setJumpInfo(JumpinfoStruct jumpInfo) {
    this.jumpInfo = jumpInfo;
  }

  public FloatingZoneStruct floatingZoneInfoType(FloatingZoneInfoType floatingZoneInfoType) {
    this.floatingZoneInfoType = floatingZoneInfoType;
    return this;
  }

  /**
   * Get floatingZoneInfoType
   *
   * @return floatingZoneInfoType
   */
  @ApiModelProperty(value = "")
  public FloatingZoneInfoType getFloatingZoneInfoType() {
    return floatingZoneInfoType;
  }

  public void setFloatingZoneInfoType(FloatingZoneInfoType floatingZoneInfoType) {
    this.floatingZoneInfoType = floatingZoneInfoType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FloatingZoneStruct floatingZoneStruct = (FloatingZoneStruct) o;
    return Objects.equals(this.floatingZoneSwitch, floatingZoneStruct.floatingZoneSwitch)
        && Objects.equals(this.floatingZoneImageId, floatingZoneStruct.floatingZoneImageId)
        && Objects.equals(this.floatingZoneName, floatingZoneStruct.floatingZoneName)
        && Objects.equals(this.floatingZoneDesc, floatingZoneStruct.floatingZoneDesc)
        && Objects.equals(this.floatingZoneButtonText, floatingZoneStruct.floatingZoneButtonText)
        && Objects.equals(
            this.floatingZoneShowAppPropertySwitch,
            floatingZoneStruct.floatingZoneShowAppPropertySwitch)
        && Objects.equals(this.floatingZoneType, floatingZoneStruct.floatingZoneType)
        && Objects.equals(
            this.floatingZoneSingleImageId, floatingZoneStruct.floatingZoneSingleImageId)
        && Objects.equals(this.buttonBaseText, floatingZoneStruct.buttonBaseText)
        && Objects.equals(this.jumpInfo, floatingZoneStruct.jumpInfo)
        && Objects.equals(this.floatingZoneInfoType, floatingZoneStruct.floatingZoneInfoType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        floatingZoneSwitch,
        floatingZoneImageId,
        floatingZoneName,
        floatingZoneDesc,
        floatingZoneButtonText,
        floatingZoneShowAppPropertySwitch,
        floatingZoneType,
        floatingZoneSingleImageId,
        buttonBaseText,
        jumpInfo,
        floatingZoneInfoType);
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
