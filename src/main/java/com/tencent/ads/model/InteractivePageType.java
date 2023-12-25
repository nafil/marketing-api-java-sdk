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

/** 蹊径互动落地页互动类型 */
@JsonAdapter(InteractivePageType.Adapter.class)
public enum InteractivePageType {
  COMPRESSED_PACKAGE("COMPRESSED_PACKAGE");

  private String value;

  InteractivePageType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static InteractivePageType fromValue(String text) {
    for (InteractivePageType b : InteractivePageType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<InteractivePageType> {
    @Override
    public void write(final JsonWriter jsonWriter, final InteractivePageType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public InteractivePageType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return InteractivePageType.fromValue(String.valueOf(value));
    }
  }
}
