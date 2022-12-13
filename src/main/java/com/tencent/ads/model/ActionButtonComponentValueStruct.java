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

/** 行动按钮结构 */
@ApiModel(description = "行动按钮结构")
public class ActionButtonComponentValueStruct {
  @SerializedName("button_text")
  private String buttonText = null;

  @SerializedName("jump_info")
  private List<LandingPageStructure> jumpInfo = null;

  public ActionButtonComponentValueStruct buttonText(String buttonText) {
    this.buttonText = buttonText;
    return this;
  }

  /**
   * Get buttonText
   *
   * @return buttonText
   */
  @ApiModelProperty(value = "")
  public String getButtonText() {
    return buttonText;
  }

  public void setButtonText(String buttonText) {
    this.buttonText = buttonText;
  }

  public ActionButtonComponentValueStruct jumpInfo(List<LandingPageStructure> jumpInfo) {
    this.jumpInfo = jumpInfo;
    return this;
  }

  public ActionButtonComponentValueStruct addJumpInfoItem(LandingPageStructure jumpInfoItem) {
    if (this.jumpInfo == null) {
      this.jumpInfo = new ArrayList<LandingPageStructure>();
    }
    this.jumpInfo.add(jumpInfoItem);
    return this;
  }

  /**
   * Get jumpInfo
   *
   * @return jumpInfo
   */
  @ApiModelProperty(value = "")
  public List<LandingPageStructure> getJumpInfo() {
    return jumpInfo;
  }

  public void setJumpInfo(List<LandingPageStructure> jumpInfo) {
    this.jumpInfo = jumpInfo;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionButtonComponentValueStruct actionButtonComponentValueStruct =
        (ActionButtonComponentValueStruct) o;
    return Objects.equals(this.buttonText, actionButtonComponentValueStruct.buttonText)
        && Objects.equals(this.jumpInfo, actionButtonComponentValueStruct.jumpInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buttonText, jumpInfo);
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