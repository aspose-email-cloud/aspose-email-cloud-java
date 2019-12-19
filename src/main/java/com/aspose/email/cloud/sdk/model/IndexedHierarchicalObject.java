/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="IndexedHierarchicalObject.java">
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
 * Indexed hierarchical property             
 */
public class IndexedHierarchicalObject extends BaseObject {
  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("internalProperties")
  private List<BaseObject> internalProperties = null;

  public IndexedHierarchicalObject index(Integer index) {
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

  public void setIndex(Integer index) {
    this.index = index;
  }

  public IndexedHierarchicalObject internalProperties(List<BaseObject> internalProperties) {
    this.internalProperties = internalProperties;
    return this;
  }

  public IndexedHierarchicalObject addInternalPropertiesItem(BaseObject internalPropertiesItem) {
    if (this.internalProperties == null) {
      this.internalProperties = new ArrayList<BaseObject>();
    }
    this.internalProperties.add(internalPropertiesItem);
    return this;
  }

  /**
   * List of internal properties             
   * @return internalProperties
  **/
  public List<BaseObject> getInternalProperties() {
    return internalProperties;
  }  

  public void setInternalProperties(List<BaseObject> internalProperties) {
    this.internalProperties = internalProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    IndexedHierarchicalObject indexedHierarchicalObject = (IndexedHierarchicalObject) o;
    return ObjectUtils.equals(this.index, indexedHierarchicalObject.index) &&
    ObjectUtils.equals(this.internalProperties, indexedHierarchicalObject.internalProperties) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(index, internalProperties, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndexedHierarchicalObject {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(getName())).append("\n");
    sb.append("    type: ").append(toIndentedString(getType())).append("\n");
    sb.append("    index: ").append(toIndentedString(getIndex())).append("\n");
    sb.append("    internalProperties: ").append(toIndentedString(getInternalProperties())).append("\n");
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

  public IndexedHierarchicalObject() {
    super();
  }

  /**
   * Initializes a new instance of the IndexedHierarchicalObject
   * @param name Gets or sets the name of an object.             
   * @param type Property type. Used for deserialization purposes             
   * @param index Index of property in list             
   * @param internalProperties List of internal properties             
   */
  public IndexedHierarchicalObject(String name, String type, Integer index, List<BaseObject> internalProperties) {
    super();
    setName(name);
    setType(type);
    setIndex(index);
    setInternalProperties(internalProperties);
  }

}

