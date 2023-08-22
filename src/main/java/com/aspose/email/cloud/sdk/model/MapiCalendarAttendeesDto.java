/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiCalendarAttendeesDto.java">
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
 * Mapi calendar attendees.             
 */
public class MapiCalendarAttendeesDto {
  @JsonProperty("appointmentRecipients")
  private List<MapiRecipientDto> appointmentRecipients = null;
  @JsonProperty("appointmentUnsendableRecipients")
  private List<MapiRecipientDto> appointmentUnsendableRecipients = null;
  @JsonProperty("notAllowPropose")
  private Boolean notAllowPropose = null;
  @JsonProperty("responseRequested")
  private Boolean responseRequested = null;

  /**
   * Set appointmentRecipients and return this.
   * @param appointmentRecipients List of attendees.             
   * @return this
  **/
  public MapiCalendarAttendeesDto appointmentRecipients(List<MapiRecipientDto> appointmentRecipients) {
    this.appointmentRecipients = appointmentRecipients;
    return this;
  }
  /**
   * Add an item to appointmentRecipients and return this.
   * @param appointmentRecipientsItem An item of: List of attendees.             
   * @return this
  **/
  public MapiCalendarAttendeesDto addAppointmentRecipientsItem(MapiRecipientDto appointmentRecipientsItem) {
    if (this.appointmentRecipients == null) {
      this.appointmentRecipients = new ArrayList<MapiRecipientDto>();
    }
    this.appointmentRecipients.add(appointmentRecipientsItem);
    return this;
  }

  /**
   * List of attendees.             
   * @return appointmentRecipients
  **/
  public List<MapiRecipientDto> getAppointmentRecipients() {
    return appointmentRecipients;
  }  

  /**
   * Set appointmentRecipients.
   * @param appointmentRecipients List of attendees.             
  **/
  public void setAppointmentRecipients(List<MapiRecipientDto> appointmentRecipients) {
    this.appointmentRecipients = appointmentRecipients;
  }


  /**
   * Set appointmentUnsendableRecipients and return this.
   * @param appointmentUnsendableRecipients List of unsendable attendees.             
   * @return this
  **/
  public MapiCalendarAttendeesDto appointmentUnsendableRecipients(List<MapiRecipientDto> appointmentUnsendableRecipients) {
    this.appointmentUnsendableRecipients = appointmentUnsendableRecipients;
    return this;
  }
  /**
   * Add an item to appointmentUnsendableRecipients and return this.
   * @param appointmentUnsendableRecipientsItem An item of: List of unsendable attendees.             
   * @return this
  **/
  public MapiCalendarAttendeesDto addAppointmentUnsendableRecipientsItem(MapiRecipientDto appointmentUnsendableRecipientsItem) {
    if (this.appointmentUnsendableRecipients == null) {
      this.appointmentUnsendableRecipients = new ArrayList<MapiRecipientDto>();
    }
    this.appointmentUnsendableRecipients.add(appointmentUnsendableRecipientsItem);
    return this;
  }

  /**
   * List of unsendable attendees.             
   * @return appointmentUnsendableRecipients
  **/
  public List<MapiRecipientDto> getAppointmentUnsendableRecipients() {
    return appointmentUnsendableRecipients;
  }  

  /**
   * Set appointmentUnsendableRecipients.
   * @param appointmentUnsendableRecipients List of unsendable attendees.             
  **/
  public void setAppointmentUnsendableRecipients(List<MapiRecipientDto> appointmentUnsendableRecipients) {
    this.appointmentUnsendableRecipients = appointmentUnsendableRecipients;
  }


  /**
   * Set notAllowPropose and return this.
   * @param notAllowPropose Value indicating whether attendees are not allowed to propose a new date and/or time for the meeting.             
   * @return this
  **/
  public MapiCalendarAttendeesDto notAllowPropose(Boolean notAllowPropose) {
    this.notAllowPropose = notAllowPropose;
    return this;
  }

  /**
   * Value indicating whether attendees are not allowed to propose a new date and/or time for the meeting.             
   * @return notAllowPropose
  **/
  public Boolean isNotAllowPropose() {
    return notAllowPropose;
  }  

  /**
   * Set notAllowPropose.
   * @param notAllowPropose Value indicating whether attendees are not allowed to propose a new date and/or time for the meeting.             
  **/
  public void setNotAllowPropose(Boolean notAllowPropose) {
    this.notAllowPropose = notAllowPropose;
  }


  /**
   * Set responseRequested and return this.
   * @param responseRequested Value indicating whether a response is requested to a Message object.             
   * @return this
  **/
  public MapiCalendarAttendeesDto responseRequested(Boolean responseRequested) {
    this.responseRequested = responseRequested;
    return this;
  }

  /**
   * Value indicating whether a response is requested to a Message object.             
   * @return responseRequested
  **/
  public Boolean isResponseRequested() {
    return responseRequested;
  }  

  /**
   * Set responseRequested.
   * @param responseRequested Value indicating whether a response is requested to a Message object.             
  **/
  public void setResponseRequested(Boolean responseRequested) {
    this.responseRequested = responseRequested;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    MapiCalendarAttendeesDto mapiCalendarAttendeesDto = (MapiCalendarAttendeesDto) o;
    return ObjectUtils.equals(this.appointmentRecipients, mapiCalendarAttendeesDto.appointmentRecipients) &&
    ObjectUtils.equals(this.appointmentUnsendableRecipients, mapiCalendarAttendeesDto.appointmentUnsendableRecipients) &&
    ObjectUtils.equals(this.notAllowPropose, mapiCalendarAttendeesDto.notAllowPropose) &&
    ObjectUtils.equals(this.responseRequested, mapiCalendarAttendeesDto.responseRequested);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(appointmentRecipients, appointmentUnsendableRecipients, notAllowPropose, responseRequested);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapiCalendarAttendeesDto {\n");
    
    sb.append("    appointmentRecipients: ").append(toIndentedString(getAppointmentRecipients())).append("\n");
    sb.append("    appointmentUnsendableRecipients: ").append(toIndentedString(getAppointmentUnsendableRecipients())).append("\n");
    sb.append("    notAllowPropose: ").append(toIndentedString(isNotAllowPropose())).append("\n");
    sb.append("    responseRequested: ").append(toIndentedString(isResponseRequested())).append("\n");
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

  public MapiCalendarAttendeesDto() {
    super();
  }

  /**
   * Initializes a new instance of the MapiCalendarAttendeesDto
   * @param appointmentRecipients List of attendees.             
   * @param appointmentUnsendableRecipients List of unsendable attendees.             
   * @param notAllowPropose Value indicating whether attendees are not allowed to propose a new date and/or time for the meeting.             
   * @param responseRequested Value indicating whether a response is requested to a Message object.             
   */
  public MapiCalendarAttendeesDto(
    List<MapiRecipientDto> appointmentRecipients,
    List<MapiRecipientDto> appointmentUnsendableRecipients,
    Boolean notAllowPropose,
    Boolean responseRequested
  ) {
    super();
    setAppointmentRecipients(appointmentRecipients);
    setAppointmentUnsendableRecipients(appointmentUnsendableRecipients);
    setNotAllowPropose(notAllowPropose);
    setResponseRequested(responseRequested);
  }

}

