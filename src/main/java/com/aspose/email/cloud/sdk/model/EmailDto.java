/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmailDto.java">
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
 * Email message representation.             
 */
public class EmailDto {
  @JsonProperty("alternateViews")
  private List<AlternateView> alternateViews = null;

  @JsonProperty("attachments")
  private List<Attachment> attachments = null;

  @JsonProperty("bcc")
  private List<MailAddress> bcc = null;

  @JsonProperty("body")
  private String body = null;

  @JsonProperty("bodyEncoding")
  private String bodyEncoding = null;

  @JsonProperty("bodyType")
  private String bodyType = null;

  @JsonProperty("cc")
  private List<MailAddress> cc = null;

  @JsonProperty("date")
  private Date date = null;

  @JsonProperty("deliveryNotificationOptions")
  private List<String> deliveryNotificationOptions = null;

  @JsonProperty("from")
  private MailAddress from = null;

  @JsonProperty("headers")
  private Map<String, String> headers = null;

  @JsonProperty("htmlBody")
  private String htmlBody = null;

  @JsonProperty("htmlBodyText")
  private String htmlBodyText = null;

  @JsonProperty("isBodyHtml")
  private Boolean isBodyHtml = null;

  @JsonProperty("isDraft")
  private Boolean isDraft = null;

  @JsonProperty("isEncrypted")
  private Boolean isEncrypted = null;

  @JsonProperty("isSigned")
  private Boolean isSigned = null;

  @JsonProperty("linkedResources")
  private List<LinkedResource> linkedResources = null;

  @JsonProperty("messageId")
  private String messageId = null;

  @JsonProperty("originalIsTnef")
  private Boolean originalIsTnef = null;

  @JsonProperty("preferredTextEncoding")
  private String preferredTextEncoding = null;

  @JsonProperty("priority")
  private String priority = null;

  @JsonProperty("readReceiptTo")
  private List<MailAddress> readReceiptTo = null;

  @JsonProperty("replyToList")
  private List<MailAddress> replyToList = null;

  @JsonProperty("reversePath")
  private MailAddress reversePath = null;

  @JsonProperty("sender")
  private MailAddress sender = null;

  @JsonProperty("sensitivity")
  private String sensitivity = null;

  @JsonProperty("subject")
  private String subject = null;

  @JsonProperty("subjectEncoding")
  private String subjectEncoding = null;

  @JsonProperty("timeZoneOffset")
  private Long timeZoneOffset = null;

  @JsonProperty("to")
  private List<MailAddress> to = null;

  @JsonProperty("xMailer")
  private String xMailer = null;

  /**
   * Set alternateViews and return this.
   * @param alternateViews Collection of alternate views of message.             
   * @return this
  **/
  public EmailDto alternateViews(List<AlternateView> alternateViews) {
    this.alternateViews = alternateViews;
    return this;
  }
  /**
   * Add an item to alternateViews and return this.
   * @param alternateViewsItem An item of: Collection of alternate views of message.             
   * @return this
  **/
  public EmailDto addAlternateViewsItem(AlternateView alternateViewsItem) {
    if (this.alternateViews == null) {
      this.alternateViews = new ArrayList<AlternateView>();
    }
    this.alternateViews.add(alternateViewsItem);
    return this;
  }

  /**
   * Collection of alternate views of message.             
   * @return alternateViews
  **/
  public List<AlternateView> getAlternateViews() {
    return alternateViews;
  }  

  /**
   * Set alternateViews.
   * @param alternateViews Collection of alternate views of message.             
  **/
  public void setAlternateViews(List<AlternateView> alternateViews) {
    this.alternateViews = alternateViews;
  }

  /**
   * Set attachments and return this.
   * @param attachments Email message attachments.             
   * @return this
  **/
  public EmailDto attachments(List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }
  /**
   * Add an item to attachments and return this.
   * @param attachmentsItem An item of: Email message attachments.             
   * @return this
  **/
  public EmailDto addAttachmentsItem(Attachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<Attachment>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

  /**
   * Email message attachments.             
   * @return attachments
  **/
  public List<Attachment> getAttachments() {
    return attachments;
  }  

  /**
   * Set attachments.
   * @param attachments Email message attachments.             
  **/
  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }

