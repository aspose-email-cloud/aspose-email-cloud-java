/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiCalendarTimeZoneRuleDto.java">
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
 * Represents time zone rule that indicate when to begin using the Standard/Daylight time.             
 */
public class MapiCalendarTimeZoneRuleDto {
  @JsonProperty("date")
  private Date date = null;

  @JsonProperty("dayOfWeek")
  private String dayOfWeek = null;

  @JsonProperty("hour")
  private Integer hour = null;

  @JsonProperty("milliseconds")
  private Integer milliseconds = null;

  @JsonProperty("minute")
  private Integer minute = null;

  @JsonProperty("month")
  private Integer month = null;

  @JsonProperty("position")
  private String position = null;

  @JsonProperty("seconds")
  private Integer seconds = null;

  @JsonProperty("year")
  private Integer year = null;

  /**
   * Set date and return this.
   * @param date Date and time that indicate when to begin using the Standard/Daylight time.             
   * @return this
  **/
  public MapiCalendarTimeZoneRuleDto date(Date date) {
    this.date = date;
    return this;
  }

  /**
   * Date and time that indicate when to begin using the Standard/Daylight time.             
   * @return date
  **/
  public Date getDate() {
    return date;
  }  

  /**
   * Set date.
   * @param date Date and time that indicate when to begin using the Standard/Daylight time.             
  **/
  public void setDate(Date date) {
    this.date = date;
  }

