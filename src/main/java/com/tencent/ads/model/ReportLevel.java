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

/** 获取报表类型级别 */
@JsonAdapter(ReportLevel.Adapter.class)
public enum ReportLevel {
  ADVERTISER("REPORT_LEVEL_ADVERTISER"),

  CAMPAIGN("REPORT_LEVEL_CAMPAIGN"),

  ADGROUP("REPORT_LEVEL_ADGROUP"),

  AD("REPORT_LEVEL_AD"),

  PROMOTED_OBJECT("REPORT_LEVEL_PROMOTED_OBJECT"),

  UNION_POSITION("REPORT_LEVEL_UNION_POSITION"),

  CREATIVE_TEMPLATE("REPORT_LEVEL_CREATIVE_TEMPLATE"),

  DEEPLINK_ADGROUP("REPORT_LEVEL_DEEPLINK_ADGROUP"),

  EXPAND_TARGETING_ADGROUP("REPORT_LEVEL_EXPAND_TARGETING_ADGROUP"),

  MATERIAL_VIDEO("REPORT_LEVEL_MATERIAL_VIDEO"),

  MATERIAL_IMAGE("REPORT_LEVEL_MATERIAL_IMAGE"),

  PRODUCT_CATELOG("REPORT_LEVEL_PRODUCT_CATELOG"),

  BIDWORD("REPORT_LEVEL_BIDWORD"),

  QUERYWORD("REPORT_LEVEL_QUERYWORD"),

  ADVERTISER_WECHAT("REPORT_LEVEL_ADVERTISER_WECHAT"),

  CAMPAIGN_WECHAT("REPORT_LEVEL_CAMPAIGN_WECHAT"),

  ADGROUP_WECHAT("REPORT_LEVEL_ADGROUP_WECHAT"),

  AD_WECHAT("REPORT_LEVEL_AD_WECHAT"),

  PROJECT("REPORT_LEVEL_PROJECT"),

  AGE("REPORT_LEVEL_AGE"),

  GENDER("REPORT_LEVEL_GENDER"),

  REGION("REPORT_LEVEL_REGION"),

  CITY("REPORT_LEVEL_CITY"),

  REGION_RECENTLY_IN("REPORT_LEVEL_REGION_RECENTLY_IN"),

  REGION_VISITED_IN("REPORT_LEVEL_REGION_VISITED_IN"),

  REGION_LIVE_IN("REPORT_LEVEL_REGION_LIVE_IN"),

  REGION_TRAVEL_IN("REPORT_LEVEL_REGION_TRAVEL_IN"),

  CITY_RECENTLY_IN("REPORT_LEVEL_CITY_RECENTLY_IN"),

  CITY_VISITED_IN("REPORT_LEVEL_CITY_VISITED_IN"),

  CITY_LIVE_IN("REPORT_LEVEL_CITY_LIVE_IN"),

  CITY_TRAVEL_IN("REPORT_LEVEL_CITY_TRAVEL_IN");

  private String value;

  ReportLevel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportLevel fromValue(String text) {
    for (ReportLevel b : ReportLevel.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ReportLevel> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportLevel enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportLevel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportLevel.fromValue(String.valueOf(value));
    }
  }
}
