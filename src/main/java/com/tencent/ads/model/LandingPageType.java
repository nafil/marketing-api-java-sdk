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

/** 落地页页面类型 */
@JsonAdapter(LandingPageType.Adapter.class)
public enum LandingPageType {
  LANDING_PAGE_TYPE_UNKNOWN("LANDING_PAGE_TYPE_UNKNOWN"),

  LANDING_PAGE_TYPE_ANDROID_APP("LANDING_PAGE_TYPE_ANDROID_APP"),

  LANDING_PAGE_TYPE_IOS_APP("LANDING_PAGE_TYPE_IOS_APP"),

  LANDING_PAGE_TYPE_FENGYE_WEB("LANDING_PAGE_TYPE_FENGYE_WEB"),

  LANDING_PAGE_TYPE_FENGYE_LBS("LANDING_PAGE_TYPE_FENGYE_LBS"),

  LANDING_PAGE_TYPE_NATIVE("LANDING_PAGE_TYPE_NATIVE"),

  LANDING_PAGE_TYPE_ANDROID_APP_NATIVE("LANDING_PAGE_TYPE_ANDROID_APP_NATIVE"),

  LANDING_PAGE_TYPE_IOS_APP_NATIVE("LANDING_PAGE_TYPE_IOS_APP_NATIVE"),

  LANDING_PAGE_TYPE_XJ_ANDROID_APP_H5("LANDING_PAGE_TYPE_XJ_ANDROID_APP_H5"),

  LANDING_PAGE_TYPE_XJ_IOS_APP_H5("LANDING_PAGE_TYPE_XJ_IOS_APP_H5"),

  LANDING_PAGE_TYPE_XJ_WEBSITE_H5("LANDING_PAGE_TYPE_XJ_WEBSITE_H5"),

  LANDING_PAGE_TYPE_XJ_WEBSITE_NATIVE("LANDING_PAGE_TYPE_XJ_WEBSITE_NATIVE"),

  LANDING_PAGE_TYPE_XJ_ANDROID_APP_NATIVE("LANDING_PAGE_TYPE_XJ_ANDROID_APP_NATIVE"),

  LANDING_PAGE_TYPE_XJ_IOS_APP_NATIVE("LANDING_PAGE_TYPE_XJ_IOS_APP_NATIVE"),

  LANDING_PAGE_TYPE_FENGYE_EC_SINGLE("LANDING_PAGE_TYPE_FENGYE_EC_SINGLE"),

  LANDING_PAGE_TYPE_FENGYE_EC_TOGETHER("LANDING_PAGE_TYPE_FENGYE_EC_TOGETHER"),

  LANDING_PAGE_TYPE_FENGYE_EC_FOCUS("LANDING_PAGE_TYPE_FENGYE_EC_FOCUS"),

  LANDING_PAGE_TYPE_FENGYE_EC_COMMON("LANDING_PAGE_TYPE_FENGYE_EC_COMMON"),

  LANDING_PAGE_TYPE_FENGYE_EC_WECHAT_MINIPROGRAM("LANDING_PAGE_TYPE_FENGYE_EC_WECHAT_MINIPROGRAM"),

  LANDING_PAGE_TYPE_PLAY_H5("LANDING_PAGE_TYPE_PLAY_H5"),

  LANDING_PAGE_TYPE_YOUZAN_SINGLE("LANDING_PAGE_TYPE_YOUZAN_SINGLE"),

  LANDING_PAGE_TYPE_YOUZAN_TOGETHER("LANDING_PAGE_TYPE_YOUZAN_TOGETHER"),

  LANDING_PAGE_TYPE_YOUZAN_WECHAT_MINIPROGRAM("LANDING_PAGE_TYPE_YOUZAN_WECHAT_MINIPROGRAM"),

  LANDING_PAGE_TYPE_YIYE_FORM("LANDING_PAGE_TYPE_YIYE_FORM"),

  LANDING_PAGE_TYPE_JINSHUJU_FORM("LANDING_PAGE_TYPE_JINSHUJU_FORM"),

