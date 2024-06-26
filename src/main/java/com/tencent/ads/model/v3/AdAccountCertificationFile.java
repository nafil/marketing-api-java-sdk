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
import java.util.Objects;

/** 资质文件 */
@ApiModel(description = "资质文件")
public class AdAccountCertificationFile {
  @SerializedName("certification_file_id")
  private String certificationFileId = null;

  @SerializedName("certification_file_name")
  private String certificationFileName = null;

  @SerializedName("certification_file")
  private String certificationFile = null;

  public AdAccountCertificationFile certificationFileId(String certificationFileId) {
    this.certificationFileId = certificationFileId;
    return this;
  }

  /**
   * Get certificationFileId
   *
   * @return certificationFileId
   */
  @ApiModelProperty(value = "")
  public String getCertificationFileId() {
    return certificationFileId;
  }

  public void setCertificationFileId(String certificationFileId) {
    this.certificationFileId = certificationFileId;
  }

  public AdAccountCertificationFile certificationFileName(String certificationFileName) {
    this.certificationFileName = certificationFileName;
    return this;
  }

  /**
   * Get certificationFileName
   *
   * @return certificationFileName
   */
  @ApiModelProperty(value = "")
  public String getCertificationFileName() {
    return certificationFileName;
  }

  public void setCertificationFileName(String certificationFileName) {
    this.certificationFileName = certificationFileName;
  }

  public AdAccountCertificationFile certificationFile(String certificationFile) {
    this.certificationFile = certificationFile;
    return this;
  }

  /**
   * Get certificationFile
   *
   * @return certificationFile
   */
  @ApiModelProperty(value = "")
  public String getCertificationFile() {
    return certificationFile;
  }

  public void setCertificationFile(String certificationFile) {
    this.certificationFile = certificationFile;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdAccountCertificationFile adAccountCertificationFile = (AdAccountCertificationFile) o;
    return Objects.equals(this.certificationFileId, adAccountCertificationFile.certificationFileId)
        && Objects.equals(
            this.certificationFileName, adAccountCertificationFile.certificationFileName)
        && Objects.equals(this.certificationFile, adAccountCertificationFile.certificationFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificationFileId, certificationFileName, certificationFile);
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
