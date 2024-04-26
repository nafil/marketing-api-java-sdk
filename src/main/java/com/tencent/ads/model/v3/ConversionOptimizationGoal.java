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

/** 深度优化ROI目标 */
@JsonAdapter(ConversionOptimizationGoal.Adapter.class)
public enum ConversionOptimizationGoal {
  NONE("GOAL_NONE"),

  _7DAY_PURCHASE_ROAS("GOAL_7DAY_PURCHASE_ROAS"),

  _15DAY_PURCHASE_ROAS("GOAL_15DAY_PURCHASE_ROAS"),

  _30DAY_PURCHASE_ROAS("GOAL_30DAY_PURCHASE_ROAS"),

  _60DAY_PURCHASE_ROAS("GOAL_60DAY_PURCHASE_ROAS"),

  _30DAY_MONETIZATION_ROAS("GOAL_30DAY_MONETIZATION_ROAS"),

  _30DAY_ORDER_ROAS("GOAL_30DAY_ORDER_ROAS"),

  _1DAY_PURCHASE_ROAS("GOAL_1DAY_PURCHASE_ROAS"),

  _1DAY_MONETIZATION_ROAS("GOAL_1DAY_MONETIZATION_ROAS"),

  _3DAY_PURCHASE_ROAS("GOAL_3DAY_PURCHASE_ROAS"),

  _3DAY_MONETIZATION_ROAS("GOAL_3DAY_MONETIZATION_ROAS"),

  _7DAY_MONETIZATION_ROAS("GOAL_7DAY_MONETIZATION_ROAS"),

  _15DAY_MONETIZATION_ROAS("GOAL_15DAY_MONETIZATION_ROAS"),

  _7DAY_RETENTION_TIMES("GOAL_7DAY_RETENTION_TIMES"),

  _7DAY_LONGTERM_PURCHASE_ROAS("GOAL_7DAY_LONGTERM_PURCHASE_ROAS"),

  _14DAY_LONGTERM_PURCHASE_ROAS("GOAL_14DAY_LONGTERM_PURCHASE_ROAS"),

  _30DAY_LONGTERM_PURCHASE_ROAS("GOAL_30DAY_LONGTERM_PURCHASE_ROAS"),

  QYT_7DAY_LIVE_STREAM_DEAL_ROAS("GOAL_QYT_7DAY_LIVE_STREAM_DEAL_ROAS");

  private String value;

  ConversionOptimizationGoal(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ConversionOptimizationGoal fromValue(String text) {
    for (ConversionOptimizationGoal b : ConversionOptimizationGoal.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ConversionOptimizationGoal> {
    @Override
    public void write(final JsonWriter jsonWriter, final ConversionOptimizationGoal enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ConversionOptimizationGoal read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ConversionOptimizationGoal.fromValue(String.valueOf(value));
    }
  }
}
