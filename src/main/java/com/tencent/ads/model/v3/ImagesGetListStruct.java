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

/** 返回结构 */
@ApiModel(description = "返回结构")
public class ImagesGetListStruct {
  @SerializedName("image_id")
  private String imageId = null;

  @SerializedName("width")
  private Long width = null;

  @SerializedName("height")
  private Long height = null;

  @SerializedName("file_size")
  private Long fileSize = null;

  @SerializedName("type")
  private ImageType type = null;

  @SerializedName("signature")
  private String signature = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("source_signature")
  private String sourceSignature = null;

  @SerializedName("preview_url")
  private String previewUrl = null;

  @SerializedName("source_type")
  private ImageSourceType sourceType = null;

  @SerializedName("image_usage")
  private ImageUsage imageUsage = null;

  @SerializedName("created_time")
  private Long createdTime = null;

  @SerializedName("last_modified_time")
  private Long lastModifiedTime = null;

  @SerializedName("product_catalog_id")
  private Long productCatalogId = null;

  @SerializedName("product_outer_id")
  private String productOuterId = null;

  @SerializedName("source_reference_id")
  private String sourceReferenceId = null;

  @SerializedName("owner_account_id")
  private String ownerAccountId = null;

  @SerializedName("status")
  private MediaStatusType status = null;

  @SerializedName("sample_aspect_ratio")
  private String sampleAspectRatio = null;

  public ImagesGetListStruct imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

  /**
   * Get imageId
   *
   * @return imageId
   */
  @ApiModelProperty(value = "")
  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public ImagesGetListStruct width(Long width) {
    this.width = width;
    return this;
  }

  /**
   * Get width
   *
   * @return width
   */
  @ApiModelProperty(value = "")
  public Long getWidth() {
    return width;
  }

  public void setWidth(Long width) {
    this.width = width;
  }

