/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiCalendarTimeZoneRuleDtoBuilder.java">
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
 *  MapiCalendarTimeZoneRuleDto builder.
 */
public class MapiCalendarTimeZoneRuleDtoBuilder {
    private MapiCalendarTimeZoneRuleDto model;
    public MapiCalendarTimeZoneRuleDtoBuilder(MapiCalendarTimeZoneRuleDto model) {
        this.model = model;
    }

    /**
     * Build MapiCalendarTimeZoneRuleDto instance.
     */
    public MapiCalendarTimeZoneRuleDto build() {
        MapiCalendarTimeZoneRuleDto tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set MapiCalendarTimeZoneRuleDto.date and return builder.
     * @param date Date and time that indicate when to begin using the Standard/Daylight time.             
     * @return builder
    **/
    public MapiCalendarTimeZoneRuleDtoBuilder date(Date date) {
        this.model.date(date);
        return this;
    }
    /**
     * Set MapiCalendarTimeZoneRuleDto.dayOfWeek and return builder.
     * @param dayOfWeek Day of week./nEnum, available values: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
     * @return builder
    **/
    public MapiCalendarTimeZoneRuleDtoBuilder dayOfWeek(String dayOfWeek) {
        this.model.dayOfWeek(dayOfWeek);
        return this;
    }
    /**
     * Set MapiCalendarTimeZoneRuleDto.hour and return builder.
     * @param hour Hour.             
     * @return builder
    **/
    public MapiCalendarTimeZoneRuleDtoBuilder hour(Integer hour) {
        this.model.hour(hour);
        return this;
    }
    /**
     * Set MapiCalendarTimeZoneRuleDto.milliseconds and return builder.
     * @param milliseconds Milliseconds.             
     * @return builder
    **/
    public MapiCalendarTimeZoneRuleDtoBuilder milliseconds(Integer milliseconds) {
        this.model.milliseconds(milliseconds);
        return this;
    }
    /**
     * Set MapiCalendarTimeZoneRuleDto.minute and return builder.
     * @param minute Minute.             
     * @return builder
    **/
    public MapiCalendarTimeZoneRuleDtoBuilder minute(Integer minute) {
        this.model.minute(minute);
        return this;
    }
    /**
     * Set MapiCalendarTimeZoneRuleDto.month and return builder.
     * @param month Month.             
     * @return builder
    **/
    public MapiCalendarTimeZoneRuleDtoBuilder month(Integer month) {
        this.model.month(month);
        return this;
    }
    /**
     * Set MapiCalendarTimeZoneRuleDto.position and return builder.
     * @param position Day positions, typically found in a month./nEnum, available values: None, First, Second, Third, Fourth, Last
     * @return builder
    **/
    public MapiCalendarTimeZoneRuleDtoBuilder position(String position) {
        this.model.position(position);
        return this;
    }
    /**
     * Set MapiCalendarTimeZoneRuleDto.seconds and return builder.
     * @param seconds Seconds.             
     * @return builder
    **/
    public MapiCalendarTimeZoneRuleDtoBuilder seconds(Integer seconds) {
        this.model.seconds(seconds);
        return this;
    }
    /**
     * Set MapiCalendarTimeZoneRuleDto.year and return builder.
     * @param year Year.             
     * @return builder
    **/
    public MapiCalendarTimeZoneRuleDtoBuilder year(Integer year) {
        this.model.year(year);
        return this;
    }
}
