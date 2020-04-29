/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmailProperties.java">
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
 * Email list properties.             
 */
public class EmailProperties {
  @JsonProperty("link")
  private Link link = null;

  @JsonProperty("list")
  private List<EmailProperty> list = new ArrayList<EmailProperty>();

  /**
   * Set link and return this.
   * @param link Gets or sets link that originate from this document.             
   * @return this
  **/
  public EmailProperties link(Link link) {
    this.link = link;
    return this;
  }

  /**
   * Gets or sets link that originate from this document.             
   * @return link
  **/
  public Link getLink() {
    return link;
  }  

  /**
   * Set link.
   * @param link Gets or sets link that originate from this document.             
  **/
  public void setLink(Link link) {
    this.link = link;
  }

  /**
   * Set list and return this.
   * @param list List of properties             
   * @return this
  **/
  public EmailProperties list(List<EmailProperty> list) {
    this.list = list;
    return this;
  }
  /**
   * Add an item to list and return this.
   * @param listItem An item of: List of properties             
   * @return this
  **/
  public EmailProperties addListItem(EmailProperty listItem) {
    this.list.add(listItem);
    return this;
  }

  /**
   * List of properties             
   * @return list
  **/
  public List<EmailProperty> getList() {
    return list;
  }  

  /**
   * Set list.
   * @param list List of properties             
  **/
  public void setList(List<EmailProperty> list) {
    this.list = list;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    EmailProperties emailProperties = (EmailProperties) o;
    return ObjectUtils.equals(this.link, emailProperties.link) &&
    ObjectUtils.equals(this.list, emailProperties.list);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(link, list);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailProperties {\n");
    
    sb.append("    link: ").append(toIndentedString(getLink())).append("\n");
    sb.append("    list: ").append(toIndentedString(getList())).append("\n");
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

  public EmailProperties() {
    super();
  }

  /**
   * Initializes a new instance of the EmailProperties
   * @param link Gets or sets link that originate from this document.             
   * @param list List of properties             
   */
  public EmailProperties(Link link, List<EmailProperty> list) {
    super();
    setLink(link);
    setList(list);
  }

}

