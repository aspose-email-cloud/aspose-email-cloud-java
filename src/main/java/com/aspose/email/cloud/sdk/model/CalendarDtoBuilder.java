/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CalendarDtoBuilder.java">
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
 *  CalendarDto builder.
 */
public class CalendarDtoBuilder {
    private CalendarDto model;
    public CalendarDtoBuilder(CalendarDto model) {
        this.model = model;
    }

    /**
     * Build CalendarDto instance.
     */
    public CalendarDto build() {
        CalendarDto tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set CalendarDto.attachments and return builder.
     * @param attachments Document attachments.
     * @return builder
    **/
    public CalendarDtoBuilder attachments(List<Attachment> attachments) {
        this.model.attachments(attachments);
        return this;
    }
    /**
     * Set CalendarDto.attendees and return builder.
     * @param attendees Event attendees.
     * @return builder
    **/
    public CalendarDtoBuilder attendees(List<MailAddress> attendees) {
        this.model.attendees(attendees);
        return this;
    }
    /**
     * Set CalendarDto.description and return builder.
     * @param description Description.
     * @return builder
    **/
    public CalendarDtoBuilder description(String description) {
        this.model.description(description);
        return this;
    }
    /**
     * Set CalendarDto.endDate and return builder.
     * @param endDate End date.
     * @return builder
    **/
    public CalendarDtoBuilder endDate(Date endDate) {
        this.model.endDate(endDate);
        return this;
    }
    /**
     * Set CalendarDto.endTimeZone and return builder.
     * @param endTimeZone End time zone.
     * @return builder
    **/
    public CalendarDtoBuilder endTimeZone(String endTimeZone) {
        this.model.endTimeZone(endTimeZone);
        return this;
    }
    /**
     * Set CalendarDto.flags and return builder.
     * @param flags Appointment flags. Items: Enumerates iCalendar flags. Enum, available values: None, AllDayEvent
     * @return builder
    **/
    public CalendarDtoBuilder flags(List<String> flags) {
        this.model.flags(flags);
        return this;
    }
    /**
     * Set CalendarDto.isDescriptionHtml and return builder.
     * @param isDescriptionHtml Indicates if description is in HTML format.
     * @return builder
    **/
    public CalendarDtoBuilder isDescriptionHtml(Boolean isDescriptionHtml) {
        this.model.isDescriptionHtml(isDescriptionHtml);
        return this;
    }
    /**
     * Set CalendarDto.location and return builder.
     * @param location Location.
     * @return builder
    **/
    public CalendarDtoBuilder location(String location) {
        this.model.location(location);
        return this;
    }
    /**
     * Set CalendarDto.method and return builder.
     * @param method Defines the iCalendar object method type associated with the calendar document. Enum, available values: None, Publish, Request, Reply, Add, Cancel, Refresh, Counter, DeclineCounter
     * @return builder
    **/
    public CalendarDtoBuilder method(String method) {
        this.model.method(method);
        return this;
    }
    /**
     * Set CalendarDto.microsoftBusyStatus and return builder.
     * @param microsoftBusyStatus Specifies the BUSY status. Enum, available values: NotDefined, Free, Tentative, Busy, Oof
     * @return builder
    **/
    public CalendarDtoBuilder microsoftBusyStatus(String microsoftBusyStatus) {
        this.model.microsoftBusyStatus(microsoftBusyStatus);
        return this;
    }
    /**
     * Set CalendarDto.microsoftIntendedStatus and return builder.
     * @param microsoftIntendedStatus Specifies the INTENDED status. Enum, available values: NotDefined, Free, Tentative, Busy, Oof
     * @return builder
    **/
    public CalendarDtoBuilder microsoftIntendedStatus(String microsoftIntendedStatus) {
        this.model.microsoftIntendedStatus(microsoftIntendedStatus);
        return this;
    }
    /**
     * Set CalendarDto.optionalAttendees and return builder.
     * @param optionalAttendees Optional attendees.             
     * @return builder
    **/
    public CalendarDtoBuilder optionalAttendees(List<MailAddress> optionalAttendees) {
        this.model.optionalAttendees(optionalAttendees);
        return this;
    }
    /**
     * Set CalendarDto.organizer and return builder.
     * @param organizer Event organizer.             
     * @return builder
    **/
    public CalendarDtoBuilder organizer(MailAddress organizer) {
        this.model.organizer(organizer);
        return this;
    }
    /**
     * Set CalendarDto.recurrenceString and return builder.
     * @param recurrenceString Deprecated, use &#39;Recurrence&#39; property. String representation of recurrence pattern (See iCalendar RFC, \&quot;Recurrence rule\&quot; section). For example:               For daily recurrence:         \&quot;FREQ&#x3D;DAILY;COUNT&#x3D;10;WKST&#x3D;MO\&quot;                   For monthly recurrence:         \&quot;BYSETPOS&#x3D;1;BYDAY&#x3D;MO,TU,WE,TH,FR;FREQ&#x3D;MONTHLY;INTERVAL&#x3D;10;WKST&#x3D;MO\&quot;                   For yearly recurrence:         \&quot;BYMONTHDAY&#x3D;30;BYMONTH&#x3D;1;FREQ&#x3D;YEARLY;WKST&#x3D;MO\&quot;                   
     * @return builder
    **/
    public CalendarDtoBuilder recurrenceString(String recurrenceString) {
        this.model.recurrenceString(recurrenceString);
        return this;
    }
    /**
     * Set CalendarDto.recurrence and return builder.
     * @param recurrence Recurrence pattern             
     * @return builder
    **/
    public CalendarDtoBuilder recurrence(RecurrencePatternDto recurrence) {
        this.model.recurrence(recurrence);
        return this;
    }
    /**
     * Set CalendarDto.reminders and return builder.
     * @param reminders Reminders.
     * @return builder
    **/
    public CalendarDtoBuilder reminders(List<CalendarReminder> reminders) {
        this.model.reminders(reminders);
        return this;
    }
    /**
     * Set CalendarDto.sequenceId and return builder.
     * @param sequenceId The sequence id. Read only.
     * @return builder
    **/
    public CalendarDtoBuilder sequenceId(String sequenceId) {
        this.model.sequenceId(sequenceId);
        return this;
    }
    /**
     * Set CalendarDto.startDate and return builder.
     * @param startDate Start date.
     * @return builder
    **/
    public CalendarDtoBuilder startDate(Date startDate) {
        this.model.startDate(startDate);
        return this;
    }
    /**
     * Set CalendarDto.startTimeZone and return builder.
     * @param startTimeZone Start time zone.
     * @return builder
    **/
    public CalendarDtoBuilder startTimeZone(String startTimeZone) {
        this.model.startTimeZone(startTimeZone);
        return this;
    }
    /**
     * Set CalendarDto.status and return builder.
     * @param status Defines the overall status or confirmation for the calendar document. Enum, available values: NotDefined, Cancelled, Tentative, Confirmed
     * @return builder
    **/
    public CalendarDtoBuilder status(String status) {
        this.model.status(status);
        return this;
    }
    /**
     * Set CalendarDto.summary and return builder.
     * @param summary Summary.
     * @return builder
    **/
    public CalendarDtoBuilder summary(String summary) {
        this.model.summary(summary);
        return this;
    }
    /**
     * Set CalendarDto.transparency and return builder.
     * @param transparency Specifies whether or not this appointment is intended to be visible in availability searches. Enum, available values: NotDefined, Transparent, Opaque
     * @return builder
    **/
    public CalendarDtoBuilder transparency(String transparency) {
        this.model.transparency(transparency);
        return this;
    }
    /**
     * Set CalendarDto.propertyClass and return builder.
     * @param propertyClass Defines the access classification for the calendar. Enum, available values: Public, Private, Confidential, NotDefined
     * @return builder
    **/
    public CalendarDtoBuilder propertyClass(String propertyClass) {
        this.model.propertyClass(propertyClass);
        return this;
    }
    /**
     * Set CalendarDto.microsoftImportance and return builder.
     * @param microsoftImportance Specifies the importance of a calendar object. Enum, available values: Low, Normal, High, NotDefined
     * @return builder
    **/
    public CalendarDtoBuilder microsoftImportance(String microsoftImportance) {
        this.model.microsoftImportance(microsoftImportance);
        return this;
    }
}
