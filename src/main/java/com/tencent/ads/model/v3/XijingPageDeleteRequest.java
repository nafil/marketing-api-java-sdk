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

/** XijingPageDeleteRequest */
public class XijingPageDeleteRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("page_id_list")
  private List<String> pageIdList = null;

  public XijingPageDeleteRequest accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   *
   * @return accountId
   */
  @ApiModelProperty(value = "")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public XijingPageDeleteRequest pageIdList(List<String> pageIdList) {
    this.pageIdList = pageIdList;
    return this;
  }

  public XijingPageDeleteRequest addPageIdListItem(String pageIdListItem) {
    if (this.pageIdList == null) {
      this.pageIdList = new ArrayList<String>();
    }
    this.pageIdList.add(pageIdListItem);
    return this;
  }

  /**
   * Get pageIdList
   *
   * @return pageIdList
   */
  @ApiModelProperty(value = "")
  public List<String> getPageIdList() {
    return pageIdList;
  }

  public void setPageIdList(List<String> pageIdList) {
    this.pageIdList = pageIdList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XijingPageDeleteRequest xijingPageDeleteRequest = (XijingPageDeleteRequest) o;
    return Objects.equals(this.accountId, xijingPageDeleteRequest.accountId)
        && Objects.equals(this.pageIdList, xijingPageDeleteRequest.pageIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, pageIdList);
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
