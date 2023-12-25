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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 授权给商务管家账号认领的账号的授权信息 */
@ApiModel(description = "授权给商务管家账号认领的账号的授权信息")
public class GrantToBusinessSpec {
  @SerializedName("grant_business_id")
  private Long grantBusinessId = null;

  @SerializedName("grant_scope_type")
  private AudienceGrantScopeType grantScopeType = null;

  @SerializedName("grant_business_permission")
  private GrantBusinessPermission grantBusinessPermission = null;

  @SerializedName("grant_account_permission")
  private List<AccountPermission> grantAccountPermission = null;

  public GrantToBusinessSpec grantBusinessId(Long grantBusinessId) {
    this.grantBusinessId = grantBusinessId;
    return this;
  }

  /**
   * Get grantBusinessId
   *
   * @return grantBusinessId
   */
  @ApiModelProperty(value = "")
  public Long getGrantBusinessId() {
    return grantBusinessId;
  }

  public void setGrantBusinessId(Long grantBusinessId) {
    this.grantBusinessId = grantBusinessId;
  }

  public GrantToBusinessSpec grantScopeType(AudienceGrantScopeType grantScopeType) {
    this.grantScopeType = grantScopeType;
    return this;
  }

  /**
   * Get grantScopeType
   *
   * @return grantScopeType
   */
  @ApiModelProperty(value = "")
  public AudienceGrantScopeType getGrantScopeType() {
    return grantScopeType;
  }

  public void setGrantScopeType(AudienceGrantScopeType grantScopeType) {
    this.grantScopeType = grantScopeType;
  }

  public GrantToBusinessSpec grantBusinessPermission(
      GrantBusinessPermission grantBusinessPermission) {
    this.grantBusinessPermission = grantBusinessPermission;
    return this;
  }

  /**
   * Get grantBusinessPermission
   *
   * @return grantBusinessPermission
   */
  @ApiModelProperty(value = "")
  public GrantBusinessPermission getGrantBusinessPermission() {
    return grantBusinessPermission;
  }

  public void setGrantBusinessPermission(GrantBusinessPermission grantBusinessPermission) {
    this.grantBusinessPermission = grantBusinessPermission;
  }

  public GrantToBusinessSpec grantAccountPermission(
      List<AccountPermission> grantAccountPermission) {
    this.grantAccountPermission = grantAccountPermission;
    return this;
  }

  public GrantToBusinessSpec addGrantAccountPermissionItem(
      AccountPermission grantAccountPermissionItem) {
    if (this.grantAccountPermission == null) {
      this.grantAccountPermission = new ArrayList<AccountPermission>();
    }
    this.grantAccountPermission.add(grantAccountPermissionItem);
    return this;
  }

  /**
   * Get grantAccountPermission
   *
   * @return grantAccountPermission
   */
  @ApiModelProperty(value = "")
  public List<AccountPermission> getGrantAccountPermission() {
    return grantAccountPermission;
  }

  public void setGrantAccountPermission(List<AccountPermission> grantAccountPermission) {
    this.grantAccountPermission = grantAccountPermission;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrantToBusinessSpec grantToBusinessSpec = (GrantToBusinessSpec) o;
    return Objects.equals(this.grantBusinessId, grantToBusinessSpec.grantBusinessId)
        && Objects.equals(this.grantScopeType, grantToBusinessSpec.grantScopeType)
        && Objects.equals(this.grantBusinessPermission, grantToBusinessSpec.grantBusinessPermission)
        && Objects.equals(this.grantAccountPermission, grantToBusinessSpec.grantAccountPermission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        grantBusinessId, grantScopeType, grantBusinessPermission, grantAccountPermission);
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
