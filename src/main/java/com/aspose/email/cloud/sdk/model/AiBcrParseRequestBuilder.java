/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AiBcrParseRequestBuilder.java">
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
 *  AiBcrParseRequest builder.
 */
public class AiBcrParseRequestBuilder {
    private AiBcrParseRequest model;
    public AiBcrParseRequestBuilder(AiBcrParseRequest model) {
        this.model = model;
    }

    /**
     * Build AiBcrParseRequest instance.
     */
    public AiBcrParseRequest build() {
        AiBcrParseRequest tempModel = model;
        model = null;
        return tempModel;
    }

    /**
     * Setter for: File to parse
     **/
    public AiBcrParseRequestBuilder file(byte[] file) {
        this.model.file(file);
        return this;
    }
    /**
     * Setter for: Comma-separated codes of countries.
     **/
    public AiBcrParseRequestBuilder countries(String countries) {
        this.model.countries(countries);
        return this;
    }
    /**
     * Setter for: Comma-separated ISO-639 codes of languages (either 639-1 or 639-3; i.e. \"it\" or \"ita\" for Italian); it's \"\" by default.             
     **/
    public AiBcrParseRequestBuilder languages(String languages) {
        this.model.languages(languages);
        return this;
    }
    /**
     * Setter for: Determines that image contains single VCard or more.
     **/
    public AiBcrParseRequestBuilder isSingle(Boolean isSingle) {
        this.model.isSingle(isSingle);
        return this;
    }
}