  /**
   * Set bcc and return this.
   * @param bcc BCC recipients.             
   * @return this
  **/
  public EmailDto bcc(List<MailAddress> bcc) {
    this.bcc = bcc;
    return this;
  }
  /**
   * Add an item to bcc and return this.
   * @param bccItem An item of: BCC recipients.             
   * @return this
  **/
  public EmailDto addBccItem(MailAddress bccItem) {
    if (this.bcc == null) {
      this.bcc = new ArrayList<MailAddress>();
    }
    this.bcc.add(bccItem);
    return this;
  }

  /**
   * BCC recipients.             
   * @return bcc
  **/
  public List<MailAddress> getBcc() {
    return bcc;
  }  

  /**
   * Set bcc.
   * @param bcc BCC recipients.             
  **/
  public void setBcc(List<MailAddress> bcc) {
    this.bcc = bcc;
  }

  /**
   * Set body and return this.
   * @param body Email message body as plain text.             
   * @return this
  **/
  public EmailDto body(String body) {
    this.body = body;
    return this;
  }

  /**
   * Email message body as plain text.             
   * @return body
  **/
  public String getBody() {
    return body;
  }  

  /**
   * Set body.
   * @param body Email message body as plain text.             
  **/
  public void setBody(String body) {
    this.body = body;
  }

  /**
   * Set bodyEncoding and return this.
   * @param bodyEncoding Body encoding.             
   * @return this
  **/
  public EmailDto bodyEncoding(String bodyEncoding) {
    this.bodyEncoding = bodyEncoding;
    return this;
  }

  /**
   * Body encoding.             
   * @return bodyEncoding
  **/
  public String getBodyEncoding() {
    return bodyEncoding;
  }  

  /**
   * Set bodyEncoding.
   * @param bodyEncoding Body encoding.             
  **/
  public void setBodyEncoding(String bodyEncoding) {
    this.bodyEncoding = bodyEncoding;
  }

  /**
   * Set bodyType and return this.
   * @param bodyType The content type of message body. Enum, available values: PlainText, Html, Rtf
   * @return this
  **/
  public EmailDto bodyType(String bodyType) {
    this.bodyType = bodyType;
    return this;
  }

  /**
   * The content type of message body. Enum, available values: PlainText, Html, Rtf
   * @return bodyType
  **/
  public String getBodyType() {
    return bodyType;
  }  

  /**
   * Set bodyType.
   * @param bodyType The content type of message body. Enum, available values: PlainText, Html, Rtf
  **/
  public void setBodyType(String bodyType) {
    this.bodyType = bodyType;
  }

  /**
   * Set cc and return this.
   * @param cc CC recipients.             
   * @return this
  **/
  public EmailDto cc(List<MailAddress> cc) {
    this.cc = cc;
    return this;
  }
  /**
   * Add an item to cc and return this.
   * @param ccItem An item of: CC recipients.             
   * @return this
  **/
  public EmailDto addCcItem(MailAddress ccItem) {
    if (this.cc == null) {
      this.cc = new ArrayList<MailAddress>();
    }
    this.cc.add(ccItem);
    return this;
  }

  /**
   * CC recipients.             
   * @return cc
  **/
  public List<MailAddress> getCc() {
    return cc;
  }  

  /**
   * Set cc.
   * @param cc CC recipients.             
  **/
  public void setCc(List<MailAddress> cc) {
    this.cc = cc;
  }

  /**
   * Set date and return this.
   * @param date Message date.             
   * @return this
  **/
  public EmailDto date(Date date) {
    this.date = date;
    return this;
  }

  /**
   * Message date.             
   * @return date
  **/
  public Date getDate() {
    return date;
  }  

  /**
   * Set date.
   * @param date Message date.             
  **/
  public void setDate(Date date) {
    this.date = date;
  }

  /**
   * Set deliveryNotificationOptions and return this.
   * @param deliveryNotificationOptions Delivery notifications. Items: Email delivery notification options. Enum, available values: Delay, Never, None, OnFailure, OnSuccess
   * @return this
  **/
  public EmailDto deliveryNotificationOptions(List<String> deliveryNotificationOptions) {
    this.deliveryNotificationOptions = deliveryNotificationOptions;
    return this;
  }
  /**
   * Add an item to deliveryNotificationOptions and return this.
   * @param deliveryNotificationOptionsItem An item of: Delivery notifications.
   * @return this
  **/
  public EmailDto addDeliveryNotificationOptionsItem(String deliveryNotificationOptionsItem) {
    if (this.deliveryNotificationOptions == null) {
      this.deliveryNotificationOptions = new ArrayList<String>();
    }
    this.deliveryNotificationOptions.add(deliveryNotificationOptionsItem);
    return this;
  }

