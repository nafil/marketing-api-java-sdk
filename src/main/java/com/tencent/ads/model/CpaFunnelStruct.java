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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** 成本分析 */
@ApiModel(description = "成本分析")
public class CpaFunnelStruct {
  @SerializedName("bias_today")
  private Double biasToday = null;

  @SerializedName("bias_overall")
  private Double biasOverall = null;

  public CpaFunnelStruct biasToday(Double biasToday) {
    this.biasToday = biasToday;
    return this;
  }

  /**
   * Get biasToday
   *
   * @return biasToday
   */
  @ApiModelProperty(value = "")
  public Double getBiasToday() {
    return biasToday;
  }

  public void setBiasToday(Double biasToday) {
    this.biasToday = biasToday;
  }

  public CpaFunnelStruct biasOverall(Double biasOverall) {
    this.biasOverall = biasOverall;
    return this;
  }

  /**
   * Get biasOverall
   *
   * @return biasOverall
   */
  @ApiModelProperty(value = "")
  public Double getBiasOverall() {
    return biasOverall;
  }

  public void setBiasOverall(Double biasOverall) {
    this.biasOverall = biasOverall;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CpaFunnelStruct cpaFunnelStruct = (CpaFunnelStruct) o;
    return Objects.equals(this.biasToday, cpaFunnelStruct.biasToday)
        && Objects.equals(this.biasOverall, cpaFunnelStruct.biasOverall);
  }

  @Override
  public int hashCode() {
    return Objects.hash(biasToday, biasOverall);
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