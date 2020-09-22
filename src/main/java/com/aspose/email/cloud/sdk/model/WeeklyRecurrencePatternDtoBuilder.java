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

import java.util.List;

/**
 *  WeeklyRecurrencePatternDto builder.
 */
public class WeeklyRecurrencePatternDtoBuilder {
    private final WeeklyRecurrencePatternDto model;
    public WeeklyRecurrencePatternDtoBuilder(WeeklyRecurrencePatternDto model) {
        this.model = model;
    }

    public WeeklyRecurrencePatternDto build() {
        return model;
    }
    public WeeklyRecurrencePatternDtoBuilder interval(Integer interval) {
        this.model.interval(interval);
        return this;
    }
    public WeeklyRecurrencePatternDtoBuilder occurs(Integer occurs) {
        this.model.occurs(occurs);
        return this;
    }
    public WeeklyRecurrencePatternDtoBuilder endDate(Date endDate) {
        this.model.endDate(endDate);
        return this;
    }
    public WeeklyRecurrencePatternDtoBuilder weekStart(String weekStart) {
        this.model.weekStart(weekStart);
        return this;
    }
    public WeeklyRecurrencePatternDtoBuilder startDays(List<String> startDays) {
        this.model.startDays(startDays);
        return this;
    }
}
