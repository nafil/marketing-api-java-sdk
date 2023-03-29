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

/** LeadsCallCreateRequest */
public class LeadsCallCreateRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("leads_id")
  private Long leadsId = null;

  @SerializedName("user_id")
  private Long userId = null;

  @SerializedName("callee_number")
  private String calleeNumber = null;

  @SerializedName("request_id")
  private String requestId = null;

  @SerializedName("version")
  private String version = null;

  public LeadsCallCreateRequest accountId(Long accountId) {
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

  public LeadsCallCreateRequest leadsId(Long leadsId) {
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

  public LeadsCallCreateRequest userId(Long userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   *
   * @return userId
   */
  @ApiModelProperty(value = "")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public LeadsCallCreateRequest calleeNumber(String calleeNumber) {
    this.calleeNumber = calleeNumber;
    return this;
  }

  /**
   * Get calleeNumber
   *
   * @return calleeNumber
   */
  @ApiModelProperty(value = "")
  public String getCalleeNumber() {
    return calleeNumber;
  }

  public void setCalleeNumber(String calleeNumber) {
    this.calleeNumber = calleeNumber;
  }

  public LeadsCallCreateRequest requestId(String requestId) {
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

  public LeadsCallCreateRequest version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   *
   * @return version
   */
  @ApiModelProperty(value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadsCallCreateRequest leadsCallCreateRequest = (LeadsCallCreateRequest) o;
    return Objects.equals(this.accountId, leadsCallCreateRequest.accountId)
        && Objects.equals(this.leadsId, leadsCallCreateRequest.leadsId)
        && Objects.equals(this.userId, leadsCallCreateRequest.userId)
        && Objects.equals(this.calleeNumber, leadsCallCreateRequest.calleeNumber)
        && Objects.equals(this.requestId, leadsCallCreateRequest.requestId)
        && Objects.equals(this.version, leadsCallCreateRequest.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, leadsId, userId, calleeNumber, requestId, version);
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
