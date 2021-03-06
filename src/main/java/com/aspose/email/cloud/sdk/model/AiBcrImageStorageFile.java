/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AiBcrImageStorageFile.java">
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
 * Image from storage for recognition             
 */
public class AiBcrImageStorageFile extends AiBcrImage {
  @JsonProperty("file")
  private StorageFileLocation file = null;

  /**
   * Set file and return this.
   * @param file Image location             
   * @return this
  **/
  public AiBcrImageStorageFile file(StorageFileLocation file) {
    this.file = file;
    return this;
  }

  /**
   * Image location             
   * @return file
  **/
  public StorageFileLocation getFile() {
    return file;
  }  

  /**
   * Set file.
   * @param file Image location             
  **/
  public void setFile(StorageFileLocation file) {
    this.file = file;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AiBcrImageStorageFile aiBcrImageStorageFile = (AiBcrImageStorageFile) o;
    return ObjectUtils.equals(this.file, aiBcrImageStorageFile.file) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(file, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiBcrImageStorageFile {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    isSingle: ").append(toIndentedString(isIsSingle())).append("\n");
    sb.append("    file: ").append(toIndentedString(getFile())).append("\n");
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

  public AiBcrImageStorageFile() {
    super();
  }

  /**
   * Initializes a new instance of the AiBcrImageStorageFile
   * @param isSingle Determines that image contains single VCard or more.             
   * @param file Image location             
   */
  public AiBcrImageStorageFile(
    Boolean isSingle,
    StorageFileLocation file
  ) {
    super();
    setIsSingle(isSingle);
    setFile(file);
  }

}

