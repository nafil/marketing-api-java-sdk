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

/** 门店状态 */
@JsonAdapter(SysStatus.Adapter.class)
public enum SysStatus {
  NORMAL("AD_STATUS_NORMAL"),

  PENDING("AD_STATUS_PENDING"),

  DENIED("AD_STATUS_DENIED"),

  FROZEN("AD_STATUS_FROZEN"),

  PARTIALLY_PENDING("AD_STATUS_PARTIALLY_PENDING"),

  PARTIALLY_NORMAL("AD_STATUS_PARTIALLY_NORMAL"),

  PREPARE("AD_STATUS_PREPARE"),

  DELETED("AD_STATUS_DELETED"),

  INVALID("AD_STATUS_INVALID");

  private String value;

  SysStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SysStatus fromValue(String text) {
    for (SysStatus b : SysStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SysStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final SysStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SysStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SysStatus.fromValue(String.valueOf(value));
    }
  }
}
