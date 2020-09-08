/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiCalendarExceptionInfoDto.java">
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
 * An exception specifies changes to an instance of a recurring series.             
 */
public class MapiCalendarExceptionInfoDto {
  @JsonProperty("attachments")
  private List<MapiAttachmentDto> attachments = null;
  @JsonProperty("body")
  private String body = null;
  @JsonProperty("busyStatus")
  private String busyStatus = null;
  @JsonProperty("endDateTime")
  private Date endDateTime = null;
  @JsonProperty("hasAttachment")
  private Boolean hasAttachment = null;
  @JsonProperty("location")
  private String location = null;
  @JsonProperty("meetingType")
  private String meetingType = null;
  @JsonProperty("originalStartDate")
  private Date originalStartDate = null;
  @JsonProperty("overrideFlags")
  private List<String> overrideFlags = null;
  @JsonProperty("reminderDelta")
  private Integer reminderDelta = null;
  @JsonProperty("reminderSet")
  private Boolean reminderSet = null;
  @JsonProperty("startDateTime")
  private Date startDateTime = null;
  @JsonProperty("subject")
  private String subject = null;
  @JsonProperty("subType")
  private Integer subType = null;

  /**
   * Set attachments and return this.
   * @param attachments Attachments in the recurrence exception.             
   * @return this
  **/
  public MapiCalendarExceptionInfoDto attachments(List<MapiAttachmentDto> attachments) {
    this.attachments = attachments;
    return this;
  }
  /**
   * Add an item to attachments and return this.
   * @param attachmentsItem An item of: Attachments in the recurrence exception.             
   * @return this
  **/
  public MapiCalendarExceptionInfoDto addAttachmentsItem(MapiAttachmentDto attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<MapiAttachmentDto>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

  /**
   * Attachments in the recurrence exception.             
   * @return attachments
  **/
  public List<MapiAttachmentDto> getAttachments() {
    return attachments;
  }  

  /**
   * Set attachments.
   * @param attachments Attachments in the recurrence exception.             
  **/
  public void setAttachments(List<MapiAttachmentDto> attachments) {
    this.attachments = attachments;
  }


  /**
   * Set body and return this.
   * @param body Body.             
   * @return this
  **/
  public MapiCalendarExceptionInfoDto body(String body) {
    this.body = body;
    return this;
  }

  /**
   * Body.             
   * @return body
  **/
  public String getBody() {
    return body;
  }  

  /**
   * Set body.
   * @param body Body.             
  **/
  public void setBody(String body) {
    this.body = body;
  }


  /**
   * Set busyStatus and return this.
   * @param busyStatus Enumerates the mapi calendar possible busy status Enum, available values: Free, Tentative, Busy, OutOfOffice
   * @return this
  **/
  public MapiCalendarExceptionInfoDto busyStatus(String busyStatus) {
    this.busyStatus = busyStatus;
    return this;
  }

  /**
   * Enumerates the mapi calendar possible busy status Enum, available values: Free, Tentative, Busy, OutOfOffice
   * @return busyStatus
  **/
  public String getBusyStatus() {
    return busyStatus;
  }  

  /**
   * Set busyStatus.
   * @param busyStatus Enumerates the mapi calendar possible busy status Enum, available values: Free, Tentative, Busy, OutOfOffice
  **/
  public void setBusyStatus(String busyStatus) {
    this.busyStatus = busyStatus;
  }


  /**
   * Set endDateTime and return this.
   * @param endDateTime End date.             
   * @return this
  **/
  public MapiCalendarExceptionInfoDto endDateTime(Date endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

  /**
   * End date.             
   * @return endDateTime
  **/
  public Date getEndDateTime() {
    return endDateTime;
  }  

  /**
   * Set endDateTime.
   * @param endDateTime End date.             
  **/
  public void setEndDateTime(Date endDateTime) {
    this.endDateTime = endDateTime;
  }


  /**
   * Set hasAttachment and return this.
   * @param hasAttachment Value of this field specifies whether the Exception Embedded Message object contains attachments.             
   * @return this
  **/
  public MapiCalendarExceptionInfoDto hasAttachment(Boolean hasAttachment) {
    this.hasAttachment = hasAttachment;
    return this;
  }

  /**
   * Value of this field specifies whether the Exception Embedded Message object contains attachments.             
   * @return hasAttachment
  **/
  public Boolean isHasAttachment() {
    return hasAttachment;
  }  

  /**
   * Set hasAttachment.
   * @param hasAttachment Value of this field specifies whether the Exception Embedded Message object contains attachments.             
  **/
  public void setHasAttachment(Boolean hasAttachment) {
    this.hasAttachment = hasAttachment;
  }


  /**
   * Set location and return this.
   * @param location Location.             
   * @return this
  **/
  public MapiCalendarExceptionInfoDto location(String location) {
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
   * Set meetingType and return this.
   * @param meetingType Enumerates the appointment state Enum, available values: Meeting, Received, Canceled
   * @return this
  **/
  public MapiCalendarExceptionInfoDto meetingType(String meetingType) {
    this.meetingType = meetingType;
    return this;
  }

  /**
   * Enumerates the appointment state Enum, available values: Meeting, Received, Canceled
   * @return meetingType
  **/
  public String getMeetingType() {
    return meetingType;
  }  

  /**
   * Set meetingType.
   * @param meetingType Enumerates the appointment state Enum, available values: Meeting, Received, Canceled
  **/
  public void setMeetingType(String meetingType) {
    this.meetingType = meetingType;
  }


  /**
   * Set originalStartDate and return this.
   * @param originalStartDate Original start date.             
   * @return this
  **/
  public MapiCalendarExceptionInfoDto originalStartDate(Date originalStartDate) {
    this.originalStartDate = originalStartDate;
    return this;
  }

  /**
   * Original start date.             
   * @return originalStartDate
  **/
  public Date getOriginalStartDate() {
    return originalStartDate;
  }  

  /**
   * Set originalStartDate.
   * @param originalStartDate Original start date.             
  **/
  public void setOriginalStartDate(Date originalStartDate) {
    this.originalStartDate = originalStartDate;
  }


  /**
   * Set overrideFlags and return this.
   * @param overrideFlags Override flags.              Items: Specifies what data in the MapiCalendarOverride structure has a value different from the recurring series. Enum, available values: Subject, MeetingType, ReminderDelta, Reminder, Location, BusyStatus, Attachment, Subtype, AppointmentColor, ExceptionalBody
   * @return this
  **/
  public MapiCalendarExceptionInfoDto overrideFlags(List<String> overrideFlags) {
    this.overrideFlags = overrideFlags;
    return this;
  }
  /**
   * Add an item to overrideFlags and return this.
   * @param overrideFlagsItem An item of: Override flags.             
   * @return this
  **/
  public MapiCalendarExceptionInfoDto addOverrideFlagsItem(String overrideFlagsItem) {
    if (this.overrideFlags == null) {
      this.overrideFlags = new ArrayList<String>();
    }
    this.overrideFlags.add(overrideFlagsItem);
    return this;
  }

  /**
   * Override flags.              Items: Specifies what data in the MapiCalendarOverride structure has a value different from the recurring series. Enum, available values: Subject, MeetingType, ReminderDelta, Reminder, Location, BusyStatus, Attachment, Subtype, AppointmentColor, ExceptionalBody
   * @return overrideFlags
  **/
  public List<String> getOverrideFlags() {
    return overrideFlags;
  }  

  /**
   * Set overrideFlags.
   * @param overrideFlags Override flags.              Items: Specifies what data in the MapiCalendarOverride structure has a value different from the recurring series. Enum, available values: Subject, MeetingType, ReminderDelta, Reminder, Location, BusyStatus, Attachment, Subtype, AppointmentColor, ExceptionalBody
  **/
  public void setOverrideFlags(List<String> overrideFlags) {
    this.overrideFlags = overrideFlags;
  }


  /**
   * Set reminderDelta and return this.
   * @param reminderDelta Reminder delta.             
   * @return this
  **/
  public MapiCalendarExceptionInfoDto reminderDelta(Integer reminderDelta) {
    this.reminderDelta = reminderDelta;
    return this;
  }

  /**
   * Reminder delta.             
   * @return reminderDelta
  **/
  public Integer getReminderDelta() {
    return reminderDelta;
  }  

  /**
   * Set reminderDelta.
   * @param reminderDelta Reminder delta.             
  **/
  public void setReminderDelta(Integer reminderDelta) {
    this.reminderDelta = reminderDelta;
  }


  /**
   * Set reminderSet and return this.
   * @param reminderSet Value for the PidLidReminderSet property.             
   * @return this
  **/
  public MapiCalendarExceptionInfoDto reminderSet(Boolean reminderSet) {
    this.reminderSet = reminderSet;
    return this;
  }

  /**
   * Value for the PidLidReminderSet property.             
   * @return reminderSet
  **/
  public Boolean isReminderSet() {
    return reminderSet;
  }  

  /**
   * Set reminderSet.
   * @param reminderSet Value for the PidLidReminderSet property.             
  **/
  public void setReminderSet(Boolean reminderSet) {
    this.reminderSet = reminderSet;
  }


  /**
   * Set startDateTime and return this.
   * @param startDateTime Start date.             
   * @return this
  **/
  public MapiCalendarExceptionInfoDto startDateTime(Date startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }

  /**
   * Start date.             
   * @return startDateTime
  **/
  public Date getStartDateTime() {
    return startDateTime;
  }  

  /**
   * Set startDateTime.
   * @param startDateTime Start date.             
  **/
  public void setStartDateTime(Date startDateTime) {
    this.startDateTime = startDateTime;
  }


  /**
   * Set subject and return this.
   * @param subject Subject.             
   * @return this
  **/
  public MapiCalendarExceptionInfoDto subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Subject.             
   * @return subject
  **/
  public String getSubject() {
    return subject;
  }  

  /**
   * Set subject.
   * @param subject Subject.             
  **/
  public void setSubject(String subject) {
    this.subject = subject;
  }


  /**
   * Set subType and return this.
   * @param subType SubType.             
   * @return this
  **/
  public MapiCalendarExceptionInfoDto subType(Integer subType) {
    this.subType = subType;
    return this;
  }

  /**
   * SubType.             
   * @return subType
  **/
  public Integer getSubType() {
    return subType;
  }  

  /**
   * Set subType.
   * @param subType SubType.             
  **/
  public void setSubType(Integer subType) {
    this.subType = subType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    MapiCalendarExceptionInfoDto mapiCalendarExceptionInfoDto = (MapiCalendarExceptionInfoDto) o;
    return ObjectUtils.equals(this.attachments, mapiCalendarExceptionInfoDto.attachments) &&
    ObjectUtils.equals(this.body, mapiCalendarExceptionInfoDto.body) &&
    ObjectUtils.equals(this.busyStatus, mapiCalendarExceptionInfoDto.busyStatus) &&
    ObjectUtils.equals(this.endDateTime, mapiCalendarExceptionInfoDto.endDateTime) &&
    ObjectUtils.equals(this.hasAttachment, mapiCalendarExceptionInfoDto.hasAttachment) &&
    ObjectUtils.equals(this.location, mapiCalendarExceptionInfoDto.location) &&
    ObjectUtils.equals(this.meetingType, mapiCalendarExceptionInfoDto.meetingType) &&
    ObjectUtils.equals(this.originalStartDate, mapiCalendarExceptionInfoDto.originalStartDate) &&
    ObjectUtils.equals(this.overrideFlags, mapiCalendarExceptionInfoDto.overrideFlags) &&
    ObjectUtils.equals(this.reminderDelta, mapiCalendarExceptionInfoDto.reminderDelta) &&
    ObjectUtils.equals(this.reminderSet, mapiCalendarExceptionInfoDto.reminderSet) &&
    ObjectUtils.equals(this.startDateTime, mapiCalendarExceptionInfoDto.startDateTime) &&
    ObjectUtils.equals(this.subject, mapiCalendarExceptionInfoDto.subject) &&
    ObjectUtils.equals(this.subType, mapiCalendarExceptionInfoDto.subType);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(attachments, body, busyStatus, endDateTime, hasAttachment, location, meetingType, originalStartDate, overrideFlags, reminderDelta, reminderSet, startDateTime, subject, subType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapiCalendarExceptionInfoDto {\n");
    
    sb.append("    attachments: ").append(toIndentedString(getAttachments())).append("\n");
    sb.append("    body: ").append(toIndentedString(getBody())).append("\n");
    sb.append("    busyStatus: ").append(toIndentedString(getBusyStatus())).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(getEndDateTime())).append("\n");
    sb.append("    hasAttachment: ").append(toIndentedString(isHasAttachment())).append("\n");
    sb.append("    location: ").append(toIndentedString(getLocation())).append("\n");
    sb.append("    meetingType: ").append(toIndentedString(getMeetingType())).append("\n");
    sb.append("    originalStartDate: ").append(toIndentedString(getOriginalStartDate())).append("\n");
    sb.append("    overrideFlags: ").append(toIndentedString(getOverrideFlags())).append("\n");
    sb.append("    reminderDelta: ").append(toIndentedString(getReminderDelta())).append("\n");
    sb.append("    reminderSet: ").append(toIndentedString(isReminderSet())).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(getStartDateTime())).append("\n");
    sb.append("    subject: ").append(toIndentedString(getSubject())).append("\n");
    sb.append("    subType: ").append(toIndentedString(getSubType())).append("\n");
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

  public MapiCalendarExceptionInfoDto() {
    super();
  }

  /**
   * Initializes a new instance of the MapiCalendarExceptionInfoDto
   * @param attachments Attachments in the recurrence exception.             
   * @param body Body.             
   * @param busyStatus Enumerates the mapi calendar possible busy status Enum, available values: Free, Tentative, Busy, OutOfOffice
   * @param endDateTime End date.             
   * @param hasAttachment Value of this field specifies whether the Exception Embedded Message object contains attachments.             
   * @param location Location.             
   * @param meetingType Enumerates the appointment state Enum, available values: Meeting, Received, Canceled
   * @param originalStartDate Original start date.             
   * @param overrideFlags Override flags.              Items: Specifies what data in the MapiCalendarOverride structure has a value different from the recurring series. Enum, available values: Subject, MeetingType, ReminderDelta, Reminder, Location, BusyStatus, Attachment, Subtype, AppointmentColor, ExceptionalBody
   * @param reminderDelta Reminder delta.             
   * @param reminderSet Value for the PidLidReminderSet property.             
   * @param startDateTime Start date.             
   * @param subject Subject.             
   * @param subType SubType.             
   */
  public MapiCalendarExceptionInfoDto(
    List<MapiAttachmentDto> attachments,
    String body,
    String busyStatus,
    Date endDateTime,
    Boolean hasAttachment,
    String location,
    String meetingType,
    Date originalStartDate,
    List<String> overrideFlags,
    Integer reminderDelta,
    Boolean reminderSet,
    Date startDateTime,
    String subject,
    Integer subType
  ) {
    super();
    setAttachments(attachments);
    setBody(body);
    setBusyStatus(busyStatus);
    setEndDateTime(endDateTime);
    setHasAttachment(hasAttachment);
    setLocation(location);
    setMeetingType(meetingType);
    setOriginalStartDate(originalStartDate);
    setOverrideFlags(overrideFlags);
    setReminderDelta(reminderDelta);
    setReminderSet(reminderSet);
    setStartDateTime(startDateTime);
    setSubject(subject);
    setSubType(subType);
  }

}

