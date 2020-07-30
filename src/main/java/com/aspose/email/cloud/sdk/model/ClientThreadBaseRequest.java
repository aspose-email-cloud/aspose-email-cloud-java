/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ClientThreadBaseRequest.java">
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
 * Email client thread request.             
 */
public class ClientThreadBaseRequest extends ClientAccountBaseRequest {
  @JsonProperty("threadId")
  private String threadId = null;

  /**
   * Set threadId and return this.
   * @param threadId Thread identifier.             
   * @return this
  **/
  public ClientThreadBaseRequest threadId(String threadId) {
    this.threadId = threadId;
    return this;
  }

  /**
   * Thread identifier.             
   * @return threadId
  **/
  public String getThreadId() {
    return threadId;
  }  

  /**
   * Set threadId.
   * @param threadId Thread identifier.             
  **/
  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    ClientThreadBaseRequest clientThreadBaseRequest = (ClientThreadBaseRequest) o;
    return ObjectUtils.equals(this.threadId, clientThreadBaseRequest.threadId) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(threadId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientThreadBaseRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accountLocation: ").append(toIndentedString(getAccountLocation())).append("\n");
    sb.append("    threadId: ").append(toIndentedString(getThreadId())).append("\n");
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

  public ClientThreadBaseRequest() {
    super();
  }

  /**
   * Initializes a new instance of the ClientThreadBaseRequest
   * @param accountLocation Email client account configuration location on storage.             
   * @param threadId Thread identifier.             
   */
  public ClientThreadBaseRequest(
    StorageFileLocation accountLocation,
    String threadId
  ) {
    super();
    setAccountLocation(accountLocation);
    setThreadId(threadId);
  }

}

