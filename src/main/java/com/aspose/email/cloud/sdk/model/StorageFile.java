/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="StorageFile.java">
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
 * StorageFile
 */
public class StorageFile {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("isFolder")
  private Boolean isFolder = null;

  @JsonProperty("modifiedDate")
  private Date modifiedDate = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("path")
  private String path = null;

  /**
   * Set name and return this.
   * @param name 
   * @return this
  **/
  public StorageFile name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }  

  /**
   * Set name.
   * @param name 
  **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Set isFolder and return this.
   * @param isFolder 
   * @return this
  **/
  public StorageFile isFolder(Boolean isFolder) {
    this.isFolder = isFolder;
    return this;
  }

  /**
   * Get isFolder
   * @return isFolder
  **/
  public Boolean isIsFolder() {
    return isFolder;
  }  

  /**
   * Set isFolder.
   * @param isFolder 
  **/
  public void setIsFolder(Boolean isFolder) {
    this.isFolder = isFolder;
  }

  /**
   * Set modifiedDate and return this.
   * @param modifiedDate 
   * @return this
  **/
  public StorageFile modifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

  /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  public Date getModifiedDate() {
    return modifiedDate;
  }  

  /**
   * Set modifiedDate.
   * @param modifiedDate 
  **/
  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  /**
   * Set size and return this.
   * @param size 
   * @return this
  **/
  public StorageFile size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  **/
  public Long getSize() {
    return size;
  }  

  /**
   * Set size.
   * @param size 
  **/
  public void setSize(Long size) {
    this.size = size;
  }

  /**
   * Set path and return this.
   * @param path 
   * @return this
  **/
  public StorageFile path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
  **/
  public String getPath() {
    return path;
  }  

  /**
   * Set path.
   * @param path 
  **/
  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    StorageFile storageFile = (StorageFile) o;
    return ObjectUtils.equals(this.name, storageFile.name) &&
    ObjectUtils.equals(this.isFolder, storageFile.isFolder) &&
    ObjectUtils.equals(this.modifiedDate, storageFile.modifiedDate) &&
    ObjectUtils.equals(this.size, storageFile.size) &&
    ObjectUtils.equals(this.path, storageFile.path);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(name, isFolder, modifiedDate, size, path);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageFile {\n");
    
    sb.append("    name: ").append(toIndentedString(getName())).append("\n");
    sb.append("    isFolder: ").append(toIndentedString(isIsFolder())).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(getModifiedDate())).append("\n");
    sb.append("    size: ").append(toIndentedString(getSize())).append("\n");
    sb.append("    path: ").append(toIndentedString(getPath())).append("\n");
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

  public StorageFile() {
    super();
  }

  /**
   * Initializes a new instance of the StorageFile
   * @param name 
   * @param isFolder 
   * @param modifiedDate 
   * @param size 
   * @param path 
   */
  public StorageFile(String name, Boolean isFolder, Date modifiedDate, Long size, String path) {
    super();
    setName(name);
    setIsFolder(isFolder);
    setModifiedDate(modifiedDate);
    setSize(size);
    setPath(path);
  }

}

