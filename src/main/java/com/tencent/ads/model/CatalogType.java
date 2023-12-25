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

/** 商品库类型 */
@JsonAdapter(CatalogType.Adapter.class)
public enum CatalogType {
  CATALOG_TYPE_STANDARD("CATALOG_TYPE_STANDARD"),

  CATALOG_TYPE_FENGYE("CATALOG_TYPE_FENGYE"),

  CATALOG_TYPE_LOCAL_STORE("CATALOG_TYPE_LOCAL_STORE"),

  CATALOG_TYPE_YOUZAN("CATALOG_TYPE_YOUZAN"),

  CATALOG_TYPE_WEIMENG("CATALOG_TYPE_WEIMENG"),

  CATALOG_TYPE_MADAO("CATALOG_TYPE_MADAO"),

  PRODUCT_CATALOG_TYPE_STANDARD("PRODUCT_CATALOG_TYPE_STANDARD"),

  PRODUCT_CATALOG_TYPE_FENGYE("PRODUCT_CATALOG_TYPE_FENGYE"),

  PRODUCT_CATALOG_TYPE_SMALLSHOP("PRODUCT_CATALOG_TYPE_SMALLSHOP"),

  PRODUCT_CATALOG_TYPE_YUEBAO("PRODUCT_CATALOG_TYPE_YUEBAO"),

  PRODUCT_CATALOG_TYPE_MAIBAO("PRODUCT_CATALOG_TYPE_MAIBAO"),

  PRODUCT_CATALOG_TYPE_YOUZAN("PRODUCT_CATALOG_TYPE_YOUZAN"),

  PRODUCT_CATALOG_TYPE_WEIMENG("PRODUCT_CATALOG_TYPE_WEIMENG"),

  PRODUCT_CATALOG_TYPE_MADAO("PRODUCT_CATALOG_TYPE_MADAO"),

  CATALOG_TYPE_UNKNOWN("CATALOG_TYPE_UNKNOWN");

  private String value;

  CatalogType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CatalogType fromValue(String text) {
    for (CatalogType b : CatalogType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CatalogType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CatalogType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CatalogType.fromValue(String.valueOf(value));
    }
  }
}
