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

/** 选择按钮结构 */
@ApiModel(description = "选择按钮结构")
public class ChosenButtonStruct {
  @SerializedName("left_button")
  private ChosenBaseButtonStruct leftButton = null;

  @SerializedName("right_button")
  private ChosenBaseButtonStruct rightButton = null;

  public ChosenButtonStruct leftButton(ChosenBaseButtonStruct leftButton) {
    this.leftButton = leftButton;
    return this;
  }

  /**
   * Get leftButton
   *
   * @return leftButton
   */
  @ApiModelProperty(value = "")
  public ChosenBaseButtonStruct getLeftButton() {
    return leftButton;
  }

  public void setLeftButton(ChosenBaseButtonStruct leftButton) {
    this.leftButton = leftButton;
  }

  public ChosenButtonStruct rightButton(ChosenBaseButtonStruct rightButton) {
    this.rightButton = rightButton;
    return this;
  }

  /**
   * Get rightButton
   *
   * @return rightButton
   */
  @ApiModelProperty(value = "")
  public ChosenBaseButtonStruct getRightButton() {
    return rightButton;
  }

  public void setRightButton(ChosenBaseButtonStruct rightButton) {
    this.rightButton = rightButton;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChosenButtonStruct chosenButtonStruct = (ChosenButtonStruct) o;
    return Objects.equals(this.leftButton, chosenButtonStruct.leftButton)
        && Objects.equals(this.rightButton, chosenButtonStruct.rightButton);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leftButton, rightButton);
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