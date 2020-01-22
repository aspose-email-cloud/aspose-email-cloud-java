/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AttachmentBase.java">
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
 * AttachmentBase class             
 */
public class AttachmentBase {
  @JsonProperty("base64Data")
  private String base64Data = null;

  @JsonProperty("contentId")
  private String contentId = null;

  @JsonProperty("contentType")
  private ContentType contentType = null;

  @JsonProperty("headers")
  private Map<String, String> headers = null;

  public AttachmentBase base64Data(String base64Data) {
    this.base64Data = base64Data;
    return this;
  }

  /**
   * Attachment file content as Base64 string.             
   * @return base64Data
  **/
  public String getBase64Data() {
    return base64Data;
  }  

  public void setBase64Data(String base64Data) {
    this.base64Data = base64Data;
  }

  public AttachmentBase contentId(String contentId) {
    this.contentId = contentId;
    return this;
  }

  /**
   * Attachment content id             
   * @return contentId
  **/
  public String getContentId() {
    return contentId;
  }  

  public void setContentId(String contentId) {
    this.contentId = contentId;
  }

  public AttachmentBase contentType(ContentType contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Content type             
   * @return contentType
  **/
  public ContentType getContentType() {
    return contentType;
  }  

  public void setContentType(ContentType contentType) {
    this.contentType = contentType;
  }

  public AttachmentBase headers(Map<String, String> headers) {
    this.headers = headers;
    return this;
  }

  public AttachmentBase putHeadersItem(String key, String headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<String, String>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

  /**
   * Attachment headers.             
   * @return headers
  **/
  public Map<String, String> getHeaders() {
    return headers;
  }  

  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AttachmentBase attachmentBase = (AttachmentBase) o;
    return ObjectUtils.equals(this.base64Data, attachmentBase.base64Data) &&
    ObjectUtils.equals(this.contentId, attachmentBase.contentId) &&
    ObjectUtils.equals(this.contentType, attachmentBase.contentType) &&
    ObjectUtils.equals(this.headers, attachmentBase.headers);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(base64Data, contentId, contentType, headers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentBase {\n");
    
    sb.append("    base64Data: ").append(toIndentedString(getBase64Data())).append("\n");
    sb.append("    contentId: ").append(toIndentedString(getContentId())).append("\n");
    sb.append("    contentType: ").append(toIndentedString(getContentType())).append("\n");
    sb.append("    headers: ").append(toIndentedString(getHeaders())).append("\n");
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

  public AttachmentBase() {
    super();
  }

  /**
   * Initializes a new instance of the AttachmentBase
   * @param base64Data Attachment file content as Base64 string.             
   * @param contentId Attachment content id             
   * @param contentType Content type             
   * @param headers Attachment headers.             
   */
  public AttachmentBase(String base64Data, String contentId, ContentType contentType, Map<String, String> headers) {
    super();
    setBase64Data(base64Data);
    setContentId(contentId);
    setContentType(contentType);
    setHeaders(headers);
  }

}

