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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 返回结构 */
@ApiModel(description = "返回结构")
public class AdvertiserGetListStruct {
  @SerializedName("daily_budget")
  private Long dailyBudget = null;

  @SerializedName("system_status")
  private CustomerSystemStatus systemStatus = null;

  @SerializedName("corporation_name")
  private String corporationName = null;

  @SerializedName("certification_image_id")
  private String certificationImageId = null;

  @SerializedName("individual_qualification")
  private IndividualQualificationRead individualQualification = null;

  @SerializedName("introduction_url")
  private String introductionUrl = null;

  @SerializedName("industry_qualification_image_id_list")
  private List<String> industryQualificationImageIdList = null;

  @SerializedName("ad_qualification_image_id_list")
  private List<String> adQualificationImageIdList = null;

  @SerializedName("contact_person")
  private String contactPerson = null;

  @SerializedName("contact_person_email")
  private String contactPersonEmail = null;

  @SerializedName("contact_person_telephone")
  private String contactPersonTelephone = null;

  @SerializedName("contact_person_mobile")
  private String contactPersonMobile = null;

  @SerializedName("wechat_spec")
  private MpInfoRead wechatSpec = null;

  @SerializedName("websites")
  private List<WebsiteReadStruct> websites = null;

  @SerializedName("agency_account_id")
  private Long agencyAccountId = null;

  @SerializedName("operators")
  private List<AdvertiserOperatorStruct> operators = null;

  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("ad_qualification_image")
  private List<String> adQualificationImage = null;

  @SerializedName("certification_image")
  private String certificationImage = null;

  @SerializedName("industry_qualification_image")
  private List<String> industryQualificationImage = null;

  @SerializedName("corporate_image_name")
  private String corporateImageName = null;

  @SerializedName("corporate_image_logo")
  private String corporateImageLogo = null;

  @SerializedName("corporation_licence")
  private String corporationLicence = null;

  @SerializedName("customized_industry")
  private String customizedIndustry = null;

  @SerializedName("identity_number")
  private String identityNumber = null;

  @SerializedName("system_industry_id")
  private Long systemIndustryId = null;

  @SerializedName("reject_message")
  private String rejectMessage = null;

  public AdvertiserGetListStruct dailyBudget(Long dailyBudget) {
    this.dailyBudget = dailyBudget;
    return this;
  }

  /**
   * Get dailyBudget
   *
   * @return dailyBudget
   */
  @ApiModelProperty(value = "")
  public Long getDailyBudget() {
    return dailyBudget;
  }

  public void setDailyBudget(Long dailyBudget) {
    this.dailyBudget = dailyBudget;
  }

  public AdvertiserGetListStruct systemStatus(CustomerSystemStatus systemStatus) {
    this.systemStatus = systemStatus;
    return this;
  }

  /**
   * Get systemStatus
   *
   * @return systemStatus
   */
  @ApiModelProperty(value = "")
  public CustomerSystemStatus getSystemStatus() {
    return systemStatus;
  }

  public void setSystemStatus(CustomerSystemStatus systemStatus) {
    this.systemStatus = systemStatus;
  }

