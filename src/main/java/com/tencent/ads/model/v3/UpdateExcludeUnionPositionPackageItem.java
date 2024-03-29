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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 修改广告组屏蔽优量汇流量包信息 */
@ApiModel(description = "修改广告组屏蔽优量汇流量包信息")
public class UpdateExcludeUnionPositionPackageItem {
  @SerializedName("adgroup_id")
  private Long adgroupId = null;

  @SerializedName("exclude_union_position_package")
  private List<Long> excludeUnionPositionPackage = null;

  public UpdateExcludeUnionPositionPackageItem adgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
    return this;
  }

  /**
   * Get adgroupId
   *
   * @return adgroupId
   */
  @ApiModelProperty(value = "")
  public Long getAdgroupId() {
    return adgroupId;
  }

  public void setAdgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
  }

  public UpdateExcludeUnionPositionPackageItem excludeUnionPositionPackage(
      List<Long> excludeUnionPositionPackage) {
    this.excludeUnionPositionPackage = excludeUnionPositionPackage;
    return this;
  }

  public UpdateExcludeUnionPositionPackageItem addExcludeUnionPositionPackageItem(
      Long excludeUnionPositionPackageItem) {
    if (this.excludeUnionPositionPackage == null) {
      this.excludeUnionPositionPackage = new ArrayList<Long>();
    }
    this.excludeUnionPositionPackage.add(excludeUnionPositionPackageItem);
    return this;
  }

  /**
   * Get excludeUnionPositionPackage
   *
   * @return excludeUnionPositionPackage
   */
  @ApiModelProperty(value = "")
  public List<Long> getExcludeUnionPositionPackage() {
    return excludeUnionPositionPackage;
  }

  public void setExcludeUnionPositionPackage(List<Long> excludeUnionPositionPackage) {
    this.excludeUnionPositionPackage = excludeUnionPositionPackage;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateExcludeUnionPositionPackageItem updateExcludeUnionPositionPackageItem =
        (UpdateExcludeUnionPositionPackageItem) o;
    return Objects.equals(this.adgroupId, updateExcludeUnionPositionPackageItem.adgroupId)
        && Objects.equals(
            this.excludeUnionPositionPackage,
            updateExcludeUnionPositionPackageItem.excludeUnionPositionPackage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adgroupId, excludeUnionPositionPackage);
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
