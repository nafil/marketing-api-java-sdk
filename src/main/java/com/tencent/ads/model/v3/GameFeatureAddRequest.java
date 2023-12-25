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

/** GameFeatureAddRequest */
public class GameFeatureAddRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("marketing_target_type")
  private MarketingTargetType marketingTargetType = null;

  @SerializedName("marketing_target_detail_id")
  private String marketingTargetDetailId = null;

  @SerializedName("profit_mode_id")
  private Long profitModeId = null;

  @SerializedName("game_type_id")
  private Long gameTypeId = null;

  @SerializedName("gameplay_id_list")
  private List<Long> gameplayIdList = null;

  @SerializedName("game_theme_id")
  private Long gameThemeId = null;

  @SerializedName("game_sub_theme_id")
  private Long gameSubThemeId = null;

  @SerializedName("game_marketing_lifecycle_list")
  private List<GameMarketingLifecycleStruct> gameMarketingLifecycleList = null;

  public GameFeatureAddRequest accountId(Long accountId) {
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

  public GameFeatureAddRequest marketingTargetType(MarketingTargetType marketingTargetType) {
    this.marketingTargetType = marketingTargetType;
    return this;
  }

  /**
   * Get marketingTargetType
   *
   * @return marketingTargetType
   */
  @ApiModelProperty(value = "")
  public MarketingTargetType getMarketingTargetType() {
    return marketingTargetType;
  }

  public void setMarketingTargetType(MarketingTargetType marketingTargetType) {
    this.marketingTargetType = marketingTargetType;
  }

  public GameFeatureAddRequest marketingTargetDetailId(String marketingTargetDetailId) {
    this.marketingTargetDetailId = marketingTargetDetailId;
    return this;
  }

  /**
   * Get marketingTargetDetailId
   *
   * @return marketingTargetDetailId
   */
  @ApiModelProperty(value = "")
  public String getMarketingTargetDetailId() {
    return marketingTargetDetailId;
  }

  public void setMarketingTargetDetailId(String marketingTargetDetailId) {
    this.marketingTargetDetailId = marketingTargetDetailId;
  }

  public GameFeatureAddRequest profitModeId(Long profitModeId) {
    this.profitModeId = profitModeId;
    return this;
  }

  /**
   * Get profitModeId
   *
   * @return profitModeId
   */
  @ApiModelProperty(value = "")
  public Long getProfitModeId() {
    return profitModeId;
  }

  public void setProfitModeId(Long profitModeId) {
    this.profitModeId = profitModeId;
  }

  public GameFeatureAddRequest gameTypeId(Long gameTypeId) {
    this.gameTypeId = gameTypeId;
    return this;
  }

  /**
   * Get gameTypeId
   *
   * @return gameTypeId
   */
  @ApiModelProperty(value = "")
  public Long getGameTypeId() {
    return gameTypeId;
  }

  public void setGameTypeId(Long gameTypeId) {
    this.gameTypeId = gameTypeId;
  }

  public GameFeatureAddRequest gameplayIdList(List<Long> gameplayIdList) {
    this.gameplayIdList = gameplayIdList;
    return this;
  }

  public GameFeatureAddRequest addGameplayIdListItem(Long gameplayIdListItem) {
    if (this.gameplayIdList == null) {
      this.gameplayIdList = new ArrayList<Long>();
    }
    this.gameplayIdList.add(gameplayIdListItem);
    return this;
  }

  /**
   * Get gameplayIdList
   *
   * @return gameplayIdList
   */
  @ApiModelProperty(value = "")
  public List<Long> getGameplayIdList() {
    return gameplayIdList;
  }

  public void setGameplayIdList(List<Long> gameplayIdList) {
    this.gameplayIdList = gameplayIdList;
  }

  public GameFeatureAddRequest gameThemeId(Long gameThemeId) {
    this.gameThemeId = gameThemeId;
    return this;
  }

  /**
   * Get gameThemeId
   *
   * @return gameThemeId
   */
  @ApiModelProperty(value = "")
  public Long getGameThemeId() {
    return gameThemeId;
  }

  public void setGameThemeId(Long gameThemeId) {
    this.gameThemeId = gameThemeId;
  }

  public GameFeatureAddRequest gameSubThemeId(Long gameSubThemeId) {
    this.gameSubThemeId = gameSubThemeId;
    return this;
  }

  /**
   * Get gameSubThemeId
   *
   * @return gameSubThemeId
   */
  @ApiModelProperty(value = "")
  public Long getGameSubThemeId() {
    return gameSubThemeId;
  }

  public void setGameSubThemeId(Long gameSubThemeId) {
    this.gameSubThemeId = gameSubThemeId;
  }

  public GameFeatureAddRequest gameMarketingLifecycleList(
      List<GameMarketingLifecycleStruct> gameMarketingLifecycleList) {
    this.gameMarketingLifecycleList = gameMarketingLifecycleList;
    return this;
  }

  public GameFeatureAddRequest addGameMarketingLifecycleListItem(
      GameMarketingLifecycleStruct gameMarketingLifecycleListItem) {
    if (this.gameMarketingLifecycleList == null) {
      this.gameMarketingLifecycleList = new ArrayList<GameMarketingLifecycleStruct>();
    }
    this.gameMarketingLifecycleList.add(gameMarketingLifecycleListItem);
    return this;
  }

  /**
   * Get gameMarketingLifecycleList
   *
   * @return gameMarketingLifecycleList
   */
  @ApiModelProperty(value = "")
  public List<GameMarketingLifecycleStruct> getGameMarketingLifecycleList() {
    return gameMarketingLifecycleList;
  }

  public void setGameMarketingLifecycleList(
      List<GameMarketingLifecycleStruct> gameMarketingLifecycleList) {
    this.gameMarketingLifecycleList = gameMarketingLifecycleList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameFeatureAddRequest gameFeatureAddRequest = (GameFeatureAddRequest) o;
    return Objects.equals(this.accountId, gameFeatureAddRequest.accountId)
        && Objects.equals(this.marketingTargetType, gameFeatureAddRequest.marketingTargetType)
        && Objects.equals(
            this.marketingTargetDetailId, gameFeatureAddRequest.marketingTargetDetailId)
        && Objects.equals(this.profitModeId, gameFeatureAddRequest.profitModeId)
        && Objects.equals(this.gameTypeId, gameFeatureAddRequest.gameTypeId)
        && Objects.equals(this.gameplayIdList, gameFeatureAddRequest.gameplayIdList)
        && Objects.equals(this.gameThemeId, gameFeatureAddRequest.gameThemeId)
        && Objects.equals(this.gameSubThemeId, gameFeatureAddRequest.gameSubThemeId)
        && Objects.equals(
            this.gameMarketingLifecycleList, gameFeatureAddRequest.gameMarketingLifecycleList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        marketingTargetType,
        marketingTargetDetailId,
        profitModeId,
        gameTypeId,
        gameplayIdList,
        gameThemeId,
        gameSubThemeId,
        gameMarketingLifecycleList);
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
