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

/** 门店经营状态 */
@JsonAdapter(LocalStoreOpeningStatus.Adapter.class)
public enum LocalStoreOpeningStatus {
  UNKNOWN("OPENING_STATUS_UNKNOWN"),

  OPENING("OPENING_STATUS_OPENING"),

  TEMPORARILY_CLOSED("OPENING_STATUS_TEMPORARILY_CLOSED"),

  PERMANENTLY_CLOSED("OPENING_STATUS_PERMANENTLY_CLOSED");

  private String value;

  LocalStoreOpeningStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalStoreOpeningStatus fromValue(String text) {
    for (LocalStoreOpeningStatus b : LocalStoreOpeningStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LocalStoreOpeningStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalStoreOpeningStatus enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalStoreOpeningStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalStoreOpeningStatus.fromValue(String.valueOf(value));
    }
  }
}
