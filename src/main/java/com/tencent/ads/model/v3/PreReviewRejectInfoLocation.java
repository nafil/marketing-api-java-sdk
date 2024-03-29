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

/** 标注位置信息 */
@ApiModel(description = "标注位置信息")
public class PreReviewRejectInfoLocation {
  @SerializedName("x")
  private Long x = null;

  @SerializedName("y")
  private Long y = null;

  @SerializedName("width")
  private Long width = null;

  @SerializedName("height")
  private Long height = null;

  @SerializedName("time_second")
  private Double timeSecond = null;

  @SerializedName("location_img_url")
  private String locationImgUrl = null;

  @SerializedName("img_url")
  private String imgUrl = null;

  @SerializedName("related_img_url")
  private String relatedImgUrl = null;

  public PreReviewRejectInfoLocation x(Long x) {
    this.x = x;
    return this;
  }

  /**
   * Get x
   *
   * @return x
   */
  @ApiModelProperty(value = "")
  public Long getX() {
    return x;
  }

  public void setX(Long x) {
    this.x = x;
  }

  public PreReviewRejectInfoLocation y(Long y) {
    this.y = y;
    return this;
  }

  /**
   * Get y
   *
   * @return y
   */
  @ApiModelProperty(value = "")
  public Long getY() {
    return y;
  }

  public void setY(Long y) {
    this.y = y;
  }

  public PreReviewRejectInfoLocation width(Long width) {
    this.width = width;
    return this;
  }

  /**
   * Get width
   *
   * @return width
   */
  @ApiModelProperty(value = "")
  public Long getWidth() {
    return width;
  }

  public void setWidth(Long width) {
    this.width = width;
  }

  public PreReviewRejectInfoLocation height(Long height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   *
   * @return height
   */
  @ApiModelProperty(value = "")
  public Long getHeight() {
    return height;
  }

  public void setHeight(Long height) {
    this.height = height;
  }

  public PreReviewRejectInfoLocation timeSecond(Double timeSecond) {
    this.timeSecond = timeSecond;
    return this;
  }

  /**
   * Get timeSecond
   *
   * @return timeSecond
   */
  @ApiModelProperty(value = "")
  public Double getTimeSecond() {
    return timeSecond;
  }

  public void setTimeSecond(Double timeSecond) {
    this.timeSecond = timeSecond;
  }

  public PreReviewRejectInfoLocation locationImgUrl(String locationImgUrl) {
    this.locationImgUrl = locationImgUrl;
    return this;
  }

  /**
   * Get locationImgUrl
   *
   * @return locationImgUrl
   */
  @ApiModelProperty(value = "")
  public String getLocationImgUrl() {
    return locationImgUrl;
  }

  public void setLocationImgUrl(String locationImgUrl) {
    this.locationImgUrl = locationImgUrl;
  }

  public PreReviewRejectInfoLocation imgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
    return this;
  }

  /**
   * Get imgUrl
   *
   * @return imgUrl
   */
  @ApiModelProperty(value = "")
  public String getImgUrl() {
    return imgUrl;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }

  public PreReviewRejectInfoLocation relatedImgUrl(String relatedImgUrl) {
    this.relatedImgUrl = relatedImgUrl;
    return this;
  }

  /**
   * Get relatedImgUrl
   *
   * @return relatedImgUrl
   */
  @ApiModelProperty(value = "")
  public String getRelatedImgUrl() {
    return relatedImgUrl;
  }

  public void setRelatedImgUrl(String relatedImgUrl) {
    this.relatedImgUrl = relatedImgUrl;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreReviewRejectInfoLocation preReviewRejectInfoLocation = (PreReviewRejectInfoLocation) o;
    return Objects.equals(this.x, preReviewRejectInfoLocation.x)
        && Objects.equals(this.y, preReviewRejectInfoLocation.y)
        && Objects.equals(this.width, preReviewRejectInfoLocation.width)
        && Objects.equals(this.height, preReviewRejectInfoLocation.height)
        && Objects.equals(this.timeSecond, preReviewRejectInfoLocation.timeSecond)
        && Objects.equals(this.locationImgUrl, preReviewRejectInfoLocation.locationImgUrl)
        && Objects.equals(this.imgUrl, preReviewRejectInfoLocation.imgUrl)
        && Objects.equals(this.relatedImgUrl, preReviewRejectInfoLocation.relatedImgUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, width, height, timeSecond, locationImgUrl, imgUrl, relatedImgUrl);
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
