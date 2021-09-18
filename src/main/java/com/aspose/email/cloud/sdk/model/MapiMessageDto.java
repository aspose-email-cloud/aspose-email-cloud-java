/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiMessageDto.java">
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
 * Represents an Outlook Message format document.             
 */
public class MapiMessageDto extends MapiMessageItemBaseDto {
  @JsonProperty("messageBody")
  private String messageBody = null;
  @JsonProperty("clientSubmitTime")
  private Date clientSubmitTime = null;
  @JsonProperty("conversationTopic")
  private String conversationTopic = null;
  @JsonProperty("deliveryTime")
  private Date deliveryTime = null;
  @JsonProperty("displayBcc")
  private String displayBcc = null;
  @JsonProperty("displayCc")
  private String displayCc = null;
  @JsonProperty("displayName")
  private String displayName = null;
  @JsonProperty("displayNamePrefix")
  private String displayNamePrefix = null;
  @JsonProperty("displayTo")
  private String displayTo = null;
  @JsonProperty("flags")
  private List<String> flags = null;
  @JsonProperty("headers")
  private Map<String, String> headers = null;
  @JsonProperty("internetMessageId")
  private String internetMessageId = null;
  @JsonProperty("messageFormat")
  private String messageFormat = null;
  @JsonProperty("normalizedSubject")
  private String normalizedSubject = null;
  @JsonProperty("readReceiptRequested")
  private Boolean readReceiptRequested = null;
  @JsonProperty("replyTo")
  private String replyTo = null;
  @JsonProperty("senderAddressType")
  private String senderAddressType = null;
  @JsonProperty("senderEmailAddress")
  private String senderEmailAddress = null;
  @JsonProperty("senderName")
  private String senderName = null;
  @JsonProperty("senderSmtpAddress")
  private String senderSmtpAddress = null;
  @JsonProperty("sentRepresentingAddressType")
  private String sentRepresentingAddressType = null;
  @JsonProperty("sentRepresentingEmailAddress")
  private String sentRepresentingEmailAddress = null;
  @JsonProperty("sentRepresentingName")
  private String sentRepresentingName = null;
  @JsonProperty("sentRepresentingSmtpAddress")
  private String sentRepresentingSmtpAddress = null;
  @JsonProperty("transportMessageHeaders")
  private String transportMessageHeaders = null;

  /**
   * Set messageBody and return this.
   * @param messageBody Message text             
   * @return this
  **/
  public MapiMessageDto messageBody(String messageBody) {
    this.messageBody = messageBody;
    return this;
  }

  /**
   * Message text             
   * @return messageBody
  **/
  public String getMessageBody() {
    return messageBody;
  }  

  /**
   * Set messageBody.
   * @param messageBody Message text             
  **/
  public void setMessageBody(String messageBody) {
    this.messageBody = messageBody;
  }


  /**
   * Set clientSubmitTime and return this.
   * @param clientSubmitTime Date and time the message sender submitted a message.             
   * @return this
  **/
  public MapiMessageDto clientSubmitTime(Date clientSubmitTime) {
    this.clientSubmitTime = clientSubmitTime;
    return this;
  }

  /**
   * Date and time the message sender submitted a message.             
   * @return clientSubmitTime
  **/
  public Date getClientSubmitTime() {
    return clientSubmitTime;
  }  

  /**
   * Set clientSubmitTime.
   * @param clientSubmitTime Date and time the message sender submitted a message.             
  **/
  public void setClientSubmitTime(Date clientSubmitTime) {
    this.clientSubmitTime = clientSubmitTime;
  }


  /**
   * Set conversationTopic and return this.
   * @param conversationTopic Topic of the first message in a conversation thread.             
   * @return this
  **/
  public MapiMessageDto conversationTopic(String conversationTopic) {
    this.conversationTopic = conversationTopic;
    return this;
  }

  /**
   * Topic of the first message in a conversation thread.             
   * @return conversationTopic
  **/
  public String getConversationTopic() {
    return conversationTopic;
  }  

  /**
   * Set conversationTopic.
   * @param conversationTopic Topic of the first message in a conversation thread.             
  **/
  public void setConversationTopic(String conversationTopic) {
    this.conversationTopic = conversationTopic;
  }


