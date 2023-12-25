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

/**
 * 出价类型，
 * 当出价类型为SMART_BID_TYPE_SYSTEMATIC时，不可传入bid_amount，暂不支持微信流量，功能灰度开放中。smart_bid_type出价类型仅支持oCPX广告使用
 */
@JsonAdapter(SmartBidType.Adapter.class)
public enum SmartBidType {
  CUSTOM("SMART_BID_TYPE_CUSTOM"),

  SYSTEMATIC("SMART_BID_TYPE_SYSTEMATIC");

  private String value;

  SmartBidType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SmartBidType fromValue(String text) {
    for (SmartBidType b : SmartBidType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SmartBidType> {
    @Override
    public void write(final JsonWriter jsonWriter, final SmartBidType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SmartBidType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SmartBidType.fromValue(String.valueOf(value));
    }
  }
}
