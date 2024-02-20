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

/** ProgrammedAddRequest */
public class ProgrammedAddRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("adgroup_id")
  private Long adgroupId = null;

  @SerializedName("auto_derived_program_creative_switch")
  private Boolean autoDerivedProgramCreativeSwitch = null;

  @SerializedName("standard_switch")
  private Boolean standardSwitch = null;

  @SerializedName("create_material_groups")
  private List<MaterialGroupCreateStruct> createMaterialGroups = null;

  public ProgrammedAddRequest accountId(Long accountId) {
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

  public ProgrammedAddRequest adgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
    return this;
  }

  /**
   * Get adgroupId
   *
   * @return adgroupId
   */
  @ApiModelProperty(value = "")
  public Long getAdgroupId() {
    return adgroupId;
  }

  public void setAdgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
  }

  public ProgrammedAddRequest autoDerivedProgramCreativeSwitch(
      Boolean autoDerivedProgramCreativeSwitch) {
    this.autoDerivedProgramCreativeSwitch = autoDerivedProgramCreativeSwitch;
    return this;
  }

  /**
   * Get autoDerivedProgramCreativeSwitch
   *
   * @return autoDerivedProgramCreativeSwitch
   */
  @ApiModelProperty(value = "")
  public Boolean isAutoDerivedProgramCreativeSwitch() {
    return autoDerivedProgramCreativeSwitch;
  }

  public void setAutoDerivedProgramCreativeSwitch(Boolean autoDerivedProgramCreativeSwitch) {
    this.autoDerivedProgramCreativeSwitch = autoDerivedProgramCreativeSwitch;
  }

  public ProgrammedAddRequest standardSwitch(Boolean standardSwitch) {
    this.standardSwitch = standardSwitch;
    return this;
  }

  /**
   * Get standardSwitch
   *
   * @return standardSwitch
   */
  @ApiModelProperty(value = "")
  public Boolean isStandardSwitch() {
    return standardSwitch;
  }

  public void setStandardSwitch(Boolean standardSwitch) {
    this.standardSwitch = standardSwitch;
  }

  public ProgrammedAddRequest createMaterialGroups(
      List<MaterialGroupCreateStruct> createMaterialGroups) {
    this.createMaterialGroups = createMaterialGroups;
    return this;
  }

  public ProgrammedAddRequest addCreateMaterialGroupsItem(
      MaterialGroupCreateStruct createMaterialGroupsItem) {
    if (this.createMaterialGroups == null) {
      this.createMaterialGroups = new ArrayList<MaterialGroupCreateStruct>();
    }
    this.createMaterialGroups.add(createMaterialGroupsItem);
    return this;
  }

  /**
   * Get createMaterialGroups
   *
   * @return createMaterialGroups
   */
  @ApiModelProperty(value = "")
  public List<MaterialGroupCreateStruct> getCreateMaterialGroups() {
    return createMaterialGroups;
  }

  public void setCreateMaterialGroups(List<MaterialGroupCreateStruct> createMaterialGroups) {
    this.createMaterialGroups = createMaterialGroups;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgrammedAddRequest programmedAddRequest = (ProgrammedAddRequest) o;
    return Objects.equals(this.accountId, programmedAddRequest.accountId)
        && Objects.equals(this.adgroupId, programmedAddRequest.adgroupId)
        && Objects.equals(
            this.autoDerivedProgramCreativeSwitch,
            programmedAddRequest.autoDerivedProgramCreativeSwitch)
        && Objects.equals(this.standardSwitch, programmedAddRequest.standardSwitch)
        && Objects.equals(this.createMaterialGroups, programmedAddRequest.createMaterialGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        adgroupId,
        autoDerivedProgramCreativeSwitch,
        standardSwitch,
        createMaterialGroups);
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