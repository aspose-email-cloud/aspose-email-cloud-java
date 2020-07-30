/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="YearlyRecurrencePatternDto.java">
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
 * Yearly recurrence pattern.             
 */
public class YearlyRecurrencePatternDto extends RecurrencePatternDto {
  @JsonProperty("startDay")
  private String startDay = null;

  @JsonProperty("startMonth")
  private String startMonth = null;

  @JsonProperty("startOffset")
  private Integer startOffset = null;

  @JsonProperty("startPosition")
  private String startPosition = null;

  /**
   * Set startDay and return this.
   * @param startDay Represents the day of the week. Enum, available values: None, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday, Day, WeekDay, WeekendDay
   * @return this
  **/
  public YearlyRecurrencePatternDto startDay(String startDay) {
    this.startDay = startDay;
    return this;
  }

  /**
   * Represents the day of the week. Enum, available values: None, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday, Day, WeekDay, WeekendDay
   * @return startDay
  **/
  public String getStartDay() {
    return startDay;
  }  

  /**
   * Set startDay.
   * @param startDay Represents the day of the week. Enum, available values: None, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday, Day, WeekDay, WeekendDay
  **/
  public void setStartDay(String startDay) {
    this.startDay = startDay;
  }

  /**
   * Set startMonth and return this.
   * @param startMonth Represents a calendar month. Enum, available values: None, January, February, March, April, May, June, July, August, September, October, November, December
   * @return this
  **/
  public YearlyRecurrencePatternDto startMonth(String startMonth) {
    this.startMonth = startMonth;
    return this;
  }

  /**
   * Represents a calendar month. Enum, available values: None, January, February, March, April, May, June, July, August, September, October, November, December
   * @return startMonth
  **/
  public String getStartMonth() {
    return startMonth;
  }  

  /**
   * Set startMonth.
   * @param startMonth Represents a calendar month. Enum, available values: None, January, February, March, April, May, June, July, August, September, October, November, December
  **/
  public void setStartMonth(String startMonth) {
    this.startMonth = startMonth;
  }

  /**
   * Set startOffset and return this.
   * @param startOffset Start offset.             
   * @return this
  **/
  public YearlyRecurrencePatternDto startOffset(Integer startOffset) {
    this.startOffset = startOffset;
    return this;
  }

  /**
   * Start offset.             
   * @return startOffset
  **/
  public Integer getStartOffset() {
    return startOffset;
  }  

  /**
   * Set startOffset.
   * @param startOffset Start offset.             
  **/
  public void setStartOffset(Integer startOffset) {
    this.startOffset = startOffset;
  }

  /**
   * Set startPosition and return this.
   * @param startPosition Day positions, typically found in a month. Enum, available values: None, First, Second, Third, Fourth, Last
   * @return this
  **/
  public YearlyRecurrencePatternDto startPosition(String startPosition) {
    this.startPosition = startPosition;
    return this;
  }

  /**
   * Day positions, typically found in a month. Enum, available values: None, First, Second, Third, Fourth, Last
   * @return startPosition
  **/
  public String getStartPosition() {
    return startPosition;
  }  

  /**
   * Set startPosition.
   * @param startPosition Day positions, typically found in a month. Enum, available values: None, First, Second, Third, Fourth, Last
  **/
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    YearlyRecurrencePatternDto yearlyRecurrencePatternDto = (YearlyRecurrencePatternDto) o;
    return ObjectUtils.equals(this.startDay, yearlyRecurrencePatternDto.startDay) &&
    ObjectUtils.equals(this.startMonth, yearlyRecurrencePatternDto.startMonth) &&
    ObjectUtils.equals(this.startOffset, yearlyRecurrencePatternDto.startOffset) &&
    ObjectUtils.equals(this.startPosition, yearlyRecurrencePatternDto.startPosition) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(startDay, startMonth, startOffset, startPosition, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class YearlyRecurrencePatternDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    interval: ").append(toIndentedString(getInterval())).append("\n");
    sb.append("    occurs: ").append(toIndentedString(getOccurs())).append("\n");
    sb.append("    endDate: ").append(toIndentedString(getEndDate())).append("\n");
    sb.append("    weekStart: ").append(toIndentedString(getWeekStart())).append("\n");
    sb.append("    discriminator: ").append(toIndentedString(getDiscriminator())).append("\n");
    sb.append("    startDay: ").append(toIndentedString(getStartDay())).append("\n");
    sb.append("    startMonth: ").append(toIndentedString(getStartMonth())).append("\n");
    sb.append("    startOffset: ").append(toIndentedString(getStartOffset())).append("\n");
    sb.append("    startPosition: ").append(toIndentedString(getStartPosition())).append("\n");
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

  public YearlyRecurrencePatternDto() {
    super();
  }

  /**
   * Initializes a new instance of the YearlyRecurrencePatternDto
   * @param interval Number of recurrence units.             
   * @param occurs Number of occurrences of the recurrence pattern.             
   * @param endDate End date.             
   * @param weekStart Represents the day of the week. Enum, available values: None, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday, Day, WeekDay, WeekendDay
   * @param startDay Represents the day of the week. Enum, available values: None, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday, Day, WeekDay, WeekendDay
   * @param startMonth Represents a calendar month. Enum, available values: None, January, February, March, April, May, June, July, August, September, October, November, December
   * @param startOffset Start offset.             
   * @param startPosition Day positions, typically found in a month. Enum, available values: None, First, Second, Third, Fourth, Last
   */
  public YearlyRecurrencePatternDto(
    Integer interval,
    Integer occurs,
    Date endDate,
    String weekStart
    ,
    String startDay,
    String startMonth,
    Integer startOffset,
    String startPosition
  ) {
    super();
    setInterval(interval);
    setOccurs(occurs);
    setEndDate(endDate);
    setWeekStart(weekStart);
    setStartDay(startDay);
    setStartMonth(startMonth);
    setStartOffset(startOffset);
    setStartPosition(startPosition);
  }

}