  /**
   * Set deliveryTime and return this.
   * @param deliveryTime Date and time a message was delivered.             
   * @return this
  **/
  public MapiMessageDto deliveryTime(Date deliveryTime) {
    this.deliveryTime = deliveryTime;
    return this;
  }

  /**
   * Date and time a message was delivered.             
   * @return deliveryTime
  **/
  public Date getDeliveryTime() {
    return deliveryTime;
  }  

  /**
   * Set deliveryTime.
   * @param deliveryTime Date and time a message was delivered.             
  **/
  public void setDeliveryTime(Date deliveryTime) {
    this.deliveryTime = deliveryTime;
  }


  /**
   * Set displayBcc and return this.
   * @param displayBcc List of the display names of any blind carbon copy (BCC) message recipients, separated by semicolons (;).             
   * @return this
  **/
  public MapiMessageDto displayBcc(String displayBcc) {
    this.displayBcc = displayBcc;
    return this;
  }

  /**
   * List of the display names of any blind carbon copy (BCC) message recipients, separated by semicolons (;).             
   * @return displayBcc
  **/
  public String getDisplayBcc() {
    return displayBcc;
  }  

  /**
   * Set displayBcc.
   * @param displayBcc List of the display names of any blind carbon copy (BCC) message recipients, separated by semicolons (;).             
  **/
  public void setDisplayBcc(String displayBcc) {
    this.displayBcc = displayBcc;
  }


  /**
   * Set displayCc and return this.
   * @param displayCc List of the display names of any carbon copy (CC) message recipients, separated by semicolons (;).             
   * @return this
  **/
  public MapiMessageDto displayCc(String displayCc) {
    this.displayCc = displayCc;
    return this;
  }

  /**
   * List of the display names of any carbon copy (CC) message recipients, separated by semicolons (;).             
   * @return displayCc
  **/
  public String getDisplayCc() {
    return displayCc;
  }  

  /**
   * Set displayCc.
   * @param displayCc List of the display names of any carbon copy (CC) message recipients, separated by semicolons (;).             
  **/
  public void setDisplayCc(String displayCc) {
    this.displayCc = displayCc;
  }


  /**
   * Set displayName and return this.
   * @param displayName Display name for the message.             
   * @return this
  **/
  public MapiMessageDto displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Display name for the message.             
   * @return displayName
  **/
  public String getDisplayName() {
    return displayName;
  }  

  /**
   * Set displayName.
   * @param displayName Display name for the message.             
  **/
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  /**
   * Set displayNamePrefix and return this.
   * @param displayNamePrefix Prefix of the display name.             
   * @return this
  **/
  public MapiMessageDto displayNamePrefix(String displayNamePrefix) {
    this.displayNamePrefix = displayNamePrefix;
    return this;
  }

  /**
   * Prefix of the display name.             
   * @return displayNamePrefix
  **/
  public String getDisplayNamePrefix() {
    return displayNamePrefix;
  }  

  /**
   * Set displayNamePrefix.
   * @param displayNamePrefix Prefix of the display name.             
  **/
  public void setDisplayNamePrefix(String displayNamePrefix) {
    this.displayNamePrefix = displayNamePrefix;
  }


  /**
   * Set displayTo and return this.
   * @param displayTo List of the display names of the primary (To) message recipients, separated by semicolons (;).             
   * @return this
  **/
  public MapiMessageDto displayTo(String displayTo) {
    this.displayTo = displayTo;
    return this;
  }

  /**
   * List of the display names of the primary (To) message recipients, separated by semicolons (;).             
   * @return displayTo
  **/
  public String getDisplayTo() {
    return displayTo;
  }  

  /**
   * Set displayTo.
   * @param displayTo List of the display names of the primary (To) message recipients, separated by semicolons (;).             
  **/
  public void setDisplayTo(String displayTo) {
    this.displayTo = displayTo;
  }


  /**
   * Set flags and return this.
   * @param flags Message flags.              Items: Mapi message flags. Enum, available values: MsgFlagZero, MsgFlagRead, MsgFlagUnmodified, MsgFlagSubmit, MsgFlagUnsent, MsgFlagHasAttach, MsgFlagFromMe, MsgFlagAssociated, MsgFlagResend, MsgFlagNotifyRead, MsgFlagNotifyUnread, MsgFlagEverRead, MsgFlagOriginX400, MsgFlagOriginInternet, MsgFlagOriginMiscExt
   * @return this
  **/
  public MapiMessageDto flags(List<String> flags) {
    this.flags = flags;
    return this;
  }
  /**
   * Add an item to flags and return this.
   * @param flagsItem An item of: Message flags.             
   * @return this
  **/
  public MapiMessageDto addFlagsItem(String flagsItem) {
    if (this.flags == null) {
      this.flags = new ArrayList<String>();
    }
    this.flags.add(flagsItem);
    return this;
  }

