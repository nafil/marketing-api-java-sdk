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

/** 任务结果状态 */
@JsonAdapter(TaskResultStatus.Adapter.class)
public enum TaskResultStatus {
  UNKNOWN("TASK_RESULT_STATUS_UNKNOWN"),

  PENDING("TASK_RESULT_STATUS_PENDING"),

  PROCESSING("TASK_RESULT_STATUS_PROCESSING"),

  SUCCESS("TASK_RESULT_STATUS_SUCCESS"),

  FAIL("TASK_RESULT_STATUS_FAIL"),

  PARTIAL_FAIL("TASK_RESULT_STATUS_PARTIAL_FAIL"),

  SYSTEM_ERROR("TASK_RESULT_STATUS_SYSTEM_ERROR"),

  DELETED("TASK_RESULT_STATUS_DELETED");

  private String value;

  TaskResultStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TaskResultStatus fromValue(String text) {
    for (TaskResultStatus b : TaskResultStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TaskResultStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final TaskResultStatus enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TaskResultStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TaskResultStatus.fromValue(String.valueOf(value));
    }
  }
}
