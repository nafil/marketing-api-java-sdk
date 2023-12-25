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

/** 广告自动衍生视频创意状态 */
@JsonAdapter(AutoDerivedCreativeStatus.Adapter.class)
public enum AutoDerivedCreativeStatus {
  DEFAULT("AUTO_DERIVED_CREATIVE_STATUS_DEFAULT"),

  INITIATED("AUTO_DERIVED_CREATIVE_STATUS_INITIATED"),

  SUCCESS("AUTO_DERIVED_CREATIVE_STATUS_SUCCESS"),

  FAIL("AUTO_DERIVED_CREATIVE_STATUS_FAIL"),

  RUNNING("AUTO_DERIVED_CREATIVE_STATUS_RUNNING");

  private String value;

  AutoDerivedCreativeStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AutoDerivedCreativeStatus fromValue(String text) {
    for (AutoDerivedCreativeStatus b : AutoDerivedCreativeStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AutoDerivedCreativeStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final AutoDerivedCreativeStatus enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AutoDerivedCreativeStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AutoDerivedCreativeStatus.fromValue(String.valueOf(value));
    }
  }
}
