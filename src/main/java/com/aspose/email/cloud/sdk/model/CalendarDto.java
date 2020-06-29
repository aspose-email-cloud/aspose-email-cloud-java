/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CalendarDto.java">
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
 * iCalendar document representation.             
 */
public class CalendarDto {
  @JsonProperty("attachments")
  private List<Attachment> attachments = null;

  @JsonProperty("attendees")
  private List<MailAddress> attendees = new ArrayList<MailAddress>();

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("endDate")
  private Date endDate = null;

  @JsonProperty("endTimeZone")
  private String endTimeZone = null;

  @JsonProperty("flags")
  private List<String> flags = null;

  @JsonProperty("isDescriptionHtml")
  private Boolean isDescriptionHtml = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("method")
  private String method = null;

  @JsonProperty("microsoftBusyStatus")
  private String microsoftBusyStatus = null;

  @JsonProperty("microsoftIntendedStatus")
  private String microsoftIntendedStatus = null;

  @JsonProperty("optionalAttendees")
  private List<MailAddress> optionalAttendees = null;

  @JsonProperty("organizer")
  private MailAddress organizer = null;

  @JsonProperty("recurrenceString")
  private String recurrenceString = null;

  @JsonProperty("recurrence")
  private RecurrencePatternDto recurrence = null;

  @JsonProperty("reminders")
  private List<CalendarReminder> reminders = null;

  @JsonProperty("sequenceId")
  private String sequenceId = null;

  @JsonProperty("startDate")
  private Date startDate = null;

  @JsonProperty("startTimeZone")
  private String startTimeZone = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("summary")
  private String summary = null;

  @JsonProperty("transparency")
  private String transparency = null;

  /**
   * Set attachments and return this.
   * @param attachments Document attachments.
   * @return this
  **/
  public CalendarDto attachments(List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }
  /**
   * Add an item to attachments and return this.
   * @param attachmentsItem An item of: Document attachments.
   * @return this
  **/
  public CalendarDto addAttachmentsItem(Attachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<Attachment>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

  /**
   * Document attachments.
   * @return attachments
  **/
  public List<Attachment> getAttachments() {
    return attachments;
  }  

  /**
   * Set attachments.
   * @param attachments Document attachments.
  **/
  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }

  /**
   * Set attendees and return this.
   * @param attendees Event attendees.
   * @return this
  **/
  public CalendarDto attendees(List<MailAddress> attendees) {
    this.attendees = attendees;
    return this;
  }
  /**
   * Add an item to attendees and return this.
   * @param attendeesItem An item of: Event attendees.
   * @return this
  **/
  public CalendarDto addAttendeesItem(MailAddress attendeesItem) {
    this.attendees.add(attendeesItem);
    return this;
  }

  /**
   * Event attendees.
   * @return attendees
  **/
  public List<MailAddress> getAttendees() {
    return attendees;
  }  

  /**
   * Set attendees.
   * @param attendees Event attendees.
  **/
  public void setAttendees(List<MailAddress> attendees) {
    this.attendees = attendees;
  }

  /**
   * Set description and return this.
   * @param description Description.
   * @return this
  **/
  public CalendarDto description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description.
   * @return description
  **/
  public String getDescription() {
    return description;
  }  

  /**
   * Set description.
   * @param description Description.
  **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Set endDate and return this.
   * @param endDate End date.
   * @return this
  **/
  public CalendarDto endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * End date.
   * @return endDate
  **/
  public Date getEndDate() {
    return endDate;
  }  

  /**
   * Set endDate.
   * @param endDate End date.
  **/
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  /**
   * Set endTimeZone and return this.
   * @param endTimeZone End time zone.
   * @return this
  **/
  public CalendarDto endTimeZone(String endTimeZone) {
    this.endTimeZone = endTimeZone;
    return this;
  }

  /**
   * End time zone.
   * @return endTimeZone
  **/
  public String getEndTimeZone() {
    return endTimeZone;
  }  

  /**
   * Set endTimeZone.
   * @param endTimeZone End time zone.
  **/
  public void setEndTimeZone(String endTimeZone) {
    this.endTimeZone = endTimeZone;
  }

