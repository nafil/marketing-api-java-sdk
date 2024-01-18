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

/** 排除已转化人群的数据维度 */
@JsonAdapter(ExcludedDimension.Adapter.class)
public enum ExcludedDimension {
  CAMPAIGN("EXCLUDED_DIMENSION_CAMPAIGN"),

  UID("EXCLUDED_DIMENSION_UID"),

  BUSINESS_MANAGER("EXCLUDED_DIMENSION_BUSINESS_MANAGER"),

  COMPANY_ACCOUNT("EXCLUDED_DIMENSION_COMPANY_ACCOUNT"),

  APP("EXCLUDED_DIMENSION_APP"),

  PRODUCT("EXCLUDED_DIMENSION_PRODUCT");

  private String value;

  ExcludedDimension(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ExcludedDimension fromValue(String text) {
    for (ExcludedDimension b : ExcludedDimension.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ExcludedDimension> {
    @Override
    public void write(final JsonWriter jsonWriter, final ExcludedDimension enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ExcludedDimension read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ExcludedDimension.fromValue(String.valueOf(value));
    }
  }
}
