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

/** ProductSeriesAddRequest */
public class ProductSeriesAddRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("catalog_id")
  private Long catalogId = null;

  @SerializedName("series_name")
  private String seriesName = null;

  @SerializedName("definition")
  private ProductSeriesSpec definition = null;

  public ProductSeriesAddRequest accountId(Long accountId) {
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

  public ProductSeriesAddRequest catalogId(Long catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  /**
   * Get catalogId
   *
   * @return catalogId
   */
  @ApiModelProperty(value = "")
  public Long getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(Long catalogId) {
    this.catalogId = catalogId;
  }

  public ProductSeriesAddRequest seriesName(String seriesName) {
    this.seriesName = seriesName;
    return this;
  }

  /**
   * Get seriesName
   *
   * @return seriesName
   */
  @ApiModelProperty(value = "")
  public String getSeriesName() {
    return seriesName;
  }

  public void setSeriesName(String seriesName) {
    this.seriesName = seriesName;
  }

  public ProductSeriesAddRequest definition(ProductSeriesSpec definition) {
    this.definition = definition;
    return this;
  }

  /**
   * Get definition
   *
   * @return definition
   */
  @ApiModelProperty(value = "")
  public ProductSeriesSpec getDefinition() {
    return definition;
  }

  public void setDefinition(ProductSeriesSpec definition) {
    this.definition = definition;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSeriesAddRequest productSeriesAddRequest = (ProductSeriesAddRequest) o;
    return Objects.equals(this.accountId, productSeriesAddRequest.accountId)
        && Objects.equals(this.catalogId, productSeriesAddRequest.catalogId)
        && Objects.equals(this.seriesName, productSeriesAddRequest.seriesName)
        && Objects.equals(this.definition, productSeriesAddRequest.definition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, catalogId, seriesName, definition);
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
