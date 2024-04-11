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

/** WechatChannelsAccountsGetResponseData */
public class WechatChannelsAccountsGetResponseData {
  @SerializedName("list")
  private List<WechatChannelsAccountStruct> list = null;

  @SerializedName("page_info")
  private Conf pageInfo = null;

  public WechatChannelsAccountsGetResponseData list(List<WechatChannelsAccountStruct> list) {
    this.list = list;
    return this;
  }

  public WechatChannelsAccountsGetResponseData addListItem(WechatChannelsAccountStruct listItem) {
    if (this.list == null) {
      this.list = new ArrayList<WechatChannelsAccountStruct>();
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
  public List<WechatChannelsAccountStruct> getList() {
    return list;
  }

  public void setList(List<WechatChannelsAccountStruct> list) {
    this.list = list;
  }

  public WechatChannelsAccountsGetResponseData pageInfo(Conf pageInfo) {
    this.pageInfo = pageInfo;
    return this;
  }

  /**
   * Get pageInfo
   *
   * @return pageInfo
   */
  @ApiModelProperty(value = "")
  public Conf getPageInfo() {
    return pageInfo;
  }

  public void setPageInfo(Conf pageInfo) {
    this.pageInfo = pageInfo;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WechatChannelsAccountsGetResponseData wechatChannelsAccountsGetResponseData =
        (WechatChannelsAccountsGetResponseData) o;
    return Objects.equals(this.list, wechatChannelsAccountsGetResponseData.list)
        && Objects.equals(this.pageInfo, wechatChannelsAccountsGetResponseData.pageInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list, pageInfo);
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
