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

/** 图文组件 */
@ApiModel(description = "图文组件")
public class ImageTextListComponentOption {
  @SerializedName("component_id")
  private Long componentId = null;

  @SerializedName("value")
  private List<ImageTextStruct> value = null;

  public ImageTextListComponentOption componentId(Long componentId) {
    this.componentId = componentId;
    return this;
  }

  /**
   * Get componentId
   *
   * @return componentId
   */
  @ApiModelProperty(value = "")
  public Long getComponentId() {
    return componentId;
  }

  public void setComponentId(Long componentId) {
    this.componentId = componentId;
  }

  public ImageTextListComponentOption value(List<ImageTextStruct> value) {
    this.value = value;
    return this;
  }

  public ImageTextListComponentOption addValueItem(ImageTextStruct valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<ImageTextStruct>();
    }
    this.value.add(valueItem);
    return this;
  }

  /**
   * Get value
   *
   * @return value
   */
  @ApiModelProperty(value = "")
  public List<ImageTextStruct> getValue() {
    return value;
  }

  public void setValue(List<ImageTextStruct> value) {
    this.value = value;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageTextListComponentOption imageTextListComponentOption = (ImageTextListComponentOption) o;
    return Objects.equals(this.componentId, imageTextListComponentOption.componentId)
        && Objects.equals(this.value, imageTextListComponentOption.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentId, value);
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
