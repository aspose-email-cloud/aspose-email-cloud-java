/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiCalendarEventRecurrenceDto.java">
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
 * Recurrence properties of calendar object.             
 */
public class MapiCalendarEventRecurrenceDto {
  @JsonProperty("appointmentTimeZoneDefinitionRecur")
  private MapiCalendarTimeZoneDto appointmentTimeZoneDefinitionRecur = null;
  @JsonProperty("clipEnd")
  private Date clipEnd = null;
  @JsonProperty("clipStart")
  private Date clipStart = null;
  @JsonProperty("isException")
  private Boolean isException = null;
  @JsonProperty("recurrencePattern")
  private MapiCalendarRecurrencePatternDto recurrencePattern = null;
  @JsonProperty("timeZoneStruct")
  private MapiCalendarTimeZoneDto timeZoneStruct = null;

  /**
   * Set appointmentTimeZoneDefinitionRecur and return this.
   * @param appointmentTimeZoneDefinitionRecur Time zone information that describes how to convert the meeting date and time on a recurring series to and from UTC.             
   * @return this
  **/
  public MapiCalendarEventRecurrenceDto appointmentTimeZoneDefinitionRecur(MapiCalendarTimeZoneDto appointmentTimeZoneDefinitionRecur) {
    this.appointmentTimeZoneDefinitionRecur = appointmentTimeZoneDefinitionRecur;
    return this;
  }

  /**
   * Time zone information that describes how to convert the meeting date and time on a recurring series to and from UTC.             
   * @return appointmentTimeZoneDefinitionRecur
  **/
  public MapiCalendarTimeZoneDto getAppointmentTimeZoneDefinitionRecur() {
    return appointmentTimeZoneDefinitionRecur;
  }  

  /**
   * Set appointmentTimeZoneDefinitionRecur.
   * @param appointmentTimeZoneDefinitionRecur Time zone information that describes how to convert the meeting date and time on a recurring series to and from UTC.             
  **/
  public void setAppointmentTimeZoneDefinitionRecur(MapiCalendarTimeZoneDto appointmentTimeZoneDefinitionRecur) {
    this.appointmentTimeZoneDefinitionRecur = appointmentTimeZoneDefinitionRecur;
  }


  /**
   * Set clipEnd and return this.
   * @param clipEnd Date of the last instance.             
   * @return this
  **/
  public MapiCalendarEventRecurrenceDto clipEnd(Date clipEnd) {
    this.clipEnd = clipEnd;
    return this;
  }

  /**
   * Date of the last instance.             
   * @return clipEnd
  **/
  public Date getClipEnd() {
    return clipEnd;
  }  

  /**
   * Set clipEnd.
   * @param clipEnd Date of the last instance.             
  **/
  public void setClipEnd(Date clipEnd) {
    this.clipEnd = clipEnd;
  }


  /**
   * Set clipStart and return this.
   * @param clipStart Date of the first instance.             
   * @return this
  **/
  public MapiCalendarEventRecurrenceDto clipStart(Date clipStart) {
    this.clipStart = clipStart;
    return this;
  }

  /**
   * Date of the first instance.             
   * @return clipStart
  **/
  public Date getClipStart() {
    return clipStart;
  }  

  /**
   * Set clipStart.
   * @param clipStart Date of the first instance.             
  **/
  public void setClipStart(Date clipStart) {
    this.clipStart = clipStart;
  }


  /**
   * Set isException and return this.
   * @param isException Value indicating whether the object represents an exception.             
   * @return this
  **/
  public MapiCalendarEventRecurrenceDto isException(Boolean isException) {
    this.isException = isException;
    return this;
  }

  /**
   * Value indicating whether the object represents an exception.             
   * @return isException
  **/
  public Boolean isIsException() {
    return isException;
  }  

  /**
   * Set isException.
   * @param isException Value indicating whether the object represents an exception.             
  **/
  public void setIsException(Boolean isException) {
    this.isException = isException;
  }


  /**
   * Set recurrencePattern and return this.
   * @param recurrencePattern Recurrence pattern.             
   * @return this
  **/
  public MapiCalendarEventRecurrenceDto recurrencePattern(MapiCalendarRecurrencePatternDto recurrencePattern) {
    this.recurrencePattern = recurrencePattern;
    return this;
  }

