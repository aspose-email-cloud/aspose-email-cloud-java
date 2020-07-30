/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ReminderTrigger.java">
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
 * Specifies when an alarm will trigger.
 */
public class ReminderTrigger {
  @JsonProperty("dateTime")
  private Date dateTime = null;

  @JsonProperty("duration")
  private Long duration = null;

  @JsonProperty("related")
  private String related = null;

  /**
   * Set dateTime and return this.
   * @param dateTime A trigger set to an absolute date/time.
   * @return this
  **/
  public ReminderTrigger dateTime(Date dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * A trigger set to an absolute date/time.
   * @return dateTime
  **/
  public Date getDateTime() {
    return dateTime;
  }  

  /**
   * Set dateTime.
   * @param dateTime A trigger set to an absolute date/time.
  **/
  public void setDateTime(Date dateTime) {
    this.dateTime = dateTime;
  }

  /**
   * Set duration and return this.
   * @param duration Specifies a relative time in ticks for the trigger of the alarm.             
   * @return this
  **/
  public ReminderTrigger duration(Long duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Specifies a relative time in ticks for the trigger of the alarm.             
   * @return duration
  **/
  public Long getDuration() {
    return duration;
  }  

  /**
   * Set duration.
   * @param duration Specifies a relative time in ticks for the trigger of the alarm.             
  **/
  public void setDuration(Long duration) {
    this.duration = duration;
  }

  /**
   * Set related and return this.
   * @param related Specify the relationship of the alarm trigger with respect to the start or end of the event. Enum, available values: Start, End
   * @return this
  **/
  public ReminderTrigger related(String related) {
    this.related = related;
    return this;
  }

  /**
   * Specify the relationship of the alarm trigger with respect to the start or end of the event. Enum, available values: Start, End
   * @return related
  **/
  public String getRelated() {
    return related;
  }  

  /**
   * Set related.
   * @param related Specify the relationship of the alarm trigger with respect to the start or end of the event. Enum, available values: Start, End
  **/
  public void setRelated(String related) {
    this.related = related;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    ReminderTrigger reminderTrigger = (ReminderTrigger) o;
    return ObjectUtils.equals(this.dateTime, reminderTrigger.dateTime) &&
    ObjectUtils.equals(this.duration, reminderTrigger.duration) &&
    ObjectUtils.equals(this.related, reminderTrigger.related);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(dateTime, duration, related);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReminderTrigger {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(getDateTime())).append("\n");
    sb.append("    duration: ").append(toIndentedString(getDuration())).append("\n");
    sb.append("    related: ").append(toIndentedString(getRelated())).append("\n");
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

  public ReminderTrigger() {
    super();
  }

  /**
   * Initializes a new instance of the ReminderTrigger
   * @param dateTime A trigger set to an absolute date/time.
   * @param duration Specifies a relative time in ticks for the trigger of the alarm.             
   * @param related Specify the relationship of the alarm trigger with respect to the start or end of the event. Enum, available values: Start, End
   */
  public ReminderTrigger(
    Date dateTime,
    Long duration,
    String related
  ) {
    super();
    setDateTime(dateTime);
    setDuration(duration);
    setRelated(related);
  }

}

