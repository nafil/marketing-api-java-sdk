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

/** 营销资产属性key */
@JsonAdapter(PromotedAssetAttrKey.Adapter.class)
public enum PromotedAssetAttrKey {
  UNKNOWN("PROMOTED_ASSET_ATTR_KEY_UNKNOWN"),

  SPU_ID("PROMOTED_ASSET_ATTR_KEY_SPU_ID"),

  APP_ANDROID_ID("PROMOTED_ASSET_ATTR_KEY_APP_ANDROID_ID"),

  APP_IOS_ID("PROMOTED_ASSET_ATTR_KEY_APP_IOS_ID"),

  WECHAT_OFFICIAL_ACCOUNT_ID("PROMOTED_ASSET_ATTR_KEY_WECHAT_OFFICIAL_ACCOUNT_ID"),

  EDUCATION_PRODUCT_TYPE("PROMOTED_ASSET_ATTR_KEY_EDUCATION_PRODUCT_TYPE"),

  EDUCATION_PRODUCT_FORM("PROMOTED_ASSET_ATTR_KEY_EDUCATION_PRODUCT_FORM"),

  EDUCATION_PRODUCT_CAPACITY("PROMOTED_ASSET_ATTR_KEY_EDUCATION_PRODUCT_CAPACITY"),

  EDUCATION_PRODUCT_DIRECTION1("PROMOTED_ASSET_ATTR_KEY_EDUCATION_PRODUCT_DIRECTION1"),

  EDUCATION_PRODUCT_DIRECTION2("PROMOTED_ASSET_ATTR_KEY_EDUCATION_PRODUCT_DIRECTION2"),

  EDUCATION_PRICE("PROMOTED_ASSET_ATTR_KEY_EDUCATION_PRICE"),

  EDUCATION_INTENDED_CROWD1("PROMOTED_ASSET_ATTR_KEY_EDUCATION_INTENDED_CROWD1"),

  EDUCATION_INTENDED_CROWD2("PROMOTED_ASSET_ATTR_KEY_EDUCATION_INTENDED_CROWD2"),

  EDUCATION_TEACHING_AID_TYPE1("PROMOTED_ASSET_ATTR_KEY_EDUCATION_TEACHING_AID_TYPE1"),

  EDUCATION_TEACHING_AID_TYPE2("PROMOTED_ASSET_ATTR_KEY_EDUCATION_TEACHING_AID_TYPE2"),

  EDUCATION_CATEGORY("PROMOTED_ASSET_ATTR_KEY_EDUCATION_CATEGORY"),

  TRAFFIC_CAR_BRANDE_NAME("PROMOTED_ASSET_ATTR_KEY_TRAFFIC_CAR_BRANDE_NAME"),

  TRAFFIC_CAR_SERIES_NAME("PROMOTED_ASSET_ATTR_KEY_TRAFFIC_CAR_SERIES_NAME"),

  TRAFFIC_CAR_MODEL_NAME("PROMOTED_ASSET_ATTR_KEY_TRAFFIC_CAR_MODEL_NAME"),

  TRAFFIC_CAR_ENERGY_TYPE("PROMOTED_ASSET_ATTR_KEY_TRAFFIC_CAR_ENERGY_TYPE"),

  TRAFFIC_CAR_MODEL_LEVEL("PROMOTED_ASSET_ATTR_KEY_TRAFFIC_CAR_MODEL_LEVEL"),

  TRAFFIC_CAR_VENDOR_ATTRIBUTES("PROMOTED_ASSET_ATTR_KEY_TRAFFIC_CAR_VENDOR_ATTRIBUTES"),

  TRAFFIC_CAR_DRIVE_FORM("PROMOTED_ASSET_ATTR_KEY_TRAFFIC_CAR_DRIVE_FORM"),

  TRAFFIC_CAR_COUNTRY("PROMOTED_ASSET_ATTR_KEY_TRAFFIC_CAR_COUNTRY"),

