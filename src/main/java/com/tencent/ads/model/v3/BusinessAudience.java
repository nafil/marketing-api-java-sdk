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

/** 受众 */
@JsonAdapter(BusinessAudience.Adapter.class)
public enum BusinessAudience {
  PERSONAL("BUSINESS_AUDIENCE_PERSONAL"),

  ENTERPRISE("BUSINESS_AUDIENCE_ENTERPRISE");

  private String value;

  BusinessAudience(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BusinessAudience fromValue(String text) {
    for (BusinessAudience b : BusinessAudience.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BusinessAudience> {
    @Override
    public void write(final JsonWriter jsonWriter, final BusinessAudience enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BusinessAudience read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BusinessAudience.fromValue(String.valueOf(value));
    }
  }
}
