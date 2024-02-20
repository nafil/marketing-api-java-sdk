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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 门店经营信息 */
@ApiModel(description = "门店经营信息")
public class LocalStoreBizInfoStruct {
  @SerializedName("poi_id")
  private String poiId = null;

  @SerializedName("customer_profile")
  private CustomerProfileStruct customerProfile = null;

  @SerializedName("customer_per_cost")
  private Long customerPerCost = null;

  @SerializedName("first_category_id")
  private Long firstCategoryId = null;

  @SerializedName("second_category_id")
  private Long secondCategoryId = null;

  @SerializedName("third_category_id")
  private Long thirdCategoryId = null;

  @SerializedName("fourth_category_id")
  private Long fourthCategoryId = null;

  @SerializedName("first_category_name")
  private String firstCategoryName = null;

  @SerializedName("second_category_name")
  private String secondCategoryName = null;

  @SerializedName("third_category_name")
  private String thirdCategoryName = null;

  @SerializedName("fourth_category_name")
  private String fourthCategoryName = null;

  @SerializedName("peak_period")
  private List<PeakPeriod> peakPeriod = null;

  @SerializedName("opening_hours")
  private List<OpeningHours> openingHours = null;

  @SerializedName("telephone")
  private String telephone = null;

  @SerializedName("special_service")
  private List<String> specialService = null;

  @SerializedName("opening_status")
  private LocalStoreOpeningStatus openingStatus = null;

  @SerializedName("star")
  private Double star = null;

  @SerializedName("intro")
  private String intro = null;

  @SerializedName("hide_poi")
  private Boolean hidePoi = null;

  public LocalStoreBizInfoStruct poiId(String poiId) {
    this.poiId = poiId;
    return this;
  }

  /**
   * Get poiId
   *
   * @return poiId
   */
  @ApiModelProperty(value = "")
  public String getPoiId() {
    return poiId;
  }

  public void setPoiId(String poiId) {
    this.poiId = poiId;
  }

  public LocalStoreBizInfoStruct customerProfile(CustomerProfileStruct customerProfile) {
    this.customerProfile = customerProfile;
    return this;
  }

  /**
   * Get customerProfile
   *
   * @return customerProfile
   */
  @ApiModelProperty(value = "")
  public CustomerProfileStruct getCustomerProfile() {
    return customerProfile;
  }

  public void setCustomerProfile(CustomerProfileStruct customerProfile) {
    this.customerProfile = customerProfile;
  }

  public LocalStoreBizInfoStruct customerPerCost(Long customerPerCost) {
    this.customerPerCost = customerPerCost;
    return this;
  }

  /**
   * Get customerPerCost
   *
   * @return customerPerCost
   */
  @ApiModelProperty(value = "")
  public Long getCustomerPerCost() {
    return customerPerCost;
  }

  public void setCustomerPerCost(Long customerPerCost) {
    this.customerPerCost = customerPerCost;
  }

  public LocalStoreBizInfoStruct firstCategoryId(Long firstCategoryId) {
    this.firstCategoryId = firstCategoryId;
    return this;
  }

  /**
   * Get firstCategoryId
   *
   * @return firstCategoryId
   */
  @ApiModelProperty(value = "")
  public Long getFirstCategoryId() {
    return firstCategoryId;
  }

  public void setFirstCategoryId(Long firstCategoryId) {
    this.firstCategoryId = firstCategoryId;
  }

  public LocalStoreBizInfoStruct secondCategoryId(Long secondCategoryId) {
    this.secondCategoryId = secondCategoryId;
    return this;
  }

  /**
   * Get secondCategoryId
   *
   * @return secondCategoryId
   */
  @ApiModelProperty(value = "")
  public Long getSecondCategoryId() {
    return secondCategoryId;
  }

  public void setSecondCategoryId(Long secondCategoryId) {
    this.secondCategoryId = secondCategoryId;
  }

  public LocalStoreBizInfoStruct thirdCategoryId(Long thirdCategoryId) {
    this.thirdCategoryId = thirdCategoryId;
    return this;
  }

  /**
   * Get thirdCategoryId
   *
   * @return thirdCategoryId
   */
  @ApiModelProperty(value = "")
  public Long getThirdCategoryId() {
    return thirdCategoryId;
  }

  public void setThirdCategoryId(Long thirdCategoryId) {
    this.thirdCategoryId = thirdCategoryId;
  }

