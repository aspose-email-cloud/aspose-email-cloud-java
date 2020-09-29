/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiContactDtoBuilder.java">
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
 *  MapiContactDto builder.
 */
public class MapiContactDtoBuilder {
    private MapiContactDto model;
    public MapiContactDtoBuilder(MapiContactDto model) {
        this.model = model;
    }

    /**
     * Build MapiContactDto instance.
     */
    public MapiContactDto build() {
        MapiContactDto tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set MapiContactDto.attachments and return builder.
     * @param attachments Message item attachments.             
     * @return builder
    **/
    public MapiContactDtoBuilder attachments(List<MapiAttachmentDto> attachments) {
        this.model.attachments(attachments);
        return this;
    }
    /**
     * Set MapiContactDto.billing and return builder.
     * @param billing Billing information associated with an item.             
     * @return builder
    **/
    public MapiContactDtoBuilder billing(String billing) {
        this.model.billing(billing);
        return this;
    }
    /**
     * Set MapiContactDto.body and return builder.
     * @param body Message text.             
     * @return builder
    **/
    public MapiContactDtoBuilder body(String body) {
        this.model.body(body);
        return this;
    }
    /**
     * Set MapiContactDto.bodyHtml and return builder.
     * @param bodyHtml Gets the BodyRtf of the message converted to HTML, if present, otherwise an empty string.             
     * @return builder
    **/
    public MapiContactDtoBuilder bodyHtml(String bodyHtml) {
        this.model.bodyHtml(bodyHtml);
        return this;
    }
    /**
     * Set MapiContactDto.bodyRtf and return builder.
     * @param bodyRtf RTF formatted message text.             
     * @return builder
    **/
    public MapiContactDtoBuilder bodyRtf(String bodyRtf) {
        this.model.bodyRtf(bodyRtf);
        return this;
    }
    /**
     * Set MapiContactDto.bodyType and return builder.
     * @param bodyType The content type of message body. Enum, available values: PlainText, Html, Rtf
     * @return builder
    **/
    public MapiContactDtoBuilder bodyType(String bodyType) {
        this.model.bodyType(bodyType);
        return this;
    }
    /**
     * Set MapiContactDto.categories and return builder.
     * @param categories Contains keywords or categories for the message object.             
     * @return builder
    **/
    public MapiContactDtoBuilder categories(List<String> categories) {
        this.model.categories(categories);
        return this;
    }
    /**
     * Set MapiContactDto.companies and return builder.
     * @param companies Contains the names of the companies that are associated with an item.             
     * @return builder
    **/
    public MapiContactDtoBuilder companies(List<String> companies) {
        this.model.companies(companies);
        return this;
    }
    /**
     * Set MapiContactDto.itemId and return builder.
     * @param itemId The item id, uses with a server.             
     * @return builder
    **/
    public MapiContactDtoBuilder itemId(String itemId) {
        this.model.itemId(itemId);
        return this;
    }
    /**
     * Set MapiContactDto.messageClass and return builder.
     * @param messageClass Case-sensitive string that identifies the sender-defined message class, such as IPM.Note. The message class specifies the type, purpose, or content of the message.             
     * @return builder
    **/
    public MapiContactDtoBuilder messageClass(String messageClass) {
        this.model.messageClass(messageClass);
        return this;
    }
    /**
     * Set MapiContactDto.mileage and return builder.
     * @param mileage Contains the mileage information that is associated with an item.             
     * @return builder
    **/
    public MapiContactDtoBuilder mileage(String mileage) {
        this.model.mileage(mileage);
        return this;
    }
    /**
     * Set MapiContactDto.recipients and return builder.
     * @param recipients Recipients of the message.             
     * @return builder
    **/
    public MapiContactDtoBuilder recipients(List<MapiRecipientDto> recipients) {
        this.model.recipients(recipients);
        return this;
    }
    /**
     * Set MapiContactDto.sensitivity and return builder.
     * @param sensitivity Contains values that indicate the message sensitivity. Enum, available values: None, Personal, Private, CompanyConfidential
     * @return builder
    **/
    public MapiContactDtoBuilder sensitivity(String sensitivity) {
        this.model.sensitivity(sensitivity);
        return this;
    }
    /**
     * Set MapiContactDto.subject and return builder.
     * @param subject Subject of the message.             
     * @return builder
    **/
    public MapiContactDtoBuilder subject(String subject) {
        this.model.subject(subject);
        return this;
    }
    /**
     * Set MapiContactDto.subjectPrefix and return builder.
     * @param subjectPrefix Subject prefix that typically indicates some action on a message, such as \&quot;FW: \&quot; for forwarding.             
     * @return builder
    **/
    public MapiContactDtoBuilder subjectPrefix(String subjectPrefix) {
        this.model.subjectPrefix(subjectPrefix);
        return this;
    }
    /**
     * Set MapiContactDto.properties and return builder.
     * @param properties List of MAPI properties             
     * @return builder
    **/
    public MapiContactDtoBuilder properties(List<MapiPropertyDto> properties) {
        this.model.properties(properties);
        return this;
    }
    /**
     * Set MapiContactDto.electronicAddresses and return builder.
     * @param electronicAddresses Specify properties for up to three different e-mail addresses and three different fax addresses.             
     * @return builder
    **/
    public MapiContactDtoBuilder electronicAddresses(MapiContactElectronicAddressPropertySetDto electronicAddresses) {
        this.model.electronicAddresses(electronicAddresses);
        return this;
    }
    /**
     * Set MapiContactDto.events and return builder.
     * @param events Specify events associated with a contact.             
     * @return builder
    **/
    public MapiContactDtoBuilder events(MapiContactEventPropertySetDto events) {
        this.model.events(events);
        return this;
    }
    /**
     * Set MapiContactDto.nameInfo and return builder.
     * @param nameInfo The properties are used to specify the name of the person represented by the contact.             
     * @return builder
    **/
    public MapiContactDtoBuilder nameInfo(MapiContactNamePropertySetDto nameInfo) {
        this.model.nameInfo(nameInfo);
        return this;
    }
    /**
     * Set MapiContactDto.otherFields and return builder.
     * @param otherFields Specify other fields of contact.             
     * @return builder
    **/
    public MapiContactDtoBuilder otherFields(MapiContactOtherPropertySetDto otherFields) {
        this.model.otherFields(otherFields);
        return this;
    }
    /**
     * Set MapiContactDto.personalInfo and return builder.
     * @param personalInfo Specify other additional contact information.             
     * @return builder
    **/
    public MapiContactDtoBuilder personalInfo(MapiContactPersonalInfoPropertySetDto personalInfo) {
        this.model.personalInfo(personalInfo);
        return this;
    }
    /**
     * Set MapiContactDto.photo and return builder.
     * @param photo Contact photo.             
     * @return builder
    **/
    public MapiContactDtoBuilder photo(MapiContactPhotoDto photo) {
        this.model.photo(photo);
        return this;
    }
    /**
     * Set MapiContactDto.physicalAddresses and return builder.
     * @param physicalAddresses Specify three physical addresses: Home Address, Work Address, and Other Address. One of the addresses can be marked as the Mailing Address.             
     * @return builder
    **/
    public MapiContactDtoBuilder physicalAddresses(MapiContactPhysicalAddressPropertySetDto physicalAddresses) {
        this.model.physicalAddresses(physicalAddresses);
        return this;
    }
    /**
     * Set MapiContactDto.professionalInfo and return builder.
     * @param professionalInfo Properties are used to store professional details for the person represented by the contact.             
     * @return builder
    **/
    public MapiContactDtoBuilder professionalInfo(MapiContactProfessionalPropertySetDto professionalInfo) {
        this.model.professionalInfo(professionalInfo);
        return this;
    }
    /**
     * Set MapiContactDto.telephones and return builder.
     * @param telephones Specify telephone numbers for the contact.             
     * @return builder
    **/
    public MapiContactDtoBuilder telephones(MapiContactTelephonePropertySetDto telephones) {
        this.model.telephones(telephones);
        return this;
    }
}
