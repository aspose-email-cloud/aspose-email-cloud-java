/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiCalendarExceptionInfoDtoBuilder.java">
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
 *  MapiCalendarExceptionInfoDto builder.
 */
public class MapiCalendarExceptionInfoDtoBuilder {
    private MapiCalendarExceptionInfoDto model;
    public MapiCalendarExceptionInfoDtoBuilder(MapiCalendarExceptionInfoDto model) {
        this.model = model;
    }

    /**
     * Build MapiCalendarExceptionInfoDto instance.
     */
    public MapiCalendarExceptionInfoDto build() {
        MapiCalendarExceptionInfoDto tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set MapiCalendarExceptionInfoDto.attachments and return builder.
     * @param attachments Attachments in the recurrence exception.             
     * @return builder
    **/
    public MapiCalendarExceptionInfoDtoBuilder attachments(List<MapiAttachmentDto> attachments) {
        this.model.attachments(attachments);
        return this;
    }
    /**
     * Set MapiCalendarExceptionInfoDto.body and return builder.
     * @param body Body.             
     * @return builder
    **/
    public MapiCalendarExceptionInfoDtoBuilder body(String body) {
        this.model.body(body);
        return this;
    }
    /**
     * Set MapiCalendarExceptionInfoDto.busyStatus and return builder.
     * @param busyStatus Enumerates the mapi calendar possible busy status./nEnum, available values: Free, Tentative, Busy, OutOfOffice
     * @return builder
    **/
    public MapiCalendarExceptionInfoDtoBuilder busyStatus(String busyStatus) {
        this.model.busyStatus(busyStatus);
        return this;
    }
    /**
     * Set MapiCalendarExceptionInfoDto.endDateTime and return builder.
     * @param endDateTime End date.             
     * @return builder
    **/
    public MapiCalendarExceptionInfoDtoBuilder endDateTime(Date endDateTime) {
        this.model.endDateTime(endDateTime);
        return this;
    }
    /**
     * Set MapiCalendarExceptionInfoDto.hasAttachment and return builder.
     * @param hasAttachment Value of this field specifies whether the Exception Embedded Message object contains attachments.             
     * @return builder
    **/
    public MapiCalendarExceptionInfoDtoBuilder hasAttachment(Boolean hasAttachment) {
        this.model.hasAttachment(hasAttachment);
        return this;
    }
    /**
     * Set MapiCalendarExceptionInfoDto.location and return builder.
     * @param location Location.             
     * @return builder
    **/
    public MapiCalendarExceptionInfoDtoBuilder location(String location) {
        this.model.location(location);
        return this;
    }
    /**
     * Set MapiCalendarExceptionInfoDto.meetingType and return builder.
     * @param meetingType Enumerates the appointment state./nEnum, available values: Meeting, Received, Canceled
     * @return builder
    **/
    public MapiCalendarExceptionInfoDtoBuilder meetingType(String meetingType) {
        this.model.meetingType(meetingType);
        return this;
    }
    /**
     * Set MapiCalendarExceptionInfoDto.originalStartDate and return builder.
     * @param originalStartDate Original start date.             
     * @return builder
    **/
    public MapiCalendarExceptionInfoDtoBuilder originalStartDate(Date originalStartDate) {
        this.model.originalStartDate(originalStartDate);
        return this;
    }
    /**
     * Set MapiCalendarExceptionInfoDto.overrideFlags and return builder.
     * @param overrideFlags Override flags.              Items: Specifies what data in the MapiCalendarOverride structure has a value different from the recurring series./nEnum, available values: Subject, MeetingType, ReminderDelta, Reminder, Location, BusyStatus, Attachment, Subtype, AppointmentColor, ExceptionalBody
     * @return builder
    **/
    public MapiCalendarExceptionInfoDtoBuilder overrideFlags(List<String> overrideFlags) {
        this.model.overrideFlags(overrideFlags);
        return this;
    }
    /**
     * Set MapiCalendarExceptionInfoDto.reminderDelta and return builder.
     * @param reminderDelta Reminder delta.             
     * @return builder
    **/
    public MapiCalendarExceptionInfoDtoBuilder reminderDelta(Integer reminderDelta) {
        this.model.reminderDelta(reminderDelta);
        return this;
    }
    /**
     * Set MapiCalendarExceptionInfoDto.reminderSet and return builder.
     * @param reminderSet Value for the PidLidReminderSet property.             
     * @return builder
    **/
    public MapiCalendarExceptionInfoDtoBuilder reminderSet(Boolean reminderSet) {
        this.model.reminderSet(reminderSet);
        return this;
    }
    /**
     * Set MapiCalendarExceptionInfoDto.startDateTime and return builder.
     * @param startDateTime Start date.             
     * @return builder
    **/
    public MapiCalendarExceptionInfoDtoBuilder startDateTime(Date startDateTime) {
        this.model.startDateTime(startDateTime);
        return this;
    }
    /**
     * Set MapiCalendarExceptionInfoDto.subject and return builder.
     * @param subject Subject.             
     * @return builder
    **/
    public MapiCalendarExceptionInfoDtoBuilder subject(String subject) {
        this.model.subject(subject);
        return this;
    }
    /**
     * Set MapiCalendarExceptionInfoDto.subType and return builder.
     * @param subType SubType.             
     * @return builder
    **/
    public MapiCalendarExceptionInfoDtoBuilder subType(Integer subType) {
        this.model.subType(subType);
        return this;
    }
}
