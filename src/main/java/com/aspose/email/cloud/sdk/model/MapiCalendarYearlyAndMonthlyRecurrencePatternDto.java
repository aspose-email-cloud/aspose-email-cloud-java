/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiCalendarYearlyAndMonthlyRecurrencePatternDto.java">
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
 * Represents the yearly and monthly recurrence pattern of the mapi calendar             
 */
public class MapiCalendarYearlyAndMonthlyRecurrencePatternDto extends MapiCalendarRecurrencePatternDto {
  @JsonProperty("day")
  private Integer day = null;

  @JsonProperty("dayOfWeek")
  private List<String> dayOfWeek = null;

  @JsonProperty("position")
  private String position = null;

  /**
   * Set day and return this.
   * @param day Day of the month on which the recurrence falls.             
   * @return this
  **/
  public MapiCalendarYearlyAndMonthlyRecurrencePatternDto day(Integer day) {
    this.day = day;
    return this;
  }

  /**
   * Day of the month on which the recurrence falls.             
   * @return day
  **/
  public Integer getDay() {
    return day;
  }  

  /**
   * Set day.
   * @param day Day of the month on which the recurrence falls.             
  **/
  public void setDay(Integer day) {
    this.day = day;
  }

  /**
   * Set dayOfWeek and return this.
   * @param dayOfWeek Days of week at which the event occurs.              Items: Enumerates the days of week of the mapi calendar recurrence pattern Enum, available values: Saturday, Friday, Thursday, Wednesday, Tuesday, Monday, Sunday
   * @return this
  **/
  public MapiCalendarYearlyAndMonthlyRecurrencePatternDto dayOfWeek(List<String> dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }
  /**
   * Add an item to dayOfWeek and return this.
   * @param dayOfWeekItem An item of: Days of week at which the event occurs.             
   * @return this
  **/
  public MapiCalendarYearlyAndMonthlyRecurrencePatternDto addDayOfWeekItem(String dayOfWeekItem) {
    if (this.dayOfWeek == null) {
      this.dayOfWeek = new ArrayList<String>();
    }
    this.dayOfWeek.add(dayOfWeekItem);
    return this;
  }

  /**
   * Days of week at which the event occurs.              Items: Enumerates the days of week of the mapi calendar recurrence pattern Enum, available values: Saturday, Friday, Thursday, Wednesday, Tuesday, Monday, Sunday
   * @return dayOfWeek
  **/
  public List<String> getDayOfWeek() {
    return dayOfWeek;
  }  

