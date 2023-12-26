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

/** CustomAudiencesAddRequest */
public class CustomAudiencesAddRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private AudienceType type = null;

  @SerializedName("outer_audience_id")
  private String outerAudienceId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("audience_spec")
  private AudienceSpec audienceSpec = null;

  public CustomAudiencesAddRequest accountId(Long accountId) {
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

  public CustomAudiencesAddRequest name(String name) {
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

  public CustomAudiencesAddRequest type(AudienceType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @ApiModelProperty(value = "")
  public AudienceType getType() {
    return type;
  }

  public void setType(AudienceType type) {
    this.type = type;
  }

  public CustomAudiencesAddRequest outerAudienceId(String outerAudienceId) {
    this.outerAudienceId = outerAudienceId;
    return this;
  }

  /**
   * Get outerAudienceId
   *
   * @return outerAudienceId
   */
  @ApiModelProperty(value = "")
  public String getOuterAudienceId() {
    return outerAudienceId;
  }

  public void setOuterAudienceId(String outerAudienceId) {
    this.outerAudienceId = outerAudienceId;
  }

  public CustomAudiencesAddRequest description(String description) {
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

  public CustomAudiencesAddRequest audienceSpec(AudienceSpec audienceSpec) {
    this.audienceSpec = audienceSpec;
    return this;
  }

  /**
   * Get audienceSpec
   *
   * @return audienceSpec
   */
  @ApiModelProperty(value = "")
  public AudienceSpec getAudienceSpec() {
    return audienceSpec;
  }

  public void setAudienceSpec(AudienceSpec audienceSpec) {
    this.audienceSpec = audienceSpec;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomAudiencesAddRequest customAudiencesAddRequest = (CustomAudiencesAddRequest) o;
    return Objects.equals(this.accountId, customAudiencesAddRequest.accountId)
        && Objects.equals(this.name, customAudiencesAddRequest.name)
        && Objects.equals(this.type, customAudiencesAddRequest.type)
        && Objects.equals(this.outerAudienceId, customAudiencesAddRequest.outerAudienceId)
        && Objects.equals(this.description, customAudiencesAddRequest.description)
        && Objects.equals(this.audienceSpec, customAudiencesAddRequest.audienceSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, name, type, outerAudienceId, description, audienceSpec);
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