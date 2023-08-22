/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiCalendarDtoBuilder.java">
*   Copyright (c) 2018-2023 Aspose Pty Ltd. All rights reserved.
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
 *  MapiCalendarDto builder.
 */
public class MapiCalendarDtoBuilder {
    private MapiCalendarDto model;
    public MapiCalendarDtoBuilder(MapiCalendarDto model) {
        this.model = model;
    }

    /**
     * Build MapiCalendarDto instance.
     */
    public MapiCalendarDto build() {
        MapiCalendarDto tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set MapiCalendarDto.attachments and return builder.
     * @param attachments Message item attachments.             
     * @return builder
    **/
    public MapiCalendarDtoBuilder attachments(List<MapiAttachmentDto> attachments) {
        this.model.attachments(attachments);
        return this;
    }
    /**
     * Set MapiCalendarDto.billing and return builder.
     * @param billing Billing information associated with an item.             
     * @return builder
    **/
    public MapiCalendarDtoBuilder billing(String billing) {
        this.model.billing(billing);
        return this;
    }
    /**
     * Set MapiCalendarDto.body and return builder.
     * @param body Message text.             
     * @return builder
    **/
    public MapiCalendarDtoBuilder body(String body) {
        this.model.body(body);
        return this;
    }
    /**
     * Set MapiCalendarDto.bodyHtml and return builder.
     * @param bodyHtml Gets the BodyRtf of the message converted to HTML, if present, otherwise an empty string.             
     * @return builder
    **/
    public MapiCalendarDtoBuilder bodyHtml(String bodyHtml) {
        this.model.bodyHtml(bodyHtml);
        return this;
    }
    /**
     * Set MapiCalendarDto.bodyRtf and return builder.
     * @param bodyRtf RTF formatted message text.             
     * @return builder
    **/
    public MapiCalendarDtoBuilder bodyRtf(String bodyRtf) {
        this.model.bodyRtf(bodyRtf);
        return this;
    }
    /**
     * Set MapiCalendarDto.bodyType and return builder.
     * @param bodyType The content type of message body. Enum, available values: PlainText, Html, Rtf
     * @return builder
    **/
    public MapiCalendarDtoBuilder bodyType(String bodyType) {
        this.model.bodyType(bodyType);
        return this;
    }
    /**
     * Set MapiCalendarDto.categories and return builder.
     * @param categories Contains keywords or categories for the message object.             
     * @return builder
    **/
    public MapiCalendarDtoBuilder categories(List<String> categories) {
        this.model.categories(categories);
        return this;
    }
    /**
     * Set MapiCalendarDto.companies and return builder.
     * @param companies Contains the names of the companies that are associated with an item.             
     * @return builder
    **/
    public MapiCalendarDtoBuilder companies(List<String> companies) {
        this.model.companies(companies);
        return this;
    }
    /**
     * Set MapiCalendarDto.itemId and return builder.
     * @param itemId The item id, uses with a server.             
     * @return builder
    **/
    public MapiCalendarDtoBuilder itemId(String itemId) {
        this.model.itemId(itemId);
        return this;
    }
    /**
     * Set MapiCalendarDto.messageClass and return builder.
     * @param messageClass Case-sensitive string that identifies the sender-defined message class, such as IPM.Note. The message class specifies the type, purpose, or content of the message.             
     * @return builder
    **/
    public MapiCalendarDtoBuilder messageClass(String messageClass) {
        this.model.messageClass(messageClass);
        return this;
    }
    /**
     * Set MapiCalendarDto.mileage and return builder.
     * @param mileage Contains the mileage information that is associated with an item.             
     * @return builder
    **/
    public MapiCalendarDtoBuilder mileage(String mileage) {
        this.model.mileage(mileage);
        return this;
    }
    /**
     * Set MapiCalendarDto.recipients and return builder.
     * @param recipients Recipients of the message.             
     * @return builder
    **/
    public MapiCalendarDtoBuilder recipients(List<MapiRecipientDto> recipients) {
        this.model.recipients(recipients);
        return this;
    }
    /**
     * Set MapiCalendarDto.sensitivity and return builder.
     * @param sensitivity Contains values that indicate the message sensitivity. Enum, available values: None, Personal, Private, CompanyConfidential
     * @return builder
    **/
    public MapiCalendarDtoBuilder sensitivity(String sensitivity) {
        this.model.sensitivity(sensitivity);
        return this;
    }
    /**
     * Set MapiCalendarDto.subject and return builder.
     * @param subject Subject of the message.             
     * @return builder
    **/
    public MapiCalendarDtoBuilder subject(String subject) {
        this.model.subject(subject);
        return this;
    }
    /**
     * Set MapiCalendarDto.subjectPrefix and return builder.
     * @param subjectPrefix Subject prefix that typically indicates some action on a message, such as \&quot;FW: \&quot; for forwarding.             
     * @return builder
    **/
    public MapiCalendarDtoBuilder subjectPrefix(String subjectPrefix) {
        this.model.subjectPrefix(subjectPrefix);
        return this;
    }
    /**
     * Set MapiCalendarDto.properties and return builder.
     * @param properties List of MAPI properties             
     * @return builder
    **/
    public MapiCalendarDtoBuilder properties(List<MapiPropertyDto> properties) {
        this.model.properties(properties);
        return this;
    }
    /**
     * Set MapiCalendarDto.appointmentCounterProposal and return builder.
     * @param appointmentCounterProposal Value indicating whether a Meeting Response object is a counter proposal.             
     * @return builder
    **/
    public MapiCalendarDtoBuilder appointmentCounterProposal(Boolean appointmentCounterProposal) {
        this.model.appointmentCounterProposal(appointmentCounterProposal);
        return this;
    }
    /**
     * Set MapiCalendarDto.attendees and return builder.
     * @param attendees Attendees             
     * @return builder
    **/
    public MapiCalendarDtoBuilder attendees(MapiCalendarAttendeesDto attendees) {
        this.model.attendees(attendees);
        return this;
    }
    /**
     * Set MapiCalendarDto.busyStatus and return builder.
     * @param busyStatus Enumerates the mapi calendar possible busy status. Enum, available values: Free, Tentative, Busy, OutOfOffice
     * @return builder
    **/
    public MapiCalendarDtoBuilder busyStatus(String busyStatus) {
        this.model.busyStatus(busyStatus);
        return this;
    }
    /**
     * Set MapiCalendarDto.clientIntent and return builder.
     * @param clientIntent Actions the user has taken on this Meeting object.              Items: Enumerates the actions the user can taken on the Meeting object. Enum, available values: Manager, Delegate, DeletedWithNoResponse, DeletedExceptionWithNoResponse, RespondedTentative, RespondedAccept, RespondedDecline, ModifiedStartTime, ModifiedEndTime, ModifiedLocation, RespondedExceptionDecline, Canceled, ExceptionCanceled
     * @return builder
    **/
    public MapiCalendarDtoBuilder clientIntent(List<String> clientIntent) {
        this.model.clientIntent(clientIntent);
        return this;
    }
    /**
     * Set MapiCalendarDto.endDate and return builder.
     * @param endDate End date and time of the event. If the date is not set, default value for DateTime is returned.             
     * @return builder
    **/
    public MapiCalendarDtoBuilder endDate(Date endDate) {
        this.model.endDate(endDate);
        return this;
    }
    /**
     * Set MapiCalendarDto.endDateTimeZone and return builder.
     * @param endDateTimeZone Time zone information that indicates the time zone of the EndDate property.             
     * @return builder
    **/
    public MapiCalendarDtoBuilder endDateTimeZone(MapiCalendarTimeZoneDto endDateTimeZone) {
        this.model.endDateTimeZone(endDateTimeZone);
        return this;
    }
    /**
     * Set MapiCalendarDto.isAllDay and return builder.
     * @param isAllDay Value indicating whether the event is an all-day event.             
     * @return builder
    **/
    public MapiCalendarDtoBuilder isAllDay(Boolean isAllDay) {
        this.model.isAllDay(isAllDay);
        return this;
    }
    /**
     * Set MapiCalendarDto.keyWords and return builder.
     * @param keyWords Categories of the calendar object.             
     * @return builder
    **/
    public MapiCalendarDtoBuilder keyWords(String keyWords) {
        this.model.keyWords(keyWords);
        return this;
    }
    /**
     * Set MapiCalendarDto.location and return builder.
     * @param location Location of the event.             
     * @return builder
    **/
    public MapiCalendarDtoBuilder location(String location) {
        this.model.location(location);
        return this;
    }
    /**
     * Set MapiCalendarDto.recurrence and return builder.
     * @param recurrence Recurrence properties.             
     * @return builder
    **/
    public MapiCalendarDtoBuilder recurrence(MapiCalendarEventRecurrenceDto recurrence) {
        this.model.recurrence(recurrence);
        return this;
    }
    /**
     * Set MapiCalendarDto.reminderDelta and return builder.
     * @param reminderDelta Interval, in minutes, between the time at which the reminder first becomes overdue and the start time of the Calendar object.             
     * @return builder
    **/
    public MapiCalendarDtoBuilder reminderDelta(Integer reminderDelta) {
        this.model.reminderDelta(reminderDelta);
        return this;
    }
    /**
     * Set MapiCalendarDto.reminderFileParameter and return builder.
     * @param reminderFileParameter Full path of the sound that a client SHOULD play when the reminder becomes overdue.             
     * @return builder
    **/
    public MapiCalendarDtoBuilder reminderFileParameter(String reminderFileParameter) {
        this.model.reminderFileParameter(reminderFileParameter);
        return this;
    }
    /**
     * Set MapiCalendarDto.reminderSet and return builder.
     * @param reminderSet Value indicating whether a reminder is set on the object.             
     * @return builder
    **/
    public MapiCalendarDtoBuilder reminderSet(Boolean reminderSet) {
        this.model.reminderSet(reminderSet);
        return this;
    }
    /**
     * Set MapiCalendarDto.sequence and return builder.
     * @param sequence Sequence number.             
     * @return builder
    **/
    public MapiCalendarDtoBuilder sequence(Integer sequence) {
        this.model.sequence(sequence);
        return this;
    }
    /**
     * Set MapiCalendarDto.startDate and return builder.
     * @param startDate Start date and time of the event. If the date is not set, default value for DateTime is returned.             
     * @return builder
    **/
    public MapiCalendarDtoBuilder startDate(Date startDate) {
        this.model.startDate(startDate);
        return this;
    }
    /**
     * Set MapiCalendarDto.startDateTimeZone and return builder.
     * @param startDateTimeZone Time zone information that indicates the time zone of the StartDate property.             
     * @return builder
    **/
    public MapiCalendarDtoBuilder startDateTimeZone(MapiCalendarTimeZoneDto startDateTimeZone) {
        this.model.startDateTimeZone(startDateTimeZone);
        return this;
    }
    /**
     * Set MapiCalendarDto.uid and return builder.
     * @param uid Unique identifier.             
     * @return builder
    **/
    public MapiCalendarDtoBuilder uid(String uid) {
        this.model.uid(uid);
        return this;
    }
    /**
     * Set MapiCalendarDto.organizer and return builder.
     * @param organizer Organizer             
     * @return builder
    **/
    public MapiCalendarDtoBuilder organizer(MapiElectronicAddressDto organizer) {
        this.model.organizer(organizer);
        return this;
    }
}
