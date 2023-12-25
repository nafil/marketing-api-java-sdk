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

/** 匹配规则组 */
@ApiModel(description = "匹配规则组")
public class UrlMatcherGroup {
  @SerializedName("url_matcher")
  private List<UrlMatcher> urlMatcher = null;

  public UrlMatcherGroup urlMatcher(List<UrlMatcher> urlMatcher) {
    this.urlMatcher = urlMatcher;
    return this;
  }

  public UrlMatcherGroup addUrlMatcherItem(UrlMatcher urlMatcherItem) {
    if (this.urlMatcher == null) {
      this.urlMatcher = new ArrayList<UrlMatcher>();
    }
    this.urlMatcher.add(urlMatcherItem);
    return this;
  }

  /**
   * Get urlMatcher
   *
   * @return urlMatcher
   */
  @ApiModelProperty(value = "")
  public List<UrlMatcher> getUrlMatcher() {
    return urlMatcher;
  }

  public void setUrlMatcher(List<UrlMatcher> urlMatcher) {
    this.urlMatcher = urlMatcher;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlMatcherGroup urlMatcherGroup = (UrlMatcherGroup) o;
    return Objects.equals(this.urlMatcher, urlMatcherGroup.urlMatcher);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urlMatcher);
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
