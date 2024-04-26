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

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** LocalStorePackagesUpdateRequest */
public class LocalStorePackagesUpdateRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("local_store_package_id")
  private Long localStorePackageId = null;

  @SerializedName("local_store_package_name")
  private String localStorePackageName = null;

  @SerializedName("local_store_list")
  private List<LocalStoreListStruct> localStoreList = null;

  public LocalStorePackagesUpdateRequest accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   *
   * @return accountId
   */
  @ApiModelProperty(value = "")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public LocalStorePackagesUpdateRequest localStorePackageId(Long localStorePackageId) {
    this.localStorePackageId = localStorePackageId;
    return this;
  }

  /**
   * Get localStorePackageId
   *
   * @return localStorePackageId
   */
  @ApiModelProperty(value = "")
  public Long getLocalStorePackageId() {
    return localStorePackageId;
  }

  public void setLocalStorePackageId(Long localStorePackageId) {
    this.localStorePackageId = localStorePackageId;
  }

  public LocalStorePackagesUpdateRequest localStorePackageName(String localStorePackageName) {
    this.localStorePackageName = localStorePackageName;
    return this;
  }

  /**
   * Get localStorePackageName
   *
   * @return localStorePackageName
   */
  @ApiModelProperty(value = "")
  public String getLocalStorePackageName() {
    return localStorePackageName;
  }

  public void setLocalStorePackageName(String localStorePackageName) {
    this.localStorePackageName = localStorePackageName;
  }

  public LocalStorePackagesUpdateRequest localStoreList(List<LocalStoreListStruct> localStoreList) {
    this.localStoreList = localStoreList;
    return this;
  }

  public LocalStorePackagesUpdateRequest addLocalStoreListItem(
      LocalStoreListStruct localStoreListItem) {
    if (this.localStoreList == null) {
      this.localStoreList = new ArrayList<LocalStoreListStruct>();
    }
    this.localStoreList.add(localStoreListItem);
    return this;
  }

  /**
   * Get localStoreList
   *
   * @return localStoreList
   */
  @ApiModelProperty(value = "")
  public List<LocalStoreListStruct> getLocalStoreList() {
    return localStoreList;
  }

  public void setLocalStoreList(List<LocalStoreListStruct> localStoreList) {
    this.localStoreList = localStoreList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalStorePackagesUpdateRequest localStorePackagesUpdateRequest =
        (LocalStorePackagesUpdateRequest) o;
    return Objects.equals(this.accountId, localStorePackagesUpdateRequest.accountId)
        && Objects.equals(
            this.localStorePackageId, localStorePackagesUpdateRequest.localStorePackageId)
        && Objects.equals(
            this.localStorePackageName, localStorePackagesUpdateRequest.localStorePackageName)
        && Objects.equals(this.localStoreList, localStorePackagesUpdateRequest.localStoreList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, localStorePackageId, localStorePackageName, localStoreList);
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
