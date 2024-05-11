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

/** */
@ApiModel(description = "")
public class ExpandFieldDefinition {
  @SerializedName("field_name")
  private String fieldName = null;

  @SerializedName("field_name_cn")
  private String fieldNameCn = null;

  @SerializedName("field_type")
  private QualificationExpandFieldType fieldType = null;

  @SerializedName("required")
  private Boolean required = null;

  @SerializedName("max_length")
  private Long maxLength = null;

  @SerializedName("options")
  private List<String> options = null;

  public ExpandFieldDefinition fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * Get fieldName
   *
   * @return fieldName
   */
  @ApiModelProperty(value = "")
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public ExpandFieldDefinition fieldNameCn(String fieldNameCn) {
    this.fieldNameCn = fieldNameCn;
    return this;
  }

  /**
   * Get fieldNameCn
   *
   * @return fieldNameCn
   */
  @ApiModelProperty(value = "")
  public String getFieldNameCn() {
    return fieldNameCn;
  }

  public void setFieldNameCn(String fieldNameCn) {
    this.fieldNameCn = fieldNameCn;
  }

  public ExpandFieldDefinition fieldType(QualificationExpandFieldType fieldType) {
    this.fieldType = fieldType;
    return this;
  }

  /**
   * Get fieldType
   *
   * @return fieldType
   */
  @ApiModelProperty(value = "")
  public QualificationExpandFieldType getFieldType() {
    return fieldType;
  }

  public void setFieldType(QualificationExpandFieldType fieldType) {
    this.fieldType = fieldType;
  }

  public ExpandFieldDefinition required(Boolean required) {
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

  public ExpandFieldDefinition maxLength(Long maxLength) {
    this.maxLength = maxLength;
    return this;
  }

  /**
   * Get maxLength
   *
   * @return maxLength
   */
  @ApiModelProperty(value = "")
  public Long getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(Long maxLength) {
    this.maxLength = maxLength;
  }

  public ExpandFieldDefinition options(List<String> options) {
    this.options = options;
    return this;
  }

  public ExpandFieldDefinition addOptionsItem(String optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<String>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * Get options
   *
   * @return options
   */
  @ApiModelProperty(value = "")
  public List<String> getOptions() {
    return options;
  }

  public void setOptions(List<String> options) {
    this.options = options;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpandFieldDefinition expandFieldDefinition = (ExpandFieldDefinition) o;
    return Objects.equals(this.fieldName, expandFieldDefinition.fieldName)
        && Objects.equals(this.fieldNameCn, expandFieldDefinition.fieldNameCn)
        && Objects.equals(this.fieldType, expandFieldDefinition.fieldType)
        && Objects.equals(this.required, expandFieldDefinition.required)
        && Objects.equals(this.maxLength, expandFieldDefinition.maxLength)
        && Objects.equals(this.options, expandFieldDefinition.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, fieldNameCn, fieldType, required, maxLength, options);
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