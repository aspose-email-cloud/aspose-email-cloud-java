/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="StorageModelOfCalendarDto.java">
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
 * StorageModelOfCalendarDto
 */
public class StorageModelOfCalendarDto {
  @JsonProperty("storageFile")
  private StorageFileLocation storageFile = null;
  @JsonProperty("value")
  private CalendarDto value = null;

  /**
   * Set storageFile and return this.
   * @param storageFile 
   * @return this
  **/
  public StorageModelOfCalendarDto storageFile(StorageFileLocation storageFile) {
    this.storageFile = storageFile;
    return this;
  }

  /**
   * Get storageFile
   * @return storageFile
  **/
  public StorageFileLocation getStorageFile() {
    return storageFile;
  }  

  /**
   * Set storageFile.
   * @param storageFile 
  **/
  public void setStorageFile(StorageFileLocation storageFile) {
    this.storageFile = storageFile;
  }


  /**
   * Set value and return this.
   * @param value 
   * @return this
  **/
  public StorageModelOfCalendarDto value(CalendarDto value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  public CalendarDto getValue() {
    return value;
  }  

  /**
   * Set value.
   * @param value 
  **/
  public void setValue(CalendarDto value) {
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
    StorageModelOfCalendarDto storageModelOfCalendarDto = (StorageModelOfCalendarDto) o;
    return ObjectUtils.equals(this.storageFile, storageModelOfCalendarDto.storageFile) &&
    ObjectUtils.equals(this.value, storageModelOfCalendarDto.value);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(storageFile, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageModelOfCalendarDto {\n");
    
    sb.append("    storageFile: ").append(toIndentedString(getStorageFile())).append("\n");
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

  public StorageModelOfCalendarDto() {
    super();
  }

  /**
   * Initializes a new instance of the StorageModelOfCalendarDto
   * @param storageFile 
   * @param value 
   */
  public StorageModelOfCalendarDto(
    StorageFileLocation storageFile,
    CalendarDto value
  ) {
    super();
    setStorageFile(storageFile);
    setValue(value);
  }

}

