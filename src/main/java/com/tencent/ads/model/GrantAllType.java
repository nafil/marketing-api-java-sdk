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

/** 资产授权维度 */
@JsonAdapter(GrantAllType.Adapter.class)
public enum GrantAllType {
  YES("GRANT_ALL_YES"),

  NO("GRANT_ALL_NO");

  private String value;

  GrantAllType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static GrantAllType fromValue(String text) {
    for (GrantAllType b : GrantAllType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<GrantAllType> {
    @Override
    public void write(final JsonWriter jsonWriter, final GrantAllType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public GrantAllType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return GrantAllType.fromValue(String.valueOf(value));
    }
  }
}
