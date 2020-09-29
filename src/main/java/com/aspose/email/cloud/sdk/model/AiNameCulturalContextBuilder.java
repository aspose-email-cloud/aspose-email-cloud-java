/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AiNameCulturalContextBuilder.java">
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
 *  AiNameCulturalContext builder.
 */
public class AiNameCulturalContextBuilder {
    private AiNameCulturalContext model;
    public AiNameCulturalContextBuilder(AiNameCulturalContext model) {
        this.model = model;
    }

    /**
     * Build AiNameCulturalContext instance.
     */
    public AiNameCulturalContext build() {
        AiNameCulturalContext tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set AiNameCulturalContext.language and return builder.
     * @param language An ISO-639 code of the language; either 639-1 or 639-3 (e.g. \&quot;it\&quot; or \&quot;ita\&quot; for Italian)             
     * @return builder
    **/
    public AiNameCulturalContextBuilder language(String language) {
        this.model.language(language);
        return this;
    }
    /**
     * Set AiNameCulturalContext.location and return builder.
     * @param location A geographic code such as an ISO-3166 two letter country code, for example \&quot;FR\&quot; for France             
     * @return builder
    **/
    public AiNameCulturalContextBuilder location(String location) {
        this.model.location(location);
        return this;
    }
    /**
     * Set AiNameCulturalContext.script and return builder.
     * @param script A writing system code; starts with the ISO-15924 script name             
     * @return builder
    **/
    public AiNameCulturalContextBuilder script(String script) {
        this.model.script(script);
        return this;
    }
    /**
     * Set AiNameCulturalContext.encoding and return builder.
     * @param encoding A character encoding name             
     * @return builder
    **/
    public AiNameCulturalContextBuilder encoding(String encoding) {
        this.model.encoding(encoding);
        return this;
    }
    /**
     * Set AiNameCulturalContext.style and return builder.
     * @param style Name writing style. Enum, available values: Formal, Informal, Legal, Academic
     * @return builder
    **/
    public AiNameCulturalContextBuilder style(String style) {
        this.model.style(style);
        return this;
    }
}
