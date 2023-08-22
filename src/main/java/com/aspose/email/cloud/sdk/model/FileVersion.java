/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="FileVersion.java">
*   Copyright (c) 2018-2023 Aspose Pty Ltd. All rights reserved.
* </copyright>
* <summary>
*   Permission is hereby granted, free of charge, to any person obtaining a copy
*  of this software and associated documentation files (the "Software"), to deal
*  in the Software without restriction, including without limitation the rights
*  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
*  copies of the Software, and to permit persons to whom the Software is
*  furnished to do so, subject to the following conditions:
* 
*  The above copyright notice and this permission notice shall be included in all
*  copies or substantial portions of the Software.
* 
*  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
*  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
*  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
*  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
*  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
*  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
*  SOFTWARE.
* </summary>
* --------------------------------------------------------------------------------------------------------------------
*/

package com.aspose.email.cloud.sdk.model;

import org.apache.commons.lang3.ObjectUtils;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.*;
import com.google.gson.*;
import com.google.gson.stream.*;
import java.io.*;

/**
 * File Version
 */
public class FileVersion extends StorageFile {
  @JsonProperty("versionId")
  private String versionId = null;
  @JsonProperty("isLatest")
  private Boolean isLatest = null;

  /**
   * Set versionId and return this.
   * @param versionId File Version ID.
   * @return this
  **/
  public FileVersion versionId(String versionId) {
    this.versionId = versionId;
    return this;
  }

  /**
   * File Version ID.
   * @return versionId
  **/
  public String getVersionId() {
    return versionId;
  }  

  /**
   * Set versionId.
   * @param versionId File Version ID.
  **/
  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }


  /**
   * Set isLatest and return this.
   * @param isLatest Specifies whether the file is (true) or is not (false) the latest version of an file.
   * @return this
  **/
  public FileVersion isLatest(Boolean isLatest) {
    this.isLatest = isLatest;
    return this;
  }

  /**
   * Specifies whether the file is (true) or is not (false) the latest version of an file.
   * @return isLatest
  **/
  public Boolean isIsLatest() {
    return isLatest;
  }  

  /**
   * Set isLatest.
   * @param isLatest Specifies whether the file is (true) or is not (false) the latest version of an file.
  **/
  public void setIsLatest(Boolean isLatest) {
    this.isLatest = isLatest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    FileVersion fileVersion = (FileVersion) o;
    return ObjectUtils.equals(this.versionId, fileVersion.versionId) &&
    ObjectUtils.equals(this.isLatest, fileVersion.isLatest) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(versionId, isLatest, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileVersion {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(getName())).append("\n");
    sb.append("    isFolder: ").append(toIndentedString(isIsFolder())).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(getModifiedDate())).append("\n");
    sb.append("    size: ").append(toIndentedString(getSize())).append("\n");
    sb.append("    path: ").append(toIndentedString(getPath())).append("\n");
    sb.append("    versionId: ").append(toIndentedString(getVersionId())).append("\n");
    sb.append("    isLatest: ").append(toIndentedString(isIsLatest())).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public FileVersion() {
    super();
  }

  /**
   * Initializes a new instance of the FileVersion
   * @param name File or folder name.
   * @param isFolder True if it is a folder.
   * @param modifiedDate File or folder last modified DateTime.
   * @param size File or folder size.
   * @param path File or folder path.
   * @param versionId File Version ID.
   * @param isLatest Specifies whether the file is (true) or is not (false) the latest version of an file.
   */
  public FileVersion(
    String name,
    Boolean isFolder,
    Date modifiedDate,
    Long size,
    String path,
    String versionId,
    Boolean isLatest
  ) {
    super();
    setName(name);
    setIsFolder(isFolder);
    setModifiedDate(modifiedDate);
    setSize(size);
    setPath(path);
    setVersionId(versionId);
    setIsLatest(isLatest);
  }

}

