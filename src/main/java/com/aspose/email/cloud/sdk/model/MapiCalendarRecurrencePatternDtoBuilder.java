/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiCalendarRecurrencePatternDtoBuilder.java">
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
 *  MapiCalendarRecurrencePatternDto builder.
 */
public class MapiCalendarRecurrencePatternDtoBuilder {
    private final MapiCalendarRecurrencePatternDto model;
    public MapiCalendarRecurrencePatternDtoBuilder(MapiCalendarRecurrencePatternDto model) {
        this.model = model;
    }

    /**
     * Build MapiCalendarRecurrencePatternDto instance.
     */
    public MapiCalendarRecurrencePatternDto build() {
        MapiCalendarRecurrencePatternDto tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set MapiCalendarRecurrencePatternDto.calendarType and return builder.
     * @param calendarType Enumerated the calendar type of the mapi recurrence Enum, available values: Default, CalGregorian, CalGregorianUs, CalJapan, CalTaiwan, CalKorea, CalHijri, CalThai, CalHebrew, CalGregorianMeFrench, CalGregorianArabic, CalGregorianXLitEnglish, CalGregorianXLitFrench, CalLunarJapanese, CalChineseLunar, CalSaka, CalLunarEtoChn, CalLunarEtoKor, CalLunarRokuyou, CalLunarKorean, CalUmAlQura
     * @return builder
    **/
    public MapiCalendarRecurrencePatternDtoBuilder calendarType(String calendarType) {
        this.model.calendarType(calendarType);
        return this;
    }
    /**
     * Set MapiCalendarRecurrencePatternDto.deletedInstanceDates and return builder.
     * @param deletedInstanceDates An array of dates, each of which is the original instance date of either a deleted instance or a modified instance for this recurrence.             
     * @return builder
    **/
    public MapiCalendarRecurrencePatternDtoBuilder deletedInstanceDates(List<Date> deletedInstanceDates) {
        this.model.deletedInstanceDates(deletedInstanceDates);
        return this;
    }
    /**
     * Set MapiCalendarRecurrencePatternDto.endDate and return builder.
     * @param endDate End date of an item recurrence pattern.             
     * @return builder
    **/
    public MapiCalendarRecurrencePatternDtoBuilder endDate(Date endDate) {
        this.model.endDate(endDate);
        return this;
    }
    /**
     * Set MapiCalendarRecurrencePatternDto.endType and return builder.
     * @param endType Enumerates the ending type for the recurrence. Enum, available values: None, EndAfterDate, EndAfterNOccurrences, NeverEnd
     * @return builder
    **/
    public MapiCalendarRecurrencePatternDtoBuilder endType(String endType) {
        this.model.endType(endType);
        return this;
    }
    /**
     * Set MapiCalendarRecurrencePatternDto.exceptions and return builder.
     * @param exceptions An exception specifies changes to an instance of a recurring series.             
     * @return builder
    **/
    public MapiCalendarRecurrencePatternDtoBuilder exceptions(List<MapiCalendarExceptionInfoDto> exceptions) {
        this.model.exceptions(exceptions);
        return this;
    }
    /**
     * Set MapiCalendarRecurrencePatternDto.frequency and return builder.
     * @param frequency Enumerates mapi calendar recurrence frequency Enum, available values: None, Daily, Weekly, Monthly, Yearly
     * @return builder
    **/
    public MapiCalendarRecurrencePatternDtoBuilder frequency(String frequency) {
        this.model.frequency(frequency);
        return this;
    }
    /**
     * Set MapiCalendarRecurrencePatternDto.modifiedInstanceDates and return builder.
     * @param modifiedInstanceDates An array of dates, each of which is the date of a modified instance.             
     * @return builder
    **/
    public MapiCalendarRecurrencePatternDtoBuilder modifiedInstanceDates(List<Date> modifiedInstanceDates) {
        this.model.modifiedInstanceDates(modifiedInstanceDates);
        return this;
    }
    /**
     * Set MapiCalendarRecurrencePatternDto.occurrenceCount and return builder.
     * @param occurrenceCount Number of occurrences in a recurrence.             
     * @return builder
    **/
    public MapiCalendarRecurrencePatternDtoBuilder occurrenceCount(Long occurrenceCount) {
        this.model.occurrenceCount(occurrenceCount);
        return this;
    }
    /**
     * Set MapiCalendarRecurrencePatternDto.patternType and return builder.
     * @param patternType Enumerates the mapi calendar recurrence pattern types Enum, available values: Day, Week, Month, MonthEnd, MonthNth, HjMonth, HjMonthNth, HjMonthEnd
     * @return builder
    **/
    public MapiCalendarRecurrencePatternDtoBuilder patternType(String patternType) {
        this.model.patternType(patternType);
        return this;
    }
    /**
     * Set MapiCalendarRecurrencePatternDto.period and return builder.
     * @param period Interval at which the meeting pattern repeats.             
     * @return builder
    **/
    public MapiCalendarRecurrencePatternDtoBuilder period(Long period) {
        this.model.period(period);
        return this;
    }
    /**
     * Set MapiCalendarRecurrencePatternDto.slidingFlag and return builder.
     * @param slidingFlag Defines whether pattern is sliding or not.             
     * @return builder
    **/
    public MapiCalendarRecurrencePatternDtoBuilder slidingFlag(Boolean slidingFlag) {
        this.model.slidingFlag(slidingFlag);
        return this;
    }
    /**
     * Set MapiCalendarRecurrencePatternDto.startDate and return builder.
     * @param startDate Start date of an item recurrence pattern.             
     * @return builder
    **/
    public MapiCalendarRecurrencePatternDtoBuilder startDate(Date startDate) {
        this.model.startDate(startDate);
        return this;
    }
    /**
     * Set MapiCalendarRecurrencePatternDto.weekStartDay and return builder.
     * @param weekStartDay Day of week. Enum, available values: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
     * @return builder
    **/
    public MapiCalendarRecurrencePatternDtoBuilder weekStartDay(String weekStartDay) {
        this.model.weekStartDay(weekStartDay);
        return this;
    }
}
