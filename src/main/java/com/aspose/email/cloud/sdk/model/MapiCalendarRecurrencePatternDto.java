/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiCalendarRecurrencePatternDto.java">
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
 * Mapi recurrence pattern.             
 */
public class MapiCalendarRecurrencePatternDto {
  @JsonProperty("calendarType")
  private String calendarType = null;

  @JsonProperty("deletedInstanceDates")
  private List<Date> deletedInstanceDates = null;

  @JsonProperty("endDate")
  private Date endDate = null;

  @JsonProperty("endType")
  private String endType = null;

  @JsonProperty("exceptions")
  private List<MapiCalendarExceptionInfoDto> exceptions = null;

  @JsonProperty("frequency")
  private String frequency = null;

  @JsonProperty("modifiedInstanceDates")
  private List<Date> modifiedInstanceDates = null;

  @JsonProperty("occurrenceCount")
  private Long occurrenceCount = null;

  @JsonProperty("patternType")
  private String patternType = null;

  @JsonProperty("period")
  private Long period = null;

  @JsonProperty("slidingFlag")
  private Boolean slidingFlag = null;

  @JsonProperty("startDate")
  private Date startDate = null;

  @JsonProperty("weekStartDay")
  private String weekStartDay = null;

  @JsonProperty("discriminator")
  private String discriminator = this.getClass().getSimpleName();

  /**
   * Set calendarType and return this.
   * @param calendarType Enumerated the calendar type of the mapi recurrence Enum, available values: Default, CalGregorian, CalGregorianUs, CalJapan, CalTaiwan, CalKorea, CalHijri, CalThai, CalHebrew, CalGregorianMeFrench, CalGregorianArabic, CalGregorianXLitEnglish, CalGregorianXLitFrench, CalLunarJapanese, CalChineseLunar, CalSaka, CalLunarEtoChn, CalLunarEtoKor, CalLunarRokuyou, CalLunarKorean, CalUmAlQura
   * @return this
  **/
  public MapiCalendarRecurrencePatternDto calendarType(String calendarType) {
    this.calendarType = calendarType;
    return this;
  }

  /**
   * Enumerated the calendar type of the mapi recurrence Enum, available values: Default, CalGregorian, CalGregorianUs, CalJapan, CalTaiwan, CalKorea, CalHijri, CalThai, CalHebrew, CalGregorianMeFrench, CalGregorianArabic, CalGregorianXLitEnglish, CalGregorianXLitFrench, CalLunarJapanese, CalChineseLunar, CalSaka, CalLunarEtoChn, CalLunarEtoKor, CalLunarRokuyou, CalLunarKorean, CalUmAlQura
   * @return calendarType
  **/
  public String getCalendarType() {
    return calendarType;
  }  

  /**
   * Set calendarType.
   * @param calendarType Enumerated the calendar type of the mapi recurrence Enum, available values: Default, CalGregorian, CalGregorianUs, CalJapan, CalTaiwan, CalKorea, CalHijri, CalThai, CalHebrew, CalGregorianMeFrench, CalGregorianArabic, CalGregorianXLitEnglish, CalGregorianXLitFrench, CalLunarJapanese, CalChineseLunar, CalSaka, CalLunarEtoChn, CalLunarEtoKor, CalLunarRokuyou, CalLunarKorean, CalUmAlQura
  **/
  public void setCalendarType(String calendarType) {
    this.calendarType = calendarType;
  }

  /**
   * Set deletedInstanceDates and return this.
   * @param deletedInstanceDates An array of dates, each of which is the original instance date of either a deleted instance or a modified instance for this recurrence.             
   * @return this
  **/
  public MapiCalendarRecurrencePatternDto deletedInstanceDates(List<Date> deletedInstanceDates) {
    this.deletedInstanceDates = deletedInstanceDates;
    return this;
  }
  /**
   * Add an item to deletedInstanceDates and return this.
   * @param deletedInstanceDatesItem An item of: An array of dates, each of which is the original instance date of either a deleted instance or a modified instance for this recurrence.             
   * @return this
  **/
  public MapiCalendarRecurrencePatternDto addDeletedInstanceDatesItem(Date deletedInstanceDatesItem) {
    if (this.deletedInstanceDates == null) {
      this.deletedInstanceDates = new ArrayList<Date>();
    }
    this.deletedInstanceDates.add(deletedInstanceDatesItem);
    return this;
  }

