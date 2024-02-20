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

/** 衍生使用元素信息 */
@ApiModel(description = "衍生使用元素信息")
public class CreativeElementsUsage {
  @SerializedName("use_description_element")
  private Boolean useDescriptionElement = null;

  public CreativeElementsUsage useDescriptionElement(Boolean useDescriptionElement) {
    this.useDescriptionElement = useDescriptionElement;
    return this;
  }

  /**
   * Get useDescriptionElement
   *
   * @return useDescriptionElement
   */
  @ApiModelProperty(value = "")
  public Boolean isUseDescriptionElement() {
    return useDescriptionElement;
  }

  public void setUseDescriptionElement(Boolean useDescriptionElement) {
    this.useDescriptionElement = useDescriptionElement;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeElementsUsage creativeElementsUsage = (CreativeElementsUsage) o;
    return Objects.equals(this.useDescriptionElement, creativeElementsUsage.useDescriptionElement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useDescriptionElement);
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