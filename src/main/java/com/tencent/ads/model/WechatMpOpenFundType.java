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

/** 资金账户类型 */
@JsonAdapter(WechatMpOpenFundType.Adapter.class)
public enum WechatMpOpenFundType {
  UNSUPPORTED("FUND_TYPE_UNSUPPORTED"),

  UNKNOWN("FUND_TYPE_UNKNOWN"),

  CASH("FUND_TYPE_CASH"),

  GIFT("FUND_TYPE_GIFT"),

  INNER("FUND_TYPE_INNER"),

  CREDIT("FUND_TYPE_CREDIT"),

  DEBT_TEMP("FUND_TYPE_DEBT_TEMP"),

  DEBT_FIXED("FUND_TYPE_DEBT_FIXED"),

  TCC_GIFT("FUND_TYPE_TCC_GIFT"),

  UNSUPPPORTED("FUND_TYPE_UNSUPPPORTED"),

  CREDIT_ROLL("FUND_TYPE_CREDIT_ROLL"),

  CREDIT_TEMPORARY("FUND_TYPE_CREDIT_TEMPORARY"),

  SPECIAL_PROMOTION("FUND_TYPE_SPECIAL_PROMOTION"),

  MINIPROGRAM("FUND_TYPE_MINIPROGRAM"),

  PAYMENT_DUE("FUND_TYPE_PAYMENT_DUE");

  private String value;

  WechatMpOpenFundType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WechatMpOpenFundType fromValue(String text) {
    for (WechatMpOpenFundType b : WechatMpOpenFundType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<WechatMpOpenFundType> {
    @Override
    public void write(final JsonWriter jsonWriter, final WechatMpOpenFundType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WechatMpOpenFundType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WechatMpOpenFundType.fromValue(String.valueOf(value));
    }
  }
}
