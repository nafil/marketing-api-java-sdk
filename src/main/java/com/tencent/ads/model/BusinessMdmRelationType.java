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

/** 关联类型 */
@JsonAdapter(BusinessMdmRelationType.Adapter.class)
public enum BusinessMdmRelationType {
  MDM("RELATION_TYPE_MDM"),

  BUSINESS("RELATION_TYPE_BUSINESS");

  private String value;

  BusinessMdmRelationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BusinessMdmRelationType fromValue(String text) {
    for (BusinessMdmRelationType b : BusinessMdmRelationType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BusinessMdmRelationType> {
    @Override
    public void write(final JsonWriter jsonWriter, final BusinessMdmRelationType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BusinessMdmRelationType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BusinessMdmRelationType.fromValue(String.valueOf(value));
    }
  }
}