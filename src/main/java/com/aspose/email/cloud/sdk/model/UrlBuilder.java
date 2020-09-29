/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="UrlBuilder.java">
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
 *  Url builder.
 */
public class UrlBuilder {
    private Url model;
    public UrlBuilder(Url model) {
        this.model = model;
    }

    /**
     * Build Url instance.
     */
    public Url build() {
        Url tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set Url.category and return builder.
     * @param category Url category.             
     * @return builder
    **/
    public UrlBuilder category(EnumWithCustomOfUrlCategory category) {
        this.model.category(category);
        return this;
    }
    /**
     * Set Url.preferred and return builder.
     * @param preferred Defines whether url is preferred.             
     * @return builder
    **/
    public UrlBuilder preferred(Boolean preferred) {
        this.model.preferred(preferred);
        return this;
    }
    /**
     * Set Url.href and return builder.
     * @param href URL.             
     * @return builder
    **/
    public UrlBuilder href(String href) {
        this.model.href(href);
        return this;
    }
}
