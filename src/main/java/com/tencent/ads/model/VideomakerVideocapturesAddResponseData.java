/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 1.3
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.tencent.ads.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** VideomakerVideocapturesAddResponseData */
public class VideomakerVideocapturesAddResponseData {
  @SerializedName("code")
  private Long code = null;

  @SerializedName("video_captures")
  private List<VideoCaptureStruct> videoCaptures = null;

  public VideomakerVideocapturesAddResponseData code(Long code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   *
   * @return code
   */
  @ApiModelProperty(value = "")
  public Long getCode() {
    return code;
  }

  public void setCode(Long code) {
    this.code = code;
  }

  public VideomakerVideocapturesAddResponseData videoCaptures(
      List<VideoCaptureStruct> videoCaptures) {
    this.videoCaptures = videoCaptures;
    return this;
  }

  public VideomakerVideocapturesAddResponseData addVideoCapturesItem(
      VideoCaptureStruct videoCapturesItem) {
    if (this.videoCaptures == null) {
      this.videoCaptures = new ArrayList<VideoCaptureStruct>();
    }
    this.videoCaptures.add(videoCapturesItem);
    return this;
  }

  /**
   * Get videoCaptures
   *
   * @return videoCaptures
   */
  @ApiModelProperty(value = "")
  public List<VideoCaptureStruct> getVideoCaptures() {
    return videoCaptures;
  }

  public void setVideoCaptures(List<VideoCaptureStruct> videoCaptures) {
    this.videoCaptures = videoCaptures;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideomakerVideocapturesAddResponseData videomakerVideocapturesAddResponseData =
        (VideomakerVideocapturesAddResponseData) o;
    return Objects.equals(this.code, videomakerVideocapturesAddResponseData.code)
        && Objects.equals(this.videoCaptures, videomakerVideocapturesAddResponseData.videoCaptures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, videoCaptures);
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