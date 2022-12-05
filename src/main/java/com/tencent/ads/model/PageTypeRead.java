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

/** 落地页类型 */
@JsonAdapter(PageTypeRead.Adapter.class)
public enum PageTypeRead {
  DEFAULT("PAGE_TYPE_DEFAULT"),

  TSA_APP("PAGE_TYPE_TSA_APP"),

  TSA_WEB_NONE_ECOMMERCE("PAGE_TYPE_TSA_WEB_NONE_ECOMMERCE"),

  FENGYE_ECOMMERCE("PAGE_TYPE_FENGYE_ECOMMERCE"),

  CANVAS("PAGE_TYPE_CANVAS"),

  MINI_PROGRAM("PAGE_TYPE_MINI_PROGRAM"),

  CANVAS_WECHAT("PAGE_TYPE_CANVAS_WECHAT"),

  MINI_PROGRAM_WECHAT("PAGE_TYPE_MINI_PROGRAM_WECHAT"),

  UNSUPPORTED("PAGE_TYPE_UNSUPPORTED"),

  MINI_GAME_WECHAT("PAGE_TYPE_MINI_GAME_WECHAT"),

  FENGYE_EC_WECHAT_MINIPROGRAM("PAGE_TYPE_FENGYE_EC_WECHAT_MINIPROGRAM"),

  MINI_PROGRAM_QQ("PAGE_TYPE_MINI_PROGRAM_QQ"),

  MINI_GAME_QQ("PAGE_TYPE_MINI_GAME_QQ"),

  MINI_PROGRAM_CANVAS_WECHAT("PAGE_TYPE_MINI_PROGRAM_CANVAS_WECHAT"),

  MOMENTS_SIMPLE_NATIVE_WECHAT("PAGE_TYPE_MOMENTS_SIMPLE_NATIVE_WECHAT"),

  FULL_SCREEN_WECHAT("PAGE_TYPE_FULL_SCREEN_WECHAT"),

  YUEBAO_QUICKAPP("PAGE_TYPE_YUEBAO_QUICKAPP"),

  YUEBAO_OFFICIAL_ACCOUNT_ARTICLE("PAGE_TYPE_YUEBAO_OFFICIAL_ACCOUNT_ARTICLE"),

  XIJING_QUICK("PAGE_TYPE_XIJING_QUICK"),

  WECHAT_CHANNELS("PAGE_TYPE_WECHAT_CHANNELS"),

  CHANNELS_WATCH_LIVE("PAGE_TYPE_CHANNELS_WATCH_LIVE"),

  CHANNELS_RESERVE_LIVE("PAGE_TYPE_CHANNELS_RESERVE_LIVE"),

  WECHAT_STATUS_FOOTER("PAGE_TYPE_WECHAT_STATUS_FOOTER"),

  YOUZAN_SINGLE("PAGE_TYPE_YOUZAN_SINGLE"),

  YOUZAN_TOGETHER("PAGE_TYPE_YOUZAN_TOGETHER"),

  YOUZAN_WECHAT_MINIPROGRAM("PAGE_TYPE_YOUZAN_WECHAT_MINIPROGRAM"),

  YIYE_FORM("PAGE_TYPE_YIYE_FORM"),

  WEIMOB_PRODUCTSET("PAGE_TYPE_WEIMOB_PRODUCTSET"),

  WEIMOB_PROMOTION("PAGE_TYPE_WEIMOB_PROMOTION"),

  WEIMOB_PRODUCT("PAGE_TYPE_WEIMOB_PRODUCT"),

  WEIMOB_H5("PAGE_TYPE_WEIMOB_H5"),

  WEIMOB_WECHAT_MINIPROGRAM("PAGE_TYPE_WEIMOB_WECHAT_MINIPROGRAM"),

  FENGSHU_MINI_PROGRAM("PAGE_TYPE_FENGSHU_MINI_PROGRAM"),

  WECHAT_OFFICIAL_ACCOUNT_DETAIL("PAGE_TYPE_WECHAT_OFFICIAL_ACCOUNT_DETAIL"),

  WECHAT_FOCUS_DAILOG("PAGE_TYPE_WECHAT_FOCUS_DAILOG"),

  WECHAT_MOMENTS_SCAN_PHOTO("PAGE_TYPE_WECHAT_MOMENTS_SCAN_PHOTO"),

  WECHAT_MOMENTS_SUBSCRIPTION("PAGE_TYPE_WECHAT_MOMENTS_SUBSCRIPTION"),

  WECHAT_RED_PACKET_COVER("PAGE_TYPE_WECHAT_RED_PACKET_COVER"),

  WECHAT_VIDEO_TOPIC("PAGE_TYPE_WECHAT_VIDEO_TOPIC"),

  ARTICAL_WECHAT("PAGE_TYPE_ARTICAL_WECHAT"),

  CHANNELS_HALF_CARD("PAGE_TYPE_CHANNELS_HALF_CARD"),

  NOT_USED("PAGE_TYPE_NOT_USED"),

  TSA_OTT("PAGE_TYPE_TSA_OTT");

  private String value;

  PageTypeRead(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PageTypeRead fromValue(String text) {
    for (PageTypeRead b : PageTypeRead.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PageTypeRead> {
    @Override
    public void write(final JsonWriter jsonWriter, final PageTypeRead enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PageTypeRead read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PageTypeRead.fromValue(String.valueOf(value));
    }
  }
}
