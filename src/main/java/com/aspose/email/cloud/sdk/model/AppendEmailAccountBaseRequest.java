/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AppendEmailAccountBaseRequest.java">
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
 * Append email to account request             
 */
public class AppendEmailAccountBaseRequest extends AccountBaseRequest {
  @JsonProperty("folder")
  private String folder = null;

  @JsonProperty("markAsSent")
  private Boolean markAsSent = null;

  /**
   * Set folder and return this.
   * @param folder Email account folder to store a message             
   * @return this
  **/
  public AppendEmailAccountBaseRequest folder(String folder) {
    this.folder = folder;
    return this;
  }

  /**
   * Email account folder to store a message             
   * @return folder
  **/
  public String getFolder() {
    return folder;
  }  

  /**
   * Set folder.
   * @param folder Email account folder to store a message             
  **/
  public void setFolder(String folder) {
    this.folder = folder;
  }

  /**
   * Set markAsSent and return this.
   * @param markAsSent Mark message as sent             
   * @return this
  **/
  public AppendEmailAccountBaseRequest markAsSent(Boolean markAsSent) {
    this.markAsSent = markAsSent;
    return this;
  }

  /**
   * Mark message as sent             
   * @return markAsSent
  **/
  public Boolean isMarkAsSent() {
    return markAsSent;
  }  

  /**
   * Set markAsSent.
   * @param markAsSent Mark message as sent             
  **/
  public void setMarkAsSent(Boolean markAsSent) {
    this.markAsSent = markAsSent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AppendEmailAccountBaseRequest appendEmailAccountBaseRequest = (AppendEmailAccountBaseRequest) o;
    return ObjectUtils.equals(this.folder, appendEmailAccountBaseRequest.folder) &&
    ObjectUtils.equals(this.markAsSent, appendEmailAccountBaseRequest.markAsSent) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(folder, markAsSent, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppendEmailAccountBaseRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    firstAccount: ").append(toIndentedString(getFirstAccount())).append("\n");
    sb.append("    secondAccount: ").append(toIndentedString(getSecondAccount())).append("\n");
    sb.append("    storageFolder: ").append(toIndentedString(getStorageFolder())).append("\n");
    sb.append("    folder: ").append(toIndentedString(getFolder())).append("\n");
    sb.append("    markAsSent: ").append(toIndentedString(isMarkAsSent())).append("\n");
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

  public AppendEmailAccountBaseRequest() {
    super();
  }

  /**
   * Initializes a new instance of the AppendEmailAccountBaseRequest
   * @param firstAccount First account storage file name             
   * @param secondAccount Additional email account (for example, FirstAccount could be IMAP, and second one could be SMTP)             
   * @param storageFolder Storage folder location of account files             
   * @param folder Email account folder to store a message             
   * @param markAsSent Mark message as sent             
   */
  public AppendEmailAccountBaseRequest(String firstAccount, String secondAccount, StorageFolderLocation storageFolder, String folder, Boolean markAsSent) {
    super();
    setFirstAccount(firstAccount);
    setSecondAccount(secondAccount);
    setStorageFolder(storageFolder);
    setFolder(folder);
    setMarkAsSent(markAsSent);
  }

}

