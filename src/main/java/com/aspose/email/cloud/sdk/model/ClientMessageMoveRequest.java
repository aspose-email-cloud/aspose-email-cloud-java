/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ClientMessageMoveRequest.java">
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
 * Email client move message request.             
 */
public class ClientMessageMoveRequest extends ClientMessageBaseRequest {
  @JsonProperty("sourceFolder")
  private String sourceFolder = null;
  @JsonProperty("destinationFolder")
  private String destinationFolder = null;

  /**
   * Set sourceFolder and return this.
   * @param sourceFolder Folder to move message from.             
   * @return this
  **/
  public ClientMessageMoveRequest sourceFolder(String sourceFolder) {
    this.sourceFolder = sourceFolder;
    return this;
  }

  /**
   * Folder to move message from.             
   * @return sourceFolder
  **/
  public String getSourceFolder() {
    return sourceFolder;
  }  

  /**
   * Set sourceFolder.
   * @param sourceFolder Folder to move message from.             
  **/
  public void setSourceFolder(String sourceFolder) {
    this.sourceFolder = sourceFolder;
  }


  /**
   * Set destinationFolder and return this.
   * @param destinationFolder Folder to move message to.             
   * @return this
  **/
  public ClientMessageMoveRequest destinationFolder(String destinationFolder) {
    this.destinationFolder = destinationFolder;
    return this;
  }

  /**
   * Folder to move message to.             
   * @return destinationFolder
  **/
  public String getDestinationFolder() {
    return destinationFolder;
  }  

  /**
   * Set destinationFolder.
   * @param destinationFolder Folder to move message to.             
  **/
  public void setDestinationFolder(String destinationFolder) {
    this.destinationFolder = destinationFolder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    ClientMessageMoveRequest clientMessageMoveRequest = (ClientMessageMoveRequest) o;
    return ObjectUtils.equals(this.sourceFolder, clientMessageMoveRequest.sourceFolder) &&
    ObjectUtils.equals(this.destinationFolder, clientMessageMoveRequest.destinationFolder) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(sourceFolder, destinationFolder, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientMessageMoveRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accountLocation: ").append(toIndentedString(getAccountLocation())).append("\n");
    sb.append("    messageId: ").append(toIndentedString(getMessageId())).append("\n");
    sb.append("    sourceFolder: ").append(toIndentedString(getSourceFolder())).append("\n");
    sb.append("    destinationFolder: ").append(toIndentedString(getDestinationFolder())).append("\n");
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

  public ClientMessageMoveRequest() {
    super();
  }

  /**
   * Initializes a new instance of the ClientMessageMoveRequest
   * @param accountLocation Email client account configuration location on storage.             
   * @param messageId Message identifier.             
   * @param sourceFolder Folder to move message from.             
   * @param destinationFolder Folder to move message to.             
   */
  public ClientMessageMoveRequest(
    StorageFileLocation accountLocation,
    String messageId,
    String sourceFolder,
    String destinationFolder
  ) {
    super();
    setAccountLocation(accountLocation);
    setMessageId(messageId);
    setSourceFolder(sourceFolder);
    setDestinationFolder(destinationFolder);
  }

}

