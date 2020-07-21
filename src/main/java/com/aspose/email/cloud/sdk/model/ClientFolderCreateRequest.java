/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ClientFolderCreateRequest.java">
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
 * Email Client create folder request.             
 */
public class ClientFolderCreateRequest extends ClientAccountBaseRequest {
  @JsonProperty("parentFolder")
  private String parentFolder = null;

  @JsonProperty("folderName")
  private String folderName = null;

  /**
   * Set parentFolder and return this.
   * @param parentFolder Path to parent folder.             
   * @return this
  **/
  public ClientFolderCreateRequest parentFolder(String parentFolder) {
    this.parentFolder = parentFolder;
    return this;
  }

  /**
   * Path to parent folder.             
   * @return parentFolder
  **/
  public String getParentFolder() {
    return parentFolder;
  }  

  /**
   * Set parentFolder.
   * @param parentFolder Path to parent folder.             
  **/
  public void setParentFolder(String parentFolder) {
    this.parentFolder = parentFolder;
  }

  /**
   * Set folderName and return this.
   * @param folderName Folder name.             
   * @return this
  **/
  public ClientFolderCreateRequest folderName(String folderName) {
    this.folderName = folderName;
    return this;
  }

  /**
   * Folder name.             
   * @return folderName
  **/
  public String getFolderName() {
    return folderName;
  }  

  /**
   * Set folderName.
   * @param folderName Folder name.             
  **/
  public void setFolderName(String folderName) {
    this.folderName = folderName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    ClientFolderCreateRequest clientFolderCreateRequest = (ClientFolderCreateRequest) o;
    return ObjectUtils.equals(this.parentFolder, clientFolderCreateRequest.parentFolder) &&
    ObjectUtils.equals(this.folderName, clientFolderCreateRequest.folderName) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(parentFolder, folderName, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientFolderCreateRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accountLocation: ").append(toIndentedString(getAccountLocation())).append("\n");
    sb.append("    parentFolder: ").append(toIndentedString(getParentFolder())).append("\n");
    sb.append("    folderName: ").append(toIndentedString(getFolderName())).append("\n");
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

  public ClientFolderCreateRequest() {
    super();
  }

  /**
   * Initializes a new instance of the ClientFolderCreateRequest
   * @param accountLocation Email client account configuration location on storage.             
   * @param parentFolder Path to parent folder.             
   * @param folderName Folder name.             
   */
  public ClientFolderCreateRequest(StorageFileLocation accountLocation, String parentFolder, String folderName) {
    super();
    setAccountLocation(accountLocation);
    setParentFolder(parentFolder);
    setFolderName(folderName);
  }

}

