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
    private final MapiCalendarTimeZoneRuleDto model;
    public MapiCalendarTimeZoneRuleDtoBuilder(MapiCalendarTimeZoneRuleDto model) {
        this.model = model;
    }

    public MapiCalendarTimeZoneRuleDto build() {
        return model;
    }
    public MapiCalendarTimeZoneRuleDtoBuilder date(Date date) {
        this.model.date(date);
        return this;
    }
    public MapiCalendarTimeZoneRuleDtoBuilder dayOfWeek(String dayOfWeek) {
        this.model.dayOfWeek(dayOfWeek);
        return this;
    }
    public MapiCalendarTimeZoneRuleDtoBuilder hour(Integer hour) {
        this.model.hour(hour);
        return this;
    }
    public MapiCalendarTimeZoneRuleDtoBuilder milliseconds(Integer milliseconds) {
        this.model.milliseconds(milliseconds);
        return this;
    }
    public MapiCalendarTimeZoneRuleDtoBuilder minute(Integer minute) {
        this.model.minute(minute);
        return this;
    }
    public MapiCalendarTimeZoneRuleDtoBuilder month(Integer month) {
        this.model.month(month);
        return this;
    }
    public MapiCalendarTimeZoneRuleDtoBuilder position(String position) {
        this.model.position(position);
        return this;
    }
    public MapiCalendarTimeZoneRuleDtoBuilder seconds(Integer seconds) {
        this.model.seconds(seconds);
        return this;
    }
    public MapiCalendarTimeZoneRuleDtoBuilder year(Integer year) {
        this.model.year(year);
        return this;
    }
}
