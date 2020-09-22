/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AiNameFormattedBuilder.java">
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
 *  AiNameFormatted builder.
 */
public class AiNameFormattedBuilder {
    private final AiNameFormatted model;
    public AiNameFormattedBuilder(AiNameFormatted model) {
        this.model = model;
    }

    /**
     * Build AiNameFormatted instance.
     */
    public AiNameFormatted build() {
        return model;
    }
    /**
     * Set AiNameFormatted.name and return builder.
     * @param name Formatted name value             
     * @return builder
    **/
    public AiNameFormattedBuilder name(String name) {
        this.model.name(name);
        return this;
    }
    /**
     * Set AiNameFormatted.comments and return builder.
     * @param comments Usually empty; can contain extra message describing some issue occurred during the formatting             
     * @return builder
    **/
    public AiNameFormattedBuilder comments(String comments) {
        this.model.comments(comments);
        return this;
    }
}