  LANDING_PAGE_TYPE_WEIMOB_PRODUCTSET("LANDING_PAGE_TYPE_WEIMOB_PRODUCTSET"),

  LANDING_PAGE_TYPE_WEIMOB_PROMOTION("LANDING_PAGE_TYPE_WEIMOB_PROMOTION"),

  LANDING_PAGE_TYPE_WEIMOB_PRODUCT("LANDING_PAGE_TYPE_WEIMOB_PRODUCT"),

  LANDING_PAGE_TYPE_WEIMOB_H5("LANDING_PAGE_TYPE_WEIMOB_H5"),

  LANDING_PAGE_TYPE_WEIMOB_WECHAT_MINIPROGRAM("LANDING_PAGE_TYPE_WEIMOB_WECHAT_MINIPROGRAM"),

  LANDING_PAGE_TYPE_QQ_MOBILE_MINI_PROGRAM("LANDING_PAGE_TYPE_QQ_MOBILE_MINI_PROGRAM"),

  LANDING_PAGE_TYPE_QQ_BROWSER_MINI_PROGRAM("LANDING_PAGE_TYPE_QQ_BROWSER_MINI_PROGRAM"),

  LANDING_PAGE_TYPE_WECHAT_NATIVE("LANDING_PAGE_TYPE_WECHAT_NATIVE"),

  LANDING_PAGE_TYPE_WECHAT_H5("LANDING_PAGE_TYPE_WECHAT_H5"),

  LANDING_PAGE_TYPE_WECHAT_OFFICIAL_ACCOUNT_ARTICLE(
      "LANDING_PAGE_TYPE_WECHAT_OFFICIAL_ACCOUNT_ARTICLE"),

  LANDING_PAGE_TYPE_WECHAT_COUPON("LANDING_PAGE_TYPE_WECHAT_COUPON"),

  LANDING_PAGE_TYPE_WECHAT_OFFICIAL_ACCOUNT_DETAIL(
      "LANDING_PAGE_TYPE_WECHAT_OFFICIAL_ACCOUNT_DETAIL"),

  LANDING_PAGE_TYPE_WECHAT_APPSTORE_MOMENTS("LANDING_PAGE_TYPE_WECHAT_APPSTORE_MOMENTS"),

  LANDING_PAGE_TYPE_WECHAT_H5_TEMPLATE("LANDING_PAGE_TYPE_WECHAT_H5_TEMPLATE"),

  LANDING_PAGE_TYPE_WECHAT_MOMENTS_SIMPLE_NATIVE("LANDING_PAGE_TYPE_WECHAT_MOMENTS_SIMPLE_NATIVE"),

  LANDING_PAGE_TYPE_WECHAT_FULL_SCREEN("LANDING_PAGE_TYPE_WECHAT_FULL_SCREEN"),

  LANDING_PAGE_TYPE_WECHAT_BASE_DETAILS("LANDING_PAGE_TYPE_WECHAT_BASE_DETAILS"),

  LANDING_PAGE_TYPE_WECHAT_PICTURE_DETAILS("LANDING_PAGE_TYPE_WECHAT_PICTURE_DETAILS"),

  LANDING_PAGE_TYPE_WECHAT_STORE("LANDING_PAGE_TYPE_WECHAT_STORE"),

  LANDING_PAGE_TYPE_WECHAT_MOMENTS_H5_BRAND("LANDING_PAGE_TYPE_WECHAT_MOMENTS_H5_BRAND"),

  LANDING_PAGE_TYPE_WECHAT_MOMENTS_PICTURE_FORM("LANDING_PAGE_TYPE_WECHAT_MOMENTS_PICTURE_FORM"),

  LANDING_PAGE_TYPE_WECHAT_MOMENTS_VIDEO_FORM("LANDING_PAGE_TYPE_WECHAT_MOMENTS_VIDEO_FORM"),

  LANDING_PAGE_TYPE_WECHAT_MOMENTS_APPLIED_TEXT("LANDING_PAGE_TYPE_WECHAT_MOMENTS_APPLIED_TEXT"),

