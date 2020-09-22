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

import java.util.List;

/**
 *  MapiMessageDto builder.
 */
public class MapiMessageDtoBuilder {
    private final MapiMessageDto model;
    public MapiMessageDtoBuilder(MapiMessageDto model) {
        this.model = model;
    }

    public MapiMessageDto build() {
        return model;
    }
    public MapiMessageDtoBuilder attachments(List<MapiAttachmentDto> attachments) {
        this.model.attachments(attachments);
        return this;
    }
    public MapiMessageDtoBuilder billing(String billing) {
        this.model.billing(billing);
        return this;
    }
    public MapiMessageDtoBuilder body(String body) {
        this.model.body(body);
        return this;
    }
    public MapiMessageDtoBuilder bodyHtml(String bodyHtml) {
        this.model.bodyHtml(bodyHtml);
        return this;
    }
    public MapiMessageDtoBuilder bodyRtf(String bodyRtf) {
        this.model.bodyRtf(bodyRtf);
        return this;
    }
    public MapiMessageDtoBuilder bodyType(String bodyType) {
        this.model.bodyType(bodyType);
        return this;
    }
    public MapiMessageDtoBuilder categories(List<String> categories) {
        this.model.categories(categories);
        return this;
    }
    public MapiMessageDtoBuilder companies(List<String> companies) {
        this.model.companies(companies);
        return this;
    }
    public MapiMessageDtoBuilder itemId(String itemId) {
        this.model.itemId(itemId);
        return this;
    }
    public MapiMessageDtoBuilder messageClass(String messageClass) {
        this.model.messageClass(messageClass);
        return this;
    }
    public MapiMessageDtoBuilder mileage(String mileage) {
        this.model.mileage(mileage);
        return this;
    }
    public MapiMessageDtoBuilder recipients(List<MapiRecipientDto> recipients) {
        this.model.recipients(recipients);
        return this;
    }
    public MapiMessageDtoBuilder sensitivity(String sensitivity) {
        this.model.sensitivity(sensitivity);
        return this;
    }
    public MapiMessageDtoBuilder subject(String subject) {
        this.model.subject(subject);
        return this;
    }
    public MapiMessageDtoBuilder subjectPrefix(String subjectPrefix) {
        this.model.subjectPrefix(subjectPrefix);
        return this;
    }
    public MapiMessageDtoBuilder properties(List<MapiPropertyDto> properties) {
        this.model.properties(properties);
        return this;
    }
    public MapiMessageDtoBuilder messageBody(String messageBody) {
        this.model.messageBody(messageBody);
        return this;
    }
    public MapiMessageDtoBuilder clientSubmitTime(Date clientSubmitTime) {
        this.model.clientSubmitTime(clientSubmitTime);
        return this;
    }
    public MapiMessageDtoBuilder conversationTopic(String conversationTopic) {
        this.model.conversationTopic(conversationTopic);
        return this;
    }
    public MapiMessageDtoBuilder deliveryTime(Date deliveryTime) {
        this.model.deliveryTime(deliveryTime);
        return this;
    }
    public MapiMessageDtoBuilder displayBcc(String displayBcc) {
        this.model.displayBcc(displayBcc);
        return this;
    }
    public MapiMessageDtoBuilder displayCc(String displayCc) {
        this.model.displayCc(displayCc);
        return this;
    }
    public MapiMessageDtoBuilder displayName(String displayName) {
        this.model.displayName(displayName);
        return this;
    }
    public MapiMessageDtoBuilder displayNamePrefix(String displayNamePrefix) {
        this.model.displayNamePrefix(displayNamePrefix);
        return this;
    }
    public MapiMessageDtoBuilder displayTo(String displayTo) {
        this.model.displayTo(displayTo);
        return this;
    }
    public MapiMessageDtoBuilder flags(List<String> flags) {
        this.model.flags(flags);
        return this;
    }
    public MapiMessageDtoBuilder headers(Map<String, String> headers) {
        this.model.headers(headers);
        return this;
    }
    public MapiMessageDtoBuilder internetMessageId(String internetMessageId) {
        this.model.internetMessageId(internetMessageId);
        return this;
    }
    public MapiMessageDtoBuilder messageFormat(String messageFormat) {
        this.model.messageFormat(messageFormat);
        return this;
    }
    public MapiMessageDtoBuilder normalizedSubject(String normalizedSubject) {
        this.model.normalizedSubject(normalizedSubject);
        return this;
    }
    public MapiMessageDtoBuilder readReceiptRequested(Boolean readReceiptRequested) {
        this.model.readReceiptRequested(readReceiptRequested);
        return this;
    }
    public MapiMessageDtoBuilder replyTo(String replyTo) {
        this.model.replyTo(replyTo);
        return this;
    }
    public MapiMessageDtoBuilder senderAddressType(String senderAddressType) {
        this.model.senderAddressType(senderAddressType);
        return this;
    }
    public MapiMessageDtoBuilder senderEmailAddress(String senderEmailAddress) {
        this.model.senderEmailAddress(senderEmailAddress);
        return this;
    }
    public MapiMessageDtoBuilder senderName(String senderName) {
        this.model.senderName(senderName);
        return this;
    }
    public MapiMessageDtoBuilder senderSmtpAddress(String senderSmtpAddress) {
        this.model.senderSmtpAddress(senderSmtpAddress);
        return this;
    }
    public MapiMessageDtoBuilder sentRepresentingAddressType(String sentRepresentingAddressType) {
        this.model.sentRepresentingAddressType(sentRepresentingAddressType);
        return this;
    }
    public MapiMessageDtoBuilder sentRepresentingEmailAddress(String sentRepresentingEmailAddress) {
        this.model.sentRepresentingEmailAddress(sentRepresentingEmailAddress);
        return this;
    }
    public MapiMessageDtoBuilder sentRepresentingName(String sentRepresentingName) {
        this.model.sentRepresentingName(sentRepresentingName);
        return this;
    }
    public MapiMessageDtoBuilder sentRepresentingSmtpAddress(String sentRepresentingSmtpAddress) {
        this.model.sentRepresentingSmtpAddress(sentRepresentingSmtpAddress);
        return this;
    }
    public MapiMessageDtoBuilder transportMessageHeaders(String transportMessageHeaders) {
        this.model.transportMessageHeaders(transportMessageHeaders);
        return this;
    }
}
