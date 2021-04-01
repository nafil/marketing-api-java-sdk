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
import java.util.Objects;

/** 字段取值 */
@ApiModel(description = "字段取值")
public class ProductSeriesSpecFilteringValueStruct {
  @SerializedName("field_value")
  private String fieldValue = null;

  @SerializedName("currency_type")
  private CurrencyType currencyType = null;

  public ProductSeriesSpecFilteringValueStruct fieldValue(String fieldValue) {
    this.fieldValue = fieldValue;
    return this;
  }

  /**
   * Get fieldValue
   *
   * @return fieldValue
   */
  @ApiModelProperty(value = "")
  public String getFieldValue() {
    return fieldValue;
  }

  public void setFieldValue(String fieldValue) {
    this.fieldValue = fieldValue;
  }

  public ProductSeriesSpecFilteringValueStruct currencyType(CurrencyType currencyType) {
    this.currencyType = currencyType;
    return this;
  }

  /**
   * Get currencyType
   *
   * @return currencyType
   */
  @ApiModelProperty(value = "")
  public CurrencyType getCurrencyType() {
    return currencyType;
  }

  public void setCurrencyType(CurrencyType currencyType) {
    this.currencyType = currencyType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSeriesSpecFilteringValueStruct productSeriesSpecFilteringValueStruct =
        (ProductSeriesSpecFilteringValueStruct) o;
    return Objects.equals(this.fieldValue, productSeriesSpecFilteringValueStruct.fieldValue)
        && Objects.equals(this.currencyType, productSeriesSpecFilteringValueStruct.currencyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldValue, currencyType);
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
