/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder.java">
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
 *  MapiCalendarYearlyAndMonthlyRecurrencePatternDto builder.
 */
public class MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder {
    private MapiCalendarYearlyAndMonthlyRecurrencePatternDto model;
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder(MapiCalendarYearlyAndMonthlyRecurrencePatternDto model) {
        this.model = model;
    }

    /**
     * Build MapiCalendarYearlyAndMonthlyRecurrencePatternDto instance.
     */
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDto build() {
        MapiCalendarYearlyAndMonthlyRecurrencePatternDto tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set MapiCalendarYearlyAndMonthlyRecurrencePatternDto.calendarType and return builder.
     * @param calendarType Enumerated the calendar type of the mapi recurrence. Enum, available values: Default, CalGregorian, CalGregorianUs, CalJapan, CalTaiwan, CalKorea, CalHijri, CalThai, CalHebrew, CalGregorianMeFrench, CalGregorianArabic, CalGregorianXLitEnglish, CalGregorianXLitFrench, CalLunarJapanese, CalChineseLunar, CalSaka, CalLunarEtoChn, CalLunarEtoKor, CalLunarRokuyou, CalLunarKorean, CalUmAlQura
     * @return builder
    **/
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder calendarType(String calendarType) {
        this.model.calendarType(calendarType);
        return this;
    }
    /**
     * Set MapiCalendarYearlyAndMonthlyRecurrencePatternDto.deletedInstanceDates and return builder.
     * @param deletedInstanceDates An array of dates, each of which is the original instance date of either a deleted instance or a modified instance for this recurrence.             
     * @return builder
    **/
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder deletedInstanceDates(List<Date> deletedInstanceDates) {
        this.model.deletedInstanceDates(deletedInstanceDates);
        return this;
    }
    /**
     * Set MapiCalendarYearlyAndMonthlyRecurrencePatternDto.endDate and return builder.
     * @param endDate End date of an item recurrence pattern.             
     * @return builder
    **/
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder endDate(Date endDate) {
        this.model.endDate(endDate);
        return this;
    }
    /**
     * Set MapiCalendarYearlyAndMonthlyRecurrencePatternDto.endType and return builder.
     * @param endType Enumerates the ending type for the recurrence. Enum, available values: None, EndAfterDate, EndAfterNOccurrences, NeverEnd
     * @return builder
    **/
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder endType(String endType) {
        this.model.endType(endType);
        return this;
    }
    /**
     * Set MapiCalendarYearlyAndMonthlyRecurrencePatternDto.exceptions and return builder.
     * @param exceptions An exception specifies changes to an instance of a recurring series.             
     * @return builder
    **/
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder exceptions(List<MapiCalendarExceptionInfoDto> exceptions) {
        this.model.exceptions(exceptions);
        return this;
    }
    /**
     * Set MapiCalendarYearlyAndMonthlyRecurrencePatternDto.frequency and return builder.
     * @param frequency Enumerates mapi calendar recurrence frequency. Enum, available values: None, Daily, Weekly, Monthly, Yearly
     * @return builder
    **/
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder frequency(String frequency) {
        this.model.frequency(frequency);
        return this;
    }
    /**
     * Set MapiCalendarYearlyAndMonthlyRecurrencePatternDto.modifiedInstanceDates and return builder.
     * @param modifiedInstanceDates An array of dates, each of which is the date of a modified instance.             
     * @return builder
    **/
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder modifiedInstanceDates(List<Date> modifiedInstanceDates) {
        this.model.modifiedInstanceDates(modifiedInstanceDates);
        return this;
    }
    /**
     * Set MapiCalendarYearlyAndMonthlyRecurrencePatternDto.occurrenceCount and return builder.
     * @param occurrenceCount Number of occurrences in a recurrence.             
     * @return builder
    **/
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder occurrenceCount(Long occurrenceCount) {
        this.model.occurrenceCount(occurrenceCount);
        return this;
    }
    /**
     * Set MapiCalendarYearlyAndMonthlyRecurrencePatternDto.patternType and return builder.
     * @param patternType Enumerates the mapi calendar recurrence pattern types. Enum, available values: Day, Week, Month, MonthEnd, MonthNth, HjMonth, HjMonthNth, HjMonthEnd
     * @return builder
    **/
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder patternType(String patternType) {
        this.model.patternType(patternType);
        return this;
    }
    /**
     * Set MapiCalendarYearlyAndMonthlyRecurrencePatternDto.period and return builder.
     * @param period Interval at which the meeting pattern repeats.             
     * @return builder
    **/
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder period(Long period) {
        this.model.period(period);
        return this;
    }
    /**
     * Set MapiCalendarYearlyAndMonthlyRecurrencePatternDto.slidingFlag and return builder.
     * @param slidingFlag Defines whether pattern is sliding or not.             
     * @return builder
    **/
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder slidingFlag(Boolean slidingFlag) {
        this.model.slidingFlag(slidingFlag);
        return this;
    }
    /**
     * Set MapiCalendarYearlyAndMonthlyRecurrencePatternDto.startDate and return builder.
     * @param startDate Start date of an item recurrence pattern.             
     * @return builder
    **/
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder startDate(Date startDate) {
        this.model.startDate(startDate);
        return this;
    }
    /**
     * Set MapiCalendarYearlyAndMonthlyRecurrencePatternDto.weekStartDay and return builder.
     * @param weekStartDay Day of week. Enum, available values: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
     * @return builder
    **/
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder weekStartDay(String weekStartDay) {
        this.model.weekStartDay(weekStartDay);
        return this;
    }
    /**
     * Set MapiCalendarYearlyAndMonthlyRecurrencePatternDto.day and return builder.
     * @param day Day of the month on which the recurrence falls.             
     * @return builder
    **/
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder day(Integer day) {
        this.model.day(day);
        return this;
    }
    /**
     * Set MapiCalendarYearlyAndMonthlyRecurrencePatternDto.dayOfWeek and return builder.
     * @param dayOfWeek Days of week at which the event occurs.              Items: Enumerates the days of week of the mapi calendar recurrence pattern. Enum, available values: Saturday, Friday, Thursday, Wednesday, Tuesday, Monday, Sunday
     * @return builder
    **/
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder dayOfWeek(List<String> dayOfWeek) {
        this.model.dayOfWeek(dayOfWeek);
        return this;
    }
    /**
     * Set MapiCalendarYearlyAndMonthlyRecurrencePatternDto.position and return builder.
     * @param position Day positions, typically found in a month. Enum, available values: None, First, Second, Third, Fourth, Last
     * @return builder
    **/
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder position(String position) {
        this.model.position(position);
        return this;
    }
}
