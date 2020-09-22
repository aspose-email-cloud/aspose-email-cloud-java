/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiCalendarDtoBuilder.java">
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
 *  MapiCalendarDto builder.
 */
public class MapiCalendarDtoBuilder {
    private final MapiCalendarDto model;
    public MapiCalendarDtoBuilder(MapiCalendarDto model) {
        this.model = model;
    }

    public MapiCalendarDto build() {
        return model;
    }
    public MapiCalendarDtoBuilder attachments(List<MapiAttachmentDto> attachments) {
        this.model.attachments(attachments);
        return this;
    }
    public MapiCalendarDtoBuilder billing(String billing) {
        this.model.billing(billing);
        return this;
    }
    public MapiCalendarDtoBuilder body(String body) {
        this.model.body(body);
        return this;
    }
    public MapiCalendarDtoBuilder bodyHtml(String bodyHtml) {
        this.model.bodyHtml(bodyHtml);
        return this;
    }
    public MapiCalendarDtoBuilder bodyRtf(String bodyRtf) {
        this.model.bodyRtf(bodyRtf);
        return this;
    }
    public MapiCalendarDtoBuilder bodyType(String bodyType) {
        this.model.bodyType(bodyType);
        return this;
    }
    public MapiCalendarDtoBuilder categories(List<String> categories) {
        this.model.categories(categories);
        return this;
    }
    public MapiCalendarDtoBuilder companies(List<String> companies) {
        this.model.companies(companies);
        return this;
    }
    public MapiCalendarDtoBuilder itemId(String itemId) {
        this.model.itemId(itemId);
        return this;
    }
    public MapiCalendarDtoBuilder messageClass(String messageClass) {
        this.model.messageClass(messageClass);
        return this;
    }
    public MapiCalendarDtoBuilder mileage(String mileage) {
        this.model.mileage(mileage);
        return this;
    }
    public MapiCalendarDtoBuilder recipients(List<MapiRecipientDto> recipients) {
        this.model.recipients(recipients);
        return this;
    }
    public MapiCalendarDtoBuilder sensitivity(String sensitivity) {
        this.model.sensitivity(sensitivity);
        return this;
    }
    public MapiCalendarDtoBuilder subject(String subject) {
        this.model.subject(subject);
        return this;
    }
    public MapiCalendarDtoBuilder subjectPrefix(String subjectPrefix) {
        this.model.subjectPrefix(subjectPrefix);
        return this;
    }
    public MapiCalendarDtoBuilder properties(List<MapiPropertyDto> properties) {
        this.model.properties(properties);
        return this;
    }
    public MapiCalendarDtoBuilder appointmentCounterProposal(Boolean appointmentCounterProposal) {
        this.model.appointmentCounterProposal(appointmentCounterProposal);
        return this;
    }
    public MapiCalendarDtoBuilder attendees(MapiCalendarAttendeesDto attendees) {
        this.model.attendees(attendees);
        return this;
    }
    public MapiCalendarDtoBuilder busyStatus(String busyStatus) {
        this.model.busyStatus(busyStatus);
        return this;
    }
    public MapiCalendarDtoBuilder clientIntent(List<String> clientIntent) {
        this.model.clientIntent(clientIntent);
        return this;
    }
    public MapiCalendarDtoBuilder endDate(Date endDate) {
        this.model.endDate(endDate);
        return this;
    }
    public MapiCalendarDtoBuilder endDateTimeZone(MapiCalendarTimeZoneDto endDateTimeZone) {
        this.model.endDateTimeZone(endDateTimeZone);
        return this;
    }
    public MapiCalendarDtoBuilder isAllDay(Boolean isAllDay) {
        this.model.isAllDay(isAllDay);
        return this;
    }
    public MapiCalendarDtoBuilder keyWords(String keyWords) {
        this.model.keyWords(keyWords);
        return this;
    }
    public MapiCalendarDtoBuilder location(String location) {
        this.model.location(location);
        return this;
    }
    public MapiCalendarDtoBuilder recurrence(MapiCalendarEventRecurrenceDto recurrence) {
        this.model.recurrence(recurrence);
        return this;
    }
    public MapiCalendarDtoBuilder reminderDelta(Integer reminderDelta) {
        this.model.reminderDelta(reminderDelta);
        return this;
    }
    public MapiCalendarDtoBuilder reminderFileParameter(String reminderFileParameter) {
        this.model.reminderFileParameter(reminderFileParameter);
        return this;
    }
    public MapiCalendarDtoBuilder reminderSet(Boolean reminderSet) {
        this.model.reminderSet(reminderSet);
        return this;
    }
    public MapiCalendarDtoBuilder sequence(Integer sequence) {
        this.model.sequence(sequence);
        return this;
    }
    public MapiCalendarDtoBuilder startDate(Date startDate) {
        this.model.startDate(startDate);
        return this;
    }
    public MapiCalendarDtoBuilder startDateTimeZone(MapiCalendarTimeZoneDto startDateTimeZone) {
        this.model.startDateTimeZone(startDateTimeZone);
        return this;
    }
    public MapiCalendarDtoBuilder uid(String uid) {
        this.model.uid(uid);
        return this;
    }
    public MapiCalendarDtoBuilder organizer(MapiElectronicAddressDto organizer) {
        this.model.organizer(organizer);
        return this;
    }
}
