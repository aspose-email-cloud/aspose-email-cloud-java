/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiAttachmentDto.java">
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
 * Mapi attachment             
 */
public class MapiAttachmentDto {
  @JsonProperty("name")
  private String name = null;
  @JsonProperty("dataBase64")
  private String dataBase64 = null;

  /**
   * Set name and return this.
   * @param name Attachment&#39;s name             
   * @return this
  **/
  public MapiAttachmentDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Attachment&#39;s name             
   * @return name
  **/
  public String getName() {
    return name;
  }  

  /**
   * Set name.
   * @param name Attachment&#39;s name             
  **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Set dataBase64 and return this.
   * @param dataBase64 Attachment data represented as Base64 string.             
   * @return this
  **/
  public MapiAttachmentDto dataBase64(String dataBase64) {
    this.dataBase64 = dataBase64;
    return this;
  }

  /**
   * Attachment data represented as Base64 string.             
   * @return dataBase64
  **/
  public String getDataBase64() {
    return dataBase64;
  }  

  /**
   * Set dataBase64.
   * @param dataBase64 Attachment data represented as Base64 string.             
  **/
  public void setDataBase64(String dataBase64) {
    this.dataBase64 = dataBase64;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    MapiAttachmentDto mapiAttachmentDto = (MapiAttachmentDto) o;
    return ObjectUtils.equals(this.name, mapiAttachmentDto.name) &&
    ObjectUtils.equals(this.dataBase64, mapiAttachmentDto.dataBase64);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(name, dataBase64);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapiAttachmentDto {\n");
    
    sb.append("    name: ").append(toIndentedString(getName())).append("\n");
    sb.append("    dataBase64: ").append(toIndentedString(getDataBase64())).append("\n");
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

  public MapiAttachmentDto() {
    super();
  }

  /**
   * Initializes a new instance of the MapiAttachmentDto
   * @param name Attachment&#39;s name             
   * @param dataBase64 Attachment data represented as Base64 string.             
   */
  public MapiAttachmentDto(
    String name,
    String dataBase64
  ) {
    super();
    setName(name);
    setDataBase64(dataBase64);
  }

}

