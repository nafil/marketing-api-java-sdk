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

/** 广告创意元素 */
@ApiModel(description = "广告创意元素")
public class AdcreativeElement {
  @SerializedName("name")
  private String name = null;

  @SerializedName("element_type")
  private ElementType elementType = null;

  @SerializedName("field_type")
  private FieldType fieldType = null;

  @SerializedName("required")
  private Boolean required = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("parent_name")
  private String parentName = null;

  @SerializedName("enum_property")
  private AdcreativeElementEnumProperty enumProperty = null;

  @SerializedName("array_property")
  private AdcreativeElementArrayProperty arrayProperty = null;

  @SerializedName("struct_property")
  private AdcreativeElementStructProperty structProperty = null;

  @SerializedName("restriction")
  private AdcreativeElementRestriction restriction = null;

  @SerializedName("path")
  private String path = null;

  public AdcreativeElement name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   *
   * @return name
   */
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdcreativeElement elementType(ElementType elementType) {
    this.elementType = elementType;
    return this;
  }

  /**
   * Get elementType
   *
   * @return elementType
   */
  @ApiModelProperty(value = "")
  public ElementType getElementType() {
    return elementType;
  }

  public void setElementType(ElementType elementType) {
    this.elementType = elementType;
  }

  public AdcreativeElement fieldType(FieldType fieldType) {
    this.fieldType = fieldType;
    return this;
  }

  /**
   * Get fieldType
   *
   * @return fieldType
   */
  @ApiModelProperty(value = "")
  public FieldType getFieldType() {
    return fieldType;
  }

  public void setFieldType(FieldType fieldType) {
    this.fieldType = fieldType;
  }

  public AdcreativeElement required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Get required
   *
   * @return required
   */
  @ApiModelProperty(value = "")
  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public AdcreativeElement description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   *
   * @return description
   */
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AdcreativeElement parentName(String parentName) {
    this.parentName = parentName;
    return this;
  }

  /**
   * Get parentName
   *
   * @return parentName
   */
  @ApiModelProperty(value = "")
  public String getParentName() {
    return parentName;
  }

  public void setParentName(String parentName) {
    this.parentName = parentName;
  }

  public AdcreativeElement enumProperty(AdcreativeElementEnumProperty enumProperty) {
    this.enumProperty = enumProperty;
    return this;
  }

  /**
   * Get enumProperty
   *
   * @return enumProperty
   */
  @ApiModelProperty(value = "")
  public AdcreativeElementEnumProperty getEnumProperty() {
    return enumProperty;
  }

  public void setEnumProperty(AdcreativeElementEnumProperty enumProperty) {
    this.enumProperty = enumProperty;
  }

  public AdcreativeElement arrayProperty(AdcreativeElementArrayProperty arrayProperty) {
    this.arrayProperty = arrayProperty;
    return this;
  }

  /**
   * Get arrayProperty
   *
   * @return arrayProperty
   */
  @ApiModelProperty(value = "")
  public AdcreativeElementArrayProperty getArrayProperty() {
    return arrayProperty;
  }

  public void setArrayProperty(AdcreativeElementArrayProperty arrayProperty) {
    this.arrayProperty = arrayProperty;
  }

  public AdcreativeElement structProperty(AdcreativeElementStructProperty structProperty) {
    this.structProperty = structProperty;
    return this;
  }

  /**
   * Get structProperty
   *
   * @return structProperty
   */
  @ApiModelProperty(value = "")
  public AdcreativeElementStructProperty getStructProperty() {
    return structProperty;
  }

  public void setStructProperty(AdcreativeElementStructProperty structProperty) {
    this.structProperty = structProperty;
  }

  public AdcreativeElement restriction(AdcreativeElementRestriction restriction) {
    this.restriction = restriction;
    return this;
  }

  /**
   * Get restriction
   *
   * @return restriction
   */
  @ApiModelProperty(value = "")
  public AdcreativeElementRestriction getRestriction() {
    return restriction;
  }

  public void setRestriction(AdcreativeElementRestriction restriction) {
    this.restriction = restriction;
  }

  public AdcreativeElement path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   *
   * @return path
   */
  @ApiModelProperty(value = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdcreativeElement adcreativeElement = (AdcreativeElement) o;
    return Objects.equals(this.name, adcreativeElement.name)
        && Objects.equals(this.elementType, adcreativeElement.elementType)
        && Objects.equals(this.fieldType, adcreativeElement.fieldType)
        && Objects.equals(this.required, adcreativeElement.required)
        && Objects.equals(this.description, adcreativeElement.description)
        && Objects.equals(this.parentName, adcreativeElement.parentName)
        && Objects.equals(this.enumProperty, adcreativeElement.enumProperty)
        && Objects.equals(this.arrayProperty, adcreativeElement.arrayProperty)
        && Objects.equals(this.structProperty, adcreativeElement.structProperty)
        && Objects.equals(this.restriction, adcreativeElement.restriction)
        && Objects.equals(this.path, adcreativeElement.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        name,
        elementType,
        fieldType,
        required,
        description,
        parentName,
        enumProperty,
        arrayProperty,
        structProperty,
        restriction,
        path);
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
