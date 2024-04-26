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

/** 国外拍摄地 */
@JsonAdapter(TourPlaceForeign.Adapter.class)
public enum TourPlaceForeign {
  VN("TOUR_PLACE_FOREIGN_VN"),

  AU("TOUR_PLACE_FOREIGN_AU"),

  PALAO("TOUR_PLACE_FOREIGN_PALAO"),

  BALI("TOUR_PLACE_FOREIGN_BALI"),

  FJ("TOUR_PLACE_FOREIGN_FJ"),

  PUJI("TOUR_PLACE_FOREIGN_PUJI"),

  MV("TOUR_PLACE_FOREIGN_MV"),

  JP("TOUR_PLACE_FOREIGN_JP"),

  TR("TOUR_PLACE_FOREIGN_TR"),

  GR("TOUR_PLACE_FOREIGN_GR"),

  FR("TOUR_PLACE_FOREIGN_FR"),

  IT("TOUR_PLACE_FOREIGN_IT"),

  BULAGE("TOUR_PLACE_FOREIGN_BULAGE"),

  XIANBENNA("TOUR_PLACE_FOREIGN_XIANBENNA"),

  MU("TOUR_PLACE_FOREIGN_MU"),

  GE("TOUR_PLACE_FOREIGN_GE"),

  SUMEI("TOUR_PLACE_FOREIGN_SUMEI"),

  SAIBAN("TOUR_PLACE_FOREIGN_SAIBAN"),

  JIZHOU("TOUR_PLACE_FOREIGN_JIZHOU"),

  SHABA("TOUR_PLACE_FOREIGN_SHABA"),

  DE("TOUR_PLACE_FOREIGN_DE"),

  LONDON("TOUR_PLACE_FOREIGN_LONDON"),

  SYDNEY("TOUR_PLACE_FOREIGN_SYDNEY"),

  NZ("TOUR_PLACE_FOREIGN_NZ"),

  JILONGPO("TOUR_PLACE_FOREIGN_JILONGPO");

  private String value;

  TourPlaceForeign(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TourPlaceForeign fromValue(String text) {
    for (TourPlaceForeign b : TourPlaceForeign.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TourPlaceForeign> {
    @Override
    public void write(final JsonWriter jsonWriter, final TourPlaceForeign enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TourPlaceForeign read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TourPlaceForeign.fromValue(String.valueOf(value));
    }
  }
}