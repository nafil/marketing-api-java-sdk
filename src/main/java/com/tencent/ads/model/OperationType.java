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

/** 文件操作类型 */
@JsonAdapter(OperationType.Adapter.class)
public enum OperationType {
  CREATE("CREATE"),

  DELETE("DELETE"),

  APPEND("APPEND"),

  REDUCE("REDUCE");

  private String value;

  OperationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OperationType fromValue(String text) {
    for (OperationType b : OperationType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<OperationType> {
    @Override
    public void write(final JsonWriter jsonWriter, final OperationType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OperationType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OperationType.fromValue(String.valueOf(value));
    }
  }
}
