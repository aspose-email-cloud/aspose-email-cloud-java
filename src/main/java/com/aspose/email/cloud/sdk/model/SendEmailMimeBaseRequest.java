/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="SendEmailMimeBaseRequest.java">
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
 * Send email MIME request             
 */
public class SendEmailMimeBaseRequest extends AccountBaseRequest {
  @JsonProperty("base64MimeMessage")
  private String base64MimeMessage = null;

  /**
   * Set base64MimeMessage and return this.
   * @param base64MimeMessage Email document serialized as MIME             
   * @return this
  **/
  public SendEmailMimeBaseRequest base64MimeMessage(String base64MimeMessage) {
    this.base64MimeMessage = base64MimeMessage;
    return this;
  }

  /**
   * Email document serialized as MIME             
   * @return base64MimeMessage
  **/
  public String getBase64MimeMessage() {
    return base64MimeMessage;
  }  

  /**
   * Set base64MimeMessage.
   * @param base64MimeMessage Email document serialized as MIME             
  **/
  public void setBase64MimeMessage(String base64MimeMessage) {
    this.base64MimeMessage = base64MimeMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    SendEmailMimeBaseRequest sendEmailMimeBaseRequest = (SendEmailMimeBaseRequest) o;
    return ObjectUtils.equals(this.base64MimeMessage, sendEmailMimeBaseRequest.base64MimeMessage) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(base64MimeMessage, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendEmailMimeBaseRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    firstAccount: ").append(toIndentedString(getFirstAccount())).append("\n");
    sb.append("    secondAccount: ").append(toIndentedString(getSecondAccount())).append("\n");
    sb.append("    storageFolder: ").append(toIndentedString(getStorageFolder())).append("\n");
    sb.append("    base64MimeMessage: ").append(toIndentedString(getBase64MimeMessage())).append("\n");
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

  public SendEmailMimeBaseRequest() {
    super();
  }

  /**
   * Initializes a new instance of the SendEmailMimeBaseRequest
   * @param firstAccount First account storage file name             
   * @param secondAccount Additional email account (for example, FirstAccount could be IMAP, and second one could be SMTP)             
   * @param storageFolder Storage folder location of account files             
   * @param base64MimeMessage Email document serialized as MIME             
   */
  public SendEmailMimeBaseRequest(String firstAccount, String secondAccount, StorageFolderLocation storageFolder, String base64MimeMessage) {
    super();
    setFirstAccount(firstAccount);
    setSecondAccount(secondAccount);
    setStorageFolder(storageFolder);
    setBase64MimeMessage(base64MimeMessage);
  }

}

