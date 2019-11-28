/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmailDocument.java">
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
 * Represents Email document DTO.             
 */
public class EmailDocument {
  @JsonProperty("links")
  private List<Link> links = null;

  @JsonProperty("documentProperties")
  private EmailProperties documentProperties = null;

  public EmailDocument links(List<Link> links) {
    this.links = links;
    return this;
  }

  public EmailDocument addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<Link>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Links that originate from this document.             
   * @return links
  **/
  public List<Link> getLinks() {
    return links;
  }  

  public void setLinks(List<Link> links) {
    this.links = links;
  }

  public EmailDocument documentProperties(EmailProperties documentProperties) {
    this.documentProperties = documentProperties;
    return this;
  }

  /**
   * List of document properties.             
   * @return documentProperties
  **/
  public EmailProperties getDocumentProperties() {
    return documentProperties;
  }  

  public void setDocumentProperties(EmailProperties documentProperties) {
    this.documentProperties = documentProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    EmailDocument emailDocument = (EmailDocument) o;
    return ObjectUtils.equals(this.links, emailDocument.links) &&
    ObjectUtils.equals(this.documentProperties, emailDocument.documentProperties);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(links, documentProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailDocument {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    documentProperties: ").append(toIndentedString(documentProperties)).append("\n");
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

}

