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

/** 映射信息 */
@ApiModel(description = "映射信息")
public class DeriveMateriaResultItem {
  @SerializedName("derive_material")
  private DeriveMaterial deriveMaterial = null;

  @SerializedName("original_material")
  private List<DeriveMaterial> originalMaterial = null;

  public DeriveMateriaResultItem deriveMaterial(DeriveMaterial deriveMaterial) {
    this.deriveMaterial = deriveMaterial;
    return this;
  }

  /**
   * Get deriveMaterial
   *
   * @return deriveMaterial
   */
  @ApiModelProperty(value = "")
  public DeriveMaterial getDeriveMaterial() {
    return deriveMaterial;
  }

  public void setDeriveMaterial(DeriveMaterial deriveMaterial) {
    this.deriveMaterial = deriveMaterial;
  }

  public DeriveMateriaResultItem originalMaterial(List<DeriveMaterial> originalMaterial) {
    this.originalMaterial = originalMaterial;
    return this;
  }

  public DeriveMateriaResultItem addOriginalMaterialItem(DeriveMaterial originalMaterialItem) {
    if (this.originalMaterial == null) {
      this.originalMaterial = new ArrayList<DeriveMaterial>();
    }
    this.originalMaterial.add(originalMaterialItem);
    return this;
  }

  /**
   * Get originalMaterial
   *
   * @return originalMaterial
   */
  @ApiModelProperty(value = "")
  public List<DeriveMaterial> getOriginalMaterial() {
    return originalMaterial;
  }

  public void setOriginalMaterial(List<DeriveMaterial> originalMaterial) {
    this.originalMaterial = originalMaterial;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeriveMateriaResultItem deriveMateriaResultItem = (DeriveMateriaResultItem) o;
    return Objects.equals(this.deriveMaterial, deriveMateriaResultItem.deriveMaterial)
        && Objects.equals(this.originalMaterial, deriveMateriaResultItem.originalMaterial);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deriveMaterial, originalMaterial);
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