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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** 资产验真落地页结构 */
@ApiModel(description = "资产验真落地页结构")
public class MarketingAssetVerificationLandingPageStruct {
  @SerializedName("landing_page_name")
  private String landingPageName = null;

  @SerializedName("marketing_asset_verification_status")
  private MarketingAssetVerificationStatus marketingAssetVerificationStatus = null;

  @SerializedName("marketing_asset_verification_status_cn")
  private String marketingAssetVerificationStatusCn = null;

  @SerializedName("jump_info")
  private JumpinfoComponent jumpInfo = null;

  public MarketingAssetVerificationLandingPageStruct landingPageName(String landingPageName) {
    this.landingPageName = landingPageName;
    return this;
  }

  /**
   * Get landingPageName
   *
   * @return landingPageName
   */
  @ApiModelProperty(value = "")
  public String getLandingPageName() {
    return landingPageName;
  }

  public void setLandingPageName(String landingPageName) {
    this.landingPageName = landingPageName;
  }

  public MarketingAssetVerificationLandingPageStruct marketingAssetVerificationStatus(
      MarketingAssetVerificationStatus marketingAssetVerificationStatus) {
    this.marketingAssetVerificationStatus = marketingAssetVerificationStatus;
    return this;
  }

  /**
   * Get marketingAssetVerificationStatus
   *
   * @return marketingAssetVerificationStatus
   */
  @ApiModelProperty(value = "")
  public MarketingAssetVerificationStatus getMarketingAssetVerificationStatus() {
    return marketingAssetVerificationStatus;
  }

  public void setMarketingAssetVerificationStatus(
      MarketingAssetVerificationStatus marketingAssetVerificationStatus) {
    this.marketingAssetVerificationStatus = marketingAssetVerificationStatus;
  }

  public MarketingAssetVerificationLandingPageStruct marketingAssetVerificationStatusCn(
      String marketingAssetVerificationStatusCn) {
    this.marketingAssetVerificationStatusCn = marketingAssetVerificationStatusCn;
    return this;
  }

  /**
   * Get marketingAssetVerificationStatusCn
   *
   * @return marketingAssetVerificationStatusCn
   */
  @ApiModelProperty(value = "")
  public String getMarketingAssetVerificationStatusCn() {
    return marketingAssetVerificationStatusCn;
  }

  public void setMarketingAssetVerificationStatusCn(String marketingAssetVerificationStatusCn) {
    this.marketingAssetVerificationStatusCn = marketingAssetVerificationStatusCn;
  }

  public MarketingAssetVerificationLandingPageStruct jumpInfo(JumpinfoComponent jumpInfo) {
    this.jumpInfo = jumpInfo;
    return this;
  }

  /**
   * Get jumpInfo
   *
   * @return jumpInfo
   */
  @ApiModelProperty(value = "")
  public JumpinfoComponent getJumpInfo() {
    return jumpInfo;
  }

  public void setJumpInfo(JumpinfoComponent jumpInfo) {
    this.jumpInfo = jumpInfo;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketingAssetVerificationLandingPageStruct marketingAssetVerificationLandingPageStruct =
        (MarketingAssetVerificationLandingPageStruct) o;
    return Objects.equals(
            this.landingPageName, marketingAssetVerificationLandingPageStruct.landingPageName)
        && Objects.equals(
            this.marketingAssetVerificationStatus,
            marketingAssetVerificationLandingPageStruct.marketingAssetVerificationStatus)
        && Objects.equals(
            this.marketingAssetVerificationStatusCn,
            marketingAssetVerificationLandingPageStruct.marketingAssetVerificationStatusCn)
        && Objects.equals(this.jumpInfo, marketingAssetVerificationLandingPageStruct.jumpInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        landingPageName,
        marketingAssetVerificationStatus,
        marketingAssetVerificationStatusCn,
        jumpInfo);
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
