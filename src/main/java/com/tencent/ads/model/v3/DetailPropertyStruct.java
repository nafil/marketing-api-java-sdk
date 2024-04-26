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

/** 详情属性信息 */
@ApiModel(description = "详情属性信息")
public class DetailPropertyStruct {
  @SerializedName("property_name")
  private PromotedAssetAttrKey propertyName = null;

  @SerializedName("property_cn")
  private String propertyCn = null;

  @SerializedName("is_multiple")
  private Boolean isMultiple = null;

  @SerializedName("is_required")
  private Boolean isRequired = null;

  @SerializedName("property_class")
  private MarketingAssetAttrClass propertyClass = null;

  @SerializedName("property_type")
  private String propertyType = null;

  @SerializedName("property_value")
  private List<String> propertyValue = null;

  public DetailPropertyStruct propertyName(PromotedAssetAttrKey propertyName) {
    this.propertyName = propertyName;
    return this;
  }

  /**
   * Get propertyName
   *
   * @return propertyName
   */
  @ApiModelProperty(value = "")
  public PromotedAssetAttrKey getPropertyName() {
    return propertyName;
  }

  public void setPropertyName(PromotedAssetAttrKey propertyName) {
    this.propertyName = propertyName;
  }

  public DetailPropertyStruct propertyCn(String propertyCn) {
    this.propertyCn = propertyCn;
    return this;
  }

  /**
   * Get propertyCn
   *
   * @return propertyCn
   */
  @ApiModelProperty(value = "")
  public String getPropertyCn() {
    return propertyCn;
  }

  public void setPropertyCn(String propertyCn) {
    this.propertyCn = propertyCn;
  }

  public DetailPropertyStruct isMultiple(Boolean isMultiple) {
    this.isMultiple = isMultiple;
    return this;
  }

  /**
   * Get isMultiple
   *
   * @return isMultiple
   */
  @ApiModelProperty(value = "")
  public Boolean isIsMultiple() {
    return isMultiple;
  }

  public void setIsMultiple(Boolean isMultiple) {
    this.isMultiple = isMultiple;
  }

  public DetailPropertyStruct isRequired(Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
  }

  /**
   * Get isRequired
   *
   * @return isRequired
   */
  @ApiModelProperty(value = "")
  public Boolean isIsRequired() {
    return isRequired;
  }

  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }

  public DetailPropertyStruct propertyClass(MarketingAssetAttrClass propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

  /**
   * Get propertyClass
   *
   * @return propertyClass
   */
  @ApiModelProperty(value = "")
  public MarketingAssetAttrClass getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(MarketingAssetAttrClass propertyClass) {
    this.propertyClass = propertyClass;
  }

  public DetailPropertyStruct propertyType(String propertyType) {
    this.propertyType = propertyType;
    return this;
  }

  /**
   * Get propertyType
   *
   * @return propertyType
   */
  @ApiModelProperty(value = "")
  public String getPropertyType() {
    return propertyType;
  }

  public void setPropertyType(String propertyType) {
    this.propertyType = propertyType;
  }

  public DetailPropertyStruct propertyValue(List<String> propertyValue) {
    this.propertyValue = propertyValue;
    return this;
  }

  public DetailPropertyStruct addPropertyValueItem(String propertyValueItem) {
    if (this.propertyValue == null) {
      this.propertyValue = new ArrayList<String>();
    }
    this.propertyValue.add(propertyValueItem);
    return this;
  }

  /**
   * Get propertyValue
   *
   * @return propertyValue
   */
  @ApiModelProperty(value = "")
  public List<String> getPropertyValue() {
    return propertyValue;
  }

  public void setPropertyValue(List<String> propertyValue) {
    this.propertyValue = propertyValue;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailPropertyStruct detailPropertyStruct = (DetailPropertyStruct) o;
    return Objects.equals(this.propertyName, detailPropertyStruct.propertyName)
        && Objects.equals(this.propertyCn, detailPropertyStruct.propertyCn)
        && Objects.equals(this.isMultiple, detailPropertyStruct.isMultiple)
        && Objects.equals(this.isRequired, detailPropertyStruct.isRequired)
        && Objects.equals(this.propertyClass, detailPropertyStruct.propertyClass)
        && Objects.equals(this.propertyType, detailPropertyStruct.propertyType)
        && Objects.equals(this.propertyValue, detailPropertyStruct.propertyValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        propertyName,
        propertyCn,
        isMultiple,
        isRequired,
        propertyClass,
        propertyType,
        propertyValue);
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