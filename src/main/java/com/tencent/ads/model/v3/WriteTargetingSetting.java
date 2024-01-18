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

/** 定向详细设置 */
@ApiModel(description = "定向详细设置")
public class WriteTargetingSetting {
  @SerializedName("geo_location")
  private GeoLocations geoLocation = null;

  @SerializedName("gender")
  private List<String> gender = null;

  @SerializedName("age")
  private List<AgeStruct> age = null;

  @SerializedName("education")
  private List<String> education = null;

  @SerializedName("app_install_status")
  private List<String> appInstallStatus = null;

  @SerializedName("marital_status")
  private List<String> maritalStatus = null;

  @SerializedName("excluded_converted_audience")
  private ExcludedConvertedAudience excludedConvertedAudience = null;

  @SerializedName("custom_audience")
  private List<Long> customAudience = null;

  @SerializedName("excluded_custom_audience")
  private List<Long> excludedCustomAudience = null;

  @SerializedName("device_brand_model")
  private DeviceBrandModel deviceBrandModel = null;

  @SerializedName("user_os")
  private List<String> userOs = null;

  @SerializedName("network_type")
  private List<String> networkType = null;

  @SerializedName("device_price")
  private List<String> devicePrice = null;

  @SerializedName("wechat_ad_behavior")
  private WechatAdBehavior wechatAdBehavior = null;

  @SerializedName("game_consumption_level")
  private List<String> gameConsumptionLevel = null;

  @SerializedName("excluded_os")
  private List<String> excludedOs = null;

  public WriteTargetingSetting geoLocation(GeoLocations geoLocation) {
    this.geoLocation = geoLocation;
    return this;
  }

  /**
   * Get geoLocation
   *
   * @return geoLocation
   */
  @ApiModelProperty(value = "")
  public GeoLocations getGeoLocation() {
    return geoLocation;
  }

  public void setGeoLocation(GeoLocations geoLocation) {
    this.geoLocation = geoLocation;
  }

  public WriteTargetingSetting gender(List<String> gender) {
    this.gender = gender;
    return this;
  }

  public WriteTargetingSetting addGenderItem(String genderItem) {
    if (this.gender == null) {
      this.gender = new ArrayList<String>();
    }
    this.gender.add(genderItem);
    return this;
  }

  /**
   * Get gender
   *
   * @return gender
   */
  @ApiModelProperty(value = "")
  public List<String> getGender() {
    return gender;
  }

  public void setGender(List<String> gender) {
    this.gender = gender;
  }

  public WriteTargetingSetting age(List<AgeStruct> age) {
    this.age = age;
    return this;
  }

  public WriteTargetingSetting addAgeItem(AgeStruct ageItem) {
    if (this.age == null) {
      this.age = new ArrayList<AgeStruct>();
    }
    this.age.add(ageItem);
    return this;
  }

  /**
   * Get age
   *
   * @return age
   */
  @ApiModelProperty(value = "")
  public List<AgeStruct> getAge() {
    return age;
  }

  public void setAge(List<AgeStruct> age) {
    this.age = age;
  }

  public WriteTargetingSetting education(List<String> education) {
    this.education = education;
    return this;
  }

  public WriteTargetingSetting addEducationItem(String educationItem) {
    if (this.education == null) {
      this.education = new ArrayList<String>();
    }
    this.education.add(educationItem);
    return this;
  }

  /**
   * Get education
   *
   * @return education
   */
  @ApiModelProperty(value = "")
  public List<String> getEducation() {
    return education;
  }

  public void setEducation(List<String> education) {
    this.education = education;
  }

  public WriteTargetingSetting appInstallStatus(List<String> appInstallStatus) {
    this.appInstallStatus = appInstallStatus;
    return this;
  }

  public WriteTargetingSetting addAppInstallStatusItem(String appInstallStatusItem) {
    if (this.appInstallStatus == null) {
      this.appInstallStatus = new ArrayList<String>();
    }
    this.appInstallStatus.add(appInstallStatusItem);
    return this;
  }

  /**
   * Get appInstallStatus
   *
   * @return appInstallStatus
   */
  @ApiModelProperty(value = "")
  public List<String> getAppInstallStatus() {
    return appInstallStatus;
  }

  public void setAppInstallStatus(List<String> appInstallStatus) {
    this.appInstallStatus = appInstallStatus;
  }

  public WriteTargetingSetting maritalStatus(List<String> maritalStatus) {
    this.maritalStatus = maritalStatus;
    return this;
  }