  /**
   * Delivery notifications. Items: Email delivery notification options. Enum, available values: Delay, Never, None, OnFailure, OnSuccess
   * @return deliveryNotificationOptions
  **/
  public List<String> getDeliveryNotificationOptions() {
    return deliveryNotificationOptions;
  }  

  /**
   * Set deliveryNotificationOptions.
   * @param deliveryNotificationOptions Delivery notifications. Items: Email delivery notification options. Enum, available values: Delay, Never, None, OnFailure, OnSuccess
  **/
  public void setDeliveryNotificationOptions(List<String> deliveryNotificationOptions) {
    this.deliveryNotificationOptions = deliveryNotificationOptions;
  }

  /**
   * Set from and return this.
   * @param from From address.             
   * @return this
  **/
  public EmailDto from(MailAddress from) {
    this.from = from;
    return this;
  }

  /**
   * From address.             
   * @return from
  **/
  public MailAddress getFrom() {
    return from;
  }  

  /**
   * Set from.
   * @param from From address.             
  **/
  public void setFrom(MailAddress from) {
    this.from = from;
  }

  /**
   * Set headers and return this.
   * @param headers Document headers.             
   * @return this
  **/
  public EmailDto headers(Map<String, String> headers) {
    this.headers = headers;
    return this;
  }

  /**
   * Add an item to headers and return this.
   * headers is: Document headers.             
   * @param key An item key
   * @param headersItem An item value
   * @return this
  **/
  public EmailDto putHeadersItem(String key, String headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<String, String>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

  /**
   * Document headers.             
   * @return headers
  **/
  public Map<String, String> getHeaders() {
    return headers;
  }  

  /**
   * Set headers.
   * @param headers Document headers.             
  **/
  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }

  /**
   * Set htmlBody and return this.
   * @param htmlBody HTML body.             
   * @return this
  **/
  public EmailDto htmlBody(String htmlBody) {
    this.htmlBody = htmlBody;
    return this;
  }

  /**
   * HTML body.             
   * @return htmlBody
  **/
  public String getHtmlBody() {
    return htmlBody;
  }  

  /**
   * Set htmlBody.
   * @param htmlBody HTML body.             
  **/
  public void setHtmlBody(String htmlBody) {
    this.htmlBody = htmlBody;
  }

  /**
   * Set htmlBodyText and return this.
   * @param htmlBodyText Html body as plain text. Read only.             
   * @return this
  **/
  public EmailDto htmlBodyText(String htmlBodyText) {
    this.htmlBodyText = htmlBodyText;
    return this;
  }

  /**
   * Html body as plain text. Read only.             
   * @return htmlBodyText
  **/
  public String getHtmlBodyText() {
    return htmlBodyText;
  }  

  /**
   * Set htmlBodyText.
   * @param htmlBodyText Html body as plain text. Read only.             
  **/
  public void setHtmlBodyText(String htmlBodyText) {
    this.htmlBodyText = htmlBodyText;
  }

  /**
   * Set isBodyHtml and return this.
   * @param isBodyHtml Indicates whether the message body is in Html.             
   * @return this
  **/
  public EmailDto isBodyHtml(Boolean isBodyHtml) {
    this.isBodyHtml = isBodyHtml;
    return this;
  }

  /**
   * Indicates whether the message body is in Html.             
   * @return isBodyHtml
  **/
  public Boolean isIsBodyHtml() {
    return isBodyHtml;
  }  

  /**
   * Set isBodyHtml.
   * @param isBodyHtml Indicates whether the message body is in Html.             
  **/
  public void setIsBodyHtml(Boolean isBodyHtml) {
    this.isBodyHtml = isBodyHtml;
  }

  /**
   * Set isDraft and return this.
   * @param isDraft Indicates whether or not a message has been sent.             
   * @return this
  **/
  public EmailDto isDraft(Boolean isDraft) {
    this.isDraft = isDraft;
    return this;
  }

  /**
   * Indicates whether or not a message has been sent.             
   * @return isDraft
  **/
  public Boolean isIsDraft() {
    return isDraft;
  }  

  /**
   * Set isDraft.
   * @param isDraft Indicates whether or not a message has been sent.             
  **/
  public void setIsDraft(Boolean isDraft) {
    this.isDraft = isDraft;
  }

