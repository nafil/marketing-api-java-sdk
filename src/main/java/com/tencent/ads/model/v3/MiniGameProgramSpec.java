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

/** 小游戏信息 */
@ApiModel(description = "小游戏信息")
public class MiniGameProgramSpec {
  @SerializedName("title")
  private String title = null;

  @SerializedName("mini_game_program_id")
  private String miniGameProgramId = null;

  @SerializedName("mini_game_program_path")
  private String miniGameProgramPath = null;

  public MiniGameProgramSpec title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   *
   * @return title
   */
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public MiniGameProgramSpec miniGameProgramId(String miniGameProgramId) {
    this.miniGameProgramId = miniGameProgramId;
    return this;
  }

  /**
   * Get miniGameProgramId
   *
   * @return miniGameProgramId
   */
  @ApiModelProperty(value = "")
  public String getMiniGameProgramId() {
    return miniGameProgramId;
  }

  public void setMiniGameProgramId(String miniGameProgramId) {
    this.miniGameProgramId = miniGameProgramId;
  }

  public MiniGameProgramSpec miniGameProgramPath(String miniGameProgramPath) {
    this.miniGameProgramPath = miniGameProgramPath;
    return this;
  }

  /**
   * Get miniGameProgramPath
   *
   * @return miniGameProgramPath
   */
  @ApiModelProperty(value = "")
  public String getMiniGameProgramPath() {
    return miniGameProgramPath;
  }

  public void setMiniGameProgramPath(String miniGameProgramPath) {
    this.miniGameProgramPath = miniGameProgramPath;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MiniGameProgramSpec miniGameProgramSpec = (MiniGameProgramSpec) o;
    return Objects.equals(this.title, miniGameProgramSpec.title)
        && Objects.equals(this.miniGameProgramId, miniGameProgramSpec.miniGameProgramId)
        && Objects.equals(this.miniGameProgramPath, miniGameProgramSpec.miniGameProgramPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, miniGameProgramId, miniGameProgramPath);
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