  /**
   * Set dayOfWeek.
   * @param dayOfWeek Days of week at which the event occurs.              Items: Enumerates the days of week of the mapi calendar recurrence pattern Enum, available values: Saturday, Friday, Thursday, Wednesday, Tuesday, Monday, Sunday
  **/
  public void setDayOfWeek(List<String> dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  /**
   * Set position and return this.
   * @param position Day positions, typically found in a month. Enum, available values: None, First, Second, Third, Fourth, Last
   * @return this
  **/
  public MapiCalendarYearlyAndMonthlyRecurrencePatternDto position(String position) {
    this.position = position;
    return this;
  }

  /**
   * Day positions, typically found in a month. Enum, available values: None, First, Second, Third, Fourth, Last
   * @return position
  **/
  public String getPosition() {
    return position;
  }  

  /**
   * Set position.
   * @param position Day positions, typically found in a month. Enum, available values: None, First, Second, Third, Fourth, Last
  **/
  public void setPosition(String position) {
    this.position = position;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    MapiCalendarYearlyAndMonthlyRecurrencePatternDto mapiCalendarYearlyAndMonthlyRecurrencePatternDto = (MapiCalendarYearlyAndMonthlyRecurrencePatternDto) o;
    return ObjectUtils.equals(this.day, mapiCalendarYearlyAndMonthlyRecurrencePatternDto.day) &&
    ObjectUtils.equals(this.dayOfWeek, mapiCalendarYearlyAndMonthlyRecurrencePatternDto.dayOfWeek) &&
    ObjectUtils.equals(this.position, mapiCalendarYearlyAndMonthlyRecurrencePatternDto.position) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(day, dayOfWeek, position, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapiCalendarYearlyAndMonthlyRecurrencePatternDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    calendarType: ").append(toIndentedString(getCalendarType())).append("\n");
    sb.append("    deletedInstanceDates: ").append(toIndentedString(getDeletedInstanceDates())).append("\n");
    sb.append("    endDate: ").append(toIndentedString(getEndDate())).append("\n");
    sb.append("    endType: ").append(toIndentedString(getEndType())).append("\n");
    sb.append("    exceptions: ").append(toIndentedString(getExceptions())).append("\n");
    sb.append("    frequency: ").append(toIndentedString(getFrequency())).append("\n");
    sb.append("    modifiedInstanceDates: ").append(toIndentedString(getModifiedInstanceDates())).append("\n");
    sb.append("    occurrenceCount: ").append(toIndentedString(getOccurrenceCount())).append("\n");
    sb.append("    patternType: ").append(toIndentedString(getPatternType())).append("\n");
    sb.append("    period: ").append(toIndentedString(getPeriod())).append("\n");
    sb.append("    slidingFlag: ").append(toIndentedString(isSlidingFlag())).append("\n");
    sb.append("    startDate: ").append(toIndentedString(getStartDate())).append("\n");
    sb.append("    weekStartDay: ").append(toIndentedString(getWeekStartDay())).append("\n");
    sb.append("    discriminator: ").append(toIndentedString(getDiscriminator())).append("\n");
    sb.append("    day: ").append(toIndentedString(getDay())).append("\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(getDayOfWeek())).append("\n");
    sb.append("    position: ").append(toIndentedString(getPosition())).append("\n");
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

  public MapiCalendarYearlyAndMonthlyRecurrencePatternDto() {
    super();
  }

  /**
   * Initializes a new instance of the MapiCalendarYearlyAndMonthlyRecurrencePatternDto
   * @param calendarType Enumerated the calendar type of the mapi recurrence Enum, available values: Default, CalGregorian, CalGregorianUs, CalJapan, CalTaiwan, CalKorea, CalHijri, CalThai, CalHebrew, CalGregorianMeFrench, CalGregorianArabic, CalGregorianXLitEnglish, CalGregorianXLitFrench, CalLunarJapanese, CalChineseLunar, CalSaka, CalLunarEtoChn, CalLunarEtoKor, CalLunarRokuyou, CalLunarKorean, CalUmAlQura
   * @param deletedInstanceDates An array of dates, each of which is the original instance date of either a deleted instance or a modified instance for this recurrence.             
   * @param endDate End date of an item recurrence pattern.             
   * @param endType Enumerates the ending type for the recurrence. Enum, available values: None, EndAfterDate, EndAfterNOccurrences, NeverEnd
   * @param exceptions An exception specifies changes to an instance of a recurring series.             
   * @param frequency Enumerates mapi calendar recurrence frequency Enum, available values: None, Daily, Weekly, Monthly, Yearly
   * @param modifiedInstanceDates An array of dates, each of which is the date of a modified instance.             
   * @param occurrenceCount Number of occurrences in a recurrence.             
   * @param patternType Enumerates the mapi calendar recurrence pattern types Enum, available values: Day, Week, Month, MonthEnd, MonthNth, HjMonth, HjMonthNth, HjMonthEnd
   * @param period Interval at which the meeting pattern repeats.             
   * @param slidingFlag Defines whether pattern is sliding or not.             
   * @param startDate Start date of an item recurrence pattern.             
   * @param weekStartDay First day of the calendar week.             
   * @param discriminator 
   * @param day Day of the month on which the recurrence falls.             
   * @param dayOfWeek Days of week at which the event occurs.              Items: Enumerates the days of week of the mapi calendar recurrence pattern Enum, available values: Saturday, Friday, Thursday, Wednesday, Tuesday, Monday, Sunday
   * @param position Day positions, typically found in a month. Enum, available values: None, First, Second, Third, Fourth, Last
   */
  public MapiCalendarYearlyAndMonthlyRecurrencePatternDto(String calendarType, List<Date> deletedInstanceDates, Date endDate, String endType, List<MapiCalendarExceptionInfoDto> exceptions, String frequency, List<Date> modifiedInstanceDates, Long occurrenceCount, String patternType, Long period, Boolean slidingFlag, Date startDate, Object weekStartDay, String discriminator, Integer day, List<String> dayOfWeek, String position) {
    super();
    setCalendarType(calendarType);
    setDeletedInstanceDates(deletedInstanceDates);
    setEndDate(endDate);
    setEndType(endType);
    setExceptions(exceptions);
    setFrequency(frequency);
    setModifiedInstanceDates(modifiedInstanceDates);
    setOccurrenceCount(occurrenceCount);
    setPatternType(patternType);
    setPeriod(period);
    setSlidingFlag(slidingFlag);
    setStartDate(startDate);
    setWeekStartDay(weekStartDay);
    setDiscriminator(discriminator);
    setDay(day);
    setDayOfWeek(dayOfWeek);
    setPosition(position);
  }

}

