/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AiNameFormatRequestBuilder.java">
*   Copyright (c) 2018-2023 Aspose Pty Ltd. All rights reserved.
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

/**
 *  AiNameFormatRequest builder.
 */
public class AiNameFormatRequestBuilder {
    private AiNameFormatRequest model;
    public AiNameFormatRequestBuilder(AiNameFormatRequest model) {
        this.model = model;
    }

    /**
     * Build AiNameFormatRequest instance.
     */
    public AiNameFormatRequest build() {
        AiNameFormatRequest tempModel = model;
        model = null;
        return tempModel;
    }

    /**
     * Setter for: A name to format.
     **/
    public AiNameFormatRequestBuilder name(String name) {
        this.model.name(name);
        return this;
    }
    /**
     * Setter for: An ISO-639 code of the language; either 639-1 or 639-3 (e.g. \"it\" or \"ita\" for Italian).             
     **/
    public AiNameFormatRequestBuilder language(String language) {
        this.model.language(language);
        return this;
    }
    /**
     * Setter for: A geographic code such as an ISO-3166 two letter country code, for example \"FR\" for France.             
     **/
    public AiNameFormatRequestBuilder location(String location) {
        this.model.location(location);
        return this;
    }
    /**
     * Setter for: A character encoding name.
     **/
    public AiNameFormatRequestBuilder encoding(String encoding) {
        this.model.encoding(encoding);
        return this;
    }
    /**
     * Setter for: A writing system code; starts with the ISO-15924 script name.
     **/
    public AiNameFormatRequestBuilder script(String script) {
        this.model.script(script);
        return this;
    }
    /**
     * Setter for: Format of the name. Predefined format can be used by ID, or custom format can be specified. Predefined formats:      /format/default/ (= '%t%F%m%N%L%p')     /format/FN+LN/ (= '%F%L')     /format/title+FN+LN/ (= '%t%F%L')     /format/FN+MN+LN/ (= '%F%M%N%L')     /format/title+FN+MN+LN/ (= '%t%F%M%N%L')     /format/FN+MI+LN/ (= '%F%m%N%L')     /format/title+FN+MI+LN/ (= '%t%F%m%N%L')     /format/LN/ (= '%L')     /format/title+LN/ (= '%t%L')     /format/LN+FN+MN/ (= '%L,%F%M%N')     /format/LN+title+FN+MN/ (= '%L,%t%F%M%N')     /format/LN+FN+MI/ (= '%L,%F%m%N')     /format/LN+title+FN+MI/ (= '%L,%t%F%m%N')  Custom format string - custom combination of characters and the next term placeholders:      '%t' - Title (prefix)     '%F' - First name     '%f' - First initial     '%M' - Middle name(s)     '%m' - Middle initial(s)     '%N' - Nickname     '%L' - Last name     '%l' - Last initial     '%p' - Postfix  If no value for format option was provided, its default value is '%t%F%m%N%L%p'             
     **/
    public AiNameFormatRequestBuilder format(String format) {
        this.model.format(format);
        return this;
    }
    /**
     * Setter for: Name writing style. Enum, available values: Formal, Informal, Legal, Academic
     **/
    public AiNameFormatRequestBuilder style(String style) {
        this.model.style(style);
        return this;
    }
}
