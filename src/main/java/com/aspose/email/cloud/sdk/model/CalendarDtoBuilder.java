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

import java.util.List;

/**
 *  CalendarDto builder.
 */
public class CalendarDtoBuilder {
    private final CalendarDto model;
    public CalendarDtoBuilder(CalendarDto model) {
        this.model = model;
    }

    public CalendarDto build() {
        return model;
    }
    public CalendarDtoBuilder attachments(List<Attachment> attachments) {
        this.model.attachments(attachments);
        return this;
    }
    public CalendarDtoBuilder attendees(List<MailAddress> attendees) {
        this.model.attendees(attendees);
        return this;
    }
    public CalendarDtoBuilder description(String description) {
        this.model.description(description);
        return this;
    }
    public CalendarDtoBuilder endDate(Date endDate) {
        this.model.endDate(endDate);
        return this;
    }
    public CalendarDtoBuilder endTimeZone(String endTimeZone) {
        this.model.endTimeZone(endTimeZone);
        return this;
    }
    public CalendarDtoBuilder flags(List<String> flags) {
        this.model.flags(flags);
        return this;
    }
    public CalendarDtoBuilder isDescriptionHtml(Boolean isDescriptionHtml) {
        this.model.isDescriptionHtml(isDescriptionHtml);
        return this;
    }
    public CalendarDtoBuilder location(String location) {
        this.model.location(location);
        return this;
    }
    public CalendarDtoBuilder method(String method) {
        this.model.method(method);
        return this;
    }
    public CalendarDtoBuilder microsoftBusyStatus(String microsoftBusyStatus) {
        this.model.microsoftBusyStatus(microsoftBusyStatus);
        return this;
    }
    public CalendarDtoBuilder microsoftIntendedStatus(String microsoftIntendedStatus) {
        this.model.microsoftIntendedStatus(microsoftIntendedStatus);
        return this;
    }
    public CalendarDtoBuilder optionalAttendees(List<MailAddress> optionalAttendees) {
        this.model.optionalAttendees(optionalAttendees);
        return this;
    }
    public CalendarDtoBuilder organizer(MailAddress organizer) {
        this.model.organizer(organizer);
        return this;
    }
    public CalendarDtoBuilder recurrenceString(String recurrenceString) {
        this.model.recurrenceString(recurrenceString);
        return this;
    }
    public CalendarDtoBuilder recurrence(RecurrencePatternDto recurrence) {
        this.model.recurrence(recurrence);
        return this;
    }
    public CalendarDtoBuilder reminders(List<CalendarReminder> reminders) {
        this.model.reminders(reminders);
        return this;
    }
    public CalendarDtoBuilder sequenceId(String sequenceId) {
        this.model.sequenceId(sequenceId);
        return this;
    }
    public CalendarDtoBuilder startDate(Date startDate) {
        this.model.startDate(startDate);
        return this;
    }
    public CalendarDtoBuilder startTimeZone(String startTimeZone) {
        this.model.startTimeZone(startTimeZone);
        return this;
    }
    public CalendarDtoBuilder status(String status) {
        this.model.status(status);
        return this;
    }
    public CalendarDtoBuilder summary(String summary) {
        this.model.summary(summary);
        return this;
    }
    public CalendarDtoBuilder transparency(String transparency) {
        this.model.transparency(transparency);
        return this;
    }
}
