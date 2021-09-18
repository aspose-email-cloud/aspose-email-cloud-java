/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AiNameParseEmailAddressRequestBuilder.java">
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

/**
 *  AiNameParseEmailAddressRequest builder.
 */
public class AiNameParseEmailAddressRequestBuilder {
    private AiNameParseEmailAddressRequest model;
    public AiNameParseEmailAddressRequestBuilder(AiNameParseEmailAddressRequest model) {
        this.model = model;
    }

    /**
     * Build AiNameParseEmailAddressRequest instance.
     */
    public AiNameParseEmailAddressRequest build() {
        AiNameParseEmailAddressRequest tempModel = model;
        model = null;
        return tempModel;
    }

    /**
     * Setter for: Email address to parse.
     **/
    public AiNameParseEmailAddressRequestBuilder emailAddress(String emailAddress) {
        this.model.emailAddress(emailAddress);
        return this;
    }
    /**
     * Setter for: An ISO-639 code of the language; either 639-1 or 639-3 (e.g. \"it\" or \"ita\" for Italian).             
     **/
    public AiNameParseEmailAddressRequestBuilder language(String language) {
        this.model.language(language);
        return this;
    }
    /**
     * Setter for: A geographic code such as an ISO-3166 two letter country code, for example \"FR\" for France.             
     **/
    public AiNameParseEmailAddressRequestBuilder location(String location) {
        this.model.location(location);
        return this;
    }
    /**
     * Setter for: A character encoding name.
     **/
    public AiNameParseEmailAddressRequestBuilder encoding(String encoding) {
        this.model.encoding(encoding);
        return this;
    }
    /**
     * Setter for: A writing system code; starts with the ISO-15924 script name.
     **/
    public AiNameParseEmailAddressRequestBuilder script(String script) {
        this.model.script(script);
        return this;
    }
    /**
     * Setter for: Name writing style./nEnum, available values: Formal, Informal, Legal, Academic
     **/
    public AiNameParseEmailAddressRequestBuilder style(String style) {
        this.model.style(style);
        return this;
    }
}
