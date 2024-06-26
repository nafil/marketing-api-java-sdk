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

/** JointBudgetRulesUpdateRequest */
public class JointBudgetRulesUpdateRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("joint_budget_rule_id")
  private Long jointBudgetRuleId = null;

  @SerializedName("joint_budget_rule_name")
  private String jointBudgetRuleName = null;

  @SerializedName("daily_budget")
  private Long dailyBudget = null;

  @SerializedName("total_budget")
  private Long totalBudget = null;

  @SerializedName("adgroup_id_list")
  private List<Long> adgroupIdList = null;

  public JointBudgetRulesUpdateRequest accountId(Long accountId) {
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

  public JointBudgetRulesUpdateRequest jointBudgetRuleId(Long jointBudgetRuleId) {
    this.jointBudgetRuleId = jointBudgetRuleId;
    return this;
  }

  /**
   * Get jointBudgetRuleId
   *
   * @return jointBudgetRuleId
   */
  @ApiModelProperty(value = "")
  public Long getJointBudgetRuleId() {
    return jointBudgetRuleId;
  }

  public void setJointBudgetRuleId(Long jointBudgetRuleId) {
    this.jointBudgetRuleId = jointBudgetRuleId;
  }

  public JointBudgetRulesUpdateRequest jointBudgetRuleName(String jointBudgetRuleName) {
    this.jointBudgetRuleName = jointBudgetRuleName;
    return this;
  }

  /**
   * Get jointBudgetRuleName
   *
   * @return jointBudgetRuleName
   */
  @ApiModelProperty(value = "")
  public String getJointBudgetRuleName() {
    return jointBudgetRuleName;
  }

  public void setJointBudgetRuleName(String jointBudgetRuleName) {
    this.jointBudgetRuleName = jointBudgetRuleName;
  }

  public JointBudgetRulesUpdateRequest dailyBudget(Long dailyBudget) {
    this.dailyBudget = dailyBudget;
    return this;
  }

  /**
   * Get dailyBudget
   *
   * @return dailyBudget
   */
  @ApiModelProperty(value = "")
  public Long getDailyBudget() {
    return dailyBudget;
  }

  public void setDailyBudget(Long dailyBudget) {
    this.dailyBudget = dailyBudget;
  }

  public JointBudgetRulesUpdateRequest totalBudget(Long totalBudget) {
    this.totalBudget = totalBudget;
    return this;
  }

  /**
   * Get totalBudget
   *
   * @return totalBudget
   */
  @ApiModelProperty(value = "")
  public Long getTotalBudget() {
    return totalBudget;
  }

  public void setTotalBudget(Long totalBudget) {
    this.totalBudget = totalBudget;
  }

  public JointBudgetRulesUpdateRequest adgroupIdList(List<Long> adgroupIdList) {
    this.adgroupIdList = adgroupIdList;
    return this;
  }

  public JointBudgetRulesUpdateRequest addAdgroupIdListItem(Long adgroupIdListItem) {
    if (this.adgroupIdList == null) {
      this.adgroupIdList = new ArrayList<Long>();
    }
    this.adgroupIdList.add(adgroupIdListItem);
    return this;
  }

  /**
   * Get adgroupIdList
   *
   * @return adgroupIdList
   */
  @ApiModelProperty(value = "")
  public List<Long> getAdgroupIdList() {
    return adgroupIdList;
  }

  public void setAdgroupIdList(List<Long> adgroupIdList) {
    this.adgroupIdList = adgroupIdList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JointBudgetRulesUpdateRequest jointBudgetRulesUpdateRequest = (JointBudgetRulesUpdateRequest) o;
    return Objects.equals(this.accountId, jointBudgetRulesUpdateRequest.accountId)
        && Objects.equals(this.jointBudgetRuleId, jointBudgetRulesUpdateRequest.jointBudgetRuleId)
        && Objects.equals(
            this.jointBudgetRuleName, jointBudgetRulesUpdateRequest.jointBudgetRuleName)
        && Objects.equals(this.dailyBudget, jointBudgetRulesUpdateRequest.dailyBudget)
        && Objects.equals(this.totalBudget, jointBudgetRulesUpdateRequest.totalBudget)
        && Objects.equals(this.adgroupIdList, jointBudgetRulesUpdateRequest.adgroupIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId, jointBudgetRuleId, jointBudgetRuleName, dailyBudget, totalBudget, adgroupIdList);
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
