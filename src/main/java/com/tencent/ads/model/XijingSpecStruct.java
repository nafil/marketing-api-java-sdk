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

/** 蹊径落地页数据结构 */
@ApiModel(description = "蹊径落地页数据结构")
public class XijingSpecStruct {
  @SerializedName("page_id")
  private Long pageId = null;

  @SerializedName("customized_param")
  private String customizedParam = null;

  public XijingSpecStruct pageId(Long pageId) {
    this.pageId = pageId;
    return this;
  }

  /**
   * Get pageId
   *
   * @return pageId
   */
  @ApiModelProperty(value = "")
  public Long getPageId() {
    return pageId;
  }

  public void setPageId(Long pageId) {
    this.pageId = pageId;
  }

  public XijingSpecStruct customizedParam(String customizedParam) {
    this.customizedParam = customizedParam;
    return this;
  }

  /**
   * Get customizedParam
   *
   * @return customizedParam
   */
  @ApiModelProperty(value = "")
  public String getCustomizedParam() {
    return customizedParam;
  }

  public void setCustomizedParam(String customizedParam) {
    this.customizedParam = customizedParam;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XijingSpecStruct xijingSpecStruct = (XijingSpecStruct) o;
    return Objects.equals(this.pageId, xijingSpecStruct.pageId)
        && Objects.equals(this.customizedParam, xijingSpecStruct.customizedParam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageId, customizedParam);
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
