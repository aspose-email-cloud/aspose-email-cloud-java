/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="SetEmailPropertyRequest.java">
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
 * Update email document property request             
 */
public class SetEmailPropertyRequest {
  @JsonProperty("emailProperty")
  private EmailProperty emailProperty = null;

  @JsonProperty("storageFolder")
  private StorageFolderLocation storageFolder = null;

  /**
   * Set emailProperty and return this.
   * @param emailProperty An email property that should be updated             
   * @return this
  **/
  public SetEmailPropertyRequest emailProperty(EmailProperty emailProperty) {
    this.emailProperty = emailProperty;
    return this;
  }

  /**
   * An email property that should be updated             
   * @return emailProperty
  **/
  public EmailProperty getEmailProperty() {
    return emailProperty;
  }  

  /**
   * Set emailProperty.
   * @param emailProperty An email property that should be updated             
  **/
  public void setEmailProperty(EmailProperty emailProperty) {
    this.emailProperty = emailProperty;
  }

  /**
   * Set storageFolder and return this.
   * @param storageFolder An email document location in storage             
   * @return this
  **/
  public SetEmailPropertyRequest storageFolder(StorageFolderLocation storageFolder) {
    this.storageFolder = storageFolder;
    return this;
  }

  /**
   * An email document location in storage             
   * @return storageFolder
  **/
  public StorageFolderLocation getStorageFolder() {
    return storageFolder;
  }  

  /**
   * Set storageFolder.
   * @param storageFolder An email document location in storage             
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
    SetEmailPropertyRequest setEmailPropertyRequest = (SetEmailPropertyRequest) o;
    return ObjectUtils.equals(this.emailProperty, setEmailPropertyRequest.emailProperty) &&
    ObjectUtils.equals(this.storageFolder, setEmailPropertyRequest.storageFolder);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(emailProperty, storageFolder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetEmailPropertyRequest {\n");
    
    sb.append("    emailProperty: ").append(toIndentedString(getEmailProperty())).append("\n");
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

  public SetEmailPropertyRequest() {
    super();
  }

  /**
   * Initializes a new instance of the SetEmailPropertyRequest
   * @param emailProperty An email property that should be updated             
   * @param storageFolder An email document location in storage             
   */
  public SetEmailPropertyRequest(EmailProperty emailProperty, StorageFolderLocation storageFolder) {
    super();
    setEmailProperty(emailProperty);
    setStorageFolder(storageFolder);
  }

}

