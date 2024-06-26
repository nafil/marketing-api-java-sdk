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

/** 商品系列类型 */
@JsonAdapter(ProductSeriesType.Adapter.class)
public enum ProductSeriesType {
  CUSTOMIZED("PRODUCT_SERIES_TYPE_CUSTOMIZED"),

  UNLIMITED("PRODUCT_SERIES_TYPE_UNLIMITED");

  private String value;

  ProductSeriesType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProductSeriesType fromValue(String text) {
    for (ProductSeriesType b : ProductSeriesType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ProductSeriesType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProductSeriesType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProductSeriesType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProductSeriesType.fromValue(String.valueOf(value));
    }
  }
}