  /**
   * Set flags and return this.
   * @param flags Appointment flags. Items: Enumerates iCalendar flags. Enum, available values: None, AllDayEvent
   * @return this
  **/
  public CalendarDto flags(List<String> flags) {
    this.flags = flags;
    return this;
  }
  /**
   * Add an item to flags and return this.
   * @param flagsItem An item of: Appointment flags.
   * @return this
  **/
  public CalendarDto addFlagsItem(String flagsItem) {
    if (this.flags == null) {
      this.flags = new ArrayList<String>();
    }
    this.flags.add(flagsItem);
    return this;
  }

  /**
   * Appointment flags. Items: Enumerates iCalendar flags. Enum, available values: None, AllDayEvent
   * @return flags
  **/
  public List<String> getFlags() {
    return flags;
  }  

  /**
   * Set flags.
   * @param flags Appointment flags. Items: Enumerates iCalendar flags. Enum, available values: None, AllDayEvent
  **/
  public void setFlags(List<String> flags) {
    this.flags = flags;
  }

  /**
   * Set isDescriptionHtml and return this.
   * @param isDescriptionHtml Indicates if description is in HTML format.
   * @return this
  **/
  public CalendarDto isDescriptionHtml(Boolean isDescriptionHtml) {
    this.isDescriptionHtml = isDescriptionHtml;
    return this;
  }

  /**
   * Indicates if description is in HTML format.
   * @return isDescriptionHtml
  **/
  public Boolean isIsDescriptionHtml() {
    return isDescriptionHtml;
  }  

  /**
   * Set isDescriptionHtml.
   * @param isDescriptionHtml Indicates if description is in HTML format.
  **/
  public void setIsDescriptionHtml(Boolean isDescriptionHtml) {
    this.isDescriptionHtml = isDescriptionHtml;
  }

  /**
   * Set location and return this.
   * @param location Location.
   * @return this
  **/
  public CalendarDto location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Location.
   * @return location
  **/
  public String getLocation() {
    return location;
  }  

  /**
   * Set location.
   * @param location Location.
  **/
  public void setLocation(String location) {
    this.location = location;
  }

  /**
   * Set method and return this.
   * @param method Defines the iCalendar object method type associated with the calendar document. Enum, available values: None, Publish, Request, Reply, Add, Cancel, Refresh, Counter, DeclineCounter
   * @return this
  **/
  public CalendarDto method(String method) {
    this.method = method;
    return this;
  }

  /**
   * Defines the iCalendar object method type associated with the calendar document. Enum, available values: None, Publish, Request, Reply, Add, Cancel, Refresh, Counter, DeclineCounter
   * @return method
  **/
  public String getMethod() {
    return method;
  }  

  /**
   * Set method.
   * @param method Defines the iCalendar object method type associated with the calendar document. Enum, available values: None, Publish, Request, Reply, Add, Cancel, Refresh, Counter, DeclineCounter
  **/
  public void setMethod(String method) {
    this.method = method;
  }

  /**
   * Set microsoftBusyStatus and return this.
   * @param microsoftBusyStatus Specifies the BUSY status. Enum, available values: NotDefined, Free, Tentative, Busy, Oof
   * @return this
  **/
  public CalendarDto microsoftBusyStatus(String microsoftBusyStatus) {
    this.microsoftBusyStatus = microsoftBusyStatus;
    return this;
  }

  /**
   * Specifies the BUSY status. Enum, available values: NotDefined, Free, Tentative, Busy, Oof
   * @return microsoftBusyStatus
  **/
  public String getMicrosoftBusyStatus() {
    return microsoftBusyStatus;
  }  

  /**
   * Set microsoftBusyStatus.
   * @param microsoftBusyStatus Specifies the BUSY status. Enum, available values: NotDefined, Free, Tentative, Busy, Oof
  **/
  public void setMicrosoftBusyStatus(String microsoftBusyStatus) {
    this.microsoftBusyStatus = microsoftBusyStatus;
  }

  /**
   * Set microsoftIntendedStatus and return this.
   * @param microsoftIntendedStatus Specifies the INTENDED status. Enum, available values: NotDefined, Free, Tentative, Busy, Oof
   * @return this
  **/
  public CalendarDto microsoftIntendedStatus(String microsoftIntendedStatus) {
    this.microsoftIntendedStatus = microsoftIntendedStatus;
    return this;
  }

  /**
   * Specifies the INTENDED status. Enum, available values: NotDefined, Free, Tentative, Busy, Oof
   * @return microsoftIntendedStatus
  **/
  public String getMicrosoftIntendedStatus() {
    return microsoftIntendedStatus;
  }  

