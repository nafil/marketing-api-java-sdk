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

/** 商品库行业类型 */
@JsonAdapter(CatalogIndustry.Adapter.class)
public enum CatalogIndustry {
  ECOMMERCE("INDUSTRY_TYPE_ECOMMERCE"),

  READING("INDUSTRY_TYPE_READING"),

  EDUCATION("INDUSTRY_TYPE_EDUCATION"),

  WEDDING("INDUSTRY_TYPE_WEDDING"),

  VIDEO("INDUSTRY_TYPE_VIDEO"),

  INSURANCE("INDUSTRY_TYPE_INSURANCE"),

  LOAN("INDUSTRY_TYPE_LOAN"),

  FINANCIAL("INDUSTRY_TYPE_FINANCIAL"),

  BANKCARD("INDUSTRY_TYPE_BANKCARD"),

  SECURITIES("INDUSTRY_TYPE_SECURITIES"),

  ESTATE("INDUSTRY_TYPE_ESTATE");

  private String value;

  CatalogIndustry(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CatalogIndustry fromValue(String text) {
    for (CatalogIndustry b : CatalogIndustry.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CatalogIndustry> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogIndustry enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CatalogIndustry read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CatalogIndustry.fromValue(String.valueOf(value));
    }
  }
}
