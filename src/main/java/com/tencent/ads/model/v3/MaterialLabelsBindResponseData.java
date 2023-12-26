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

/** MaterialLabelsBindResponseData */
public class MaterialLabelsBindResponseData {
  @SerializedName("success_id_list")
  private List<String> successIdList = null;

  @SerializedName("fail_id_list")
  private List<String> failIdList = null;

  @SerializedName("fail_reason_list")
  private List<FailReason> failReasonList = null;

  public MaterialLabelsBindResponseData successIdList(List<String> successIdList) {
    this.successIdList = successIdList;
    return this;
  }

  public MaterialLabelsBindResponseData addSuccessIdListItem(String successIdListItem) {
    if (this.successIdList == null) {
      this.successIdList = new ArrayList<String>();
    }
    this.successIdList.add(successIdListItem);
    return this;
  }

  /**
   * Get successIdList
   *
   * @return successIdList
   */
  @ApiModelProperty(value = "")
  public List<String> getSuccessIdList() {
    return successIdList;
  }

  public void setSuccessIdList(List<String> successIdList) {
    this.successIdList = successIdList;
  }

  public MaterialLabelsBindResponseData failIdList(List<String> failIdList) {
    this.failIdList = failIdList;
    return this;
  }

  public MaterialLabelsBindResponseData addFailIdListItem(String failIdListItem) {
    if (this.failIdList == null) {
      this.failIdList = new ArrayList<String>();
    }
    this.failIdList.add(failIdListItem);
    return this;
  }

  /**
   * Get failIdList
   *
   * @return failIdList
   */
  @ApiModelProperty(value = "")
  public List<String> getFailIdList() {
    return failIdList;
  }

  public void setFailIdList(List<String> failIdList) {
    this.failIdList = failIdList;
  }

  public MaterialLabelsBindResponseData failReasonList(List<FailReason> failReasonList) {
    this.failReasonList = failReasonList;
    return this;
  }

  public MaterialLabelsBindResponseData addFailReasonListItem(FailReason failReasonListItem) {
    if (this.failReasonList == null) {
      this.failReasonList = new ArrayList<FailReason>();
    }
    this.failReasonList.add(failReasonListItem);
    return this;
  }

  /**
   * Get failReasonList
   *
   * @return failReasonList
   */
  @ApiModelProperty(value = "")
  public List<FailReason> getFailReasonList() {
    return failReasonList;
  }

  public void setFailReasonList(List<FailReason> failReasonList) {
    this.failReasonList = failReasonList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaterialLabelsBindResponseData materialLabelsBindResponseData =
        (MaterialLabelsBindResponseData) o;
    return Objects.equals(this.successIdList, materialLabelsBindResponseData.successIdList)
        && Objects.equals(this.failIdList, materialLabelsBindResponseData.failIdList)
        && Objects.equals(this.failReasonList, materialLabelsBindResponseData.failReasonList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successIdList, failIdList, failReasonList);
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