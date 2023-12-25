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

/** 操作层级 */
@JsonAdapter(ResourceType.Adapter.class)
public enum ResourceType {
  RESOURCE_TYPE_ADGROUP("RESOURCE_TYPE_ADGROUP");

  private String value;

  ResourceType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ResourceType fromValue(String text) {
    for (ResourceType b : ResourceType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ResourceType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ResourceType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ResourceType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ResourceType.fromValue(String.valueOf(value));
    }
  }
}
