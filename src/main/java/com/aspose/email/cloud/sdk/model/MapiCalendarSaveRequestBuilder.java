/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiCalendarSaveRequestBuilder.java">
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
 *  MapiCalendarSaveRequest builder.
 */
public class MapiCalendarSaveRequestBuilder {
    private final MapiCalendarSaveRequest model;
    public MapiCalendarSaveRequestBuilder(MapiCalendarSaveRequest model) {
        this.model = model;
    }

    /**
     * Build MapiCalendarSaveRequest instance.
     */
    public MapiCalendarSaveRequest build() {
        MapiCalendarSaveRequest tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set MapiCalendarSaveRequest.storageFile and return builder.
     * @param storageFile 
     * @return builder
    **/
    public MapiCalendarSaveRequestBuilder storageFile(StorageFileLocation storageFile) {
        this.model.storageFile(storageFile);
        return this;
    }
    /**
     * Set MapiCalendarSaveRequest.value and return builder.
     * @param value 
     * @return builder
    **/
    public MapiCalendarSaveRequestBuilder value(MapiCalendarDto value) {
        this.model.value(value);
        return this;
    }
    /**
     * Set MapiCalendarSaveRequest.format and return builder.
     * @param format Calendar file format Enum, available values: Ics, Msg
     * @return builder
    **/
    public MapiCalendarSaveRequestBuilder format(String format) {
        this.model.format(format);
        return this;
    }
}
