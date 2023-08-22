/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiCalendarAsFileRequest.java">
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
 * Convert MapiCalendar to file request.             
 */
public class MapiCalendarAsFileRequest {
  @JsonProperty("format")
  private String format = null;
  @JsonProperty("value")
  private MapiCalendarDto value = null;

  /**
   * Set format and return this.
   * @param format Calendar file format. Enum, available values: Ics, Msg
   * @return this
  **/
  public MapiCalendarAsFileRequest format(String format) {
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


  /**
   * Set value and return this.
   * @param value MAPI calendar model.             
   * @return this
  **/
  public MapiCalendarAsFileRequest value(MapiCalendarDto value) {
    this.value = value;
    return this;
  }

  /**
   * MAPI calendar model.             
   * @return value
  **/
  public MapiCalendarDto getValue() {
    return value;
  }  

  /**
   * Set value.
   * @param value MAPI calendar model.             
  **/
  public void setValue(MapiCalendarDto value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    MapiCalendarAsFileRequest mapiCalendarAsFileRequest = (MapiCalendarAsFileRequest) o;
    return ObjectUtils.equals(this.format, mapiCalendarAsFileRequest.format) &&
    ObjectUtils.equals(this.value, mapiCalendarAsFileRequest.value);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(format, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapiCalendarAsFileRequest {\n");
    
    sb.append("    format: ").append(toIndentedString(getFormat())).append("\n");
    sb.append("    value: ").append(toIndentedString(getValue())).append("\n");
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

  public MapiCalendarAsFileRequest() {
    super();
  }

  /**
   * Initializes a new instance of the MapiCalendarAsFileRequest
   * @param format Calendar file format. Enum, available values: Ics, Msg
   * @param value MAPI calendar model.             
   */
  public MapiCalendarAsFileRequest(
    String format,
    MapiCalendarDto value
  ) {
    super();
    setFormat(format);
    setValue(value);
  }

}