  TRAFFIC_CAR_BODY_STRUCTURE("PROMOTED_ASSET_ATTR_KEY_TRAFFIC_CAR_BODY_STRUCTURE"),

  TRAFFIC_CAR_CLTC_PURE_ELECTRIC_RANGE_KM(
      "PROMOTED_ASSET_ATTR_KEY_TRAFFIC_CAR_CLTC_PURE_ELECTRIC_RANGE_KM"),

  TRAFFIC_CAR_FAST_CHARGING_TIME("PROMOTED_ASSET_ATTR_KEY_TRAFFIC_CAR_FAST_CHARGING_TIME"),

  TRAFFIC_CAR_DISPLACEMENT("PROMOTED_ASSET_ATTR_KEY_TRAFFIC_CAR_DISPLACEMENT"),

  TRAFFIC_CAR_NUMBER_OF_SEATS("PROMOTED_ASSET_ATTR_KEY_TRAFFIC_CAR_NUMBER_OF_SEATS"),

  TRAFFIC_CAR_INTAKE_FORM("PROMOTED_ASSET_ATTR_KEY_TRAFFIC_CAR_INTAKE_FORM"),

  TRAFFIC_CAR_VENDOR("PROMOTED_ASSET_ATTR_KEY_TRAFFIC_CAR_VENDOR"),

  MINIGAME_ID("PROMOTED_ASSET_ATTR_KEY_MINIGAME_ID"),

  CONSUMER_PRODUCT_COMMODITY_TRADING_URL(
      "PROMOTED_ASSET_ATTR_KEY_CONSUMER_PRODUCT_COMMODITY_TRADING_URL"),

  CONSUMER_PRODUCT_COMMODITY_TRADING_TYPE(
      "PROMOTED_ASSET_ATTR_KEY_CONSUMER_PRODUCT_COMMODITY_TRADING_TYPE"),

  WECHAT_CHANNELS_ID("PROMOTED_ASSET_ATTR_KEY_WECHAT_CHANNELS_ID"),

  MINI_PROGRAM_WECHAT_ID("PROMOTED_ASSET_ATTR_KEY_MINI_PROGRAM_WECHAT_ID"),

  APP_QUICK_APP_ID("PROMOTED_ASSET_ATTR_KEY_APP_QUICK_APP_ID"),

  CONSUME_MEDICAL_CATE_NAME("PROMOTED_ASSET_ATTR_KEY_CONSUME_MEDICAL_CATE_NAME"),

  CONSUME_MEDICAL_ORGANIZATION_NAME("PROMOTED_ASSET_ATTR_KEY_CONSUME_MEDICAL_ORGANIZATION_NAME"),

  COMPREHENSIVE_HOUSEKEEPING_CATE_NAME(
      "PROMOTED_ASSET_ATTR_KEY_COMPREHENSIVE_HOUSEKEEPING_CATE_NAME"),

  COMPREHENSIVE_HOUSEKEEPING_BRAND_NAME(
      "PROMOTED_ASSET_ATTR_KEY_COMPREHENSIVE_HOUSEKEEPING_BRAND_NAME"),

  COMPREHENSIVE_HOUSEKEEPING_PRICE_RANGE(
      "PROMOTED_ASSET_ATTR_KEY_COMPREHENSIVE_HOUSEKEEPING_PRICE_RANGE"),

  COMPREHENSIVE_HOUSEKEEPING_THEME("PROMOTED_ASSET_ATTR_KEY_COMPREHENSIVE_HOUSEKEEPING_THEME");

  private String value;

  PromotedAssetAttrKey(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotedAssetAttrKey fromValue(String text) {
    for (PromotedAssetAttrKey b : PromotedAssetAttrKey.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PromotedAssetAttrKey> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotedAssetAttrKey enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotedAssetAttrKey read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotedAssetAttrKey.fromValue(String.valueOf(value));
    }
  }
}