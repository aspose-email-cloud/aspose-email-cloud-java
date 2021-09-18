/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiCalendarDto.java">
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
 * Represents the mapi calendar object             
 */
public class MapiCalendarDto extends MapiMessageItemBaseDto {
  @JsonProperty("appointmentCounterProposal")
  private Boolean appointmentCounterProposal = null;
  @JsonProperty("attendees")
  private MapiCalendarAttendeesDto attendees = null;
  @JsonProperty("busyStatus")
  private String busyStatus = null;
  @JsonProperty("clientIntent")
  private List<String> clientIntent = null;
  @JsonProperty("endDate")
  private Date endDate = null;
  @JsonProperty("endDateTimeZone")
  private MapiCalendarTimeZoneDto endDateTimeZone = null;
  @JsonProperty("isAllDay")
  private Boolean isAllDay = null;
  @JsonProperty("keyWords")
  private String keyWords = null;
  @JsonProperty("location")
  private String location = null;
  @JsonProperty("recurrence")
  private MapiCalendarEventRecurrenceDto recurrence = null;
  @JsonProperty("reminderDelta")
  private Integer reminderDelta = null;
  @JsonProperty("reminderFileParameter")
  private String reminderFileParameter = null;
  @JsonProperty("reminderSet")
  private Boolean reminderSet = null;
  @JsonProperty("sequence")
  private Integer sequence = null;
  @JsonProperty("startDate")
  private Date startDate = null;
  @JsonProperty("startDateTimeZone")
  private MapiCalendarTimeZoneDto startDateTimeZone = null;
  @JsonProperty("uid")
  private String uid = null;
  @JsonProperty("organizer")
  private MapiElectronicAddressDto organizer = null;

  /**
   * Set appointmentCounterProposal and return this.
   * @param appointmentCounterProposal Value indicating whether a Meeting Response object is a counter proposal.             
   * @return this
  **/
  public MapiCalendarDto appointmentCounterProposal(Boolean appointmentCounterProposal) {
    this.appointmentCounterProposal = appointmentCounterProposal;
    return this;
  }

  /**
   * Value indicating whether a Meeting Response object is a counter proposal.             
   * @return appointmentCounterProposal
  **/
  public Boolean isAppointmentCounterProposal() {
    return appointmentCounterProposal;
  }  

  /**
   * Set appointmentCounterProposal.
   * @param appointmentCounterProposal Value indicating whether a Meeting Response object is a counter proposal.             
  **/
  public void setAppointmentCounterProposal(Boolean appointmentCounterProposal) {
    this.appointmentCounterProposal = appointmentCounterProposal;
  }


  /**
   * Set attendees and return this.
   * @param attendees Attendees             
   * @return this
  **/
  public MapiCalendarDto attendees(MapiCalendarAttendeesDto attendees) {
    this.attendees = attendees;
    return this;
  }

  /**
   * Attendees             
   * @return attendees
  **/
  public MapiCalendarAttendeesDto getAttendees() {
    return attendees;
  }  

  /**
   * Set attendees.
   * @param attendees Attendees             
  **/
  public void setAttendees(MapiCalendarAttendeesDto attendees) {
    this.attendees = attendees;
  }


  /**
   * Set busyStatus and return this.
   * @param busyStatus Enumerates the mapi calendar possible busy status./nEnum, available values: Free, Tentative, Busy, OutOfOffice
   * @return this
  **/
  public MapiCalendarDto busyStatus(String busyStatus) {
    this.busyStatus = busyStatus;
    return this;
  }

  /**
   * Enumerates the mapi calendar possible busy status./nEnum, available values: Free, Tentative, Busy, OutOfOffice
   * @return busyStatus
  **/
  public String getBusyStatus() {
    return busyStatus;
  }  

  /**
   * Set busyStatus.
   * @param busyStatus Enumerates the mapi calendar possible busy status./nEnum, available values: Free, Tentative, Busy, OutOfOffice
  **/
  public void setBusyStatus(String busyStatus) {
    this.busyStatus = busyStatus;
  }


