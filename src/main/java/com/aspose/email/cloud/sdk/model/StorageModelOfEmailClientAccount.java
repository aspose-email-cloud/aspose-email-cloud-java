/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="StorageModelOfEmailClientAccount.java">
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
 * StorageModelOfEmailClientAccount
 */
public class StorageModelOfEmailClientAccount {
  @JsonProperty("storageFile")
  private StorageFileLocation storageFile = null;

  @JsonProperty("value")
  private EmailClientAccount value = null;

  /**
   * Set storageFile and return this.
   * @param storageFile 
   * @return this
  **/
  public StorageModelOfEmailClientAccount storageFile(StorageFileLocation storageFile) {
    this.storageFile = storageFile;
    return this;
  }

  /**
   * Get storageFile
   * @return storageFile
  **/
  public StorageFileLocation getStorageFile() {
    return storageFile;
  }  

  /**
   * Set storageFile.
   * @param storageFile 
  **/
  public void setStorageFile(StorageFileLocation storageFile) {
    this.storageFile = storageFile;
  }

  /**
   * Set value and return this.
   * @param value 
   * @return this
  **/
  public StorageModelOfEmailClientAccount value(EmailClientAccount value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  public EmailClientAccount getValue() {
    return value;
  }  

  /**
   * Set value.
   * @param value 
  **/
  public void setValue(EmailClientAccount value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    StorageModelOfEmailClientAccount storageModelOfEmailClientAccount = (StorageModelOfEmailClientAccount) o;
    return ObjectUtils.equals(this.storageFile, storageModelOfEmailClientAccount.storageFile) &&
    ObjectUtils.equals(this.value, storageModelOfEmailClientAccount.value);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(storageFile, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageModelOfEmailClientAccount {\n");
    
    sb.append("    storageFile: ").append(toIndentedString(getStorageFile())).append("\n");
    sb.append("    value: ").append(toIndentedString(getValue())).append("\n");
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

  public StorageModelOfEmailClientAccount() {
    super();
  }

  /**
   * Initializes a new instance of the StorageModelOfEmailClientAccount
   * @param storageFile 
   * @param value 
   */
  public StorageModelOfEmailClientAccount(StorageFileLocation storageFile, EmailClientAccount value) {
    super();
    setStorageFile(storageFile);
    setValue(value);
  }

}

