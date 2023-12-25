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

/** 转码状态 */
@JsonAdapter(MediaSystemStatus.Adapter.class)
public enum MediaSystemStatus {
  VALID("MEDIA_STATUS_VALID"),

  PENDING("MEDIA_STATUS_PENDING"),

  ERROR("MEDIA_STATUS_ERROR");

  private String value;

  MediaSystemStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MediaSystemStatus fromValue(String text) {
    for (MediaSystemStatus b : MediaSystemStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<MediaSystemStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final MediaSystemStatus enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MediaSystemStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return MediaSystemStatus.fromValue(String.valueOf(value));
    }
  }
}
