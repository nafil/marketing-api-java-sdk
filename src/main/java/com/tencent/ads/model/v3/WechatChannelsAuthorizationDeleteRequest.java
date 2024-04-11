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

/** WechatChannelsAuthorizationDeleteRequest */
public class WechatChannelsAuthorizationDeleteRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("authorization_id")
  private String authorizationId = null;

  @SerializedName("finder_username")
  private String finderUsername = null;

  public WechatChannelsAuthorizationDeleteRequest accountId(Long accountId) {
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

  public WechatChannelsAuthorizationDeleteRequest authorizationId(String authorizationId) {
    this.authorizationId = authorizationId;
    return this;
  }

  /**
   * Get authorizationId
   *
   * @return authorizationId
   */
  @ApiModelProperty(value = "")
  public String getAuthorizationId() {
    return authorizationId;
  }

  public void setAuthorizationId(String authorizationId) {
    this.authorizationId = authorizationId;
  }

  public WechatChannelsAuthorizationDeleteRequest finderUsername(String finderUsername) {
    this.finderUsername = finderUsername;
    return this;
  }

  /**
   * Get finderUsername
   *
   * @return finderUsername
   */
  @ApiModelProperty(value = "")
  public String getFinderUsername() {
    return finderUsername;
  }

  public void setFinderUsername(String finderUsername) {
    this.finderUsername = finderUsername;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WechatChannelsAuthorizationDeleteRequest wechatChannelsAuthorizationDeleteRequest =
        (WechatChannelsAuthorizationDeleteRequest) o;
    return Objects.equals(this.accountId, wechatChannelsAuthorizationDeleteRequest.accountId)
        && Objects.equals(
            this.authorizationId, wechatChannelsAuthorizationDeleteRequest.authorizationId)
        && Objects.equals(
            this.finderUsername, wechatChannelsAuthorizationDeleteRequest.finderUsername);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, authorizationId, finderUsername);
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
