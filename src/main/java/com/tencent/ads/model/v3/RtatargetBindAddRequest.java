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

/** RtatargetBindAddRequest */
public class RtatargetBindAddRequest {
  @SerializedName("data")
  private List<RtaTargetBindAddObject> data = null;

  public RtatargetBindAddRequest data(List<RtaTargetBindAddObject> data) {
    this.data = data;
    return this;
  }

  public RtatargetBindAddRequest addDataItem(RtaTargetBindAddObject dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<RtaTargetBindAddObject>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   *
   * @return data
   */
  @ApiModelProperty(value = "")
  public List<RtaTargetBindAddObject> getData() {
    return data;
  }

  public void setData(List<RtaTargetBindAddObject> data) {
    this.data = data;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RtatargetBindAddRequest rtatargetBindAddRequest = (RtatargetBindAddRequest) o;
    return Objects.equals(this.data, rtatargetBindAddRequest.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
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
