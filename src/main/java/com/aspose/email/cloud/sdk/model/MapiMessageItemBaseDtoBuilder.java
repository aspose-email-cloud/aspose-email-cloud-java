/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiMessageItemBaseDtoBuilder.java">
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
 *  MapiMessageItemBaseDto builder.
 */
public class MapiMessageItemBaseDtoBuilder {
    private final MapiMessageItemBaseDto model;
    public MapiMessageItemBaseDtoBuilder(MapiMessageItemBaseDto model) {
        this.model = model;
    }

    /**
     * Build MapiMessageItemBaseDto instance.
     */
    public MapiMessageItemBaseDto build() {
        MapiMessageItemBaseDto tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set MapiMessageItemBaseDto.attachments and return builder.
     * @param attachments Message item attachments.             
     * @return builder
    **/
    public MapiMessageItemBaseDtoBuilder attachments(List<MapiAttachmentDto> attachments) {
        this.model.attachments(attachments);
        return this;
    }
    /**
     * Set MapiMessageItemBaseDto.billing and return builder.
     * @param billing Billing information associated with an item.             
     * @return builder
    **/
    public MapiMessageItemBaseDtoBuilder billing(String billing) {
        this.model.billing(billing);
        return this;
    }
    /**
     * Set MapiMessageItemBaseDto.body and return builder.
     * @param body Message text.             
     * @return builder
    **/
    public MapiMessageItemBaseDtoBuilder body(String body) {
        this.model.body(body);
        return this;
    }
    /**
     * Set MapiMessageItemBaseDto.bodyHtml and return builder.
     * @param bodyHtml Gets the BodyRtf of the message converted to HTML, if present, otherwise an empty string.             
     * @return builder
    **/
    public MapiMessageItemBaseDtoBuilder bodyHtml(String bodyHtml) {
        this.model.bodyHtml(bodyHtml);
        return this;
    }
    /**
     * Set MapiMessageItemBaseDto.bodyRtf and return builder.
     * @param bodyRtf RTF formatted message text.             
     * @return builder
    **/
    public MapiMessageItemBaseDtoBuilder bodyRtf(String bodyRtf) {
        this.model.bodyRtf(bodyRtf);
        return this;
    }
    /**
     * Set MapiMessageItemBaseDto.bodyType and return builder.
     * @param bodyType The content type of message body. Enum, available values: PlainText, Html, Rtf
     * @return builder
    **/
    public MapiMessageItemBaseDtoBuilder bodyType(String bodyType) {
        this.model.bodyType(bodyType);
        return this;
    }
    /**
     * Set MapiMessageItemBaseDto.categories and return builder.
     * @param categories Contains keywords or categories for the message object.             
     * @return builder
    **/
    public MapiMessageItemBaseDtoBuilder categories(List<String> categories) {
        this.model.categories(categories);
        return this;
    }
    /**
     * Set MapiMessageItemBaseDto.companies and return builder.
     * @param companies Contains the names of the companies that are associated with an item.             
     * @return builder
    **/
    public MapiMessageItemBaseDtoBuilder companies(List<String> companies) {
        this.model.companies(companies);
        return this;
    }
    /**
     * Set MapiMessageItemBaseDto.itemId and return builder.
     * @param itemId The item id, uses with a server.             
     * @return builder
    **/
    public MapiMessageItemBaseDtoBuilder itemId(String itemId) {
        this.model.itemId(itemId);
        return this;
    }
    /**
     * Set MapiMessageItemBaseDto.messageClass and return builder.
     * @param messageClass Case-sensitive string that identifies the sender-defined message class, such as IPM.Note. The message class specifies the type, purpose, or content of the message.             
     * @return builder
    **/
    public MapiMessageItemBaseDtoBuilder messageClass(String messageClass) {
        this.model.messageClass(messageClass);
        return this;
    }
    /**
     * Set MapiMessageItemBaseDto.mileage and return builder.
     * @param mileage Contains the mileage information that is associated with an item.             
     * @return builder
    **/
    public MapiMessageItemBaseDtoBuilder mileage(String mileage) {
        this.model.mileage(mileage);
        return this;
    }
    /**
     * Set MapiMessageItemBaseDto.recipients and return builder.
     * @param recipients Recipients of the message.             
     * @return builder
    **/
    public MapiMessageItemBaseDtoBuilder recipients(List<MapiRecipientDto> recipients) {
        this.model.recipients(recipients);
        return this;
    }
    /**
     * Set MapiMessageItemBaseDto.sensitivity and return builder.
     * @param sensitivity Contains values that indicate the message sensitivity. Enum, available values: None, Personal, Private, CompanyConfidential
     * @return builder
    **/
    public MapiMessageItemBaseDtoBuilder sensitivity(String sensitivity) {
        this.model.sensitivity(sensitivity);
        return this;
    }
    /**
     * Set MapiMessageItemBaseDto.subject and return builder.
     * @param subject Subject of the message.             
     * @return builder
    **/
    public MapiMessageItemBaseDtoBuilder subject(String subject) {
        this.model.subject(subject);
        return this;
    }
    /**
     * Set MapiMessageItemBaseDto.subjectPrefix and return builder.
     * @param subjectPrefix Subject prefix that typically indicates some action on a message, such as \&quot;FW: \&quot; for forwarding.             
     * @return builder
    **/
    public MapiMessageItemBaseDtoBuilder subjectPrefix(String subjectPrefix) {
        this.model.subjectPrefix(subjectPrefix);
        return this;
    }
    /**
     * Set MapiMessageItemBaseDto.properties and return builder.
     * @param properties List of MAPI properties             
     * @return builder
    **/
    public MapiMessageItemBaseDtoBuilder properties(List<MapiPropertyDto> properties) {
        this.model.properties(properties);
        return this;
    }
}
