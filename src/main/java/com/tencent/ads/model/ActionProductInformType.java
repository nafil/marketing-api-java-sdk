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

/** 商品库行业。当您需要传输的商品信息为商品库行业标准类目时需要填写；如果传输的商品信息为商品ID，则无需填写。 */
@JsonAdapter(ActionProductInformType.Adapter.class)
public enum ActionProductInformType {
  EC("EC"),

  ESTATE("ESTATE"),

  VIDEO("VIDEO"),

  CAR("CAR"),

  NEWS_INFORMATION("NEWS_INFORMATION"),

  BEAUTY_PERSONAL_CARE("BEAUTY_PERSONAL_CARE"),

  RETAIL("RETAIL"),

  EDUCATION("EDUCATION"),

  READING("READING"),

  INSURANCE("INSURANCE"),

  LOAN("LOAN"),

  FINANCIAL("FINANCIAL"),

  BANKCARD("BANKCARD"),

  WEDDING("WEDDING"),

  SECURITIES("SECURITIES"),

  DECORATION_BUILDING_MATERIAL("DECORATION_BUILDING_MATERIAL"),

  CARRIER("CARRIER"),

  GAME("GAME");

  private String value;

  ActionProductInformType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ActionProductInformType fromValue(String text) {
    for (ActionProductInformType b : ActionProductInformType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ActionProductInformType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ActionProductInformType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ActionProductInformType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ActionProductInformType.fromValue(String.valueOf(value));
    }
  }
}