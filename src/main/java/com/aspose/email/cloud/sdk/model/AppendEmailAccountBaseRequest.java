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

  public AppendEmailAccountBaseRequest folder(String folder) {
    this.folder = folder;
    return this;
  }

  /**
   * Get folder
   * @return folder
  **/
  public String getFolder() {
    return folder;
  }  

  public void setFolder(String folder) {
    this.folder = folder;
  }

  public AppendEmailAccountBaseRequest markAsSent(Boolean markAsSent) {
    this.markAsSent = markAsSent;
    return this;
  }

  /**
   * Get markAsSent
   * @return markAsSent
  **/
  public Boolean isMarkAsSent() {
    return markAsSent;
  }  

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
    sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
    sb.append("    markAsSent: ").append(toIndentedString(markAsSent)).append("\n");
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

}

