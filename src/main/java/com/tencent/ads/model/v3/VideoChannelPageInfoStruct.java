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

/** 分页信息结构 */
@ApiModel(description = "分页信息结构")
public class VideoChannelPageInfoStruct {
  @SerializedName("page")
  private Long page = null;

  @SerializedName("page_size")
  private Long pageSize = null;

  @SerializedName("total_number")
  private Long totalNumber = null;

  @SerializedName("total_page")
  private Long totalPage = null;

  public VideoChannelPageInfoStruct page(Long page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   *
   * @return page
   */
  @ApiModelProperty(value = "")
  public Long getPage() {
    return page;
  }

  public void setPage(Long page) {
    this.page = page;
  }

  public VideoChannelPageInfoStruct pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   *
   * @return pageSize
   */
  @ApiModelProperty(value = "")
  public Long getPageSize() {
    return pageSize;
  }

  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }

  public VideoChannelPageInfoStruct totalNumber(Long totalNumber) {
    this.totalNumber = totalNumber;
    return this;
  }

  /**
   * Get totalNumber
   *
   * @return totalNumber
   */
  @ApiModelProperty(value = "")
  public Long getTotalNumber() {
    return totalNumber;
  }

  public void setTotalNumber(Long totalNumber) {
    this.totalNumber = totalNumber;
  }

  public VideoChannelPageInfoStruct totalPage(Long totalPage) {
    this.totalPage = totalPage;
    return this;
  }

  /**
   * Get totalPage
   *
   * @return totalPage
   */
  @ApiModelProperty(value = "")
  public Long getTotalPage() {
    return totalPage;
  }

  public void setTotalPage(Long totalPage) {
    this.totalPage = totalPage;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoChannelPageInfoStruct videoChannelPageInfoStruct = (VideoChannelPageInfoStruct) o;
    return Objects.equals(this.page, videoChannelPageInfoStruct.page)
        && Objects.equals(this.pageSize, videoChannelPageInfoStruct.pageSize)
        && Objects.equals(this.totalNumber, videoChannelPageInfoStruct.totalNumber)
        && Objects.equals(this.totalPage, videoChannelPageInfoStruct.totalPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, pageSize, totalNumber, totalPage);
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
