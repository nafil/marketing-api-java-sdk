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

/** RtaexpDataRoiGetResponseData */
public class RtaexpDataRoiGetResponseData {
  @SerializedName("Records")
  private List<RtaExpDataRoiRecord> records = null;

  public RtaexpDataRoiGetResponseData records(List<RtaExpDataRoiRecord> records) {
    this.records = records;
    return this;
  }

  public RtaexpDataRoiGetResponseData addRecordsItem(RtaExpDataRoiRecord recordsItem) {
    if (this.records == null) {
      this.records = new ArrayList<RtaExpDataRoiRecord>();
    }
    this.records.add(recordsItem);
    return this;
  }

  /**
   * Get records
   *
   * @return records
   */
  @ApiModelProperty(value = "")
  public List<RtaExpDataRoiRecord> getRecords() {
    return records;
  }

  public void setRecords(List<RtaExpDataRoiRecord> records) {
    this.records = records;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RtaexpDataRoiGetResponseData rtaexpDataRoiGetResponseData = (RtaexpDataRoiGetResponseData) o;
    return Objects.equals(this.records, rtaexpDataRoiGetResponseData.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(records);
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