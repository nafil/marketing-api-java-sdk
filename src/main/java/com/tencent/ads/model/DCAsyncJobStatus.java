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

/** 异步任务状态 */
@JsonAdapter(DCAsyncJobStatus.Adapter.class)
public enum DCAsyncJobStatus {
  PENDING("DC_ASYNC_JOB_STATUS_PENDING"),

  FAIL("DC_ASYNC_JOB_STATUS_FAIL"),

  SUCCESS("DC_ASYNC_JOB_STATUS_SUCCESS"),

  SYSTEM_ERROR("DC_ASYNC_JOB_STATUS_SYSTEM_ERROR"),

  PROCESSING("DC_ASYNC_JOB_STATUS_PROCESSING");

  private String value;

  DCAsyncJobStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DCAsyncJobStatus fromValue(String text) {
    for (DCAsyncJobStatus b : DCAsyncJobStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DCAsyncJobStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final DCAsyncJobStatus enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DCAsyncJobStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DCAsyncJobStatus.fromValue(String.valueOf(value));
    }
  }
}
