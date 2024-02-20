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

/** 推广资产属性信息 */
@ApiModel(description = "推广资产属性信息")
public class PropertyStruct {
  @SerializedName("property_name")
  private PromotedAssetAttrKey propertyName = null;

  @SerializedName("property_value")
  private List<String> propertyValue = null;

  public PropertyStruct propertyName(PromotedAssetAttrKey propertyName) {
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

  public PropertyStruct propertyValue(List<String> propertyValue) {
    this.propertyValue = propertyValue;
    return this;
  }

  public PropertyStruct addPropertyValueItem(String propertyValueItem) {
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
    PropertyStruct propertyStruct = (PropertyStruct) o;
    return Objects.equals(this.propertyName, propertyStruct.propertyName)
        && Objects.equals(this.propertyValue, propertyStruct.propertyValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyName, propertyValue);
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