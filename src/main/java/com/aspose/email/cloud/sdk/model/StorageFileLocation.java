/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="StorageFileLocation.java">
*   Copyright (c) 2018-2020 Aspose Pty Ltd. All rights reserved.
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
 * A storage file location information             
 */
public class StorageFileLocation extends StorageFolderLocation {
  @JsonProperty("fileName")
  private String fileName = null;

  /**
   * Set fileName and return this.
   * @param fileName A file name in storage             
   * @return this
  **/
  public StorageFileLocation fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * A file name in storage             
   * @return fileName
  **/
  public String getFileName() {
    return fileName;
  }  

  /**
   * Set fileName.
   * @param fileName A file name in storage             
  **/
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    StorageFileLocation storageFileLocation = (StorageFileLocation) o;
    return ObjectUtils.equals(this.fileName, storageFileLocation.fileName) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(fileName, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageFileLocation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    storage: ").append(toIndentedString(getStorage())).append("\n");
    sb.append("    folderPath: ").append(toIndentedString(getFolderPath())).append("\n");
    sb.append("    fileName: ").append(toIndentedString(getFileName())).append("\n");
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

  public StorageFileLocation() {
    super();
  }

  /**
   * Initializes a new instance of the StorageFileLocation
   * @param storage A storage name             
   * @param folderPath A path to a folder in specified storage             
   * @param fileName A file name in storage             
   */
  public StorageFileLocation(
    String storage,
    String folderPath,
    String fileName
  ) {
    super();
    setStorage(storage);
    setFolderPath(folderPath);
    setFileName(fileName);
  }

}

