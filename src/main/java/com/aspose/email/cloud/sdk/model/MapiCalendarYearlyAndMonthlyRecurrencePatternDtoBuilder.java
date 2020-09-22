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
    private final MapiCalendarYearlyAndMonthlyRecurrencePatternDto model;
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder(MapiCalendarYearlyAndMonthlyRecurrencePatternDto model) {
        this.model = model;
    }

    public MapiCalendarYearlyAndMonthlyRecurrencePatternDto build() {
        return model;
    }
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder calendarType(String calendarType) {
        this.model.calendarType(calendarType);
        return this;
    }
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder deletedInstanceDates(List<Date> deletedInstanceDates) {
        this.model.deletedInstanceDates(deletedInstanceDates);
        return this;
    }
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder endDate(Date endDate) {
        this.model.endDate(endDate);
        return this;
    }
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder endType(String endType) {
        this.model.endType(endType);
        return this;
    }
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder exceptions(List<MapiCalendarExceptionInfoDto> exceptions) {
        this.model.exceptions(exceptions);
        return this;
    }
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder frequency(String frequency) {
        this.model.frequency(frequency);
        return this;
    }
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder modifiedInstanceDates(List<Date> modifiedInstanceDates) {
        this.model.modifiedInstanceDates(modifiedInstanceDates);
        return this;
    }
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder occurrenceCount(Long occurrenceCount) {
        this.model.occurrenceCount(occurrenceCount);
        return this;
    }
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder patternType(String patternType) {
        this.model.patternType(patternType);
        return this;
    }
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder period(Long period) {
        this.model.period(period);
        return this;
    }
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder slidingFlag(Boolean slidingFlag) {
        this.model.slidingFlag(slidingFlag);
        return this;
    }
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder startDate(Date startDate) {
        this.model.startDate(startDate);
        return this;
    }
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder weekStartDay(String weekStartDay) {
        this.model.weekStartDay(weekStartDay);
        return this;
    }
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder day(Integer day) {
        this.model.day(day);
        return this;
    }
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder dayOfWeek(List<String> dayOfWeek) {
        this.model.dayOfWeek(dayOfWeek);
        return this;
    }
    public MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder position(String position) {
        this.model.position(position);
        return this;
    }
}
