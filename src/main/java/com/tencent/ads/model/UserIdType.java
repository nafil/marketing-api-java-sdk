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

/** 号码包用户ID类型 */
@JsonAdapter(UserIdType.Adapter.class)
public enum UserIdType {
  HASH_IDFA("HASH_IDFA"),

  HASH_IMEI("HASH_IMEI"),

  HASH_MOBILE_PHONE("HASH_MOBILE_PHONE"),

  IDFA("IDFA"),

  IMEI("IMEI"),

  WX_OPENID("WX_OPENID"),

  WX_UNIONID("WX_UNIONID"),

  WECHAT_OPENID("WECHAT_OPENID"),

  SALTED_HASH_IMEI("SALTED_HASH_IMEI"),

  SALTED_HASH_IDFA("SALTED_HASH_IDFA"),

  OAID("OAID"),

  HASH_OAID("HASH_OAID"),

  SHA256_MOBILE_PHONE("SHA256_MOBILE_PHONE"),

  MD5_SHA256_IMEI("MD5_SHA256_IMEI"),

  MD5_SHA256_IDFA("MD5_SHA256_IDFA"),

  MD5_SHA256_OAID("MD5_SHA256_OAID"),

  CAID("CAID"),

  GDT_OPENID("GDT_OPENID"),

  HASH_MAC("HASH_MAC"),

  HASH_QQ("HASH_QQ"),

  MAC("MAC"),

  MOBILE_QQ_OPENID("MOBILE_QQ_OPENID"),

  QQ("QQ");

  private String value;

  UserIdType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UserIdType fromValue(String text) {
    for (UserIdType b : UserIdType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<UserIdType> {
    @Override
    public void write(final JsonWriter jsonWriter, final UserIdType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public UserIdType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return UserIdType.fromValue(String.valueOf(value));
    }
  }
}
