/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiCalendarWeeklyRecurrencePatternDtoBuilder.java">
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
 *  MapiCalendarWeeklyRecurrencePatternDto builder.
 */
public class MapiCalendarWeeklyRecurrencePatternDtoBuilder {
    private MapiCalendarWeeklyRecurrencePatternDto model;
    public MapiCalendarWeeklyRecurrencePatternDtoBuilder(MapiCalendarWeeklyRecurrencePatternDto model) {
        this.model = model;
    }

    /**
     * Build MapiCalendarWeeklyRecurrencePatternDto instance.
     */
    public MapiCalendarWeeklyRecurrencePatternDto build() {
        MapiCalendarWeeklyRecurrencePatternDto tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set MapiCalendarWeeklyRecurrencePatternDto.calendarType and return builder.
     * @param calendarType Enumerated the calendar type of the mapi recurrence. Enum, available values: Default, CalGregorian, CalGregorianUs, CalJapan, CalTaiwan, CalKorea, CalHijri, CalThai, CalHebrew, CalGregorianMeFrench, CalGregorianArabic, CalGregorianXLitEnglish, CalGregorianXLitFrench, CalLunarJapanese, CalChineseLunar, CalSaka, CalLunarEtoChn, CalLunarEtoKor, CalLunarRokuyou, CalLunarKorean, CalUmAlQura
     * @return builder
    **/
    public MapiCalendarWeeklyRecurrencePatternDtoBuilder calendarType(String calendarType) {
        this.model.calendarType(calendarType);
        return this;
    }
    /**
     * Set MapiCalendarWeeklyRecurrencePatternDto.deletedInstanceDates and return builder.
     * @param deletedInstanceDates An array of dates, each of which is the original instance date of either a deleted instance or a modified instance for this recurrence.             
     * @return builder
    **/
    public MapiCalendarWeeklyRecurrencePatternDtoBuilder deletedInstanceDates(List<Date> deletedInstanceDates) {
        this.model.deletedInstanceDates(deletedInstanceDates);
        return this;
    }
    /**
     * Set MapiCalendarWeeklyRecurrencePatternDto.endDate and return builder.
     * @param endDate End date of an item recurrence pattern.             
     * @return builder
    **/
    public MapiCalendarWeeklyRecurrencePatternDtoBuilder endDate(Date endDate) {
        this.model.endDate(endDate);
        return this;
    }
    /**
     * Set MapiCalendarWeeklyRecurrencePatternDto.endType and return builder.
     * @param endType Enumerates the ending type for the recurrence. Enum, available values: None, EndAfterDate, EndAfterNOccurrences, NeverEnd
     * @return builder
    **/
    public MapiCalendarWeeklyRecurrencePatternDtoBuilder endType(String endType) {
        this.model.endType(endType);
        return this;
    }
    /**
     * Set MapiCalendarWeeklyRecurrencePatternDto.exceptions and return builder.
     * @param exceptions An exception specifies changes to an instance of a recurring series.             
     * @return builder
    **/
    public MapiCalendarWeeklyRecurrencePatternDtoBuilder exceptions(List<MapiCalendarExceptionInfoDto> exceptions) {
        this.model.exceptions(exceptions);
        return this;
    }
    /**
     * Set MapiCalendarWeeklyRecurrencePatternDto.frequency and return builder.
     * @param frequency Enumerates mapi calendar recurrence frequency. Enum, available values: None, Daily, Weekly, Monthly, Yearly
     * @return builder
    **/
    public MapiCalendarWeeklyRecurrencePatternDtoBuilder frequency(String frequency) {
        this.model.frequency(frequency);
        return this;
    }
    /**
     * Set MapiCalendarWeeklyRecurrencePatternDto.modifiedInstanceDates and return builder.
     * @param modifiedInstanceDates An array of dates, each of which is the date of a modified instance.             
     * @return builder
    **/
    public MapiCalendarWeeklyRecurrencePatternDtoBuilder modifiedInstanceDates(List<Date> modifiedInstanceDates) {
        this.model.modifiedInstanceDates(modifiedInstanceDates);
        return this;
    }
    /**
     * Set MapiCalendarWeeklyRecurrencePatternDto.occurrenceCount and return builder.
     * @param occurrenceCount Number of occurrences in a recurrence.             
     * @return builder
    **/
    public MapiCalendarWeeklyRecurrencePatternDtoBuilder occurrenceCount(Long occurrenceCount) {
        this.model.occurrenceCount(occurrenceCount);
        return this;
    }
    /**
     * Set MapiCalendarWeeklyRecurrencePatternDto.patternType and return builder.
     * @param patternType Enumerates the mapi calendar recurrence pattern types. Enum, available values: Day, Week, Month, MonthEnd, MonthNth, HjMonth, HjMonthNth, HjMonthEnd
     * @return builder
    **/
    public MapiCalendarWeeklyRecurrencePatternDtoBuilder patternType(String patternType) {
        this.model.patternType(patternType);
        return this;
    }
    /**
     * Set MapiCalendarWeeklyRecurrencePatternDto.period and return builder.
     * @param period Interval at which the meeting pattern repeats.             
     * @return builder
    **/
    public MapiCalendarWeeklyRecurrencePatternDtoBuilder period(Long period) {
        this.model.period(period);
        return this;
    }
    /**
     * Set MapiCalendarWeeklyRecurrencePatternDto.slidingFlag and return builder.
     * @param slidingFlag Defines whether pattern is sliding or not.             
     * @return builder
    **/
    public MapiCalendarWeeklyRecurrencePatternDtoBuilder slidingFlag(Boolean slidingFlag) {
        this.model.slidingFlag(slidingFlag);
        return this;
    }
    /**
     * Set MapiCalendarWeeklyRecurrencePatternDto.startDate and return builder.
     * @param startDate Start date of an item recurrence pattern.             
     * @return builder
    **/
    public MapiCalendarWeeklyRecurrencePatternDtoBuilder startDate(Date startDate) {
        this.model.startDate(startDate);
        return this;
    }
    /**
     * Set MapiCalendarWeeklyRecurrencePatternDto.weekStartDay and return builder.
     * @param weekStartDay Day of week. Enum, available values: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
     * @return builder
    **/
    public MapiCalendarWeeklyRecurrencePatternDtoBuilder weekStartDay(String weekStartDay) {
        this.model.weekStartDay(weekStartDay);
        return this;
    }
    /**
     * Set MapiCalendarWeeklyRecurrencePatternDto.dayOfWeek and return builder.
     * @param dayOfWeek Days of week at which the event occurs.              Items: Enumerates the days of week of the mapi calendar recurrence pattern. Enum, available values: Saturday, Friday, Thursday, Wednesday, Tuesday, Monday, Sunday
     * @return builder
    **/
    public MapiCalendarWeeklyRecurrencePatternDtoBuilder dayOfWeek(List<String> dayOfWeek) {
        this.model.dayOfWeek(dayOfWeek);
        return this;
    }
}
