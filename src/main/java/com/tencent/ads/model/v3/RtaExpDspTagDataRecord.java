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

/** dsp_tag数据 */
@ApiModel(description = "dsp_tag数据")
public class RtaExpDspTagDataRecord {
  @SerializedName("Date")
  private Long date = null;

  @SerializedName("DateHour")
  private Long dateHour = null;

  @SerializedName("FUId")
  private Long fuId = null;

  @SerializedName("DspTag")
  private Long dspTag = null;

  @SerializedName("OuterTargetId")
  private String outerTargetId = null;

  @SerializedName("Cost")
  private Long cost = null;

  @SerializedName("ConversionCount")
  private Long conversionCount = null;

  @SerializedName("SecondConversionCount")
  private Long secondConversionCount = null;

  @SerializedName("ValidExposureCount")
  private Long validExposureCount = null;

  @SerializedName("ValidClickCount")
  private Long validClickCount = null;

  @SerializedName("MdCheoutFD")
  private Long mdCheoutFD = null;

  @SerializedName("MdCheoutTD")
  private Long mdCheoutTD = null;

  @SerializedName("MdCheoutOW")
  private Long mdCheoutOW = null;

  @SerializedName("MdMgPurchaseVal1")
  private Long mdMgPurchaseVal1 = null;

  @SerializedName("MdMgPurchaseVal3")
  private Long mdMgPurchaseVal3 = null;

  @SerializedName("MdMgPurchaseVal7")
  private Long mdMgPurchaseVal7 = null;

  @SerializedName("MdMgRegUV")
  private Long mdMgRegUV = null;

