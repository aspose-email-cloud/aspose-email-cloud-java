/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiCalendarDailyRecurrencePatternDtoBuilder.java">
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
 *  MapiCalendarDailyRecurrencePatternDto builder.
 */
public class MapiCalendarDailyRecurrencePatternDtoBuilder {
    private final MapiCalendarDailyRecurrencePatternDto model;
    public MapiCalendarDailyRecurrencePatternDtoBuilder(MapiCalendarDailyRecurrencePatternDto model) {
        this.model = model;
    }

    /**
     * Build MapiCalendarDailyRecurrencePatternDto instance.
     */
    public MapiCalendarDailyRecurrencePatternDto build() {
        MapiCalendarDailyRecurrencePatternDto tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set MapiCalendarDailyRecurrencePatternDto.calendarType and return builder.
     * @param calendarType Enumerated the calendar type of the mapi recurrence Enum, available values: Default, CalGregorian, CalGregorianUs, CalJapan, CalTaiwan, CalKorea, CalHijri, CalThai, CalHebrew, CalGregorianMeFrench, CalGregorianArabic, CalGregorianXLitEnglish, CalGregorianXLitFrench, CalLunarJapanese, CalChineseLunar, CalSaka, CalLunarEtoChn, CalLunarEtoKor, CalLunarRokuyou, CalLunarKorean, CalUmAlQura
     * @return builder
    **/
    public MapiCalendarDailyRecurrencePatternDtoBuilder calendarType(String calendarType) {
        this.model.calendarType(calendarType);
        return this;
    }
    /**
     * Set MapiCalendarDailyRecurrencePatternDto.deletedInstanceDates and return builder.
     * @param deletedInstanceDates An array of dates, each of which is the original instance date of either a deleted instance or a modified instance for this recurrence.             
     * @return builder
    **/
    public MapiCalendarDailyRecurrencePatternDtoBuilder deletedInstanceDates(List<Date> deletedInstanceDates) {
        this.model.deletedInstanceDates(deletedInstanceDates);
        return this;
    }
    /**
     * Set MapiCalendarDailyRecurrencePatternDto.endDate and return builder.
     * @param endDate End date of an item recurrence pattern.             
     * @return builder
    **/
    public MapiCalendarDailyRecurrencePatternDtoBuilder endDate(Date endDate) {
        this.model.endDate(endDate);
        return this;
    }
    /**
     * Set MapiCalendarDailyRecurrencePatternDto.endType and return builder.
     * @param endType Enumerates the ending type for the recurrence. Enum, available values: None, EndAfterDate, EndAfterNOccurrences, NeverEnd
     * @return builder
    **/
    public MapiCalendarDailyRecurrencePatternDtoBuilder endType(String endType) {
        this.model.endType(endType);
        return this;
    }
    /**
     * Set MapiCalendarDailyRecurrencePatternDto.exceptions and return builder.
     * @param exceptions An exception specifies changes to an instance of a recurring series.             
     * @return builder
    **/
    public MapiCalendarDailyRecurrencePatternDtoBuilder exceptions(List<MapiCalendarExceptionInfoDto> exceptions) {
        this.model.exceptions(exceptions);
        return this;
    }
    /**
     * Set MapiCalendarDailyRecurrencePatternDto.frequency and return builder.
     * @param frequency Enumerates mapi calendar recurrence frequency Enum, available values: None, Daily, Weekly, Monthly, Yearly
     * @return builder
    **/
    public MapiCalendarDailyRecurrencePatternDtoBuilder frequency(String frequency) {
        this.model.frequency(frequency);
        return this;
    }
    /**
     * Set MapiCalendarDailyRecurrencePatternDto.modifiedInstanceDates and return builder.
     * @param modifiedInstanceDates An array of dates, each of which is the date of a modified instance.             
     * @return builder
    **/
    public MapiCalendarDailyRecurrencePatternDtoBuilder modifiedInstanceDates(List<Date> modifiedInstanceDates) {
        this.model.modifiedInstanceDates(modifiedInstanceDates);
        return this;
    }
    /**
     * Set MapiCalendarDailyRecurrencePatternDto.occurrenceCount and return builder.
     * @param occurrenceCount Number of occurrences in a recurrence.             
     * @return builder
    **/
    public MapiCalendarDailyRecurrencePatternDtoBuilder occurrenceCount(Long occurrenceCount) {
        this.model.occurrenceCount(occurrenceCount);
        return this;
    }
    /**
     * Set MapiCalendarDailyRecurrencePatternDto.patternType and return builder.
     * @param patternType Enumerates the mapi calendar recurrence pattern types Enum, available values: Day, Week, Month, MonthEnd, MonthNth, HjMonth, HjMonthNth, HjMonthEnd
     * @return builder
    **/
    public MapiCalendarDailyRecurrencePatternDtoBuilder patternType(String patternType) {
        this.model.patternType(patternType);
        return this;
    }
    /**
     * Set MapiCalendarDailyRecurrencePatternDto.period and return builder.
     * @param period Interval at which the meeting pattern repeats.             
     * @return builder
    **/
    public MapiCalendarDailyRecurrencePatternDtoBuilder period(Long period) {
        this.model.period(period);
        return this;
    }
    /**
     * Set MapiCalendarDailyRecurrencePatternDto.slidingFlag and return builder.
     * @param slidingFlag Defines whether pattern is sliding or not.             
     * @return builder
    **/
    public MapiCalendarDailyRecurrencePatternDtoBuilder slidingFlag(Boolean slidingFlag) {
        this.model.slidingFlag(slidingFlag);
        return this;
    }
    /**
     * Set MapiCalendarDailyRecurrencePatternDto.startDate and return builder.
     * @param startDate Start date of an item recurrence pattern.             
     * @return builder
    **/
    public MapiCalendarDailyRecurrencePatternDtoBuilder startDate(Date startDate) {
        this.model.startDate(startDate);
        return this;
    }
    /**
     * Set MapiCalendarDailyRecurrencePatternDto.weekStartDay and return builder.
     * @param weekStartDay Day of week. Enum, available values: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
     * @return builder
    **/
    public MapiCalendarDailyRecurrencePatternDtoBuilder weekStartDay(String weekStartDay) {
        this.model.weekStartDay(weekStartDay);
        return this;
    }
    /**
     * Set MapiCalendarDailyRecurrencePatternDto.dayOfWeek and return builder.
     * @param dayOfWeek Days of week at which the event occurs.              Items: Enumerates the days of week of the mapi calendar recurrence pattern Enum, available values: Saturday, Friday, Thursday, Wednesday, Tuesday, Monday, Sunday
     * @return builder
    **/
    public MapiCalendarDailyRecurrencePatternDtoBuilder dayOfWeek(List<String> dayOfWeek) {
        this.model.dayOfWeek(dayOfWeek);
        return this;
    }
}