  /**
   * Message flags.              Items: Mapi message flags. Enum, available values: MsgFlagZero, MsgFlagRead, MsgFlagUnmodified, MsgFlagSubmit, MsgFlagUnsent, MsgFlagHasAttach, MsgFlagFromMe, MsgFlagAssociated, MsgFlagResend, MsgFlagNotifyRead, MsgFlagNotifyUnread, MsgFlagEverRead, MsgFlagOriginX400, MsgFlagOriginInternet, MsgFlagOriginMiscExt
   * @return flags
  **/
  public List<String> getFlags() {
    return flags;
  }  

  /**
   * Set flags.
   * @param flags Message flags.              Items: Mapi message flags. Enum, available values: MsgFlagZero, MsgFlagRead, MsgFlagUnmodified, MsgFlagSubmit, MsgFlagUnsent, MsgFlagHasAttach, MsgFlagFromMe, MsgFlagAssociated, MsgFlagResend, MsgFlagNotifyRead, MsgFlagNotifyUnread, MsgFlagEverRead, MsgFlagOriginX400, MsgFlagOriginInternet, MsgFlagOriginMiscExt
  **/
  public void setFlags(List<String> flags) {
    this.flags = flags;
  }


  /**
   * Set headers and return this.
   * @param headers Transport message headers             
   * @return this
  **/
  public MapiMessageDto headers(Map<String, String> headers) {
    this.headers = headers;
    return this;
  }

  /**
   * Add an item to headers and return this.
   * headers is: Transport message headers             
   * @param key An item key
   * @param headersItem An item value
   * @return this
  **/
  public MapiMessageDto putHeadersItem(String key, String headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<String, String>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

  /**
   * Transport message headers             
   * @return headers
  **/
  public Map<String, String> getHeaders() {
    return headers;
  }  

  /**
   * Set headers.
   * @param headers Transport message headers             
  **/
  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }


  /**
   * Set internetMessageId and return this.
   * @param internetMessageId Internet message id of the message.             
   * @return this
  **/
  public MapiMessageDto internetMessageId(String internetMessageId) {
    this.internetMessageId = internetMessageId;
    return this;
  }

  /**
   * Internet message id of the message.             
   * @return internetMessageId
  **/
  public String getInternetMessageId() {
    return internetMessageId;
  }  

  /**
   * Set internetMessageId.
   * @param internetMessageId Internet message id of the message.             
  **/
  public void setInternetMessageId(String internetMessageId) {
    this.internetMessageId = internetMessageId;
  }


  /**
   * Set messageFormat and return this.
   * @param messageFormat Represents outlook message format. Enum, available values: Ascii, Unicode
   * @return this
  **/
  public MapiMessageDto messageFormat(String messageFormat) {
    this.messageFormat = messageFormat;
    return this;
  }

  /**
   * Represents outlook message format. Enum, available values: Ascii, Unicode
   * @return messageFormat
  **/
  public String getMessageFormat() {
    return messageFormat;
  }  

  /**
   * Set messageFormat.
   * @param messageFormat Represents outlook message format. Enum, available values: Ascii, Unicode
  **/
  public void setMessageFormat(String messageFormat) {
    this.messageFormat = messageFormat;
  }


  /**
   * Set normalizedSubject and return this.
   * @param normalizedSubject Normalized subject of the message.             
   * @return this
  **/
  public MapiMessageDto normalizedSubject(String normalizedSubject) {
    this.normalizedSubject = normalizedSubject;
    return this;
  }

  /**
   * Normalized subject of the message.             
   * @return normalizedSubject
  **/
  public String getNormalizedSubject() {
    return normalizedSubject;
  }  

  /**
   * Set normalizedSubject.
   * @param normalizedSubject Normalized subject of the message.             
  **/
  public void setNormalizedSubject(String normalizedSubject) {
    this.normalizedSubject = normalizedSubject;
  }


