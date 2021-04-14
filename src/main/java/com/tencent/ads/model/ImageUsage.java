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

/** 图片用途 */
@JsonAdapter(ImageUsage.Adapter.class)
public enum ImageUsage {
  DEFAULT("IMAGE_USAGE_DEFAULT"),

  MARKETING_PENDANT("IMAGE_USAGE_MARKETING_PENDANT"),

  SHOP_IMG("IMAGE_USAGE_SHOP_IMG");

  private String value;

  ImageUsage(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ImageUsage fromValue(String text) {
    for (ImageUsage b : ImageUsage.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ImageUsage> {
    @Override
    public void write(final JsonWriter jsonWriter, final ImageUsage enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ImageUsage read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ImageUsage.fromValue(String.valueOf(value));
    }
  }
}
