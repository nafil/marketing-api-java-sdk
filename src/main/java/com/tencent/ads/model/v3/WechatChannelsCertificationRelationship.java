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

/** 视频号授权资质主体关系 */
@JsonAdapter(WechatChannelsCertificationRelationship.Adapter.class)
public enum WechatChannelsCertificationRelationship {
  UNKNOWN("RELATIONSHIP_UNKNOWN"),

  CORPORATION("RELATIONSHIP_CORPORATION"),

  EMPLOYMENT("RELATIONSHIP_EMPLOYMENT");

  private String value;

  WechatChannelsCertificationRelationship(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WechatChannelsCertificationRelationship fromValue(String text) {
    for (WechatChannelsCertificationRelationship b :
        WechatChannelsCertificationRelationship.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<WechatChannelsCertificationRelationship> {
    @Override
    public void write(
        final JsonWriter jsonWriter, final WechatChannelsCertificationRelationship enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WechatChannelsCertificationRelationship read(final JsonReader jsonReader)
        throws IOException {
      String value = jsonReader.nextString();
      return WechatChannelsCertificationRelationship.fromValue(String.valueOf(value));
    }
  }
}
