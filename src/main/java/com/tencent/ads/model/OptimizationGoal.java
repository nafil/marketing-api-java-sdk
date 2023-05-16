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

/** 广告优化目标类型 */
@JsonAdapter(OptimizationGoal.Adapter.class)
public enum OptimizationGoal {
  NONE("OPTIMIZATIONGOAL_NONE"),

  BRAND_CONVERSION("OPTIMIZATIONGOAL_BRAND_CONVERSION"),

  FOLLOW("OPTIMIZATIONGOAL_FOLLOW"),

  CLICK("OPTIMIZATIONGOAL_CLICK"),

  IMPRESSION("OPTIMIZATIONGOAL_IMPRESSION"),

  APP_DOWNLOAD("OPTIMIZATIONGOAL_APP_DOWNLOAD"),

  APP_ACTIVATE("OPTIMIZATIONGOAL_APP_ACTIVATE"),

  APP_REGISTER("OPTIMIZATIONGOAL_APP_REGISTER"),

  ONE_DAY_RETENTION("OPTIMIZATIONGOAL_ONE_DAY_RETENTION"),

  APP_PURCHASE("OPTIMIZATIONGOAL_APP_PURCHASE"),

  ECOMMERCE_ORDER("OPTIMIZATIONGOAL_ECOMMERCE_ORDER"),

  ECOMMERCE_CHECKOUT("OPTIMIZATIONGOAL_ECOMMERCE_CHECKOUT"),

  LEADS("OPTIMIZATIONGOAL_LEADS"),

  ECOMMERCE_CART("OPTIMIZATIONGOAL_ECOMMERCE_CART"),

  PROMOTION_CLICK_KEY_PAGE("OPTIMIZATIONGOAL_PROMOTION_CLICK_KEY_PAGE"),

  VIEW_COMMODITY_PAGE("OPTIMIZATIONGOAL_VIEW_COMMODITY_PAGE"),

  ONLINE_CONSULTATION("OPTIMIZATIONGOAL_ONLINE_CONSULTATION"),

  TELEPHONE_CONSULTATION("OPTIMIZATIONGOAL_TELEPHONE_CONSULTATION"),

  PAGE_RESERVATION("OPTIMIZATIONGOAL_PAGE_RESERVATION"),

  DELIVERY("OPTIMIZATIONGOAL_DELIVERY"),

  MESSAGE_AFTER_FOLLOW("OPTIMIZATIONGOAL_MESSAGE_AFTER_FOLLOW"),

  CLICK_MENU_AFTER_FOLLOW("OPTIMIZATIONGOAL_CLICK_MENU_AFTER_FOLLOW"),

  PAGE_EFFECTIVE_ONLINE_CONSULT("OPTIMIZATIONGOAL_PAGE_EFFECTIVE_ONLINE_CONSULT"),

  CLICK_KEY_PAGE("OPTIMIZATIONGOAL_CLICK_KEY_PAGE"),

  MOBILE_APP_START("OPTIMIZATIONGOAL_MOBILE_APP_START"),

  PAGE_DELIVER("OPTIMIZATIONGOAL_PAGE_DELIVER"),

  PAGE_MAKE_PHONE_CALL("OPTIMIZATIONGOAL_PAGE_MAKE_PHONE_CALL"),

  PAGE_ONLINE_CONSULT("OPTIMIZATIONGOAL_PAGE_ONLINE_CONSULT"),

  MOBILE_APP_CHECKOUT("OPTIMIZATIONGOAL_MOBILE_APP_CHECKOUT"),

  APP_INSTALL("OPTIMIZATIONGOAL_APP_INSTALL"),

  PAGE_EFFECTIVE_PHONE_CALL("OPTIMIZATIONGOAL_PAGE_EFFECTIVE_PHONE_CALL"),

  CONFIRM_EFFECTIVE_LEADS_CONSULT("OPTIMIZATIONGOAL_CONFIRM_EFFECTIVE_LEADS_CONSULT"),

  CONFIRM_EFFECTIVE_LEADS_PHONE("OPTIMIZATIONGOAL_CONFIRM_EFFECTIVE_LEADS_PHONE"),

  LEADS_COLLECT("OPTIMIZATIONGOAL_LEADS_COLLECT"),

  FIRST_PURCHASE("OPTIMIZATIONGOAL_FIRST_PURCHASE"),

  APPLY("OPTIMIZATIONGOAL_APPLY"),

  PRE_CREDIT("OPTIMIZATIONGOAL_PRE_CREDIT"),

  CREDIT("OPTIMIZATIONGOAL_CREDIT"),

  WITHDRAW_DEPOSITS("OPTIMIZATIONGOAL_WITHDRAW_DEPOSITS"),

  PROMOTION_VIEW_KEY_PAGE("OPTIMIZATIONGOAL_PROMOTION_VIEW_KEY_PAGE"),

  MOBILE_APP_CREATE_ROLE("OPTIMIZATIONGOAL_MOBILE_APP_CREATE_ROLE"),

  CANVAS_CLICK("OPTIMIZATIONGOAL_CANVAS_CLICK"),

  PROMOTION_CLAIM_OFFER("OPTIMIZATIONGOAL_PROMOTION_CLAIM_OFFER"),

  ECOMMERCE_ADD_TO_WISHLIST("OPTIMIZATIONGOAL_ECOMMERCE_ADD_TO_WISHLIST"),

  CONFIRM_EFFECTIVE_LEADS_RESERVATION("OPTIMIZATIONGOAL_CONFIRM_EFFECTIVE_LEADS_RESERVATION"),

