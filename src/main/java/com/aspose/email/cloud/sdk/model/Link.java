/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="Link.java">
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
 * Provides information for the object link. This is supposed to be an atom:link, therefore it should have all attributes specified here http://tools.ietf.org/html/rfc4287#section-4.2.7             
 */
public class Link {
  @JsonProperty("href")
  private String href = null;

  @JsonProperty("rel")
  private String rel = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("title")
  private String title = null;

  /**
   * Set href and return this.
   * @param href The \&quot;href\&quot; attribute contains the link&#39;s IRI. atom:link elements MUST have an href attribute, whose value MUST be a IRI reference             
   * @return this
  **/
  public Link href(String href) {
    this.href = href;
    return this;
  }

  /**
   * The \&quot;href\&quot; attribute contains the link&#39;s IRI. atom:link elements MUST have an href attribute, whose value MUST be a IRI reference             
   * @return href
  **/
  public String getHref() {
    return href;
  }  

  /**
   * Set href.
   * @param href The \&quot;href\&quot; attribute contains the link&#39;s IRI. atom:link elements MUST have an href attribute, whose value MUST be a IRI reference             
  **/
  public void setHref(String href) {
    this.href = href;
  }

  /**
   * Set rel and return this.
   * @param rel atom:link elements MAY have a \&quot;rel\&quot; attribute that indicates the link relation type.  If the \&quot;rel\&quot; attribute is not present, the link element MUST be interpreted as if the link relation type is \&quot;alternate\&quot;.             
   * @return this
  **/
  public Link rel(String rel) {
    this.rel = rel;
    return this;
  }

  /**
   * atom:link elements MAY have a \&quot;rel\&quot; attribute that indicates the link relation type.  If the \&quot;rel\&quot; attribute is not present, the link element MUST be interpreted as if the link relation type is \&quot;alternate\&quot;.             
   * @return rel
  **/
  public String getRel() {
    return rel;
  }  

  /**
   * Set rel.
   * @param rel atom:link elements MAY have a \&quot;rel\&quot; attribute that indicates the link relation type.  If the \&quot;rel\&quot; attribute is not present, the link element MUST be interpreted as if the link relation type is \&quot;alternate\&quot;.             
  **/
  public void setRel(String rel) {
    this.rel = rel;
  }

  /**
   * Set type and return this.
   * @param type On the link element, the \&quot;type\&quot; attribute&#39;s value is an advisory media type: it is a hint about the type of the representation that is expected to be returned when the value of the href attribute is dereferenced.  Note that the type attribute does not override the actual media type returned with the representation.             
   * @return this
  **/
  public Link type(String type) {
    this.type = type;
    return this;
  }

  /**
   * On the link element, the \&quot;type\&quot; attribute&#39;s value is an advisory media type: it is a hint about the type of the representation that is expected to be returned when the value of the href attribute is dereferenced.  Note that the type attribute does not override the actual media type returned with the representation.             
   * @return type
  **/
  public String getType() {
    return type;
  }  

  /**
   * Set type.
   * @param type On the link element, the \&quot;type\&quot; attribute&#39;s value is an advisory media type: it is a hint about the type of the representation that is expected to be returned when the value of the href attribute is dereferenced.  Note that the type attribute does not override the actual media type returned with the representation.             
  **/
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Set title and return this.
   * @param title The \&quot;title\&quot; attribute conveys human-readable information about the link.  The content of the \&quot;title\&quot; attribute is Language-Sensitive.             
   * @return this
  **/
  public Link title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The \&quot;title\&quot; attribute conveys human-readable information about the link.  The content of the \&quot;title\&quot; attribute is Language-Sensitive.             
   * @return title
  **/
  public String getTitle() {
    return title;
  }  

  /**
   * Set title.
   * @param title The \&quot;title\&quot; attribute conveys human-readable information about the link.  The content of the \&quot;title\&quot; attribute is Language-Sensitive.             
  **/
  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    Link link = (Link) o;
    return ObjectUtils.equals(this.href, link.href) &&
    ObjectUtils.equals(this.rel, link.rel) &&
    ObjectUtils.equals(this.type, link.type) &&
    ObjectUtils.equals(this.title, link.title);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(href, rel, type, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Link {\n");
    
    sb.append("    href: ").append(toIndentedString(getHref())).append("\n");
    sb.append("    rel: ").append(toIndentedString(getRel())).append("\n");
    sb.append("    type: ").append(toIndentedString(getType())).append("\n");
    sb.append("    title: ").append(toIndentedString(getTitle())).append("\n");
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

  public Link() {
    super();
  }

  /**
   * Initializes a new instance of the Link
   * @param href The \&quot;href\&quot; attribute contains the link&#39;s IRI. atom:link elements MUST have an href attribute, whose value MUST be a IRI reference             
   * @param rel atom:link elements MAY have a \&quot;rel\&quot; attribute that indicates the link relation type.  If the \&quot;rel\&quot; attribute is not present, the link element MUST be interpreted as if the link relation type is \&quot;alternate\&quot;.             
   * @param type On the link element, the \&quot;type\&quot; attribute&#39;s value is an advisory media type: it is a hint about the type of the representation that is expected to be returned when the value of the href attribute is dereferenced.  Note that the type attribute does not override the actual media type returned with the representation.             
   * @param title The \&quot;title\&quot; attribute conveys human-readable information about the link.  The content of the \&quot;title\&quot; attribute is Language-Sensitive.             
   */
  public Link(String href, String rel, String type, String title) {
    super();
    setHref(href);
    setRel(rel);
    setType(type);
    setTitle(title);
  }

}

