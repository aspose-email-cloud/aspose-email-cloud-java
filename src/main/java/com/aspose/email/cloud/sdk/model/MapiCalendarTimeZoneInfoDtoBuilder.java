/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiCalendarTimeZoneInfoDtoBuilder.java">
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
 *  MapiCalendarTimeZoneInfoDto builder.
 */
public class MapiCalendarTimeZoneInfoDtoBuilder {
    private MapiCalendarTimeZoneInfoDto model;
    public MapiCalendarTimeZoneInfoDtoBuilder(MapiCalendarTimeZoneInfoDto model) {
        this.model = model;
    }

    /**
     * Build MapiCalendarTimeZoneInfoDto instance.
     */
    public MapiCalendarTimeZoneInfoDto build() {
        MapiCalendarTimeZoneInfoDto tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set MapiCalendarTimeZoneInfoDto.bias and return builder.
     * @param bias Time zone&#39;s offset in minutes from UTC.             
     * @return builder
    **/
    public MapiCalendarTimeZoneInfoDtoBuilder bias(Integer bias) {
        this.model.bias(bias);
        return this;
    }
    /**
     * Set MapiCalendarTimeZoneInfoDto.daylightBias and return builder.
     * @param daylightBias Offset in minutes from lBias during daylight saving time.             
     * @return builder
    **/
    public MapiCalendarTimeZoneInfoDtoBuilder daylightBias(Integer daylightBias) {
        this.model.daylightBias(daylightBias);
        return this;
    }
    /**
     * Set MapiCalendarTimeZoneInfoDto.daylightDate and return builder.
     * @param daylightDate Date and local time that indicate when to begin using the DaylightBias.             
     * @return builder
    **/
    public MapiCalendarTimeZoneInfoDtoBuilder daylightDate(MapiCalendarTimeZoneRuleDto daylightDate) {
        this.model.daylightDate(daylightDate);
        return this;
    }
    /**
     * Set MapiCalendarTimeZoneInfoDto.standardBias and return builder.
     * @param standardBias Offset in minutes from lBias during standard time.             
     * @return builder
    **/
    public MapiCalendarTimeZoneInfoDtoBuilder standardBias(Integer standardBias) {
        this.model.standardBias(standardBias);
        return this;
    }
    /**
     * Set MapiCalendarTimeZoneInfoDto.standardDate and return builder.
     * @param standardDate Date and local time that indicate when to begin using the StandardBias.             
     * @return builder
    **/
    public MapiCalendarTimeZoneInfoDtoBuilder standardDate(MapiCalendarTimeZoneRuleDto standardDate) {
        this.model.standardDate(standardDate);
        return this;
    }
    /**
     * Set MapiCalendarTimeZoneInfoDto.timeZoneFlags and return builder.
     * @param timeZoneFlags Individual bit flags that specify information about this TimeZoneRule.              Items: Enumerates the individual bit flags that specify information about TimeZoneRule./nEnum, available values: TzRuleFlagRecurCurrentTzReg, TzRuleFlagEffectiveTzReg
     * @return builder
    **/
    public MapiCalendarTimeZoneInfoDtoBuilder timeZoneFlags(List<String> timeZoneFlags) {
        this.model.timeZoneFlags(timeZoneFlags);
        return this;
    }
    /**
     * Set MapiCalendarTimeZoneInfoDto.year and return builder.
     * @param year Year in which this rule is scheduled to take effect.             
     * @return builder
    **/
    public MapiCalendarTimeZoneInfoDtoBuilder year(Integer year) {
        this.model.year(year);
        return this;
    }
}
