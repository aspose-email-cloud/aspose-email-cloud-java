/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="LinkedResource.java">
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
 * Represents an embedded resource in a message.             
 */
public class LinkedResource extends AttachmentBase {
  @JsonProperty("contentLink")
  private String contentLink = null;

  /**
   * Set contentLink and return this.
   * @param contentLink URI that the resource must match.             
   * @return this
  **/
  public LinkedResource contentLink(String contentLink) {
    this.contentLink = contentLink;
    return this;
  }

  /**
   * URI that the resource must match.             
   * @return contentLink
  **/
  public String getContentLink() {
    return contentLink;
  }  

  /**
   * Set contentLink.
   * @param contentLink URI that the resource must match.             
  **/
  public void setContentLink(String contentLink) {
    this.contentLink = contentLink;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    LinkedResource linkedResource = (LinkedResource) o;
    return ObjectUtils.equals(this.contentLink, linkedResource.contentLink) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(contentLink, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedResource {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    base64Data: ").append(toIndentedString(getBase64Data())).append("\n");
    sb.append("    contentId: ").append(toIndentedString(getContentId())).append("\n");
    sb.append("    contentType: ").append(toIndentedString(getContentType())).append("\n");
    sb.append("    headers: ").append(toIndentedString(getHeaders())).append("\n");
    sb.append("    contentLink: ").append(toIndentedString(getContentLink())).append("\n");
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

  public LinkedResource() {
    super();
  }

  /**
   * Initializes a new instance of the LinkedResource
   * @param base64Data Attachment file content as Base64 string.             
   * @param contentId Attachment content id             
   * @param contentType Content type             
   * @param headers Attachment headers.             
   * @param contentLink URI that the resource must match.             
   */
  public LinkedResource(
    String base64Data,
    String contentId,
    ContentType contentType,
    Map<String, String> headers,
    String contentLink
  ) {
    super();
    setBase64Data(base64Data);
    setContentId(contentId);
    setContentType(contentType);
    setHeaders(headers);
    setContentLink(contentLink);
  }

}

