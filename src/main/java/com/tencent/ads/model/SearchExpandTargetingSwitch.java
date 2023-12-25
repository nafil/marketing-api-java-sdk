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

/** 搜索定向拓展开关 */
@JsonAdapter(SearchExpandTargetingSwitch.Adapter.class)
public enum SearchExpandTargetingSwitch {
  UNKNOWN("SEARCH_EXPAND_TARGETING_SWITCH_UNKNOWN"),

  OPEN("SEARCH_EXPAND_TARGETING_SWITCH_OPEN"),

  CLOSE("SEARCH_EXPAND_TARGETING_SWITCH_CLOSE");

  private String value;

  SearchExpandTargetingSwitch(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SearchExpandTargetingSwitch fromValue(String text) {
    for (SearchExpandTargetingSwitch b : SearchExpandTargetingSwitch.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SearchExpandTargetingSwitch> {
    @Override
    public void write(final JsonWriter jsonWriter, final SearchExpandTargetingSwitch enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SearchExpandTargetingSwitch read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SearchExpandTargetingSwitch.fromValue(String.valueOf(value));
    }
  }
}
