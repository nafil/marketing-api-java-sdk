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

/** 图片素材衍生开关类型 */
@JsonAdapter(AdvertiserPicMaterialSwitch.Adapter.class)
public enum AdvertiserPicMaterialSwitch {
  CLOSE("ADVERTISER_PIC_MATERIAL_SWITCH_CLOSE"),

  OPEN("ADVERTISER_PIC_MATERIAL_SWITCH_OPEN");

  private String value;

  AdvertiserPicMaterialSwitch(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdvertiserPicMaterialSwitch fromValue(String text) {
    for (AdvertiserPicMaterialSwitch b : AdvertiserPicMaterialSwitch.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdvertiserPicMaterialSwitch> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdvertiserPicMaterialSwitch enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdvertiserPicMaterialSwitch read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdvertiserPicMaterialSwitch.fromValue(String.valueOf(value));
    }
  }
}
