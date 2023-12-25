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

/** 返回结构 */
@ApiModel(description = "返回结构")
public class FundsGetListStruct {
  @SerializedName("fund_type")
  private AccountTypeMap fundType = null;

  @SerializedName("balance")
  private Long balance = null;

  @SerializedName("fund_status")
  private FundStatus fundStatus = null;

  @SerializedName("realtime_cost")
  private Long realtimeCost = null;

  @SerializedName("effect_funds")
  private List<String> effectFunds = null;

  public FundsGetListStruct fundType(AccountTypeMap fundType) {
    this.fundType = fundType;
    return this;
  }

  /**
   * Get fundType
   *
   * @return fundType
   */
  @ApiModelProperty(value = "")
  public AccountTypeMap getFundType() {
    return fundType;
  }

  public void setFundType(AccountTypeMap fundType) {
    this.fundType = fundType;
  }

  public FundsGetListStruct balance(Long balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   *
   * @return balance
   */
  @ApiModelProperty(value = "")
  public Long getBalance() {
    return balance;
  }

  public void setBalance(Long balance) {
    this.balance = balance;
  }

  public FundsGetListStruct fundStatus(FundStatus fundStatus) {
    this.fundStatus = fundStatus;
    return this;
  }

  /**
   * Get fundStatus
   *
   * @return fundStatus
   */
  @ApiModelProperty(value = "")
  public FundStatus getFundStatus() {
    return fundStatus;
  }

  public void setFundStatus(FundStatus fundStatus) {
    this.fundStatus = fundStatus;
  }

  public FundsGetListStruct realtimeCost(Long realtimeCost) {
    this.realtimeCost = realtimeCost;
    return this;
  }

  /**
   * Get realtimeCost
   *
   * @return realtimeCost
   */
  @ApiModelProperty(value = "")
  public Long getRealtimeCost() {
    return realtimeCost;
  }

  public void setRealtimeCost(Long realtimeCost) {
    this.realtimeCost = realtimeCost;
  }

  public FundsGetListStruct effectFunds(List<String> effectFunds) {
    this.effectFunds = effectFunds;
    return this;
  }

  public FundsGetListStruct addEffectFundsItem(String effectFundsItem) {
    if (this.effectFunds == null) {
      this.effectFunds = new ArrayList<String>();
    }
    this.effectFunds.add(effectFundsItem);
    return this;
  }

  /**
   * Get effectFunds
   *
   * @return effectFunds
   */
  @ApiModelProperty(value = "")
  public List<String> getEffectFunds() {
    return effectFunds;
  }

  public void setEffectFunds(List<String> effectFunds) {
    this.effectFunds = effectFunds;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundsGetListStruct fundsGetListStruct = (FundsGetListStruct) o;
    return Objects.equals(this.fundType, fundsGetListStruct.fundType)
        && Objects.equals(this.balance, fundsGetListStruct.balance)
        && Objects.equals(this.fundStatus, fundsGetListStruct.fundStatus)
        && Objects.equals(this.realtimeCost, fundsGetListStruct.realtimeCost)
        && Objects.equals(this.effectFunds, fundsGetListStruct.effectFunds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundType, balance, fundStatus, realtimeCost, effectFunds);
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
