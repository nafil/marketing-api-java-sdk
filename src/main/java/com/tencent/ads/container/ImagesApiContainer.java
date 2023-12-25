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

package com.tencent.ads.container;

import com.google.inject.Inject;
import com.tencent.ads.ApiContainer;
import com.tencent.ads.ApiException;
import com.tencent.ads.anno.*;
import com.tencent.ads.api.ImagesApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.FilteringStruct;
import com.tencent.ads.model.ImagesAddResponse;
import com.tencent.ads.model.ImagesAddResponseData;
import com.tencent.ads.model.ImagesDeleteRequest;
import com.tencent.ads.model.ImagesDeleteResponse;
import com.tencent.ads.model.ImagesDeleteResponseData;
import com.tencent.ads.model.ImagesGetResponse;
import com.tencent.ads.model.ImagesGetResponseData;
import com.tencent.ads.model.ImagesUpdateRequest;
import com.tencent.ads.model.ImagesUpdateResponse;
import com.tencent.ads.model.ImagesUpdateResponseData;
import java.io.File;
import java.util.List;

public class ImagesApiContainer extends ApiContainer {

  @Inject ImagesApi api;

  /**
   * 添加图片文件
   *
   * @param accountId (required)
   * @param uploadType (required)
   * @param signature (required)
   * @param file (optional)
   * @param bytes (optional)
   * @param imageUsage (optional)
   * @param description (optional)
   * @param resizeWidth (optional)
   * @param resizeHeight (optional)
   * @param resizeFileSize (optional)
   * @return ImagesAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ImagesAddResponseData imagesAdd(
      Long accountId,
      String uploadType,
      String signature,
      File file,
      String bytes,
      String imageUsage,
      String description,
      Long resizeWidth,
      Long resizeHeight,
      Long resizeFileSize,
      String... headerPair)
      throws ApiException, TencentAdsResponseException {
    ImagesAddResponse resp =
        api.imagesAdd(
            accountId,
            uploadType,
            signature,
            file,
            bytes,
            imageUsage,
            description,
            resizeWidth,
            resizeHeight,
            resizeFileSize,
            headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 删除图片
   *
   * @param data (required)
   * @return ImagesDeleteResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ImagesDeleteResponseData imagesDelete(ImagesDeleteRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    ImagesDeleteResponse resp = api.imagesDelete(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 获取图片信息
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ImagesGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ImagesGetResponseData imagesGet(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields,
      String... headerPair)
      throws ApiException, TencentAdsResponseException {
    ImagesGetResponse resp =
        api.imagesGet(accountId, filtering, page, pageSize, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 修改图片信息
   *
   * @param data (required)
   * @return ImagesUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ImagesUpdateResponseData imagesUpdate(ImagesUpdateRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    ImagesUpdateResponse resp = api.imagesUpdate(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