  LANDING_PAGE_TYPE_WECHAT_MOMENTS_APPLIED_VIDEO("LANDING_PAGE_TYPE_WECHAT_MOMENTS_APPLIED_VIDEO"),

  LANDING_PAGE_TYPE_WECHAT_FORM_TEMPLATE("LANDING_PAGE_TYPE_WECHAT_FORM_TEMPLATE"),

  LANDING_PAGE_TYPE_WECHAT_VOTING_TEMPLATE("LANDING_PAGE_TYPE_WECHAT_VOTING_TEMPLATE"),

  LANDING_PAGE_TYPE_WECHAT_PAYMENT_COUPONS("LANDING_PAGE_TYPE_WECHAT_PAYMENT_COUPONS"),

  LANDING_PAGE_TYPE_WECHAT_MINI_GAME("LANDING_PAGE_TYPE_WECHAT_MINI_GAME"),

  LANDING_PAGE_TYPE_WECHAT_NATIVE_BETA("LANDING_PAGE_TYPE_WECHAT_NATIVE_BETA"),

  LANDING_PAGE_TYPE_WECHAT_CALL_DAILOG("LANDING_PAGE_TYPE_WECHAT_CALL_DAILOG"),

  LANDING_PAGE_TYPE_WECHAT_FOCUS_DAILOG("LANDING_PAGE_TYPE_WECHAT_FOCUS_DAILOG"),

  LANDING_PAGE_TYPE_WECHAT_MINI_PROGRAM("LANDING_PAGE_TYPE_WECHAT_MINI_PROGRAM"),

  LANDING_PAGE_TYPE_STURNUS_IMAX("LANDING_PAGE_TYPE_STURNUS_IMAX"),

  LANDING_PAGE_TYPE_TENCENT_NEWS_SOFT_ARTICLE("LANDING_PAGE_TYPE_TENCENT_NEWS_SOFT_ARTICLE"),

  LANDING_PAGE_TYPE_TENCENT_NEWS_LIVE("LANDING_PAGE_TYPE_TENCENT_NEWS_LIVE"),

  LANDING_PAGE_TYPE_XJ_OTT("LANDING_PAGE_TYPE_XJ_OTT"),

  LANDING_PAGE_TYPE_YUEBAO_QUICKAPP("LANDING_PAGE_TYPE_YUEBAO_QUICKAPP"),

  LANDING_PAGE_TYPE_YUEBAO_OFFICIAL_ACCOUNT_ARTICLE(
      "LANDING_PAGE_TYPE_YUEBAO_OFFICIAL_ACCOUNT_ARTICLE"),

  LANDING_PAGE_TYPE_XJ_QUICK("LANDING_PAGE_TYPE_XJ_QUICK"),

  LANDING_PAGE_TYPE_QQ_MINI_GAME("LANDING_PAGE_TYPE_QQ_MINI_GAME"),

  LANDING_PAGE_TYPE_WECHAT_APPOINTMENT_CARD("LANDING_PAGE_TYPE_WECHAT_APPOINTMENT_CARD"),

  LANDING_PAGE_TYPE_WECHAT_CONSULT("LANDING_PAGE_TYPE_WECHAT_CONSULT"),

  DEEP_LINK("DEEP_LINK"),

  H5("H5"),

  MINI_PROGRAM("MINI_PROGRAM"),

  UNIVERSAL_LINK("UNIVERSAL_LINK"),

  LANDING_PAGE_TYPE_MAIBAO_SINGLE("LANDING_PAGE_TYPE_MAIBAO_SINGLE"),

  LANDING_PAGE_TYPE_MAIBAO_TOGETHER("LANDING_PAGE_TYPE_MAIBAO_TOGETHER"),

  LANDING_PAGE_TYPE_MAIBAO_FOCUS("LANDING_PAGE_TYPE_MAIBAO_FOCUS"),

  LANDING_PAGE_TYPE_YUEBAO_APP("LANDING_PAGE_TYPE_YUEBAO_APP"),

  LANDING_PAGE_TYPE_YUEBAO_IOS("LANDING_PAGE_TYPE_YUEBAO_IOS"),

