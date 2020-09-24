/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiCalendarEventRecurrenceDtoBuilder.java">
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
 *  MapiCalendarEventRecurrenceDto builder.
 */
public class MapiCalendarEventRecurrenceDtoBuilder {
    private final MapiCalendarEventRecurrenceDto model;
    public MapiCalendarEventRecurrenceDtoBuilder(MapiCalendarEventRecurrenceDto model) {
        this.model = model;
    }

    /**
     * Build MapiCalendarEventRecurrenceDto instance.
     */
    public MapiCalendarEventRecurrenceDto build() {
        MapiCalendarEventRecurrenceDto tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set MapiCalendarEventRecurrenceDto.appointmentTimeZoneDefinitionRecur and return builder.
     * @param appointmentTimeZoneDefinitionRecur Time zone information that describes how to convert the meeting date and time on a recurring series to and from UTC.             
     * @return builder
    **/
    public MapiCalendarEventRecurrenceDtoBuilder appointmentTimeZoneDefinitionRecur(MapiCalendarTimeZoneDto appointmentTimeZoneDefinitionRecur) {
        this.model.appointmentTimeZoneDefinitionRecur(appointmentTimeZoneDefinitionRecur);
        return this;
    }
    /**
     * Set MapiCalendarEventRecurrenceDto.clipEnd and return builder.
     * @param clipEnd Date of the last instance.             
     * @return builder
    **/
    public MapiCalendarEventRecurrenceDtoBuilder clipEnd(Date clipEnd) {
        this.model.clipEnd(clipEnd);
        return this;
    }
    /**
     * Set MapiCalendarEventRecurrenceDto.clipStart and return builder.
     * @param clipStart Date of the first instance.             
     * @return builder
    **/
    public MapiCalendarEventRecurrenceDtoBuilder clipStart(Date clipStart) {
        this.model.clipStart(clipStart);
        return this;
    }
    /**
     * Set MapiCalendarEventRecurrenceDto.isException and return builder.
     * @param isException Value indicating whether the object represents an exception.             
     * @return builder
    **/
    public MapiCalendarEventRecurrenceDtoBuilder isException(Boolean isException) {
        this.model.isException(isException);
        return this;
    }
    /**
     * Set MapiCalendarEventRecurrenceDto.recurrencePattern and return builder.
     * @param recurrencePattern Recurrence pattern.             
     * @return builder
    **/
    public MapiCalendarEventRecurrenceDtoBuilder recurrencePattern(MapiCalendarRecurrencePatternDto recurrencePattern) {
        this.model.recurrencePattern(recurrencePattern);
        return this;
    }
    /**
     * Set MapiCalendarEventRecurrenceDto.timeZoneStruct and return builder.
     * @param timeZoneStruct Time zone information for a recurring meeting.             
     * @return builder
    **/
    public MapiCalendarEventRecurrenceDtoBuilder timeZoneStruct(MapiCalendarTimeZoneDto timeZoneStruct) {
        this.model.timeZoneStruct(timeZoneStruct);
        return this;
    }
}
