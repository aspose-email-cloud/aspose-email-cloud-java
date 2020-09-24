/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmailThreadBuilder.java">
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
 *  EmailThread builder.
 */
public class EmailThreadBuilder {
    private final EmailThread model;
    public EmailThreadBuilder(EmailThread model) {
        this.model = model;
    }

    /**
     * Build EmailThread instance.
     */
    public EmailThread build() {
        EmailThread tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set EmailThread.id and return builder.
     * @param id Thread identifier             
     * @return builder
    **/
    public EmailThreadBuilder id(String id) {
        this.model.id(id);
        return this;
    }
    /**
     * Set EmailThread.subject and return builder.
     * @param subject Thread subject             
     * @return builder
    **/
    public EmailThreadBuilder subject(String subject) {
        this.model.subject(subject);
        return this;
    }
    /**
     * Set EmailThread.messages and return builder.
     * @param messages List of messages in thread             
     * @return builder
    **/
    public EmailThreadBuilder messages(List<EmailDto> messages) {
        this.model.messages(messages);
        return this;
    }
    /**
     * Set EmailThread.folder and return builder.
     * @param folder Thread folder location             
     * @return builder
    **/
    public EmailThreadBuilder folder(String folder) {
        this.model.folder(folder);
        return this;
    }
}
