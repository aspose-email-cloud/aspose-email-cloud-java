/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="DiscUsage.java">
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
 * DiscUsage
 */
public class DiscUsage {
  @JsonProperty("usedSize")
  private Long usedSize = null;
  @JsonProperty("totalSize")
  private Long totalSize = null;

  /**
   * Set usedSize and return this.
   * @param usedSize 
   * @return this
  **/
  public DiscUsage usedSize(Long usedSize) {
    this.usedSize = usedSize;
    return this;
  }

  /**
   * Get usedSize
   * @return usedSize
  **/
  public Long getUsedSize() {
    return usedSize;
  }  

  /**
   * Set usedSize.
   * @param usedSize 
  **/
  public void setUsedSize(Long usedSize) {
    this.usedSize = usedSize;
  }


  /**
   * Set totalSize and return this.
   * @param totalSize 
   * @return this
  **/
  public DiscUsage totalSize(Long totalSize) {
    this.totalSize = totalSize;
    return this;
  }

  /**
   * Get totalSize
   * @return totalSize
  **/
  public Long getTotalSize() {
    return totalSize;
  }  

  /**
   * Set totalSize.
   * @param totalSize 
  **/
  public void setTotalSize(Long totalSize) {
    this.totalSize = totalSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    DiscUsage discUsage = (DiscUsage) o;
    return ObjectUtils.equals(this.usedSize, discUsage.usedSize) &&
    ObjectUtils.equals(this.totalSize, discUsage.totalSize);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(usedSize, totalSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscUsage {\n");
    
    sb.append("    usedSize: ").append(toIndentedString(getUsedSize())).append("\n");
    sb.append("    totalSize: ").append(toIndentedString(getTotalSize())).append("\n");
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

  public DiscUsage() {
    super();
  }

  /**
   * Initializes a new instance of the DiscUsage
   * @param usedSize 
   * @param totalSize 
   */
  public DiscUsage(
    Long usedSize,
    Long totalSize
  ) {
    super();
    setUsedSize(usedSize);
    setTotalSize(totalSize);
  }

}

