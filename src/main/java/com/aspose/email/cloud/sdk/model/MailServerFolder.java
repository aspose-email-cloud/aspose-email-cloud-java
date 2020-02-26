/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MailServerFolder.java">
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
 * Email account folder             
 */
public class MailServerFolder {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("id")
  private String id = null;

  /**
   * Set name and return this.
   * @param name Gets or sets mail folder name             
   * @return this
  **/
  public MailServerFolder name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Gets or sets mail folder name             
   * @return name
  **/
  public String getName() {
    return name;
  }  

  /**
   * Set name.
   * @param name Gets or sets mail folder name             
  **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Set id and return this.
   * @param id Gets or sets mail folder id             
   * @return this
  **/
  public MailServerFolder id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Gets or sets mail folder id             
   * @return id
  **/
  public String getId() {
    return id;
  }  

  /**
   * Set id.
   * @param id Gets or sets mail folder id             
  **/
  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    MailServerFolder mailServerFolder = (MailServerFolder) o;
    return ObjectUtils.equals(this.name, mailServerFolder.name) &&
    ObjectUtils.equals(this.id, mailServerFolder.id);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(name, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailServerFolder {\n");
    
    sb.append("    name: ").append(toIndentedString(getName())).append("\n");
    sb.append("    id: ").append(toIndentedString(getId())).append("\n");
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

  public MailServerFolder() {
    super();
  }

  /**
   * Initializes a new instance of the MailServerFolder
   * @param name Gets or sets mail folder name             
   * @param id Gets or sets mail folder id             
   */
  public MailServerFolder(String name, String id) {
    super();
    setName(name);
    setId(id);
  }

}

