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

/** AdgroupsUpdateDatetimeRequest */
public class AdgroupsUpdateDatetimeRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("update_datetime_spec")
  private List<UpdateDatetimeStruct> updateDatetimeSpec = null;

  public AdgroupsUpdateDatetimeRequest accountId(Long accountId) {
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

  public AdgroupsUpdateDatetimeRequest updateDatetimeSpec(
      List<UpdateDatetimeStruct> updateDatetimeSpec) {
    this.updateDatetimeSpec = updateDatetimeSpec;
    return this;
  }

  public AdgroupsUpdateDatetimeRequest addUpdateDatetimeSpecItem(
      UpdateDatetimeStruct updateDatetimeSpecItem) {
    if (this.updateDatetimeSpec == null) {
      this.updateDatetimeSpec = new ArrayList<UpdateDatetimeStruct>();
    }
    this.updateDatetimeSpec.add(updateDatetimeSpecItem);
    return this;
  }

  /**
   * Get updateDatetimeSpec
   *
   * @return updateDatetimeSpec
   */
  @ApiModelProperty(value = "")
  public List<UpdateDatetimeStruct> getUpdateDatetimeSpec() {
    return updateDatetimeSpec;
  }

  public void setUpdateDatetimeSpec(List<UpdateDatetimeStruct> updateDatetimeSpec) {
    this.updateDatetimeSpec = updateDatetimeSpec;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdgroupsUpdateDatetimeRequest adgroupsUpdateDatetimeRequest = (AdgroupsUpdateDatetimeRequest) o;
    return Objects.equals(this.accountId, adgroupsUpdateDatetimeRequest.accountId)
        && Objects.equals(
            this.updateDatetimeSpec, adgroupsUpdateDatetimeRequest.updateDatetimeSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, updateDatetimeSpec);
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