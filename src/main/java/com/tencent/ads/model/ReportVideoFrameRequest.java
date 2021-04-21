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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ReportVideoFrameRequest */
public class ReportVideoFrameRequest {
  @SerializedName("filtering")
  private List<FilteringStruct> filtering = null;

  @SerializedName("date_range")
  private DateRange dateRange = null;

  @SerializedName("group_by")
  private List<String> groupBy = null;

  @SerializedName("account_id")
  private Long accountId = null;

  public ReportVideoFrameRequest filtering(List<FilteringStruct> filtering) {
    this.filtering = filtering;
    return this;
  }

  public ReportVideoFrameRequest addFilteringItem(FilteringStruct filteringItem) {
    if (this.filtering == null) {
      this.filtering = new ArrayList<FilteringStruct>();
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
  public List<FilteringStruct> getFiltering() {
    return filtering;
  }

  public void setFiltering(List<FilteringStruct> filtering) {
    this.filtering = filtering;
  }

  public ReportVideoFrameRequest dateRange(DateRange dateRange) {
    this.dateRange = dateRange;
    return this;
  }

  /**
   * Get dateRange
   *
   * @return dateRange
   */
  @ApiModelProperty(value = "")
  public DateRange getDateRange() {
    return dateRange;
  }

  public void setDateRange(DateRange dateRange) {
    this.dateRange = dateRange;
  }

  public ReportVideoFrameRequest groupBy(List<String> groupBy) {
    this.groupBy = groupBy;
    return this;
  }

  public ReportVideoFrameRequest addGroupByItem(String groupByItem) {
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

  public ReportVideoFrameRequest accountId(Long accountId) {
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
    ReportVideoFrameRequest reportVideoFrameRequest = (ReportVideoFrameRequest) o;
    return Objects.equals(this.filtering, reportVideoFrameRequest.filtering)
        && Objects.equals(this.dateRange, reportVideoFrameRequest.dateRange)
        && Objects.equals(this.groupBy, reportVideoFrameRequest.groupBy)
        && Objects.equals(this.accountId, reportVideoFrameRequest.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filtering, dateRange, groupBy, accountId);
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