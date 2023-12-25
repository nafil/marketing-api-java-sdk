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

/** 出价场景，游戏行业投放端又称\&quot;投放场景\&quot;，该能力与出价类型(smart_bid_type)/出价策略(bid_strategy)互斥使用 */
@JsonAdapter(BidScene.Adapter.class)
public enum BidScene {
  UNKNOWN("BID_SCENE_UNKNOWN"),

  NORMAL_AVERAGE("BID_SCENE_NORMAL_AVERAGE"),

  NORMAL_TARGET("BID_SCENE_NORMAL_TARGET"),

  NORMAL_MAX("BID_SCENE_NORMAL_MAX");

  private String value;

  BidScene(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BidScene fromValue(String text) {
    for (BidScene b : BidScene.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BidScene> {
    @Override
    public void write(final JsonWriter jsonWriter, final BidScene enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BidScene read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BidScene.fromValue(String.valueOf(value));
    }
  }
}