  public LocalStoreBizInfoStruct fourthCategoryId(Long fourthCategoryId) {
    this.fourthCategoryId = fourthCategoryId;
    return this;
  }

  /**
   * Get fourthCategoryId
   *
   * @return fourthCategoryId
   */
  @ApiModelProperty(value = "")
  public Long getFourthCategoryId() {
    return fourthCategoryId;
  }

  public void setFourthCategoryId(Long fourthCategoryId) {
    this.fourthCategoryId = fourthCategoryId;
  }

  public LocalStoreBizInfoStruct firstCategoryName(String firstCategoryName) {
    this.firstCategoryName = firstCategoryName;
    return this;
  }

  /**
   * Get firstCategoryName
   *
   * @return firstCategoryName
   */
  @ApiModelProperty(value = "")
  public String getFirstCategoryName() {
    return firstCategoryName;
  }

  public void setFirstCategoryName(String firstCategoryName) {
    this.firstCategoryName = firstCategoryName;
  }

  public LocalStoreBizInfoStruct secondCategoryName(String secondCategoryName) {
    this.secondCategoryName = secondCategoryName;
    return this;
  }

  /**
   * Get secondCategoryName
   *
   * @return secondCategoryName
   */
  @ApiModelProperty(value = "")
  public String getSecondCategoryName() {
    return secondCategoryName;
  }

  public void setSecondCategoryName(String secondCategoryName) {
    this.secondCategoryName = secondCategoryName;
  }

  public LocalStoreBizInfoStruct thirdCategoryName(String thirdCategoryName) {
    this.thirdCategoryName = thirdCategoryName;
    return this;
  }

  /**
   * Get thirdCategoryName
   *
   * @return thirdCategoryName
   */
  @ApiModelProperty(value = "")
  public String getThirdCategoryName() {
    return thirdCategoryName;
  }

  public void setThirdCategoryName(String thirdCategoryName) {
    this.thirdCategoryName = thirdCategoryName;
  }

  public LocalStoreBizInfoStruct fourthCategoryName(String fourthCategoryName) {
    this.fourthCategoryName = fourthCategoryName;
    return this;
  }

  /**
   * Get fourthCategoryName
   *
   * @return fourthCategoryName
   */
  @ApiModelProperty(value = "")
  public String getFourthCategoryName() {
    return fourthCategoryName;
  }

  public void setFourthCategoryName(String fourthCategoryName) {
    this.fourthCategoryName = fourthCategoryName;
  }

  public LocalStoreBizInfoStruct peakPeriod(List<PeakPeriod> peakPeriod) {
    this.peakPeriod = peakPeriod;
    return this;
  }

  public LocalStoreBizInfoStruct addPeakPeriodItem(PeakPeriod peakPeriodItem) {
    if (this.peakPeriod == null) {
      this.peakPeriod = new ArrayList<PeakPeriod>();
    }
    this.peakPeriod.add(peakPeriodItem);
    return this;
  }

  /**
   * Get peakPeriod
   *
   * @return peakPeriod
   */
  @ApiModelProperty(value = "")
  public List<PeakPeriod> getPeakPeriod() {
    return peakPeriod;
  }

  public void setPeakPeriod(List<PeakPeriod> peakPeriod) {
    this.peakPeriod = peakPeriod;
  }

  public LocalStoreBizInfoStruct openingHours(List<OpeningHours> openingHours) {
    this.openingHours = openingHours;
    return this;
  }

  public LocalStoreBizInfoStruct addOpeningHoursItem(OpeningHours openingHoursItem) {
    if (this.openingHours == null) {
      this.openingHours = new ArrayList<OpeningHours>();
    }
    this.openingHours.add(openingHoursItem);
    return this;
  }

  /**
   * Get openingHours
   *
   * @return openingHours
   */
  @ApiModelProperty(value = "")
  public List<OpeningHours> getOpeningHours() {
    return openingHours;
  }

  public void setOpeningHours(List<OpeningHours> openingHours) {
    this.openingHours = openingHours;
  }

  public LocalStoreBizInfoStruct telephone(String telephone) {
    this.telephone = telephone;
    return this;
  }

  /**
   * Get telephone
   *
   * @return telephone
   */
  @ApiModelProperty(value = "")
  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public LocalStoreBizInfoStruct specialService(List<String> specialService) {
    this.specialService = specialService;
    return this;
  }

