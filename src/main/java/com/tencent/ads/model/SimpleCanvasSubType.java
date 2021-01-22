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

/** 简版原生页子类型(灰度中)，仅在简版原生页下生效，其他情况改字段内容会被忽略 */
@JsonAdapter(SimpleCanvasSubType.Adapter.class)
public enum SimpleCanvasSubType {
  UNKNOWN("SIMPLE_CANVAS_SUB_TYPE_UNKNOWN"),

  DEFAULT("SIMPLE_CANVAS_SUB_TYPE_DEFAULT"),

  URL("SIMPLE_CANVAS_SUB_TYPE_URL"),

  SLIDE_UP("SIMPLE_CANVAS_SUB_TYPE_SLIDE_UP"),

  WEB_STORE("SIMPLE_CANVAS_SUB_TYPE_WEB_STORE"),

  RESERVE_LIVE("SIMPLE_CANVAS_SUB_TYPE_RESERVE_LIVE");

  private String value;

  SimpleCanvasSubType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SimpleCanvasSubType fromValue(String text) {
    for (SimpleCanvasSubType b : SimpleCanvasSubType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SimpleCanvasSubType> {
    @Override
    public void write(final JsonWriter jsonWriter, final SimpleCanvasSubType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SimpleCanvasSubType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SimpleCanvasSubType.fromValue(String.valueOf(value));
    }
  }
}
