/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AiBcrParseOcrDataRq.java">
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
 * Parse ocr data request             
 */
public class AiBcrParseOcrDataRq extends AiBcrRq {
  @JsonProperty("data")
  private List<AiBcrOcrData> data = new ArrayList<AiBcrOcrData>();

  public AiBcrParseOcrDataRq data(List<AiBcrOcrData> data) {
    this.data = data;
    return this;
  }

  public AiBcrParseOcrDataRq addDataItem(AiBcrOcrData dataItem) {
    this.data.add(dataItem);
    return this;
  }

  /**
   * OCR data             
   * @return data
  **/
  public List<AiBcrOcrData> getData() {
    return data;
  }  

  public void setData(List<AiBcrOcrData> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AiBcrParseOcrDataRq aiBcrParseOcrDataRq = (AiBcrParseOcrDataRq) o;
    return ObjectUtils.equals(this.data, aiBcrParseOcrDataRq.data) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(data, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiBcrParseOcrDataRq {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    options: ").append(toIndentedString(getOptions())).append("\n");
    sb.append("    data: ").append(toIndentedString(getData())).append("\n");
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

  public AiBcrParseOcrDataRq() {
    super();
  }

  /**
   * Initializes a new instance of the AiBcrParseOcrDataRq
   * @param options Recognition options             
   * @param data OCR data             
   */
  public AiBcrParseOcrDataRq(AiBcrOptions options, List<AiBcrOcrData> data) {
    super();
    setOptions(options);
    setData(data);
  }

}

