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

/** BarrageAddRequest */
public class BarrageAddRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("text_list")
  private List<String> textList = null;

  public BarrageAddRequest accountId(Long accountId) {
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

  public BarrageAddRequest textList(List<String> textList) {
    this.textList = textList;
    return this;
  }

  public BarrageAddRequest addTextListItem(String textListItem) {
    if (this.textList == null) {
      this.textList = new ArrayList<String>();
    }
    this.textList.add(textListItem);
    return this;
  }

  /**
   * Get textList
   *
   * @return textList
   */
  @ApiModelProperty(value = "")
  public List<String> getTextList() {
    return textList;
  }

  public void setTextList(List<String> textList) {
    this.textList = textList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BarrageAddRequest barrageAddRequest = (BarrageAddRequest) o;
    return Objects.equals(this.accountId, barrageAddRequest.accountId)
        && Objects.equals(this.textList, barrageAddRequest.textList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, textList);
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
