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
import java.util.Objects;

/** LeadsListGetResponseData */
public class LeadsListGetResponseData {
  @SerializedName("leads_info")
  private LeadsListStruct leadsInfo = null;

  @SerializedName("page_info")
  private PageInfo pageInfo = null;

  public LeadsListGetResponseData leadsInfo(LeadsListStruct leadsInfo) {
    this.leadsInfo = leadsInfo;
    return this;
  }

  /**
   * Get leadsInfo
   *
   * @return leadsInfo
   */
  @ApiModelProperty(value = "")
  public LeadsListStruct getLeadsInfo() {
    return leadsInfo;
  }

  public void setLeadsInfo(LeadsListStruct leadsInfo) {
    this.leadsInfo = leadsInfo;
  }

  public LeadsListGetResponseData pageInfo(PageInfo pageInfo) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadsListGetResponseData leadsListGetResponseData = (LeadsListGetResponseData) o;
    return Objects.equals(this.leadsInfo, leadsListGetResponseData.leadsInfo)
        && Objects.equals(this.pageInfo, leadsListGetResponseData.pageInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leadsInfo, pageInfo);
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
