/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiContactOtherPropertySetDtoBuilder.java">
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
 *  MapiContactOtherPropertySetDto builder.
 */
public class MapiContactOtherPropertySetDtoBuilder {
    private final MapiContactOtherPropertySetDto model;
    public MapiContactOtherPropertySetDtoBuilder(MapiContactOtherPropertySetDto model) {
        this.model = model;
    }

    /**
     * Build MapiContactOtherPropertySetDto instance.
     */
    public MapiContactOtherPropertySetDto build() {
        return model;
    }
    /**
     * Set MapiContactOtherPropertySetDto._private and return builder.
     * @param _private Indicates whether the end-user wants this message object hidden from other users who have access to the message object.             
     * @return builder
    **/
    public MapiContactOtherPropertySetDtoBuilder _private(Boolean _private) {
        this.model._private(_private);
        return this;
    }
    /**
     * Set MapiContactOtherPropertySetDto.journal and return builder.
     * @param journal Specifies whether to create a journal for each action associated with this contact.             
     * @return builder
    **/
    public MapiContactOtherPropertySetDtoBuilder journal(Boolean journal) {
        this.model.journal(journal);
        return this;
    }
    /**
     * Set MapiContactOtherPropertySetDto.reminderTime and return builder.
     * @param reminderTime Specifies the initial signal time for a reminder.             
     * @return builder
    **/
    public MapiContactOtherPropertySetDtoBuilder reminderTime(Date reminderTime) {
        this.model.reminderTime(reminderTime);
        return this;
    }
    /**
     * Set MapiContactOtherPropertySetDto.reminderTopic and return builder.
     * @param reminderTopic Represents the status of a meeting request.             
     * @return builder
    **/
    public MapiContactOtherPropertySetDtoBuilder reminderTopic(String reminderTopic) {
        this.model.reminderTopic(reminderTopic);
        return this;
    }
    /**
     * Set MapiContactOtherPropertySetDto.userField1 and return builder.
     * @param userField1 Specifies the first field on the contact that is intended for miscellaneous use for the contact.             
     * @return builder
    **/
    public MapiContactOtherPropertySetDtoBuilder userField1(String userField1) {
        this.model.userField1(userField1);
        return this;
    }
    /**
     * Set MapiContactOtherPropertySetDto.userField2 and return builder.
     * @param userField2 Specifies the second field on the contact that is intended for miscellaneous use for the contact.             
     * @return builder
    **/
    public MapiContactOtherPropertySetDtoBuilder userField2(String userField2) {
        this.model.userField2(userField2);
        return this;
    }
    /**
     * Set MapiContactOtherPropertySetDto.userField3 and return builder.
     * @param userField3 Specifies the third field on the contact that is intended for miscellaneous use for the contact.             
     * @return builder
    **/
    public MapiContactOtherPropertySetDtoBuilder userField3(String userField3) {
        this.model.userField3(userField3);
        return this;
    }
    /**
     * Set MapiContactOtherPropertySetDto.userField4 and return builder.
     * @param userField4 Specifies the forth field on the contact that is intended for miscellaneous use for the contact.             
     * @return builder
    **/
    public MapiContactOtherPropertySetDtoBuilder userField4(String userField4) {
        this.model.userField4(userField4);
        return this;
    }
}
