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

import java.util.List;

/**
 *  MapiCalendarDailyRecurrencePatternDto builder.
 */
public class MapiCalendarDailyRecurrencePatternDtoBuilder {
    private final MapiCalendarDailyRecurrencePatternDto model;
    public MapiCalendarDailyRecurrencePatternDtoBuilder(MapiCalendarDailyRecurrencePatternDto model) {
        this.model = model;
    }

    public MapiCalendarDailyRecurrencePatternDto build() {
        return model;
    }
    public MapiCalendarDailyRecurrencePatternDtoBuilder calendarType(String calendarType) {
        this.model.calendarType(calendarType);
        return this;
    }
    public MapiCalendarDailyRecurrencePatternDtoBuilder deletedInstanceDates(List<Date> deletedInstanceDates) {
        this.model.deletedInstanceDates(deletedInstanceDates);
        return this;
    }
    public MapiCalendarDailyRecurrencePatternDtoBuilder endDate(Date endDate) {
        this.model.endDate(endDate);
        return this;
    }
    public MapiCalendarDailyRecurrencePatternDtoBuilder endType(String endType) {
        this.model.endType(endType);
        return this;
    }
    public MapiCalendarDailyRecurrencePatternDtoBuilder exceptions(List<MapiCalendarExceptionInfoDto> exceptions) {
        this.model.exceptions(exceptions);
        return this;
    }
    public MapiCalendarDailyRecurrencePatternDtoBuilder frequency(String frequency) {
        this.model.frequency(frequency);
        return this;
    }
    public MapiCalendarDailyRecurrencePatternDtoBuilder modifiedInstanceDates(List<Date> modifiedInstanceDates) {
        this.model.modifiedInstanceDates(modifiedInstanceDates);
        return this;
    }
    public MapiCalendarDailyRecurrencePatternDtoBuilder occurrenceCount(Long occurrenceCount) {
        this.model.occurrenceCount(occurrenceCount);
        return this;
    }
    public MapiCalendarDailyRecurrencePatternDtoBuilder patternType(String patternType) {
        this.model.patternType(patternType);
        return this;
    }
    public MapiCalendarDailyRecurrencePatternDtoBuilder period(Long period) {
        this.model.period(period);
        return this;
    }
    public MapiCalendarDailyRecurrencePatternDtoBuilder slidingFlag(Boolean slidingFlag) {
        this.model.slidingFlag(slidingFlag);
        return this;
    }
    public MapiCalendarDailyRecurrencePatternDtoBuilder startDate(Date startDate) {
        this.model.startDate(startDate);
        return this;
    }
    public MapiCalendarDailyRecurrencePatternDtoBuilder weekStartDay(String weekStartDay) {
        this.model.weekStartDay(weekStartDay);
        return this;
    }
    public MapiCalendarDailyRecurrencePatternDtoBuilder dayOfWeek(List<String> dayOfWeek) {
        this.model.dayOfWeek(dayOfWeek);
        return this;
    }
}
