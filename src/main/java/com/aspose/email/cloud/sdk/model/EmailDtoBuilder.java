/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmailDtoBuilder.java">
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
 *  EmailDto builder.
 */
public class EmailDtoBuilder {
    private EmailDto model;
    public EmailDtoBuilder(EmailDto model) {
        this.model = model;
    }

    /**
     * Build EmailDto instance.
     */
    public EmailDto build() {
        EmailDto tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set EmailDto.alternateViews and return builder.
     * @param alternateViews Collection of alternate views of message.             
     * @return builder
    **/
    public EmailDtoBuilder alternateViews(List<AlternateView> alternateViews) {
        this.model.alternateViews(alternateViews);
        return this;
    }
    /**
     * Set EmailDto.attachments and return builder.
     * @param attachments Email message attachments.             
     * @return builder
    **/
    public EmailDtoBuilder attachments(List<Attachment> attachments) {
        this.model.attachments(attachments);
        return this;
    }
    /**
     * Set EmailDto.bcc and return builder.
     * @param bcc BCC recipients.             
     * @return builder
    **/
    public EmailDtoBuilder bcc(List<MailAddress> bcc) {
        this.model.bcc(bcc);
        return this;
    }
    /**
     * Set EmailDto.body and return builder.
     * @param body Email message body as plain text.             
     * @return builder
    **/
    public EmailDtoBuilder body(String body) {
        this.model.body(body);
        return this;
    }
    /**
     * Set EmailDto.bodyEncoding and return builder.
     * @param bodyEncoding Body encoding.             
     * @return builder
    **/
    public EmailDtoBuilder bodyEncoding(String bodyEncoding) {
        this.model.bodyEncoding(bodyEncoding);
        return this;
    }
    /**
     * Set EmailDto.bodyType and return builder.
     * @param bodyType The content type of message body. Enum, available values: PlainText, Html, Rtf
     * @return builder
    **/
    public EmailDtoBuilder bodyType(String bodyType) {
        this.model.bodyType(bodyType);
        return this;
    }
    /**
     * Set EmailDto.cc and return builder.
     * @param cc CC recipients.             
     * @return builder
    **/
    public EmailDtoBuilder cc(List<MailAddress> cc) {
        this.model.cc(cc);
        return this;
    }
    /**
     * Set EmailDto.date and return builder.
     * @param date Message date.             
     * @return builder
    **/
    public EmailDtoBuilder date(Date date) {
        this.model.date(date);
        return this;
    }
    /**
     * Set EmailDto.deliveryNotificationOptions and return builder.
     * @param deliveryNotificationOptions Delivery notifications. Items: Email delivery notification options. Enum, available values: Delay, Never, None, OnFailure, OnSuccess
     * @return builder
    **/
    public EmailDtoBuilder deliveryNotificationOptions(List<String> deliveryNotificationOptions) {
        this.model.deliveryNotificationOptions(deliveryNotificationOptions);
        return this;
    }
    /**
     * Set EmailDto.from and return builder.
     * @param from From address.             
     * @return builder
    **/
    public EmailDtoBuilder from(MailAddress from) {
        this.model.from(from);
        return this;
    }
    /**
     * Set EmailDto.headers and return builder.
     * @param headers Document headers.             
     * @return builder
    **/
    public EmailDtoBuilder headers(Map<String, String> headers) {
        this.model.headers(headers);
        return this;
    }
    /**
     * Set EmailDto.htmlBody and return builder.
     * @param htmlBody HTML body.             
     * @return builder
    **/
    public EmailDtoBuilder htmlBody(String htmlBody) {
        this.model.htmlBody(htmlBody);
        return this;
    }
    /**
     * Set EmailDto.htmlBodyText and return builder.
     * @param htmlBodyText Html body as plain text. Read only.             
     * @return builder
    **/
    public EmailDtoBuilder htmlBodyText(String htmlBodyText) {
        this.model.htmlBodyText(htmlBodyText);
        return this;
    }
    /**
     * Set EmailDto.isBodyHtml and return builder.
     * @param isBodyHtml Indicates whether the message body is in Html.             
     * @return builder
    **/
    public EmailDtoBuilder isBodyHtml(Boolean isBodyHtml) {
        this.model.isBodyHtml(isBodyHtml);
        return this;
    }
    /**
     * Set EmailDto.isDraft and return builder.
     * @param isDraft Indicates whether or not a message has been sent.             
     * @return builder
    **/
    public EmailDtoBuilder isDraft(Boolean isDraft) {
        this.model.isDraft(isDraft);
        return this;
    }
    /**
     * Set EmailDto.isEncrypted and return builder.
     * @param isEncrypted Indicates whether the message is encrypted. Read only.             
     * @return builder
    **/
    public EmailDtoBuilder isEncrypted(Boolean isEncrypted) {
        this.model.isEncrypted(isEncrypted);
        return this;
    }
    /**
     * Set EmailDto.isSigned and return builder.
     * @param isSigned Indicates whether the message is signed. Read only.             
     * @return builder
    **/
    public EmailDtoBuilder isSigned(Boolean isSigned) {
        this.model.isSigned(isSigned);
        return this;
    }
    /**
     * Set EmailDto.linkedResources and return builder.
     * @param linkedResources Linked resources of message.             
     * @return builder
    **/
    public EmailDtoBuilder linkedResources(List<LinkedResource> linkedResources) {
        this.model.linkedResources(linkedResources);
        return this;
    }
    /**
     * Set EmailDto.messageId and return builder.
     * @param messageId Message id.             
     * @return builder
    **/
    public EmailDtoBuilder messageId(String messageId) {
        this.model.messageId(messageId);
        return this;
    }
    /**
     * Set EmailDto.originalIsTnef and return builder.
     * @param originalIsTnef Indicates whether original EML message is in TNEF format. Read only.             
     * @return builder
    **/
    public EmailDtoBuilder originalIsTnef(Boolean originalIsTnef) {
        this.model.originalIsTnef(originalIsTnef);
        return this;
    }
    /**
     * Set EmailDto.preferredTextEncoding and return builder.
     * @param preferredTextEncoding Preferred encoding.             
     * @return builder
    **/
    public EmailDtoBuilder preferredTextEncoding(String preferredTextEncoding) {
        this.model.preferredTextEncoding(preferredTextEncoding);
        return this;
    }
    /**
     * Set EmailDto.priority and return builder.
     * @param priority Email priority status. Enum, available values: High, Low, Normal
     * @return builder
    **/
    public EmailDtoBuilder priority(String priority) {
        this.model.priority(priority);
        return this;
    }
    /**
     * Set EmailDto.readReceiptTo and return builder.
     * @param readReceiptTo Read receipt addresses.             
     * @return builder
    **/
    public EmailDtoBuilder readReceiptTo(List<MailAddress> readReceiptTo) {
        this.model.readReceiptTo(readReceiptTo);
        return this;
    }
    /**
     * Set EmailDto.replyToList and return builder.
     * @param replyToList The list of addresses to reply to for the mail message.             
     * @return builder
    **/
    public EmailDtoBuilder replyToList(List<MailAddress> replyToList) {
        this.model.replyToList(replyToList);
        return this;
    }
    /**
     * Set EmailDto.reversePath and return builder.
     * @param reversePath ReversePath address.             
     * @return builder
    **/
    public EmailDtoBuilder reversePath(MailAddress reversePath) {
        this.model.reversePath(reversePath);
        return this;
    }
    /**
     * Set EmailDto.sender and return builder.
     * @param sender Sender address.             
     * @return builder
    **/
    public EmailDtoBuilder sender(MailAddress sender) {
        this.model.sender(sender);
        return this;
    }
    /**
     * Set EmailDto.sensitivity and return builder.
     * @param sensitivity Specifies the sensitivity of a MailMessage. Enum, available values: None, Normal, Personal, Private, CompanyConfidential
     * @return builder
    **/
    public EmailDtoBuilder sensitivity(String sensitivity) {
        this.model.sensitivity(sensitivity);
        return this;
    }
    /**
     * Set EmailDto.subject and return builder.
     * @param subject Message subject.             
     * @return builder
    **/
    public EmailDtoBuilder subject(String subject) {
        this.model.subject(subject);
        return this;
    }
    /**
     * Set EmailDto.subjectEncoding and return builder.
     * @param subjectEncoding Subject encoding.             
     * @return builder
    **/
    public EmailDtoBuilder subjectEncoding(String subjectEncoding) {
        this.model.subjectEncoding(subjectEncoding);
        return this;
    }
    /**
     * Set EmailDto.timeZoneOffset and return builder.
     * @param timeZoneOffset Coordinated Universal Time (UTC) offset for the message dates. This property defines the time zone difference, between the local time and UTC represented as count of ticks (10 000 per millisecond).             
     * @return builder
    **/
    public EmailDtoBuilder timeZoneOffset(Long timeZoneOffset) {
        this.model.timeZoneOffset(timeZoneOffset);
        return this;
    }
    /**
     * Set EmailDto.to and return builder.
     * @param to The address collection that contains the recipients of message.             
     * @return builder
    **/
    public EmailDtoBuilder to(List<MailAddress> to) {
        this.model.to(to);
        return this;
    }
    /**
     * Set EmailDto.xMailer and return builder.
     * @param xMailer The X-Mailer the software that created the e-mail message.             
     * @return builder
    **/
    public EmailDtoBuilder xMailer(String xMailer) {
        this.model.xMailer(xMailer);
        return this;
    }
}
