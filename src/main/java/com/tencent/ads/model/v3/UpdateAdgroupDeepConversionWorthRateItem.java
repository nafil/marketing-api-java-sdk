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

/** 修改广告组深度优化价值的期望 ROI */
@ApiModel(description = "修改广告组深度优化价值的期望 ROI")
public class UpdateAdgroupDeepConversionWorthRateItem {
  @SerializedName("adgroup_id")
  private Long adgroupId = null;

  @SerializedName("deep_conversion_worth_rate")
  private Double deepConversionWorthRate = null;

  @SerializedName("account_id")
  private Long accountId = null;

  public UpdateAdgroupDeepConversionWorthRateItem adgroupId(Long adgroupId) {
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

  public UpdateAdgroupDeepConversionWorthRateItem deepConversionWorthRate(
      Double deepConversionWorthRate) {
    this.deepConversionWorthRate = deepConversionWorthRate;
    return this;
  }

  /**
   * Get deepConversionWorthRate
   *
   * @return deepConversionWorthRate
   */
  @ApiModelProperty(value = "")
  public Double getDeepConversionWorthRate() {
    return deepConversionWorthRate;
  }

  public void setDeepConversionWorthRate(Double deepConversionWorthRate) {
    this.deepConversionWorthRate = deepConversionWorthRate;
  }

  public UpdateAdgroupDeepConversionWorthRateItem accountId(Long accountId) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAdgroupDeepConversionWorthRateItem updateAdgroupDeepConversionWorthRateItem =
        (UpdateAdgroupDeepConversionWorthRateItem) o;
    return Objects.equals(this.adgroupId, updateAdgroupDeepConversionWorthRateItem.adgroupId)
        && Objects.equals(
            this.deepConversionWorthRate,
            updateAdgroupDeepConversionWorthRateItem.deepConversionWorthRate)
        && Objects.equals(this.accountId, updateAdgroupDeepConversionWorthRateItem.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adgroupId, deepConversionWorthRate, accountId);
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
