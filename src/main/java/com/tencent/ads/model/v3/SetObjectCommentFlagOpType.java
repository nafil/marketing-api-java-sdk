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

/** 设置视频号评论管理操作类型 */
@JsonAdapter(SetObjectCommentFlagOpType.Adapter.class)
public enum SetObjectCommentFlagOpType {
  UNKNOWN("SET_OBJECT_COMMENT_FLAG_OP_TYPE_UNKNOWN"),

  OPEN("SET_OBJECT_COMMENT_FLAG_OP_TYPE_OPEN"),

  CLOSE("SET_OBJECT_COMMENT_FLAG_OP_TYPE_CLOSE");

  private String value;

  SetObjectCommentFlagOpType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SetObjectCommentFlagOpType fromValue(String text) {
    for (SetObjectCommentFlagOpType b : SetObjectCommentFlagOpType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SetObjectCommentFlagOpType> {
    @Override
    public void write(final JsonWriter jsonWriter, final SetObjectCommentFlagOpType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SetObjectCommentFlagOpType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SetObjectCommentFlagOpType.fromValue(String.valueOf(value));
    }
  }
}