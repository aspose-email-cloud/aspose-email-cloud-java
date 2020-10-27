/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="LinkedResourceBuilder.java">
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
 *  LinkedResource builder.
 */
public class LinkedResourceBuilder {
    private LinkedResource model;
    public LinkedResourceBuilder(LinkedResource model) {
        this.model = model;
    }

    /**
     * Build LinkedResource instance.
     */
    public LinkedResource build() {
        LinkedResource tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set LinkedResource.base64Data and return builder.
     * @param base64Data Attachment file content as Base64 string.             
     * @return builder
    **/
    public LinkedResourceBuilder base64Data(String base64Data) {
        this.model.base64Data(base64Data);
        return this;
    }
    /**
     * Set LinkedResource.contentId and return builder.
     * @param contentId Attachment content id             
     * @return builder
    **/
    public LinkedResourceBuilder contentId(String contentId) {
        this.model.contentId(contentId);
        return this;
    }
    /**
     * Set LinkedResource.contentType and return builder.
     * @param contentType Content type             
     * @return builder
    **/
    public LinkedResourceBuilder contentType(ContentType contentType) {
        this.model.contentType(contentType);
        return this;
    }
    /**
     * Set LinkedResource.headers and return builder.
     * @param headers Attachment headers.             
     * @return builder
    **/
    public LinkedResourceBuilder headers(Map<String, String> headers) {
        this.model.headers(headers);
        return this;
    }
    /**
     * Set LinkedResource.contentLink and return builder.
     * @param contentLink URI that the resource must match.             
     * @return builder
    **/
    public LinkedResourceBuilder contentLink(String contentLink) {
        this.model.contentLink(contentLink);
        return this;
    }
}
