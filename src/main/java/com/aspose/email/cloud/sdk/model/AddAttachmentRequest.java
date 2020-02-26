/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AddAttachmentRequest.java">
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
 * Add attachment request             
 */
public class AddAttachmentRequest {
  @JsonProperty("documentFolder")
  private StorageFolderLocation documentFolder = null;

  @JsonProperty("attachmentFolder")
  private StorageFolderLocation attachmentFolder = null;

  /**
   * Set documentFolder and return this.
   * @param documentFolder Storage folder location of document             
   * @return this
  **/
  public AddAttachmentRequest documentFolder(StorageFolderLocation documentFolder) {
    this.documentFolder = documentFolder;
    return this;
  }

  /**
   * Storage folder location of document             
   * @return documentFolder
  **/
  public StorageFolderLocation getDocumentFolder() {
    return documentFolder;
  }  

  /**
   * Set documentFolder.
   * @param documentFolder Storage folder location of document             
  **/
  public void setDocumentFolder(StorageFolderLocation documentFolder) {
    this.documentFolder = documentFolder;
  }

  /**
   * Set attachmentFolder and return this.
   * @param attachmentFolder Storage folder location of an attachment             
   * @return this
  **/
  public AddAttachmentRequest attachmentFolder(StorageFolderLocation attachmentFolder) {
    this.attachmentFolder = attachmentFolder;
    return this;
  }

  /**
   * Storage folder location of an attachment             
   * @return attachmentFolder
  **/
  public StorageFolderLocation getAttachmentFolder() {
    return attachmentFolder;
  }  

  /**
   * Set attachmentFolder.
   * @param attachmentFolder Storage folder location of an attachment             
  **/
  public void setAttachmentFolder(StorageFolderLocation attachmentFolder) {
    this.attachmentFolder = attachmentFolder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AddAttachmentRequest addAttachmentRequest = (AddAttachmentRequest) o;
    return ObjectUtils.equals(this.documentFolder, addAttachmentRequest.documentFolder) &&
    ObjectUtils.equals(this.attachmentFolder, addAttachmentRequest.attachmentFolder);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(documentFolder, attachmentFolder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddAttachmentRequest {\n");
    
    sb.append("    documentFolder: ").append(toIndentedString(getDocumentFolder())).append("\n");
    sb.append("    attachmentFolder: ").append(toIndentedString(getAttachmentFolder())).append("\n");
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

  public AddAttachmentRequest() {
    super();
  }

  /**
   * Initializes a new instance of the AddAttachmentRequest
   * @param documentFolder Storage folder location of document             
   * @param attachmentFolder Storage folder location of an attachment             
   */
  public AddAttachmentRequest(StorageFolderLocation documentFolder, StorageFolderLocation attachmentFolder) {
    super();
    setDocumentFolder(documentFolder);
    setAttachmentFolder(attachmentFolder);
  }

}