  public ImagesGetListStruct height(Long height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   *
   * @return height
   */
  @ApiModelProperty(value = "")
  public Long getHeight() {
    return height;
  }

  public void setHeight(Long height) {
    this.height = height;
  }

  public ImagesGetListStruct fileSize(Long fileSize) {
    this.fileSize = fileSize;
    return this;
  }

  /**
   * Get fileSize
   *
   * @return fileSize
   */
  @ApiModelProperty(value = "")
  public Long getFileSize() {
    return fileSize;
  }

  public void setFileSize(Long fileSize) {
    this.fileSize = fileSize;
  }

  public ImagesGetListStruct type(ImageType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @ApiModelProperty(value = "")
  public ImageType getType() {
    return type;
  }

  public void setType(ImageType type) {
    this.type = type;
  }

  public ImagesGetListStruct signature(String signature) {
    this.signature = signature;
    return this;
  }

  /**
   * Get signature
   *
   * @return signature
   */
  @ApiModelProperty(value = "")
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public ImagesGetListStruct description(String description) {
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

  public ImagesGetListStruct sourceSignature(String sourceSignature) {
    this.sourceSignature = sourceSignature;
    return this;
  }

  /**
   * Get sourceSignature
   *
   * @return sourceSignature
   */
  @ApiModelProperty(value = "")
  public String getSourceSignature() {
    return sourceSignature;
  }

  public void setSourceSignature(String sourceSignature) {
    this.sourceSignature = sourceSignature;
  }

  public ImagesGetListStruct previewUrl(String previewUrl) {
    this.previewUrl = previewUrl;
    return this;
  }

  /**
   * Get previewUrl
   *
   * @return previewUrl
   */
  @ApiModelProperty(value = "")
  public String getPreviewUrl() {
    return previewUrl;
  }

  public void setPreviewUrl(String previewUrl) {
    this.previewUrl = previewUrl;
  }

  public ImagesGetListStruct sourceType(ImageSourceType sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  /**
   * Get sourceType
   *
   * @return sourceType
   */
  @ApiModelProperty(value = "")
  public ImageSourceType getSourceType() {
    return sourceType;
  }

  public void setSourceType(ImageSourceType sourceType) {
    this.sourceType = sourceType;
  }

  public ImagesGetListStruct imageUsage(ImageUsage imageUsage) {
    this.imageUsage = imageUsage;
    return this;
  }

  /**
   * Get imageUsage
   *
   * @return imageUsage
   */
  @ApiModelProperty(value = "")
  public ImageUsage getImageUsage() {
    return imageUsage;
  }

  public void setImageUsage(ImageUsage imageUsage) {
    this.imageUsage = imageUsage;
  }

  public ImagesGetListStruct createdTime(Long createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   *
   * @return createdTime
   */
  @ApiModelProperty(value = "")
  public Long getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Long createdTime) {
    this.createdTime = createdTime;
  }

  public ImagesGetListStruct lastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  /**
   * Get lastModifiedTime
   *
   * @return lastModifiedTime
   */
  @ApiModelProperty(value = "")
  public Long getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public ImagesGetListStruct productCatalogId(Long productCatalogId) {
    this.productCatalogId = productCatalogId;
    return this;
  }

  /**
   * Get productCatalogId
   *
   * @return productCatalogId
   */
  @ApiModelProperty(value = "")
  public Long getProductCatalogId() {
    return productCatalogId;
  }

  public void setProductCatalogId(Long productCatalogId) {
    this.productCatalogId = productCatalogId;
  }

  public ImagesGetListStruct productOuterId(String productOuterId) {
    this.productOuterId = productOuterId;
    return this;
  }

  /**
   * Get productOuterId
   *
   * @return productOuterId
   */
  @ApiModelProperty(value = "")
  public String getProductOuterId() {
    return productOuterId;
  }

  public void setProductOuterId(String productOuterId) {
    this.productOuterId = productOuterId;
  }

  public ImagesGetListStruct sourceReferenceId(String sourceReferenceId) {
    this.sourceReferenceId = sourceReferenceId;
    return this;
  }

  /**
   * Get sourceReferenceId
   *
   * @return sourceReferenceId
   */
  @ApiModelProperty(value = "")
  public String getSourceReferenceId() {
    return sourceReferenceId;
  }

  public void setSourceReferenceId(String sourceReferenceId) {
    this.sourceReferenceId = sourceReferenceId;
  }

  public ImagesGetListStruct ownerAccountId(String ownerAccountId) {
    this.ownerAccountId = ownerAccountId;
    return this;
  }

  /**
   * Get ownerAccountId
   *
   * @return ownerAccountId
   */
  @ApiModelProperty(value = "")
  public String getOwnerAccountId() {
    return ownerAccountId;
  }

  public void setOwnerAccountId(String ownerAccountId) {
    this.ownerAccountId = ownerAccountId;
  }

  public ImagesGetListStruct status(MediaStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  @ApiModelProperty(value = "")
  public MediaStatusType getStatus() {
    return status;
  }

  public void setStatus(MediaStatusType status) {
    this.status = status;
  }

  public ImagesGetListStruct sampleAspectRatio(String sampleAspectRatio) {
    this.sampleAspectRatio = sampleAspectRatio;
    return this;
  }

  /**
   * Get sampleAspectRatio
   *
   * @return sampleAspectRatio
   */
  @ApiModelProperty(value = "")
  public String getSampleAspectRatio() {
    return sampleAspectRatio;
  }

  public void setSampleAspectRatio(String sampleAspectRatio) {
    this.sampleAspectRatio = sampleAspectRatio;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImagesGetListStruct imagesGetListStruct = (ImagesGetListStruct) o;
    return Objects.equals(this.imageId, imagesGetListStruct.imageId)
        && Objects.equals(this.width, imagesGetListStruct.width)
        && Objects.equals(this.height, imagesGetListStruct.height)
        && Objects.equals(this.fileSize, imagesGetListStruct.fileSize)
        && Objects.equals(this.type, imagesGetListStruct.type)
        && Objects.equals(this.signature, imagesGetListStruct.signature)
        && Objects.equals(this.description, imagesGetListStruct.description)
        && Objects.equals(this.sourceSignature, imagesGetListStruct.sourceSignature)
        && Objects.equals(this.previewUrl, imagesGetListStruct.previewUrl)
        && Objects.equals(this.sourceType, imagesGetListStruct.sourceType)
        && Objects.equals(this.imageUsage, imagesGetListStruct.imageUsage)
        && Objects.equals(this.createdTime, imagesGetListStruct.createdTime)
        && Objects.equals(this.lastModifiedTime, imagesGetListStruct.lastModifiedTime)
        && Objects.equals(this.productCatalogId, imagesGetListStruct.productCatalogId)
        && Objects.equals(this.productOuterId, imagesGetListStruct.productOuterId)
        && Objects.equals(this.sourceReferenceId, imagesGetListStruct.sourceReferenceId)
        && Objects.equals(this.ownerAccountId, imagesGetListStruct.ownerAccountId)
        && Objects.equals(this.status, imagesGetListStruct.status)
        && Objects.equals(this.sampleAspectRatio, imagesGetListStruct.sampleAspectRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        imageId,
        width,
        height,
        fileSize,
        type,
        signature,
        description,
        sourceSignature,
        previewUrl,
        sourceType,
        imageUsage,
        createdTime,
        lastModifiedTime,
        productCatalogId,
        productOuterId,
        sourceReferenceId,
        ownerAccountId,
        status,
        sampleAspectRatio);
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