  public AdvertiserGetListStruct corporationName(String corporationName) {
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

  public AdvertiserGetListStruct certificationImageId(String certificationImageId) {
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

  public AdvertiserGetListStruct individualQualification(
      IndividualQualificationRead individualQualification) {
    this.individualQualification = individualQualification;
    return this;
  }

  /**
   * Get individualQualification
   *
   * @return individualQualification
   */
  @ApiModelProperty(value = "")
  public IndividualQualificationRead getIndividualQualification() {
    return individualQualification;
  }

  public void setIndividualQualification(IndividualQualificationRead individualQualification) {
    this.individualQualification = individualQualification;
  }

  public AdvertiserGetListStruct introductionUrl(String introductionUrl) {
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

  public AdvertiserGetListStruct industryQualificationImageIdList(
      List<String> industryQualificationImageIdList) {
    this.industryQualificationImageIdList = industryQualificationImageIdList;
    return this;
  }

  public AdvertiserGetListStruct addIndustryQualificationImageIdListItem(
      String industryQualificationImageIdListItem) {
    if (this.industryQualificationImageIdList == null) {
      this.industryQualificationImageIdList = new ArrayList<String>();
    }
    this.industryQualificationImageIdList.add(industryQualificationImageIdListItem);
    return this;
  }

  /**
   * Get industryQualificationImageIdList
   *
   * @return industryQualificationImageIdList
   */
  @ApiModelProperty(value = "")
  public List<String> getIndustryQualificationImageIdList() {
    return industryQualificationImageIdList;
  }

  public void setIndustryQualificationImageIdList(List<String> industryQualificationImageIdList) {
    this.industryQualificationImageIdList = industryQualificationImageIdList;
  }

  public AdvertiserGetListStruct adQualificationImageIdList(
      List<String> adQualificationImageIdList) {
    this.adQualificationImageIdList = adQualificationImageIdList;
    return this;
  }

  public AdvertiserGetListStruct addAdQualificationImageIdListItem(
      String adQualificationImageIdListItem) {
    if (this.adQualificationImageIdList == null) {
      this.adQualificationImageIdList = new ArrayList<String>();
    }
    this.adQualificationImageIdList.add(adQualificationImageIdListItem);
    return this;
  }

  /**
   * Get adQualificationImageIdList
   *
   * @return adQualificationImageIdList
   */
  @ApiModelProperty(value = "")
  public List<String> getAdQualificationImageIdList() {
    return adQualificationImageIdList;
  }

  public void setAdQualificationImageIdList(List<String> adQualificationImageIdList) {
    this.adQualificationImageIdList = adQualificationImageIdList;
  }

  public AdvertiserGetListStruct contactPerson(String contactPerson) {
    this.contactPerson = contactPerson;
    return this;
  }

  /**
   * Get contactPerson
   *
   * @return contactPerson
   */
  @ApiModelProperty(value = "")
  public String getContactPerson() {
    return contactPerson;
  }

  public void setContactPerson(String contactPerson) {
    this.contactPerson = contactPerson;
  }

  public AdvertiserGetListStruct contactPersonEmail(String contactPersonEmail) {
    this.contactPersonEmail = contactPersonEmail;
    return this;
  }

  /**
   * Get contactPersonEmail
   *
   * @return contactPersonEmail
   */
  @ApiModelProperty(value = "")
  public String getContactPersonEmail() {
    return contactPersonEmail;
  }

  public void setContactPersonEmail(String contactPersonEmail) {
    this.contactPersonEmail = contactPersonEmail;
  }

  public AdvertiserGetListStruct contactPersonTelephone(String contactPersonTelephone) {
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

  public AdvertiserGetListStruct contactPersonMobile(String contactPersonMobile) {
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

  public AdvertiserGetListStruct wechatSpec(MpInfoRead wechatSpec) {
    this.wechatSpec = wechatSpec;
    return this;
  }

  /**
   * Get wechatSpec
   *
   * @return wechatSpec
   */
  @ApiModelProperty(value = "")
  public MpInfoRead getWechatSpec() {
    return wechatSpec;
  }

  public void setWechatSpec(MpInfoRead wechatSpec) {
    this.wechatSpec = wechatSpec;
  }

  public AdvertiserGetListStruct websites(List<WebsiteReadStruct> websites) {
    this.websites = websites;
    return this;
  }

  public AdvertiserGetListStruct addWebsitesItem(WebsiteReadStruct websitesItem) {
    if (this.websites == null) {
      this.websites = new ArrayList<WebsiteReadStruct>();
    }
    this.websites.add(websitesItem);
    return this;
  }

  /**
   * Get websites
   *
   * @return websites
   */
  @ApiModelProperty(value = "")
  public List<WebsiteReadStruct> getWebsites() {
    return websites;
  }

  public void setWebsites(List<WebsiteReadStruct> websites) {
    this.websites = websites;
  }

  public AdvertiserGetListStruct agencyAccountId(Long agencyAccountId) {
    this.agencyAccountId = agencyAccountId;
    return this;
  }

  /**
   * Get agencyAccountId
   *
   * @return agencyAccountId
   */
  @ApiModelProperty(value = "")
  public Long getAgencyAccountId() {
    return agencyAccountId;
  }

  public void setAgencyAccountId(Long agencyAccountId) {
    this.agencyAccountId = agencyAccountId;
  }

  public AdvertiserGetListStruct operators(List<AdvertiserOperatorStruct> operators) {
    this.operators = operators;
    return this;
  }

  public AdvertiserGetListStruct addOperatorsItem(AdvertiserOperatorStruct operatorsItem) {
    if (this.operators == null) {
      this.operators = new ArrayList<AdvertiserOperatorStruct>();
    }
    this.operators.add(operatorsItem);
    return this;
  }

  /**
   * Get operators
   *
   * @return operators
   */
  @ApiModelProperty(value = "")
  public List<AdvertiserOperatorStruct> getOperators() {
    return operators;
  }

  public void setOperators(List<AdvertiserOperatorStruct> operators) {
    this.operators = operators;
  }

  public AdvertiserGetListStruct accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   *
   * @return accountId
   */
  @ApiModelProperty(value = "")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public AdvertiserGetListStruct adQualificationImage(List<String> adQualificationImage) {
    this.adQualificationImage = adQualificationImage;
    return this;
  }

  public AdvertiserGetListStruct addAdQualificationImageItem(String adQualificationImageItem) {
    if (this.adQualificationImage == null) {
      this.adQualificationImage = new ArrayList<String>();
    }
    this.adQualificationImage.add(adQualificationImageItem);
    return this;
  }

  /**
   * Get adQualificationImage
   *
   * @return adQualificationImage
   */
  @ApiModelProperty(value = "")
  public List<String> getAdQualificationImage() {
    return adQualificationImage;
  }

  public void setAdQualificationImage(List<String> adQualificationImage) {
    this.adQualificationImage = adQualificationImage;
  }

  public AdvertiserGetListStruct certificationImage(String certificationImage) {
    this.certificationImage = certificationImage;
    return this;
  }

  /**
   * Get certificationImage
   *
   * @return certificationImage
   */
  @ApiModelProperty(value = "")
  public String getCertificationImage() {
    return certificationImage;
  }

  public void setCertificationImage(String certificationImage) {
    this.certificationImage = certificationImage;
  }

  public AdvertiserGetListStruct industryQualificationImage(
      List<String> industryQualificationImage) {
    this.industryQualificationImage = industryQualificationImage;
    return this;
  }

  public AdvertiserGetListStruct addIndustryQualificationImageItem(
      String industryQualificationImageItem) {
    if (this.industryQualificationImage == null) {
      this.industryQualificationImage = new ArrayList<String>();
    }
    this.industryQualificationImage.add(industryQualificationImageItem);
    return this;
  }

  /**
   * Get industryQualificationImage
   *
   * @return industryQualificationImage
   */
  @ApiModelProperty(value = "")
  public List<String> getIndustryQualificationImage() {
    return industryQualificationImage;
  }

  public void setIndustryQualificationImage(List<String> industryQualificationImage) {
    this.industryQualificationImage = industryQualificationImage;
  }

  public AdvertiserGetListStruct corporateImageName(String corporateImageName) {
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

  public AdvertiserGetListStruct corporateImageLogo(String corporateImageLogo) {
    this.corporateImageLogo = corporateImageLogo;
    return this;
  }

  /**
   * Get corporateImageLogo
   *
   * @return corporateImageLogo
   */
  @ApiModelProperty(value = "")
  public String getCorporateImageLogo() {
    return corporateImageLogo;
  }

  public void setCorporateImageLogo(String corporateImageLogo) {
    this.corporateImageLogo = corporateImageLogo;
  }

  public AdvertiserGetListStruct corporationLicence(String corporationLicence) {
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

  public AdvertiserGetListStruct customizedIndustry(String customizedIndustry) {
    this.customizedIndustry = customizedIndustry;
    return this;
  }

  /**
   * Get customizedIndustry
   *
   * @return customizedIndustry
   */
  @ApiModelProperty(value = "")
  public String getCustomizedIndustry() {
    return customizedIndustry;
  }

  public void setCustomizedIndustry(String customizedIndustry) {
    this.customizedIndustry = customizedIndustry;
  }

  public AdvertiserGetListStruct identityNumber(String identityNumber) {
    this.identityNumber = identityNumber;
    return this;
  }

  /**
   * Get identityNumber
   *
   * @return identityNumber
   */
  @ApiModelProperty(value = "")
  public String getIdentityNumber() {
    return identityNumber;
  }

  public void setIdentityNumber(String identityNumber) {
    this.identityNumber = identityNumber;
  }

  public AdvertiserGetListStruct systemIndustryId(Long systemIndustryId) {
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

  public AdvertiserGetListStruct rejectMessage(String rejectMessage) {
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
    AdvertiserGetListStruct advertiserGetListStruct = (AdvertiserGetListStruct) o;
    return Objects.equals(this.dailyBudget, advertiserGetListStruct.dailyBudget)
        && Objects.equals(this.systemStatus, advertiserGetListStruct.systemStatus)
        && Objects.equals(this.corporationName, advertiserGetListStruct.corporationName)
        && Objects.equals(this.certificationImageId, advertiserGetListStruct.certificationImageId)
        && Objects.equals(
            this.individualQualification, advertiserGetListStruct.individualQualification)
        && Objects.equals(this.introductionUrl, advertiserGetListStruct.introductionUrl)
        && Objects.equals(
            this.industryQualificationImageIdList,
            advertiserGetListStruct.industryQualificationImageIdList)
        && Objects.equals(
            this.adQualificationImageIdList, advertiserGetListStruct.adQualificationImageIdList)
        && Objects.equals(this.contactPerson, advertiserGetListStruct.contactPerson)
        && Objects.equals(this.contactPersonEmail, advertiserGetListStruct.contactPersonEmail)
        && Objects.equals(
            this.contactPersonTelephone, advertiserGetListStruct.contactPersonTelephone)
        && Objects.equals(this.contactPersonMobile, advertiserGetListStruct.contactPersonMobile)
        && Objects.equals(this.wechatSpec, advertiserGetListStruct.wechatSpec)
        && Objects.equals(this.websites, advertiserGetListStruct.websites)
        && Objects.equals(this.agencyAccountId, advertiserGetListStruct.agencyAccountId)
        && Objects.equals(this.operators, advertiserGetListStruct.operators)
        && Objects.equals(this.accountId, advertiserGetListStruct.accountId)
        && Objects.equals(this.adQualificationImage, advertiserGetListStruct.adQualificationImage)
        && Objects.equals(this.certificationImage, advertiserGetListStruct.certificationImage)
        && Objects.equals(
            this.industryQualificationImage, advertiserGetListStruct.industryQualificationImage)
        && Objects.equals(this.corporateImageName, advertiserGetListStruct.corporateImageName)
        && Objects.equals(this.corporateImageLogo, advertiserGetListStruct.corporateImageLogo)
        && Objects.equals(this.corporationLicence, advertiserGetListStruct.corporationLicence)
        && Objects.equals(this.customizedIndustry, advertiserGetListStruct.customizedIndustry)
        && Objects.equals(this.identityNumber, advertiserGetListStruct.identityNumber)
        && Objects.equals(this.systemIndustryId, advertiserGetListStruct.systemIndustryId)
        && Objects.equals(this.rejectMessage, advertiserGetListStruct.rejectMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dailyBudget,
        systemStatus,
        corporationName,
        certificationImageId,
        individualQualification,
        introductionUrl,
        industryQualificationImageIdList,
        adQualificationImageIdList,
        contactPerson,
        contactPersonEmail,
        contactPersonTelephone,
        contactPersonMobile,
        wechatSpec,
        websites,
        agencyAccountId,
        operators,
        accountId,
        adQualificationImage,
        certificationImage,
        industryQualificationImage,
        corporateImageName,
        corporateImageLogo,
        corporationLicence,
        customizedIndustry,
        identityNumber,
        systemIndustryId,
        rejectMessage);
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
