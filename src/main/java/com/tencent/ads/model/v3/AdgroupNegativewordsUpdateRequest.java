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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** AdgroupNegativewordsUpdateRequest */
public class AdgroupNegativewordsUpdateRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("adgroup_id")
  private Long adgroupId = null;

  @SerializedName("phrase_negative_words")
  private List<String> phraseNegativeWords = null;

  @SerializedName("exact_negative_words")
  private List<String> exactNegativeWords = null;

  public AdgroupNegativewordsUpdateRequest accountId(Long accountId) {
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

  public AdgroupNegativewordsUpdateRequest adgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
    return this;
  }

  /**
   * Get adgroupId
   *
   * @return adgroupId
   */
  @ApiModelProperty(value = "")
  public Long getAdgroupId() {
    return adgroupId;
  }

  public void setAdgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
  }

  public AdgroupNegativewordsUpdateRequest phraseNegativeWords(List<String> phraseNegativeWords) {
    this.phraseNegativeWords = phraseNegativeWords;
    return this;
  }

  public AdgroupNegativewordsUpdateRequest addPhraseNegativeWordsItem(
      String phraseNegativeWordsItem) {
    if (this.phraseNegativeWords == null) {
      this.phraseNegativeWords = new ArrayList<String>();
    }
    this.phraseNegativeWords.add(phraseNegativeWordsItem);
    return this;
  }

  /**
   * Get phraseNegativeWords
   *
   * @return phraseNegativeWords
   */
  @ApiModelProperty(value = "")
  public List<String> getPhraseNegativeWords() {
    return phraseNegativeWords;
  }

  public void setPhraseNegativeWords(List<String> phraseNegativeWords) {
    this.phraseNegativeWords = phraseNegativeWords;
  }

  public AdgroupNegativewordsUpdateRequest exactNegativeWords(List<String> exactNegativeWords) {
    this.exactNegativeWords = exactNegativeWords;
    return this;
  }

  public AdgroupNegativewordsUpdateRequest addExactNegativeWordsItem(
      String exactNegativeWordsItem) {
    if (this.exactNegativeWords == null) {
      this.exactNegativeWords = new ArrayList<String>();
    }
    this.exactNegativeWords.add(exactNegativeWordsItem);
    return this;
  }

  /**
   * Get exactNegativeWords
   *
   * @return exactNegativeWords
   */
  @ApiModelProperty(value = "")
  public List<String> getExactNegativeWords() {
    return exactNegativeWords;
  }

  public void setExactNegativeWords(List<String> exactNegativeWords) {
    this.exactNegativeWords = exactNegativeWords;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdgroupNegativewordsUpdateRequest adgroupNegativewordsUpdateRequest =
        (AdgroupNegativewordsUpdateRequest) o;
    return Objects.equals(this.accountId, adgroupNegativewordsUpdateRequest.accountId)
        && Objects.equals(this.adgroupId, adgroupNegativewordsUpdateRequest.adgroupId)
        && Objects.equals(
            this.phraseNegativeWords, adgroupNegativewordsUpdateRequest.phraseNegativeWords)
        && Objects.equals(
            this.exactNegativeWords, adgroupNegativewordsUpdateRequest.exactNegativeWords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adgroupId, phraseNegativeWords, exactNegativeWords);
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
