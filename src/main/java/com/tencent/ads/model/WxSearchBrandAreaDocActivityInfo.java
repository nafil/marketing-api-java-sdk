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

/** 微信搜一搜品牌专区-doc区块-卡片信息 */
@ApiModel(description = "微信搜一搜品牌专区-doc区块-卡片信息")
public class WxSearchBrandAreaDocActivityInfo {
  @SerializedName("type")
  private Long type = null;

  @SerializedName("list")
  private List<WxSearchBrandAreaDocActivityInfoCardInfo> list = null;

  public WxSearchBrandAreaDocActivityInfo type(Long type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @ApiModelProperty(value = "")
  public Long getType() {
    return type;
  }

  public void setType(Long type) {
    this.type = type;
  }

  public WxSearchBrandAreaDocActivityInfo list(
      List<WxSearchBrandAreaDocActivityInfoCardInfo> list) {
    this.list = list;
    return this;
  }

  public WxSearchBrandAreaDocActivityInfo addListItem(
      WxSearchBrandAreaDocActivityInfoCardInfo listItem) {
    if (this.list == null) {
      this.list = new ArrayList<WxSearchBrandAreaDocActivityInfoCardInfo>();
    }
    this.list.add(listItem);
    return this;
  }

  /**
   * Get list
   *
   * @return list
   */
  @ApiModelProperty(value = "")
  public List<WxSearchBrandAreaDocActivityInfoCardInfo> getList() {
    return list;
  }

  public void setList(List<WxSearchBrandAreaDocActivityInfoCardInfo> list) {
    this.list = list;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WxSearchBrandAreaDocActivityInfo wxSearchBrandAreaDocActivityInfo =
        (WxSearchBrandAreaDocActivityInfo) o;
    return Objects.equals(this.type, wxSearchBrandAreaDocActivityInfo.type)
        && Objects.equals(this.list, wxSearchBrandAreaDocActivityInfo.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, list);
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