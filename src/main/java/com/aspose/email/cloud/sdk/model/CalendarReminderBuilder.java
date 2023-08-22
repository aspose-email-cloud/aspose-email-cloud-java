/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CalendarReminderBuilder.java">
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
 *  CalendarReminder builder.
 */
public class CalendarReminderBuilder {
    private CalendarReminder model;
    public CalendarReminderBuilder(CalendarReminder model) {
        this.model = model;
    }

    /**
     * Build CalendarReminder instance.
     */
    public CalendarReminder build() {
        CalendarReminder tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set CalendarReminder.action and return builder.
     * @param action Defines the action to be invoked when an alarm is triggered. Enum, available values: Audio, Display, Email, Procedure, None
     * @return builder
    **/
    public CalendarReminderBuilder action(String action) {
        this.model.action(action);
        return this;
    }
    /**
     * Set CalendarReminder.attachments and return builder.
     * @param attachments Collection of Reminder Attachments. Could be an absolute URI or Base64 string representation of attachment content             
     * @return builder
    **/
    public CalendarReminderBuilder attachments(List<String> attachments) {
        this.model.attachments(attachments);
        return this;
    }
    /**
     * Set CalendarReminder.attendees and return builder.
     * @param attendees Contains collection of ReminderAttendee objects.             
     * @return builder
    **/
    public CalendarReminderBuilder attendees(List<ReminderAttendee> attendees) {
        this.model.attendees(attendees);
        return this;
    }
    /**
     * Set CalendarReminder.description and return builder.
     * @param description Provides a more complete description of the alarm.
     * @return builder
    **/
    public CalendarReminderBuilder description(String description) {
        this.model.description(description);
        return this;
    }
    /**
     * Set CalendarReminder.duration and return builder.
     * @param duration Specifies the delay period in ticks, after which the alarm will repeat.             
     * @return builder
    **/
    public CalendarReminderBuilder duration(Long duration) {
        this.model.duration(duration);
        return this;
    }
    /**
     * Set CalendarReminder.repeat and return builder.
     * @param repeat Defines the number of time the alarm should be repeated, after the initial trigger.             
     * @return builder
    **/
    public CalendarReminderBuilder repeat(Integer repeat) {
        this.model.repeat(repeat);
        return this;
    }
    /**
     * Set CalendarReminder.summary and return builder.
     * @param summary Defines a short summary or subject for the alarm.
     * @return builder
    **/
    public CalendarReminderBuilder summary(String summary) {
        this.model.summary(summary);
        return this;
    }
    /**
     * Set CalendarReminder.trigger and return builder.
     * @param trigger Specifies when an alarm will trigger.
     * @return builder
    **/
    public CalendarReminderBuilder trigger(ReminderTrigger trigger) {
        this.model.trigger(trigger);
        return this;
    }
}
