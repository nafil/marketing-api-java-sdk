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
import java.util.Objects;

/** LeadsCallCreateResponseData */
public class LeadsCallCreateResponseData {
  @SerializedName("contact_id")
  private String contactId = null;

  @SerializedName("request_id")
  private String requestId = null;

  public LeadsCallCreateResponseData contactId(String contactId) {
    this.contactId = contactId;
    return this;
  }

  /**
   * Get contactId
   *
   * @return contactId
   */
  @ApiModelProperty(value = "")
  public String getContactId() {
    return contactId;
  }

  public void setContactId(String contactId) {
    this.contactId = contactId;
  }

  public LeadsCallCreateResponseData requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * Get requestId
   *
   * @return requestId
   */
  @ApiModelProperty(value = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadsCallCreateResponseData leadsCallCreateResponseData = (LeadsCallCreateResponseData) o;
    return Objects.equals(this.contactId, leadsCallCreateResponseData.contactId)
        && Objects.equals(this.requestId, leadsCallCreateResponseData.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactId, requestId);
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
