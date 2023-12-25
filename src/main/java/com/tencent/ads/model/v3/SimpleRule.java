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

/** 组合人群简单规则 */
@ApiModel(description = "组合人群简单规则")
public class SimpleRule {
  @SerializedName("audience_id")
  private Long audienceId = null;

  @SerializedName("time_window")
  private Long timeWindow = null;

  public SimpleRule audienceId(Long audienceId) {
    this.audienceId = audienceId;
    return this;
  }

  /**
   * Get audienceId
   *
   * @return audienceId
   */
  @ApiModelProperty(value = "")
  public Long getAudienceId() {
    return audienceId;
  }

  public void setAudienceId(Long audienceId) {
    this.audienceId = audienceId;
  }

  public SimpleRule timeWindow(Long timeWindow) {
    this.timeWindow = timeWindow;
    return this;
  }

  /**
   * Get timeWindow
   *
   * @return timeWindow
   */
  @ApiModelProperty(value = "")
  public Long getTimeWindow() {
    return timeWindow;
  }

  public void setTimeWindow(Long timeWindow) {
    this.timeWindow = timeWindow;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleRule simpleRule = (SimpleRule) o;
    return Objects.equals(this.audienceId, simpleRule.audienceId)
        && Objects.equals(this.timeWindow, simpleRule.timeWindow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceId, timeWindow);
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
