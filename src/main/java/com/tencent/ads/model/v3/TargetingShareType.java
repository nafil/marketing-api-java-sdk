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

/** 分享类型 */
@JsonAdapter(TargetingShareType.Adapter.class)
public enum TargetingShareType {
  BUSINESS("SHARE_TYPE_SAME_BUSINESS"),

  MDM("SHARE_TYPE_SAME_MDM");

  private String value;

  TargetingShareType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TargetingShareType fromValue(String text) {
    for (TargetingShareType b : TargetingShareType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TargetingShareType> {
    @Override
    public void write(final JsonWriter jsonWriter, final TargetingShareType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TargetingShareType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TargetingShareType.fromValue(String.valueOf(value));
    }
  }
}
