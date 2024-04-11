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

/** 推广类容类型 */
@JsonAdapter(PromotedAssetType.Adapter.class)
public enum PromotedAssetType {
  UNKNOWN("PROMOTED_ASSET_TYPE_UNKNOWN"),

  APP_ANDROID("PROMOTED_ASSET_TYPE_APP_ANDROID"),

  APP_IOS("PROMOTED_ASSET_TYPE_APP_IOS"),

  WECHAT_OFFICIAL_ACCOUNT("PROMOTED_ASSET_TYPE_WECHAT_OFFICIAL_ACCOUNT"),

  EDUCATION("PROMOTED_ASSET_TYPE_EDUCATION"),

  TRAFFIC("PROMOTED_ASSET_TYPE_TRAFFIC"),

  HOUSE_PROPERTY("PROMOTED_ASSET_TYPE_HOUSE_PROPERTY"),

  LOCAL_STORE("PROMOTED_ASSET_TYPE_LOCAL_STORE"),

  MINIGAME("PROMOTED_ASSET_TYPE_MINIGAME"),

  CONSUMER_PRODUCT("PROMOTED_ASSET_TYPE_CONSUMER_PRODUCT"),

  WECHAT_CHANNELS("PROMOTED_ASSET_TYPE_WECHAT_CHANNELS"),

  WECHAT_CHANNELS_LIVE("PROMOTED_ASSET_TYPE_WECHAT_CHANNELS_LIVE"),

  WECHAT_CHANNELS_LIVE_RESERVATION("PROMOTED_ASSET_TYPE_WECHAT_CHANNELS_LIVE_RESERVATION"),

  MINI_PROGRAM_WECHAT("PROMOTED_ASSET_TYPE_MINI_PROGRAM_WECHAT"),

  APP_QUICK_APP("PROMOTED_ASSET_TYPE_APP_QUICK_APP"),

  CONSUME_MEDICAL("PROMOTED_ASSET_TYPE_CONSUME_MEDICAL"),

  COMPREHENSIVE_HOUSEKEEPING("PROMOTED_ASSET_TYPE_COMPREHENSIVE_HOUSEKEEPING"),

  FICTION("PROMOTED_ASSET_TYPE_FICTION"),

  SHORT_DRAMA("PROMOTED_ASSET_TYPE_SHORT_DRAMA"),

  AUDIOVISUAL_ENTERTAINMENT("PROMOTED_ASSET_TYPE_AUDIOVISUAL_ENTERTAINMENT"),

  BEAUTY_AND_PERSONAL_CARE("PROMOTED_ASSET_TYPE_BEAUTY_AND_PERSONAL_CARE"),

  WEDDING_AND_PORTRAIT_PHOTOGRAPHY("PROMOTED_ASSET_TYPE_WEDDING_AND_PORTRAIT_PHOTOGRAPHY"),

  FRANCHISE_BRAND("PROMOTED_ASSET_TYPE_FRANCHISE_BRAND"),

  ENTERPRISE_SERVICES("PROMOTED_ASSET_TYPE_ENTERPRISE_SERVICES"),

  EXHIBITION_BOOTH_DESIGN("PROMOTED_ASSET_TYPE_EXHIBITION_BOOTH_DESIGN"),

  INSURANCE("PROMOTED_ASSET_TYPE_INSURANCE"),

  BANK("PROMOTED_ASSET_TYPE_BANK"),

  CREDIT("PROMOTED_ASSET_TYPE_CREDIT"),

  INVESTMENT_CONSULTING("PROMOTED_ASSET_TYPE_INVESTMENT_CONSULTING"),

  REAL_ESTATE("PROMOTED_ASSET_TYPE_REAL_ESTATE"),

  TELECOMMUNICATIONS_OPERATOR("PROMOTED_ASSET_TYPE_TELECOMMUNICATIONS_OPERATOR"),

  TOURIST_ATTRACTIONS_TICKETS("PROMOTED_ASSET_TYPE_TOURIST_ATTRACTIONS_TICKETS"),

  RENOVATION_SERVICES("PROMOTED_ASSET_TYPE_RENOVATION_SERVICES"),

  FURNITURE_AND_BUILDING_MATERIALS("PROMOTED_ASSET_TYPE_FURNITURE_AND_BUILDING_MATERIALS"),

  EXHIBITION_SALES("PROMOTED_ASSET_TYPE_EXHIBITION_SALES"),

  MEDICINE_INDUSTRY_COMMERCIAL("PROMOTED_ASSET_TYPE_MEDICINE_INDUSTRY_COMMERCIAL"),

  FINANCE("PROMOTED_ASSET_TYPE_FINANCE"),

  LOCAL_STORE_PACKAGE("PROMOTED_ASSET_TYPE_LOCAL_STORE_PACKAGE"),

  CATERING_AND_LEISURE("PROMOTED_ASSET_TYPE_CATERING_AND_LEISURE"),

  CHAIN_RESTAURANT("PROMOTED_ASSET_TYPE_CHAIN_RESTAURANT"),

  COMMODITY_SET("PROMOTED_ASSET_TYPE_COMMODITY_SET"),

  TOURIST_TRAVEL_ROUTE("PROMOTED_ASSET_TYPE_TOURIST_TRAVEL_ROUTE"),

  TOURIST_CRUISE_LINE("PROMOTED_ASSET_TYPE_TOURIST_CRUISE_LINE"),

  TOURIST_HOTEL_SERVICE("PROMOTED_ASSET_TYPE_TOURIST_HOTEL_SERVICE"),

  TOURIST_AIRLINE_TICKETS("PROMOTED_ASSET_TYPE_TOURIST_AIRLINE_TICKETS"),

  LOCAL_STORE_COMBINE_WITH_PRODUCT("PROMOTED_ASSET_TYPE_LOCAL_STORE_COMBINE_WITH_PRODUCT"),

  ACTIVITY("PROMOTED_ASSET_TYPE_ACTIVITY"),

  STORE("PROMOTED_ASSET_TYPE_STORE"),

  MINI_GAME_QQ("PROMOTED_ASSET_TYPE_MINI_GAME_QQ"),

  APP_GAME_ANDROID("PROMOTED_ASSET_TYPE_APP_GAME_ANDROID"),

  APP_GAME_IOS("PROMOTED_ASSET_TYPE_APP_GAME_IOS"),

  PC_GAME("PROMOTED_ASSET_TYPE_PC_GAME"),

  WECHAT_WORK("PROMOTED_ASSET_TYPE_WECHAT_WORK"),

  LIVE_STREAM_ROOM("PROMOTED_ASSET_TYPE_LIVE_STREAM_ROOM"),

  PERSONAL_STORE("PROMOTED_ASSET_TYPE_PERSONAL_STORE"),

  PLATFORM_CHANNEL("PROMOTED_ASSET_TYPE_PLATFORM_CHANNEL"),

  TWO_WHEEL_VEHICLE("PROMOTED_ASSET_TYPE_TWO_WHEEL_VEHICLE"),

  GOVERNMENT_AFFAIRS("PROMOTED_ASSET_TYPE_GOVERNMENT_AFFAIRS");

  private String value;

  PromotedAssetType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotedAssetType fromValue(String text) {
    for (PromotedAssetType b : PromotedAssetType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PromotedAssetType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotedAssetType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotedAssetType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotedAssetType.fromValue(String.valueOf(value));
    }
  }
}
