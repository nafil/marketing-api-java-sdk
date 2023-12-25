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
public class VideosGetListStruct {
  @SerializedName("video_id")
  private Long videoId = null;

  @SerializedName("width")
  private Long width = null;

  @SerializedName("height")
  private Long height = null;

  @SerializedName("video_frames")
  private Long videoFrames = null;

  @SerializedName("video_fps")
  private Double videoFps = null;

  @SerializedName("video_codec")
  private String videoCodec = null;

  @SerializedName("video_bit_rate")
  private Long videoBitRate = null;

  @SerializedName("audio_codec")
  private String audioCodec = null;

  @SerializedName("audio_bit_rate")
  private Long audioBitRate = null;

  @SerializedName("file_size")
  private Long fileSize = null;

  @SerializedName("type")
  private MediaType type = null;

  @SerializedName("signature")
  private String signature = null;

  @SerializedName("system_status")
  private MediaSystemStatus systemStatus = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("preview_url")
  private String previewUrl = null;

  @SerializedName("key_frame_image_url")
  private String keyFrameImageUrl = null;

  @SerializedName("created_time")
  private Long createdTime = null;

  @SerializedName("last_modified_time")
  private Long lastModifiedTime = null;

  @SerializedName("video_profile_name")
  private String videoProfileName = null;

  @SerializedName("audio_sample_rate")
  private Long audioSampleRate = null;

  @SerializedName("max_keyframe_interval")
  private Long maxKeyframeInterval = null;

  @SerializedName("min_keyframe_interval")
  private Long minKeyframeInterval = null;

  @SerializedName("sample_aspect_ratio")
  private String sampleAspectRatio = null;

  @SerializedName("audio_profile_name")
  private String audioProfileName = null;

  @SerializedName("scan_type")
  private String scanType = null;

  @SerializedName("image_duration_millisecond")
  private Long imageDurationMillisecond = null;

  @SerializedName("audio_duration_millisecond")
  private Long audioDurationMillisecond = null;

  @SerializedName("source_type")
  private MediaSourceType sourceType = null;

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

  public VideosGetListStruct videoId(Long videoId) {
    this.videoId = videoId;
    return this;
  }

  /**
   * Get videoId
   *
   * @return videoId
   */
  @ApiModelProperty(value = "")
  public Long getVideoId() {
    return videoId;
  }

  public void setVideoId(Long videoId) {
    this.videoId = videoId;
  }

