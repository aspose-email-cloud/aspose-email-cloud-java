/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CalendarReminderBuilder.java">
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
 *  CalendarReminder builder.
 */
public class CalendarReminderBuilder {
    private final CalendarReminder model;
    public CalendarReminderBuilder(CalendarReminder model) {
        this.model = model;
    }

    public CalendarReminder build() {
        return model;
    }
    public CalendarReminderBuilder action(String action) {
        this.model.action(action);
        return this;
    }
    public CalendarReminderBuilder attachments(List<String> attachments) {
        this.model.attachments(attachments);
        return this;
    }
    public CalendarReminderBuilder attendees(List<ReminderAttendee> attendees) {
        this.model.attendees(attendees);
        return this;
    }
    public CalendarReminderBuilder description(String description) {
        this.model.description(description);
        return this;
    }
    public CalendarReminderBuilder duration(Long duration) {
        this.model.duration(duration);
        return this;
    }
    public CalendarReminderBuilder repeat(Integer repeat) {
        this.model.repeat(repeat);
        return this;
    }
    public CalendarReminderBuilder summary(String summary) {
        this.model.summary(summary);
        return this;
    }
    public CalendarReminderBuilder trigger(ReminderTrigger trigger) {
        this.model.trigger(trigger);
        return this;
    }
}
