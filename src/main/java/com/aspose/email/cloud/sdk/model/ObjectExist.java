/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ObjectExist.java">
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
 * Object exists
 */
public class ObjectExist {
  @JsonProperty("exists")
  private Boolean exists = null;
  @JsonProperty("isFolder")
  private Boolean isFolder = null;

  /**
   * Set exists and return this.
   * @param exists Indicates that the file or folder exists.
   * @return this
  **/
  public ObjectExist exists(Boolean exists) {
    this.exists = exists;
    return this;
  }

  /**
   * Indicates that the file or folder exists.
   * @return exists
  **/
  public Boolean isExists() {
    return exists;
  }  

  /**
   * Set exists.
   * @param exists Indicates that the file or folder exists.
  **/
  public void setExists(Boolean exists) {
    this.exists = exists;
  }


  /**
   * Set isFolder and return this.
   * @param isFolder True if it is a folder, false if it is a file.
   * @return this
  **/
  public ObjectExist isFolder(Boolean isFolder) {
    this.isFolder = isFolder;
    return this;
  }

  /**
   * True if it is a folder, false if it is a file.
   * @return isFolder
  **/
  public Boolean isIsFolder() {
    return isFolder;
  }  

  /**
   * Set isFolder.
   * @param isFolder True if it is a folder, false if it is a file.
  **/
  public void setIsFolder(Boolean isFolder) {
    this.isFolder = isFolder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    ObjectExist objectExist = (ObjectExist) o;
    return ObjectUtils.equals(this.exists, objectExist.exists) &&
    ObjectUtils.equals(this.isFolder, objectExist.isFolder);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(exists, isFolder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectExist {\n");
    
    sb.append("    exists: ").append(toIndentedString(isExists())).append("\n");
    sb.append("    isFolder: ").append(toIndentedString(isIsFolder())).append("\n");
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

  public ObjectExist() {
    super();
  }

  /**
   * Initializes a new instance of the ObjectExist
   * @param exists Indicates that the file or folder exists.
   * @param isFolder True if it is a folder, false if it is a file.
   */
  public ObjectExist(
    Boolean exists,
    Boolean isFolder
  ) {
    super();
    setExists(exists);
    setIsFolder(isFolder);
  }

}

