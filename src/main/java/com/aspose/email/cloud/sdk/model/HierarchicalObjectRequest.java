/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="HierarchicalObjectRequest.java">
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
 * Object represented as hierarchical properties request             
 */
public class HierarchicalObjectRequest {
  @JsonProperty("hierarchicalObject")
  private HierarchicalObject hierarchicalObject = null;

  @JsonProperty("storageFolder")
  private StorageFolderLocation storageFolder = null;

  /**
   * Set hierarchicalObject and return this.
   * @param hierarchicalObject Hierarchical properties of document             
   * @return this
  **/
  public HierarchicalObjectRequest hierarchicalObject(HierarchicalObject hierarchicalObject) {
    this.hierarchicalObject = hierarchicalObject;
    return this;
  }

  /**
   * Hierarchical properties of document             
   * @return hierarchicalObject
  **/
  public HierarchicalObject getHierarchicalObject() {
    return hierarchicalObject;
  }  

  /**
   * Set hierarchicalObject.
   * @param hierarchicalObject Hierarchical properties of document             
  **/
  public void setHierarchicalObject(HierarchicalObject hierarchicalObject) {
    this.hierarchicalObject = hierarchicalObject;
  }

  /**
   * Set storageFolder and return this.
   * @param storageFolder Document location in storage             
   * @return this
  **/
  public HierarchicalObjectRequest storageFolder(StorageFolderLocation storageFolder) {
    this.storageFolder = storageFolder;
    return this;
  }

  /**
   * Document location in storage             
   * @return storageFolder
  **/
  public StorageFolderLocation getStorageFolder() {
    return storageFolder;
  }  

  /**
   * Set storageFolder.
   * @param storageFolder Document location in storage             
  **/
  public void setStorageFolder(StorageFolderLocation storageFolder) {
    this.storageFolder = storageFolder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    HierarchicalObjectRequest hierarchicalObjectRequest = (HierarchicalObjectRequest) o;
    return ObjectUtils.equals(this.hierarchicalObject, hierarchicalObjectRequest.hierarchicalObject) &&
    ObjectUtils.equals(this.storageFolder, hierarchicalObjectRequest.storageFolder);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(hierarchicalObject, storageFolder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HierarchicalObjectRequest {\n");
    
    sb.append("    hierarchicalObject: ").append(toIndentedString(getHierarchicalObject())).append("\n");
    sb.append("    storageFolder: ").append(toIndentedString(getStorageFolder())).append("\n");
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

  public HierarchicalObjectRequest() {
    super();
  }

  /**
   * Initializes a new instance of the HierarchicalObjectRequest
   * @param hierarchicalObject Hierarchical properties of document             
   * @param storageFolder Document location in storage             
   */
  public HierarchicalObjectRequest(HierarchicalObject hierarchicalObject, StorageFolderLocation storageFolder) {
    super();
    setHierarchicalObject(hierarchicalObject);
    setStorageFolder(storageFolder);
  }

}

