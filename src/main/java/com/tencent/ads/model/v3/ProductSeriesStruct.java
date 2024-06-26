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

/** 商品系列信息 */
@ApiModel(description = "商品系列信息")
public class ProductSeriesStruct {
  @SerializedName("product_series_id")
  private Long productSeriesId = null;

  @SerializedName("product_series_name")
  private String productSeriesName = null;

  @SerializedName("product_series_description")
  private String productSeriesDescription = null;

  @SerializedName("product_series_type")
  private ProductSeriesType productSeriesType = null;

  @SerializedName("product_series")
  private ProductSeriesSpec productSeries = null;

  public ProductSeriesStruct productSeriesId(Long productSeriesId) {
    this.productSeriesId = productSeriesId;
    return this;
  }

  /**
   * Get productSeriesId
   *
   * @return productSeriesId
   */
  @ApiModelProperty(value = "")
  public Long getProductSeriesId() {
    return productSeriesId;
  }

  public void setProductSeriesId(Long productSeriesId) {
    this.productSeriesId = productSeriesId;
  }

  public ProductSeriesStruct productSeriesName(String productSeriesName) {
    this.productSeriesName = productSeriesName;
    return this;
  }

  /**
   * Get productSeriesName
   *
   * @return productSeriesName
   */
  @ApiModelProperty(value = "")
  public String getProductSeriesName() {
    return productSeriesName;
  }

  public void setProductSeriesName(String productSeriesName) {
    this.productSeriesName = productSeriesName;
  }

  public ProductSeriesStruct productSeriesDescription(String productSeriesDescription) {
    this.productSeriesDescription = productSeriesDescription;
    return this;
  }

  /**
   * Get productSeriesDescription
   *
   * @return productSeriesDescription
   */
  @ApiModelProperty(value = "")
  public String getProductSeriesDescription() {
    return productSeriesDescription;
  }

  public void setProductSeriesDescription(String productSeriesDescription) {
    this.productSeriesDescription = productSeriesDescription;
  }

  public ProductSeriesStruct productSeriesType(ProductSeriesType productSeriesType) {
    this.productSeriesType = productSeriesType;
    return this;
  }

  /**
   * Get productSeriesType
   *
   * @return productSeriesType
   */
  @ApiModelProperty(value = "")
  public ProductSeriesType getProductSeriesType() {
    return productSeriesType;
  }

  public void setProductSeriesType(ProductSeriesType productSeriesType) {
    this.productSeriesType = productSeriesType;
  }

  public ProductSeriesStruct productSeries(ProductSeriesSpec productSeries) {
    this.productSeries = productSeries;
    return this;
  }

  /**
   * Get productSeries
   *
   * @return productSeries
   */
  @ApiModelProperty(value = "")
  public ProductSeriesSpec getProductSeries() {
    return productSeries;
  }

  public void setProductSeries(ProductSeriesSpec productSeries) {
    this.productSeries = productSeries;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSeriesStruct productSeriesStruct = (ProductSeriesStruct) o;
    return Objects.equals(this.productSeriesId, productSeriesStruct.productSeriesId)
        && Objects.equals(this.productSeriesName, productSeriesStruct.productSeriesName)
        && Objects.equals(
            this.productSeriesDescription, productSeriesStruct.productSeriesDescription)
        && Objects.equals(this.productSeriesType, productSeriesStruct.productSeriesType)
        && Objects.equals(this.productSeries, productSeriesStruct.productSeries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        productSeriesId,
        productSeriesName,
        productSeriesDescription,
        productSeriesType,
        productSeries);
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
