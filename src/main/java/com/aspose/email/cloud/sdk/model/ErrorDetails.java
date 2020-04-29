/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ErrorDetails.java">
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
 * The error details
 */
public class ErrorDetails {
  @JsonProperty("requestId")
  private String requestId = null;

  @JsonProperty("date")
  private Date date = null;

  /**
   * Set requestId and return this.
   * @param requestId The request id
   * @return this
  **/
  public ErrorDetails requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * The request id
   * @return requestId
  **/
  public String getRequestId() {
    return requestId;
  }  

  /**
   * Set requestId.
   * @param requestId The request id
  **/
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /**
   * Set date and return this.
   * @param date Date
   * @return this
  **/
  public ErrorDetails date(Date date) {
    this.date = date;
    return this;
  }

  /**
   * Date
   * @return date
  **/
  public Date getDate() {
    return date;
  }  

  /**
   * Set date.
   * @param date Date
  **/
  public void setDate(Date date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    ErrorDetails errorDetails = (ErrorDetails) o;
    return ObjectUtils.equals(this.requestId, errorDetails.requestId) &&
    ObjectUtils.equals(this.date, errorDetails.date);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(requestId, date);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDetails {\n");
    
    sb.append("    requestId: ").append(toIndentedString(getRequestId())).append("\n");
    sb.append("    date: ").append(toIndentedString(getDate())).append("\n");
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

  public ErrorDetails() {
    super();
  }

  /**
   * Initializes a new instance of the ErrorDetails
   * @param requestId The request id
   * @param date Date
   */
  public ErrorDetails(String requestId, Date date) {
    super();
    setRequestId(requestId);
    setDate(date);
  }

}

