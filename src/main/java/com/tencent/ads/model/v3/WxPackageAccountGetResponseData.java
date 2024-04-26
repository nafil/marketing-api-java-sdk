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
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** WxPackageAccountGetResponseData */
public class WxPackageAccountGetResponseData {
  @SerializedName("page_info")
  private PageInfo pageInfo = null;

  @SerializedName("list")
  private List<WechatInfoStruct> list = null;

  public WxPackageAccountGetResponseData pageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
    return this;
  }

  /**
   * Get pageInfo
   *
   * @return pageInfo
   */
  @ApiModelProperty(value = "")
  public PageInfo getPageInfo() {
    return pageInfo;
  }

  public void setPageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }

  public WxPackageAccountGetResponseData list(List<WechatInfoStruct> list) {
    this.list = list;
    return this;
  }

  public WxPackageAccountGetResponseData addListItem(WechatInfoStruct listItem) {
    if (this.list == null) {
      this.list = new ArrayList<WechatInfoStruct>();
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
  public List<WechatInfoStruct> getList() {
    return list;
  }

  public void setList(List<WechatInfoStruct> list) {
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
    WxPackageAccountGetResponseData wxPackageAccountGetResponseData =
        (WxPackageAccountGetResponseData) o;
    return Objects.equals(this.pageInfo, wxPackageAccountGetResponseData.pageInfo)
        && Objects.equals(this.list, wxPackageAccountGetResponseData.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageInfo, list);
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