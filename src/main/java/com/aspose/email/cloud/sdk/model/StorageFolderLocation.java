/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="StorageFolderLocation.java">
*   Copyright (c) 2018-2019 Aspose Pty Ltd. All rights reserved.
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
 * A storage folder location information             
 */
public class StorageFolderLocation {
  @JsonProperty("storage")
  private String storage = null;

  @JsonProperty("folderPath")
  private String folderPath = null;

  /**
   * Set storage and return this.
   * @param storage A storage name             
   * @return this
  **/
  public StorageFolderLocation storage(String storage) {
    this.storage = storage;
    return this;
  }

  /**
   * A storage name             
   * @return storage
  **/
  public String getStorage() {
    return storage;
  }  

  /**
   * Set storage.
   * @param storage A storage name             
  **/
  public void setStorage(String storage) {
    this.storage = storage;
  }

  /**
   * Set folderPath and return this.
   * @param folderPath A path to a folder in specified storage             
   * @return this
  **/
  public StorageFolderLocation folderPath(String folderPath) {
    this.folderPath = folderPath;
    return this;
  }

  /**
   * A path to a folder in specified storage             
   * @return folderPath
  **/
  public String getFolderPath() {
    return folderPath;
  }  

  /**
   * Set folderPath.
   * @param folderPath A path to a folder in specified storage             
  **/
  public void setFolderPath(String folderPath) {
    this.folderPath = folderPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    StorageFolderLocation storageFolderLocation = (StorageFolderLocation) o;
    return ObjectUtils.equals(this.storage, storageFolderLocation.storage) &&
    ObjectUtils.equals(this.folderPath, storageFolderLocation.folderPath);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(storage, folderPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageFolderLocation {\n");
    
    sb.append("    storage: ").append(toIndentedString(getStorage())).append("\n");
    sb.append("    folderPath: ").append(toIndentedString(getFolderPath())).append("\n");
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

  public StorageFolderLocation() {
    super();
  }

  /**
   * Initializes a new instance of the StorageFolderLocation
   * @param storage A storage name             
   * @param folderPath A path to a folder in specified storage             
   */
  public StorageFolderLocation(String storage, String folderPath) {
    super();
    setStorage(storage);
    setFolderPath(folderPath);
  }

}