  /**
   * Set clientIntent and return this.
   * @param clientIntent Actions the user has taken on this Meeting object.              Items: Enumerates the actions the user can taken on the Meeting object./nEnum, available values: Manager, Delegate, DeletedWithNoResponse, DeletedExceptionWithNoResponse, RespondedTentative, RespondedAccept, RespondedDecline, ModifiedStartTime, ModifiedEndTime, ModifiedLocation, RespondedExceptionDecline, Canceled, ExceptionCanceled
   * @return this
  **/
  public MapiCalendarDto clientIntent(List<String> clientIntent) {
    this.clientIntent = clientIntent;
    return this;
  }
  /**
   * Add an item to clientIntent and return this.
   * @param clientIntentItem An item of: Actions the user has taken on this Meeting object.             
   * @return this
  **/
  public MapiCalendarDto addClientIntentItem(String clientIntentItem) {
    if (this.clientIntent == null) {
      this.clientIntent = new ArrayList<String>();
    }
    this.clientIntent.add(clientIntentItem);
    return this;
  }

  /**
   * Actions the user has taken on this Meeting object.              Items: Enumerates the actions the user can taken on the Meeting object./nEnum, available values: Manager, Delegate, DeletedWithNoResponse, DeletedExceptionWithNoResponse, RespondedTentative, RespondedAccept, RespondedDecline, ModifiedStartTime, ModifiedEndTime, ModifiedLocation, RespondedExceptionDecline, Canceled, ExceptionCanceled
   * @return clientIntent
  **/
  public List<String> getClientIntent() {
    return clientIntent;
  }  

  /**
   * Set clientIntent.
   * @param clientIntent Actions the user has taken on this Meeting object.              Items: Enumerates the actions the user can taken on the Meeting object./nEnum, available values: Manager, Delegate, DeletedWithNoResponse, DeletedExceptionWithNoResponse, RespondedTentative, RespondedAccept, RespondedDecline, ModifiedStartTime, ModifiedEndTime, ModifiedLocation, RespondedExceptionDecline, Canceled, ExceptionCanceled
  **/
  public void setClientIntent(List<String> clientIntent) {
    this.clientIntent = clientIntent;
  }


  /**
   * Set endDate and return this.
   * @param endDate End date and time of the event. If the date is not set, default value for DateTime is returned.             
   * @return this
  **/
  public MapiCalendarDto endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * End date and time of the event. If the date is not set, default value for DateTime is returned.             
   * @return endDate
  **/
  public Date getEndDate() {
    return endDate;
  }  