  public LocalStoreBizInfoStruct addSpecialServiceItem(String specialServiceItem) {
    if (this.specialService == null) {
      this.specialService = new ArrayList<String>();
    }
    this.specialService.add(specialServiceItem);
    return this;
  }

  /**
   * Get specialService
   *
   * @return specialService
   */
  @ApiModelProperty(value = "")
  public List<String> getSpecialService() {
    return specialService;
  }

  public void setSpecialService(List<String> specialService) {
    this.specialService = specialService;
  }

  public LocalStoreBizInfoStruct openingStatus(LocalStoreOpeningStatus openingStatus) {
    this.openingStatus = openingStatus;
    return this;
  }

  /**
   * Get openingStatus
   *
   * @return openingStatus
   */
  @ApiModelProperty(value = "")
  public LocalStoreOpeningStatus getOpeningStatus() {
    return openingStatus;
  }

  public void setOpeningStatus(LocalStoreOpeningStatus openingStatus) {
    this.openingStatus = openingStatus;
  }

  public LocalStoreBizInfoStruct star(Double star) {
    this.star = star;
    return this;
  }

  /**
   * Get star
   *
   * @return star
   */
  @ApiModelProperty(value = "")
  public Double getStar() {
    return star;
  }

  public void setStar(Double star) {
    this.star = star;
  }

  public LocalStoreBizInfoStruct intro(String intro) {
    this.intro = intro;
    return this;
  }

  /**
   * Get intro
   *
   * @return intro
   */
  @ApiModelProperty(value = "")
  public String getIntro() {
    return intro;
  }

  public void setIntro(String intro) {
    this.intro = intro;
  }

  public LocalStoreBizInfoStruct hidePoi(Boolean hidePoi) {
    this.hidePoi = hidePoi;
    return this;
  }

  /**
   * Get hidePoi
   *
   * @return hidePoi
   */
  @ApiModelProperty(value = "")
  public Boolean isHidePoi() {
    return hidePoi;
  }

  public void setHidePoi(Boolean hidePoi) {
    this.hidePoi = hidePoi;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalStoreBizInfoStruct localStoreBizInfoStruct = (LocalStoreBizInfoStruct) o;
    return Objects.equals(this.poiId, localStoreBizInfoStruct.poiId)
        && Objects.equals(this.customerProfile, localStoreBizInfoStruct.customerProfile)
        && Objects.equals(this.customerPerCost, localStoreBizInfoStruct.customerPerCost)
        && Objects.equals(this.firstCategoryId, localStoreBizInfoStruct.firstCategoryId)
        && Objects.equals(this.secondCategoryId, localStoreBizInfoStruct.secondCategoryId)
        && Objects.equals(this.thirdCategoryId, localStoreBizInfoStruct.thirdCategoryId)
        && Objects.equals(this.fourthCategoryId, localStoreBizInfoStruct.fourthCategoryId)
        && Objects.equals(this.firstCategoryName, localStoreBizInfoStruct.firstCategoryName)
        && Objects.equals(this.secondCategoryName, localStoreBizInfoStruct.secondCategoryName)
        && Objects.equals(this.thirdCategoryName, localStoreBizInfoStruct.thirdCategoryName)
        && Objects.equals(this.fourthCategoryName, localStoreBizInfoStruct.fourthCategoryName)
        && Objects.equals(this.peakPeriod, localStoreBizInfoStruct.peakPeriod)
        && Objects.equals(this.openingHours, localStoreBizInfoStruct.openingHours)
        && Objects.equals(this.telephone, localStoreBizInfoStruct.telephone)
        && Objects.equals(this.specialService, localStoreBizInfoStruct.specialService)
        && Objects.equals(this.openingStatus, localStoreBizInfoStruct.openingStatus)
        && Objects.equals(this.star, localStoreBizInfoStruct.star)
        && Objects.equals(this.intro, localStoreBizInfoStruct.intro)
        && Objects.equals(this.hidePoi, localStoreBizInfoStruct.hidePoi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        poiId,
        customerProfile,
        customerPerCost,
        firstCategoryId,
        secondCategoryId,
        thirdCategoryId,
        fourthCategoryId,
        firstCategoryName,
        secondCategoryName,
        thirdCategoryName,
        fourthCategoryName,
        peakPeriod,
        openingHours,
        telephone,
        specialService,
        openingStatus,
        star,
        intro,
        hidePoi);
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