  /**
   * Set microsoftIntendedStatus.
   * @param microsoftIntendedStatus Specifies the INTENDED status. Enum, available values: NotDefined, Free, Tentative, Busy, Oof
  **/
  public void setMicrosoftIntendedStatus(String microsoftIntendedStatus) {
    this.microsoftIntendedStatus = microsoftIntendedStatus;
  }

  /**
   * Set optionalAttendees and return this.
   * @param optionalAttendees Optional attendees.             
   * @return this
  **/
  public CalendarDto optionalAttendees(List<MailAddress> optionalAttendees) {
    this.optionalAttendees = optionalAttendees;
    return this;
  }
  /**
   * Add an item to optionalAttendees and return this.
   * @param optionalAttendeesItem An item of: Optional attendees.             
   * @return this
  **/
  public CalendarDto addOptionalAttendeesItem(MailAddress optionalAttendeesItem) {
    if (this.optionalAttendees == null) {
      this.optionalAttendees = new ArrayList<MailAddress>();
    }
    this.optionalAttendees.add(optionalAttendeesItem);
    return this;
  }

  /**
   * Optional attendees.             
   * @return optionalAttendees
  **/
  public List<MailAddress> getOptionalAttendees() {
    return optionalAttendees;
  }  

  /**
   * Set optionalAttendees.
   * @param optionalAttendees Optional attendees.             
  **/
  public void setOptionalAttendees(List<MailAddress> optionalAttendees) {
    this.optionalAttendees = optionalAttendees;
  }

  /**
   * Set organizer and return this.
   * @param organizer Event organizer.             
   * @return this
  **/
  public CalendarDto organizer(MailAddress organizer) {
    this.organizer = organizer;
    return this;
  }

  /**
   * Event organizer.             
   * @return organizer
  **/
  public MailAddress getOrganizer() {
    return organizer;
  }  

  /**
   * Set organizer.
   * @param organizer Event organizer.             
  **/
  public void setOrganizer(MailAddress organizer) {
    this.organizer = organizer;
  }

  /**
   * Set recurrenceString and return this.
   * @param recurrenceString Deprecated, use &#39;Recurrence&#39; property. String representation of recurrence pattern (See iCalendar RFC, \&quot;Recurrence rule\&quot; section). For example:               For daily recurrence:         \&quot;FREQ&#x3D;DAILY;COUNT&#x3D;10;WKST&#x3D;MO\&quot;                   For monthly recurrence:         \&quot;BYSETPOS&#x3D;1;BYDAY&#x3D;MO,TU,WE,TH,FR;FREQ&#x3D;MONTHLY;INTERVAL&#x3D;10;WKST&#x3D;MO\&quot;                   For yearly recurrence:         \&quot;BYMONTHDAY&#x3D;30;BYMONTH&#x3D;1;FREQ&#x3D;YEARLY;WKST&#x3D;MO\&quot;                   
   * @return this
  **/
  public CalendarDto recurrenceString(String recurrenceString) {
    this.recurrenceString = recurrenceString;
    return this;
  }

  /**
   * Deprecated, use &#39;Recurrence&#39; property. String representation of recurrence pattern (See iCalendar RFC, \&quot;Recurrence rule\&quot; section). For example:               For daily recurrence:         \&quot;FREQ&#x3D;DAILY;COUNT&#x3D;10;WKST&#x3D;MO\&quot;                   For monthly recurrence:         \&quot;BYSETPOS&#x3D;1;BYDAY&#x3D;MO,TU,WE,TH,FR;FREQ&#x3D;MONTHLY;INTERVAL&#x3D;10;WKST&#x3D;MO\&quot;                   For yearly recurrence:         \&quot;BYMONTHDAY&#x3D;30;BYMONTH&#x3D;1;FREQ&#x3D;YEARLY;WKST&#x3D;MO\&quot;                   
   * @return recurrenceString
  **/
  public String getRecurrenceString() {
    return recurrenceString;
  }  

