/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AiBcrParseOcrDataStorageRq.java">
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
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.*;
import com.google.gson.*;
import com.google.gson.stream.*;
import java.io.*;

/**
 * Parse ocr data request with storage output location             
 */
public class AiBcrParseOcrDataStorageRq extends AiBcrParseOcrDataRq {
  @JsonProperty("outFolder")
  private StorageFolderLocation outFolder = null;

  public AiBcrParseOcrDataStorageRq outFolder(StorageFolderLocation outFolder) {
    this.outFolder = outFolder;
    return this;
  }

  /**
   * Output folder location on storage             
   * @return outFolder
  **/
  public StorageFolderLocation getOutFolder() {
    return outFolder;
  }  

  public void setOutFolder(StorageFolderLocation outFolder) {
    this.outFolder = outFolder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AiBcrParseOcrDataStorageRq aiBcrParseOcrDataStorageRq = (AiBcrParseOcrDataStorageRq) o;
    return ObjectUtils.equals(this.outFolder, aiBcrParseOcrDataStorageRq.outFolder) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(outFolder, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiBcrParseOcrDataStorageRq {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    outFolder: ").append(toIndentedString(outFolder)).append("\n");
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

