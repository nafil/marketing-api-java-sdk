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

/** 原生页中组件类型 */
@JsonAdapter(CanvasPageElementType.Adapter.class)
public enum CanvasPageElementType {
  TOP_IMAGE("TOP_IMAGE"),

  TOP_SLIDER("TOP_SLIDER"),

  TOP_VIDEO("TOP_VIDEO"),

  IMAGE("IMAGE"),

  SLIDER("SLIDER"),

  VIDEO("VIDEO"),

  TEXT("TEXT"),

  APP_DOWNLOAD("APP_DOWNLOAD"),

  WEAPP("WEAPP"),

  GH("GH"),

  ENTERPRISE_WX("ENTERPRISE_WX"),

  IMAGE_TEXT("IMAGE_TEXT");

  private String value;

  CanvasPageElementType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CanvasPageElementType fromValue(String text) {
    for (CanvasPageElementType b : CanvasPageElementType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CanvasPageElementType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CanvasPageElementType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CanvasPageElementType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CanvasPageElementType.fromValue(String.valueOf(value));
    }
  }
}
