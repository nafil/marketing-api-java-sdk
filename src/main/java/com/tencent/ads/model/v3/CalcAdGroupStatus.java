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

/** 广告在系统中的状态 */
@JsonAdapter(CalcAdGroupStatus.Adapter.class)
public enum CalcAdGroupStatus {
  FROZEN("ADGROUP_STATUS_FROZEN"),

  SUSPEND("ADGROUP_STATUS_SUSPEND"),

  NOT_IN_DELIVERY_TIME("ADGROUP_STATUS_NOT_IN_DELIVERY_TIME"),

  ACTIVE("ADGROUP_STATUS_ACTIVE"),

  DELETED("ADGROUP_STATUS_DELETED"),

  ACCOUNT_BALANCE_NOT_ENOUGH("ADGROUP_STATUS_ACCOUNT_BALANCE_NOT_ENOUGH"),

  DAILY_BUDGET_REACHED("ADGROUP_STATUS_DAILY_BUDGET_REACHED"),

  PARTIAL_ACTIVE("ADGROUP_STATUS_PARTIAL_ACTIVE"),

  CREATIVE_STATUS_PENDING("ADGROUP_STATUS_CREATIVE_STATUS_PENDING"),

  CREATIVE_EMPTY("ADGROUP_STATUS_CREATIVE_EMPTY"),

  JOINT_BUDGET_REACHED("ADGROUP_STATUS_JOINT_BUDGET_REACHED");

  private String value;

  CalcAdGroupStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CalcAdGroupStatus fromValue(String text) {
    for (CalcAdGroupStatus b : CalcAdGroupStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CalcAdGroupStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final CalcAdGroupStatus enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CalcAdGroupStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CalcAdGroupStatus.fromValue(String.valueOf(value));
    }
  }
}
