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

/** 浮层卡片创意内容 */
@ApiModel(description = "浮层卡片创意内容")
public class FloatingZone {
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

  public FloatingZone floatingZoneSwitch(Boolean floatingZoneSwitch) {
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

  public FloatingZone floatingZoneImageId(String floatingZoneImageId) {
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

  public FloatingZone floatingZoneName(String floatingZoneName) {
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

  public FloatingZone floatingZoneDesc(String floatingZoneDesc) {
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

  public FloatingZone floatingZoneButtonText(String floatingZoneButtonText) {
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

  public FloatingZone floatingZoneShowAppPropertySwitch(Boolean floatingZoneShowAppPropertySwitch) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FloatingZone floatingZone = (FloatingZone) o;
    return Objects.equals(this.floatingZoneSwitch, floatingZone.floatingZoneSwitch)
        && Objects.equals(this.floatingZoneImageId, floatingZone.floatingZoneImageId)
        && Objects.equals(this.floatingZoneName, floatingZone.floatingZoneName)
        && Objects.equals(this.floatingZoneDesc, floatingZone.floatingZoneDesc)
        && Objects.equals(this.floatingZoneButtonText, floatingZone.floatingZoneButtonText)
        && Objects.equals(
            this.floatingZoneShowAppPropertySwitch, floatingZone.floatingZoneShowAppPropertySwitch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        floatingZoneSwitch,
        floatingZoneImageId,
        floatingZoneName,
        floatingZoneDesc,
        floatingZoneButtonText,
        floatingZoneShowAppPropertySwitch);
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