  /**
   * Set recurrenceString.
   * @param recurrenceString Deprecated, use &#39;Recurrence&#39; property. String representation of recurrence pattern (See iCalendar RFC, \&quot;Recurrence rule\&quot; section). For example:               For daily recurrence:         \&quot;FREQ&#x3D;DAILY;COUNT&#x3D;10;WKST&#x3D;MO\&quot;                   For monthly recurrence:         \&quot;BYSETPOS&#x3D;1;BYDAY&#x3D;MO,TU,WE,TH,FR;FREQ&#x3D;MONTHLY;INTERVAL&#x3D;10;WKST&#x3D;MO\&quot;                   For yearly recurrence:         \&quot;BYMONTHDAY&#x3D;30;BYMONTH&#x3D;1;FREQ&#x3D;YEARLY;WKST&#x3D;MO\&quot;                   
  **/
  public void setRecurrenceString(String recurrenceString) {
    this.recurrenceString = recurrenceString;
  }

  /**
   * Set recurrence and return this.
   * @param recurrence Recurrence pattern             
   * @return this
  **/
  public CalendarDto recurrence(RecurrencePatternDto recurrence) {
    this.recurrence = recurrence;
    return this;
  }

  /**
   * Recurrence pattern             
   * @return recurrence
  **/
  public RecurrencePatternDto getRecurrence() {
    return recurrence;
  }  

  /**
   * Set recurrence.
   * @param recurrence Recurrence pattern             
  **/
  public void setRecurrence(RecurrencePatternDto recurrence) {
    this.recurrence = recurrence;
  }

  /**
   * Set reminders and return this.
   * @param reminders Reminders.
   * @return this
  **/
  public CalendarDto reminders(List<CalendarReminder> reminders) {
    this.reminders = reminders;
    return this;
  }
  /**
   * Add an item to reminders and return this.
   * @param remindersItem An item of: Reminders.
   * @return this
  **/
  public CalendarDto addRemindersItem(CalendarReminder remindersItem) {
    if (this.reminders == null) {
      this.reminders = new ArrayList<CalendarReminder>();
    }
    this.reminders.add(remindersItem);
    return this;
  }

  /**
   * Reminders.
   * @return reminders
  **/
  public List<CalendarReminder> getReminders() {
    return reminders;
  }  

  /**
   * Set reminders.
   * @param reminders Reminders.
  **/
  public void setReminders(List<CalendarReminder> reminders) {
    this.reminders = reminders;
  }

  /**
   * Set sequenceId and return this.
   * @param sequenceId The sequence id. Read only.
   * @return this
  **/
  public CalendarDto sequenceId(String sequenceId) {
    this.sequenceId = sequenceId;
    return this;
  }

  /**
   * The sequence id. Read only.
   * @return sequenceId
  **/
  public String getSequenceId() {
    return sequenceId;
  }  

  /**
   * Set sequenceId.
   * @param sequenceId The sequence id. Read only.
  **/
  public void setSequenceId(String sequenceId) {
    this.sequenceId = sequenceId;
  }

  /**
   * Set startDate and return this.
   * @param startDate Start date.
   * @return this
  **/
  public CalendarDto startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Start date.
   * @return startDate
  **/
  public Date getStartDate() {
    return startDate;
  }  

  /**
   * Set startDate.
   * @param startDate Start date.
  **/
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  /**
   * Set startTimeZone and return this.
   * @param startTimeZone Start time zone.
   * @return this
  **/
  public CalendarDto startTimeZone(String startTimeZone) {
    this.startTimeZone = startTimeZone;
    return this;
  }

  /**
   * Start time zone.
   * @return startTimeZone
  **/
  public String getStartTimeZone() {
    return startTimeZone;
  }  

  /**
   * Set startTimeZone.
   * @param startTimeZone Start time zone.
  **/
  public void setStartTimeZone(String startTimeZone) {
    this.startTimeZone = startTimeZone;
  }

  /**
   * Set status and return this.
   * @param status Defines the overall status or confirmation for the calendar document. Enum, available values: NotDefined, Cancelled, Tentative, Confirmed
   * @return this
  **/
  public CalendarDto status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Defines the overall status or confirmation for the calendar document. Enum, available values: NotDefined, Cancelled, Tentative, Confirmed
   * @return status
  **/
  public String getStatus() {
    return status;
  }  

