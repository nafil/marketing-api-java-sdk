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

/** 交易类型 */
@JsonAdapter(TradeTypeExt.Adapter.class)
public enum TradeTypeExt {
  CHARGE("CHARGE"),

  TRANSFER_IN("TRANSFER_IN"),

  PAY("PAY"),

  TRANSFER_BACK("TRANSFER_BACK"),

  EXPIRE("EXPIRE");

  private String value;

  TradeTypeExt(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TradeTypeExt fromValue(String text) {
    for (TradeTypeExt b : TradeTypeExt.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TradeTypeExt> {
    @Override
    public void write(final JsonWriter jsonWriter, final TradeTypeExt enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TradeTypeExt read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TradeTypeExt.fromValue(String.valueOf(value));
    }
  }
}
