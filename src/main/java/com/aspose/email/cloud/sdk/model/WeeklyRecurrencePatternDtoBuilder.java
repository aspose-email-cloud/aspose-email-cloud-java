/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="WeeklyRecurrencePatternDtoBuilder.java">
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
 *  WeeklyRecurrencePatternDto builder.
 */
public class WeeklyRecurrencePatternDtoBuilder {
    private WeeklyRecurrencePatternDto model;
    public WeeklyRecurrencePatternDtoBuilder(WeeklyRecurrencePatternDto model) {
        this.model = model;
    }

    /**
     * Build WeeklyRecurrencePatternDto instance.
     */
    public WeeklyRecurrencePatternDto build() {
        WeeklyRecurrencePatternDto tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set WeeklyRecurrencePatternDto.interval and return builder.
     * @param interval Number of recurrence units.             
     * @return builder
    **/
    public WeeklyRecurrencePatternDtoBuilder interval(Integer interval) {
        this.model.interval(interval);
        return this;
    }
    /**
     * Set WeeklyRecurrencePatternDto.occurs and return builder.
     * @param occurs Number of occurrences of the recurrence pattern.             
     * @return builder
    **/
    public WeeklyRecurrencePatternDtoBuilder occurs(Integer occurs) {
        this.model.occurs(occurs);
        return this;
    }
    /**
     * Set WeeklyRecurrencePatternDto.endDate and return builder.
     * @param endDate End date.             
     * @return builder
    **/
    public WeeklyRecurrencePatternDtoBuilder endDate(Date endDate) {
        this.model.endDate(endDate);
        return this;
    }
    /**
     * Set WeeklyRecurrencePatternDto.weekStart and return builder.
     * @param weekStart Represents the day of the week. Enum, available values: None, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday, Day, WeekDay, WeekendDay
     * @return builder
    **/
    public WeeklyRecurrencePatternDtoBuilder weekStart(String weekStart) {
        this.model.weekStart(weekStart);
        return this;
    }
    /**
     * Set WeeklyRecurrencePatternDto.startDays and return builder.
     * @param startDays Start days              Items: Represents the day of the week. Enum, available values: None, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday, Day, WeekDay, WeekendDay
     * @return builder
    **/
    public WeeklyRecurrencePatternDtoBuilder startDays(List<String> startDays) {
        this.model.startDays(startDays);
        return this;
    }
}
