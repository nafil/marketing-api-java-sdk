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

/** 校验成功的门店poi信息 */
@ApiModel(description = "校验成功的门店poi信息")
public class CreateLocalStoreStruct {
  @SerializedName("poi_id")
  private String poiId = null;

  @SerializedName("local_store_biz_info")
  private LocalStoreBizInfoStruct localStoreBizInfo = null;

  @SerializedName("wechat_ecosystem_accounts")
  private WechatEcosystemAccounts wechatEcosystemAccounts = null;

  @SerializedName("wechat_work_corp_id")
  private Long wechatWorkCorpId = null;

  @SerializedName("wechat_customer_service_link")
  private String wechatCustomerServiceLink = null;

  @SerializedName("image_set")
  private List<ImageSetDataStruct> imageSet = null;

  @SerializedName("recommend_words")
  private List<RecommendWordStruct> recommendWords = null;

  @SerializedName("is_use_standardized_name")
  private Boolean isUseStandardizedName = null;

  public CreateLocalStoreStruct poiId(String poiId) {
    this.poiId = poiId;
    return this;
  }

  /**
   * Get poiId
   *
   * @return poiId
   */
  @ApiModelProperty(value = "")
  public String getPoiId() {
    return poiId;
  }

  public void setPoiId(String poiId) {
    this.poiId = poiId;
  }

  public CreateLocalStoreStruct localStoreBizInfo(LocalStoreBizInfoStruct localStoreBizInfo) {
    this.localStoreBizInfo = localStoreBizInfo;
    return this;
  }

  /**
   * Get localStoreBizInfo
   *
   * @return localStoreBizInfo
   */
  @ApiModelProperty(value = "")
  public LocalStoreBizInfoStruct getLocalStoreBizInfo() {
    return localStoreBizInfo;
  }

  public void setLocalStoreBizInfo(LocalStoreBizInfoStruct localStoreBizInfo) {
    this.localStoreBizInfo = localStoreBizInfo;
  }

  public CreateLocalStoreStruct wechatEcosystemAccounts(
      WechatEcosystemAccounts wechatEcosystemAccounts) {
    this.wechatEcosystemAccounts = wechatEcosystemAccounts;
    return this;
  }

  /**
   * Get wechatEcosystemAccounts
   *
   * @return wechatEcosystemAccounts
   */
  @ApiModelProperty(value = "")
  public WechatEcosystemAccounts getWechatEcosystemAccounts() {
    return wechatEcosystemAccounts;
  }

  public void setWechatEcosystemAccounts(WechatEcosystemAccounts wechatEcosystemAccounts) {
    this.wechatEcosystemAccounts = wechatEcosystemAccounts;
  }

  public CreateLocalStoreStruct wechatWorkCorpId(Long wechatWorkCorpId) {
    this.wechatWorkCorpId = wechatWorkCorpId;
    return this;
  }

  /**
   * Get wechatWorkCorpId
   *
   * @return wechatWorkCorpId
   */
  @ApiModelProperty(value = "")
  public Long getWechatWorkCorpId() {
    return wechatWorkCorpId;
  }

  public void setWechatWorkCorpId(Long wechatWorkCorpId) {
    this.wechatWorkCorpId = wechatWorkCorpId;
  }

  public CreateLocalStoreStruct wechatCustomerServiceLink(String wechatCustomerServiceLink) {
    this.wechatCustomerServiceLink = wechatCustomerServiceLink;
    return this;
  }

  /**
   * Get wechatCustomerServiceLink
   *
   * @return wechatCustomerServiceLink
   */
  @ApiModelProperty(value = "")
  public String getWechatCustomerServiceLink() {
    return wechatCustomerServiceLink;
  }

  public void setWechatCustomerServiceLink(String wechatCustomerServiceLink) {
    this.wechatCustomerServiceLink = wechatCustomerServiceLink;
  }

  public CreateLocalStoreStruct imageSet(List<ImageSetDataStruct> imageSet) {
    this.imageSet = imageSet;
    return this;
  }

  public CreateLocalStoreStruct addImageSetItem(ImageSetDataStruct imageSetItem) {
    if (this.imageSet == null) {
      this.imageSet = new ArrayList<ImageSetDataStruct>();
    }
    this.imageSet.add(imageSetItem);
    return this;
  }

  /**
   * Get imageSet
   *
   * @return imageSet
   */
  @ApiModelProperty(value = "")
  public List<ImageSetDataStruct> getImageSet() {
    return imageSet;
  }

  public void setImageSet(List<ImageSetDataStruct> imageSet) {
    this.imageSet = imageSet;
  }

  public CreateLocalStoreStruct recommendWords(List<RecommendWordStruct> recommendWords) {
    this.recommendWords = recommendWords;
    return this;
  }

  public CreateLocalStoreStruct addRecommendWordsItem(RecommendWordStruct recommendWordsItem) {
    if (this.recommendWords == null) {
      this.recommendWords = new ArrayList<RecommendWordStruct>();
    }
    this.recommendWords.add(recommendWordsItem);
    return this;
  }

  /**
   * Get recommendWords
   *
   * @return recommendWords
   */
  @ApiModelProperty(value = "")
  public List<RecommendWordStruct> getRecommendWords() {
    return recommendWords;
  }

  public void setRecommendWords(List<RecommendWordStruct> recommendWords) {
    this.recommendWords = recommendWords;
  }

  public CreateLocalStoreStruct isUseStandardizedName(Boolean isUseStandardizedName) {
    this.isUseStandardizedName = isUseStandardizedName;
    return this;
  }

  /**
   * Get isUseStandardizedName
   *
   * @return isUseStandardizedName
   */
  @ApiModelProperty(value = "")
  public Boolean isIsUseStandardizedName() {
    return isUseStandardizedName;
  }

  public void setIsUseStandardizedName(Boolean isUseStandardizedName) {
    this.isUseStandardizedName = isUseStandardizedName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateLocalStoreStruct createLocalStoreStruct = (CreateLocalStoreStruct) o;
    return Objects.equals(this.poiId, createLocalStoreStruct.poiId)
        && Objects.equals(this.localStoreBizInfo, createLocalStoreStruct.localStoreBizInfo)
        && Objects.equals(
            this.wechatEcosystemAccounts, createLocalStoreStruct.wechatEcosystemAccounts)
        && Objects.equals(this.wechatWorkCorpId, createLocalStoreStruct.wechatWorkCorpId)
        && Objects.equals(
            this.wechatCustomerServiceLink, createLocalStoreStruct.wechatCustomerServiceLink)
        && Objects.equals(this.imageSet, createLocalStoreStruct.imageSet)
        && Objects.equals(this.recommendWords, createLocalStoreStruct.recommendWords)
        && Objects.equals(this.isUseStandardizedName, createLocalStoreStruct.isUseStandardizedName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        poiId,
        localStoreBizInfo,
        wechatEcosystemAccounts,
        wechatWorkCorpId,
        wechatCustomerServiceLink,
        imageSet,
        recommendWords,
        isUseStandardizedName);
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
