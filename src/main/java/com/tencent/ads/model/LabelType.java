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

/** 创意标签类型 */
@JsonAdapter(LabelType.Adapter.class)
public enum LabelType {
  UNKNOWN("LABEL_TYPE_UNKNOWN"),

  COMMON("LABEL_TYPE_COMMON"),

  PROMOTIONAL("LABEL_TYPE_PROMOTIONAL"),

  CUSTOMIZETEXT("LABEL_TYPE_CUSTOMIZETEXT"),

  ICON("LABEL_TYPE_ICON"),

  DYNAMIC("LABEL_TYPE_DYNAMIC");

  private String value;

  LabelType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LabelType fromValue(String text) {
    for (LabelType b : LabelType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LabelType> {
    @Override
    public void write(final JsonWriter jsonWriter, final LabelType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LabelType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LabelType.fromValue(String.valueOf(value));
    }
  }
}