  /**
   * Set isEncrypted and return this.
   * @param isEncrypted Indicates whether the message is encrypted. Read only.             
   * @return this
  **/
  public EmailDto isEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
    return this;
  }

  /**
   * Indicates whether the message is encrypted. Read only.             
   * @return isEncrypted
  **/
  public Boolean isIsEncrypted() {
    return isEncrypted;
  }  

  /**
   * Set isEncrypted.
   * @param isEncrypted Indicates whether the message is encrypted. Read only.             
  **/
  public void setIsEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
  }

  /**
   * Set isSigned and return this.
   * @param isSigned Indicates whether the message is signed. Read only.             
   * @return this
  **/
  public EmailDto isSigned(Boolean isSigned) {
    this.isSigned = isSigned;
    return this;
  }

  /**
   * Indicates whether the message is signed. Read only.             
   * @return isSigned
  **/
  public Boolean isIsSigned() {
    return isSigned;
  }  

  /**
   * Set isSigned.
   * @param isSigned Indicates whether the message is signed. Read only.             
  **/
  public void setIsSigned(Boolean isSigned) {
    this.isSigned = isSigned;
  }

  /**
   * Set linkedResources and return this.
   * @param linkedResources Linked resources of message.             
   * @return this
  **/
  public EmailDto linkedResources(List<LinkedResource> linkedResources) {
    this.linkedResources = linkedResources;
    return this;
  }
  /**
   * Add an item to linkedResources and return this.
   * @param linkedResourcesItem An item of: Linked resources of message.             
   * @return this
  **/
  public EmailDto addLinkedResourcesItem(LinkedResource linkedResourcesItem) {
    if (this.linkedResources == null) {
      this.linkedResources = new ArrayList<LinkedResource>();
    }
    this.linkedResources.add(linkedResourcesItem);
    return this;
  }

  /**
   * Linked resources of message.             
   * @return linkedResources
  **/
  public List<LinkedResource> getLinkedResources() {
    return linkedResources;
  }  

  /**
   * Set linkedResources.
   * @param linkedResources Linked resources of message.             
  **/
  public void setLinkedResources(List<LinkedResource> linkedResources) {
    this.linkedResources = linkedResources;
  }

  /**
   * Set messageId and return this.
   * @param messageId Message id.             
   * @return this
  **/
  public EmailDto messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  /**
   * Message id.             
   * @return messageId
  **/
  public String getMessageId() {
    return messageId;
  }  

  /**
   * Set messageId.
   * @param messageId Message id.             
  **/
  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  /**
   * Set originalIsTnef and return this.
   * @param originalIsTnef Indicates whether original EML message is in TNEF format. Read only.             
   * @return this
  **/
  public EmailDto originalIsTnef(Boolean originalIsTnef) {
    this.originalIsTnef = originalIsTnef;
    return this;
  }

  /**
   * Indicates whether original EML message is in TNEF format. Read only.             
   * @return originalIsTnef
  **/
  public Boolean isOriginalIsTnef() {
    return originalIsTnef;
  }  

  /**
   * Set originalIsTnef.
   * @param originalIsTnef Indicates whether original EML message is in TNEF format. Read only.             
  **/
  public void setOriginalIsTnef(Boolean originalIsTnef) {
    this.originalIsTnef = originalIsTnef;
  }

  /**
   * Set preferredTextEncoding and return this.
   * @param preferredTextEncoding Preferred encoding.             
   * @return this
  **/
  public EmailDto preferredTextEncoding(String preferredTextEncoding) {
    this.preferredTextEncoding = preferredTextEncoding;
    return this;
  }

  /**
   * Preferred encoding.             
   * @return preferredTextEncoding
  **/
  public String getPreferredTextEncoding() {
    return preferredTextEncoding;
  }  

  /**
   * Set preferredTextEncoding.
   * @param preferredTextEncoding Preferred encoding.             
  **/
  public void setPreferredTextEncoding(String preferredTextEncoding) {
    this.preferredTextEncoding = preferredTextEncoding;
  }

  /**
   * Set priority and return this.
   * @param priority Email priority status. Enum, available values: High, Low, Normal
   * @return this
  **/
  public EmailDto priority(String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Email priority status. Enum, available values: High, Low, Normal
   * @return priority
  **/
  public String getPriority() {
    return priority;
  }  

  /**
   * Set priority.
   * @param priority Email priority status. Enum, available values: High, Low, Normal
  **/
  public void setPriority(String priority) {
    this.priority = priority;
  }

  /**
   * Set readReceiptTo and return this.
   * @param readReceiptTo Read receipt addresses.             
   * @return this
  **/
  public EmailDto readReceiptTo(List<MailAddress> readReceiptTo) {
    this.readReceiptTo = readReceiptTo;
    return this;
  }
  /**
   * Add an item to readReceiptTo and return this.
   * @param readReceiptToItem An item of: Read receipt addresses.             
   * @return this
  **/
  public EmailDto addReadReceiptToItem(MailAddress readReceiptToItem) {
    if (this.readReceiptTo == null) {
      this.readReceiptTo = new ArrayList<MailAddress>();
    }
    this.readReceiptTo.add(readReceiptToItem);
    return this;
  }

  /**
   * Read receipt addresses.             
   * @return readReceiptTo
  **/
  public List<MailAddress> getReadReceiptTo() {
    return readReceiptTo;
  }  

  /**
   * Set readReceiptTo.
   * @param readReceiptTo Read receipt addresses.             
  **/
  public void setReadReceiptTo(List<MailAddress> readReceiptTo) {
    this.readReceiptTo = readReceiptTo;
  }

  /**
   * Set replyToList and return this.
   * @param replyToList The list of addresses to reply to for the mail message.             
   * @return this
  **/
  public EmailDto replyToList(List<MailAddress> replyToList) {
    this.replyToList = replyToList;
    return this;
  }
  /**
   * Add an item to replyToList and return this.
   * @param replyToListItem An item of: The list of addresses to reply to for the mail message.             
   * @return this
  **/
  public EmailDto addReplyToListItem(MailAddress replyToListItem) {
    if (this.replyToList == null) {
      this.replyToList = new ArrayList<MailAddress>();
    }
    this.replyToList.add(replyToListItem);
    return this;
  }

  /**
   * The list of addresses to reply to for the mail message.             
   * @return replyToList
  **/
  public List<MailAddress> getReplyToList() {
    return replyToList;
  }  

  /**
   * Set replyToList.
   * @param replyToList The list of addresses to reply to for the mail message.             
  **/
  public void setReplyToList(List<MailAddress> replyToList) {
    this.replyToList = replyToList;
  }

  /**
   * Set reversePath and return this.
   * @param reversePath ReversePath address.             
   * @return this
  **/
  public EmailDto reversePath(MailAddress reversePath) {
    this.reversePath = reversePath;
    return this;
  }

  /**
   * ReversePath address.             
   * @return reversePath
  **/
  public MailAddress getReversePath() {
    return reversePath;
  }  

  /**
   * Set reversePath.
   * @param reversePath ReversePath address.             
  **/
  public void setReversePath(MailAddress reversePath) {
    this.reversePath = reversePath;
  }

  /**
   * Set sender and return this.
   * @param sender Sender address.             
   * @return this
  **/
  public EmailDto sender(MailAddress sender) {
    this.sender = sender;
    return this;
  }

  /**
   * Sender address.             
   * @return sender
  **/
  public MailAddress getSender() {
    return sender;
  }  

  /**
   * Set sender.
   * @param sender Sender address.             
  **/
  public void setSender(MailAddress sender) {
    this.sender = sender;
  }

  /**
   * Set sensitivity and return this.
   * @param sensitivity Specifies the sensitivity of a MailMessage. Enum, available values: None, Normal, Personal, Private, CompanyConfidential
   * @return this
  **/
  public EmailDto sensitivity(String sensitivity) {
    this.sensitivity = sensitivity;
    return this;
  }

  /**
   * Specifies the sensitivity of a MailMessage. Enum, available values: None, Normal, Personal, Private, CompanyConfidential
   * @return sensitivity
  **/
  public String getSensitivity() {
    return sensitivity;
  }  

  /**
   * Set sensitivity.
   * @param sensitivity Specifies the sensitivity of a MailMessage. Enum, available values: None, Normal, Personal, Private, CompanyConfidential
  **/
  public void setSensitivity(String sensitivity) {
    this.sensitivity = sensitivity;
  }

  /**
   * Set subject and return this.
   * @param subject Message subject.             
   * @return this
  **/
  public EmailDto subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Message subject.             
   * @return subject
  **/
  public String getSubject() {
    return subject;
  }  

  /**
   * Set subject.
   * @param subject Message subject.             
  **/
  public void setSubject(String subject) {
    this.subject = subject;
  }

  /**
   * Set subjectEncoding and return this.
   * @param subjectEncoding Subject encoding.             
   * @return this
  **/
  public EmailDto subjectEncoding(String subjectEncoding) {
    this.subjectEncoding = subjectEncoding;
    return this;
  }

  /**
   * Subject encoding.             
   * @return subjectEncoding
  **/
  public String getSubjectEncoding() {
    return subjectEncoding;
  }  

  /**
   * Set subjectEncoding.
   * @param subjectEncoding Subject encoding.             
  **/
  public void setSubjectEncoding(String subjectEncoding) {
    this.subjectEncoding = subjectEncoding;
  }

  /**
   * Set timeZoneOffset and return this.
   * @param timeZoneOffset Coordinated Universal Time (UTC) offset for the message dates. This property defines the time zone difference, between the local time and UTC represented as count of ticks (10 000 per millisecond).             
   * @return this
  **/
  public EmailDto timeZoneOffset(Long timeZoneOffset) {
    this.timeZoneOffset = timeZoneOffset;
    return this;
  }

  /**
   * Coordinated Universal Time (UTC) offset for the message dates. This property defines the time zone difference, between the local time and UTC represented as count of ticks (10 000 per millisecond).             
   * @return timeZoneOffset
  **/
  public Long getTimeZoneOffset() {
    return timeZoneOffset;
  }  

  /**
   * Set timeZoneOffset.
   * @param timeZoneOffset Coordinated Universal Time (UTC) offset for the message dates. This property defines the time zone difference, between the local time and UTC represented as count of ticks (10 000 per millisecond).             
  **/
  public void setTimeZoneOffset(Long timeZoneOffset) {
    this.timeZoneOffset = timeZoneOffset;
  }

  /**
   * Set to and return this.
   * @param to The address collection that contains the recipients of message.             
   * @return this
  **/
  public EmailDto to(List<MailAddress> to) {
    this.to = to;
    return this;
  }
  /**
   * Add an item to to and return this.
   * @param toItem An item of: The address collection that contains the recipients of message.             
   * @return this
  **/
  public EmailDto addToItem(MailAddress toItem) {
    if (this.to == null) {
      this.to = new ArrayList<MailAddress>();
    }
    this.to.add(toItem);
    return this;
  }

  /**
   * The address collection that contains the recipients of message.             
   * @return to
  **/
  public List<MailAddress> getTo() {
    return to;
  }  

  /**
   * Set to.
   * @param to The address collection that contains the recipients of message.             
  **/
  public void setTo(List<MailAddress> to) {
    this.to = to;
  }

  /**
   * Set xMailer and return this.
   * @param xMailer The X-Mailer the software that created the e-mail message.             
   * @return this
  **/
  public EmailDto xMailer(String xMailer) {
    this.xMailer = xMailer;
    return this;
  }

  /**
   * The X-Mailer the software that created the e-mail message.             
   * @return xMailer
  **/
  public String getXMailer() {
    return xMailer;
  }  

  /**
   * Set xMailer.
   * @param xMailer The X-Mailer the software that created the e-mail message.             
  **/
  public void setXMailer(String xMailer) {
    this.xMailer = xMailer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    EmailDto emailDto = (EmailDto) o;
    return ObjectUtils.equals(this.alternateViews, emailDto.alternateViews) &&
    ObjectUtils.equals(this.attachments, emailDto.attachments) &&
    ObjectUtils.equals(this.bcc, emailDto.bcc) &&
    ObjectUtils.equals(this.body, emailDto.body) &&
    ObjectUtils.equals(this.bodyEncoding, emailDto.bodyEncoding) &&
    ObjectUtils.equals(this.bodyType, emailDto.bodyType) &&
    ObjectUtils.equals(this.cc, emailDto.cc) &&
    ObjectUtils.equals(this.date, emailDto.date) &&
    ObjectUtils.equals(this.deliveryNotificationOptions, emailDto.deliveryNotificationOptions) &&
    ObjectUtils.equals(this.from, emailDto.from) &&
    ObjectUtils.equals(this.headers, emailDto.headers) &&
    ObjectUtils.equals(this.htmlBody, emailDto.htmlBody) &&
    ObjectUtils.equals(this.htmlBodyText, emailDto.htmlBodyText) &&
    ObjectUtils.equals(this.isBodyHtml, emailDto.isBodyHtml) &&
    ObjectUtils.equals(this.isDraft, emailDto.isDraft) &&
    ObjectUtils.equals(this.isEncrypted, emailDto.isEncrypted) &&
    ObjectUtils.equals(this.isSigned, emailDto.isSigned) &&
    ObjectUtils.equals(this.linkedResources, emailDto.linkedResources) &&
    ObjectUtils.equals(this.messageId, emailDto.messageId) &&
    ObjectUtils.equals(this.originalIsTnef, emailDto.originalIsTnef) &&
    ObjectUtils.equals(this.preferredTextEncoding, emailDto.preferredTextEncoding) &&
    ObjectUtils.equals(this.priority, emailDto.priority) &&
    ObjectUtils.equals(this.readReceiptTo, emailDto.readReceiptTo) &&
    ObjectUtils.equals(this.replyToList, emailDto.replyToList) &&
    ObjectUtils.equals(this.reversePath, emailDto.reversePath) &&
    ObjectUtils.equals(this.sender, emailDto.sender) &&
    ObjectUtils.equals(this.sensitivity, emailDto.sensitivity) &&
    ObjectUtils.equals(this.subject, emailDto.subject) &&
    ObjectUtils.equals(this.subjectEncoding, emailDto.subjectEncoding) &&
    ObjectUtils.equals(this.timeZoneOffset, emailDto.timeZoneOffset) &&
    ObjectUtils.equals(this.to, emailDto.to) &&
    ObjectUtils.equals(this.xMailer, emailDto.xMailer);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(alternateViews, attachments, bcc, body, bodyEncoding, bodyType, cc, date, deliveryNotificationOptions, from, headers, htmlBody, htmlBodyText, isBodyHtml, isDraft, isEncrypted, isSigned, linkedResources, messageId, originalIsTnef, preferredTextEncoding, priority, readReceiptTo, replyToList, reversePath, sender, sensitivity, subject, subjectEncoding, timeZoneOffset, to, xMailer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailDto {\n");
    
    sb.append("    alternateViews: ").append(toIndentedString(getAlternateViews())).append("\n");
    sb.append("    attachments: ").append(toIndentedString(getAttachments())).append("\n");
    sb.append("    bcc: ").append(toIndentedString(getBcc())).append("\n");
    sb.append("    body: ").append(toIndentedString(getBody())).append("\n");
    sb.append("    bodyEncoding: ").append(toIndentedString(getBodyEncoding())).append("\n");
    sb.append("    bodyType: ").append(toIndentedString(getBodyType())).append("\n");
    sb.append("    cc: ").append(toIndentedString(getCc())).append("\n");
    sb.append("    date: ").append(toIndentedString(getDate())).append("\n");
    sb.append("    deliveryNotificationOptions: ").append(toIndentedString(getDeliveryNotificationOptions())).append("\n");
    sb.append("    from: ").append(toIndentedString(getFrom())).append("\n");
    sb.append("    headers: ").append(toIndentedString(getHeaders())).append("\n");
    sb.append("    htmlBody: ").append(toIndentedString(getHtmlBody())).append("\n");
    sb.append("    htmlBodyText: ").append(toIndentedString(getHtmlBodyText())).append("\n");
    sb.append("    isBodyHtml: ").append(toIndentedString(isIsBodyHtml())).append("\n");
    sb.append("    isDraft: ").append(toIndentedString(isIsDraft())).append("\n");
    sb.append("    isEncrypted: ").append(toIndentedString(isIsEncrypted())).append("\n");
    sb.append("    isSigned: ").append(toIndentedString(isIsSigned())).append("\n");
    sb.append("    linkedResources: ").append(toIndentedString(getLinkedResources())).append("\n");
    sb.append("    messageId: ").append(toIndentedString(getMessageId())).append("\n");
    sb.append("    originalIsTnef: ").append(toIndentedString(isOriginalIsTnef())).append("\n");
    sb.append("    preferredTextEncoding: ").append(toIndentedString(getPreferredTextEncoding())).append("\n");
    sb.append("    priority: ").append(toIndentedString(getPriority())).append("\n");
    sb.append("    readReceiptTo: ").append(toIndentedString(getReadReceiptTo())).append("\n");
    sb.append("    replyToList: ").append(toIndentedString(getReplyToList())).append("\n");
    sb.append("    reversePath: ").append(toIndentedString(getReversePath())).append("\n");
    sb.append("    sender: ").append(toIndentedString(getSender())).append("\n");
    sb.append("    sensitivity: ").append(toIndentedString(getSensitivity())).append("\n");
    sb.append("    subject: ").append(toIndentedString(getSubject())).append("\n");
    sb.append("    subjectEncoding: ").append(toIndentedString(getSubjectEncoding())).append("\n");
    sb.append("    timeZoneOffset: ").append(toIndentedString(getTimeZoneOffset())).append("\n");
    sb.append("    to: ").append(toIndentedString(getTo())).append("\n");
    sb.append("    xMailer: ").append(toIndentedString(getXMailer())).append("\n");
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

  public EmailDto() {
    super();
  }

  /**
   * Initializes a new instance of the EmailDto
   * @param alternateViews Collection of alternate views of message.             
   * @param attachments Email message attachments.             
   * @param bcc BCC recipients.             
   * @param body Email message body as plain text.             
   * @param bodyEncoding Body encoding.             
   * @param bodyType The content type of message body. Enum, available values: PlainText, Html, Rtf
   * @param cc CC recipients.             
   * @param date Message date.             
   * @param deliveryNotificationOptions Delivery notifications. Items: Email delivery notification options. Enum, available values: Delay, Never, None, OnFailure, OnSuccess
   * @param from From address.             
   * @param headers Document headers.             
   * @param htmlBody HTML body.             
   * @param htmlBodyText Html body as plain text. Read only.             
   * @param isBodyHtml Indicates whether the message body is in Html.             
   * @param isDraft Indicates whether or not a message has been sent.             
   * @param isEncrypted Indicates whether the message is encrypted. Read only.             
   * @param isSigned Indicates whether the message is signed. Read only.             
   * @param linkedResources Linked resources of message.             
   * @param messageId Message id.             
   * @param originalIsTnef Indicates whether original EML message is in TNEF format. Read only.             
   * @param preferredTextEncoding Preferred encoding.             
   * @param priority Email priority status. Enum, available values: High, Low, Normal
   * @param readReceiptTo Read receipt addresses.             
   * @param replyToList The list of addresses to reply to for the mail message.             
   * @param reversePath ReversePath address.             
   * @param sender Sender address.             
   * @param sensitivity Specifies the sensitivity of a MailMessage. Enum, available values: None, Normal, Personal, Private, CompanyConfidential
   * @param subject Message subject.             
   * @param subjectEncoding Subject encoding.             
   * @param timeZoneOffset Coordinated Universal Time (UTC) offset for the message dates. This property defines the time zone difference, between the local time and UTC represented as count of ticks (10 000 per millisecond).             
   * @param to The address collection that contains the recipients of message.             
   * @param xMailer The X-Mailer the software that created the e-mail message.             
   */
  public EmailDto(List<AlternateView> alternateViews, List<Attachment> attachments, List<MailAddress> bcc, String body, String bodyEncoding, String bodyType, List<MailAddress> cc, Date date, List<String> deliveryNotificationOptions, MailAddress from, Map<String, String> headers, String htmlBody, String htmlBodyText, Boolean isBodyHtml, Boolean isDraft, Boolean isEncrypted, Boolean isSigned, List<LinkedResource> linkedResources, String messageId, Boolean originalIsTnef, String preferredTextEncoding, String priority, List<MailAddress> readReceiptTo, List<MailAddress> replyToList, MailAddress reversePath, MailAddress sender, String sensitivity, String subject, String subjectEncoding, Long timeZoneOffset, List<MailAddress> to, String xMailer) {
    super();
    setAlternateViews(alternateViews);
    setAttachments(attachments);
    setBcc(bcc);
    setBody(body);
    setBodyEncoding(bodyEncoding);
    setBodyType(bodyType);
    setCc(cc);
    setDate(date);
    setDeliveryNotificationOptions(deliveryNotificationOptions);
    setFrom(from);
    setHeaders(headers);
    setHtmlBody(htmlBody);
    setHtmlBodyText(htmlBodyText);
    setIsBodyHtml(isBodyHtml);
    setIsDraft(isDraft);
    setIsEncrypted(isEncrypted);
    setIsSigned(isSigned);
    setLinkedResources(linkedResources);
    setMessageId(messageId);
    setOriginalIsTnef(originalIsTnef);
    setPreferredTextEncoding(preferredTextEncoding);
    setPriority(priority);
    setReadReceiptTo(readReceiptTo);
    setReplyToList(replyToList);
    setReversePath(reversePath);
    setSender(sender);
    setSensitivity(sensitivity);
    setSubject(subject);
    setSubjectEncoding(subjectEncoding);
    setTimeZoneOffset(timeZoneOffset);
    setTo(to);
    setXMailer(xMailer);
  }

}

