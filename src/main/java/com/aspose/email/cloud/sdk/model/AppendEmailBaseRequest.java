/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AppendEmailBaseRequest.java">
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
 * Append email from storage file to account request             
 */
public class AppendEmailBaseRequest extends AppendEmailAccountBaseRequest {
  @JsonProperty("emailFile")
  private StorageFileLocation emailFile = null;

  /**
   * Set emailFile and return this.
   * @param emailFile Email document file location in storage             
   * @return this
  **/
  public AppendEmailBaseRequest emailFile(StorageFileLocation emailFile) {
    this.emailFile = emailFile;
    return this;
  }

  /**
   * Email document file location in storage             
   * @return emailFile
  **/
  public StorageFileLocation getEmailFile() {
    return emailFile;
  }  

  /**
   * Set emailFile.
   * @param emailFile Email document file location in storage             
  **/
  public void setEmailFile(StorageFileLocation emailFile) {
    this.emailFile = emailFile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AppendEmailBaseRequest appendEmailBaseRequest = (AppendEmailBaseRequest) o;
    return ObjectUtils.equals(this.emailFile, appendEmailBaseRequest.emailFile) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(emailFile, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppendEmailBaseRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    firstAccount: ").append(toIndentedString(getFirstAccount())).append("\n");
    sb.append("    secondAccount: ").append(toIndentedString(getSecondAccount())).append("\n");
    sb.append("    storageFolder: ").append(toIndentedString(getStorageFolder())).append("\n");
    sb.append("    folder: ").append(toIndentedString(getFolder())).append("\n");
    sb.append("    markAsSent: ").append(toIndentedString(isMarkAsSent())).append("\n");
    sb.append("    emailFile: ").append(toIndentedString(getEmailFile())).append("\n");
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

  public AppendEmailBaseRequest() {
    super();
  }

  /**
   * Initializes a new instance of the AppendEmailBaseRequest
   * @param firstAccount First account storage file name             
   * @param secondAccount Additional email account (for example, FirstAccount could be IMAP, and second one could be SMTP)             
   * @param storageFolder Storage folder location of account files             
   * @param folder Email account folder to store a message             
   * @param markAsSent Mark message as sent             
   * @param emailFile Email document file location in storage             
   */
  public AppendEmailBaseRequest(String firstAccount, String secondAccount, StorageFolderLocation storageFolder, String folder, Boolean markAsSent, StorageFileLocation emailFile) {
    super();
    setFirstAccount(firstAccount);
    setSecondAccount(secondAccount);
    setStorageFolder(storageFolder);
    setFolder(folder);
    setMarkAsSent(markAsSent);
    setEmailFile(emailFile);
  }

}