  /**
   * An array of dates, each of which is the original instance date of either a deleted instance or a modified instance for this recurrence.             
   * @return deletedInstanceDates
  **/
  public List<Date> getDeletedInstanceDates() {
    return deletedInstanceDates;
  }  

  /**
   * Set deletedInstanceDates.
   * @param deletedInstanceDates An array of dates, each of which is the original instance date of either a deleted instance or a modified instance for this recurrence.             
  **/
  public void setDeletedInstanceDates(List<Date> deletedInstanceDates) {
    this.deletedInstanceDates = deletedInstanceDates;
  }

  /**
   * Set endDate and return this.
   * @param endDate End date of an item recurrence pattern.             
   * @return this
  **/
  public MapiCalendarRecurrencePatternDto endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * End date of an item recurrence pattern.             
   * @return endDate
  **/
  public Date getEndDate() {
    return endDate;
  }  

  /**
   * Set endDate.
   * @param endDate End date of an item recurrence pattern.             
  **/
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  /**
   * Set endType and return this.
   * @param endType Enumerates the ending type for the recurrence. Enum, available values: None, EndAfterDate, EndAfterNOccurrences, NeverEnd
   * @return this
  **/
  public MapiCalendarRecurrencePatternDto endType(String endType) {
    this.endType = endType;
    return this;
  }

  /**
   * Enumerates the ending type for the recurrence. Enum, available values: None, EndAfterDate, EndAfterNOccurrences, NeverEnd
   * @return endType
  **/
  public String getEndType() {
    return endType;
  }  

  /**
   * Set endType.
   * @param endType Enumerates the ending type for the recurrence. Enum, available values: None, EndAfterDate, EndAfterNOccurrences, NeverEnd
  **/
  public void setEndType(String endType) {
    this.endType = endType;
  }

  /**
   * Set exceptions and return this.
   * @param exceptions An exception specifies changes to an instance of a recurring series.             
   * @return this
  **/
  public MapiCalendarRecurrencePatternDto exceptions(List<MapiCalendarExceptionInfoDto> exceptions) {
    this.exceptions = exceptions;
    return this;
  }
  /**
   * Add an item to exceptions and return this.
   * @param exceptionsItem An item of: An exception specifies changes to an instance of a recurring series.             
   * @return this
  **/
  public MapiCalendarRecurrencePatternDto addExceptionsItem(MapiCalendarExceptionInfoDto exceptionsItem) {
    if (this.exceptions == null) {
      this.exceptions = new ArrayList<MapiCalendarExceptionInfoDto>();
    }
    this.exceptions.add(exceptionsItem);
    return this;
  }

  /**
   * An exception specifies changes to an instance of a recurring series.             
   * @return exceptions
  **/
  public List<MapiCalendarExceptionInfoDto> getExceptions() {
    return exceptions;
  }  

  /**
   * Set exceptions.
   * @param exceptions An exception specifies changes to an instance of a recurring series.             
  **/
  public void setExceptions(List<MapiCalendarExceptionInfoDto> exceptions) {
    this.exceptions = exceptions;
  }

  /**
   * Set frequency and return this.
   * @param frequency Enumerates mapi calendar recurrence frequency Enum, available values: None, Daily, Weekly, Monthly, Yearly
   * @return this
  **/
  public MapiCalendarRecurrencePatternDto frequency(String frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Enumerates mapi calendar recurrence frequency Enum, available values: None, Daily, Weekly, Monthly, Yearly
   * @return frequency
  **/
  public String getFrequency() {
    return frequency;
  }  

  /**
   * Set frequency.
   * @param frequency Enumerates mapi calendar recurrence frequency Enum, available values: None, Daily, Weekly, Monthly, Yearly
  **/
  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }

