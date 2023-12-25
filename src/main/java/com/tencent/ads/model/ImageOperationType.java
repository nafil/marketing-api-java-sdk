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

/** 操作类型 */
@JsonAdapter(ImageOperationType.Adapter.class)
public enum ImageOperationType {
  CROP_CUSTOMIZED("OPERATION_TYPE_CROP_CUSTOMIZED"),

  CROP_SMART("OPERATION_TYPE_CROP_SMART"),

  RESIZE("OPERATION_TYPE_RESIZE"),

  CROP_CUSTOMIZED_AND_RESIZE("OPERATION_TYPE_CROP_CUSTOMIZED_AND_RESIZE");

  private String value;

  ImageOperationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ImageOperationType fromValue(String text) {
    for (ImageOperationType b : ImageOperationType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ImageOperationType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ImageOperationType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ImageOperationType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ImageOperationType.fromValue(String.valueOf(value));
    }
  }
}
