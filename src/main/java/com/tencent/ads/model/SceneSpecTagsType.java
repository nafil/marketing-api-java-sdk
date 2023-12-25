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

/** 场景定向标签类型 */
@JsonAdapter(SceneSpecTagsType.Adapter.class)
public enum SceneSpecTagsType {
  WECHAT_POSITION("WECHAT_POSITION"),

  OFFICIAL_ACCOUNT_MEDIA_CATEGORY("OFFICIAL_ACCOUNT_MEDIA_CATEGORY"),

  MINI_PROGRAM_AND_MINI_GAME("MINI_PROGRAM_AND_MINI_GAME"),

  PAY_SCENE("PAY_SCENE"),

  MOBILE_UNION_CATEGORY("MOBILE_UNION_CATEGORY"),

  WECHAT_CHANNELS_SCENE("WECHAT_CHANNELS_SCENE");

  private String value;

  SceneSpecTagsType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SceneSpecTagsType fromValue(String text) {
    for (SceneSpecTagsType b : SceneSpecTagsType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SceneSpecTagsType> {
    @Override
    public void write(final JsonWriter jsonWriter, final SceneSpecTagsType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SceneSpecTagsType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SceneSpecTagsType.fromValue(String.valueOf(value));
    }
  }
}
