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

/** 动态商品模板所属类型 */
@JsonAdapter(DynamicAdTemplateOwnershipType.Adapter.class)
public enum DynamicAdTemplateOwnershipType {
  ALL("ALL"),

  SELF_OWNED("SELF_OWNED"),

  GRANTED("GRANTED"),

  COMMON("COMMON"),

  PRODUCT_CATALOG_OWNED("PRODUCT_CATALOG_OWNED");

  private String value;

  DynamicAdTemplateOwnershipType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DynamicAdTemplateOwnershipType fromValue(String text) {
    for (DynamicAdTemplateOwnershipType b : DynamicAdTemplateOwnershipType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DynamicAdTemplateOwnershipType> {
    @Override
    public void write(final JsonWriter jsonWriter, final DynamicAdTemplateOwnershipType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DynamicAdTemplateOwnershipType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DynamicAdTemplateOwnershipType.fromValue(String.valueOf(value));
    }
  }
}
