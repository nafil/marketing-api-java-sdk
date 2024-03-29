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

/** 蹊径落地页绑定的app 类型 */
@JsonAdapter(OsV2.Adapter.class)
public enum OsV2 {
  IOS("IOS"),

  ANDROID("ANDROID");

  private String value;

  OsV2(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OsV2 fromValue(String text) {
    for (OsV2 b : OsV2.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<OsV2> {
    @Override
    public void write(final JsonWriter jsonWriter, final OsV2 enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OsV2 read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OsV2.fromValue(String.valueOf(value));
    }
  }
}
