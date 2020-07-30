/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmailThread.java">
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
 * Email messages thread             
 */
public class EmailThread {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("subject")
  private String subject = null;

  @JsonProperty("messages")
  private List<EmailDto> messages = null;

  @JsonProperty("folder")
  private String folder = null;

  /**
   * Set id and return this.
   * @param id Thread identifier             
   * @return this
  **/
  public EmailThread id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Thread identifier             
   * @return id
  **/
  public String getId() {
    return id;
  }  

  /**
   * Set id.
   * @param id Thread identifier             
  **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Set subject and return this.
   * @param subject Thread subject             
   * @return this
  **/
  public EmailThread subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Thread subject             
   * @return subject
  **/
  public String getSubject() {
    return subject;
  }  

  /**
   * Set subject.
   * @param subject Thread subject             
  **/
  public void setSubject(String subject) {
    this.subject = subject;
  }

  /**
   * Set messages and return this.
   * @param messages List of messages in thread             
   * @return this
  **/
  public EmailThread messages(List<EmailDto> messages) {
    this.messages = messages;
    return this;
  }
  /**
   * Add an item to messages and return this.
   * @param messagesItem An item of: List of messages in thread             
   * @return this
  **/
  public EmailThread addMessagesItem(EmailDto messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<EmailDto>();
    }
    this.messages.add(messagesItem);
    return this;
  }

  /**
   * List of messages in thread             
   * @return messages
  **/
  public List<EmailDto> getMessages() {
    return messages;
  }  

  /**
   * Set messages.
   * @param messages List of messages in thread             
  **/
  public void setMessages(List<EmailDto> messages) {
    this.messages = messages;
  }

  /**
   * Set folder and return this.
   * @param folder Thread folder location             
   * @return this
  **/
  public EmailThread folder(String folder) {
    this.folder = folder;
    return this;
  }

  /**
   * Thread folder location             
   * @return folder
  **/
  public String getFolder() {
    return folder;
  }  

  /**
   * Set folder.
   * @param folder Thread folder location             
  **/
  public void setFolder(String folder) {
    this.folder = folder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    EmailThread emailThread = (EmailThread) o;
    return ObjectUtils.equals(this.id, emailThread.id) &&
    ObjectUtils.equals(this.subject, emailThread.subject) &&
    ObjectUtils.equals(this.messages, emailThread.messages) &&
    ObjectUtils.equals(this.folder, emailThread.folder);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(id, subject, messages, folder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailThread {\n");
    
    sb.append("    id: ").append(toIndentedString(getId())).append("\n");
    sb.append("    subject: ").append(toIndentedString(getSubject())).append("\n");
    sb.append("    messages: ").append(toIndentedString(getMessages())).append("\n");
    sb.append("    folder: ").append(toIndentedString(getFolder())).append("\n");
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

  public EmailThread() {
    super();
  }

  /**
   * Initializes a new instance of the EmailThread
   * @param id Thread identifier             
   * @param subject Thread subject             
   * @param messages List of messages in thread             
   * @param folder Thread folder location             
   */
  public EmailThread(
    String id,
    String subject,
    List<EmailDto> messages,
    String folder
  ) {
    super();
    setId(id);
    setSubject(subject);
    setMessages(messages);
    setFolder(folder);
  }

}

