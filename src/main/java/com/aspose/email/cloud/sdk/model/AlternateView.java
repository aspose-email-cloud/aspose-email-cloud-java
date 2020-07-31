/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AlternateView.java">
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
 * Represents the format to view a message.             
 */
public class AlternateView extends AttachmentBase {
  @JsonProperty("baseUri")
  private String baseUri = null;
  @JsonProperty("linkedResources")
  private List<LinkedResource> linkedResources = null;

  /**
   * Set baseUri and return this.
   * @param baseUri Base URI.             
   * @return this
  **/
  public AlternateView baseUri(String baseUri) {
    this.baseUri = baseUri;
    return this;
  }

  /**
   * Base URI.             
   * @return baseUri
  **/
  public String getBaseUri() {
    return baseUri;
  }  

  /**
   * Set baseUri.
   * @param baseUri Base URI.             
  **/
  public void setBaseUri(String baseUri) {
    this.baseUri = baseUri;
  }


  /**
   * Set linkedResources and return this.
   * @param linkedResources Embedded resources referred to by this alternate view.             
   * @return this
  **/
  public AlternateView linkedResources(List<LinkedResource> linkedResources) {
    this.linkedResources = linkedResources;
    return this;
  }
  /**
   * Add an item to linkedResources and return this.
   * @param linkedResourcesItem An item of: Embedded resources referred to by this alternate view.             
   * @return this
  **/
  public AlternateView addLinkedResourcesItem(LinkedResource linkedResourcesItem) {
    if (this.linkedResources == null) {
      this.linkedResources = new ArrayList<LinkedResource>();
    }
    this.linkedResources.add(linkedResourcesItem);
    return this;
  }

  /**
   * Embedded resources referred to by this alternate view.             
   * @return linkedResources
  **/
  public List<LinkedResource> getLinkedResources() {
    return linkedResources;
  }  

  /**
   * Set linkedResources.
   * @param linkedResources Embedded resources referred to by this alternate view.             
  **/
  public void setLinkedResources(List<LinkedResource> linkedResources) {
    this.linkedResources = linkedResources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AlternateView alternateView = (AlternateView) o;
    return ObjectUtils.equals(this.baseUri, alternateView.baseUri) &&
    ObjectUtils.equals(this.linkedResources, alternateView.linkedResources) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(baseUri, linkedResources, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlternateView {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    base64Data: ").append(toIndentedString(getBase64Data())).append("\n");
    sb.append("    contentId: ").append(toIndentedString(getContentId())).append("\n");
    sb.append("    contentType: ").append(toIndentedString(getContentType())).append("\n");
    sb.append("    headers: ").append(toIndentedString(getHeaders())).append("\n");
    sb.append("    baseUri: ").append(toIndentedString(getBaseUri())).append("\n");
    sb.append("    linkedResources: ").append(toIndentedString(getLinkedResources())).append("\n");
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

  public AlternateView() {
    super();
  }

  /**
   * Initializes a new instance of the AlternateView
   * @param base64Data Attachment file content as Base64 string.             
   * @param contentId Attachment content id             
   * @param contentType Content type             
   * @param headers Attachment headers.             
   * @param baseUri Base URI.             
   * @param linkedResources Embedded resources referred to by this alternate view.             
   */
  public AlternateView(
    String base64Data,
    String contentId,
    ContentType contentType,
    Map<String, String> headers,
    String baseUri,
    List<LinkedResource> linkedResources
  ) {
    super();
    setBase64Data(base64Data);
    setContentId(contentId);
    setContentType(contentType);
    setHeaders(headers);
    setBaseUri(baseUri);
    setLinkedResources(linkedResources);
  }

}

