/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ClientMessageAppendRequest.java">
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
 * Email client append message request.             
 */
public class ClientMessageAppendRequest extends ClientAccountBaseRequest {
  @JsonProperty("folder")
  private String folder = null;
  @JsonProperty("message")
  private MailMessageBase message = null;
  @JsonProperty("markAsSent")
  private Boolean markAsSent = null;

  /**
   * Set folder and return this.
   * @param folder Path to folder on email server to append message to.             
   * @return this
  **/
  public ClientMessageAppendRequest folder(String folder) {
    this.folder = folder;
    return this;
  }

  /**
   * Path to folder on email server to append message to.             
   * @return folder
  **/
  public String getFolder() {
    return folder;
  }  

  /**
   * Set folder.
   * @param folder Path to folder on email server to append message to.             
  **/
  public void setFolder(String folder) {
    this.folder = folder;
  }


  /**
   * Set message and return this.
   * @param message Message to append.             
   * @return this
  **/
  public ClientMessageAppendRequest message(MailMessageBase message) {
    this.message = message;
    return this;
  }

  /**
   * Message to append.             
   * @return message
  **/
  public MailMessageBase getMessage() {
    return message;
  }  

  /**
   * Set message.
   * @param message Message to append.             
  **/
  public void setMessage(MailMessageBase message) {
    this.message = message;
  }


  /**
   * Set markAsSent and return this.
   * @param markAsSent Determines that appended message should be market as sent or not.             
   * @return this
  **/
  public ClientMessageAppendRequest markAsSent(Boolean markAsSent) {
    this.markAsSent = markAsSent;
    return this;
  }

  /**
   * Determines that appended message should be market as sent or not.             
   * @return markAsSent
  **/
  public Boolean isMarkAsSent() {
    return markAsSent;
  }  

  /**
   * Set markAsSent.
   * @param markAsSent Determines that appended message should be market as sent or not.             
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
    ClientMessageAppendRequest clientMessageAppendRequest = (ClientMessageAppendRequest) o;
    return ObjectUtils.equals(this.folder, clientMessageAppendRequest.folder) &&
    ObjectUtils.equals(this.message, clientMessageAppendRequest.message) &&
    ObjectUtils.equals(this.markAsSent, clientMessageAppendRequest.markAsSent) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(folder, message, markAsSent, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientMessageAppendRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accountLocation: ").append(toIndentedString(getAccountLocation())).append("\n");
    sb.append("    folder: ").append(toIndentedString(getFolder())).append("\n");
    sb.append("    message: ").append(toIndentedString(getMessage())).append("\n");
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

  public ClientMessageAppendRequest() {
    super();
  }

  /**
   * Initializes a new instance of the ClientMessageAppendRequest
   * @param accountLocation Email client account configuration location on storage.             
   * @param folder Path to folder on email server to append message to.             
   * @param message Message to append.             
   * @param markAsSent Determines that appended message should be market as sent or not.             
   */
  public ClientMessageAppendRequest(
    StorageFileLocation accountLocation,
    String folder,
    MailMessageBase message,
    Boolean markAsSent
  ) {
    super();
    setAccountLocation(accountLocation);
    setFolder(folder);
    setMessage(message);
    setMarkAsSent(markAsSent);
  }

}

