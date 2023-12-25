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

/** 时间口径 */
@JsonAdapter(TimeLine.Adapter.class)
public enum TimeLine {
  REQUEST_TIME("REQUEST_TIME"),

  REPORTING_TIME("REPORTING_TIME"),

  ACTIVE_TIME("ACTIVE_TIME");

  private String value;

  TimeLine(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TimeLine fromValue(String text) {
    for (TimeLine b : TimeLine.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TimeLine> {
    @Override
    public void write(final JsonWriter jsonWriter, final TimeLine enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TimeLine read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TimeLine.fromValue(String.valueOf(value));
    }
  }
}
