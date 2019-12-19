/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="BaseObject.java">
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
 * Base property object             
 */
public class BaseObject {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private String type = this.getClass().getSimpleName();

  public BaseObject name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Gets or sets the name of an object.             
   * @return name
  **/
  public String getName() {
    return name;
  }  

  public void setName(String name) {
    this.name = name;
  }



  /**
   * Property type. Used for deserialization purposes             
   * @return type
  **/
  public String getType() {
    return type;
  }  

  public void setType(String type) {/* do nothing */}


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    BaseObject baseObject = (BaseObject) o;
    return ObjectUtils.equals(this.name, baseObject.name) &&
    ObjectUtils.equals(this.type, baseObject.type);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(name, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseObject {\n");
    
    sb.append("    name: ").append(toIndentedString(getName())).append("\n");
    sb.append("    type: ").append(toIndentedString(getType())).append("\n");
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

  public BaseObject() {
    super();
  }

  /**
   * Initializes a new instance of the BaseObject
   * @param name Gets or sets the name of an object.             
   * @param type Property type. Used for deserialization purposes             
   */
  public BaseObject(String name, String type) {
    super();
    setName(name);
    setType(type);
  }

}

