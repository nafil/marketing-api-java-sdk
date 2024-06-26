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

/** MarketingTargetAssetsAddRequest */
public class MarketingTargetAssetsAddRequest {
  @SerializedName("organization_id")
  private Long organizationId = null;

  @SerializedName("marketing_asset_name")
  private String marketingAssetName = null;

  @SerializedName("marketing_target_type")
  private MarketingTargetType marketingTargetType = null;

  @SerializedName("marketing_asset_type")
  private MarketingAssetType marketingAssetType = null;

  @SerializedName("properties")
  private List<PropertyStruct> properties = null;

  public MarketingTargetAssetsAddRequest organizationId(Long organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  /**
   * Get organizationId
   *
   * @return organizationId
   */
  @ApiModelProperty(value = "")
  public Long getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(Long organizationId) {
    this.organizationId = organizationId;
  }

  public MarketingTargetAssetsAddRequest marketingAssetName(String marketingAssetName) {
    this.marketingAssetName = marketingAssetName;
    return this;
  }

  /**
   * Get marketingAssetName
   *
   * @return marketingAssetName
   */
  @ApiModelProperty(value = "")
  public String getMarketingAssetName() {
    return marketingAssetName;
  }

  public void setMarketingAssetName(String marketingAssetName) {
    this.marketingAssetName = marketingAssetName;
  }

  public MarketingTargetAssetsAddRequest marketingTargetType(
      MarketingTargetType marketingTargetType) {
    this.marketingTargetType = marketingTargetType;
    return this;
  }

  /**
   * Get marketingTargetType
   *
   * @return marketingTargetType
   */
  @ApiModelProperty(value = "")
  public MarketingTargetType getMarketingTargetType() {
    return marketingTargetType;
  }

  public void setMarketingTargetType(MarketingTargetType marketingTargetType) {
    this.marketingTargetType = marketingTargetType;
  }

  public MarketingTargetAssetsAddRequest marketingAssetType(MarketingAssetType marketingAssetType) {
    this.marketingAssetType = marketingAssetType;
    return this;
  }

  /**
   * Get marketingAssetType
   *
   * @return marketingAssetType
   */
  @ApiModelProperty(value = "")
  public MarketingAssetType getMarketingAssetType() {
    return marketingAssetType;
  }

  public void setMarketingAssetType(MarketingAssetType marketingAssetType) {
    this.marketingAssetType = marketingAssetType;
  }

  public MarketingTargetAssetsAddRequest properties(List<PropertyStruct> properties) {
    this.properties = properties;
    return this;
  }

  public MarketingTargetAssetsAddRequest addPropertiesItem(PropertyStruct propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<PropertyStruct>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

  /**
   * Get properties
   *
   * @return properties
   */
  @ApiModelProperty(value = "")
  public List<PropertyStruct> getProperties() {
    return properties;
  }

  public void setProperties(List<PropertyStruct> properties) {
    this.properties = properties;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketingTargetAssetsAddRequest marketingTargetAssetsAddRequest =
        (MarketingTargetAssetsAddRequest) o;
    return Objects.equals(this.organizationId, marketingTargetAssetsAddRequest.organizationId)
        && Objects.equals(
            this.marketingAssetName, marketingTargetAssetsAddRequest.marketingAssetName)
        && Objects.equals(
            this.marketingTargetType, marketingTargetAssetsAddRequest.marketingTargetType)
        && Objects.equals(
            this.marketingAssetType, marketingTargetAssetsAddRequest.marketingAssetType)
        && Objects.equals(this.properties, marketingTargetAssetsAddRequest.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        organizationId, marketingAssetName, marketingTargetType, marketingAssetType, properties);
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
