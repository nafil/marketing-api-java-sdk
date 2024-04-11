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

/** 绑定失败的记录 */
@ApiModel(description = "绑定失败的记录")
public class RtaTargetBindAddRecordError {
  @SerializedName("Id")
  private Long id = null;

  @SerializedName("OuterTargetId")
  private String outerTargetId = null;

  @SerializedName("TargetType")
  private Long targetType = null;

  @SerializedName("IsMp")
  private Long isMp = null;

  @SerializedName("UId")
  private Long uid = null;

  @SerializedName("reason")
  private String reason = null;

  public RtaTargetBindAddRecordError id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   *
   * @return id
   */
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RtaTargetBindAddRecordError outerTargetId(String outerTargetId) {
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

  public RtaTargetBindAddRecordError targetType(Long targetType) {
    this.targetType = targetType;
    return this;
  }

  /**
   * Get targetType
   *
   * @return targetType
   */
  @ApiModelProperty(value = "")
  public Long getTargetType() {
    return targetType;
  }

  public void setTargetType(Long targetType) {
    this.targetType = targetType;
  }

  public RtaTargetBindAddRecordError isMp(Long isMp) {
    this.isMp = isMp;
    return this;
  }

  /**
   * Get isMp
   *
   * @return isMp
   */
  @ApiModelProperty(value = "")
  public Long getIsMp() {
    return isMp;
  }

  public void setIsMp(Long isMp) {
    this.isMp = isMp;
  }

  public RtaTargetBindAddRecordError uid(Long uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Get uid
   *
   * @return uid
   */
  @ApiModelProperty(value = "")
  public Long getUid() {
    return uid;
  }

  public void setUid(Long uid) {
    this.uid = uid;
  }

  public RtaTargetBindAddRecordError reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   *
   * @return reason
   */
  @ApiModelProperty(value = "")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RtaTargetBindAddRecordError rtaTargetBindAddRecordError = (RtaTargetBindAddRecordError) o;
    return Objects.equals(this.id, rtaTargetBindAddRecordError.id)
        && Objects.equals(this.outerTargetId, rtaTargetBindAddRecordError.outerTargetId)
        && Objects.equals(this.targetType, rtaTargetBindAddRecordError.targetType)
        && Objects.equals(this.isMp, rtaTargetBindAddRecordError.isMp)
        && Objects.equals(this.uid, rtaTargetBindAddRecordError.uid)
        && Objects.equals(this.reason, rtaTargetBindAddRecordError.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, outerTargetId, targetType, isMp, uid, reason);
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
