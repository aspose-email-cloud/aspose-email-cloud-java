/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiCalendarAttendeesDtoBuilder.java">
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
 *  MapiCalendarAttendeesDto builder.
 */
public class MapiCalendarAttendeesDtoBuilder {
    private MapiCalendarAttendeesDto model;
    public MapiCalendarAttendeesDtoBuilder(MapiCalendarAttendeesDto model) {
        this.model = model;
    }

    /**
     * Build MapiCalendarAttendeesDto instance.
     */
    public MapiCalendarAttendeesDto build() {
        MapiCalendarAttendeesDto tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set MapiCalendarAttendeesDto.appointmentRecipients and return builder.
     * @param appointmentRecipients List of attendees.             
     * @return builder
    **/
    public MapiCalendarAttendeesDtoBuilder appointmentRecipients(List<MapiRecipientDto> appointmentRecipients) {
        this.model.appointmentRecipients(appointmentRecipients);
        return this;
    }
    /**
     * Set MapiCalendarAttendeesDto.appointmentUnsendableRecipients and return builder.
     * @param appointmentUnsendableRecipients List of unsendable attendees.             
     * @return builder
    **/
    public MapiCalendarAttendeesDtoBuilder appointmentUnsendableRecipients(List<MapiRecipientDto> appointmentUnsendableRecipients) {
        this.model.appointmentUnsendableRecipients(appointmentUnsendableRecipients);
        return this;
    }
    /**
     * Set MapiCalendarAttendeesDto.notAllowPropose and return builder.
     * @param notAllowPropose Value indicating whether attendees are not allowed to propose a new date and/or time for the meeting.             
     * @return builder
    **/
    public MapiCalendarAttendeesDtoBuilder notAllowPropose(Boolean notAllowPropose) {
        this.model.notAllowPropose(notAllowPropose);
        return this;
    }
    /**
     * Set MapiCalendarAttendeesDto.responseRequested and return builder.
     * @param responseRequested Value indicating whether a response is requested to a Message object.             
     * @return builder
    **/
    public MapiCalendarAttendeesDtoBuilder responseRequested(Boolean responseRequested) {
        this.model.responseRequested(responseRequested);
        return this;
    }
}
