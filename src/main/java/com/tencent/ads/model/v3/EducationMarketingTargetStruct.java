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

/** 过滤条件 */
@ApiModel(description = "过滤条件")
public class EducationMarketingTargetStruct {
  @SerializedName("relationship_id")
  private Long relationshipId = null;

  @SerializedName("marketing_target_id")
  private Long marketingTargetId = null;

  @SerializedName("marketing_target_type")
  private MarketingTargetType marketingTargetType = null;

  @SerializedName("marketing_target_detail_id")
  private String marketingTargetDetailId = null;

  @SerializedName("marketing_target_sub_detail_id")
  private String marketingTargetSubDetailId = null;

  @SerializedName("marketing_target_name")
  private String marketingTargetName = null;

  @SerializedName("category_name1")
  private String categoryName1 = null;

  @SerializedName("category_name2")
  private String categoryName2 = null;

  @SerializedName("category_name3")
  private String categoryName3 = null;

  public EducationMarketingTargetStruct relationshipId(Long relationshipId) {
    this.relationshipId = relationshipId;
    return this;
  }

  /**
   * Get relationshipId
   *
   * @return relationshipId
   */
  @ApiModelProperty(value = "")
  public Long getRelationshipId() {
    return relationshipId;
  }

  public void setRelationshipId(Long relationshipId) {
    this.relationshipId = relationshipId;
  }

  public EducationMarketingTargetStruct marketingTargetId(Long marketingTargetId) {
    this.marketingTargetId = marketingTargetId;
    return this;
  }

  /**
   * Get marketingTargetId
   *
   * @return marketingTargetId
   */
  @ApiModelProperty(value = "")
  public Long getMarketingTargetId() {
    return marketingTargetId;
  }

  public void setMarketingTargetId(Long marketingTargetId) {
    this.marketingTargetId = marketingTargetId;
  }

  public EducationMarketingTargetStruct marketingTargetType(
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

  public EducationMarketingTargetStruct marketingTargetDetailId(String marketingTargetDetailId) {
    this.marketingTargetDetailId = marketingTargetDetailId;
    return this;
  }

  /**
   * Get marketingTargetDetailId
   *
   * @return marketingTargetDetailId
   */
  @ApiModelProperty(value = "")
  public String getMarketingTargetDetailId() {
    return marketingTargetDetailId;
  }

  public void setMarketingTargetDetailId(String marketingTargetDetailId) {
    this.marketingTargetDetailId = marketingTargetDetailId;
  }

  public EducationMarketingTargetStruct marketingTargetSubDetailId(
      String marketingTargetSubDetailId) {
    this.marketingTargetSubDetailId = marketingTargetSubDetailId;
    return this;
  }

  /**
   * Get marketingTargetSubDetailId
   *
   * @return marketingTargetSubDetailId
   */
  @ApiModelProperty(value = "")
  public String getMarketingTargetSubDetailId() {
    return marketingTargetSubDetailId;
  }

  public void setMarketingTargetSubDetailId(String marketingTargetSubDetailId) {
    this.marketingTargetSubDetailId = marketingTargetSubDetailId;
  }

  public EducationMarketingTargetStruct marketingTargetName(String marketingTargetName) {
    this.marketingTargetName = marketingTargetName;
    return this;
  }

  /**
   * Get marketingTargetName
   *
   * @return marketingTargetName
   */
  @ApiModelProperty(value = "")
  public String getMarketingTargetName() {
    return marketingTargetName;
  }

  public void setMarketingTargetName(String marketingTargetName) {
    this.marketingTargetName = marketingTargetName;
  }

  public EducationMarketingTargetStruct categoryName1(String categoryName1) {
    this.categoryName1 = categoryName1;
    return this;
  }

  /**
   * Get categoryName1
   *
   * @return categoryName1
   */
  @ApiModelProperty(value = "")
  public String getCategoryName1() {
    return categoryName1;
  }

  public void setCategoryName1(String categoryName1) {
    this.categoryName1 = categoryName1;
  }

  public EducationMarketingTargetStruct categoryName2(String categoryName2) {
    this.categoryName2 = categoryName2;
    return this;
  }

  /**
   * Get categoryName2
   *
   * @return categoryName2
   */
  @ApiModelProperty(value = "")
  public String getCategoryName2() {
    return categoryName2;
  }

  public void setCategoryName2(String categoryName2) {
    this.categoryName2 = categoryName2;
  }

  public EducationMarketingTargetStruct categoryName3(String categoryName3) {
    this.categoryName3 = categoryName3;
    return this;
  }

  /**
   * Get categoryName3
   *
   * @return categoryName3
   */
  @ApiModelProperty(value = "")
  public String getCategoryName3() {
    return categoryName3;
  }

  public void setCategoryName3(String categoryName3) {
    this.categoryName3 = categoryName3;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EducationMarketingTargetStruct educationMarketingTargetStruct =
        (EducationMarketingTargetStruct) o;
    return Objects.equals(this.relationshipId, educationMarketingTargetStruct.relationshipId)
        && Objects.equals(this.marketingTargetId, educationMarketingTargetStruct.marketingTargetId)
        && Objects.equals(
            this.marketingTargetType, educationMarketingTargetStruct.marketingTargetType)
        && Objects.equals(
            this.marketingTargetDetailId, educationMarketingTargetStruct.marketingTargetDetailId)
        && Objects.equals(
            this.marketingTargetSubDetailId,
            educationMarketingTargetStruct.marketingTargetSubDetailId)
        && Objects.equals(
            this.marketingTargetName, educationMarketingTargetStruct.marketingTargetName)
        && Objects.equals(this.categoryName1, educationMarketingTargetStruct.categoryName1)
        && Objects.equals(this.categoryName2, educationMarketingTargetStruct.categoryName2)
        && Objects.equals(this.categoryName3, educationMarketingTargetStruct.categoryName3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        relationshipId,
        marketingTargetId,
        marketingTargetType,
        marketingTargetDetailId,
        marketingTargetSubDetailId,
        marketingTargetName,
        categoryName1,
        categoryName2,
        categoryName3);
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
