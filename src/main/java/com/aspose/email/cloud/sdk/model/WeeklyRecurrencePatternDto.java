/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="WeeklyRecurrencePatternDto.java">
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
 * Weekly recurrence pattern.             
 */
public class WeeklyRecurrencePatternDto extends RecurrencePatternDto {
  @JsonProperty("startDays")
  private List<String> startDays = null;

  /**
   * Set startDays and return this.
   * @param startDays Start days              Items: Represents the day of the week. Enum, available values: None, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday, Day, WeekDay, WeekendDay
   * @return this
  **/
  public WeeklyRecurrencePatternDto startDays(List<String> startDays) {
    this.startDays = startDays;
    return this;
  }
  /**
   * Add an item to startDays and return this.
   * @param startDaysItem An item of: Start days             
   * @return this
  **/
  public WeeklyRecurrencePatternDto addStartDaysItem(String startDaysItem) {
    if (this.startDays == null) {
      this.startDays = new ArrayList<String>();
    }
    this.startDays.add(startDaysItem);
    return this;
  }

  /**
   * Start days              Items: Represents the day of the week. Enum, available values: None, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday, Day, WeekDay, WeekendDay
   * @return startDays
  **/
  public List<String> getStartDays() {
    return startDays;
  }  

  /**
   * Set startDays.
   * @param startDays Start days              Items: Represents the day of the week. Enum, available values: None, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday, Day, WeekDay, WeekendDay
  **/
  public void setStartDays(List<String> startDays) {
    this.startDays = startDays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    WeeklyRecurrencePatternDto weeklyRecurrencePatternDto = (WeeklyRecurrencePatternDto) o;
    return ObjectUtils.equals(this.startDays, weeklyRecurrencePatternDto.startDays) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(startDays, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeeklyRecurrencePatternDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    interval: ").append(toIndentedString(getInterval())).append("\n");
    sb.append("    occurs: ").append(toIndentedString(getOccurs())).append("\n");
    sb.append("    endDate: ").append(toIndentedString(getEndDate())).append("\n");
    sb.append("    weekStart: ").append(toIndentedString(getWeekStart())).append("\n");
    sb.append("    discriminator: ").append(toIndentedString(getDiscriminator())).append("\n");
    sb.append("    startDays: ").append(toIndentedString(getStartDays())).append("\n");
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

  public WeeklyRecurrencePatternDto() {
    super();
  }

  /**
   * Initializes a new instance of the WeeklyRecurrencePatternDto
   * @param interval Number of recurrence units.             
   * @param occurs Number of occurrences of the recurrence pattern.             
   * @param endDate End date.             
   * @param weekStart Represents the day of the week. Enum, available values: None, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday, Day, WeekDay, WeekendDay
   * @param startDays Start days              Items: Represents the day of the week. Enum, available values: None, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday, Day, WeekDay, WeekendDay
   */
  public WeeklyRecurrencePatternDto(
    Integer interval,
    Integer occurs,
    Date endDate,
    String weekStart/*,
    String discriminator*/,
    List<String> startDays
  ) {
    super();
    setInterval(interval);
    setOccurs(occurs);
    setEndDate(endDate);
    setWeekStart(weekStart);
    setStartDays(startDays);
  }

}

