/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ClientThreadMoveRequest.java">
*   Copyright (c) 2018-2023 Aspose Pty Ltd. All rights reserved.
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
 * Email client move thread request.             
 */
public class ClientThreadMoveRequest extends ClientThreadBaseRequest {
  @JsonProperty("destinationFolder")
  private String destinationFolder = null;
  @JsonProperty("sourceFolder")
  private String sourceFolder = null;

  /**
   * Set destinationFolder and return this.
   * @param destinationFolder Email account folder to move thread to.             
   * @return this
  **/
  public ClientThreadMoveRequest destinationFolder(String destinationFolder) {
    this.destinationFolder = destinationFolder;
    return this;
  }

  /**
   * Email account folder to move thread to.             
   * @return destinationFolder
  **/
  public String getDestinationFolder() {
    return destinationFolder;
  }  

  /**
   * Set destinationFolder.
   * @param destinationFolder Email account folder to move thread to.             
  **/
  public void setDestinationFolder(String destinationFolder) {
    this.destinationFolder = destinationFolder;
  }


  /**
   * Set sourceFolder and return this.
   * @param sourceFolder Email account folder to move thread from.             
   * @return this
  **/
  public ClientThreadMoveRequest sourceFolder(String sourceFolder) {
    this.sourceFolder = sourceFolder;
    return this;
  }

  /**
   * Email account folder to move thread from.             
   * @return sourceFolder
  **/
  public String getSourceFolder() {
    return sourceFolder;
  }  

  /**
   * Set sourceFolder.
   * @param sourceFolder Email account folder to move thread from.             
  **/
  public void setSourceFolder(String sourceFolder) {
    this.sourceFolder = sourceFolder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    ClientThreadMoveRequest clientThreadMoveRequest = (ClientThreadMoveRequest) o;
    return ObjectUtils.equals(this.destinationFolder, clientThreadMoveRequest.destinationFolder) &&
    ObjectUtils.equals(this.sourceFolder, clientThreadMoveRequest.sourceFolder) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(destinationFolder, sourceFolder, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientThreadMoveRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accountLocation: ").append(toIndentedString(getAccountLocation())).append("\n");
    sb.append("    threadId: ").append(toIndentedString(getThreadId())).append("\n");
    sb.append("    destinationFolder: ").append(toIndentedString(getDestinationFolder())).append("\n");
    sb.append("    sourceFolder: ").append(toIndentedString(getSourceFolder())).append("\n");
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

  public ClientThreadMoveRequest() {
    super();
  }

  /**
   * Initializes a new instance of the ClientThreadMoveRequest
   * @param accountLocation Email client account configuration location on storage.             
   * @param threadId Thread identifier.             
   * @param destinationFolder Email account folder to move thread to.             
   * @param sourceFolder Email account folder to move thread from.             
   */
  public ClientThreadMoveRequest(
    StorageFileLocation accountLocation,
    String threadId,
    String destinationFolder,
    String sourceFolder
  ) {
    super();
    setAccountLocation(accountLocation);
    setThreadId(threadId);
    setDestinationFolder(destinationFolder);
    setSourceFolder(sourceFolder);
  }

}

