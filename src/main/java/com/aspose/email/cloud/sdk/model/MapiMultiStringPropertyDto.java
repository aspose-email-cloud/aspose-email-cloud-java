/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiMultiStringPropertyDto.java">
*   Copyright (c) 2018-2023 Aspose Pty Ltd. All rights reserved.
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
 * Mapi property with Multiple String values             
 */
public class MapiMultiStringPropertyDto extends MapiPropertyDto {
  @JsonProperty("values")
  private List<String> values = null;

  /**
   * Set values and return this.
   * @param values Property values             
   * @return this
  **/
  public MapiMultiStringPropertyDto values(List<String> values) {
    this.values = values;
    return this;
  }
  /**
   * Add an item to values and return this.
   * @param valuesItem An item of: Property values             
   * @return this
  **/
  public MapiMultiStringPropertyDto addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<String>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Property values             
   * @return values
  **/
  public List<String> getValues() {
    return values;
  }  

  /**
   * Set values.
   * @param values Property values             
  **/
  public void setValues(List<String> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    MapiMultiStringPropertyDto mapiMultiStringPropertyDto = (MapiMultiStringPropertyDto) o;
    return ObjectUtils.equals(this.values, mapiMultiStringPropertyDto.values) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(values, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapiMultiStringPropertyDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(getDescriptor())).append("\n");
    sb.append("    discriminator: ").append(toIndentedString(getDiscriminator())).append("\n");
    sb.append("    values: ").append(toIndentedString(getValues())).append("\n");
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

  public MapiMultiStringPropertyDto() {
    super();
  }

  /**
   * Initializes a new instance of the MapiMultiStringPropertyDto
   * @param descriptor Property descriptor             
   * @param values Property values             
   */
  public MapiMultiStringPropertyDto(
    MapiPropertyDescriptor descriptor
    ,
    List<String> values
  ) {
    super();
    setDescriptor(descriptor);
    setValues(values);
  }

}

