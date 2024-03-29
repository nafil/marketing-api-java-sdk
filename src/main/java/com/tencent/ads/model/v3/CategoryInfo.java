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

/** 推广资产信息 */
@ApiModel(description = "推广资产信息")
public class CategoryInfo {
  @SerializedName("cate1_id")
  private String cate1Id = null;

  @SerializedName("cate1_name")
  private String cate1Name = null;

  @SerializedName("cate2_id")
  private String cate2Id = null;

  @SerializedName("cate2_name")
  private String cate2Name = null;

  @SerializedName("cate3_id")
  private String cate3Id = null;

  @SerializedName("cate3_name")
  private String cate3Name = null;

  @SerializedName("cate4_id")
  private String cate4Id = null;

  @SerializedName("cate4_name")
  private String cate4Name = null;

  public CategoryInfo cate1Id(String cate1Id) {
    this.cate1Id = cate1Id;
    return this;
  }

  /**
   * Get cate1Id
   *
   * @return cate1Id
   */
  @ApiModelProperty(value = "")
  public String getCate1Id() {
    return cate1Id;
  }

  public void setCate1Id(String cate1Id) {
    this.cate1Id = cate1Id;
  }

  public CategoryInfo cate1Name(String cate1Name) {
    this.cate1Name = cate1Name;
    return this;
  }

  /**
   * Get cate1Name
   *
   * @return cate1Name
   */
  @ApiModelProperty(value = "")
  public String getCate1Name() {
    return cate1Name;
  }

  public void setCate1Name(String cate1Name) {
    this.cate1Name = cate1Name;
  }

  public CategoryInfo cate2Id(String cate2Id) {
    this.cate2Id = cate2Id;
    return this;
  }

  /**
   * Get cate2Id
   *
   * @return cate2Id
   */
  @ApiModelProperty(value = "")
  public String getCate2Id() {
    return cate2Id;
  }

  public void setCate2Id(String cate2Id) {
    this.cate2Id = cate2Id;
  }

  public CategoryInfo cate2Name(String cate2Name) {
    this.cate2Name = cate2Name;
    return this;
  }

  /**
   * Get cate2Name
   *
   * @return cate2Name
   */
  @ApiModelProperty(value = "")
  public String getCate2Name() {
    return cate2Name;
  }

  public void setCate2Name(String cate2Name) {
    this.cate2Name = cate2Name;
  }

  public CategoryInfo cate3Id(String cate3Id) {
    this.cate3Id = cate3Id;
    return this;
  }

  /**
   * Get cate3Id
   *
   * @return cate3Id
   */
  @ApiModelProperty(value = "")
  public String getCate3Id() {
    return cate3Id;
  }

  public void setCate3Id(String cate3Id) {
    this.cate3Id = cate3Id;
  }

  public CategoryInfo cate3Name(String cate3Name) {
    this.cate3Name = cate3Name;
    return this;
  }

  /**
   * Get cate3Name
   *
   * @return cate3Name
   */
  @ApiModelProperty(value = "")
  public String getCate3Name() {
    return cate3Name;
  }

  public void setCate3Name(String cate3Name) {
    this.cate3Name = cate3Name;
  }

  public CategoryInfo cate4Id(String cate4Id) {
    this.cate4Id = cate4Id;
    return this;
  }

  /**
   * Get cate4Id
   *
   * @return cate4Id
   */
  @ApiModelProperty(value = "")
  public String getCate4Id() {
    return cate4Id;
  }

  public void setCate4Id(String cate4Id) {
    this.cate4Id = cate4Id;
  }

  public CategoryInfo cate4Name(String cate4Name) {
    this.cate4Name = cate4Name;
    return this;
  }

  /**
   * Get cate4Name
   *
   * @return cate4Name
   */
  @ApiModelProperty(value = "")
  public String getCate4Name() {
    return cate4Name;
  }

  public void setCate4Name(String cate4Name) {
    this.cate4Name = cate4Name;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryInfo categoryInfo = (CategoryInfo) o;
    return Objects.equals(this.cate1Id, categoryInfo.cate1Id)
        && Objects.equals(this.cate1Name, categoryInfo.cate1Name)
        && Objects.equals(this.cate2Id, categoryInfo.cate2Id)
        && Objects.equals(this.cate2Name, categoryInfo.cate2Name)
        && Objects.equals(this.cate3Id, categoryInfo.cate3Id)
        && Objects.equals(this.cate3Name, categoryInfo.cate3Name)
        && Objects.equals(this.cate4Id, categoryInfo.cate4Id)
        && Objects.equals(this.cate4Name, categoryInfo.cate4Name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cate1Id, cate1Name, cate2Id, cate2Name, cate3Id, cate3Name, cate4Id, cate4Name);
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
