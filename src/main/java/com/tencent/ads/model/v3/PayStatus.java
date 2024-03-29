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

/** 书籍的付费状态 */
@JsonAdapter(PayStatus.Adapter.class)
public enum PayStatus {
  FREE("PAY_STATUS_FREE"),

  PAID("PAY_STATUS_PAID"),

  MEMBER("PAY_STATUS_MEMBER");

  private String value;

  PayStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PayStatus fromValue(String text) {
    for (PayStatus b : PayStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PayStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final PayStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PayStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PayStatus.fromValue(String.valueOf(value));
    }
  }
}
