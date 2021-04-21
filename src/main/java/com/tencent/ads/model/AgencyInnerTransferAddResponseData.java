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
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** AgencyInnerTransferAddResponseData */
public class AgencyInnerTransferAddResponseData {
  @SerializedName("fund_type_from")
  private AccountTypeMapInnerTransfer fundTypeFrom = null;

  @SerializedName("fund_type_to")
  private AccountTypeMapInnerTransfer fundTypeTo = null;

  @SerializedName("amount")
  private Long amount = null;

  @SerializedName("external_bill_no")
  private String externalBillNo = null;

  @SerializedName("is_repeated")
  private ModelBoolean isRepeated = null;

  @SerializedName("time")
  private Long time = null;

  public AgencyInnerTransferAddResponseData fundTypeFrom(AccountTypeMapInnerTransfer fundTypeFrom) {
    this.fundTypeFrom = fundTypeFrom;
    return this;
  }

  /**
   * Get fundTypeFrom
   *
   * @return fundTypeFrom
   */
  @ApiModelProperty(value = "")
  public AccountTypeMapInnerTransfer getFundTypeFrom() {
    return fundTypeFrom;
  }

  public void setFundTypeFrom(AccountTypeMapInnerTransfer fundTypeFrom) {
    this.fundTypeFrom = fundTypeFrom;
  }

  public AgencyInnerTransferAddResponseData fundTypeTo(AccountTypeMapInnerTransfer fundTypeTo) {
    this.fundTypeTo = fundTypeTo;
    return this;
  }

  /**
   * Get fundTypeTo
   *
   * @return fundTypeTo
   */
  @ApiModelProperty(value = "")
  public AccountTypeMapInnerTransfer getFundTypeTo() {
    return fundTypeTo;
  }

  public void setFundTypeTo(AccountTypeMapInnerTransfer fundTypeTo) {
    this.fundTypeTo = fundTypeTo;
  }

  public AgencyInnerTransferAddResponseData amount(Long amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   *
   * @return amount
   */
  @ApiModelProperty(value = "")
  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public AgencyInnerTransferAddResponseData externalBillNo(String externalBillNo) {
    this.externalBillNo = externalBillNo;
    return this;
  }

  /**
   * Get externalBillNo
   *
   * @return externalBillNo
   */
  @ApiModelProperty(value = "")
  public String getExternalBillNo() {
    return externalBillNo;
  }

  public void setExternalBillNo(String externalBillNo) {
    this.externalBillNo = externalBillNo;
  }

  public AgencyInnerTransferAddResponseData isRepeated(ModelBoolean isRepeated) {
    this.isRepeated = isRepeated;
    return this;
  }

  /**
   * Get isRepeated
   *
   * @return isRepeated
   */
  @ApiModelProperty(value = "")
  public ModelBoolean getIsRepeated() {
    return isRepeated;
  }

  public void setIsRepeated(ModelBoolean isRepeated) {
    this.isRepeated = isRepeated;
  }

  public AgencyInnerTransferAddResponseData time(Long time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   *
   * @return time
   */
  @ApiModelProperty(value = "")
  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgencyInnerTransferAddResponseData agencyInnerTransferAddResponseData =
        (AgencyInnerTransferAddResponseData) o;
    return Objects.equals(this.fundTypeFrom, agencyInnerTransferAddResponseData.fundTypeFrom)
        && Objects.equals(this.fundTypeTo, agencyInnerTransferAddResponseData.fundTypeTo)
        && Objects.equals(this.amount, agencyInnerTransferAddResponseData.amount)
        && Objects.equals(this.externalBillNo, agencyInnerTransferAddResponseData.externalBillNo)
        && Objects.equals(this.isRepeated, agencyInnerTransferAddResponseData.isRepeated)
        && Objects.equals(this.time, agencyInnerTransferAddResponseData.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundTypeFrom, fundTypeTo, amount, externalBillNo, isRepeated, time);
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