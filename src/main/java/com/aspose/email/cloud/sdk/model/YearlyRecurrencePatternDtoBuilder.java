/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="YearlyRecurrencePatternDtoBuilder.java">
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
 *  YearlyRecurrencePatternDto builder.
 */
public class YearlyRecurrencePatternDtoBuilder {
    private final YearlyRecurrencePatternDto model;
    public YearlyRecurrencePatternDtoBuilder(YearlyRecurrencePatternDto model) {
        this.model = model;
    }

    public YearlyRecurrencePatternDto build() {
        return model;
    }
    public YearlyRecurrencePatternDtoBuilder interval(Integer interval) {
        this.model.interval(interval);
        return this;
    }
    public YearlyRecurrencePatternDtoBuilder occurs(Integer occurs) {
        this.model.occurs(occurs);
        return this;
    }
    public YearlyRecurrencePatternDtoBuilder endDate(Date endDate) {
        this.model.endDate(endDate);
        return this;
    }
    public YearlyRecurrencePatternDtoBuilder weekStart(String weekStart) {
        this.model.weekStart(weekStart);
        return this;
    }
    public YearlyRecurrencePatternDtoBuilder startDay(String startDay) {
        this.model.startDay(startDay);
        return this;
    }
    public YearlyRecurrencePatternDtoBuilder startMonth(String startMonth) {
        this.model.startMonth(startMonth);
        return this;
    }
    public YearlyRecurrencePatternDtoBuilder startOffset(Integer startOffset) {
        this.model.startOffset(startOffset);
        return this;
    }
    public YearlyRecurrencePatternDtoBuilder startPosition(String startPosition) {
        this.model.startPosition(startPosition);
        return this;
    }
}
