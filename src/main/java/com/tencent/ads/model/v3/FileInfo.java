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

/** 文件返回结果 */
@ApiModel(description = "文件返回结果")
public class FileInfo {
  @SerializedName("file_id")
  private Long fileId = null;

  @SerializedName("md5")
  private String md5 = null;

  public FileInfo fileId(Long fileId) {
    this.fileId = fileId;
    return this;
  }

  /**
   * Get fileId
   *
   * @return fileId
   */
  @ApiModelProperty(value = "")
  public Long getFileId() {
    return fileId;
  }

  public void setFileId(Long fileId) {
    this.fileId = fileId;
  }

  public FileInfo md5(String md5) {
    this.md5 = md5;
    return this;
  }

  /**
   * Get md5
   *
   * @return md5
   */
  @ApiModelProperty(value = "")
  public String getMd5() {
    return md5;
  }

  public void setMd5(String md5) {
    this.md5 = md5;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileInfo fileInfo = (FileInfo) o;
    return Objects.equals(this.fileId, fileInfo.fileId) && Objects.equals(this.md5, fileInfo.md5);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, md5);
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
