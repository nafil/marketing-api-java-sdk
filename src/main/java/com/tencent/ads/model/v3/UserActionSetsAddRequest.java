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

/** UserActionSetsAddRequest */
public class UserActionSetsAddRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("type")
  private AmUserActionSetType type = null;

  @SerializedName("mobile_app_id")
  private Long mobileAppId = null;

  @SerializedName("wechat_app_id")
  private String wechatAppId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("usages")
  private List<String> usages = null;

  @SerializedName("enable_conversion_claim")
  private Boolean enableConversionClaim = null;

  public UserActionSetsAddRequest accountId(Long accountId) {
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

  public UserActionSetsAddRequest type(AmUserActionSetType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @ApiModelProperty(value = "")
  public AmUserActionSetType getType() {
    return type;
  }

  public void setType(AmUserActionSetType type) {
    this.type = type;
  }

  public UserActionSetsAddRequest mobileAppId(Long mobileAppId) {
    this.mobileAppId = mobileAppId;
    return this;
  }

  /**
   * Get mobileAppId
   *
   * @return mobileAppId
   */
  @ApiModelProperty(value = "")
  public Long getMobileAppId() {
    return mobileAppId;
  }

  public void setMobileAppId(Long mobileAppId) {
    this.mobileAppId = mobileAppId;
  }

  public UserActionSetsAddRequest wechatAppId(String wechatAppId) {
    this.wechatAppId = wechatAppId;
    return this;
  }

  /**
   * Get wechatAppId
   *
   * @return wechatAppId
   */
  @ApiModelProperty(value = "")
  public String getWechatAppId() {
    return wechatAppId;
  }

  public void setWechatAppId(String wechatAppId) {
    this.wechatAppId = wechatAppId;
  }

  public UserActionSetsAddRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   *
   * @return name
   */
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserActionSetsAddRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   *
   * @return description
   */
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UserActionSetsAddRequest usages(List<String> usages) {
    this.usages = usages;
    return this;
  }

  public UserActionSetsAddRequest addUsagesItem(String usagesItem) {
    if (this.usages == null) {
      this.usages = new ArrayList<String>();
    }
    this.usages.add(usagesItem);
    return this;
  }

  /**
   * Get usages
   *
   * @return usages
   */
  @ApiModelProperty(value = "")
  public List<String> getUsages() {
    return usages;
  }

  public void setUsages(List<String> usages) {
    this.usages = usages;
  }

  public UserActionSetsAddRequest enableConversionClaim(Boolean enableConversionClaim) {
    this.enableConversionClaim = enableConversionClaim;
    return this;
  }

  /**
   * Get enableConversionClaim
   *
   * @return enableConversionClaim
   */
  @ApiModelProperty(value = "")
  public Boolean isEnableConversionClaim() {
    return enableConversionClaim;
  }

  public void setEnableConversionClaim(Boolean enableConversionClaim) {
    this.enableConversionClaim = enableConversionClaim;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserActionSetsAddRequest userActionSetsAddRequest = (UserActionSetsAddRequest) o;
    return Objects.equals(this.accountId, userActionSetsAddRequest.accountId)
        && Objects.equals(this.type, userActionSetsAddRequest.type)
        && Objects.equals(this.mobileAppId, userActionSetsAddRequest.mobileAppId)
        && Objects.equals(this.wechatAppId, userActionSetsAddRequest.wechatAppId)
        && Objects.equals(this.name, userActionSetsAddRequest.name)
        && Objects.equals(this.description, userActionSetsAddRequest.description)
        && Objects.equals(this.usages, userActionSetsAddRequest.usages)
        && Objects.equals(
            this.enableConversionClaim, userActionSetsAddRequest.enableConversionClaim);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        type,
        mobileAppId,
        wechatAppId,
        name,
        description,
        usages,
        enableConversionClaim);
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
