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

    public MapiMessageItemBaseDto build() {
        return model;
    }
    public MapiMessageItemBaseDtoBuilder attachments(List<MapiAttachmentDto> attachments) {
        this.model.attachments(attachments);
        return this;
    }
    public MapiMessageItemBaseDtoBuilder billing(String billing) {
        this.model.billing(billing);
        return this;
    }
    public MapiMessageItemBaseDtoBuilder body(String body) {
        this.model.body(body);
        return this;
    }
    public MapiMessageItemBaseDtoBuilder bodyHtml(String bodyHtml) {
        this.model.bodyHtml(bodyHtml);
        return this;
    }
    public MapiMessageItemBaseDtoBuilder bodyRtf(String bodyRtf) {
        this.model.bodyRtf(bodyRtf);
        return this;
    }
    public MapiMessageItemBaseDtoBuilder bodyType(String bodyType) {
        this.model.bodyType(bodyType);
        return this;
    }
    public MapiMessageItemBaseDtoBuilder categories(List<String> categories) {
        this.model.categories(categories);
        return this;
    }
    public MapiMessageItemBaseDtoBuilder companies(List<String> companies) {
        this.model.companies(companies);
        return this;
    }
    public MapiMessageItemBaseDtoBuilder itemId(String itemId) {
        this.model.itemId(itemId);
        return this;
    }
    public MapiMessageItemBaseDtoBuilder messageClass(String messageClass) {
        this.model.messageClass(messageClass);
        return this;
    }
    public MapiMessageItemBaseDtoBuilder mileage(String mileage) {
        this.model.mileage(mileage);
        return this;
    }
    public MapiMessageItemBaseDtoBuilder recipients(List<MapiRecipientDto> recipients) {
        this.model.recipients(recipients);
        return this;
    }
    public MapiMessageItemBaseDtoBuilder sensitivity(String sensitivity) {
        this.model.sensitivity(sensitivity);
        return this;
    }
    public MapiMessageItemBaseDtoBuilder subject(String subject) {
        this.model.subject(subject);
        return this;
    }
    public MapiMessageItemBaseDtoBuilder subjectPrefix(String subjectPrefix) {
        this.model.subjectPrefix(subjectPrefix);
        return this;
    }
    public MapiMessageItemBaseDtoBuilder properties(List<MapiPropertyDto> properties) {
        this.model.properties(properties);
        return this;
    }
}