  /**
   * Set modifiedInstanceDates and return this.
   * @param modifiedInstanceDates An array of dates, each of which is the date of a modified instance.             
   * @return this
  **/
  public MapiCalendarRecurrencePatternDto modifiedInstanceDates(List<Date> modifiedInstanceDates) {
    this.modifiedInstanceDates = modifiedInstanceDates;
    return this;
  }
  /**
   * Add an item to modifiedInstanceDates and return this.
   * @param modifiedInstanceDatesItem An item of: An array of dates, each of which is the date of a modified instance.             
   * @return this
  **/
  public MapiCalendarRecurrencePatternDto addModifiedInstanceDatesItem(Date modifiedInstanceDatesItem) {
    if (this.modifiedInstanceDates == null) {
      this.modifiedInstanceDates = new ArrayList<Date>();
    }
    this.modifiedInstanceDates.add(modifiedInstanceDatesItem);
    return this;
  }

  /**
   * An array of dates, each of which is the date of a modified instance.             
   * @return modifiedInstanceDates
  **/
  public List<Date> getModifiedInstanceDates() {
    return modifiedInstanceDates;
  }  

  /**
   * Set modifiedInstanceDates.
   * @param modifiedInstanceDates An array of dates, each of which is the date of a modified instance.             
  **/
  public void setModifiedInstanceDates(List<Date> modifiedInstanceDates) {
    this.modifiedInstanceDates = modifiedInstanceDates;
  }

  /**
   * Set occurrenceCount and return this.
   * @param occurrenceCount Number of occurrences in a recurrence.             
   * @return this
  **/
  public MapiCalendarRecurrencePatternDto occurrenceCount(Long occurrenceCount) {
    this.occurrenceCount = occurrenceCount;
    return this;
  }

  /**
   * Number of occurrences in a recurrence.             
   * @return occurrenceCount
  **/
  public Long getOccurrenceCount() {
    return occurrenceCount;
  }  

  /**
   * Set occurrenceCount.
   * @param occurrenceCount Number of occurrences in a recurrence.             
  **/
  public void setOccurrenceCount(Long occurrenceCount) {
    this.occurrenceCount = occurrenceCount;
  }

  /**
   * Set patternType and return this.
   * @param patternType Enumerates the mapi calendar recurrence pattern types Enum, available values: Day, Week, Month, MonthEnd, MonthNth, HjMonth, HjMonthNth, HjMonthEnd
   * @return this
  **/
  public MapiCalendarRecurrencePatternDto patternType(String patternType) {
    this.patternType = patternType;
    return this;
  }

  /**
   * Enumerates the mapi calendar recurrence pattern types Enum, available values: Day, Week, Month, MonthEnd, MonthNth, HjMonth, HjMonthNth, HjMonthEnd
   * @return patternType
  **/
  public String getPatternType() {
    return patternType;
  }  

  /**
   * Set patternType.
   * @param patternType Enumerates the mapi calendar recurrence pattern types Enum, available values: Day, Week, Month, MonthEnd, MonthNth, HjMonth, HjMonthNth, HjMonthEnd
  **/
  public void setPatternType(String patternType) {
    this.patternType = patternType;
  }

  /**
   * Set period and return this.
   * @param period Interval at which the meeting pattern repeats.             
   * @return this
  **/
  public MapiCalendarRecurrencePatternDto period(Long period) {
    this.period = period;
    return this;
  }

  /**
   * Interval at which the meeting pattern repeats.             
   * @return period
  **/
  public Long getPeriod() {
    return period;
  }  

  /**
   * Set period.
   * @param period Interval at which the meeting pattern repeats.             
  **/
  public void setPeriod(Long period) {
    this.period = period;
  }

  /**
   * Set slidingFlag and return this.
   * @param slidingFlag Defines whether pattern is sliding or not.             
   * @return this
  **/
  public MapiCalendarRecurrencePatternDto slidingFlag(Boolean slidingFlag) {
    this.slidingFlag = slidingFlag;
    return this;
  }

  /**
   * Defines whether pattern is sliding or not.             
   * @return slidingFlag
  **/
  public Boolean isSlidingFlag() {
    return slidingFlag;
  }  

