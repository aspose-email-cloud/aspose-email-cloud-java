/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ClientMessageSetIsReadRequest.java">
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
 * Email client mark message is read/unread request.             
 */
public class ClientMessageSetIsReadRequest extends ClientMessageBaseRequest {
  @JsonProperty("isRead")
  private Boolean isRead = null;

  /**
   * Set isRead and return this.
   * @param isRead Message is read flag.             
   * @return this
  **/
  public ClientMessageSetIsReadRequest isRead(Boolean isRead) {
    this.isRead = isRead;
    return this;
  }

  /**
   * Message is read flag.             
   * @return isRead
  **/
  public Boolean isIsRead() {
    return isRead;
  }  

  /**
   * Set isRead.
   * @param isRead Message is read flag.             
  **/
  public void setIsRead(Boolean isRead) {
    this.isRead = isRead;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    ClientMessageSetIsReadRequest clientMessageSetIsReadRequest = (ClientMessageSetIsReadRequest) o;
    return ObjectUtils.equals(this.isRead, clientMessageSetIsReadRequest.isRead) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(isRead, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientMessageSetIsReadRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accountLocation: ").append(toIndentedString(getAccountLocation())).append("\n");
    sb.append("    messageId: ").append(toIndentedString(getMessageId())).append("\n");
    sb.append("    isRead: ").append(toIndentedString(isIsRead())).append("\n");
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

  public ClientMessageSetIsReadRequest() {
    super();
  }

  /**
   * Initializes a new instance of the ClientMessageSetIsReadRequest
   * @param accountLocation Email client account configuration location on storage.             
   * @param messageId Message identifier.             
   * @param isRead Message is read flag.             
   */
  public ClientMessageSetIsReadRequest(
    StorageFileLocation accountLocation,
    String messageId,
    Boolean isRead
  ) {
    super();
    setAccountLocation(accountLocation);
    setMessageId(messageId);
    setIsRead(isRead);
  }

}

