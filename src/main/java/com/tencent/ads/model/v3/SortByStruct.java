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

/** 排序 */
@ApiModel(description = "排序")
public class SortByStruct {
  @SerializedName("field")
  private String field = null;

  @SerializedName("desc")
  private Sort desc = null;

  public SortByStruct field(String field) {
    this.field = field;
    return this;
  }

  /**
   * Get field
   *
   * @return field
   */
  @ApiModelProperty(value = "")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public SortByStruct desc(Sort desc) {
    this.desc = desc;
    return this;
  }

  /**
   * Get desc
   *
   * @return desc
   */
  @ApiModelProperty(value = "")
  public Sort getDesc() {
    return desc;
  }

  public void setDesc(Sort desc) {
    this.desc = desc;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SortByStruct sortByStruct = (SortByStruct) o;
    return Objects.equals(this.field, sortByStruct.field)
        && Objects.equals(this.desc, sortByStruct.desc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, desc);
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
