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

/** MuseAiMaterialAddRequest */
public class MuseAiMaterialAddRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("task_id")
  private Long taskId = null;

  @SerializedName("muse_material_list")
  private List<Long> museMaterialList = null;

  public MuseAiMaterialAddRequest accountId(Long accountId) {
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

  public MuseAiMaterialAddRequest taskId(Long taskId) {
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

  public MuseAiMaterialAddRequest museMaterialList(List<Long> museMaterialList) {
    this.museMaterialList = museMaterialList;
    return this;
  }

  public MuseAiMaterialAddRequest addMuseMaterialListItem(Long museMaterialListItem) {
    if (this.museMaterialList == null) {
      this.museMaterialList = new ArrayList<Long>();
    }
    this.museMaterialList.add(museMaterialListItem);
    return this;
  }

  /**
   * Get museMaterialList
   *
   * @return museMaterialList
   */
  @ApiModelProperty(value = "")
  public List<Long> getMuseMaterialList() {
    return museMaterialList;
  }

  public void setMuseMaterialList(List<Long> museMaterialList) {
    this.museMaterialList = museMaterialList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MuseAiMaterialAddRequest museAiMaterialAddRequest = (MuseAiMaterialAddRequest) o;
    return Objects.equals(this.accountId, museAiMaterialAddRequest.accountId)
        && Objects.equals(this.taskId, museAiMaterialAddRequest.taskId)
        && Objects.equals(this.museMaterialList, museAiMaterialAddRequest.museMaterialList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, taskId, museMaterialList);
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