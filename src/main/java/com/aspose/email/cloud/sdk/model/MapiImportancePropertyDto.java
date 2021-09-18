/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiImportancePropertyDto.java">
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
 * Mapi property with ImportanceChoicesType value             
 */
public class MapiImportancePropertyDto extends MapiPropertyDto {
  @JsonProperty("value")
  private String value = null;

  /**
   * Set value and return this.
   * @param value Levels of importance for an item. Enum, available values: Low, Normal, High
   * @return this
  **/
  public MapiImportancePropertyDto value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Levels of importance for an item. Enum, available values: Low, Normal, High
   * @return value
  **/
  public String getValue() {
    return value;
  }  

  /**
   * Set value.
   * @param value Levels of importance for an item. Enum, available values: Low, Normal, High
  **/
  public void setValue(String value) {
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
    MapiImportancePropertyDto mapiImportancePropertyDto = (MapiImportancePropertyDto) o;
    return ObjectUtils.equals(this.value, mapiImportancePropertyDto.value) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(value, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapiImportancePropertyDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(getDescriptor())).append("\n");
    sb.append("    discriminator: ").append(toIndentedString(getDiscriminator())).append("\n");
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

  public MapiImportancePropertyDto() {
    super();
  }

  /**
   * Initializes a new instance of the MapiImportancePropertyDto
   * @param descriptor Property descriptor             
   * @param value Levels of importance for an item. Enum, available values: Low, Normal, High
   */
  public MapiImportancePropertyDto(
    MapiPropertyDescriptor descriptor
    ,
    String value
  ) {
    super();
    setDescriptor(descriptor);
    setValue(value);
  }

}