  /**
   * Set slidingFlag.
   * @param slidingFlag Defines whether pattern is sliding or not.             
  **/
  public void setSlidingFlag(Boolean slidingFlag) {
    this.slidingFlag = slidingFlag;
  }

  /**
   * Set startDate and return this.
   * @param startDate Start date of an item recurrence pattern.             
   * @return this
  **/
  public MapiCalendarRecurrencePatternDto startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Start date of an item recurrence pattern.             
   * @return startDate
  **/
  public Date getStartDate() {
    return startDate;
  }  

  /**
   * Set startDate.
   * @param startDate Start date of an item recurrence pattern.             
  **/
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  /**
   * Set weekStartDay and return this.
   * @param weekStartDay Day of week. Enum, available values: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
   * @return this
  **/
  public MapiCalendarRecurrencePatternDto weekStartDay(String weekStartDay) {
    this.weekStartDay = weekStartDay;
    return this;
  }

  /**
   * Day of week. Enum, available values: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
   * @return weekStartDay
  **/
  public String getWeekStartDay() {
    return weekStartDay;
  }  

  /**
   * Set weekStartDay.
   * @param weekStartDay Day of week. Enum, available values: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
  **/
  public void setWeekStartDay(String weekStartDay) {
    this.weekStartDay = weekStartDay;
  }

  /**
   * Set discriminator and return this.
   * @param discriminator 
   * @return this
  **/


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
  public void setDiscriminator(String discriminator) {/* do nothing */}


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    MapiCalendarRecurrencePatternDto mapiCalendarRecurrencePatternDto = (MapiCalendarRecurrencePatternDto) o;
    return ObjectUtils.equals(this.calendarType, mapiCalendarRecurrencePatternDto.calendarType) &&
    ObjectUtils.equals(this.deletedInstanceDates, mapiCalendarRecurrencePatternDto.deletedInstanceDates) &&
    ObjectUtils.equals(this.endDate, mapiCalendarRecurrencePatternDto.endDate) &&
    ObjectUtils.equals(this.endType, mapiCalendarRecurrencePatternDto.endType) &&
    ObjectUtils.equals(this.exceptions, mapiCalendarRecurrencePatternDto.exceptions) &&
    ObjectUtils.equals(this.frequency, mapiCalendarRecurrencePatternDto.frequency) &&
    ObjectUtils.equals(this.modifiedInstanceDates, mapiCalendarRecurrencePatternDto.modifiedInstanceDates) &&
    ObjectUtils.equals(this.occurrenceCount, mapiCalendarRecurrencePatternDto.occurrenceCount) &&
    ObjectUtils.equals(this.patternType, mapiCalendarRecurrencePatternDto.patternType) &&
    ObjectUtils.equals(this.period, mapiCalendarRecurrencePatternDto.period) &&
    ObjectUtils.equals(this.slidingFlag, mapiCalendarRecurrencePatternDto.slidingFlag) &&
    ObjectUtils.equals(this.startDate, mapiCalendarRecurrencePatternDto.startDate) &&
    ObjectUtils.equals(this.weekStartDay, mapiCalendarRecurrencePatternDto.weekStartDay) &&
    ObjectUtils.equals(this.discriminator, mapiCalendarRecurrencePatternDto.discriminator);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(calendarType, deletedInstanceDates, endDate, endType, exceptions, frequency, modifiedInstanceDates, occurrenceCount, patternType, period, slidingFlag, startDate, weekStartDay, discriminator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapiCalendarRecurrencePatternDto {\n");
    
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

  public MapiCalendarRecurrencePatternDto() {
    super();
  }

  /**
   * Initializes a new instance of the MapiCalendarRecurrencePatternDto
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
   * @param weekStartDay Day of week. Enum, available values: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
   */
  public MapiCalendarRecurrencePatternDto(
    String calendarType,
    List<Date> deletedInstanceDates,
    Date endDate,
    String endType,
    List<MapiCalendarExceptionInfoDto> exceptions,
    String frequency,
    List<Date> modifiedInstanceDates,
    Long occurrenceCount,
    String patternType,
    Long period,
    Boolean slidingFlag,
    Date startDate,
    String weekStartDay/*,
    String discriminator*/
  ) {
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
  }

}