  /**
   * Set readReceiptRequested and return this.
   * @param readReceiptRequested Value indicating whether the read receipt is requested.
   * @return this
  **/
  public MapiMessageDto readReceiptRequested(Boolean readReceiptRequested) {
    this.readReceiptRequested = readReceiptRequested;
    return this;
  }

  /**
   * Value indicating whether the read receipt is requested.
   * @return readReceiptRequested
  **/
  public Boolean isReadReceiptRequested() {
    return readReceiptRequested;
  }  

  /**
   * Set readReceiptRequested.
   * @param readReceiptRequested Value indicating whether the read receipt is requested.
  **/
  public void setReadReceiptRequested(Boolean readReceiptRequested) {
    this.readReceiptRequested = readReceiptRequested;
  }


  /**
   * Set replyTo and return this.
   * @param replyTo Reply to names.
   * @return this
  **/
  public MapiMessageDto replyTo(String replyTo) {
    this.replyTo = replyTo;
    return this;
  }

  /**
   * Reply to names.
   * @return replyTo
  **/
  public String getReplyTo() {
    return replyTo;
  }  

  /**
   * Set replyTo.
   * @param replyTo Reply to names.
  **/
  public void setReplyTo(String replyTo) {
    this.replyTo = replyTo;
  }


  /**
   * Set senderAddressType and return this.
   * @param senderAddressType Message sender&#39;s e-mail address type.
   * @return this
  **/
  public MapiMessageDto senderAddressType(String senderAddressType) {
    this.senderAddressType = senderAddressType;
    return this;
  }

  /**
   * Message sender&#39;s e-mail address type.
   * @return senderAddressType
  **/
  public String getSenderAddressType() {
    return senderAddressType;
  }  

  /**
   * Set senderAddressType.
   * @param senderAddressType Message sender&#39;s e-mail address type.
  **/
  public void setSenderAddressType(String senderAddressType) {
    this.senderAddressType = senderAddressType;
  }


  /**
   * Set senderEmailAddress and return this.
   * @param senderEmailAddress Message sender&#39;s e-mail address.
   * @return this
  **/
  public MapiMessageDto senderEmailAddress(String senderEmailAddress) {
    this.senderEmailAddress = senderEmailAddress;
    return this;
  }

  /**
   * Message sender&#39;s e-mail address.
   * @return senderEmailAddress
  **/
  public String getSenderEmailAddress() {
    return senderEmailAddress;
  }  

  /**
   * Set senderEmailAddress.
   * @param senderEmailAddress Message sender&#39;s e-mail address.
  **/
  public void setSenderEmailAddress(String senderEmailAddress) {
    this.senderEmailAddress = senderEmailAddress;
  }


  /**
   * Set senderName and return this.
   * @param senderName Message sender&#39;s display name.
   * @return this
  **/
  public MapiMessageDto senderName(String senderName) {
    this.senderName = senderName;
    return this;
  }

  /**
   * Message sender&#39;s display name.
   * @return senderName
  **/
  public String getSenderName() {
    return senderName;
  }  

  /**
   * Set senderName.
   * @param senderName Message sender&#39;s display name.
  **/
  public void setSenderName(String senderName) {
    this.senderName = senderName;
  }


  /**
   * Set senderSmtpAddress and return this.
   * @param senderSmtpAddress Message sender&#39;s e-mail address.
   * @return this
  **/
  public MapiMessageDto senderSmtpAddress(String senderSmtpAddress) {
    this.senderSmtpAddress = senderSmtpAddress;
    return this;
  }

  /**
   * Message sender&#39;s e-mail address.
   * @return senderSmtpAddress
  **/
  public String getSenderSmtpAddress() {
    return senderSmtpAddress;
  }  

  /**
   * Set senderSmtpAddress.
   * @param senderSmtpAddress Message sender&#39;s e-mail address.
  **/
  public void setSenderSmtpAddress(String senderSmtpAddress) {
    this.senderSmtpAddress = senderSmtpAddress;
  }


  /**
   * Set sentRepresentingAddressType and return this.
   * @param sentRepresentingAddressType Address type for the messaging user represented by the sender.
   * @return this
  **/
  public MapiMessageDto sentRepresentingAddressType(String sentRepresentingAddressType) {
    this.sentRepresentingAddressType = sentRepresentingAddressType;
    return this;
  }

