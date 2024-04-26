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


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** 模板使用尺寸 */
@JsonAdapter(DynamicAdTemplateSize.Adapter.class)
public enum DynamicAdTemplateSize {
  _1280_720("SIZE_1280_720"),

  _1080_1920("SIZE_1080_1920"),

  _1000_560("SIZE_1000_560"),

  _960_540("SIZE_960_540"),

  _960_334("SIZE_960_334"),

  _960_274("SIZE_960_274"),

  _900_500("SIZE_900_500"),

  _800_800("SIZE_800_800"),

  _800_640("SIZE_800_640"),

  _800_450("SIZE_800_450"),

  _720_1280("SIZE_720_1280"),

  _640_316("SIZE_640_316"),

  _640_960("SIZE_640_960"),

  _640_800("SIZE_640_800"),

  _640_360("SIZE_640_360"),

  _640_1136("SIZE_640_1136"),

  _582_166("SIZE_582_166"),

  _498_280("SIZE_498_280"),

  _480_360("SIZE_480_360"),

  _480_320("SIZE_480_320"),

  _480_270("SIZE_480_270"),

  _465_230("SIZE_465_230"),

  _354_222("SIZE_354_222"),

  _240_180("SIZE_240_180"),

  _230_152("SIZE_230_152"),

  _147_147("SIZE_147_147"),

  _540_276("SIZE_540_276");

  private String value;

  DynamicAdTemplateSize(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DynamicAdTemplateSize fromValue(String text) {
    for (DynamicAdTemplateSize b : DynamicAdTemplateSize.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DynamicAdTemplateSize> {
    @Override
    public void write(final JsonWriter jsonWriter, final DynamicAdTemplateSize enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DynamicAdTemplateSize read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DynamicAdTemplateSize.fromValue(String.valueOf(value));
    }
  }
}