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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** 自动版位探索策略 */
@JsonAdapter(SiteSetExplorationStrategy.Adapter.class)
public enum SiteSetExplorationStrategy {
  EXPLORATION_UNKNOW("EXPLORATION_UNKNOW"),

  AUTOMATIC_EXPLORATION("AUTOMATIC_EXPLORATION"),

  STEADY_EXPLORATION("STEADY_EXPLORATION");

  private String value;

  SiteSetExplorationStrategy(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SiteSetExplorationStrategy fromValue(String text) {
    for (SiteSetExplorationStrategy b : SiteSetExplorationStrategy.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SiteSetExplorationStrategy> {
    @Override
    public void write(final JsonWriter jsonWriter, final SiteSetExplorationStrategy enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SiteSetExplorationStrategy read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SiteSetExplorationStrategy.fromValue(String.valueOf(value));
    }
  }
}