  public VideosGetListStruct width(Long width) {
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

  public VideosGetListStruct height(Long height) {
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

  public VideosGetListStruct videoFrames(Long videoFrames) {
    this.videoFrames = videoFrames;
    return this;
  }

  /**
   * Get videoFrames
   *
   * @return videoFrames
   */
  @ApiModelProperty(value = "")
  public Long getVideoFrames() {
    return videoFrames;
  }

  public void setVideoFrames(Long videoFrames) {
    this.videoFrames = videoFrames;
  }

  public VideosGetListStruct videoFps(Double videoFps) {
    this.videoFps = videoFps;
    return this;
  }

  /**
   * Get videoFps
   *
   * @return videoFps
   */
  @ApiModelProperty(value = "")
  public Double getVideoFps() {
    return videoFps;
  }

  public void setVideoFps(Double videoFps) {
    this.videoFps = videoFps;
  }

  public VideosGetListStruct videoCodec(String videoCodec) {
    this.videoCodec = videoCodec;
    return this;
  }

  /**
   * Get videoCodec
   *
   * @return videoCodec
   */
  @ApiModelProperty(value = "")
  public String getVideoCodec() {
    return videoCodec;
  }

  public void setVideoCodec(String videoCodec) {
    this.videoCodec = videoCodec;
  }

  public VideosGetListStruct videoBitRate(Long videoBitRate) {
    this.videoBitRate = videoBitRate;
    return this;
  }

  /**
   * Get videoBitRate
   *
   * @return videoBitRate
   */
  @ApiModelProperty(value = "")
  public Long getVideoBitRate() {
    return videoBitRate;
  }

  public void setVideoBitRate(Long videoBitRate) {
    this.videoBitRate = videoBitRate;
  }

  public VideosGetListStruct audioCodec(String audioCodec) {
    this.audioCodec = audioCodec;
    return this;
  }

  /**
   * Get audioCodec
   *
   * @return audioCodec
   */
  @ApiModelProperty(value = "")
  public String getAudioCodec() {
    return audioCodec;
  }

  public void setAudioCodec(String audioCodec) {
    this.audioCodec = audioCodec;
  }

  public VideosGetListStruct audioBitRate(Long audioBitRate) {
    this.audioBitRate = audioBitRate;
    return this;
  }

  /**
   * Get audioBitRate
   *
   * @return audioBitRate
   */
  @ApiModelProperty(value = "")
  public Long getAudioBitRate() {
    return audioBitRate;
  }

  public void setAudioBitRate(Long audioBitRate) {
    this.audioBitRate = audioBitRate;
  }

  public VideosGetListStruct fileSize(Long fileSize) {
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

  public VideosGetListStruct type(MediaType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @ApiModelProperty(value = "")
  public MediaType getType() {
    return type;
  }

  public void setType(MediaType type) {
    this.type = type;
  }

  public VideosGetListStruct signature(String signature) {
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

  public VideosGetListStruct systemStatus(MediaSystemStatus systemStatus) {
    this.systemStatus = systemStatus;
    return this;
  }

  /**
   * Get systemStatus
   *
   * @return systemStatus
   */
  @ApiModelProperty(value = "")
  public MediaSystemStatus getSystemStatus() {
    return systemStatus;
  }

  public void setSystemStatus(MediaSystemStatus systemStatus) {
    this.systemStatus = systemStatus;
  }

  public VideosGetListStruct description(String description) {
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

  public VideosGetListStruct previewUrl(String previewUrl) {
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

  public VideosGetListStruct keyFrameImageUrl(String keyFrameImageUrl) {
    this.keyFrameImageUrl = keyFrameImageUrl;
    return this;
  }

  /**
   * Get keyFrameImageUrl
   *
   * @return keyFrameImageUrl
   */
  @ApiModelProperty(value = "")
  public String getKeyFrameImageUrl() {
    return keyFrameImageUrl;
  }

  public void setKeyFrameImageUrl(String keyFrameImageUrl) {
    this.keyFrameImageUrl = keyFrameImageUrl;
  }

  public VideosGetListStruct createdTime(Long createdTime) {
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

  public VideosGetListStruct lastModifiedTime(Long lastModifiedTime) {
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

  public VideosGetListStruct videoProfileName(String videoProfileName) {
    this.videoProfileName = videoProfileName;
    return this;
  }

  /**
   * Get videoProfileName
   *
   * @return videoProfileName
   */
  @ApiModelProperty(value = "")
  public String getVideoProfileName() {
    return videoProfileName;
  }

  public void setVideoProfileName(String videoProfileName) {
    this.videoProfileName = videoProfileName;
  }

  public VideosGetListStruct audioSampleRate(Long audioSampleRate) {
    this.audioSampleRate = audioSampleRate;
    return this;
  }

  /**
   * Get audioSampleRate
   *
   * @return audioSampleRate
   */
  @ApiModelProperty(value = "")
  public Long getAudioSampleRate() {
    return audioSampleRate;
  }

  public void setAudioSampleRate(Long audioSampleRate) {
    this.audioSampleRate = audioSampleRate;
  }

  public VideosGetListStruct maxKeyframeInterval(Long maxKeyframeInterval) {
    this.maxKeyframeInterval = maxKeyframeInterval;
    return this;
  }

  /**
   * Get maxKeyframeInterval
   *
   * @return maxKeyframeInterval
   */
  @ApiModelProperty(value = "")
  public Long getMaxKeyframeInterval() {
    return maxKeyframeInterval;
  }

  public void setMaxKeyframeInterval(Long maxKeyframeInterval) {
    this.maxKeyframeInterval = maxKeyframeInterval;
  }

  public VideosGetListStruct minKeyframeInterval(Long minKeyframeInterval) {
    this.minKeyframeInterval = minKeyframeInterval;
    return this;
  }

  /**
   * Get minKeyframeInterval
   *
   * @return minKeyframeInterval
   */
  @ApiModelProperty(value = "")
  public Long getMinKeyframeInterval() {
    return minKeyframeInterval;
  }

  public void setMinKeyframeInterval(Long minKeyframeInterval) {
    this.minKeyframeInterval = minKeyframeInterval;
  }

  public VideosGetListStruct sampleAspectRatio(String sampleAspectRatio) {
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

  public VideosGetListStruct audioProfileName(String audioProfileName) {
    this.audioProfileName = audioProfileName;
    return this;
  }

  /**
   * Get audioProfileName
   *
   * @return audioProfileName
   */
  @ApiModelProperty(value = "")
  public String getAudioProfileName() {
    return audioProfileName;
  }

  public void setAudioProfileName(String audioProfileName) {
    this.audioProfileName = audioProfileName;
  }

  public VideosGetListStruct scanType(String scanType) {
    this.scanType = scanType;
    return this;
  }

  /**
   * Get scanType
   *
   * @return scanType
   */
  @ApiModelProperty(value = "")
  public String getScanType() {
    return scanType;
  }

  public void setScanType(String scanType) {
    this.scanType = scanType;
  }

  public VideosGetListStruct imageDurationMillisecond(Long imageDurationMillisecond) {
    this.imageDurationMillisecond = imageDurationMillisecond;
    return this;
  }

  /**
   * Get imageDurationMillisecond
   *
   * @return imageDurationMillisecond
   */
  @ApiModelProperty(value = "")
  public Long getImageDurationMillisecond() {
    return imageDurationMillisecond;
  }

  public void setImageDurationMillisecond(Long imageDurationMillisecond) {
    this.imageDurationMillisecond = imageDurationMillisecond;
  }

  public VideosGetListStruct audioDurationMillisecond(Long audioDurationMillisecond) {
    this.audioDurationMillisecond = audioDurationMillisecond;
    return this;
  }

  /**
   * Get audioDurationMillisecond
   *
   * @return audioDurationMillisecond
   */
  @ApiModelProperty(value = "")
  public Long getAudioDurationMillisecond() {
    return audioDurationMillisecond;
  }

  public void setAudioDurationMillisecond(Long audioDurationMillisecond) {
    this.audioDurationMillisecond = audioDurationMillisecond;
  }

  public VideosGetListStruct sourceType(MediaSourceType sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  /**
   * Get sourceType
   *
   * @return sourceType
   */
  @ApiModelProperty(value = "")
  public MediaSourceType getSourceType() {
    return sourceType;
  }

  public void setSourceType(MediaSourceType sourceType) {
    this.sourceType = sourceType;
  }

  public VideosGetListStruct productCatalogId(Long productCatalogId) {
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

  public VideosGetListStruct productOuterId(String productOuterId) {
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

  public VideosGetListStruct sourceReferenceId(String sourceReferenceId) {
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

  public VideosGetListStruct ownerAccountId(String ownerAccountId) {
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

  public VideosGetListStruct status(MediaStatusType status) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideosGetListStruct videosGetListStruct = (VideosGetListStruct) o;
    return Objects.equals(this.videoId, videosGetListStruct.videoId)
        && Objects.equals(this.width, videosGetListStruct.width)
        && Objects.equals(this.height, videosGetListStruct.height)
        && Objects.equals(this.videoFrames, videosGetListStruct.videoFrames)
        && Objects.equals(this.videoFps, videosGetListStruct.videoFps)
        && Objects.equals(this.videoCodec, videosGetListStruct.videoCodec)
        && Objects.equals(this.videoBitRate, videosGetListStruct.videoBitRate)
        && Objects.equals(this.audioCodec, videosGetListStruct.audioCodec)
        && Objects.equals(this.audioBitRate, videosGetListStruct.audioBitRate)
        && Objects.equals(this.fileSize, videosGetListStruct.fileSize)
        && Objects.equals(this.type, videosGetListStruct.type)
        && Objects.equals(this.signature, videosGetListStruct.signature)
        && Objects.equals(this.systemStatus, videosGetListStruct.systemStatus)
        && Objects.equals(this.description, videosGetListStruct.description)
        && Objects.equals(this.previewUrl, videosGetListStruct.previewUrl)
        && Objects.equals(this.keyFrameImageUrl, videosGetListStruct.keyFrameImageUrl)
        && Objects.equals(this.createdTime, videosGetListStruct.createdTime)
        && Objects.equals(this.lastModifiedTime, videosGetListStruct.lastModifiedTime)
        && Objects.equals(this.videoProfileName, videosGetListStruct.videoProfileName)
        && Objects.equals(this.audioSampleRate, videosGetListStruct.audioSampleRate)
        && Objects.equals(this.maxKeyframeInterval, videosGetListStruct.maxKeyframeInterval)
        && Objects.equals(this.minKeyframeInterval, videosGetListStruct.minKeyframeInterval)
        && Objects.equals(this.sampleAspectRatio, videosGetListStruct.sampleAspectRatio)
        && Objects.equals(this.audioProfileName, videosGetListStruct.audioProfileName)
        && Objects.equals(this.scanType, videosGetListStruct.scanType)
        && Objects.equals(
            this.imageDurationMillisecond, videosGetListStruct.imageDurationMillisecond)
        && Objects.equals(
            this.audioDurationMillisecond, videosGetListStruct.audioDurationMillisecond)
        && Objects.equals(this.sourceType, videosGetListStruct.sourceType)
        && Objects.equals(this.productCatalogId, videosGetListStruct.productCatalogId)
        && Objects.equals(this.productOuterId, videosGetListStruct.productOuterId)
        && Objects.equals(this.sourceReferenceId, videosGetListStruct.sourceReferenceId)
        && Objects.equals(this.ownerAccountId, videosGetListStruct.ownerAccountId)
        && Objects.equals(this.status, videosGetListStruct.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        videoId,
        width,
        height,
        videoFrames,
        videoFps,
        videoCodec,
        videoBitRate,
        audioCodec,
        audioBitRate,
        fileSize,
        type,
        signature,
        systemStatus,
        description,
        previewUrl,
        keyFrameImageUrl,
        createdTime,
        lastModifiedTime,
        videoProfileName,
        audioSampleRate,
        maxKeyframeInterval,
        minKeyframeInterval,
        sampleAspectRatio,
        audioProfileName,
        scanType,
        imageDurationMillisecond,
        audioDurationMillisecond,
        sourceType,
        productCatalogId,
        productOuterId,
        sourceReferenceId,
        ownerAccountId,
        status);
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