  /**
   * Address type for the messaging user represented by the sender.
   * @return sentRepresentingAddressType
  **/
  public String getSentRepresentingAddressType() {
    return sentRepresentingAddressType;
  }  

  /**
   * Set sentRepresentingAddressType.
   * @param sentRepresentingAddressType Address type for the messaging user represented by the sender.
  **/
  public void setSentRepresentingAddressType(String sentRepresentingAddressType) {
    this.sentRepresentingAddressType = sentRepresentingAddressType;
  }


  /**
   * Set sentRepresentingEmailAddress and return this.
   * @param sentRepresentingEmailAddress E-mail address for the messaging user represented by the sender.
   * @return this
  **/
  public MapiMessageDto sentRepresentingEmailAddress(String sentRepresentingEmailAddress) {
    this.sentRepresentingEmailAddress = sentRepresentingEmailAddress;
    return this;
  }

  /**
   * E-mail address for the messaging user represented by the sender.
   * @return sentRepresentingEmailAddress
  **/
  public String getSentRepresentingEmailAddress() {
    return sentRepresentingEmailAddress;
  }  

  /**
   * Set sentRepresentingEmailAddress.
   * @param sentRepresentingEmailAddress E-mail address for the messaging user represented by the sender.
  **/
  public void setSentRepresentingEmailAddress(String sentRepresentingEmailAddress) {
    this.sentRepresentingEmailAddress = sentRepresentingEmailAddress;
  }


  /**
   * Set sentRepresentingName and return this.
   * @param sentRepresentingName Display name for the messaging user represented by the sender.
   * @return this
  **/
  public MapiMessageDto sentRepresentingName(String sentRepresentingName) {
    this.sentRepresentingName = sentRepresentingName;
    return this;
  }

  /**
   * Display name for the messaging user represented by the sender.
   * @return sentRepresentingName
  **/
  public String getSentRepresentingName() {
    return sentRepresentingName;
  }  

  /**
   * Set sentRepresentingName.
   * @param sentRepresentingName Display name for the messaging user represented by the sender.
  **/
  public void setSentRepresentingName(String sentRepresentingName) {
    this.sentRepresentingName = sentRepresentingName;
  }


  /**
   * Set sentRepresentingSmtpAddress and return this.
   * @param sentRepresentingSmtpAddress E-mail address for the messaging user represented by the sender.
   * @return this
  **/
  public MapiMessageDto sentRepresentingSmtpAddress(String sentRepresentingSmtpAddress) {
    this.sentRepresentingSmtpAddress = sentRepresentingSmtpAddress;
    return this;
  }

  /**
   * E-mail address for the messaging user represented by the sender.
   * @return sentRepresentingSmtpAddress
  **/
  public String getSentRepresentingSmtpAddress() {
    return sentRepresentingSmtpAddress;
  }  

  /**
   * Set sentRepresentingSmtpAddress.
   * @param sentRepresentingSmtpAddress E-mail address for the messaging user represented by the sender.
  **/
  public void setSentRepresentingSmtpAddress(String sentRepresentingSmtpAddress) {
    this.sentRepresentingSmtpAddress = sentRepresentingSmtpAddress;
  }


  /**
   * Set transportMessageHeaders and return this.
   * @param transportMessageHeaders Transport-specific message envelope information.
   * @return this
  **/
  public MapiMessageDto transportMessageHeaders(String transportMessageHeaders) {
    this.transportMessageHeaders = transportMessageHeaders;
    return this;
  }

  /**
   * Transport-specific message envelope information.
   * @return transportMessageHeaders
  **/
  public String getTransportMessageHeaders() {
    return transportMessageHeaders;
  }  

