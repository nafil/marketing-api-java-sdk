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

/** 商品库行业类型 */
@JsonAdapter(DpaCatalogIndustry.Adapter.class)
public enum DpaCatalogIndustry {
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

  ESTATE("INDUSTRY_TYPE_ESTATE"),

  CARRIER("INDUSTRY_TYPE_CARRIER"),

  MERCHANTS("INDUSTRY_TYPE_MERCHANTS"),

  BUSINESS_SERVICE("INDUSTRY_TYPE_BUSINESS_SERVICE"),

  DECORATION_BUILDING_MATERIAL("INDUSTRY_TYPE_DECORATION_BUILDING_MATERIAL"),

  HOTEL("INDUSTRY_TYPE_HOTEL"),

  CAR_ONLINE_PLATFORM("INDUSTRY_TYPE_CAR_ONLINE_PLATFORM"),

  CAR_AFTERMARKET("INDUSTRY_TYPE_CAR_AFTERMARKET"),

  CAR_TRAVEL_SERVICE("INDUSTRY_TYPE_CAR_TRAVEL_SERVICE");

  private String value;

  DpaCatalogIndustry(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DpaCatalogIndustry fromValue(String text) {
    for (DpaCatalogIndustry b : DpaCatalogIndustry.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DpaCatalogIndustry> {
    @Override
    public void write(final JsonWriter jsonWriter, final DpaCatalogIndustry enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DpaCatalogIndustry read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DpaCatalogIndustry.fromValue(String.valueOf(value));
    }
  }
}
