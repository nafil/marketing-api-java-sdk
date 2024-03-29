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

/** 推广链接结构 */
@ApiModel(description = "推广链接结构")
public class WebsiteReadStruct {
  @SerializedName("website_domain")
  private String websiteDomain = null;

  @SerializedName("icp_image_id")
  private String icpImageId = null;

  @SerializedName("system_status")
  private WebsiteStatus systemStatus = null;

  @SerializedName("reject_message")
  private String rejectMessage = null;

  public WebsiteReadStruct websiteDomain(String websiteDomain) {
    this.websiteDomain = websiteDomain;
    return this;
  }

  /**
   * Get websiteDomain
   *
   * @return websiteDomain
   */
  @ApiModelProperty(value = "")
  public String getWebsiteDomain() {
    return websiteDomain;
  }

  public void setWebsiteDomain(String websiteDomain) {
    this.websiteDomain = websiteDomain;
  }

  public WebsiteReadStruct icpImageId(String icpImageId) {
    this.icpImageId = icpImageId;
    return this;
  }

  /**
   * Get icpImageId
   *
   * @return icpImageId
   */
  @ApiModelProperty(value = "")
  public String getIcpImageId() {
    return icpImageId;
  }

  public void setIcpImageId(String icpImageId) {
    this.icpImageId = icpImageId;
  }

  public WebsiteReadStruct systemStatus(WebsiteStatus systemStatus) {
    this.systemStatus = systemStatus;
    return this;
  }

  /**
   * Get systemStatus
   *
   * @return systemStatus
   */
  @ApiModelProperty(value = "")
  public WebsiteStatus getSystemStatus() {
    return systemStatus;
  }

  public void setSystemStatus(WebsiteStatus systemStatus) {
    this.systemStatus = systemStatus;
  }

  public WebsiteReadStruct rejectMessage(String rejectMessage) {
    this.rejectMessage = rejectMessage;
    return this;
  }

  /**
   * Get rejectMessage
   *
   * @return rejectMessage
   */
  @ApiModelProperty(value = "")
  public String getRejectMessage() {
    return rejectMessage;
  }

  public void setRejectMessage(String rejectMessage) {
    this.rejectMessage = rejectMessage;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebsiteReadStruct websiteReadStruct = (WebsiteReadStruct) o;
    return Objects.equals(this.websiteDomain, websiteReadStruct.websiteDomain)
        && Objects.equals(this.icpImageId, websiteReadStruct.icpImageId)
        && Objects.equals(this.systemStatus, websiteReadStruct.systemStatus)
        && Objects.equals(this.rejectMessage, websiteReadStruct.rejectMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(websiteDomain, icpImageId, systemStatus, rejectMessage);
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