  /**
   * Set endDate.
   * @param endDate End date and time of the event. If the date is not set, default value for DateTime is returned.             
  **/
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }


  /**
   * Set endDateTimeZone and return this.
   * @param endDateTimeZone Time zone information that indicates the time zone of the EndDate property.             
   * @return this
  **/
  public MapiCalendarDto endDateTimeZone(MapiCalendarTimeZoneDto endDateTimeZone) {
    this.endDateTimeZone = endDateTimeZone;
    return this;
  }

  /**
   * Time zone information that indicates the time zone of the EndDate property.             
   * @return endDateTimeZone
  **/
  public MapiCalendarTimeZoneDto getEndDateTimeZone() {
    return endDateTimeZone;
  }  

  /**
   * Set endDateTimeZone.
   * @param endDateTimeZone Time zone information that indicates the time zone of the EndDate property.             
  **/
  public void setEndDateTimeZone(MapiCalendarTimeZoneDto endDateTimeZone) {
    this.endDateTimeZone = endDateTimeZone;
  }


  /**
   * Set isAllDay and return this.
   * @param isAllDay Value indicating whether the event is an all-day event.             
   * @return this
  **/
  public MapiCalendarDto isAllDay(Boolean isAllDay) {
    this.isAllDay = isAllDay;
    return this;
  }

  /**
   * Value indicating whether the event is an all-day event.             
   * @return isAllDay
  **/
  public Boolean isIsAllDay() {
    return isAllDay;
  }  

  /**
   * Set isAllDay.
   * @param isAllDay Value indicating whether the event is an all-day event.             
  **/
  public void setIsAllDay(Boolean isAllDay) {
    this.isAllDay = isAllDay;
  }


  /**
   * Set keyWords and return this.
   * @param keyWords Categories of the calendar object.             
   * @return this
  **/
  public MapiCalendarDto keyWords(String keyWords) {
    this.keyWords = keyWords;
    return this;
  }

  /**
   * Categories of the calendar object.             
   * @return keyWords
  **/
  public String getKeyWords() {
    return keyWords;
  }  

  /**
   * Set keyWords.
   * @param keyWords Categories of the calendar object.             
  **/
  public void setKeyWords(String keyWords) {
    this.keyWords = keyWords;
  }


  /**
   * Set location and return this.
   * @param location Location of the event.             
   * @return this
  **/
  public MapiCalendarDto location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Location of the event.             
   * @return location
  **/
  public String getLocation() {
    return location;
  }  

  /**
   * Set location.
   * @param location Location of the event.             
  **/
  public void setLocation(String location) {
    this.location = location;
  }


  /**
   * Set recurrence and return this.
   * @param recurrence Recurrence properties.             
   * @return this
  **/
  public MapiCalendarDto recurrence(MapiCalendarEventRecurrenceDto recurrence) {
    this.recurrence = recurrence;
    return this;
  }

  /**
   * Recurrence properties.             
   * @return recurrence
  **/
  public MapiCalendarEventRecurrenceDto getRecurrence() {
    return recurrence;
  }  

  /**
   * Set recurrence.
   * @param recurrence Recurrence properties.             
  **/
  public void setRecurrence(MapiCalendarEventRecurrenceDto recurrence) {
    this.recurrence = recurrence;
  }


  /**
   * Set reminderDelta and return this.
   * @param reminderDelta Interval, in minutes, between the time at which the reminder first becomes overdue and the start time of the Calendar object.             
   * @return this
  **/
  public MapiCalendarDto reminderDelta(Integer reminderDelta) {
    this.reminderDelta = reminderDelta;
    return this;
  }

  /**
   * Interval, in minutes, between the time at which the reminder first becomes overdue and the start time of the Calendar object.             
   * @return reminderDelta
  **/
  public Integer getReminderDelta() {
    return reminderDelta;
  }  

  /**
   * Set reminderDelta.
   * @param reminderDelta Interval, in minutes, between the time at which the reminder first becomes overdue and the start time of the Calendar object.             
  **/
  public void setReminderDelta(Integer reminderDelta) {
    this.reminderDelta = reminderDelta;
  }


  /**
   * Set reminderFileParameter and return this.
   * @param reminderFileParameter Full path of the sound that a client SHOULD play when the reminder becomes overdue.             
   * @return this
  **/
  public MapiCalendarDto reminderFileParameter(String reminderFileParameter) {
    this.reminderFileParameter = reminderFileParameter;
    return this;
  }

  /**
   * Full path of the sound that a client SHOULD play when the reminder becomes overdue.             
   * @return reminderFileParameter
  **/
  public String getReminderFileParameter() {
    return reminderFileParameter;
  }  

  /**
   * Set reminderFileParameter.
   * @param reminderFileParameter Full path of the sound that a client SHOULD play when the reminder becomes overdue.             
  **/
  public void setReminderFileParameter(String reminderFileParameter) {
    this.reminderFileParameter = reminderFileParameter;
  }


  /**
   * Set reminderSet and return this.
   * @param reminderSet Value indicating whether a reminder is set on the object.             
   * @return this
  **/
  public MapiCalendarDto reminderSet(Boolean reminderSet) {
    this.reminderSet = reminderSet;
    return this;
  }

  /**
   * Value indicating whether a reminder is set on the object.             
   * @return reminderSet
  **/
  public Boolean isReminderSet() {
    return reminderSet;
  }  

  /**
   * Set reminderSet.
   * @param reminderSet Value indicating whether a reminder is set on the object.             
  **/
  public void setReminderSet(Boolean reminderSet) {
    this.reminderSet = reminderSet;
  }


  /**
   * Set sequence and return this.
   * @param sequence Sequence number.             
   * @return this
  **/
  public MapiCalendarDto sequence(Integer sequence) {
    this.sequence = sequence;
    return this;
  }

  /**
   * Sequence number.             
   * @return sequence
  **/
  public Integer getSequence() {
    return sequence;
  }  

  /**
   * Set sequence.
   * @param sequence Sequence number.             
  **/
  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }


  /**
   * Set startDate and return this.
   * @param startDate Start date and time of the event. If the date is not set, default value for DateTime is returned.             
   * @return this
  **/
  public MapiCalendarDto startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Start date and time of the event. If the date is not set, default value for DateTime is returned.             
   * @return startDate
  **/
  public Date getStartDate() {
    return startDate;
  }  

  /**
   * Set startDate.
   * @param startDate Start date and time of the event. If the date is not set, default value for DateTime is returned.             
  **/
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }


  /**
   * Set startDateTimeZone and return this.
   * @param startDateTimeZone Time zone information that indicates the time zone of the StartDate property.             
   * @return this
  **/
  public MapiCalendarDto startDateTimeZone(MapiCalendarTimeZoneDto startDateTimeZone) {
    this.startDateTimeZone = startDateTimeZone;
    return this;
  }

  /**
   * Time zone information that indicates the time zone of the StartDate property.             
   * @return startDateTimeZone
  **/
  public MapiCalendarTimeZoneDto getStartDateTimeZone() {
    return startDateTimeZone;
  }  

  /**
   * Set startDateTimeZone.
   * @param startDateTimeZone Time zone information that indicates the time zone of the StartDate property.             
  **/
  public void setStartDateTimeZone(MapiCalendarTimeZoneDto startDateTimeZone) {
    this.startDateTimeZone = startDateTimeZone;
  }


  /**
   * Set uid and return this.
   * @param uid Unique identifier.             
   * @return this
  **/
  public MapiCalendarDto uid(String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Unique identifier.             
   * @return uid
  **/
  public String getUid() {
    return uid;
  }  

  /**
   * Set uid.
   * @param uid Unique identifier.             
  **/
  public void setUid(String uid) {
    this.uid = uid;
  }


  /**
   * Set organizer and return this.
   * @param organizer Organizer             
   * @return this
  **/
  public MapiCalendarDto organizer(MapiElectronicAddressDto organizer) {
    this.organizer = organizer;
    return this;
  }

  /**
   * Organizer             
   * @return organizer
  **/
  public MapiElectronicAddressDto getOrganizer() {
    return organizer;
  }  

  /**
   * Set organizer.
   * @param organizer Organizer             
  **/
  public void setOrganizer(MapiElectronicAddressDto organizer) {
    this.organizer = organizer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    MapiCalendarDto mapiCalendarDto = (MapiCalendarDto) o;
    return ObjectUtils.equals(this.appointmentCounterProposal, mapiCalendarDto.appointmentCounterProposal) &&
    ObjectUtils.equals(this.attendees, mapiCalendarDto.attendees) &&
    ObjectUtils.equals(this.busyStatus, mapiCalendarDto.busyStatus) &&
    ObjectUtils.equals(this.clientIntent, mapiCalendarDto.clientIntent) &&
    ObjectUtils.equals(this.endDate, mapiCalendarDto.endDate) &&
    ObjectUtils.equals(this.endDateTimeZone, mapiCalendarDto.endDateTimeZone) &&
    ObjectUtils.equals(this.isAllDay, mapiCalendarDto.isAllDay) &&
    ObjectUtils.equals(this.keyWords, mapiCalendarDto.keyWords) &&
    ObjectUtils.equals(this.location, mapiCalendarDto.location) &&
    ObjectUtils.equals(this.recurrence, mapiCalendarDto.recurrence) &&
    ObjectUtils.equals(this.reminderDelta, mapiCalendarDto.reminderDelta) &&
    ObjectUtils.equals(this.reminderFileParameter, mapiCalendarDto.reminderFileParameter) &&
    ObjectUtils.equals(this.reminderSet, mapiCalendarDto.reminderSet) &&
    ObjectUtils.equals(this.sequence, mapiCalendarDto.sequence) &&
    ObjectUtils.equals(this.startDate, mapiCalendarDto.startDate) &&
    ObjectUtils.equals(this.startDateTimeZone, mapiCalendarDto.startDateTimeZone) &&
    ObjectUtils.equals(this.uid, mapiCalendarDto.uid) &&
    ObjectUtils.equals(this.organizer, mapiCalendarDto.organizer) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(appointmentCounterProposal, attendees, busyStatus, clientIntent, endDate, endDateTimeZone, isAllDay, keyWords, location, recurrence, reminderDelta, reminderFileParameter, reminderSet, sequence, startDate, startDateTimeZone, uid, organizer, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapiCalendarDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    attachments: ").append(toIndentedString(getAttachments())).append("\n");
    sb.append("    billing: ").append(toIndentedString(getBilling())).append("\n");
    sb.append("    body: ").append(toIndentedString(getBody())).append("\n");
    sb.append("    bodyHtml: ").append(toIndentedString(getBodyHtml())).append("\n");
    sb.append("    bodyRtf: ").append(toIndentedString(getBodyRtf())).append("\n");
    sb.append("    bodyType: ").append(toIndentedString(getBodyType())).append("\n");
    sb.append("    categories: ").append(toIndentedString(getCategories())).append("\n");
    sb.append("    companies: ").append(toIndentedString(getCompanies())).append("\n");
    sb.append("    itemId: ").append(toIndentedString(getItemId())).append("\n");
    sb.append("    messageClass: ").append(toIndentedString(getMessageClass())).append("\n");
    sb.append("    mileage: ").append(toIndentedString(getMileage())).append("\n");
    sb.append("    recipients: ").append(toIndentedString(getRecipients())).append("\n");
    sb.append("    sensitivity: ").append(toIndentedString(getSensitivity())).append("\n");
    sb.append("    subject: ").append(toIndentedString(getSubject())).append("\n");
    sb.append("    subjectPrefix: ").append(toIndentedString(getSubjectPrefix())).append("\n");
    sb.append("    properties: ").append(toIndentedString(getProperties())).append("\n");
    sb.append("    discriminator: ").append(toIndentedString(getDiscriminator())).append("\n");
    sb.append("    appointmentCounterProposal: ").append(toIndentedString(isAppointmentCounterProposal())).append("\n");
    sb.append("    attendees: ").append(toIndentedString(getAttendees())).append("\n");
    sb.append("    busyStatus: ").append(toIndentedString(getBusyStatus())).append("\n");
    sb.append("    clientIntent: ").append(toIndentedString(getClientIntent())).append("\n");
    sb.append("    endDate: ").append(toIndentedString(getEndDate())).append("\n");
    sb.append("    endDateTimeZone: ").append(toIndentedString(getEndDateTimeZone())).append("\n");
    sb.append("    isAllDay: ").append(toIndentedString(isIsAllDay())).append("\n");
    sb.append("    keyWords: ").append(toIndentedString(getKeyWords())).append("\n");
    sb.append("    location: ").append(toIndentedString(getLocation())).append("\n");
    sb.append("    recurrence: ").append(toIndentedString(getRecurrence())).append("\n");
    sb.append("    reminderDelta: ").append(toIndentedString(getReminderDelta())).append("\n");
    sb.append("    reminderFileParameter: ").append(toIndentedString(getReminderFileParameter())).append("\n");
    sb.append("    reminderSet: ").append(toIndentedString(isReminderSet())).append("\n");
    sb.append("    sequence: ").append(toIndentedString(getSequence())).append("\n");
    sb.append("    startDate: ").append(toIndentedString(getStartDate())).append("\n");
    sb.append("    startDateTimeZone: ").append(toIndentedString(getStartDateTimeZone())).append("\n");
    sb.append("    uid: ").append(toIndentedString(getUid())).append("\n");
    sb.append("    organizer: ").append(toIndentedString(getOrganizer())).append("\n");
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

  public MapiCalendarDto() {
    super();
  }

  /**
   * Initializes a new instance of the MapiCalendarDto
   * @param attachments Message item attachments.             
   * @param billing Billing information associated with an item.             
   * @param body Message text.             
   * @param bodyHtml Gets the BodyRtf of the message converted to HTML, if present, otherwise an empty string.             
   * @param bodyRtf RTF formatted message text.             
   * @param bodyType The content type of message body./nEnum, available values: PlainText, Html, Rtf
   * @param categories Contains keywords or categories for the message object.             
   * @param companies Contains the names of the companies that are associated with an item.             
   * @param itemId The item id, uses with a server.             
   * @param messageClass Case-sensitive string that identifies the sender-defined message class, such as IPM.Note. The message class specifies the type, purpose, or content of the message.             
   * @param mileage Contains the mileage information that is associated with an item.             
   * @param recipients Recipients of the message.             
   * @param sensitivity Contains values that indicate the message sensitivity./nEnum, available values: None, Personal, Private, CompanyConfidential
   * @param subject Subject of the message.             
   * @param subjectPrefix Subject prefix that typically indicates some action on a message, such as \&quot;FW: \&quot; for forwarding.             
   * @param properties List of MAPI properties             
   * @param appointmentCounterProposal Value indicating whether a Meeting Response object is a counter proposal.             
   * @param attendees Attendees             
   * @param busyStatus Enumerates the mapi calendar possible busy status./nEnum, available values: Free, Tentative, Busy, OutOfOffice
   * @param clientIntent Actions the user has taken on this Meeting object.              Items: Enumerates the actions the user can taken on the Meeting object./nEnum, available values: Manager, Delegate, DeletedWithNoResponse, DeletedExceptionWithNoResponse, RespondedTentative, RespondedAccept, RespondedDecline, ModifiedStartTime, ModifiedEndTime, ModifiedLocation, RespondedExceptionDecline, Canceled, ExceptionCanceled
   * @param endDate End date and time of the event. If the date is not set, default value for DateTime is returned.             
   * @param endDateTimeZone Time zone information that indicates the time zone of the EndDate property.             
   * @param isAllDay Value indicating whether the event is an all-day event.             
   * @param keyWords Categories of the calendar object.             
   * @param location Location of the event.             
   * @param recurrence Recurrence properties.             
   * @param reminderDelta Interval, in minutes, between the time at which the reminder first becomes overdue and the start time of the Calendar object.             
   * @param reminderFileParameter Full path of the sound that a client SHOULD play when the reminder becomes overdue.             
   * @param reminderSet Value indicating whether a reminder is set on the object.             
   * @param sequence Sequence number.             
   * @param startDate Start date and time of the event. If the date is not set, default value for DateTime is returned.             
   * @param startDateTimeZone Time zone information that indicates the time zone of the StartDate property.             
   * @param uid Unique identifier.             
   * @param organizer Organizer             
   */
  public MapiCalendarDto(
    List<MapiAttachmentDto> attachments,
    String billing,
    String body,
    String bodyHtml,
    String bodyRtf,
    String bodyType,
    List<String> categories,
    List<String> companies,
    String itemId,
    String messageClass,
    String mileage,
    List<MapiRecipientDto> recipients,
    String sensitivity,
    String subject,
    String subjectPrefix,
    List<MapiPropertyDto> properties
    ,
    Boolean appointmentCounterProposal,
    MapiCalendarAttendeesDto attendees,
    String busyStatus,
    List<String> clientIntent,
    Date endDate,
    MapiCalendarTimeZoneDto endDateTimeZone,
    Boolean isAllDay,
    String keyWords,
    String location,
    MapiCalendarEventRecurrenceDto recurrence,
    Integer reminderDelta,
    String reminderFileParameter,
    Boolean reminderSet,
    Integer sequence,
    Date startDate,
    MapiCalendarTimeZoneDto startDateTimeZone,
    String uid,
    MapiElectronicAddressDto organizer
  ) {
    super();
    setAttachments(attachments);
    setBilling(billing);
    setBody(body);
    setBodyHtml(bodyHtml);
    setBodyRtf(bodyRtf);
    setBodyType(bodyType);
    setCategories(categories);
    setCompanies(companies);
    setItemId(itemId);
    setMessageClass(messageClass);
    setMileage(mileage);
    setRecipients(recipients);
    setSensitivity(sensitivity);
    setSubject(subject);
    setSubjectPrefix(subjectPrefix);
    setProperties(properties);
    setAppointmentCounterProposal(appointmentCounterProposal);
    setAttendees(attendees);
    setBusyStatus(busyStatus);
    setClientIntent(clientIntent);
    setEndDate(endDate);
    setEndDateTimeZone(endDateTimeZone);
    setIsAllDay(isAllDay);
    setKeyWords(keyWords);
    setLocation(location);
    setRecurrence(recurrence);
    setReminderDelta(reminderDelta);
    setReminderFileParameter(reminderFileParameter);
    setReminderSet(reminderSet);
    setSequence(sequence);
    setStartDate(startDate);
    setStartDateTimeZone(startDateTimeZone);
    setUid(uid);
    setOrganizer(organizer);
  }

}

