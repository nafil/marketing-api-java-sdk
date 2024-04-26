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

/** MuseAiMaterialAddResponseData */
public class MuseAiMaterialAddResponseData {
  @SerializedName("task_id")
  private Long taskId = null;

  @SerializedName("result")
  private List<MuseAiMaterialSaveResultItem> result = null;

  public MuseAiMaterialAddResponseData taskId(Long taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * Get taskId
   *
   * @return taskId
   */
  @ApiModelProperty(value = "")
  public Long getTaskId() {
    return taskId;
  }

  public void setTaskId(Long taskId) {
    this.taskId = taskId;
  }

  public MuseAiMaterialAddResponseData result(List<MuseAiMaterialSaveResultItem> result) {
    this.result = result;
    return this;
  }

  public MuseAiMaterialAddResponseData addResultItem(MuseAiMaterialSaveResultItem resultItem) {
    if (this.result == null) {
      this.result = new ArrayList<MuseAiMaterialSaveResultItem>();
    }
    this.result.add(resultItem);
    return this;
  }

  /**
   * Get result
   *
   * @return result
   */
  @ApiModelProperty(value = "")
  public List<MuseAiMaterialSaveResultItem> getResult() {
    return result;
  }

  public void setResult(List<MuseAiMaterialSaveResultItem> result) {
    this.result = result;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MuseAiMaterialAddResponseData museAiMaterialAddResponseData = (MuseAiMaterialAddResponseData) o;
    return Objects.equals(this.taskId, museAiMaterialAddResponseData.taskId)
        && Objects.equals(this.result, museAiMaterialAddResponseData.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskId, result);
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
