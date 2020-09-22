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

import java.util.List;

/**
 *  MapiCalendarEventRecurrenceDto builder.
 */
public class MapiCalendarEventRecurrenceDtoBuilder {
    private final MapiCalendarEventRecurrenceDto model;
    public MapiCalendarEventRecurrenceDtoBuilder(MapiCalendarEventRecurrenceDto model) {
        this.model = model;
    }

    public MapiCalendarEventRecurrenceDto build() {
        return model;
    }
    public MapiCalendarEventRecurrenceDtoBuilder appointmentTimeZoneDefinitionRecur(MapiCalendarTimeZoneDto appointmentTimeZoneDefinitionRecur) {
        this.model.appointmentTimeZoneDefinitionRecur(appointmentTimeZoneDefinitionRecur);
        return this;
    }
    public MapiCalendarEventRecurrenceDtoBuilder clipEnd(Date clipEnd) {
        this.model.clipEnd(clipEnd);
        return this;
    }
    public MapiCalendarEventRecurrenceDtoBuilder clipStart(Date clipStart) {
        this.model.clipStart(clipStart);
        return this;
    }
    public MapiCalendarEventRecurrenceDtoBuilder isException(Boolean isException) {
        this.model.isException(isException);
        return this;
    }
    public MapiCalendarEventRecurrenceDtoBuilder recurrencePattern(MapiCalendarRecurrencePatternDto recurrencePattern) {
        this.model.recurrencePattern(recurrencePattern);
        return this;
    }
    public MapiCalendarEventRecurrenceDtoBuilder timeZoneStruct(MapiCalendarTimeZoneDto timeZoneStruct) {
        this.model.timeZoneStruct(timeZoneStruct);
        return this;
    }
}
