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

/** 蹊径落地页试玩类型 */
@JsonAdapter(PlayableType.Adapter.class)
public enum PlayableType {
  PLAYABLE_TYPE_DEFAULT("PLAYABLE_TYPE_DEFAULT"),

  PLAYABLE_TYPE_HOMEMADE_INTERACTION("PLAYABLE_TYPE_HOMEMADE_INTERACTION"),

  PLAYABLE_TYPE_MINIGAME_INTERACTION("PLAYABLE_TYPE_MINIGAME_INTERACTION"),

  PLAYABLE_TYPE_VIDEO_INTERACTION("PLAYABLE_TYPE_VIDEO_INTERACTION"),

  PLAYABLE_TYPE_WEBSITE_INTERACTION("PLAYABLE_TYPE_WEBSITE_INTERACTION"),

  PLAYABLE_TYPE_ZIP_INTERACTION("PLAYABLE_TYPE_ZIP_INTERACTION"),

  PLAYABLE_TYPE_COMPONENT_INTERACTION("PLAYABLE_TYPE_COMPONENT_INTERACTION"),

  NOT_INTERACT("NOT_INTERACT"),

  INLINE("INLINE"),

  TEMPLATE_GAME("TEMPLATE_GAME"),

  TEMPLATE_VIDEO("TEMPLATE_VIDEO"),

  TEMPLATE_WEB("TEMPLATE_WEB"),

  COMPRESSED_PACKAGE("COMPRESSED_PACKAGE");

  private String value;

  PlayableType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PlayableType fromValue(String text) {
    for (PlayableType b : PlayableType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PlayableType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PlayableType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PlayableType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PlayableType.fromValue(String.valueOf(value));
    }
  }
}