  PAGE_RECEIPT("OPTIMIZATIONGOAL_PAGE_RECEIPT"),

  PAGE_SCAN_CODE("OPTIMIZATIONGOAL_PAGE_SCAN_CODE"),

  SELECT_COURSE("OPTIMIZATIONGOAL_SELECT_COURSE"),

  CONFIRM_POTENTIAL_CUSTOMER_PHONE("OPTIMIZATIONGOAL_CONFIRM_POTENTIAL_CUSTOMER_PHONE"),

  MOBILE_APP_AD_INCOME("OPTIMIZATIONGOAL_MOBILE_APP_AD_INCOME"),

  MOBILE_APP_ACCREDIT("OPTIMIZATIONGOAL_MOBILE_APP_ACCREDIT"),

  PURCHASE_MEMBER_CARD("OPTIMIZATIONGOAL_PURCHASE_MEMBER_CARD"),

  PAGE_CONFIRM_EFFECTIVE_LEADS("OPTIMIZATIONGOAL_PAGE_CONFIRM_EFFECTIVE_LEADS"),

  ADD_DESKTOP("OPTIMIZATIONGOAL_ADD_DESKTOP"),

  RESERVATION("OPTIMIZATIONGOAL_RESERVATION"),

  FIRST_ECOMMERCE_ORDER("OPTIMIZATIONGOAL_FIRST_ECOMMERCE_ORDER"),

  FIRST_TWENTY_FOUR_HOUR_ECOMMERCE_ORDER("OPTIMIZATIONGOAL_FIRST_TWENTY_FOUR_HOUR_ECOMMERCE_ORDER"),

  ECOMMERCE_SCANCODE_WX("OPTIMIZATIONGOAL_ECOMMERCE_SCANCODE_WX"),

  CLASS_PARTICIPATED("OPTIMIZATIONGOAL_CLASS_PARTICIPATED"),

  INSURANCE_PURCHASE("OPTIMIZATIONGOAL_INSURANCE_PURCHASE"),

  MOBILE_APP_SEVEN_DAYS_RETENTION("OPTIMIZATIONGOAL_MOBILE_APP_SEVEN_DAYS_RETENTION"),

  LIKE("OPTIMIZATIONGOAL_LIKE"),

  EXTERNAL_LINK_CLICK("OPTIMIZATIONGOAL_EXTERNAL_LINK_CLICK"),

  BUY_COUPONS("OPTIMIZATIONGOAL_BUY_COUPONS"),

  LEAVE_INFORMATION("OPTIMIZATIONGOAL_LEAVE_INFORMATION"),

  CORE_ACTION("OPTIMIZATIONGOAL_CORE_ACTION"),

  ONE_DAY_RETENTION_RATIO("OPTIMIZATIONGOAL_ONE_DAY_RETENTION_RATIO"),

  PROMOTION_READ_ARTICLE("OPTIMIZATIONGOAL_PROMOTION_READ_ARTICLE"),

  RESERVATION_CHECK("OPTIMIZATIONGOAL_RESERVATION_CHECK"),

  OPEN_ACCOUNT("OPTIMIZATIONGOAL_OPEN_ACCOUNT"),

  SEVEN_DAY_ECOMMERCE_ORDER("OPTIMIZATIONGOAL_SEVEN_DAY_ECOMMERCE_ORDER"),

  ADD_WECHAT("OPTIMIZATIONGOAL_ADD_WECHAT"),

  WECOM_CONSULT("OPTIMIZATIONGOAL_WECOM_CONSULT"),

  ADD_GROUP("OPTIMIZATIONGOAL_ADD_GROUP"),

  QUICK_ORDER("OPTIMIZATIONGOAL_QUICK_ORDER"),

  PRE_PAY("OPTIMIZATIONGOAL_PRE_PAY"),

  PAGE_ONLINE_CONSULT_ACTIVE_ONE_MSG("OPTIMIZATIONGOAL_PAGE_ONLINE_CONSULT_ACTIVE_ONE_MSG"),

  CALL_DURATION_THIRTY_SECONDS("OPTIMIZATIONGOAL_CALL_DURATION_THIRTY_SECONDS"),

  CLAIM_COURSE("OPTIMIZATIONGOAL_CLAIM_COURSE"),

  QUIT_GROUP("OPTIMIZATIONGOAL_QUIT_GROUP"),

  VIEW_ACQUISITION_CONTENT("OPTIMIZATIONGOAL_VIEW_ACQUISITION_CONTENT"),

  BACK_FLOW("OPTIMIZATIONGOAL_BACK_FLOW"),

  PAGE_ONLINE_CONSULT_THREE_MSG("OPTIMIZATIONGOAL_PAGE_ONLINE_CONSULT_THREE_MSG"),

  RENEWAL("OPTIMIZATIONGOAL_RENEWAL"),

  LOW_PRICE_COURSE("OPTIMIZATIONGOAL_LOW_PRICE_COURSE"),

  CONSULT_INTENTION("OPTIMIZATIONGOAL_CONSULT_INTENTION");

  private String value;

  OptimizationGoal(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OptimizationGoal fromValue(String text) {
    for (OptimizationGoal b : OptimizationGoal.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<OptimizationGoal> {
    @Override
    public void write(final JsonWriter jsonWriter, final OptimizationGoal enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OptimizationGoal read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OptimizationGoal.fromValue(String.valueOf(value));
    }
  }
}
