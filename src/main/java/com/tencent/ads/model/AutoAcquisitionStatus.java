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

/**
 * 一键起量状态,&lt;br/&gt;一键起量状态表示当前广告在开启一键起量时，所处的不同起量阶段。一键起量状态与一键起量开关是两个独立的字段，一键起量开关为客户创建或更新时设置的开关，正常的广告在一键起量过程结束后，一键起量开关不会随一键起量状态改变。起量结束后，如果想再次开启一键起量，需要关闭一键起量开关后再次开启一键起量开关
 */
@JsonAdapter(AutoAcquisitionStatus.Adapter.class)
public enum AutoAcquisitionStatus {
  ACQUISTION_STATUS_UNKNOW("AUTO_ACQUISTION_STATUS_UNKNOW"),

  ACQUISTION_STATUS_PENDING("AUTO_ACQUISTION_STATUS_PENDING"),

  ACQUISTION_STATUS_END_LESS_THAN_24H("AUTO_ACQUISTION_STATUS_END_LESS_THAN_24H"),

  ACQUISTION_STATUS_END_MORE_THAN_24H("AUTO_ACQUISTION_STATUS_END_MORE_THAN_24H"),

  ACQUISTION_STATUS_COMPLETED("AUTO_ACQUISTION_STATUS_COMPLETED"),

  ACQUISTION_STATUS_SUSPEND_ON_LEARNING_FAIL("AUTO_ACQUISTION_STATUS_SUSPEND_ON_LEARNING_FAIL"),

  ACQUISTION_STATUS_SUSPEND_ON_PLAYING_FAIL("AUTO_ACQUISTION_STATUS_SUSPEND_ON_PLAYING_FAIL"),

  ACQUISTION_STATUS_ADVERTISER_CLOSED("AUTO_ACQUISTION_STATUS_ADVERTISER_CLOSED"),

  ACQUISITION_STATUS_PENDING("AUTO_ACQUISITION_STATUS_PENDING"),

  ACQUISITION_STATUS_COMPLETED("AUTO_ACQUISITION_STATUS_COMPLETED"),

  ACQUISITION_STATUS_SUSPEND_ON_PLAYING_FAIL_("AUTO_ACQUISITION_STATUS_SUSPEND_ON_PLAYING_FAIL "),

  ACQUISITION_STATUS_END_LESS_THAN_24H("AUTO_ACQUISITION_STATUS_END_LESS_THAN_24H"),

  ACQUISITION_STATUS_ADVERTISER_CLOSED("AUTO_ACQUISITION_STATUS_ADVERTISER_CLOSED");

  private String value;

  AutoAcquisitionStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AutoAcquisitionStatus fromValue(String text) {
    for (AutoAcquisitionStatus b : AutoAcquisitionStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AutoAcquisitionStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final AutoAcquisitionStatus enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AutoAcquisitionStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AutoAcquisitionStatus.fromValue(String.valueOf(value));
    }
  }
}
