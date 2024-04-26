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
import java.util.Objects;

/** MuseAiTaskAddRequest */
public class MuseAiTaskAddRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("task_type")
  private MuseAiTaskType taskType = null;

  @SerializedName("output_image_num")
  private Long outputImageNum = null;

  @SerializedName("img2img")
  private Img2imgStruct img2img = null;

  @SerializedName("text2img")
  private Text2imgStruct text2img = null;

  public MuseAiTaskAddRequest accountId(Long accountId) {
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

  public MuseAiTaskAddRequest taskType(MuseAiTaskType taskType) {
    this.taskType = taskType;
    return this;
  }

  /**
   * Get taskType
   *
   * @return taskType
   */
  @ApiModelProperty(value = "")
  public MuseAiTaskType getTaskType() {
    return taskType;
  }

  public void setTaskType(MuseAiTaskType taskType) {
    this.taskType = taskType;
  }

  public MuseAiTaskAddRequest outputImageNum(Long outputImageNum) {
    this.outputImageNum = outputImageNum;
    return this;
  }

  /**
   * Get outputImageNum
   *
   * @return outputImageNum
   */
  @ApiModelProperty(value = "")
  public Long getOutputImageNum() {
    return outputImageNum;
  }

  public void setOutputImageNum(Long outputImageNum) {
    this.outputImageNum = outputImageNum;
  }

  public MuseAiTaskAddRequest img2img(Img2imgStruct img2img) {
    this.img2img = img2img;
    return this;
  }

  /**
   * Get img2img
   *
   * @return img2img
   */
  @ApiModelProperty(value = "")
  public Img2imgStruct getImg2img() {
    return img2img;
  }

  public void setImg2img(Img2imgStruct img2img) {
    this.img2img = img2img;
  }

  public MuseAiTaskAddRequest text2img(Text2imgStruct text2img) {
    this.text2img = text2img;
    return this;
  }

  /**
   * Get text2img
   *
   * @return text2img
   */
  @ApiModelProperty(value = "")
  public Text2imgStruct getText2img() {
    return text2img;
  }

  public void setText2img(Text2imgStruct text2img) {
    this.text2img = text2img;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MuseAiTaskAddRequest museAiTaskAddRequest = (MuseAiTaskAddRequest) o;
    return Objects.equals(this.accountId, museAiTaskAddRequest.accountId)
        && Objects.equals(this.taskType, museAiTaskAddRequest.taskType)
        && Objects.equals(this.outputImageNum, museAiTaskAddRequest.outputImageNum)
        && Objects.equals(this.img2img, museAiTaskAddRequest.img2img)
        && Objects.equals(this.text2img, museAiTaskAddRequest.text2img);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, taskType, outputImageNum, img2img, text2img);
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
