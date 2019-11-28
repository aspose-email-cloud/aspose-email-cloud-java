/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AiNameParsedRequest.java">
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
 * Parsed name request model             
 */
public class AiNameParsedRequest {
  @JsonProperty("options")
  private AiNameOptions options = null;

  @JsonProperty("parsedName")
  private List<AiNameComponent> parsedName = new ArrayList<AiNameComponent>();

  public AiNameParsedRequest options(AiNameOptions options) {
    this.options = options;
    return this;
  }

  /**
   * AiName parser options             
   * @return options
  **/
  public AiNameOptions getOptions() {
    return options;
  }  

  public void setOptions(AiNameOptions options) {
    this.options = options;
  }

  public AiNameParsedRequest parsedName(List<AiNameComponent> parsedName) {
    this.parsedName = parsedName;
    return this;
  }

  public AiNameParsedRequest addParsedNameItem(AiNameComponent parsedNameItem) {
    this.parsedName.add(parsedNameItem);
    return this;
  }

  /**
   * Parsed name             
   * @return parsedName
  **/
  public List<AiNameComponent> getParsedName() {
    return parsedName;
  }  

  public void setParsedName(List<AiNameComponent> parsedName) {
    this.parsedName = parsedName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AiNameParsedRequest aiNameParsedRequest = (AiNameParsedRequest) o;
    return ObjectUtils.equals(this.options, aiNameParsedRequest.options) &&
    ObjectUtils.equals(this.parsedName, aiNameParsedRequest.parsedName);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(options, parsedName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiNameParsedRequest {\n");
    
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    parsedName: ").append(toIndentedString(parsedName)).append("\n");
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

