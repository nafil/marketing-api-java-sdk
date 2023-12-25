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

/** 结束页类型 */
@JsonAdapter(EndPageType.Adapter.class)
public enum EndPageType {
  AVATAR_NICKNAME_HIGHLIGHT("END_PAGE_AVATAR_NICKNAME_HIGHLIGHT"),

  DESCRIPTION_HIGHLIGHT("END_PAGE_DESCRIPTION_HIGHLIGHT");

  private String value;

  EndPageType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EndPageType fromValue(String text) {
    for (EndPageType b : EndPageType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EndPageType> {
    @Override
    public void write(final JsonWriter jsonWriter, final EndPageType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EndPageType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EndPageType.fromValue(String.valueOf(value));
    }
  }
}
