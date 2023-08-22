/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="Url.java">
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
 * Url and its category.             
 */
public class Url {
  @JsonProperty("category")
  private EnumWithCustomOfUrlCategory category = null;
  @JsonProperty("preferred")
  private Boolean preferred = null;
  @JsonProperty("href")
  private String href = null;

  /**
   * Set category and return this.
   * @param category Url category.             
   * @return this
  **/
  public Url category(EnumWithCustomOfUrlCategory category) {
    this.category = category;
    return this;
  }

  /**
   * Url category.             
   * @return category
  **/
  public EnumWithCustomOfUrlCategory getCategory() {
    return category;
  }  

  /**
   * Set category.
   * @param category Url category.             
  **/
  public void setCategory(EnumWithCustomOfUrlCategory category) {
    this.category = category;
  }


  /**
   * Set preferred and return this.
   * @param preferred Defines whether url is preferred.             
   * @return this
  **/
  public Url preferred(Boolean preferred) {
    this.preferred = preferred;
    return this;
  }

  /**
   * Defines whether url is preferred.             
   * @return preferred
  **/
  public Boolean isPreferred() {
    return preferred;
  }  

  /**
   * Set preferred.
   * @param preferred Defines whether url is preferred.             
  **/
  public void setPreferred(Boolean preferred) {
    this.preferred = preferred;
  }


  /**
   * Set href and return this.
   * @param href URL.             
   * @return this
  **/
  public Url href(String href) {
    this.href = href;
    return this;
  }

  /**
   * URL.             
   * @return href
  **/
  public String getHref() {
    return href;
  }  

  /**
   * Set href.
   * @param href URL.             
  **/
  public void setHref(String href) {
    this.href = href;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    Url url = (Url) o;
    return ObjectUtils.equals(this.category, url.category) &&
    ObjectUtils.equals(this.preferred, url.preferred) &&
    ObjectUtils.equals(this.href, url.href);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(category, preferred, href);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Url {\n");
    
    sb.append("    category: ").append(toIndentedString(getCategory())).append("\n");
    sb.append("    preferred: ").append(toIndentedString(isPreferred())).append("\n");
    sb.append("    href: ").append(toIndentedString(getHref())).append("\n");
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

  public Url() {
    super();
  }

  /**
   * Initializes a new instance of the Url
   * @param category Url category.             
   * @param preferred Defines whether url is preferred.             
   * @param href URL.             
   */
  public Url(
    EnumWithCustomOfUrlCategory category,
    Boolean preferred,
    String href
  ) {
    super();
    setCategory(category);
    setPreferred(preferred);
    setHref(href);
  }

}

