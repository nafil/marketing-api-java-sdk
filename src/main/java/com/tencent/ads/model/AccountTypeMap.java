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
@JsonAdapter(AccountTypeMap.Adapter.class)
public enum AccountTypeMap {
  CASH("FUND_TYPE_CASH"),

  GIFT("FUND_TYPE_GIFT"),

  SHARED("FUND_TYPE_SHARED"),

  BANK("FUND_TYPE_BANK"),

  UNION_GIFT("FUND_TYPE_UNION_GIFT"),

  MP_CASH("FUND_TYPE_MP_CASH"),

  MP_BANK("FUND_TYPE_MP_BANK"),

  MP_GIFT("FUND_TYPE_MP_GIFT"),

  CREDIT_ROLL("FUND_TYPE_CREDIT_ROLL"),

  CREDIT_TEMPORARY("FUND_TYPE_CREDIT_TEMPORARY"),

  CONTRACT_GIFT_VIRTUAL("FUND_TYPE_CONTRACT_GIFT_VIRTUAL"),

  CONTRACT_ASSIGN_VIRTUAL("FUND_TYPE_CONTRACT_ASSIGN_VIRTUAL"),

  COMPENSATE_VIRTUAL("FUND_TYPE_COMPENSATE_VIRTUAL"),

  INTERNAL_QUOTA("FUND_TYPE_INTERNAL_QUOTA"),

  TEST_VIRTUAL("FUND_TYPE_TEST_VIRTUAL"),

  UNSUPPORTED("FUND_TYPE_UNSUPPORTED"),

  JD_PRIVILEGE("FUND_TYPE_JD_PRIVILEGE"),

  JD_WIRELESS_CASH("FUND_TYPE_JD_WIRELESS_CASH"),

  SPECIAL_GIFT("FUND_TYPE_SPECIAL_GIFT");

  private String value;

  AccountTypeMap(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AccountTypeMap fromValue(String text) {
    for (AccountTypeMap b : AccountTypeMap.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AccountTypeMap> {
    @Override
    public void write(final JsonWriter jsonWriter, final AccountTypeMap enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AccountTypeMap read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AccountTypeMap.fromValue(String.valueOf(value));
    }
  }
}