  /**
   * Set transportMessageHeaders.
   * @param transportMessageHeaders Transport-specific message envelope information.
  **/
  public void setTransportMessageHeaders(String transportMessageHeaders) {
    this.transportMessageHeaders = transportMessageHeaders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    MapiMessageDto mapiMessageDto = (MapiMessageDto) o;
    return ObjectUtils.equals(this.messageBody, mapiMessageDto.messageBody) &&
    ObjectUtils.equals(this.clientSubmitTime, mapiMessageDto.clientSubmitTime) &&
    ObjectUtils.equals(this.conversationTopic, mapiMessageDto.conversationTopic) &&
    ObjectUtils.equals(this.deliveryTime, mapiMessageDto.deliveryTime) &&
    ObjectUtils.equals(this.displayBcc, mapiMessageDto.displayBcc) &&
    ObjectUtils.equals(this.displayCc, mapiMessageDto.displayCc) &&
    ObjectUtils.equals(this.displayName, mapiMessageDto.displayName) &&
    ObjectUtils.equals(this.displayNamePrefix, mapiMessageDto.displayNamePrefix) &&
    ObjectUtils.equals(this.displayTo, mapiMessageDto.displayTo) &&
    ObjectUtils.equals(this.flags, mapiMessageDto.flags) &&
    ObjectUtils.equals(this.headers, mapiMessageDto.headers) &&
    ObjectUtils.equals(this.internetMessageId, mapiMessageDto.internetMessageId) &&
    ObjectUtils.equals(this.messageFormat, mapiMessageDto.messageFormat) &&
    ObjectUtils.equals(this.normalizedSubject, mapiMessageDto.normalizedSubject) &&
    ObjectUtils.equals(this.readReceiptRequested, mapiMessageDto.readReceiptRequested) &&
    ObjectUtils.equals(this.replyTo, mapiMessageDto.replyTo) &&
    ObjectUtils.equals(this.senderAddressType, mapiMessageDto.senderAddressType) &&
    ObjectUtils.equals(this.senderEmailAddress, mapiMessageDto.senderEmailAddress) &&
    ObjectUtils.equals(this.senderName, mapiMessageDto.senderName) &&
    ObjectUtils.equals(this.senderSmtpAddress, mapiMessageDto.senderSmtpAddress) &&
    ObjectUtils.equals(this.sentRepresentingAddressType, mapiMessageDto.sentRepresentingAddressType) &&
    ObjectUtils.equals(this.sentRepresentingEmailAddress, mapiMessageDto.sentRepresentingEmailAddress) &&
    ObjectUtils.equals(this.sentRepresentingName, mapiMessageDto.sentRepresentingName) &&
    ObjectUtils.equals(this.sentRepresentingSmtpAddress, mapiMessageDto.sentRepresentingSmtpAddress) &&
    ObjectUtils.equals(this.transportMessageHeaders, mapiMessageDto.transportMessageHeaders) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(messageBody, clientSubmitTime, conversationTopic, deliveryTime, displayBcc, displayCc, displayName, displayNamePrefix, displayTo, flags, headers, internetMessageId, messageFormat, normalizedSubject, readReceiptRequested, replyTo, senderAddressType, senderEmailAddress, senderName, senderSmtpAddress, sentRepresentingAddressType, sentRepresentingEmailAddress, sentRepresentingName, sentRepresentingSmtpAddress, transportMessageHeaders, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapiMessageDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    attachments: ").append(toIndentedString(getAttachments())).append("\n");
    sb.append("    billing: ").append(toIndentedString(getBilling())).append("\n");
    sb.append("    body: ").append(toIndentedString(getBody())).append("\n");
    sb.append("    bodyHtml: ").append(toIndentedString(getBodyHtml())).append("\n");
    sb.append("    bodyRtf: ").append(toIndentedString(getBodyRtf())).append("\n");
    sb.append("    bodyType: ").append(toIndentedString(getBodyType())).append("\n");
    sb.append("    categories: ").append(toIndentedString(getCategories())).append("\n");
    sb.append("    companies: ").append(toIndentedString(getCompanies())).append("\n");
    sb.append("    itemId: ").append(toIndentedString(getItemId())).append("\n");
    sb.append("    messageClass: ").append(toIndentedString(getMessageClass())).append("\n");
    sb.append("    mileage: ").append(toIndentedString(getMileage())).append("\n");
    sb.append("    recipients: ").append(toIndentedString(getRecipients())).append("\n");
    sb.append("    sensitivity: ").append(toIndentedString(getSensitivity())).append("\n");
    sb.append("    subject: ").append(toIndentedString(getSubject())).append("\n");
    sb.append("    subjectPrefix: ").append(toIndentedString(getSubjectPrefix())).append("\n");
    sb.append("    properties: ").append(toIndentedString(getProperties())).append("\n");
    sb.append("    discriminator: ").append(toIndentedString(getDiscriminator())).append("\n");
    sb.append("    messageBody: ").append(toIndentedString(getMessageBody())).append("\n");
    sb.append("    clientSubmitTime: ").append(toIndentedString(getClientSubmitTime())).append("\n");
    sb.append("    conversationTopic: ").append(toIndentedString(getConversationTopic())).append("\n");
    sb.append("    deliveryTime: ").append(toIndentedString(getDeliveryTime())).append("\n");
    sb.append("    displayBcc: ").append(toIndentedString(getDisplayBcc())).append("\n");
    sb.append("    displayCc: ").append(toIndentedString(getDisplayCc())).append("\n");
    sb.append("    displayName: ").append(toIndentedString(getDisplayName())).append("\n");
    sb.append("    displayNamePrefix: ").append(toIndentedString(getDisplayNamePrefix())).append("\n");
    sb.append("    displayTo: ").append(toIndentedString(getDisplayTo())).append("\n");
    sb.append("    flags: ").append(toIndentedString(getFlags())).append("\n");
    sb.append("    headers: ").append(toIndentedString(getHeaders())).append("\n");
    sb.append("    internetMessageId: ").append(toIndentedString(getInternetMessageId())).append("\n");
    sb.append("    messageFormat: ").append(toIndentedString(getMessageFormat())).append("\n");
    sb.append("    normalizedSubject: ").append(toIndentedString(getNormalizedSubject())).append("\n");
    sb.append("    readReceiptRequested: ").append(toIndentedString(isReadReceiptRequested())).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(getReplyTo())).append("\n");
    sb.append("    senderAddressType: ").append(toIndentedString(getSenderAddressType())).append("\n");
    sb.append("    senderEmailAddress: ").append(toIndentedString(getSenderEmailAddress())).append("\n");
    sb.append("    senderName: ").append(toIndentedString(getSenderName())).append("\n");
    sb.append("    senderSmtpAddress: ").append(toIndentedString(getSenderSmtpAddress())).append("\n");
    sb.append("    sentRepresentingAddressType: ").append(toIndentedString(getSentRepresentingAddressType())).append("\n");
    sb.append("    sentRepresentingEmailAddress: ").append(toIndentedString(getSentRepresentingEmailAddress())).append("\n");
    sb.append("    sentRepresentingName: ").append(toIndentedString(getSentRepresentingName())).append("\n");
    sb.append("    sentRepresentingSmtpAddress: ").append(toIndentedString(getSentRepresentingSmtpAddress())).append("\n");
    sb.append("    transportMessageHeaders: ").append(toIndentedString(getTransportMessageHeaders())).append("\n");
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

  public MapiMessageDto() {
    super();
  }

  /**
   * Initializes a new instance of the MapiMessageDto
   * @param attachments Message item attachments.             
   * @param billing Billing information associated with an item.             
   * @param body Message text.             
   * @param bodyHtml Gets the BodyRtf of the message converted to HTML, if present, otherwise an empty string.             
   * @param bodyRtf RTF formatted message text.             
   * @param bodyType The content type of message body. Enum, available values: PlainText, Html, Rtf
   * @param categories Contains keywords or categories for the message object.             
   * @param companies Contains the names of the companies that are associated with an item.             
   * @param itemId The item id, uses with a server.             
   * @param messageClass Case-sensitive string that identifies the sender-defined message class, such as IPM.Note. The message class specifies the type, purpose, or content of the message.             
   * @param mileage Contains the mileage information that is associated with an item.             
   * @param recipients Recipients of the message.             
   * @param sensitivity Contains values that indicate the message sensitivity. Enum, available values: None, Personal, Private, CompanyConfidential
   * @param subject Subject of the message.             
   * @param subjectPrefix Subject prefix that typically indicates some action on a message, such as \&quot;FW: \&quot; for forwarding.             
   * @param properties List of MAPI properties             
   * @param messageBody Message text             
   * @param clientSubmitTime Date and time the message sender submitted a message.             
   * @param conversationTopic Topic of the first message in a conversation thread.             
   * @param deliveryTime Date and time a message was delivered.             
   * @param displayBcc List of the display names of any blind carbon copy (BCC) message recipients, separated by semicolons (;).             
   * @param displayCc List of the display names of any carbon copy (CC) message recipients, separated by semicolons (;).             
   * @param displayName Display name for the message.             
   * @param displayNamePrefix Prefix of the display name.             
   * @param displayTo List of the display names of the primary (To) message recipients, separated by semicolons (;).             
   * @param flags Message flags.              Items: Mapi message flags. Enum, available values: MsgFlagZero, MsgFlagRead, MsgFlagUnmodified, MsgFlagSubmit, MsgFlagUnsent, MsgFlagHasAttach, MsgFlagFromMe, MsgFlagAssociated, MsgFlagResend, MsgFlagNotifyRead, MsgFlagNotifyUnread, MsgFlagEverRead, MsgFlagOriginX400, MsgFlagOriginInternet, MsgFlagOriginMiscExt
   * @param headers Transport message headers             
   * @param internetMessageId Internet message id of the message.             
   * @param messageFormat Represents outlook message format. Enum, available values: Ascii, Unicode
   * @param normalizedSubject Normalized subject of the message.             
   * @param readReceiptRequested Value indicating whether the read receipt is requested.
   * @param replyTo Reply to names.
   * @param senderAddressType Message sender&#39;s e-mail address type.
   * @param senderEmailAddress Message sender&#39;s e-mail address.
   * @param senderName Message sender&#39;s display name.
   * @param senderSmtpAddress Message sender&#39;s e-mail address.
   * @param sentRepresentingAddressType Address type for the messaging user represented by the sender.
   * @param sentRepresentingEmailAddress E-mail address for the messaging user represented by the sender.
   * @param sentRepresentingName Display name for the messaging user represented by the sender.
   * @param sentRepresentingSmtpAddress E-mail address for the messaging user represented by the sender.
   * @param transportMessageHeaders Transport-specific message envelope information.
   */
  public MapiMessageDto(
    List<MapiAttachmentDto> attachments,
    String billing,
    String body,
    String bodyHtml,
    String bodyRtf,
    String bodyType,
    List<String> categories,
    List<String> companies,
    String itemId,
    String messageClass,
    String mileage,
    List<MapiRecipientDto> recipients,
    String sensitivity,
    String subject,
    String subjectPrefix,
    List<MapiPropertyDto> properties
    ,
    String messageBody,
    Date clientSubmitTime,
    String conversationTopic,
    Date deliveryTime,
    String displayBcc,
    String displayCc,
    String displayName,
    String displayNamePrefix,
    String displayTo,
    List<String> flags,
    Map<String, String> headers,
    String internetMessageId,
    String messageFormat,
    String normalizedSubject,
    Boolean readReceiptRequested,
    String replyTo,
    String senderAddressType,
    String senderEmailAddress,
    String senderName,
    String senderSmtpAddress,
    String sentRepresentingAddressType,
    String sentRepresentingEmailAddress,
    String sentRepresentingName,
    String sentRepresentingSmtpAddress,
    String transportMessageHeaders
  ) {
    super();
    setAttachments(attachments);
    setBilling(billing);
    setBody(body);
    setBodyHtml(bodyHtml);
    setBodyRtf(bodyRtf);
    setBodyType(bodyType);
    setCategories(categories);
    setCompanies(companies);
    setItemId(itemId);
    setMessageClass(messageClass);
    setMileage(mileage);
    setRecipients(recipients);
    setSensitivity(sensitivity);
    setSubject(subject);
    setSubjectPrefix(subjectPrefix);
    setProperties(properties);
    setMessageBody(messageBody);
    setClientSubmitTime(clientSubmitTime);
    setConversationTopic(conversationTopic);
    setDeliveryTime(deliveryTime);
    setDisplayBcc(displayBcc);
    setDisplayCc(displayCc);
    setDisplayName(displayName);
    setDisplayNamePrefix(displayNamePrefix);
    setDisplayTo(displayTo);
    setFlags(flags);
    setHeaders(headers);
    setInternetMessageId(internetMessageId);
    setMessageFormat(messageFormat);
    setNormalizedSubject(normalizedSubject);
    setReadReceiptRequested(readReceiptRequested);
    setReplyTo(replyTo);
    setSenderAddressType(senderAddressType);
    setSenderEmailAddress(senderEmailAddress);
    setSenderName(senderName);
    setSenderSmtpAddress(senderSmtpAddress);
    setSentRepresentingAddressType(sentRepresentingAddressType);
    setSentRepresentingEmailAddress(sentRepresentingEmailAddress);
    setSentRepresentingName(sentRepresentingName);
    setSentRepresentingSmtpAddress(sentRepresentingSmtpAddress);
    setTransportMessageHeaders(transportMessageHeaders);
  }

}

