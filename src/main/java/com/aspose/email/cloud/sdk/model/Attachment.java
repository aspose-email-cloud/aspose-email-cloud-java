/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="Attachment.java">
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
 * Document attachment.             
 */
public class Attachment extends AttachmentBase {
  @JsonProperty("contentDisposition")
  private String contentDisposition = null;

  @JsonProperty("isEmbeddedMessage")
  private Boolean isEmbeddedMessage = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("nameEncoding")
  private String nameEncoding = null;

  @JsonProperty("preferredTextEncoding")
  private String preferredTextEncoding = null;

  /**
   * Set contentDisposition and return this.
   * @param contentDisposition Content-Disposition header. Read only.             
   * @return this
  **/
  public Attachment contentDisposition(String contentDisposition) {
    this.contentDisposition = contentDisposition;
    return this;
  }

  /**
   * Content-Disposition header. Read only.             
   * @return contentDisposition
  **/
  public String getContentDisposition() {
    return contentDisposition;
  }  

  /**
   * Set contentDisposition.
   * @param contentDisposition Content-Disposition header. Read only.             
  **/
  public void setContentDisposition(String contentDisposition) {
    this.contentDisposition = contentDisposition;
  }

  /**
   * Set isEmbeddedMessage and return this.
   * @param isEmbeddedMessage Determines if attachment is an embedded message. Read only.             
   * @return this
  **/
  public Attachment isEmbeddedMessage(Boolean isEmbeddedMessage) {
    this.isEmbeddedMessage = isEmbeddedMessage;
    return this;
  }

  /**
   * Determines if attachment is an embedded message. Read only.             
   * @return isEmbeddedMessage
  **/
  public Boolean isIsEmbeddedMessage() {
    return isEmbeddedMessage;
  }  

  /**
   * Set isEmbeddedMessage.
   * @param isEmbeddedMessage Determines if attachment is an embedded message. Read only.             
  **/
  public void setIsEmbeddedMessage(Boolean isEmbeddedMessage) {
    this.isEmbeddedMessage = isEmbeddedMessage;
  }

  /**
   * Set name and return this.
   * @param name Attachment name.             
   * @return this
  **/
  public Attachment name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Attachment name.             
   * @return name
  **/
  public String getName() {
    return name;
  }  

  /**
   * Set name.
   * @param name Attachment name.             
  **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Set nameEncoding and return this.
   * @param nameEncoding Encoding of attachment name.             
   * @return this
  **/
  public Attachment nameEncoding(String nameEncoding) {
    this.nameEncoding = nameEncoding;
    return this;
  }

  /**
   * Encoding of attachment name.             
   * @return nameEncoding
  **/
  public String getNameEncoding() {
    return nameEncoding;
  }  

  /**
   * Set nameEncoding.
   * @param nameEncoding Encoding of attachment name.             
  **/
  public void setNameEncoding(String nameEncoding) {
    this.nameEncoding = nameEncoding;
  }

  /**
   * Set preferredTextEncoding and return this.
   * @param preferredTextEncoding Preferred text encoding.             
   * @return this
  **/
  public Attachment preferredTextEncoding(String preferredTextEncoding) {
    this.preferredTextEncoding = preferredTextEncoding;
    return this;
  }

  /**
   * Preferred text encoding.             
   * @return preferredTextEncoding
  **/
  public String getPreferredTextEncoding() {
    return preferredTextEncoding;
  }  

  /**
   * Set preferredTextEncoding.
   * @param preferredTextEncoding Preferred text encoding.             
  **/
  public void setPreferredTextEncoding(String preferredTextEncoding) {
    this.preferredTextEncoding = preferredTextEncoding;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    Attachment attachment = (Attachment) o;
    return ObjectUtils.equals(this.contentDisposition, attachment.contentDisposition) &&
    ObjectUtils.equals(this.isEmbeddedMessage, attachment.isEmbeddedMessage) &&
    ObjectUtils.equals(this.name, attachment.name) &&
    ObjectUtils.equals(this.nameEncoding, attachment.nameEncoding) &&
    ObjectUtils.equals(this.preferredTextEncoding, attachment.preferredTextEncoding) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(contentDisposition, isEmbeddedMessage, name, nameEncoding, preferredTextEncoding, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    base64Data: ").append(toIndentedString(getBase64Data())).append("\n");
    sb.append("    contentId: ").append(toIndentedString(getContentId())).append("\n");
    sb.append("    contentType: ").append(toIndentedString(getContentType())).append("\n");
    sb.append("    headers: ").append(toIndentedString(getHeaders())).append("\n");
    sb.append("    contentDisposition: ").append(toIndentedString(getContentDisposition())).append("\n");
    sb.append("    isEmbeddedMessage: ").append(toIndentedString(isIsEmbeddedMessage())).append("\n");
    sb.append("    name: ").append(toIndentedString(getName())).append("\n");
    sb.append("    nameEncoding: ").append(toIndentedString(getNameEncoding())).append("\n");
    sb.append("    preferredTextEncoding: ").append(toIndentedString(getPreferredTextEncoding())).append("\n");
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

  public Attachment() {
    super();
  }

  /**
   * Initializes a new instance of the Attachment
   * @param base64Data Attachment file content as Base64 string.             
   * @param contentId Attachment content id             
   * @param contentType Content type             
   * @param headers Attachment headers.             
   * @param contentDisposition Content-Disposition header. Read only.             
   * @param isEmbeddedMessage Determines if attachment is an embedded message. Read only.             
   * @param name Attachment name.             
   * @param nameEncoding Encoding of attachment name.             
   * @param preferredTextEncoding Preferred text encoding.             
   */
  public Attachment(
    String base64Data,
    String contentId,
    ContentType contentType,
    Map<String, String> headers,
    String contentDisposition,
    Boolean isEmbeddedMessage,
    String name,
    String nameEncoding,
    String preferredTextEncoding
  ) {
    super();
    setBase64Data(base64Data);
    setContentId(contentId);
    setContentType(contentType);
    setHeaders(headers);
    setContentDisposition(contentDisposition);
    setIsEmbeddedMessage(isEmbeddedMessage);
    setName(name);
    setNameEncoding(nameEncoding);
    setPreferredTextEncoding(preferredTextEncoding);
  }

}

