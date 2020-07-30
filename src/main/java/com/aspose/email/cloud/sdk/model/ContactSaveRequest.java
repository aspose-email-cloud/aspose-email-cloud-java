/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ContactSaveRequest.java">
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
 * Contact save to storage request             
 */
public class ContactSaveRequest extends StorageModelOfContactDto {
  @JsonProperty("format")
  private String format = null;

  /**
   * Set format and return this.
   * @param format Enumerates contact formats. Enum, available values: VCard, WebDav, Msg
   * @return this
  **/
  public ContactSaveRequest format(String format) {
    this.format = format;
    return this;
  }

  /**
   * Enumerates contact formats. Enum, available values: VCard, WebDav, Msg
   * @return format
  **/
  public String getFormat() {
    return format;
  }  

  /**
   * Set format.
   * @param format Enumerates contact formats. Enum, available values: VCard, WebDav, Msg
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
    ContactSaveRequest contactSaveRequest = (ContactSaveRequest) o;
    return ObjectUtils.equals(this.format, contactSaveRequest.format) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(format, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactSaveRequest {\n");
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

  public ContactSaveRequest() {
    super();
  }

  /**
   * Initializes a new instance of the ContactSaveRequest
   * @param storageFile 
   * @param value 
   * @param format Enumerates contact formats. Enum, available values: VCard, WebDav, Msg
   */
  public ContactSaveRequest(
    StorageFileLocation storageFile,
    ContactDto value,
    String format
  ) {
    super();
    setStorageFile(storageFile);
    setValue(value);
    setFormat(format);
  }

}

