/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="HierarchicalObjectResponse.java">
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
 * Document represented as hierarchical set of properties response             
 */
public class HierarchicalObjectResponse {
  @JsonProperty("hierarchicalObject")
  private HierarchicalObject hierarchicalObject = null;

  @JsonProperty("storageFile")
  private StorageFileLocation storageFile = null;

  public HierarchicalObjectResponse hierarchicalObject(HierarchicalObject hierarchicalObject) {
    this.hierarchicalObject = hierarchicalObject;
    return this;
  }

  /**
   * Document properties             
   * @return hierarchicalObject
  **/
  public HierarchicalObject getHierarchicalObject() {
    return hierarchicalObject;
  }  

  public void setHierarchicalObject(HierarchicalObject hierarchicalObject) {
    this.hierarchicalObject = hierarchicalObject;
  }

  public HierarchicalObjectResponse storageFile(StorageFileLocation storageFile) {
    this.storageFile = storageFile;
    return this;
  }

  /**
   * Document location in storage             
   * @return storageFile
  **/
  public StorageFileLocation getStorageFile() {
    return storageFile;
  }  

  public void setStorageFile(StorageFileLocation storageFile) {
    this.storageFile = storageFile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    HierarchicalObjectResponse hierarchicalObjectResponse = (HierarchicalObjectResponse) o;
    return ObjectUtils.equals(this.hierarchicalObject, hierarchicalObjectResponse.hierarchicalObject) &&
    ObjectUtils.equals(this.storageFile, hierarchicalObjectResponse.storageFile);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(hierarchicalObject, storageFile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HierarchicalObjectResponse {\n");
    
    sb.append("    hierarchicalObject: ").append(toIndentedString(hierarchicalObject)).append("\n");
    sb.append("    storageFile: ").append(toIndentedString(storageFile)).append("\n");
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

}

