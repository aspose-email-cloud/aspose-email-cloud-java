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
    private final MapiContactDto model;
    public MapiContactDtoBuilder(MapiContactDto model) {
        this.model = model;
    }

    public MapiContactDto build() {
        return model;
    }
    public MapiContactDtoBuilder attachments(List<MapiAttachmentDto> attachments) {
        this.model.attachments(attachments);
        return this;
    }
    public MapiContactDtoBuilder billing(String billing) {
        this.model.billing(billing);
        return this;
    }
    public MapiContactDtoBuilder body(String body) {
        this.model.body(body);
        return this;
    }
    public MapiContactDtoBuilder bodyHtml(String bodyHtml) {
        this.model.bodyHtml(bodyHtml);
        return this;
    }
    public MapiContactDtoBuilder bodyRtf(String bodyRtf) {
        this.model.bodyRtf(bodyRtf);
        return this;
    }
    public MapiContactDtoBuilder bodyType(String bodyType) {
        this.model.bodyType(bodyType);
        return this;
    }
    public MapiContactDtoBuilder categories(List<String> categories) {
        this.model.categories(categories);
        return this;
    }
    public MapiContactDtoBuilder companies(List<String> companies) {
        this.model.companies(companies);
        return this;
    }
    public MapiContactDtoBuilder itemId(String itemId) {
        this.model.itemId(itemId);
        return this;
    }
    public MapiContactDtoBuilder messageClass(String messageClass) {
        this.model.messageClass(messageClass);
        return this;
    }
    public MapiContactDtoBuilder mileage(String mileage) {
        this.model.mileage(mileage);
        return this;
    }
    public MapiContactDtoBuilder recipients(List<MapiRecipientDto> recipients) {
        this.model.recipients(recipients);
        return this;
    }
    public MapiContactDtoBuilder sensitivity(String sensitivity) {
        this.model.sensitivity(sensitivity);
        return this;
    }
    public MapiContactDtoBuilder subject(String subject) {
        this.model.subject(subject);
        return this;
    }
    public MapiContactDtoBuilder subjectPrefix(String subjectPrefix) {
        this.model.subjectPrefix(subjectPrefix);
        return this;
    }
    public MapiContactDtoBuilder properties(List<MapiPropertyDto> properties) {
        this.model.properties(properties);
        return this;
    }
    public MapiContactDtoBuilder electronicAddresses(MapiContactElectronicAddressPropertySetDto electronicAddresses) {
        this.model.electronicAddresses(electronicAddresses);
        return this;
    }
    public MapiContactDtoBuilder events(MapiContactEventPropertySetDto events) {
        this.model.events(events);
        return this;
    }
    public MapiContactDtoBuilder nameInfo(MapiContactNamePropertySetDto nameInfo) {
        this.model.nameInfo(nameInfo);
        return this;
    }
    public MapiContactDtoBuilder otherFields(MapiContactOtherPropertySetDto otherFields) {
        this.model.otherFields(otherFields);
        return this;
    }
    public MapiContactDtoBuilder personalInfo(MapiContactPersonalInfoPropertySetDto personalInfo) {
        this.model.personalInfo(personalInfo);
        return this;
    }
    public MapiContactDtoBuilder photo(MapiContactPhotoDto photo) {
        this.model.photo(photo);
        return this;
    }
    public MapiContactDtoBuilder physicalAddresses(MapiContactPhysicalAddressPropertySetDto physicalAddresses) {
        this.model.physicalAddresses(physicalAddresses);
        return this;
    }
    public MapiContactDtoBuilder professionalInfo(MapiContactProfessionalPropertySetDto professionalInfo) {
        this.model.professionalInfo(professionalInfo);
        return this;
    }
    public MapiContactDtoBuilder telephones(MapiContactTelephonePropertySetDto telephones) {
        this.model.telephones(telephones);
        return this;
    }
}
