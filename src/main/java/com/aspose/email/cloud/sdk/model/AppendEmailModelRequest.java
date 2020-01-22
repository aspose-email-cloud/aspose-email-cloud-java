/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AppendEmailModelRequest.java">
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
 * Append email request             
 */
public class AppendEmailModelRequest extends AppendEmailAccountBaseRequest {
  @JsonProperty("message")
  private EmailDto message = null;

  public AppendEmailModelRequest message(EmailDto message) {
    this.message = message;
    return this;
  }

  /**
   * Email document             
   * @return message
  **/
  public EmailDto getMessage() {
    return message;
  }  

  public void setMessage(EmailDto message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AppendEmailModelRequest appendEmailModelRequest = (AppendEmailModelRequest) o;
    return ObjectUtils.equals(this.message, appendEmailModelRequest.message) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(message, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppendEmailModelRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    firstAccount: ").append(toIndentedString(getFirstAccount())).append("\n");
    sb.append("    secondAccount: ").append(toIndentedString(getSecondAccount())).append("\n");
    sb.append("    storageFolder: ").append(toIndentedString(getStorageFolder())).append("\n");
    sb.append("    folder: ").append(toIndentedString(getFolder())).append("\n");
    sb.append("    markAsSent: ").append(toIndentedString(isMarkAsSent())).append("\n");
    sb.append("    message: ").append(toIndentedString(getMessage())).append("\n");
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

  public AppendEmailModelRequest() {
    super();
  }

  /**
   * Initializes a new instance of the AppendEmailModelRequest
   * @param firstAccount First account storage file name for receiving emails (or universal one)             
   * @param secondAccount Second account storage file name for sending emails (ignored if first is universal)             
   * @param storageFolder Storage folder location of account files             
   * @param folder Email account folder to store a message             
   * @param markAsSent Mark message as sent             
   * @param message Email document             
   */
  public AppendEmailModelRequest(String firstAccount, String secondAccount, StorageFolderLocation storageFolder, String folder, Boolean markAsSent, EmailDto message) {
    super();
    setFirstAccount(firstAccount);
    setSecondAccount(secondAccount);
    setStorageFolder(storageFolder);
    setFolder(folder);
    setMarkAsSent(markAsSent);
    setMessage(message);
  }

}

