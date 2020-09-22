/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ContentTypeBuilder.java">
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
 *  ContentType builder.
 */
public class ContentTypeBuilder {
    private final ContentType model;
    public ContentTypeBuilder(ContentType model) {
        this.model = model;
    }

    /**
     * Build ContentType instance.
     */
    public ContentType build() {
        return model;
    }
    /**
     * Set ContentType.boundary and return builder.
     * @param boundary The boundary parameter included in the Content-Type header.             
     * @return builder
    **/
    public ContentTypeBuilder boundary(String boundary) {
        this.model.boundary(boundary);
        return this;
    }
    /**
     * Set ContentType.charSet and return builder.
     * @param charSet CharSet parameter.             
     * @return builder
    **/
    public ContentTypeBuilder charSet(String charSet) {
        this.model.charSet(charSet);
        return this;
    }
    /**
     * Set ContentType.mediaType and return builder.
     * @param mediaType The internet media type.             
     * @return builder
    **/
    public ContentTypeBuilder mediaType(String mediaType) {
        this.model.mediaType(mediaType);
        return this;
    }
    /**
     * Set ContentType.name and return builder.
     * @param name Name parameter.             
     * @return builder
    **/
    public ContentTypeBuilder name(String name) {
        this.model.name(name);
        return this;
    }
    /**
     * Set ContentType.parameters and return builder.
     * @param parameters Full list of parameters             
     * @return builder
    **/
    public ContentTypeBuilder parameters(List<ContentTypeParameter> parameters) {
        this.model.parameters(parameters);
        return this;
    }
}
