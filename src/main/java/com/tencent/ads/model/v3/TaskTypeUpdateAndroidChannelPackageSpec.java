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

/** 更新应用宝渠道包接口任务所需条件 */
@ApiModel(description = "更新应用宝渠道包接口任务所需条件")
public class TaskTypeUpdateAndroidChannelPackageSpec {
  @SerializedName("myapp_auth_key")
  private String myappAuthKey = null;

  @SerializedName("android_app_id")
  private Long androidAppId = null;

  @SerializedName("android_channel_package_spec")
  private List<UpdateAndroidChannelPackageSpec> androidChannelPackageSpec = null;

  public TaskTypeUpdateAndroidChannelPackageSpec myappAuthKey(String myappAuthKey) {
    this.myappAuthKey = myappAuthKey;
    return this;
  }

  /**
   * Get myappAuthKey
   *
   * @return myappAuthKey
   */
  @ApiModelProperty(value = "")
  public String getMyappAuthKey() {
    return myappAuthKey;
  }

  public void setMyappAuthKey(String myappAuthKey) {
    this.myappAuthKey = myappAuthKey;
  }

  public TaskTypeUpdateAndroidChannelPackageSpec androidAppId(Long androidAppId) {
    this.androidAppId = androidAppId;
    return this;
  }

  /**
   * Get androidAppId
   *
   * @return androidAppId
   */
  @ApiModelProperty(value = "")
  public Long getAndroidAppId() {
    return androidAppId;
  }

  public void setAndroidAppId(Long androidAppId) {
    this.androidAppId = androidAppId;
  }

  public TaskTypeUpdateAndroidChannelPackageSpec androidChannelPackageSpec(
      List<UpdateAndroidChannelPackageSpec> androidChannelPackageSpec) {
    this.androidChannelPackageSpec = androidChannelPackageSpec;
    return this;
  }

  public TaskTypeUpdateAndroidChannelPackageSpec addAndroidChannelPackageSpecItem(
      UpdateAndroidChannelPackageSpec androidChannelPackageSpecItem) {
    if (this.androidChannelPackageSpec == null) {
      this.androidChannelPackageSpec = new ArrayList<UpdateAndroidChannelPackageSpec>();
    }
    this.androidChannelPackageSpec.add(androidChannelPackageSpecItem);
    return this;
  }

  /**
   * Get androidChannelPackageSpec
   *
   * @return androidChannelPackageSpec
   */
  @ApiModelProperty(value = "")
  public List<UpdateAndroidChannelPackageSpec> getAndroidChannelPackageSpec() {
    return androidChannelPackageSpec;
  }

  public void setAndroidChannelPackageSpec(
      List<UpdateAndroidChannelPackageSpec> androidChannelPackageSpec) {
    this.androidChannelPackageSpec = androidChannelPackageSpec;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskTypeUpdateAndroidChannelPackageSpec taskTypeUpdateAndroidChannelPackageSpec =
        (TaskTypeUpdateAndroidChannelPackageSpec) o;
    return Objects.equals(this.myappAuthKey, taskTypeUpdateAndroidChannelPackageSpec.myappAuthKey)
        && Objects.equals(this.androidAppId, taskTypeUpdateAndroidChannelPackageSpec.androidAppId)
        && Objects.equals(
            this.androidChannelPackageSpec,
            taskTypeUpdateAndroidChannelPackageSpec.androidChannelPackageSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myappAuthKey, androidAppId, androidChannelPackageSpec);
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
