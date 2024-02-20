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

/** 暂停状态 */
@JsonAdapter(BidwordPauseType.Adapter.class)
public enum BidwordPauseType {
  NORMAL("KEYWORD_STATUS_NORMAL"),

  SUSPEND("KEYWORD_STATUS_SUSPEND");

  private String value;

  BidwordPauseType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BidwordPauseType fromValue(String text) {
    for (BidwordPauseType b : BidwordPauseType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BidwordPauseType> {
    @Override
    public void write(final JsonWriter jsonWriter, final BidwordPauseType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BidwordPauseType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BidwordPauseType.fromValue(String.valueOf(value));
    }
  }
}