  public RtaExpDspTagDataRecord date(Long date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   *
   * @return date
   */
  @ApiModelProperty(value = "")
  public Long getDate() {
    return date;
  }

  public void setDate(Long date) {
    this.date = date;
  }

  public RtaExpDspTagDataRecord dateHour(Long dateHour) {
    this.dateHour = dateHour;
    return this;
  }

  /**
   * Get dateHour
   *
   * @return dateHour
   */
  @ApiModelProperty(value = "")
  public Long getDateHour() {
    return dateHour;
  }

  public void setDateHour(Long dateHour) {
    this.dateHour = dateHour;
  }

  public RtaExpDspTagDataRecord fuId(Long fuId) {
    this.fuId = fuId;
    return this;
  }

  /**
   * Get fuId
   *
   * @return fuId
   */
  @ApiModelProperty(value = "")
  public Long getFuId() {
    return fuId;
  }

  public void setFuId(Long fuId) {
    this.fuId = fuId;
  }

  public RtaExpDspTagDataRecord dspTag(Long dspTag) {
    this.dspTag = dspTag;
    return this;
  }

  /**
   * Get dspTag
   *
   * @return dspTag
   */
  @ApiModelProperty(value = "")
  public Long getDspTag() {
    return dspTag;
  }

  public void setDspTag(Long dspTag) {
    this.dspTag = dspTag;
  }

  public RtaExpDspTagDataRecord outerTargetId(String outerTargetId) {
    this.outerTargetId = outerTargetId;
    return this;
  }

  /**
   * Get outerTargetId
   *
   * @return outerTargetId
   */
  @ApiModelProperty(value = "")
  public String getOuterTargetId() {
    return outerTargetId;
  }

  public void setOuterTargetId(String outerTargetId) {
    this.outerTargetId = outerTargetId;
  }

  public RtaExpDspTagDataRecord cost(Long cost) {
    this.cost = cost;
    return this;
  }

  /**
   * Get cost
   *
   * @return cost
   */
  @ApiModelProperty(value = "")
  public Long getCost() {
    return cost;
  }

  public void setCost(Long cost) {
    this.cost = cost;
  }

  public RtaExpDspTagDataRecord conversionCount(Long conversionCount) {
    this.conversionCount = conversionCount;
    return this;
  }

  /**
   * Get conversionCount
   *
   * @return conversionCount
   */
  @ApiModelProperty(value = "")
  public Long getConversionCount() {
    return conversionCount;
  }

  public void setConversionCount(Long conversionCount) {
    this.conversionCount = conversionCount;
  }

  public RtaExpDspTagDataRecord secondConversionCount(Long secondConversionCount) {
    this.secondConversionCount = secondConversionCount;
    return this;
  }

  /**
   * Get secondConversionCount
   *
   * @return secondConversionCount
   */
  @ApiModelProperty(value = "")
  public Long getSecondConversionCount() {
    return secondConversionCount;
  }

  public void setSecondConversionCount(Long secondConversionCount) {
    this.secondConversionCount = secondConversionCount;
  }

  public RtaExpDspTagDataRecord validExposureCount(Long validExposureCount) {
    this.validExposureCount = validExposureCount;
    return this;
  }

  /**
   * Get validExposureCount
   *
   * @return validExposureCount
   */
  @ApiModelProperty(value = "")
  public Long getValidExposureCount() {
    return validExposureCount;
  }

  public void setValidExposureCount(Long validExposureCount) {
    this.validExposureCount = validExposureCount;
  }

  public RtaExpDspTagDataRecord validClickCount(Long validClickCount) {
    this.validClickCount = validClickCount;
    return this;
  }

  /**
   * Get validClickCount
   *
   * @return validClickCount
   */
  @ApiModelProperty(value = "")
  public Long getValidClickCount() {
    return validClickCount;
  }

  public void setValidClickCount(Long validClickCount) {
    this.validClickCount = validClickCount;
  }

  public RtaExpDspTagDataRecord mdCheoutFD(Long mdCheoutFD) {
    this.mdCheoutFD = mdCheoutFD;
    return this;
  }

  /**
   * Get mdCheoutFD
   *
   * @return mdCheoutFD
   */
  @ApiModelProperty(value = "")
  public Long getMdCheoutFD() {
    return mdCheoutFD;
  }

  public void setMdCheoutFD(Long mdCheoutFD) {
    this.mdCheoutFD = mdCheoutFD;
  }

  public RtaExpDspTagDataRecord mdCheoutTD(Long mdCheoutTD) {
    this.mdCheoutTD = mdCheoutTD;
    return this;
  }

  /**
   * Get mdCheoutTD
   *
   * @return mdCheoutTD
   */
  @ApiModelProperty(value = "")
  public Long getMdCheoutTD() {
    return mdCheoutTD;
  }

  public void setMdCheoutTD(Long mdCheoutTD) {
    this.mdCheoutTD = mdCheoutTD;
  }

  public RtaExpDspTagDataRecord mdCheoutOW(Long mdCheoutOW) {
    this.mdCheoutOW = mdCheoutOW;
    return this;
  }

  /**
   * Get mdCheoutOW
   *
   * @return mdCheoutOW
   */
  @ApiModelProperty(value = "")
  public Long getMdCheoutOW() {
    return mdCheoutOW;
  }

  public void setMdCheoutOW(Long mdCheoutOW) {
    this.mdCheoutOW = mdCheoutOW;
  }

  public RtaExpDspTagDataRecord mdMgPurchaseVal1(Long mdMgPurchaseVal1) {
    this.mdMgPurchaseVal1 = mdMgPurchaseVal1;
    return this;
  }

  /**
   * Get mdMgPurchaseVal1
   *
   * @return mdMgPurchaseVal1
   */
  @ApiModelProperty(value = "")
  public Long getMdMgPurchaseVal1() {
    return mdMgPurchaseVal1;
  }

  public void setMdMgPurchaseVal1(Long mdMgPurchaseVal1) {
    this.mdMgPurchaseVal1 = mdMgPurchaseVal1;
  }

  public RtaExpDspTagDataRecord mdMgPurchaseVal3(Long mdMgPurchaseVal3) {
    this.mdMgPurchaseVal3 = mdMgPurchaseVal3;
    return this;
  }

  /**
   * Get mdMgPurchaseVal3
   *
   * @return mdMgPurchaseVal3
   */
  @ApiModelProperty(value = "")
  public Long getMdMgPurchaseVal3() {
    return mdMgPurchaseVal3;
  }

  public void setMdMgPurchaseVal3(Long mdMgPurchaseVal3) {
    this.mdMgPurchaseVal3 = mdMgPurchaseVal3;
  }

  public RtaExpDspTagDataRecord mdMgPurchaseVal7(Long mdMgPurchaseVal7) {
    this.mdMgPurchaseVal7 = mdMgPurchaseVal7;
    return this;
  }

  /**
   * Get mdMgPurchaseVal7
   *
   * @return mdMgPurchaseVal7
   */
  @ApiModelProperty(value = "")
  public Long getMdMgPurchaseVal7() {
    return mdMgPurchaseVal7;
  }

  public void setMdMgPurchaseVal7(Long mdMgPurchaseVal7) {
    this.mdMgPurchaseVal7 = mdMgPurchaseVal7;
  }

  public RtaExpDspTagDataRecord mdMgRegUV(Long mdMgRegUV) {
    this.mdMgRegUV = mdMgRegUV;
    return this;
  }

  /**
   * Get mdMgRegUV
   *
   * @return mdMgRegUV
   */
  @ApiModelProperty(value = "")
  public Long getMdMgRegUV() {
    return mdMgRegUV;
  }

  public void setMdMgRegUV(Long mdMgRegUV) {
    this.mdMgRegUV = mdMgRegUV;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RtaExpDspTagDataRecord rtaExpDspTagDataRecord = (RtaExpDspTagDataRecord) o;
    return Objects.equals(this.date, rtaExpDspTagDataRecord.date)
        && Objects.equals(this.dateHour, rtaExpDspTagDataRecord.dateHour)
        && Objects.equals(this.fuId, rtaExpDspTagDataRecord.fuId)
        && Objects.equals(this.dspTag, rtaExpDspTagDataRecord.dspTag)
        && Objects.equals(this.outerTargetId, rtaExpDspTagDataRecord.outerTargetId)
        && Objects.equals(this.cost, rtaExpDspTagDataRecord.cost)
        && Objects.equals(this.conversionCount, rtaExpDspTagDataRecord.conversionCount)
        && Objects.equals(this.secondConversionCount, rtaExpDspTagDataRecord.secondConversionCount)
        && Objects.equals(this.validExposureCount, rtaExpDspTagDataRecord.validExposureCount)
        && Objects.equals(this.validClickCount, rtaExpDspTagDataRecord.validClickCount)
        && Objects.equals(this.mdCheoutFD, rtaExpDspTagDataRecord.mdCheoutFD)
        && Objects.equals(this.mdCheoutTD, rtaExpDspTagDataRecord.mdCheoutTD)
        && Objects.equals(this.mdCheoutOW, rtaExpDspTagDataRecord.mdCheoutOW)
        && Objects.equals(this.mdMgPurchaseVal1, rtaExpDspTagDataRecord.mdMgPurchaseVal1)
        && Objects.equals(this.mdMgPurchaseVal3, rtaExpDspTagDataRecord.mdMgPurchaseVal3)
        && Objects.equals(this.mdMgPurchaseVal7, rtaExpDspTagDataRecord.mdMgPurchaseVal7)
        && Objects.equals(this.mdMgRegUV, rtaExpDspTagDataRecord.mdMgRegUV);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        date,
        dateHour,
        fuId,
        dspTag,
        outerTargetId,
        cost,
        conversionCount,
        secondConversionCount,
        validExposureCount,
        validClickCount,
        mdCheoutFD,
        mdCheoutTD,
        mdCheoutOW,
        mdMgPurchaseVal1,
        mdMgPurchaseVal3,
        mdMgPurchaseVal7,
        mdMgRegUV);
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
