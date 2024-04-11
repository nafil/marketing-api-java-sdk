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

/** RtaInfoRequest */
public class RtaInfoRequest {
  @SerializedName("RtaId")
  private Long rtaId = null;

  public RtaInfoRequest rtaId(Long rtaId) {
    this.rtaId = rtaId;
    return this;
  }

  /**
   * Get rtaId
   *
   * @return rtaId
   */
  @ApiModelProperty(value = "")
  public Long getRtaId() {
    return rtaId;
  }

  public void setRtaId(Long rtaId) {
    this.rtaId = rtaId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RtaInfoRequest rtaInfoRequest = (RtaInfoRequest) o;
    return Objects.equals(this.rtaId, rtaInfoRequest.rtaId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rtaId);
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
