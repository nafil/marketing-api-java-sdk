/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 1.3
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.tencent.ads.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** 定向通过率分析 */
@ApiModel(description = "定向通过率分析")
public class TargetingWidenessRateFunnelStruct {
  @SerializedName("value")
  private String value = null;

  @SerializedName("score")
  private String score = null;

  @SerializedName("score_desc")
  private String scoreDesc = null;

  @SerializedName("rank_category")
  private String rankCategory = null;

  @SerializedName("rank_second_category")
  private String rankSecondCategory = null;

  @SerializedName("rank_overall")
  private String rankOverall = null;

  public TargetingWidenessRateFunnelStruct value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   *
   * @return value
   */
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public TargetingWidenessRateFunnelStruct score(String score) {
    this.score = score;
    return this;
  }

  /**
   * Get score
   *
   * @return score
   */
  @ApiModelProperty(value = "")
  public String getScore() {
    return score;
  }

  public void setScore(String score) {
    this.score = score;
  }

  public TargetingWidenessRateFunnelStruct scoreDesc(String scoreDesc) {
    this.scoreDesc = scoreDesc;
    return this;
  }

  /**
   * Get scoreDesc
   *
   * @return scoreDesc
   */
  @ApiModelProperty(value = "")
  public String getScoreDesc() {
    return scoreDesc;
  }

  public void setScoreDesc(String scoreDesc) {
    this.scoreDesc = scoreDesc;
  }

  public TargetingWidenessRateFunnelStruct rankCategory(String rankCategory) {
    this.rankCategory = rankCategory;
    return this;
  }

  /**
   * Get rankCategory
   *
   * @return rankCategory
   */
  @ApiModelProperty(value = "")
  public String getRankCategory() {
    return rankCategory;
  }

  public void setRankCategory(String rankCategory) {
    this.rankCategory = rankCategory;
  }

  public TargetingWidenessRateFunnelStruct rankSecondCategory(String rankSecondCategory) {
    this.rankSecondCategory = rankSecondCategory;
    return this;
  }

  /**
   * Get rankSecondCategory
   *
   * @return rankSecondCategory
   */
  @ApiModelProperty(value = "")
  public String getRankSecondCategory() {
    return rankSecondCategory;
  }

  public void setRankSecondCategory(String rankSecondCategory) {
    this.rankSecondCategory = rankSecondCategory;
  }

  public TargetingWidenessRateFunnelStruct rankOverall(String rankOverall) {
    this.rankOverall = rankOverall;
    return this;
  }

  /**
   * Get rankOverall
   *
   * @return rankOverall
   */
  @ApiModelProperty(value = "")
  public String getRankOverall() {
    return rankOverall;
  }

  public void setRankOverall(String rankOverall) {
    this.rankOverall = rankOverall;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetingWidenessRateFunnelStruct targetingWidenessRateFunnelStruct =
        (TargetingWidenessRateFunnelStruct) o;
    return Objects.equals(this.value, targetingWidenessRateFunnelStruct.value)
        && Objects.equals(this.score, targetingWidenessRateFunnelStruct.score)
        && Objects.equals(this.scoreDesc, targetingWidenessRateFunnelStruct.scoreDesc)
        && Objects.equals(this.rankCategory, targetingWidenessRateFunnelStruct.rankCategory)
        && Objects.equals(
            this.rankSecondCategory, targetingWidenessRateFunnelStruct.rankSecondCategory)
        && Objects.equals(this.rankOverall, targetingWidenessRateFunnelStruct.rankOverall);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, score, scoreDesc, rankCategory, rankSecondCategory, rankOverall);
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
