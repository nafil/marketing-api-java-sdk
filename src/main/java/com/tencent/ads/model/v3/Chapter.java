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

/** 小说章节信息 */
@ApiModel(description = "小说章节信息")
public class Chapter {
  @SerializedName("subtitle")
  private String subtitle = null;

  @SerializedName("chapterid")
  private Long chapterid = null;

  @SerializedName("text")
  private List<String> text = null;

  public Chapter subtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }

  /**
   * Get subtitle
   *
   * @return subtitle
   */
  @ApiModelProperty(value = "")
  public String getSubtitle() {
    return subtitle;
  }

  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }

  public Chapter chapterid(Long chapterid) {
    this.chapterid = chapterid;
    return this;
  }

  /**
   * Get chapterid
   *
   * @return chapterid
   */
  @ApiModelProperty(value = "")
  public Long getChapterid() {
    return chapterid;
  }

  public void setChapterid(Long chapterid) {
    this.chapterid = chapterid;
  }

  public Chapter text(List<String> text) {
    this.text = text;
    return this;
  }

  public Chapter addTextItem(String textItem) {
    if (this.text == null) {
      this.text = new ArrayList<String>();
    }
    this.text.add(textItem);
    return this;
  }

  /**
   * Get text
   *
   * @return text
   */
  @ApiModelProperty(value = "")
  public List<String> getText() {
    return text;
  }

  public void setText(List<String> text) {
    this.text = text;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Chapter chapter = (Chapter) o;
    return Objects.equals(this.subtitle, chapter.subtitle)
        && Objects.equals(this.chapterid, chapter.chapterid)
        && Objects.equals(this.text, chapter.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subtitle, chapterid, text);
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