  /**
   * Set dayOfWeek and return this.
   * @param dayOfWeek Day of week. Enum, available values: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
   * @return this
  **/
  public MapiCalendarTimeZoneRuleDto dayOfWeek(String dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

  /**
   * Day of week. Enum, available values: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
   * @return dayOfWeek
  **/
  public String getDayOfWeek() {
    return dayOfWeek;
  }  

  /**
   * Set dayOfWeek.
   * @param dayOfWeek Day of week. Enum, available values: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
  **/
  public void setDayOfWeek(String dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  /**
   * Set hour and return this.
   * @param hour Hour.             
   * @return this
  **/
  public MapiCalendarTimeZoneRuleDto hour(Integer hour) {
    this.hour = hour;
    return this;
  }

  /**
   * Hour.             
   * @return hour
  **/
  public Integer getHour() {
    return hour;
  }  

  /**
   * Set hour.
   * @param hour Hour.             
  **/
  public void setHour(Integer hour) {
    this.hour = hour;
  }

  /**
   * Set milliseconds and return this.
   * @param milliseconds Milliseconds.             
   * @return this
  **/
  public MapiCalendarTimeZoneRuleDto milliseconds(Integer milliseconds) {
    this.milliseconds = milliseconds;
    return this;
  }

  /**
   * Milliseconds.             
   * @return milliseconds
  **/
  public Integer getMilliseconds() {
    return milliseconds;
  }  

  /**
   * Set milliseconds.
   * @param milliseconds Milliseconds.             
  **/
  public void setMilliseconds(Integer milliseconds) {
    this.milliseconds = milliseconds;
  }

  /**
   * Set minute and return this.
   * @param minute Minute.             
   * @return this
  **/
  public MapiCalendarTimeZoneRuleDto minute(Integer minute) {
    this.minute = minute;
    return this;
  }

  /**
   * Minute.             
   * @return minute
  **/
  public Integer getMinute() {
    return minute;
  }  

  /**
   * Set minute.
   * @param minute Minute.             
  **/
  public void setMinute(Integer minute) {
    this.minute = minute;
  }

  /**
   * Set month and return this.
   * @param month Month.             
   * @return this
  **/
  public MapiCalendarTimeZoneRuleDto month(Integer month) {
    this.month = month;
    return this;
  }

  /**
   * Month.             
   * @return month
  **/
  public Integer getMonth() {
    return month;
  }  

  /**
   * Set month.
   * @param month Month.             
  **/
  public void setMonth(Integer month) {
    this.month = month;
  }

  /**
   * Set position and return this.
   * @param position Day positions, typically found in a month. Enum, available values: None, First, Second, Third, Fourth, Last
   * @return this
  **/
  public MapiCalendarTimeZoneRuleDto position(String position) {
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

  /**
   * Set seconds and return this.
   * @param seconds Seconds.             
   * @return this
  **/
  public MapiCalendarTimeZoneRuleDto seconds(Integer seconds) {
    this.seconds = seconds;
    return this;
  }

  /**
   * Seconds.             
   * @return seconds
  **/
  public Integer getSeconds() {
    return seconds;
  }  

  /**
   * Set seconds.
   * @param seconds Seconds.             
  **/
  public void setSeconds(Integer seconds) {
    this.seconds = seconds;
  }

  /**
   * Set year and return this.
   * @param year Year.             
   * @return this
  **/
  public MapiCalendarTimeZoneRuleDto year(Integer year) {
    this.year = year;
    return this;
  }

  /**
   * Year.             
   * @return year
  **/
  public Integer getYear() {
    return year;
  }  

  /**
   * Set year.
   * @param year Year.             
  **/
  public void setYear(Integer year) {
    this.year = year;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    MapiCalendarTimeZoneRuleDto mapiCalendarTimeZoneRuleDto = (MapiCalendarTimeZoneRuleDto) o;
    return ObjectUtils.equals(this.date, mapiCalendarTimeZoneRuleDto.date) &&
    ObjectUtils.equals(this.dayOfWeek, mapiCalendarTimeZoneRuleDto.dayOfWeek) &&
    ObjectUtils.equals(this.hour, mapiCalendarTimeZoneRuleDto.hour) &&
    ObjectUtils.equals(this.milliseconds, mapiCalendarTimeZoneRuleDto.milliseconds) &&
    ObjectUtils.equals(this.minute, mapiCalendarTimeZoneRuleDto.minute) &&
    ObjectUtils.equals(this.month, mapiCalendarTimeZoneRuleDto.month) &&
    ObjectUtils.equals(this.position, mapiCalendarTimeZoneRuleDto.position) &&
    ObjectUtils.equals(this.seconds, mapiCalendarTimeZoneRuleDto.seconds) &&
    ObjectUtils.equals(this.year, mapiCalendarTimeZoneRuleDto.year);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(date, dayOfWeek, hour, milliseconds, minute, month, position, seconds, year);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapiCalendarTimeZoneRuleDto {\n");
    
    sb.append("    date: ").append(toIndentedString(getDate())).append("\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(getDayOfWeek())).append("\n");
    sb.append("    hour: ").append(toIndentedString(getHour())).append("\n");
    sb.append("    milliseconds: ").append(toIndentedString(getMilliseconds())).append("\n");
    sb.append("    minute: ").append(toIndentedString(getMinute())).append("\n");
    sb.append("    month: ").append(toIndentedString(getMonth())).append("\n");
    sb.append("    position: ").append(toIndentedString(getPosition())).append("\n");
    sb.append("    seconds: ").append(toIndentedString(getSeconds())).append("\n");
    sb.append("    year: ").append(toIndentedString(getYear())).append("\n");
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

  public MapiCalendarTimeZoneRuleDto() {
    super();
  }

  /**
   * Initializes a new instance of the MapiCalendarTimeZoneRuleDto
   * @param date Date and time that indicate when to begin using the Standard/Daylight time.             
   * @param dayOfWeek Day of week. Enum, available values: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
   * @param hour Hour.             
   * @param milliseconds Milliseconds.             
   * @param minute Minute.             
   * @param month Month.             
   * @param position Day positions, typically found in a month. Enum, available values: None, First, Second, Third, Fourth, Last
   * @param seconds Seconds.             
   * @param year Year.             
   */
  public MapiCalendarTimeZoneRuleDto(Date date, String dayOfWeek, Integer hour, Integer milliseconds, Integer minute, Integer month, String position, Integer seconds, Integer year) {
    super();
    setDate(date);
    setDayOfWeek(dayOfWeek);
    setHour(hour);
    setMilliseconds(milliseconds);
    setMinute(minute);
    setMonth(month);
    setPosition(position);
    setSeconds(seconds);
    setYear(year);
  }

}

