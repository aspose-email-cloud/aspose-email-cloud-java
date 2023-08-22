/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CalendarSaveRequest.java">
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
 * Save iCalendar to storage request.             
 */
public class CalendarSaveRequest extends StorageModelOfCalendarDto {
  @JsonProperty("format")
  private String format = null;

  /**
   * Set format and return this.
   * @param format Calendar file format. Enum, available values: Ics, Msg
   * @return this
  **/
  public CalendarSaveRequest format(String format) {
    this.format = format;
    return this;
  }

  /**
   * Calendar file format. Enum, available values: Ics, Msg
   * @return format
  **/
  public String getFormat() {
    return format;
  }  

  /**
   * Set format.
   * @param format Calendar file format. Enum, available values: Ics, Msg
  **/
  public void setFormat(String format) {
    this.format = format;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    CalendarSaveRequest calendarSaveRequest = (CalendarSaveRequest) o;
    return ObjectUtils.equals(this.format, calendarSaveRequest.format) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(format, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarSaveRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    storageFile: ").append(toIndentedString(getStorageFile())).append("\n");
    sb.append("    value: ").append(toIndentedString(getValue())).append("\n");
    sb.append("    format: ").append(toIndentedString(getFormat())).append("\n");
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

  public CalendarSaveRequest() {
    super();
  }

  /**
   * Initializes a new instance of the CalendarSaveRequest
   * @param storageFile 
   * @param value 
   * @param format Calendar file format. Enum, available values: Ics, Msg
   */
  public CalendarSaveRequest(
    StorageFileLocation storageFile,
    CalendarDto value,
    String format
  ) {
    super();
    setStorageFile(storageFile);
    setValue(value);
    setFormat(format);
  }

}

