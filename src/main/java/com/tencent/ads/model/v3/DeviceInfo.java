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

/** 拓展设备信息 */
@ApiModel(description = "拓展设备信息")
public class DeviceInfo {
  @SerializedName("package_name")
  private String packageName = null;

  @SerializedName("app_version")
  private String appVersion = null;

  @SerializedName("mac")
  private String mac = null;

  @SerializedName("device_brand")
  private String deviceBrand = null;

  @SerializedName("model")
  private String model = null;

  @SerializedName("os_version")
  private String osVersion = null;

  @SerializedName("language")
  private String language = null;

  @SerializedName("ip")
  private String ip = null;

  @SerializedName("user_agent")
  private String userAgent = null;

  @SerializedName("wifi_name")
  private String wifiName = null;

  public DeviceInfo packageName(String packageName) {
    this.packageName = packageName;
    return this;
  }

  /**
   * Get packageName
   *
   * @return packageName
   */
  @ApiModelProperty(value = "")
  public String getPackageName() {
    return packageName;
  }

  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }

  public DeviceInfo appVersion(String appVersion) {
    this.appVersion = appVersion;
    return this;
  }

  /**
   * Get appVersion
   *
   * @return appVersion
   */
  @ApiModelProperty(value = "")
  public String getAppVersion() {
    return appVersion;
  }

  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  public DeviceInfo mac(String mac) {
    this.mac = mac;
    return this;
  }

  /**
   * Get mac
   *
   * @return mac
   */
  @ApiModelProperty(value = "")
  public String getMac() {
    return mac;
  }

  public void setMac(String mac) {
    this.mac = mac;
  }

  public DeviceInfo deviceBrand(String deviceBrand) {
    this.deviceBrand = deviceBrand;
    return this;
  }

  /**
   * Get deviceBrand
   *
   * @return deviceBrand
   */
  @ApiModelProperty(value = "")
  public String getDeviceBrand() {
    return deviceBrand;
  }

  public void setDeviceBrand(String deviceBrand) {
    this.deviceBrand = deviceBrand;
  }

  public DeviceInfo model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   *
   * @return model
   */
  @ApiModelProperty(value = "")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public DeviceInfo osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

  /**
   * Get osVersion
   *
   * @return osVersion
   */
  @ApiModelProperty(value = "")
  public String getOsVersion() {
    return osVersion;
  }

  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

  public DeviceInfo language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   *
   * @return language
   */
  @ApiModelProperty(value = "")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public DeviceInfo ip(String ip) {
    this.ip = ip;
    return this;
  }

  /**
   * Get ip
   *
   * @return ip
   */
  @ApiModelProperty(value = "")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public DeviceInfo userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  /**
   * Get userAgent
   *
   * @return userAgent
   */
  @ApiModelProperty(value = "")
  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  public DeviceInfo wifiName(String wifiName) {
    this.wifiName = wifiName;
    return this;
  }

  /**
   * Get wifiName
   *
   * @return wifiName
   */
  @ApiModelProperty(value = "")
  public String getWifiName() {
    return wifiName;
  }

  public void setWifiName(String wifiName) {
    this.wifiName = wifiName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceInfo deviceInfo = (DeviceInfo) o;
    return Objects.equals(this.packageName, deviceInfo.packageName)
        && Objects.equals(this.appVersion, deviceInfo.appVersion)
        && Objects.equals(this.mac, deviceInfo.mac)
        && Objects.equals(this.deviceBrand, deviceInfo.deviceBrand)
        && Objects.equals(this.model, deviceInfo.model)
        && Objects.equals(this.osVersion, deviceInfo.osVersion)
        && Objects.equals(this.language, deviceInfo.language)
        && Objects.equals(this.ip, deviceInfo.ip)
        && Objects.equals(this.userAgent, deviceInfo.userAgent)
        && Objects.equals(this.wifiName, deviceInfo.wifiName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        packageName,
        appVersion,
        mac,
        deviceBrand,
        model,
        osVersion,
        language,
        ip,
        userAgent,
        wifiName);
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
