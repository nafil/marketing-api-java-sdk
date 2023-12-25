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

/** 微信场景定向 */
@ApiModel(description = "微信场景定向")
public class WechatScene {
  @SerializedName("official_account_media_category")
  private List<Long> officialAccountMediaCategory = null;

  @SerializedName("mini_program_and_mini_game")
  private List<Long> miniProgramAndMiniGame = null;

  @SerializedName("pay_scene")
  private List<Long> payScene = null;

  public WechatScene officialAccountMediaCategory(List<Long> officialAccountMediaCategory) {
    this.officialAccountMediaCategory = officialAccountMediaCategory;
    return this;
  }

  public WechatScene addOfficialAccountMediaCategoryItem(Long officialAccountMediaCategoryItem) {
    if (this.officialAccountMediaCategory == null) {
      this.officialAccountMediaCategory = new ArrayList<Long>();
    }
    this.officialAccountMediaCategory.add(officialAccountMediaCategoryItem);
    return this;
  }

  /**
   * Get officialAccountMediaCategory
   *
   * @return officialAccountMediaCategory
   */
  @ApiModelProperty(value = "")
  public List<Long> getOfficialAccountMediaCategory() {
    return officialAccountMediaCategory;
  }

  public void setOfficialAccountMediaCategory(List<Long> officialAccountMediaCategory) {
    this.officialAccountMediaCategory = officialAccountMediaCategory;
  }

  public WechatScene miniProgramAndMiniGame(List<Long> miniProgramAndMiniGame) {
    this.miniProgramAndMiniGame = miniProgramAndMiniGame;
    return this;
  }

  public WechatScene addMiniProgramAndMiniGameItem(Long miniProgramAndMiniGameItem) {
    if (this.miniProgramAndMiniGame == null) {
      this.miniProgramAndMiniGame = new ArrayList<Long>();
    }
    this.miniProgramAndMiniGame.add(miniProgramAndMiniGameItem);
    return this;
  }

  /**
   * Get miniProgramAndMiniGame
   *
   * @return miniProgramAndMiniGame
   */
  @ApiModelProperty(value = "")
  public List<Long> getMiniProgramAndMiniGame() {
    return miniProgramAndMiniGame;
  }

  public void setMiniProgramAndMiniGame(List<Long> miniProgramAndMiniGame) {
    this.miniProgramAndMiniGame = miniProgramAndMiniGame;
  }

  public WechatScene payScene(List<Long> payScene) {
    this.payScene = payScene;
    return this;
  }

  public WechatScene addPaySceneItem(Long paySceneItem) {
    if (this.payScene == null) {
      this.payScene = new ArrayList<Long>();
    }
    this.payScene.add(paySceneItem);
    return this;
  }

  /**
   * Get payScene
   *
   * @return payScene
   */
  @ApiModelProperty(value = "")
  public List<Long> getPayScene() {
    return payScene;
  }

  public void setPayScene(List<Long> payScene) {
    this.payScene = payScene;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WechatScene wechatScene = (WechatScene) o;
    return Objects.equals(
            this.officialAccountMediaCategory, wechatScene.officialAccountMediaCategory)
        && Objects.equals(this.miniProgramAndMiniGame, wechatScene.miniProgramAndMiniGame)
        && Objects.equals(this.payScene, wechatScene.payScene);
  }

  @Override
  public int hashCode() {
    return Objects.hash(officialAccountMediaCategory, miniProgramAndMiniGame, payScene);
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
