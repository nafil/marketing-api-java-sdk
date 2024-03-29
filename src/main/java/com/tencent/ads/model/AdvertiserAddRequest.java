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

/** AdvertiserAddRequest */
public class AdvertiserAddRequest {
  @SerializedName("corporation_name")
  private String corporationName = null;

  @SerializedName("corporation_licence")
  private String corporationLicence = null;

  @SerializedName("certification_image_id")
  private String certificationImageId = null;

  @SerializedName("individual_qualification")
  private IndividualQualification individualQualification = null;

  @SerializedName("system_industry_id")
  private Long systemIndustryId = null;

  @SerializedName("area_code")
  private Long areaCode = null;

  @SerializedName("corporate_image_name")
  private String corporateImageName = null;

  @SerializedName("introduction_url")
  private String introductionUrl = null;

  @SerializedName("corporate_brand_name")
  private String corporateBrandName = null;

  @SerializedName("contact_person_telephone")
  private String contactPersonTelephone = null;

  @SerializedName("contact_person_mobile")
  private String contactPersonMobile = null;

  public AdvertiserAddRequest corporationName(String corporationName) {
    this.corporationName = corporationName;
    return this;
  }

  /**
   * Get corporationName
   *
   * @return corporationName
   */
  @ApiModelProperty(value = "")
  public String getCorporationName() {
    return corporationName;
  }

  public void setCorporationName(String corporationName) {
    this.corporationName = corporationName;
  }

  public AdvertiserAddRequest corporationLicence(String corporationLicence) {
    this.corporationLicence = corporationLicence;
    return this;
  }

  /**
   * Get corporationLicence
   *
   * @return corporationLicence
   */
  @ApiModelProperty(value = "")
  public String getCorporationLicence() {
    return corporationLicence;
  }

  public void setCorporationLicence(String corporationLicence) {
    this.corporationLicence = corporationLicence;
  }

  public AdvertiserAddRequest certificationImageId(String certificationImageId) {
    this.certificationImageId = certificationImageId;
    return this;
  }

  /**
   * Get certificationImageId
   *
   * @return certificationImageId
   */
  @ApiModelProperty(value = "")
  public String getCertificationImageId() {
    return certificationImageId;
  }

  public void setCertificationImageId(String certificationImageId) {
    this.certificationImageId = certificationImageId;
  }

  public AdvertiserAddRequest individualQualification(
      IndividualQualification individualQualification) {
    this.individualQualification = individualQualification;
    return this;
  }

  /**
   * Get individualQualification
   *
   * @return individualQualification
   */
  @ApiModelProperty(value = "")
  public IndividualQualification getIndividualQualification() {
    return individualQualification;
  }

  public void setIndividualQualification(IndividualQualification individualQualification) {
    this.individualQualification = individualQualification;
  }

  public AdvertiserAddRequest systemIndustryId(Long systemIndustryId) {
    this.systemIndustryId = systemIndustryId;
    return this;
  }

  /**
   * Get systemIndustryId
   *
   * @return systemIndustryId
   */
  @ApiModelProperty(value = "")
  public Long getSystemIndustryId() {
    return systemIndustryId;
  }

  public void setSystemIndustryId(Long systemIndustryId) {
    this.systemIndustryId = systemIndustryId;
  }

  public AdvertiserAddRequest areaCode(Long areaCode) {
    this.areaCode = areaCode;
    return this;
  }

  /**
   * Get areaCode
   *
   * @return areaCode
   */
  @ApiModelProperty(value = "")
  public Long getAreaCode() {
    return areaCode;
  }

  public void setAreaCode(Long areaCode) {
    this.areaCode = areaCode;
  }

  public AdvertiserAddRequest corporateImageName(String corporateImageName) {
    this.corporateImageName = corporateImageName;
    return this;
  }

  /**
   * Get corporateImageName
   *
   * @return corporateImageName
   */
  @ApiModelProperty(value = "")
  public String getCorporateImageName() {
    return corporateImageName;
  }

  public void setCorporateImageName(String corporateImageName) {
    this.corporateImageName = corporateImageName;
  }

  public AdvertiserAddRequest introductionUrl(String introductionUrl) {
    this.introductionUrl = introductionUrl;
    return this;
  }

  /**
   * Get introductionUrl
   *
   * @return introductionUrl
   */
  @ApiModelProperty(value = "")
  public String getIntroductionUrl() {
    return introductionUrl;
  }

  public void setIntroductionUrl(String introductionUrl) {
    this.introductionUrl = introductionUrl;
  }

  public AdvertiserAddRequest corporateBrandName(String corporateBrandName) {
    this.corporateBrandName = corporateBrandName;
    return this;
  }

  /**
   * Get corporateBrandName
   *
   * @return corporateBrandName
   */
  @ApiModelProperty(value = "")
  public String getCorporateBrandName() {
    return corporateBrandName;
  }

  public void setCorporateBrandName(String corporateBrandName) {
    this.corporateBrandName = corporateBrandName;
  }

  public AdvertiserAddRequest contactPersonTelephone(String contactPersonTelephone) {
    this.contactPersonTelephone = contactPersonTelephone;
    return this;
  }

  /**
   * Get contactPersonTelephone
   *
   * @return contactPersonTelephone
   */
  @ApiModelProperty(value = "")
  public String getContactPersonTelephone() {
    return contactPersonTelephone;
  }

  public void setContactPersonTelephone(String contactPersonTelephone) {
    this.contactPersonTelephone = contactPersonTelephone;
  }

  public AdvertiserAddRequest contactPersonMobile(String contactPersonMobile) {
    this.contactPersonMobile = contactPersonMobile;
    return this;
  }

  /**
   * Get contactPersonMobile
   *
   * @return contactPersonMobile
   */
  @ApiModelProperty(value = "")
  public String getContactPersonMobile() {
    return contactPersonMobile;
  }

  public void setContactPersonMobile(String contactPersonMobile) {
    this.contactPersonMobile = contactPersonMobile;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserAddRequest advertiserAddRequest = (AdvertiserAddRequest) o;
    return Objects.equals(this.corporationName, advertiserAddRequest.corporationName)
        && Objects.equals(this.corporationLicence, advertiserAddRequest.corporationLicence)
        && Objects.equals(this.certificationImageId, advertiserAddRequest.certificationImageId)
        && Objects.equals(
            this.individualQualification, advertiserAddRequest.individualQualification)
        && Objects.equals(this.systemIndustryId, advertiserAddRequest.systemIndustryId)
        && Objects.equals(this.areaCode, advertiserAddRequest.areaCode)
        && Objects.equals(this.corporateImageName, advertiserAddRequest.corporateImageName)
        && Objects.equals(this.introductionUrl, advertiserAddRequest.introductionUrl)
        && Objects.equals(this.corporateBrandName, advertiserAddRequest.corporateBrandName)
        && Objects.equals(this.contactPersonTelephone, advertiserAddRequest.contactPersonTelephone)
        && Objects.equals(this.contactPersonMobile, advertiserAddRequest.contactPersonMobile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        corporationName,
        corporationLicence,
        certificationImageId,
        individualQualification,
        systemIndustryId,
        areaCode,
        corporateImageName,
        introductionUrl,
        corporateBrandName,
        contactPersonTelephone,
        contactPersonMobile);
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
