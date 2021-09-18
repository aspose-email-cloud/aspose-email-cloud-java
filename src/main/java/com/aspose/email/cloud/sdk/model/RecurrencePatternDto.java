/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="RecurrencePatternDto.java">
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
 * iCalendar recurrence pattern.             
 */
public class RecurrencePatternDto {
  @JsonProperty("interval")
  private Integer interval = null;
  @JsonProperty("occurs")
  private Integer occurs = null;
  @JsonProperty("endDate")
  private Date endDate = null;
  @JsonProperty("weekStart")
  private String weekStart = null;
  @JsonProperty("discriminator")
  private String discriminator = this.getClass().getSimpleName();

  /**
   * Set interval and return this.
   * @param interval Number of recurrence units.             
   * @return this
  **/
  public RecurrencePatternDto interval(Integer interval) {
    this.interval = interval;
    return this;
  }

  /**
   * Number of recurrence units.             
   * @return interval
  **/
  public Integer getInterval() {
    return interval;
  }  

  /**
   * Set interval.
   * @param interval Number of recurrence units.             
  **/
  public void setInterval(Integer interval) {
    this.interval = interval;
  }


  /**
   * Set occurs and return this.
   * @param occurs Number of occurrences of the recurrence pattern.             
   * @return this
  **/
  public RecurrencePatternDto occurs(Integer occurs) {
    this.occurs = occurs;
    return this;
  }

  /**
   * Number of occurrences of the recurrence pattern.             
   * @return occurs
  **/
  public Integer getOccurs() {
    return occurs;
  }  

  /**
   * Set occurs.
   * @param occurs Number of occurrences of the recurrence pattern.             
  **/
  public void setOccurs(Integer occurs) {
    this.occurs = occurs;
  }


  /**
   * Set endDate and return this.
   * @param endDate End date.             
   * @return this
  **/
  public RecurrencePatternDto endDate(Date endDate) {
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
   * Set weekStart and return this.
   * @param weekStart Represents the day of the week./nEnum, available values: None, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday, Day, WeekDay, WeekendDay
   * @return this
  **/
  public RecurrencePatternDto weekStart(String weekStart) {
    this.weekStart = weekStart;
    return this;
  }

  /**
   * Represents the day of the week./nEnum, available values: None, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday, Day, WeekDay, WeekendDay
   * @return weekStart
  **/
  public String getWeekStart() {
    return weekStart;
  }  

  /**
   * Set weekStart.
   * @param weekStart Represents the day of the week./nEnum, available values: None, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday, Day, WeekDay, WeekendDay
  **/
  public void setWeekStart(String weekStart) {
    this.weekStart = weekStart;
  }



  /**
   * Get discriminator
   * @return discriminator
  **/
  public String getDiscriminator() {
    return discriminator;
  }  

  /**
   * Set discriminator.
   * @param discriminator 
  **/
  public void setDiscriminator(String discriminator) {
    //do nothing
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    RecurrencePatternDto recurrencePatternDto = (RecurrencePatternDto) o;
    return ObjectUtils.equals(this.interval, recurrencePatternDto.interval) &&
    ObjectUtils.equals(this.occurs, recurrencePatternDto.occurs) &&
    ObjectUtils.equals(this.endDate, recurrencePatternDto.endDate) &&
    ObjectUtils.equals(this.weekStart, recurrencePatternDto.weekStart) &&
    ObjectUtils.equals(this.discriminator, recurrencePatternDto.discriminator);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(interval, occurs, endDate, weekStart, discriminator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurrencePatternDto {\n");
    
    sb.append("    interval: ").append(toIndentedString(getInterval())).append("\n");
    sb.append("    occurs: ").append(toIndentedString(getOccurs())).append("\n");
    sb.append("    endDate: ").append(toIndentedString(getEndDate())).append("\n");
    sb.append("    weekStart: ").append(toIndentedString(getWeekStart())).append("\n");
    sb.append("    discriminator: ").append(toIndentedString(getDiscriminator())).append("\n");
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

  public RecurrencePatternDto() {
    super();
  }

  /**
   * Initializes a new instance of the RecurrencePatternDto
   * @param interval Number of recurrence units.             
   * @param occurs Number of occurrences of the recurrence pattern.             
   * @param endDate End date.             
   * @param weekStart Represents the day of the week./nEnum, available values: None, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday, Day, WeekDay, WeekendDay
   */
  public RecurrencePatternDto(
    Integer interval,
    Integer occurs,
    Date endDate,
    String weekStart
    
  ) {
    super();
    setInterval(interval);
    setOccurs(occurs);
    setEndDate(endDate);
    setWeekStart(weekStart);
  }

}

