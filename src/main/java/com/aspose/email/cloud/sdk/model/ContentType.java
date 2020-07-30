/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ContentType.java">
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
 * Represents a Content-Type header.             
 */
public class ContentType {
  @JsonProperty("boundary")
  private String boundary = null;
  @JsonProperty("charSet")
  private String charSet = null;
  @JsonProperty("mediaType")
  private String mediaType = null;
  @JsonProperty("name")
  private String name = null;
  @JsonProperty("parameters")
  private List<ContentTypeParameter> parameters = null;

  /**
   * Set boundary and return this.
   * @param boundary The boundary parameter included in the Content-Type header.             
   * @return this
  **/
  public ContentType boundary(String boundary) {
    this.boundary = boundary;
    return this;
  }

  /**
   * The boundary parameter included in the Content-Type header.             
   * @return boundary
  **/
  public String getBoundary() {
    return boundary;
  }  

  /**
   * Set boundary.
   * @param boundary The boundary parameter included in the Content-Type header.             
  **/
  public void setBoundary(String boundary) {
    this.boundary = boundary;
  }


  /**
   * Set charSet and return this.
   * @param charSet CharSet parameter.             
   * @return this
  **/
  public ContentType charSet(String charSet) {
    this.charSet = charSet;
    return this;
  }

  /**
   * CharSet parameter.             
   * @return charSet
  **/
  public String getCharSet() {
    return charSet;
  }  

  /**
   * Set charSet.
   * @param charSet CharSet parameter.             
  **/
  public void setCharSet(String charSet) {
    this.charSet = charSet;
  }


  /**
   * Set mediaType and return this.
   * @param mediaType The internet media type.             
   * @return this
  **/
  public ContentType mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  /**
   * The internet media type.             
   * @return mediaType
  **/
  public String getMediaType() {
    return mediaType;
  }  

  /**
   * Set mediaType.
   * @param mediaType The internet media type.             
  **/
  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }


  /**
   * Set name and return this.
   * @param name Name parameter.             
   * @return this
  **/
  public ContentType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name parameter.             
   * @return name
  **/
  public String getName() {
    return name;
  }  

  /**
   * Set name.
   * @param name Name parameter.             
  **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Set parameters and return this.
   * @param parameters Full list of parameters             
   * @return this
  **/
  public ContentType parameters(List<ContentTypeParameter> parameters) {
    this.parameters = parameters;
    return this;
  }
  /**
   * Add an item to parameters and return this.
   * @param parametersItem An item of: Full list of parameters             
   * @return this
  **/
  public ContentType addParametersItem(ContentTypeParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<ContentTypeParameter>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

  /**
   * Full list of parameters             
   * @return parameters
  **/
  public List<ContentTypeParameter> getParameters() {
    return parameters;
  }  

  /**
   * Set parameters.
   * @param parameters Full list of parameters             
  **/
  public void setParameters(List<ContentTypeParameter> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    ContentType contentType = (ContentType) o;
    return ObjectUtils.equals(this.boundary, contentType.boundary) &&
    ObjectUtils.equals(this.charSet, contentType.charSet) &&
    ObjectUtils.equals(this.mediaType, contentType.mediaType) &&
    ObjectUtils.equals(this.name, contentType.name) &&
    ObjectUtils.equals(this.parameters, contentType.parameters);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(boundary, charSet, mediaType, name, parameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentType {\n");
    
    sb.append("    boundary: ").append(toIndentedString(getBoundary())).append("\n");
    sb.append("    charSet: ").append(toIndentedString(getCharSet())).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(getMediaType())).append("\n");
    sb.append("    name: ").append(toIndentedString(getName())).append("\n");
    sb.append("    parameters: ").append(toIndentedString(getParameters())).append("\n");
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

  public ContentType() {
    super();
  }

  /**
   * Initializes a new instance of the ContentType
   * @param boundary The boundary parameter included in the Content-Type header.             
   * @param charSet CharSet parameter.             
   * @param mediaType The internet media type.             
   * @param name Name parameter.             
   * @param parameters Full list of parameters             
   */
  public ContentType(
    String boundary,
    String charSet,
    String mediaType,
    String name,
    List<ContentTypeParameter> parameters
  ) {
    super();
    setBoundary(boundary);
    setCharSet(charSet);
    setMediaType(mediaType);
    setName(name);
    setParameters(parameters);
  }

}

