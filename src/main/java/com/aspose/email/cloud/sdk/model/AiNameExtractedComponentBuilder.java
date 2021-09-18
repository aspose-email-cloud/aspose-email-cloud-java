/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AiNameExtractedComponentBuilder.java">
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
 *  AiNameExtractedComponent builder.
 */
public class AiNameExtractedComponentBuilder {
    private AiNameExtractedComponent model;
    public AiNameExtractedComponentBuilder(AiNameExtractedComponent model) {
        this.model = model;
    }

    /**
     * Build AiNameExtractedComponent instance.
     */
    public AiNameExtractedComponent build() {
        AiNameExtractedComponent tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set AiNameExtractedComponent.category and return builder.
     * @param category Extracted from email address name component category./nEnum, available values: Unknown, GivenName, Surname, SomeName, NoName, Initial
     * @return builder
    **/
    public AiNameExtractedComponentBuilder category(String category) {
        this.model.category(category);
        return this;
    }
    /**
     * Set AiNameExtractedComponent.value and return builder.
     * @param value Extracted value             
     * @return builder
    **/
    public AiNameExtractedComponentBuilder value(String value) {
        this.model.value(value);
        return this;
    }
}
