/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CalendarReminder.java">
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
 * Provides a grouping of component properties that define an alarm.             
 */
public class CalendarReminder {
  @JsonProperty("action")
  private String action = null;

  @JsonProperty("attachments")
  private List<String> attachments = null;

  @JsonProperty("attendees")
  private List<ReminderAttendee> attendees = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("duration")
  private Long duration = null;

  @JsonProperty("repeat")
  private Integer repeat = null;

  @JsonProperty("summary")
  private String summary = null;

  @JsonProperty("trigger")
  private ReminderTrigger trigger = null;

  /**
   * Set action and return this.
   * @param action Defines the action to be invoked when an alarm is triggered. Enum, available values: Audio, Display, Email, Procedure, None
   * @return this
  **/
  public CalendarReminder action(String action) {
    this.action = action;
    return this;
  }

  /**
   * Defines the action to be invoked when an alarm is triggered. Enum, available values: Audio, Display, Email, Procedure, None
   * @return action
  **/
  public String getAction() {
    return action;
  }  

  /**
   * Set action.
   * @param action Defines the action to be invoked when an alarm is triggered. Enum, available values: Audio, Display, Email, Procedure, None
  **/
  public void setAction(String action) {
    this.action = action;
  }

  /**
   * Set attachments and return this.
   * @param attachments Collection of Reminder Attachments. Could be an absolute URI or Base64 string representation of attachment content             
   * @return this
  **/
  public CalendarReminder attachments(List<String> attachments) {
    this.attachments = attachments;
    return this;
  }
  /**
   * Add an item to attachments and return this.
   * @param attachmentsItem An item of: Collection of Reminder Attachments. Could be an absolute URI or Base64 string representation of attachment content             
   * @return this
  **/
  public CalendarReminder addAttachmentsItem(String attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<String>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

  /**
   * Collection of Reminder Attachments. Could be an absolute URI or Base64 string representation of attachment content             
   * @return attachments
  **/
  public List<String> getAttachments() {
    return attachments;
  }  

  /**
   * Set attachments.
   * @param attachments Collection of Reminder Attachments. Could be an absolute URI or Base64 string representation of attachment content             
  **/
  public void setAttachments(List<String> attachments) {
    this.attachments = attachments;
  }

  /**
   * Set attendees and return this.
   * @param attendees Contains collection of ReminderAttendee objects.             
   * @return this
  **/
  public CalendarReminder attendees(List<ReminderAttendee> attendees) {
    this.attendees = attendees;
    return this;
  }
  /**
   * Add an item to attendees and return this.
   * @param attendeesItem An item of: Contains collection of ReminderAttendee objects.             
   * @return this
  **/
  public CalendarReminder addAttendeesItem(ReminderAttendee attendeesItem) {
    if (this.attendees == null) {
      this.attendees = new ArrayList<ReminderAttendee>();
    }
    this.attendees.add(attendeesItem);
    return this;
  }

  /**
   * Contains collection of ReminderAttendee objects.             
   * @return attendees
  **/
  public List<ReminderAttendee> getAttendees() {
    return attendees;
  }  

  /**
   * Set attendees.
   * @param attendees Contains collection of ReminderAttendee objects.             
  **/
  public void setAttendees(List<ReminderAttendee> attendees) {
    this.attendees = attendees;
  }

  /**
   * Set description and return this.
   * @param description Provides a more complete description of the alarm.
   * @return this
  **/
  public CalendarReminder description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Provides a more complete description of the alarm.
   * @return description
  **/
  public String getDescription() {
    return description;
  }  

  /**
   * Set description.
   * @param description Provides a more complete description of the alarm.
  **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Set duration and return this.
   * @param duration Specifies the delay period in ticks, after which the alarm will repeat.             
   * @return this
  **/
  public CalendarReminder duration(Long duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Specifies the delay period in ticks, after which the alarm will repeat.             
   * @return duration
  **/
  public Long getDuration() {
    return duration;
  }  

  /**
   * Set duration.
   * @param duration Specifies the delay period in ticks, after which the alarm will repeat.             
  **/
  public void setDuration(Long duration) {
    this.duration = duration;
  }

  /**
   * Set repeat and return this.
   * @param repeat Defines the number of time the alarm should be repeated, after the initial trigger.             
   * @return this
  **/
  public CalendarReminder repeat(Integer repeat) {
    this.repeat = repeat;
    return this;
  }

  /**
   * Defines the number of time the alarm should be repeated, after the initial trigger.             
   * @return repeat
  **/
  public Integer getRepeat() {
    return repeat;
  }  

  /**
   * Set repeat.
   * @param repeat Defines the number of time the alarm should be repeated, after the initial trigger.             
  **/
  public void setRepeat(Integer repeat) {
    this.repeat = repeat;
  }

  /**
   * Set summary and return this.
   * @param summary Defines a short summary or subject for the alarm.
   * @return this
  **/
  public CalendarReminder summary(String summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Defines a short summary or subject for the alarm.
   * @return summary
  **/
  public String getSummary() {
    return summary;
  }  

  /**
   * Set summary.
   * @param summary Defines a short summary or subject for the alarm.
  **/
  public void setSummary(String summary) {
    this.summary = summary;
  }

  /**
   * Set trigger and return this.
   * @param trigger Specifies when an alarm will trigger.
   * @return this
  **/
  public CalendarReminder trigger(ReminderTrigger trigger) {
    this.trigger = trigger;
    return this;
  }

  /**
   * Specifies when an alarm will trigger.
   * @return trigger
  **/
  public ReminderTrigger getTrigger() {
    return trigger;
  }  

  /**
   * Set trigger.
   * @param trigger Specifies when an alarm will trigger.
  **/
  public void setTrigger(ReminderTrigger trigger) {
    this.trigger = trigger;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    CalendarReminder calendarReminder = (CalendarReminder) o;
    return ObjectUtils.equals(this.action, calendarReminder.action) &&
    ObjectUtils.equals(this.attachments, calendarReminder.attachments) &&
    ObjectUtils.equals(this.attendees, calendarReminder.attendees) &&
    ObjectUtils.equals(this.description, calendarReminder.description) &&
    ObjectUtils.equals(this.duration, calendarReminder.duration) &&
    ObjectUtils.equals(this.repeat, calendarReminder.repeat) &&
    ObjectUtils.equals(this.summary, calendarReminder.summary) &&
    ObjectUtils.equals(this.trigger, calendarReminder.trigger);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(action, attachments, attendees, description, duration, repeat, summary, trigger);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarReminder {\n");
    
    sb.append("    action: ").append(toIndentedString(getAction())).append("\n");
    sb.append("    attachments: ").append(toIndentedString(getAttachments())).append("\n");
    sb.append("    attendees: ").append(toIndentedString(getAttendees())).append("\n");
    sb.append("    description: ").append(toIndentedString(getDescription())).append("\n");
    sb.append("    duration: ").append(toIndentedString(getDuration())).append("\n");
    sb.append("    repeat: ").append(toIndentedString(getRepeat())).append("\n");
    sb.append("    summary: ").append(toIndentedString(getSummary())).append("\n");
    sb.append("    trigger: ").append(toIndentedString(getTrigger())).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public CalendarReminder() {
    super();
  }

  /**
   * Initializes a new instance of the CalendarReminder
   * @param action Defines the action to be invoked when an alarm is triggered. Enum, available values: Audio, Display, Email, Procedure, None
   * @param attachments Collection of Reminder Attachments. Could be an absolute URI or Base64 string representation of attachment content             
   * @param attendees Contains collection of ReminderAttendee objects.             
   * @param description Provides a more complete description of the alarm.
   * @param duration Specifies the delay period in ticks, after which the alarm will repeat.             
   * @param repeat Defines the number of time the alarm should be repeated, after the initial trigger.             
   * @param summary Defines a short summary or subject for the alarm.
   * @param trigger Specifies when an alarm will trigger.
   */
  public CalendarReminder(
    String action,
    List<String> attachments,
    List<ReminderAttendee> attendees,
    String description,
    Long duration,
    Integer repeat,
    String summary,
    ReminderTrigger trigger
  ) {
    super();
    setAction(action);
    setAttachments(attachments);
    setAttendees(attendees);
    setDescription(description);
    setDuration(duration);
    setRepeat(repeat);
    setSummary(summary);
    setTrigger(trigger);
  }

}

