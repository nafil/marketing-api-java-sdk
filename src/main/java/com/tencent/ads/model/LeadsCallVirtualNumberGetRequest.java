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
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** LeadsCallVirtualNumberGetRequest */
public class LeadsCallVirtualNumberGetRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("leads_id")
  private Long leadsId = null;

  @SerializedName("caller")
  private String caller = null;

  @SerializedName("callee")
  private String callee = null;

  @SerializedName("request_id")
  private String requestId = null;

  public LeadsCallVirtualNumberGetRequest accountId(Long accountId) {
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

  public LeadsCallVirtualNumberGetRequest leadsId(Long leadsId) {
    this.leadsId = leadsId;
    return this;
  }

  /**
   * Get leadsId
   *
   * @return leadsId
   */
  @ApiModelProperty(value = "")
  public Long getLeadsId() {
    return leadsId;
  }

  public void setLeadsId(Long leadsId) {
    this.leadsId = leadsId;
  }

  public LeadsCallVirtualNumberGetRequest caller(String caller) {
    this.caller = caller;
    return this;
  }

  /**
   * Get caller
   *
   * @return caller
   */
  @ApiModelProperty(value = "")
  public String getCaller() {
    return caller;
  }

  public void setCaller(String caller) {
    this.caller = caller;
  }

  public LeadsCallVirtualNumberGetRequest callee(String callee) {
    this.callee = callee;
    return this;
  }

  /**
   * Get callee
   *
   * @return callee
   */
  @ApiModelProperty(value = "")
  public String getCallee() {
    return callee;
  }

  public void setCallee(String callee) {
    this.callee = callee;
  }

  public LeadsCallVirtualNumberGetRequest requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * Get requestId
   *
   * @return requestId
   */
  @ApiModelProperty(value = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadsCallVirtualNumberGetRequest leadsCallVirtualNumberGetRequest =
        (LeadsCallVirtualNumberGetRequest) o;
    return Objects.equals(this.accountId, leadsCallVirtualNumberGetRequest.accountId)
        && Objects.equals(this.leadsId, leadsCallVirtualNumberGetRequest.leadsId)
        && Objects.equals(this.caller, leadsCallVirtualNumberGetRequest.caller)
        && Objects.equals(this.callee, leadsCallVirtualNumberGetRequest.callee)
        && Objects.equals(this.requestId, leadsCallVirtualNumberGetRequest.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, leadsId, caller, callee, requestId);
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
