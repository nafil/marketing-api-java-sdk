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
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ProductSeriesAddResponseData */
public class ProductSeriesAddResponseData {
  @SerializedName("product_series_id")
  private Long productSeriesId = null;

  @SerializedName("product_series_name")
  private String productSeriesName = null;

  public ProductSeriesAddResponseData productSeriesId(Long productSeriesId) {
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

  public ProductSeriesAddResponseData productSeriesName(String productSeriesName) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSeriesAddResponseData productSeriesAddResponseData = (ProductSeriesAddResponseData) o;
    return Objects.equals(this.productSeriesId, productSeriesAddResponseData.productSeriesId)
        && Objects.equals(this.productSeriesName, productSeriesAddResponseData.productSeriesName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productSeriesId, productSeriesName);
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