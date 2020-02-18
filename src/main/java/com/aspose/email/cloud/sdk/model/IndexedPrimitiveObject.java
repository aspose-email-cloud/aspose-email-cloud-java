/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="IndexedPrimitiveObject.java">
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
 * Simple indexed property             
 */
public class IndexedPrimitiveObject extends BaseObject {
  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("value")
  private String value = null;

  /**
   * Set index and return this.
   * @param index Index of property in list             
   * @return this
  **/
  public IndexedPrimitiveObject index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * Index of property in list             
   * @return index
  **/
  public Integer getIndex() {
    return index;
  }  

  /**
   * Set index.
   * @param index Index of property in list             
  **/
  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * Set value and return this.
   * @param value Gets or sets the name of a property.             
   * @return this
  **/
  public IndexedPrimitiveObject value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Gets or sets the name of a property.             
   * @return value
  **/
  public String getValue() {
    return value;
  }  

  /**
   * Set value.
   * @param value Gets or sets the name of a property.             
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
    IndexedPrimitiveObject indexedPrimitiveObject = (IndexedPrimitiveObject) o;
    return ObjectUtils.equals(this.index, indexedPrimitiveObject.index) &&
    ObjectUtils.equals(this.value, indexedPrimitiveObject.value) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(index, value, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndexedPrimitiveObject {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(getName())).append("\n");
    sb.append("    type: ").append(toIndentedString(getType())).append("\n");
    sb.append("    index: ").append(toIndentedString(getIndex())).append("\n");
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

  public IndexedPrimitiveObject() {
    super();
  }

  /**
   * Initializes a new instance of the IndexedPrimitiveObject
   * @param name Gets or sets the name of an object.             
   * @param type Property type. Used for deserialization purposes             
   * @param index Index of property in list             
   * @param value Gets or sets the name of a property.             
   */
  public IndexedPrimitiveObject(String name, String type, Integer index, String value) {
    super();
    setName(name);
    setType(type);
    setIndex(index);
    setValue(value);
  }

}

