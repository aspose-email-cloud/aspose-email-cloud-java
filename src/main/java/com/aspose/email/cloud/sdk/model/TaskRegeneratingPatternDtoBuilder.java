/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="TaskRegeneratingPatternDtoBuilder.java">
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
 *  TaskRegeneratingPatternDto builder.
 */
public class TaskRegeneratingPatternDtoBuilder {
    private TaskRegeneratingPatternDto model;
    public TaskRegeneratingPatternDtoBuilder(TaskRegeneratingPatternDto model) {
        this.model = model;
    }

    /**
     * Build TaskRegeneratingPatternDto instance.
     */
    public TaskRegeneratingPatternDto build() {
        TaskRegeneratingPatternDto tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set TaskRegeneratingPatternDto.interval and return builder.
     * @param interval Number of recurrence units.             
     * @return builder
    **/
    public TaskRegeneratingPatternDtoBuilder interval(Integer interval) {
        this.model.interval(interval);
        return this;
    }
    /**
     * Set TaskRegeneratingPatternDto.occurs and return builder.
     * @param occurs Number of occurrences of the recurrence pattern.             
     * @return builder
    **/
    public TaskRegeneratingPatternDtoBuilder occurs(Integer occurs) {
        this.model.occurs(occurs);
        return this;
    }
    /**
     * Set TaskRegeneratingPatternDto.endDate and return builder.
     * @param endDate End date.             
     * @return builder
    **/
    public TaskRegeneratingPatternDtoBuilder endDate(Date endDate) {
        this.model.endDate(endDate);
        return this;
    }
    /**
     * Set TaskRegeneratingPatternDto.weekStart and return builder.
     * @param weekStart Represents the day of the week. Enum, available values: None, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday, Day, WeekDay, WeekendDay
     * @return builder
    **/
    public TaskRegeneratingPatternDtoBuilder weekStart(String weekStart) {
        this.model.weekStart(weekStart);
        return this;
    }
    /**
     * Set TaskRegeneratingPatternDto.regeneratingType and return builder.
     * @param regeneratingType Enumerates the types of regenerating pattern. Enum, available values: Daily, Weekly, Monthly, Yearly
     * @return builder
    **/
    public TaskRegeneratingPatternDtoBuilder regeneratingType(String regeneratingType) {
        this.model.regeneratingType(regeneratingType);
        return this;
    }
}
