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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 支持的计费信息 */
@ApiModel(description = "支持的计费信息")
public class UnsupportBillingSpecAdpermit {
  @SerializedName("site_set")
  private List<String> siteSet = null;

  @SerializedName("billing_event")
  private BillingEvent billingEvent = null;

  @SerializedName("min_price")
  private Long minPrice = null;

  @SerializedName("max_price")
  private Long maxPrice = null;

  @SerializedName("unsupport_type")
  private UnsupportType unsupportType = null;

  public UnsupportBillingSpecAdpermit siteSet(List<String> siteSet) {
    this.siteSet = siteSet;
    return this;
  }

  public UnsupportBillingSpecAdpermit addSiteSetItem(String siteSetItem) {
    if (this.siteSet == null) {
      this.siteSet = new ArrayList<String>();
    }
    this.siteSet.add(siteSetItem);
    return this;
  }

  /**
   * Get siteSet
   *
   * @return siteSet
   */
  @ApiModelProperty(value = "")
  public List<String> getSiteSet() {
    return siteSet;
  }

  public void setSiteSet(List<String> siteSet) {
    this.siteSet = siteSet;
  }

  public UnsupportBillingSpecAdpermit billingEvent(BillingEvent billingEvent) {
    this.billingEvent = billingEvent;
    return this;
  }

  /**
   * Get billingEvent
   *
   * @return billingEvent
   */
  @ApiModelProperty(value = "")
  public BillingEvent getBillingEvent() {
    return billingEvent;
  }

  public void setBillingEvent(BillingEvent billingEvent) {
    this.billingEvent = billingEvent;
  }

  public UnsupportBillingSpecAdpermit minPrice(Long minPrice) {
    this.minPrice = minPrice;
    return this;
  }

  /**
   * Get minPrice
   *
   * @return minPrice
   */
  @ApiModelProperty(value = "")
  public Long getMinPrice() {
    return minPrice;
  }

  public void setMinPrice(Long minPrice) {
    this.minPrice = minPrice;
  }

  public UnsupportBillingSpecAdpermit maxPrice(Long maxPrice) {
    this.maxPrice = maxPrice;
    return this;
  }

  /**
   * Get maxPrice
   *
   * @return maxPrice
   */
  @ApiModelProperty(value = "")
  public Long getMaxPrice() {
    return maxPrice;
  }

  public void setMaxPrice(Long maxPrice) {
    this.maxPrice = maxPrice;
  }

  public UnsupportBillingSpecAdpermit unsupportType(UnsupportType unsupportType) {
    this.unsupportType = unsupportType;
    return this;
  }

  /**
   * Get unsupportType
   *
   * @return unsupportType
   */
  @ApiModelProperty(value = "")
  public UnsupportType getUnsupportType() {
    return unsupportType;
  }

  public void setUnsupportType(UnsupportType unsupportType) {
    this.unsupportType = unsupportType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnsupportBillingSpecAdpermit unsupportBillingSpecAdpermit = (UnsupportBillingSpecAdpermit) o;
    return Objects.equals(this.siteSet, unsupportBillingSpecAdpermit.siteSet)
        && Objects.equals(this.billingEvent, unsupportBillingSpecAdpermit.billingEvent)
        && Objects.equals(this.minPrice, unsupportBillingSpecAdpermit.minPrice)
        && Objects.equals(this.maxPrice, unsupportBillingSpecAdpermit.maxPrice)
        && Objects.equals(this.unsupportType, unsupportBillingSpecAdpermit.unsupportType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siteSet, billingEvent, minPrice, maxPrice, unsupportType);
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