  /**
   * Recurrence pattern.             
   * @return recurrencePattern
  **/
  public MapiCalendarRecurrencePatternDto getRecurrencePattern() {
    return recurrencePattern;
  }  

  /**
   * Set recurrencePattern.
   * @param recurrencePattern Recurrence pattern.             
  **/
  public void setRecurrencePattern(MapiCalendarRecurrencePatternDto recurrencePattern) {
    this.recurrencePattern = recurrencePattern;
  }


  /**
   * Set timeZoneStruct and return this.
   * @param timeZoneStruct Time zone information for a recurring meeting.             
   * @return this
  **/
  public MapiCalendarEventRecurrenceDto timeZoneStruct(MapiCalendarTimeZoneDto timeZoneStruct) {
    this.timeZoneStruct = timeZoneStruct;
    return this;
  }

  /**
   * Time zone information for a recurring meeting.             
   * @return timeZoneStruct
  **/
  public MapiCalendarTimeZoneDto getTimeZoneStruct() {
    return timeZoneStruct;
  }  

  /**
   * Set timeZoneStruct.
   * @param timeZoneStruct Time zone information for a recurring meeting.             
  **/
  public void setTimeZoneStruct(MapiCalendarTimeZoneDto timeZoneStruct) {
    this.timeZoneStruct = timeZoneStruct;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    MapiCalendarEventRecurrenceDto mapiCalendarEventRecurrenceDto = (MapiCalendarEventRecurrenceDto) o;
    return ObjectUtils.equals(this.appointmentTimeZoneDefinitionRecur, mapiCalendarEventRecurrenceDto.appointmentTimeZoneDefinitionRecur) &&
    ObjectUtils.equals(this.clipEnd, mapiCalendarEventRecurrenceDto.clipEnd) &&
    ObjectUtils.equals(this.clipStart, mapiCalendarEventRecurrenceDto.clipStart) &&
    ObjectUtils.equals(this.isException, mapiCalendarEventRecurrenceDto.isException) &&
    ObjectUtils.equals(this.recurrencePattern, mapiCalendarEventRecurrenceDto.recurrencePattern) &&
    ObjectUtils.equals(this.timeZoneStruct, mapiCalendarEventRecurrenceDto.timeZoneStruct);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(appointmentTimeZoneDefinitionRecur, clipEnd, clipStart, isException, recurrencePattern, timeZoneStruct);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapiCalendarEventRecurrenceDto {\n");
    
    sb.append("    appointmentTimeZoneDefinitionRecur: ").append(toIndentedString(getAppointmentTimeZoneDefinitionRecur())).append("\n");
    sb.append("    clipEnd: ").append(toIndentedString(getClipEnd())).append("\n");
    sb.append("    clipStart: ").append(toIndentedString(getClipStart())).append("\n");
    sb.append("    isException: ").append(toIndentedString(isIsException())).append("\n");
    sb.append("    recurrencePattern: ").append(toIndentedString(getRecurrencePattern())).append("\n");
    sb.append("    timeZoneStruct: ").append(toIndentedString(getTimeZoneStruct())).append("\n");
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

  public MapiCalendarEventRecurrenceDto() {
    super();
  }

  /**
   * Initializes a new instance of the MapiCalendarEventRecurrenceDto
   * @param appointmentTimeZoneDefinitionRecur Time zone information that describes how to convert the meeting date and time on a recurring series to and from UTC.             
   * @param clipEnd Date of the last instance.             
   * @param clipStart Date of the first instance.             
   * @param isException Value indicating whether the object represents an exception.             
   * @param recurrencePattern Recurrence pattern.             
   * @param timeZoneStruct Time zone information for a recurring meeting.             
   */
  public MapiCalendarEventRecurrenceDto(
    MapiCalendarTimeZoneDto appointmentTimeZoneDefinitionRecur,
    Date clipEnd,
    Date clipStart,
    Boolean isException,
    MapiCalendarRecurrencePatternDto recurrencePattern,
    MapiCalendarTimeZoneDto timeZoneStruct
  ) {
    super();
    setAppointmentTimeZoneDefinitionRecur(appointmentTimeZoneDefinitionRecur);
    setClipEnd(clipEnd);
    setClipStart(clipStart);
    setIsException(isException);
    setRecurrencePattern(recurrencePattern);
    setTimeZoneStruct(timeZoneStruct);
  }

}

