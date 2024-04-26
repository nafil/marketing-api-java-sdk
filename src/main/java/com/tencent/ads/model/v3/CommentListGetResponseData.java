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

/** CommentListGetResponseData */
public class CommentListGetResponseData {
  @SerializedName("list")
  private List<CommentListGetListStruct> list = null;

  @SerializedName("last_buffer")
  private String lastBuffer = null;

  @SerializedName("continue_flag")
  private Long continueFlag = null;

  public CommentListGetResponseData list(List<CommentListGetListStruct> list) {
    this.list = list;
    return this;
  }

  public CommentListGetResponseData addListItem(CommentListGetListStruct listItem) {
    if (this.list == null) {
      this.list = new ArrayList<CommentListGetListStruct>();
    }
    this.list.add(listItem);
    return this;
  }

  /**
   * Get list
   *
   * @return list
   */
  @ApiModelProperty(value = "")
  public List<CommentListGetListStruct> getList() {
    return list;
  }

  public void setList(List<CommentListGetListStruct> list) {
    this.list = list;
  }

  public CommentListGetResponseData lastBuffer(String lastBuffer) {
    this.lastBuffer = lastBuffer;
    return this;
  }

  /**
   * Get lastBuffer
   *
   * @return lastBuffer
   */
  @ApiModelProperty(value = "")
  public String getLastBuffer() {
    return lastBuffer;
  }

  public void setLastBuffer(String lastBuffer) {
    this.lastBuffer = lastBuffer;
  }

  public CommentListGetResponseData continueFlag(Long continueFlag) {
    this.continueFlag = continueFlag;
    return this;
  }

  /**
   * Get continueFlag
   *
   * @return continueFlag
   */
  @ApiModelProperty(value = "")
  public Long getContinueFlag() {
    return continueFlag;
  }

  public void setContinueFlag(Long continueFlag) {
    this.continueFlag = continueFlag;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentListGetResponseData commentListGetResponseData = (CommentListGetResponseData) o;
    return Objects.equals(this.list, commentListGetResponseData.list)
        && Objects.equals(this.lastBuffer, commentListGetResponseData.lastBuffer)
        && Objects.equals(this.continueFlag, commentListGetResponseData.continueFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list, lastBuffer, continueFlag);
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
