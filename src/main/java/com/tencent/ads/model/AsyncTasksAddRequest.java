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

/** AsyncTasksAddRequest */
public class AsyncTasksAddRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("task_name")
  private String taskName = null;

  @SerializedName("task_type")
  private TaskType taskType = null;

  @SerializedName("task_spec")
  private TaskSpec taskSpec = null;

  @SerializedName("weixin_official_accounts_upgrade_enabled")
  private Boolean weixinOfficialAccountsUpgradeEnabled = null;

  public AsyncTasksAddRequest accountId(Long accountId) {
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

  public AsyncTasksAddRequest taskName(String taskName) {
    this.taskName = taskName;
    return this;
  }

  /**
   * Get taskName
   *
   * @return taskName
   */
  @ApiModelProperty(value = "")
  public String getTaskName() {
    return taskName;
  }

  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }

  public AsyncTasksAddRequest taskType(TaskType taskType) {
    this.taskType = taskType;
    return this;
  }

  /**
   * Get taskType
   *
   * @return taskType
   */
  @ApiModelProperty(value = "")
  public TaskType getTaskType() {
    return taskType;
  }

  public void setTaskType(TaskType taskType) {
    this.taskType = taskType;
  }

  public AsyncTasksAddRequest taskSpec(TaskSpec taskSpec) {
    this.taskSpec = taskSpec;
    return this;
  }

  /**
   * Get taskSpec
   *
   * @return taskSpec
   */
  @ApiModelProperty(value = "")
  public TaskSpec getTaskSpec() {
    return taskSpec;
  }

  public void setTaskSpec(TaskSpec taskSpec) {
    this.taskSpec = taskSpec;
  }

  public AsyncTasksAddRequest weixinOfficialAccountsUpgradeEnabled(
      Boolean weixinOfficialAccountsUpgradeEnabled) {
    this.weixinOfficialAccountsUpgradeEnabled = weixinOfficialAccountsUpgradeEnabled;
    return this;
  }

  /**
   * Get weixinOfficialAccountsUpgradeEnabled
   *
   * @return weixinOfficialAccountsUpgradeEnabled
   */
  @ApiModelProperty(value = "")
  public Boolean isWeixinOfficialAccountsUpgradeEnabled() {
    return weixinOfficialAccountsUpgradeEnabled;
  }

  public void setWeixinOfficialAccountsUpgradeEnabled(
      Boolean weixinOfficialAccountsUpgradeEnabled) {
    this.weixinOfficialAccountsUpgradeEnabled = weixinOfficialAccountsUpgradeEnabled;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncTasksAddRequest asyncTasksAddRequest = (AsyncTasksAddRequest) o;
    return Objects.equals(this.accountId, asyncTasksAddRequest.accountId)
        && Objects.equals(this.taskName, asyncTasksAddRequest.taskName)
        && Objects.equals(this.taskType, asyncTasksAddRequest.taskType)
        && Objects.equals(this.taskSpec, asyncTasksAddRequest.taskSpec)
        && Objects.equals(
            this.weixinOfficialAccountsUpgradeEnabled,
            asyncTasksAddRequest.weixinOfficialAccountsUpgradeEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId, taskName, taskType, taskSpec, weixinOfficialAccountsUpgradeEnabled);
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
