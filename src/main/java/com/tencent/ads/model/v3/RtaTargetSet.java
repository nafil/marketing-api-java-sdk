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

/** 新增RTA策略信息 */
@ApiModel(description = "新增RTA策略信息")
public class RtaTargetSet {
  @SerializedName("OuterTargetId")
  private String outerTargetId = null;

  @SerializedName("TargetName")
  private String targetName = null;

  public RtaTargetSet outerTargetId(String outerTargetId) {
    this.outerTargetId = outerTargetId;
    return this;
  }

  /**
   * Get outerTargetId
   *
   * @return outerTargetId
   */
  @ApiModelProperty(value = "")
  public String getOuterTargetId() {
    return outerTargetId;
  }

  public void setOuterTargetId(String outerTargetId) {
    this.outerTargetId = outerTargetId;
  }

  public RtaTargetSet targetName(String targetName) {
    this.targetName = targetName;
    return this;
  }

  /**
   * Get targetName
   *
   * @return targetName
   */
  @ApiModelProperty(value = "")
  public String getTargetName() {
    return targetName;
  }

  public void setTargetName(String targetName) {
    this.targetName = targetName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RtaTargetSet rtaTargetSet = (RtaTargetSet) o;
    return Objects.equals(this.outerTargetId, rtaTargetSet.outerTargetId)
        && Objects.equals(this.targetName, rtaTargetSet.targetName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outerTargetId, targetName);
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
