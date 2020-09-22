/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiMessageDtoBuilder.java">
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
 *  MapiMessageDto builder.
 */
public class MapiMessageDtoBuilder {
    private final MapiMessageDto model;
    public MapiMessageDtoBuilder(MapiMessageDto model) {
        this.model = model;
    }

    /**
     * Build MapiMessageDto instance.
     */
    public MapiMessageDto build() {
        return model;
    }
    /**
     * Set MapiMessageDto.attachments and return builder.
     * @param attachments Message item attachments.             
     * @return builder
    **/
    public MapiMessageDtoBuilder attachments(List<MapiAttachmentDto> attachments) {
        this.model.attachments(attachments);
        return this;
    }
    /**
     * Set MapiMessageDto.billing and return builder.
     * @param billing Billing information associated with an item.             
     * @return builder
    **/
    public MapiMessageDtoBuilder billing(String billing) {
        this.model.billing(billing);
        return this;
    }
    /**
     * Set MapiMessageDto.body and return builder.
     * @param body Message text.             
     * @return builder
    **/
    public MapiMessageDtoBuilder body(String body) {
        this.model.body(body);
        return this;
    }
    /**
     * Set MapiMessageDto.bodyHtml and return builder.
     * @param bodyHtml Gets the BodyRtf of the message converted to HTML, if present, otherwise an empty string.             
     * @return builder
    **/
    public MapiMessageDtoBuilder bodyHtml(String bodyHtml) {
        this.model.bodyHtml(bodyHtml);
        return this;
    }
    /**
     * Set MapiMessageDto.bodyRtf and return builder.
     * @param bodyRtf RTF formatted message text.             
     * @return builder
    **/
    public MapiMessageDtoBuilder bodyRtf(String bodyRtf) {
        this.model.bodyRtf(bodyRtf);
        return this;
    }
    /**
     * Set MapiMessageDto.bodyType and return builder.
     * @param bodyType The content type of message body. Enum, available values: PlainText, Html, Rtf
     * @return builder
    **/
    public MapiMessageDtoBuilder bodyType(String bodyType) {
        this.model.bodyType(bodyType);
        return this;
    }
    /**
     * Set MapiMessageDto.categories and return builder.
     * @param categories Contains keywords or categories for the message object.             
     * @return builder
    **/
    public MapiMessageDtoBuilder categories(List<String> categories) {
        this.model.categories(categories);
        return this;
    }
    /**
     * Set MapiMessageDto.companies and return builder.
     * @param companies Contains the names of the companies that are associated with an item.             
     * @return builder
    **/
    public MapiMessageDtoBuilder companies(List<String> companies) {
        this.model.companies(companies);
        return this;
    }
    /**
     * Set MapiMessageDto.itemId and return builder.
     * @param itemId The item id, uses with a server.             
     * @return builder
    **/
    public MapiMessageDtoBuilder itemId(String itemId) {
        this.model.itemId(itemId);
        return this;
    }
    /**
     * Set MapiMessageDto.messageClass and return builder.
     * @param messageClass Case-sensitive string that identifies the sender-defined message class, such as IPM.Note. The message class specifies the type, purpose, or content of the message.             
     * @return builder
    **/
    public MapiMessageDtoBuilder messageClass(String messageClass) {
        this.model.messageClass(messageClass);
        return this;
    }
    /**
     * Set MapiMessageDto.mileage and return builder.
     * @param mileage Contains the mileage information that is associated with an item.             
     * @return builder
    **/
    public MapiMessageDtoBuilder mileage(String mileage) {
        this.model.mileage(mileage);
        return this;
    }
    /**
     * Set MapiMessageDto.recipients and return builder.
     * @param recipients Recipients of the message.             
     * @return builder
    **/
    public MapiMessageDtoBuilder recipients(List<MapiRecipientDto> recipients) {
        this.model.recipients(recipients);
        return this;
    }
    /**
     * Set MapiMessageDto.sensitivity and return builder.
     * @param sensitivity Contains values that indicate the message sensitivity. Enum, available values: None, Personal, Private, CompanyConfidential
     * @return builder
    **/
    public MapiMessageDtoBuilder sensitivity(String sensitivity) {
        this.model.sensitivity(sensitivity);
        return this;
    }
    /**
     * Set MapiMessageDto.subject and return builder.
     * @param subject Subject of the message.             
     * @return builder
    **/
    public MapiMessageDtoBuilder subject(String subject) {
        this.model.subject(subject);
        return this;
    }
    /**
     * Set MapiMessageDto.subjectPrefix and return builder.
     * @param subjectPrefix Subject prefix that typically indicates some action on a message, such as \&quot;FW: \&quot; for forwarding.             
     * @return builder
    **/
    public MapiMessageDtoBuilder subjectPrefix(String subjectPrefix) {
        this.model.subjectPrefix(subjectPrefix);
        return this;
    }
    /**
     * Set MapiMessageDto.properties and return builder.
     * @param properties List of MAPI properties             
     * @return builder
    **/
    public MapiMessageDtoBuilder properties(List<MapiPropertyDto> properties) {
        this.model.properties(properties);
        return this;
    }
    /**
     * Set MapiMessageDto.messageBody and return builder.
     * @param messageBody Message text             
     * @return builder
    **/
    public MapiMessageDtoBuilder messageBody(String messageBody) {
        this.model.messageBody(messageBody);
        return this;
    }
    /**
     * Set MapiMessageDto.clientSubmitTime and return builder.
     * @param clientSubmitTime Date and time the message sender submitted a message.             
     * @return builder
    **/
    public MapiMessageDtoBuilder clientSubmitTime(Date clientSubmitTime) {
        this.model.clientSubmitTime(clientSubmitTime);
        return this;
    }
    /**
     * Set MapiMessageDto.conversationTopic and return builder.
     * @param conversationTopic Topic of the first message in a conversation thread.             
     * @return builder
    **/
    public MapiMessageDtoBuilder conversationTopic(String conversationTopic) {
        this.model.conversationTopic(conversationTopic);
        return this;
    }
    /**
     * Set MapiMessageDto.deliveryTime and return builder.
     * @param deliveryTime Date and time a message was delivered.             
     * @return builder
    **/
    public MapiMessageDtoBuilder deliveryTime(Date deliveryTime) {
        this.model.deliveryTime(deliveryTime);
        return this;
    }
    /**
     * Set MapiMessageDto.displayBcc and return builder.
     * @param displayBcc List of the display names of any blind carbon copy (BCC) message recipients, separated by semicolons (;).             
     * @return builder
    **/
    public MapiMessageDtoBuilder displayBcc(String displayBcc) {
        this.model.displayBcc(displayBcc);
        return this;
    }
    /**
     * Set MapiMessageDto.displayCc and return builder.
     * @param displayCc List of the display names of any carbon copy (CC) message recipients, separated by semicolons (;).             
     * @return builder
    **/
    public MapiMessageDtoBuilder displayCc(String displayCc) {
        this.model.displayCc(displayCc);
        return this;
    }
    /**
     * Set MapiMessageDto.displayName and return builder.
     * @param displayName Display name for the message.             
     * @return builder
    **/
    public MapiMessageDtoBuilder displayName(String displayName) {
        this.model.displayName(displayName);
        return this;
    }
    /**
     * Set MapiMessageDto.displayNamePrefix and return builder.
     * @param displayNamePrefix Prefix of the display name.             
     * @return builder
    **/
    public MapiMessageDtoBuilder displayNamePrefix(String displayNamePrefix) {
        this.model.displayNamePrefix(displayNamePrefix);
        return this;
    }
    /**
     * Set MapiMessageDto.displayTo and return builder.
     * @param displayTo List of the display names of the primary (To) message recipients, separated by semicolons (;).             
     * @return builder
    **/
    public MapiMessageDtoBuilder displayTo(String displayTo) {
        this.model.displayTo(displayTo);
        return this;
    }
    /**
     * Set MapiMessageDto.flags and return builder.
     * @param flags Message flags.              Items: Mapi message flags. Enum, available values: MsgFlagZero, MsgFlagRead, MsgFlagUnmodified, MsgFlagSubmit, MsgFlagUnsent, MsgFlagHasAttach, MsgFlagFromMe, MsgFlagAssociated, MsgFlagResend, MsgFlagNotifyRead, MsgFlagNotifyUnread, MsgFlagEverRead, MsgFlagOriginX400, MsgFlagOriginInternet, MsgFlagOriginMiscExt
     * @return builder
    **/
    public MapiMessageDtoBuilder flags(List<String> flags) {
        this.model.flags(flags);
        return this;
    }
    /**
     * Set MapiMessageDto.headers and return builder.
     * @param headers Transport message headers             
     * @return builder
    **/
    public MapiMessageDtoBuilder headers(Map<String, String> headers) {
        this.model.headers(headers);
        return this;
    }
    /**
     * Set MapiMessageDto.internetMessageId and return builder.
     * @param internetMessageId Internet message id of the message.             
     * @return builder
    **/
    public MapiMessageDtoBuilder internetMessageId(String internetMessageId) {
        this.model.internetMessageId(internetMessageId);
        return this;
    }
    /**
     * Set MapiMessageDto.messageFormat and return builder.
     * @param messageFormat Represents outlook message format. Enum, available values: Ascii, Unicode
     * @return builder
    **/
    public MapiMessageDtoBuilder messageFormat(String messageFormat) {
        this.model.messageFormat(messageFormat);
        return this;
    }
    /**
     * Set MapiMessageDto.normalizedSubject and return builder.
     * @param normalizedSubject Normalized subject of the message.             
     * @return builder
    **/
    public MapiMessageDtoBuilder normalizedSubject(String normalizedSubject) {
        this.model.normalizedSubject(normalizedSubject);
        return this;
    }
    /**
     * Set MapiMessageDto.readReceiptRequested and return builder.
     * @param readReceiptRequested Value indicating whether the read receipt is requested.
     * @return builder
    **/
    public MapiMessageDtoBuilder readReceiptRequested(Boolean readReceiptRequested) {
        this.model.readReceiptRequested(readReceiptRequested);
        return this;
    }
    /**
     * Set MapiMessageDto.replyTo and return builder.
     * @param replyTo Reply to names.
     * @return builder
    **/
    public MapiMessageDtoBuilder replyTo(String replyTo) {
        this.model.replyTo(replyTo);
        return this;
    }
    /**
     * Set MapiMessageDto.senderAddressType and return builder.
     * @param senderAddressType Message sender&#39;s e-mail address type.
     * @return builder
    **/
    public MapiMessageDtoBuilder senderAddressType(String senderAddressType) {
        this.model.senderAddressType(senderAddressType);
        return this;
    }
    /**
     * Set MapiMessageDto.senderEmailAddress and return builder.
     * @param senderEmailAddress Message sender&#39;s e-mail address.
     * @return builder
    **/
    public MapiMessageDtoBuilder senderEmailAddress(String senderEmailAddress) {
        this.model.senderEmailAddress(senderEmailAddress);
        return this;
    }
    /**
     * Set MapiMessageDto.senderName and return builder.
     * @param senderName Message sender&#39;s display name.
     * @return builder
    **/
    public MapiMessageDtoBuilder senderName(String senderName) {
        this.model.senderName(senderName);
        return this;
    }
    /**
     * Set MapiMessageDto.senderSmtpAddress and return builder.
     * @param senderSmtpAddress Message sender&#39;s e-mail address.
     * @return builder
    **/
    public MapiMessageDtoBuilder senderSmtpAddress(String senderSmtpAddress) {
        this.model.senderSmtpAddress(senderSmtpAddress);
        return this;
    }
    /**
     * Set MapiMessageDto.sentRepresentingAddressType and return builder.
     * @param sentRepresentingAddressType Address type for the messaging user represented by the sender.
     * @return builder
    **/
    public MapiMessageDtoBuilder sentRepresentingAddressType(String sentRepresentingAddressType) {
        this.model.sentRepresentingAddressType(sentRepresentingAddressType);
        return this;
    }
    /**
     * Set MapiMessageDto.sentRepresentingEmailAddress and return builder.
     * @param sentRepresentingEmailAddress E-mail address for the messaging user represented by the sender.
     * @return builder
    **/
    public MapiMessageDtoBuilder sentRepresentingEmailAddress(String sentRepresentingEmailAddress) {
        this.model.sentRepresentingEmailAddress(sentRepresentingEmailAddress);
        return this;
    }
    /**
     * Set MapiMessageDto.sentRepresentingName and return builder.
     * @param sentRepresentingName Display name for the messaging user represented by the sender.
     * @return builder
    **/
    public MapiMessageDtoBuilder sentRepresentingName(String sentRepresentingName) {
        this.model.sentRepresentingName(sentRepresentingName);
        return this;
    }
    /**
     * Set MapiMessageDto.sentRepresentingSmtpAddress and return builder.
     * @param sentRepresentingSmtpAddress E-mail address for the messaging user represented by the sender.
     * @return builder
    **/
    public MapiMessageDtoBuilder sentRepresentingSmtpAddress(String sentRepresentingSmtpAddress) {
        this.model.sentRepresentingSmtpAddress(sentRepresentingSmtpAddress);
        return this;
    }
    /**
     * Set MapiMessageDto.transportMessageHeaders and return builder.
     * @param transportMessageHeaders Transport-specific message envelope information.
     * @return builder
    **/
    public MapiMessageDtoBuilder transportMessageHeaders(String transportMessageHeaders) {
        this.model.transportMessageHeaders(transportMessageHeaders);
        return this;
    }
}
