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

/** 授权账号类型 */
@JsonAdapter(AuthAccountType.Adapter.class)
public enum AuthAccountType {
  WECHAT("ACCOUNT_TYPE_WECHAT"),

  QQ("ACCOUNT_TYPE_QQ");

  private String value;

  AuthAccountType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AuthAccountType fromValue(String text) {
    for (AuthAccountType b : AuthAccountType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AuthAccountType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AuthAccountType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AuthAccountType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AuthAccountType.fromValue(String.valueOf(value));
    }
  }
}
