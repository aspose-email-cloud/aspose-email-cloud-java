/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ErrorDetailsBuilder.java">
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
 *  ErrorDetails builder.
 */
public class ErrorDetailsBuilder {
    private ErrorDetails model;
    public ErrorDetailsBuilder(ErrorDetails model) {
        this.model = model;
    }

    /**
     * Build ErrorDetails instance.
     */
    public ErrorDetails build() {
        ErrorDetails tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set ErrorDetails.requestId and return builder.
     * @param requestId The request id
     * @return builder
    **/
    public ErrorDetailsBuilder requestId(String requestId) {
        this.model.requestId(requestId);
        return this;
    }
    /**
     * Set ErrorDetails.date and return builder.
     * @param date Date
     * @return builder
    **/
    public ErrorDetailsBuilder date(Date date) {
        this.model.date(date);
        return this;
    }
}