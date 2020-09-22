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

import java.util.List;

/**
 *  MapiCalendarExceptionInfoDto builder.
 */
public class MapiCalendarExceptionInfoDtoBuilder {
    private final MapiCalendarExceptionInfoDto model;
    public MapiCalendarExceptionInfoDtoBuilder(MapiCalendarExceptionInfoDto model) {
        this.model = model;
    }

    public MapiCalendarExceptionInfoDto build() {
        return model;
    }
    public MapiCalendarExceptionInfoDtoBuilder attachments(List<MapiAttachmentDto> attachments) {
        this.model.attachments(attachments);
        return this;
    }
    public MapiCalendarExceptionInfoDtoBuilder body(String body) {
        this.model.body(body);
        return this;
    }
    public MapiCalendarExceptionInfoDtoBuilder busyStatus(String busyStatus) {
        this.model.busyStatus(busyStatus);
        return this;
    }
    public MapiCalendarExceptionInfoDtoBuilder endDateTime(Date endDateTime) {
        this.model.endDateTime(endDateTime);
        return this;
    }
    public MapiCalendarExceptionInfoDtoBuilder hasAttachment(Boolean hasAttachment) {
        this.model.hasAttachment(hasAttachment);
        return this;
    }
    public MapiCalendarExceptionInfoDtoBuilder location(String location) {
        this.model.location(location);
        return this;
    }
    public MapiCalendarExceptionInfoDtoBuilder meetingType(String meetingType) {
        this.model.meetingType(meetingType);
        return this;
    }
    public MapiCalendarExceptionInfoDtoBuilder originalStartDate(Date originalStartDate) {
        this.model.originalStartDate(originalStartDate);
        return this;
    }
    public MapiCalendarExceptionInfoDtoBuilder overrideFlags(List<String> overrideFlags) {
        this.model.overrideFlags(overrideFlags);
        return this;
    }
    public MapiCalendarExceptionInfoDtoBuilder reminderDelta(Integer reminderDelta) {
        this.model.reminderDelta(reminderDelta);
        return this;
    }
    public MapiCalendarExceptionInfoDtoBuilder reminderSet(Boolean reminderSet) {
        this.model.reminderSet(reminderSet);
        return this;
    }
    public MapiCalendarExceptionInfoDtoBuilder startDateTime(Date startDateTime) {
        this.model.startDateTime(startDateTime);
        return this;
    }
    public MapiCalendarExceptionInfoDtoBuilder subject(String subject) {
        this.model.subject(subject);
        return this;
    }
    public MapiCalendarExceptionInfoDtoBuilder subType(Integer subType) {
        this.model.subType(subType);
        return this;
    }
}