  public WriteTargetingSetting addMaritalStatusItem(String maritalStatusItem) {
    if (this.maritalStatus == null) {
      this.maritalStatus = new ArrayList<String>();
    }
    this.maritalStatus.add(maritalStatusItem);
    return this;
  }

  /**
   * Get maritalStatus
   *
   * @return maritalStatus
   */
  @ApiModelProperty(value = "")
  public List<String> getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(List<String> maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public WriteTargetingSetting excludedConvertedAudience(
      ExcludedConvertedAudience excludedConvertedAudience) {
    this.excludedConvertedAudience = excludedConvertedAudience;
    return this;
  }

  /**
   * Get excludedConvertedAudience
   *
   * @return excludedConvertedAudience
   */
  @ApiModelProperty(value = "")
  public ExcludedConvertedAudience getExcludedConvertedAudience() {
    return excludedConvertedAudience;
  }

  public void setExcludedConvertedAudience(ExcludedConvertedAudience excludedConvertedAudience) {
    this.excludedConvertedAudience = excludedConvertedAudience;
  }

  public WriteTargetingSetting customAudience(List<Long> customAudience) {
    this.customAudience = customAudience;
    return this;
  }

  public WriteTargetingSetting addCustomAudienceItem(Long customAudienceItem) {
    if (this.customAudience == null) {
      this.customAudience = new ArrayList<Long>();
    }
    this.customAudience.add(customAudienceItem);
    return this;
  }

  /**
   * Get customAudience
   *
   * @return customAudience
   */
  @ApiModelProperty(value = "")
  public List<Long> getCustomAudience() {
    return customAudience;
  }

  public void setCustomAudience(List<Long> customAudience) {
    this.customAudience = customAudience;
  }

  public WriteTargetingSetting excludedCustomAudience(List<Long> excludedCustomAudience) {
    this.excludedCustomAudience = excludedCustomAudience;
    return this;
  }

  public WriteTargetingSetting addExcludedCustomAudienceItem(Long excludedCustomAudienceItem) {
    if (this.excludedCustomAudience == null) {
      this.excludedCustomAudience = new ArrayList<Long>();
    }
    this.excludedCustomAudience.add(excludedCustomAudienceItem);
    return this;
  }

  /**
   * Get excludedCustomAudience
   *
   * @return excludedCustomAudience
   */
  @ApiModelProperty(value = "")
  public List<Long> getExcludedCustomAudience() {
    return excludedCustomAudience;
  }

  public void setExcludedCustomAudience(List<Long> excludedCustomAudience) {
    this.excludedCustomAudience = excludedCustomAudience;
  }

  public WriteTargetingSetting deviceBrandModel(DeviceBrandModel deviceBrandModel) {
    this.deviceBrandModel = deviceBrandModel;
    return this;
  }

  /**
   * Get deviceBrandModel
   *
   * @return deviceBrandModel
   */
  @ApiModelProperty(value = "")
  public DeviceBrandModel getDeviceBrandModel() {
    return deviceBrandModel;
  }

  public void setDeviceBrandModel(DeviceBrandModel deviceBrandModel) {
    this.deviceBrandModel = deviceBrandModel;
  }

  public WriteTargetingSetting userOs(List<String> userOs) {
    this.userOs = userOs;
    return this;
  }

  public WriteTargetingSetting addUserOsItem(String userOsItem) {
    if (this.userOs == null) {
      this.userOs = new ArrayList<String>();
    }
    this.userOs.add(userOsItem);
    return this;
  }

  /**
   * Get userOs
   *
   * @return userOs
   */
  @ApiModelProperty(value = "")
  public List<String> getUserOs() {
    return userOs;
  }

  public void setUserOs(List<String> userOs) {
    this.userOs = userOs;
  }

  public WriteTargetingSetting networkType(List<String> networkType) {
    this.networkType = networkType;
    return this;
  }

  public WriteTargetingSetting addNetworkTypeItem(String networkTypeItem) {
    if (this.networkType == null) {
      this.networkType = new ArrayList<String>();
    }
    this.networkType.add(networkTypeItem);
    return this;
  }

  /**
   * Get networkType
   *
   * @return networkType
   */
  @ApiModelProperty(value = "")
  public List<String> getNetworkType() {
    return networkType;
  }

  public void setNetworkType(List<String> networkType) {
    this.networkType = networkType;
  }

  public WriteTargetingSetting devicePrice(List<String> devicePrice) {
    this.devicePrice = devicePrice;
    return this;
  }

  public WriteTargetingSetting addDevicePriceItem(String devicePriceItem) {
    if (this.devicePrice == null) {
      this.devicePrice = new ArrayList<String>();
    }
    this.devicePrice.add(devicePriceItem);
    return this;
  }

  /**
   * Get devicePrice
   *
   * @return devicePrice
   */
  @ApiModelProperty(value = "")
  public List<String> getDevicePrice() {
    return devicePrice;
  }

  public void setDevicePrice(List<String> devicePrice) {
    this.devicePrice = devicePrice;
  }

  public WriteTargetingSetting wechatAdBehavior(WechatAdBehavior wechatAdBehavior) {
    this.wechatAdBehavior = wechatAdBehavior;
    return this;
  }

  /**
   * Get wechatAdBehavior
   *
   * @return wechatAdBehavior
   */
  @ApiModelProperty(value = "")
  public WechatAdBehavior getWechatAdBehavior() {
    return wechatAdBehavior;
  }

  public void setWechatAdBehavior(WechatAdBehavior wechatAdBehavior) {
    this.wechatAdBehavior = wechatAdBehavior;
  }

  public WriteTargetingSetting gameConsumptionLevel(List<String> gameConsumptionLevel) {
    this.gameConsumptionLevel = gameConsumptionLevel;
    return this;
  }

  public WriteTargetingSetting addGameConsumptionLevelItem(String gameConsumptionLevelItem) {
    if (this.gameConsumptionLevel == null) {
      this.gameConsumptionLevel = new ArrayList<String>();
    }
    this.gameConsumptionLevel.add(gameConsumptionLevelItem);
    return this;
  }

  /**
   * Get gameConsumptionLevel
   *
   * @return gameConsumptionLevel
   */
  @ApiModelProperty(value = "")
  public List<String> getGameConsumptionLevel() {
    return gameConsumptionLevel;
  }

  public void setGameConsumptionLevel(List<String> gameConsumptionLevel) {
    this.gameConsumptionLevel = gameConsumptionLevel;
  }

  public WriteTargetingSetting excludedOs(List<String> excludedOs) {
    this.excludedOs = excludedOs;
    return this;
  }

  public WriteTargetingSetting addExcludedOsItem(String excludedOsItem) {
    if (this.excludedOs == null) {
      this.excludedOs = new ArrayList<String>();
    }
    this.excludedOs.add(excludedOsItem);
    return this;
  }

  /**
   * Get excludedOs
   *
   * @return excludedOs
   */
  @ApiModelProperty(value = "")
  public List<String> getExcludedOs() {
    return excludedOs;
  }

  public void setExcludedOs(List<String> excludedOs) {
    this.excludedOs = excludedOs;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WriteTargetingSetting writeTargetingSetting = (WriteTargetingSetting) o;
    return Objects.equals(this.geoLocation, writeTargetingSetting.geoLocation)
        && Objects.equals(this.gender, writeTargetingSetting.gender)
        && Objects.equals(this.age, writeTargetingSetting.age)
        && Objects.equals(this.education, writeTargetingSetting.education)
        && Objects.equals(this.appInstallStatus, writeTargetingSetting.appInstallStatus)
        && Objects.equals(this.maritalStatus, writeTargetingSetting.maritalStatus)
        && Objects.equals(
            this.excludedConvertedAudience, writeTargetingSetting.excludedConvertedAudience)
        && Objects.equals(this.customAudience, writeTargetingSetting.customAudience)
        && Objects.equals(this.excludedCustomAudience, writeTargetingSetting.excludedCustomAudience)
        && Objects.equals(this.deviceBrandModel, writeTargetingSetting.deviceBrandModel)
        && Objects.equals(this.userOs, writeTargetingSetting.userOs)
        && Objects.equals(this.networkType, writeTargetingSetting.networkType)
        && Objects.equals(this.devicePrice, writeTargetingSetting.devicePrice)
        && Objects.equals(this.wechatAdBehavior, writeTargetingSetting.wechatAdBehavior)
        && Objects.equals(this.gameConsumptionLevel, writeTargetingSetting.gameConsumptionLevel)
        && Objects.equals(this.excludedOs, writeTargetingSetting.excludedOs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        geoLocation,
        gender,
        age,
        education,
        appInstallStatus,
        maritalStatus,
        excludedConvertedAudience,
        customAudience,
        excludedCustomAudience,
        deviceBrandModel,
        userOs,
        networkType,
        devicePrice,
        wechatAdBehavior,
        gameConsumptionLevel,
        excludedOs);
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
