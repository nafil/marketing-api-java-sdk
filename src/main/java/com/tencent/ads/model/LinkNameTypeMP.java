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

/** 链接名称类型 */
@JsonAdapter(LinkNameTypeMP.Adapter.class)
public enum LinkNameTypeMP {
  VIEW_DETAILS("VIEW_DETAILS"),

  GET_COUPONS("GET_COUPONS"),

  MAKE_AN_APPOINTMENT("MAKE_AN_APPOINTMENT"),

  BUY_NOW("BUY_NOW"),

  GO_SHOPPING("GO_SHOPPING"),

  ENTER_MINI_PROGRAM("ENTER_MINI_PROGRAM"),

  ENTER_MINI_GAME("ENTER_MINI_GAME"),

  APPLY_NOW("APPLY_NOW"),

  BOOK_NOW("BOOK_NOW"),

  RESERVATION_BUY("RESERVATION_BUY"),

  CONSULT_NOW("CONSULT_NOW"),

  BOOK_DRIVE("BOOK_DRIVE"),

  ENTER_OFFICIAL_ACCOUNTS("ENTER_OFFICIAL_ACCOUNTS"),

  PLAY_NOW("PLAY_NOW"),

  OPEN_MINI_GAME("OPEN_MINI_GAME"),

  DOWNLOAD_APP("DOWNLOAD_APP"),

  DOWNLOAD_GAME("DOWNLOAD_GAME"),

  GET_SAMPLES("GET_SAMPLES"),

  GET_IT_NOW("GET_IT_NOW"),

  BUY_ASAP("BUY_ASAP"),

  DOWNLOAD_NOW("DOWNLOAD_NOW"),

  VIEW_APPS("VIEW_APPS"),

  MORE_INFO("MORE_INFO"),

  GET_VOUCHERS("GET_VOUCHERS"),

  FOLLOW_OFFICIAL_ACCOUNT("FOLLOW_OFFICIAL_ACCOUNT"),

  READ_NOVELS("READ_NOVELS"),

  GO_TO_JD("GO_TO_JD"),

  GO_TO_PDD("GO_TO_PDD"),

  GO_TO_SUNING("GO_TO_SUNING"),

  GO_TO_VIP("GO_TO_VIP"),

  GO_TO_XIAOHONGSHU("GO_TO_XIAOHONGSHU"),

  GO_TO_KUAISHOU("GO_TO_KUAISHOU"),

  WATCH_LIVE("WATCH_LIVE"),

  RESERVE_NOW("RESERVE_NOW"),

  OPEN_APP("OPEN_APP"),

  ALREADY_INSTALL("ALREADY_INSTALL"),

  RESERVE_LIVE("RESERVE_LIVE");

  private String value;

  LinkNameTypeMP(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LinkNameTypeMP fromValue(String text) {
    for (LinkNameTypeMP b : LinkNameTypeMP.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LinkNameTypeMP> {
    @Override
    public void write(final JsonWriter jsonWriter, final LinkNameTypeMP enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LinkNameTypeMP read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LinkNameTypeMP.fromValue(String.valueOf(value));
    }
  }
}