  /**
   * Set status.
   * @param status Defines the overall status or confirmation for the calendar document. Enum, available values: NotDefined, Cancelled, Tentative, Confirmed
  **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Set summary and return this.
   * @param summary Summary.
   * @return this
  **/
  public CalendarDto summary(String summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Summary.
   * @return summary
  **/
  public String getSummary() {
    return summary;
  }  

  /**
   * Set summary.
   * @param summary Summary.
  **/
  public void setSummary(String summary) {
    this.summary = summary;
  }

  /**
   * Set transparency and return this.
   * @param transparency Specifies whether or not this appointment is intended to be visible in availability searches. Enum, available values: NotDefined, Transparent, Opaque
   * @return this
  **/
  public CalendarDto transparency(String transparency) {
    this.transparency = transparency;
    return this;
  }

  /**
   * Specifies whether or not this appointment is intended to be visible in availability searches. Enum, available values: NotDefined, Transparent, Opaque
   * @return transparency
  **/
  public String getTransparency() {
    return transparency;
  }  

  /**
   * Set transparency.
   * @param transparency Specifies whether or not this appointment is intended to be visible in availability searches. Enum, available values: NotDefined, Transparent, Opaque
  **/
  public void setTransparency(String transparency) {
    this.transparency = transparency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    CalendarDto calendarDto = (CalendarDto) o;
    return ObjectUtils.equals(this.attachments, calendarDto.attachments) &&
    ObjectUtils.equals(this.attendees, calendarDto.attendees) &&
    ObjectUtils.equals(this.description, calendarDto.description) &&
    ObjectUtils.equals(this.endDate, calendarDto.endDate) &&
    ObjectUtils.equals(this.endTimeZone, calendarDto.endTimeZone) &&
    ObjectUtils.equals(this.flags, calendarDto.flags) &&
    ObjectUtils.equals(this.isDescriptionHtml, calendarDto.isDescriptionHtml) &&
    ObjectUtils.equals(this.location, calendarDto.location) &&
    ObjectUtils.equals(this.method, calendarDto.method) &&
    ObjectUtils.equals(this.microsoftBusyStatus, calendarDto.microsoftBusyStatus) &&
    ObjectUtils.equals(this.microsoftIntendedStatus, calendarDto.microsoftIntendedStatus) &&
    ObjectUtils.equals(this.optionalAttendees, calendarDto.optionalAttendees) &&
    ObjectUtils.equals(this.organizer, calendarDto.organizer) &&
    ObjectUtils.equals(this.recurrenceString, calendarDto.recurrenceString) &&
    ObjectUtils.equals(this.recurrence, calendarDto.recurrence) &&
    ObjectUtils.equals(this.reminders, calendarDto.reminders) &&
    ObjectUtils.equals(this.sequenceId, calendarDto.sequenceId) &&
    ObjectUtils.equals(this.startDate, calendarDto.startDate) &&
    ObjectUtils.equals(this.startTimeZone, calendarDto.startTimeZone) &&
    ObjectUtils.equals(this.status, calendarDto.status) &&
    ObjectUtils.equals(this.summary, calendarDto.summary) &&
    ObjectUtils.equals(this.transparency, calendarDto.transparency);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(attachments, attendees, description, endDate, endTimeZone, flags, isDescriptionHtml, location, method, microsoftBusyStatus, microsoftIntendedStatus, optionalAttendees, organizer, recurrenceString, recurrence, reminders, sequenceId, startDate, startTimeZone, status, summary, transparency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarDto {\n");
    
    sb.append("    attachments: ").append(toIndentedString(getAttachments())).append("\n");
    sb.append("    attendees: ").append(toIndentedString(getAttendees())).append("\n");
    sb.append("    description: ").append(toIndentedString(getDescription())).append("\n");
    sb.append("    endDate: ").append(toIndentedString(getEndDate())).append("\n");
    sb.append("    endTimeZone: ").append(toIndentedString(getEndTimeZone())).append("\n");
    sb.append("    flags: ").append(toIndentedString(getFlags())).append("\n");
    sb.append("    isDescriptionHtml: ").append(toIndentedString(isIsDescriptionHtml())).append("\n");
    sb.append("    location: ").append(toIndentedString(getLocation())).append("\n");
    sb.append("    method: ").append(toIndentedString(getMethod())).append("\n");
    sb.append("    microsoftBusyStatus: ").append(toIndentedString(getMicrosoftBusyStatus())).append("\n");
    sb.append("    microsoftIntendedStatus: ").append(toIndentedString(getMicrosoftIntendedStatus())).append("\n");
    sb.append("    optionalAttendees: ").append(toIndentedString(getOptionalAttendees())).append("\n");
    sb.append("    organizer: ").append(toIndentedString(getOrganizer())).append("\n");
    sb.append("    recurrenceString: ").append(toIndentedString(getRecurrenceString())).append("\n");
    sb.append("    recurrence: ").append(toIndentedString(getRecurrence())).append("\n");
    sb.append("    reminders: ").append(toIndentedString(getReminders())).append("\n");
    sb.append("    sequenceId: ").append(toIndentedString(getSequenceId())).append("\n");
    sb.append("    startDate: ").append(toIndentedString(getStartDate())).append("\n");
    sb.append("    startTimeZone: ").append(toIndentedString(getStartTimeZone())).append("\n");
    sb.append("    status: ").append(toIndentedString(getStatus())).append("\n");
    sb.append("    summary: ").append(toIndentedString(getSummary())).append("\n");
    sb.append("    transparency: ").append(toIndentedString(getTransparency())).append("\n");
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

  public CalendarDto() {
    super();
  }

  /**
   * Initializes a new instance of the CalendarDto
   * @param attachments Document attachments.
   * @param attendees Event attendees.
   * @param description Description.
   * @param endDate End date.
   * @param endTimeZone End time zone.
   * @param flags Appointment flags. Items: Enumerates iCalendar flags. Enum, available values: None, AllDayEvent
   * @param isDescriptionHtml Indicates if description is in HTML format.
   * @param location Location.
   * @param method Defines the iCalendar object method type associated with the calendar document. Enum, available values: None, Publish, Request, Reply, Add, Cancel, Refresh, Counter, DeclineCounter
   * @param microsoftBusyStatus Specifies the BUSY status. Enum, available values: NotDefined, Free, Tentative, Busy, Oof
   * @param microsoftIntendedStatus Specifies the INTENDED status. Enum, available values: NotDefined, Free, Tentative, Busy, Oof
   * @param optionalAttendees Optional attendees.             
   * @param organizer Event organizer.             
   * @param recurrenceString Deprecated, use &#39;Recurrence&#39; property. String representation of recurrence pattern (See iCalendar RFC, \&quot;Recurrence rule\&quot; section). For example:               For daily recurrence:         \&quot;FREQ&#x3D;DAILY;COUNT&#x3D;10;WKST&#x3D;MO\&quot;                   For monthly recurrence:         \&quot;BYSETPOS&#x3D;1;BYDAY&#x3D;MO,TU,WE,TH,FR;FREQ&#x3D;MONTHLY;INTERVAL&#x3D;10;WKST&#x3D;MO\&quot;                   For yearly recurrence:         \&quot;BYMONTHDAY&#x3D;30;BYMONTH&#x3D;1;FREQ&#x3D;YEARLY;WKST&#x3D;MO\&quot;                   
   * @param recurrence Recurrence pattern             
   * @param reminders Reminders.
   * @param sequenceId The sequence id. Read only.
   * @param startDate Start date.
   * @param startTimeZone Start time zone.
   * @param status Defines the overall status or confirmation for the calendar document. Enum, available values: NotDefined, Cancelled, Tentative, Confirmed
   * @param summary Summary.
   * @param transparency Specifies whether or not this appointment is intended to be visible in availability searches. Enum, available values: NotDefined, Transparent, Opaque
   */
  public CalendarDto(List<Attachment> attachments, List<MailAddress> attendees, String description, Date endDate, String endTimeZone, List<String> flags, Boolean isDescriptionHtml, String location, String method, String microsoftBusyStatus, String microsoftIntendedStatus, List<MailAddress> optionalAttendees, MailAddress organizer, String recurrenceString, RecurrencePatternDto recurrence, List<CalendarReminder> reminders, String sequenceId, Date startDate, String startTimeZone, String status, String summary, String transparency) {
    super();
    setAttachments(attachments);
    setAttendees(attendees);
    setDescription(description);
    setEndDate(endDate);
    setEndTimeZone(endTimeZone);
    setFlags(flags);
    setIsDescriptionHtml(isDescriptionHtml);
    setLocation(location);
    setMethod(method);
    setMicrosoftBusyStatus(microsoftBusyStatus);
    setMicrosoftIntendedStatus(microsoftIntendedStatus);
    setOptionalAttendees(optionalAttendees);
    setOrganizer(organizer);
    setRecurrenceString(recurrenceString);
    setRecurrence(recurrence);
    setReminders(reminders);
    setSequenceId(sequenceId);
    setStartDate(startDate);
    setStartTimeZone(startTimeZone);
    setStatus(status);
    setSummary(summary);
    setTransparency(transparency);
  }

}

