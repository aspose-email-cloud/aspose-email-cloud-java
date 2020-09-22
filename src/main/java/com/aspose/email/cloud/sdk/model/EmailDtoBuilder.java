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

import java.util.List;

/**
 *  EmailDto builder.
 */
public class EmailDtoBuilder {
    private final EmailDto model;
    public EmailDtoBuilder(EmailDto model) {
        this.model = model;
    }

    public EmailDto build() {
        return model;
    }
    public EmailDtoBuilder alternateViews(List<AlternateView> alternateViews) {
        this.model.alternateViews(alternateViews);
        return this;
    }
    public EmailDtoBuilder attachments(List<Attachment> attachments) {
        this.model.attachments(attachments);
        return this;
    }
    public EmailDtoBuilder bcc(List<MailAddress> bcc) {
        this.model.bcc(bcc);
        return this;
    }
    public EmailDtoBuilder body(String body) {
        this.model.body(body);
        return this;
    }
    public EmailDtoBuilder bodyEncoding(String bodyEncoding) {
        this.model.bodyEncoding(bodyEncoding);
        return this;
    }
    public EmailDtoBuilder bodyType(String bodyType) {
        this.model.bodyType(bodyType);
        return this;
    }
    public EmailDtoBuilder cc(List<MailAddress> cc) {
        this.model.cc(cc);
        return this;
    }
    public EmailDtoBuilder date(Date date) {
        this.model.date(date);
        return this;
    }
    public EmailDtoBuilder deliveryNotificationOptions(List<String> deliveryNotificationOptions) {
        this.model.deliveryNotificationOptions(deliveryNotificationOptions);
        return this;
    }
    public EmailDtoBuilder from(MailAddress from) {
        this.model.from(from);
        return this;
    }
    public EmailDtoBuilder headers(Map<String, String> headers) {
        this.model.headers(headers);
        return this;
    }
    public EmailDtoBuilder htmlBody(String htmlBody) {
        this.model.htmlBody(htmlBody);
        return this;
    }
    public EmailDtoBuilder htmlBodyText(String htmlBodyText) {
        this.model.htmlBodyText(htmlBodyText);
        return this;
    }
    public EmailDtoBuilder isBodyHtml(Boolean isBodyHtml) {
        this.model.isBodyHtml(isBodyHtml);
        return this;
    }
    public EmailDtoBuilder isDraft(Boolean isDraft) {
        this.model.isDraft(isDraft);
        return this;
    }
    public EmailDtoBuilder isEncrypted(Boolean isEncrypted) {
        this.model.isEncrypted(isEncrypted);
        return this;
    }
    public EmailDtoBuilder isSigned(Boolean isSigned) {
        this.model.isSigned(isSigned);
        return this;
    }
    public EmailDtoBuilder linkedResources(List<LinkedResource> linkedResources) {
        this.model.linkedResources(linkedResources);
        return this;
    }
    public EmailDtoBuilder messageId(String messageId) {
        this.model.messageId(messageId);
        return this;
    }
    public EmailDtoBuilder originalIsTnef(Boolean originalIsTnef) {
        this.model.originalIsTnef(originalIsTnef);
        return this;
    }
    public EmailDtoBuilder preferredTextEncoding(String preferredTextEncoding) {
        this.model.preferredTextEncoding(preferredTextEncoding);
        return this;
    }
    public EmailDtoBuilder priority(String priority) {
        this.model.priority(priority);
        return this;
    }
    public EmailDtoBuilder readReceiptTo(List<MailAddress> readReceiptTo) {
        this.model.readReceiptTo(readReceiptTo);
        return this;
    }
    public EmailDtoBuilder replyToList(List<MailAddress> replyToList) {
        this.model.replyToList(replyToList);
        return this;
    }
    public EmailDtoBuilder reversePath(MailAddress reversePath) {
        this.model.reversePath(reversePath);
        return this;
    }
    public EmailDtoBuilder sender(MailAddress sender) {
        this.model.sender(sender);
        return this;
    }
    public EmailDtoBuilder sensitivity(String sensitivity) {
        this.model.sensitivity(sensitivity);
        return this;
    }
    public EmailDtoBuilder subject(String subject) {
        this.model.subject(subject);
        return this;
    }
    public EmailDtoBuilder subjectEncoding(String subjectEncoding) {
        this.model.subjectEncoding(subjectEncoding);
        return this;
    }
    public EmailDtoBuilder timeZoneOffset(Long timeZoneOffset) {
        this.model.timeZoneOffset(timeZoneOffset);
        return this;
    }
    public EmailDtoBuilder to(List<MailAddress> to) {
        this.model.to(to);
        return this;
    }
    public EmailDtoBuilder xMailer(String xMailer) {
        this.model.xMailer(xMailer);
        return this;
    }
}
