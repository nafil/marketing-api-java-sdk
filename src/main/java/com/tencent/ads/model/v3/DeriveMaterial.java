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

/** 衍生素材 */
@ApiModel(description = "衍生素材")
public class DeriveMaterial {
  @SerializedName("material_id")
  private String materialId = null;

  @SerializedName("type")
  private TemplateType type = null;

  public DeriveMaterial materialId(String materialId) {
    this.materialId = materialId;
    return this;
  }

  /**
   * Get materialId
   *
   * @return materialId
   */
  @ApiModelProperty(value = "")
  public String getMaterialId() {
    return materialId;
  }

  public void setMaterialId(String materialId) {
    this.materialId = materialId;
  }

  public DeriveMaterial type(TemplateType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @ApiModelProperty(value = "")
  public TemplateType getType() {
    return type;
  }

  public void setType(TemplateType type) {
    this.type = type;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeriveMaterial deriveMaterial = (DeriveMaterial) o;
    return Objects.equals(this.materialId, deriveMaterial.materialId)
        && Objects.equals(this.type, deriveMaterial.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(materialId, type);
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
