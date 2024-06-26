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

/** LeadsClaimUpdateResponseData */
public class LeadsClaimUpdateResponseData {
  @SerializedName("fail_leads_list")
  private List<LeadsClaimUpdateListStruct> failLeadsList = null;

  public LeadsClaimUpdateResponseData failLeadsList(
      List<LeadsClaimUpdateListStruct> failLeadsList) {
    this.failLeadsList = failLeadsList;
    return this;
  }

  public LeadsClaimUpdateResponseData addFailLeadsListItem(
      LeadsClaimUpdateListStruct failLeadsListItem) {
    if (this.failLeadsList == null) {
      this.failLeadsList = new ArrayList<LeadsClaimUpdateListStruct>();
    }
    this.failLeadsList.add(failLeadsListItem);
    return this;
  }

  /**
   * Get failLeadsList
   *
   * @return failLeadsList
   */
  @ApiModelProperty(value = "")
  public List<LeadsClaimUpdateListStruct> getFailLeadsList() {
    return failLeadsList;
  }

  public void setFailLeadsList(List<LeadsClaimUpdateListStruct> failLeadsList) {
    this.failLeadsList = failLeadsList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadsClaimUpdateResponseData leadsClaimUpdateResponseData = (LeadsClaimUpdateResponseData) o;
    return Objects.equals(this.failLeadsList, leadsClaimUpdateResponseData.failLeadsList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failLeadsList);
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
