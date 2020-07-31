/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ListResponseOfMailServerFolder.java">
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
 * ListResponseOfMailServerFolder
 */
public class ListResponseOfMailServerFolder {
  @JsonProperty("value")
  private List<MailServerFolder> value = null;

  /**
   * Set value and return this.
   * @param value 
   * @return this
  **/
  public ListResponseOfMailServerFolder value(List<MailServerFolder> value) {
    this.value = value;
    return this;
  }
  /**
   * Add an item to value and return this.
   * @param valueItem An item of: 
   * @return this
  **/
  public ListResponseOfMailServerFolder addValueItem(MailServerFolder valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<MailServerFolder>();
    }
    this.value.add(valueItem);
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  public List<MailServerFolder> getValue() {
    return value;
  }  

  /**
   * Set value.
   * @param value 
  **/
  public void setValue(List<MailServerFolder> value) {
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
    ListResponseOfMailServerFolder listResponseOfMailServerFolder = (ListResponseOfMailServerFolder) o;
    return ObjectUtils.equals(this.value, listResponseOfMailServerFolder.value);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListResponseOfMailServerFolder {\n");
    
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

  public ListResponseOfMailServerFolder() {
    super();
  }

  /**
   * Initializes a new instance of the ListResponseOfMailServerFolder
   * @param value 
   */
  public ListResponseOfMailServerFolder(
    List<MailServerFolder> value
  ) {
    super();
    setValue(value);
  }

}

