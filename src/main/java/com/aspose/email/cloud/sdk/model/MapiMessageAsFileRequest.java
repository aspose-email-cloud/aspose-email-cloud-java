/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiMessageAsFileRequest.java">
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
 * Convert MapiMessage to file request.             
 */
public class MapiMessageAsFileRequest {
  @JsonProperty("format")
  private String format = null;
  @JsonProperty("value")
  private MapiMessageDto value = null;

  /**
   * Set format and return this.
   * @param format Email document format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft
   * @return this
  **/
  public MapiMessageAsFileRequest format(String format) {
    this.format = format;
    return this;
  }

  /**
   * Email document format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft
   * @return format
  **/
  public String getFormat() {
    return format;
  }  

  /**
   * Set format.
   * @param format Email document format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft
  **/
  public void setFormat(String format) {
    this.format = format;
  }


  /**
   * Set value and return this.
   * @param value MAPI message model.             
   * @return this
  **/
  public MapiMessageAsFileRequest value(MapiMessageDto value) {
    this.value = value;
    return this;
  }

  /**
   * MAPI message model.             
   * @return value
  **/
  public MapiMessageDto getValue() {
    return value;
  }  

  /**
   * Set value.
   * @param value MAPI message model.             
  **/
  public void setValue(MapiMessageDto value) {
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
    MapiMessageAsFileRequest mapiMessageAsFileRequest = (MapiMessageAsFileRequest) o;
    return ObjectUtils.equals(this.format, mapiMessageAsFileRequest.format) &&
    ObjectUtils.equals(this.value, mapiMessageAsFileRequest.value);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(format, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapiMessageAsFileRequest {\n");
    
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

  public MapiMessageAsFileRequest() {
    super();
  }

  /**
   * Initializes a new instance of the MapiMessageAsFileRequest
   * @param format Email document format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft
   * @param value MAPI message model.             
   */
  public MapiMessageAsFileRequest(
    String format,
    MapiMessageDto value
  ) {
    super();
    setFormat(format);
    setValue(value);
  }

}

