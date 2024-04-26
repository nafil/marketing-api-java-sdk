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

/** 获取行为定向标签的条件 */
@ApiModel(description = "获取行为定向标签的条件")
public class BehaviorTargetingTagSpec {
  @SerializedName("query_mode")
  private TargetingTagQueryMode queryMode = null;

  @SerializedName("query_spec")
  private QuerySpec querySpec = null;

  public BehaviorTargetingTagSpec queryMode(TargetingTagQueryMode queryMode) {
    this.queryMode = queryMode;
    return this;
  }

  /**
   * Get queryMode
   *
   * @return queryMode
   */
  @ApiModelProperty(value = "")
  public TargetingTagQueryMode getQueryMode() {
    return queryMode;
  }

  public void setQueryMode(TargetingTagQueryMode queryMode) {
    this.queryMode = queryMode;
  }

  public BehaviorTargetingTagSpec querySpec(QuerySpec querySpec) {
    this.querySpec = querySpec;
    return this;
  }

  /**
   * Get querySpec
   *
   * @return querySpec
   */
  @ApiModelProperty(value = "")
  public QuerySpec getQuerySpec() {
    return querySpec;
  }

  public void setQuerySpec(QuerySpec querySpec) {
    this.querySpec = querySpec;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BehaviorTargetingTagSpec behaviorTargetingTagSpec = (BehaviorTargetingTagSpec) o;
    return Objects.equals(this.queryMode, behaviorTargetingTagSpec.queryMode)
        && Objects.equals(this.querySpec, behaviorTargetingTagSpec.querySpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryMode, querySpec);
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