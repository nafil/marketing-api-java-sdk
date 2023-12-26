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

/** AsyncReportsAddRequest */
public class AsyncReportsAddRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("task_name")
  private String taskName = null;

  @SerializedName("report_fields")
  private List<String> reportFields = null;

  @SerializedName("level")
  private AsyncReportLevel level = null;

  @SerializedName("filtering")
  private List<AsyncReportsFilteringStruct> filtering = null;

  @SerializedName("time_line")
  private TimeLine timeLine = null;

  @SerializedName("group_by")
  private List<String> groupBy = null;

  @SerializedName("granularity")
  private ReportGranularity granularity = null;

  @SerializedName("date")
  private String date = null;

  public AsyncReportsAddRequest accountId(Long accountId) {
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

  public AsyncReportsAddRequest taskName(String taskName) {
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

  public AsyncReportsAddRequest reportFields(List<String> reportFields) {
    this.reportFields = reportFields;
    return this;
  }

  public AsyncReportsAddRequest addReportFieldsItem(String reportFieldsItem) {
    if (this.reportFields == null) {
      this.reportFields = new ArrayList<String>();
    }
    this.reportFields.add(reportFieldsItem);
    return this;
  }

  /**
   * Get reportFields
   *
   * @return reportFields
   */
  @ApiModelProperty(value = "")
  public List<String> getReportFields() {
    return reportFields;
  }

  public void setReportFields(List<String> reportFields) {
    this.reportFields = reportFields;
  }

  public AsyncReportsAddRequest level(AsyncReportLevel level) {
    this.level = level;
    return this;
  }

  /**
   * Get level
   *
   * @return level
   */
  @ApiModelProperty(value = "")
  public AsyncReportLevel getLevel() {
    return level;
  }

  public void setLevel(AsyncReportLevel level) {
    this.level = level;
  }

  public AsyncReportsAddRequest filtering(List<AsyncReportsFilteringStruct> filtering) {
    this.filtering = filtering;
    return this;
  }

  public AsyncReportsAddRequest addFilteringItem(AsyncReportsFilteringStruct filteringItem) {
    if (this.filtering == null) {
      this.filtering = new ArrayList<AsyncReportsFilteringStruct>();
    }
    this.filtering.add(filteringItem);
    return this;
  }

  /**
   * Get filtering
   *
   * @return filtering
   */
  @ApiModelProperty(value = "")
  public List<AsyncReportsFilteringStruct> getFiltering() {
    return filtering;
  }

  public void setFiltering(List<AsyncReportsFilteringStruct> filtering) {
    this.filtering = filtering;
  }

  public AsyncReportsAddRequest timeLine(TimeLine timeLine) {
    this.timeLine = timeLine;
    return this;
  }

  /**
   * Get timeLine
   *
   * @return timeLine
   */
  @ApiModelProperty(value = "")
  public TimeLine getTimeLine() {
    return timeLine;
  }

  public void setTimeLine(TimeLine timeLine) {
    this.timeLine = timeLine;
  }

  public AsyncReportsAddRequest groupBy(List<String> groupBy) {
    this.groupBy = groupBy;
    return this;
  }

  public AsyncReportsAddRequest addGroupByItem(String groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<String>();
    }
    this.groupBy.add(groupByItem);
    return this;
  }

  /**
   * Get groupBy
   *
   * @return groupBy
   */
  @ApiModelProperty(value = "")
  public List<String> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<String> groupBy) {
    this.groupBy = groupBy;
  }

  public AsyncReportsAddRequest granularity(ReportGranularity granularity) {
    this.granularity = granularity;
    return this;
  }

  /**
   * Get granularity
   *
   * @return granularity
   */
  @ApiModelProperty(value = "")
  public ReportGranularity getGranularity() {
    return granularity;
  }

  public void setGranularity(ReportGranularity granularity) {
    this.granularity = granularity;
  }

  public AsyncReportsAddRequest date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   *
   * @return date
   */
  @ApiModelProperty(value = "")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncReportsAddRequest asyncReportsAddRequest = (AsyncReportsAddRequest) o;
    return Objects.equals(this.accountId, asyncReportsAddRequest.accountId)
        && Objects.equals(this.taskName, asyncReportsAddRequest.taskName)
        && Objects.equals(this.reportFields, asyncReportsAddRequest.reportFields)
        && Objects.equals(this.level, asyncReportsAddRequest.level)
        && Objects.equals(this.filtering, asyncReportsAddRequest.filtering)
        && Objects.equals(this.timeLine, asyncReportsAddRequest.timeLine)
        && Objects.equals(this.groupBy, asyncReportsAddRequest.groupBy)
        && Objects.equals(this.granularity, asyncReportsAddRequest.granularity)
        && Objects.equals(this.date, asyncReportsAddRequest.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId, taskName, reportFields, level, filtering, timeLine, groupBy, granularity, date);
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