  LANDING_PAGE_TYPE_YUEBAO_ANDROID("LANDING_PAGE_TYPE_YUEBAO_ANDROID"),

  LANDING_PAGE_TYPE_CHEXUNDA_MINI_PROGRAM("LANDING_PAGE_TYPE_CHEXUNDA_MINI_PROGRAM"),

  LANDING_PAGE_TYPE_FENGSHU_MINI_PROGRAM("LANDING_PAGE_TYPE_FENGSHU_MINI_PROGRAM"),

  LANDING_PAGE_TYPE_DEEP_LINK("LANDING_PAGE_TYPE_DEEP_LINK"),

  LANDING_PAGE_TYPE_UNIVERSAL_LINK("LANDING_PAGE_TYPE_UNIVERSAL_LINK"),

  LANDING_PAGE_TYPE_WECHAT_NATIVE_WEBVIEW("LANDING_PAGE_TYPE_WECHAT_NATIVE_WEBVIEW"),

  LANDING_PAGE_TYPE_WECHAT_MOMENTS_SCAN_PHOTO("LANDING_PAGE_TYPE_WECHAT_MOMENTS_SCAN_PHOTO"),

  LANDING_PAGE_TYPE_WECHAT_MOMENTS_SUBSCRIPTION("LANDING_PAGE_TYPE_WECHAT_MOMENTS_SUBSCRIPTION"),

  LANDING_PAGE_TYPE_CHANNELS("LANDING_PAGE_TYPE_CHANNELS"),

  LANDING_PAGE_TYPE_CHANNELS_WATCH_LIVE("LANDING_PAGE_TYPE_CHANNELS_WATCH_LIVE"),

  LANDING_PAGE_TYPE_CHANNELS_RESERVE_LIVE("LANDING_PAGE_TYPE_CHANNELS_RESERVE_LIVE"),

  LANDING_PAGE_TYPE_CHANNELS_FOLLOW_CARD("LANDING_PAGE_TYPE_CHANNELS_FOLLOW_CARD"),

  LANDING_PAGE_TYPE_WECHAT_STATUS_FOOTER("LANDING_PAGE_TYPE_WECHAT_STATUS_FOOTER"),

  LANDING_PAGE_TYPE_WECHAT_XJ_IOS_APP_H5("LANDING_PAGE_TYPE_WECHAT_XJ_IOS_APP_H5"),

  LANDING_PAGE_TYPE_WECHAT_VIDEO_TOPIC("LANDING_PAGE_TYPE_WECHAT_VIDEO_TOPIC"),

  LANDING_PAGE_TYPE_WECHAT_XJ_ANDROID_APP_H5("LANDING_PAGE_TYPE_WECHAT_XJ_ANDROID_APP_H5"),

  LANDING_PAGE_TYPE_WECHAT_XJ_WEBSITE_H5("LANDING_PAGE_TYPE_WECHAT_XJ_WEBSITE_H5"),

  LANDING_PAGE_TYPE_WECHAT_RED_PACKET_COVER("LANDING_PAGE_TYPE_WECHAT_RED_PACKET_COVER"),

  LANDING_PAGE_TYPE_WECHAT_CHANNELS_HALF_CARD("LANDING_PAGE_TYPE_WECHAT_CHANNELS_HALF_CARD"),

  LANDING_PAGE_TYPE_CHANNELS_USER_PROFILE("LANDING_PAGE_TYPE_CHANNELS_USER_PROFILE"),

  LANDING_PAGE_TYPE_NOT_USED("LANDING_PAGE_TYPE_NOT_USED"),

  DEFAULT("DEFAULT"),

  DEEP_LINK_IOS("DEEP_LINK_IOS"),

  DEEP_LINK_ANDROID("DEEP_LINK_ANDROID");

  private String value;

  LandingPageType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LandingPageType fromValue(String text) {
    for (LandingPageType b : LandingPageType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LandingPageType> {
    @Override
    public void write(final JsonWriter jsonWriter, final LandingPageType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LandingPageType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LandingPageType.fromValue(String.valueOf(value));
    }
  }
}
