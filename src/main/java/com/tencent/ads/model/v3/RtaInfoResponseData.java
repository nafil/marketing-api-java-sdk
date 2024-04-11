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

/** RtaInfoResponseData */
public class RtaInfoResponseData {
  @SerializedName("RtaId")
  private Long rtaId = null;

  @SerializedName("RtaName")
  private String rtaName = null;

  @SerializedName("RtaCompanyName")
  private String rtaCompanyName = null;

  @SerializedName("QpsLimit")
  private Long qpsLimit = null;

  @SerializedName("CacheTime")
  private Long cacheTime = null;

  @SerializedName("Enable")
  private Long enable = null;

  @SerializedName("rules")
  private List<Rule> rules = null;

  @SerializedName("bidurls")
  private List<BidUrl> bidurls = null;

  public RtaInfoResponseData rtaId(Long rtaId) {
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

  public RtaInfoResponseData rtaName(String rtaName) {
    this.rtaName = rtaName;
    return this;
  }

  /**
   * Get rtaName
   *
   * @return rtaName
   */
  @ApiModelProperty(value = "")
  public String getRtaName() {
    return rtaName;
  }

  public void setRtaName(String rtaName) {
    this.rtaName = rtaName;
  }

  public RtaInfoResponseData rtaCompanyName(String rtaCompanyName) {
    this.rtaCompanyName = rtaCompanyName;
    return this;
  }

  /**
   * Get rtaCompanyName
   *
   * @return rtaCompanyName
   */
  @ApiModelProperty(value = "")
  public String getRtaCompanyName() {
    return rtaCompanyName;
  }

  public void setRtaCompanyName(String rtaCompanyName) {
    this.rtaCompanyName = rtaCompanyName;
  }

  public RtaInfoResponseData qpsLimit(Long qpsLimit) {
    this.qpsLimit = qpsLimit;
    return this;
  }

  /**
   * Get qpsLimit
   *
   * @return qpsLimit
   */
  @ApiModelProperty(value = "")
  public Long getQpsLimit() {
    return qpsLimit;
  }

  public void setQpsLimit(Long qpsLimit) {
    this.qpsLimit = qpsLimit;
  }

  public RtaInfoResponseData cacheTime(Long cacheTime) {
    this.cacheTime = cacheTime;
    return this;
  }

  /**
   * Get cacheTime
   *
   * @return cacheTime
   */
  @ApiModelProperty(value = "")
  public Long getCacheTime() {
    return cacheTime;
  }

  public void setCacheTime(Long cacheTime) {
    this.cacheTime = cacheTime;
  }

  public RtaInfoResponseData enable(Long enable) {
    this.enable = enable;
    return this;
  }

  /**
   * Get enable
   *
   * @return enable
   */
  @ApiModelProperty(value = "")
  public Long getEnable() {
    return enable;
  }

  public void setEnable(Long enable) {
    this.enable = enable;
  }

  public RtaInfoResponseData rules(List<Rule> rules) {
    this.rules = rules;
    return this;
  }

  public RtaInfoResponseData addRulesItem(Rule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<Rule>();
    }
    this.rules.add(rulesItem);
    return this;
  }

  /**
   * Get rules
   *
   * @return rules
   */
  @ApiModelProperty(value = "")
  public List<Rule> getRules() {
    return rules;
  }

  public void setRules(List<Rule> rules) {
    this.rules = rules;
  }

  public RtaInfoResponseData bidurls(List<BidUrl> bidurls) {
    this.bidurls = bidurls;
    return this;
  }

  public RtaInfoResponseData addBidurlsItem(BidUrl bidurlsItem) {
    if (this.bidurls == null) {
      this.bidurls = new ArrayList<BidUrl>();
    }
    this.bidurls.add(bidurlsItem);
    return this;
  }

  /**
   * Get bidurls
   *
   * @return bidurls
   */
  @ApiModelProperty(value = "")
  public List<BidUrl> getBidurls() {
    return bidurls;
  }

  public void setBidurls(List<BidUrl> bidurls) {
    this.bidurls = bidurls;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RtaInfoResponseData rtaInfoResponseData = (RtaInfoResponseData) o;
    return Objects.equals(this.rtaId, rtaInfoResponseData.rtaId)
        && Objects.equals(this.rtaName, rtaInfoResponseData.rtaName)
        && Objects.equals(this.rtaCompanyName, rtaInfoResponseData.rtaCompanyName)
        && Objects.equals(this.qpsLimit, rtaInfoResponseData.qpsLimit)
        && Objects.equals(this.cacheTime, rtaInfoResponseData.cacheTime)
        && Objects.equals(this.enable, rtaInfoResponseData.enable)
        && Objects.equals(this.rules, rtaInfoResponseData.rules)
        && Objects.equals(this.bidurls, rtaInfoResponseData.bidurls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        rtaId, rtaName, rtaCompanyName, qpsLimit, cacheTime, enable, rules, bidurls);
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
