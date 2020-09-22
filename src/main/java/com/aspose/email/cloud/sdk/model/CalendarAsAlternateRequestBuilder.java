/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CalendarAsAlternateRequestBuilder.java">
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
 *  CalendarAsAlternateRequest builder.
 */
public class CalendarAsAlternateRequestBuilder {
    private final CalendarAsAlternateRequest model;
    public CalendarAsAlternateRequestBuilder(CalendarAsAlternateRequest model) {
        this.model = model;
    }

    /**
     * Build CalendarAsAlternateRequest instance.
     */
    public CalendarAsAlternateRequest build() {
        return model;
    }
    /**
     * Set CalendarAsAlternateRequest.value and return builder.
     * @param value iCalendar document model             
     * @return builder
    **/
    public CalendarAsAlternateRequestBuilder value(CalendarDto value) {
        this.model.value(value);
        return this;
    }
    /**
     * Set CalendarAsAlternateRequest.action and return builder.
     * @param action iCalendar actions. Enum, available values: Create, Update, Cancel
     * @return builder
    **/
    public CalendarAsAlternateRequestBuilder action(String action) {
        this.model.action(action);
        return this;
    }
    /**
     * Set CalendarAsAlternateRequest.sequenceId and return builder.
     * @param sequenceId iCalendar sequence id             
     * @return builder
    **/
    public CalendarAsAlternateRequestBuilder sequenceId(String sequenceId) {
        this.model.sequenceId(sequenceId);
        return this;
    }
}
