/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AiBcrParseRequest.java">
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
 * Class that holds parameters for AiBcrApi.parse request invocation.
 **/   
public class AiBcrParseRequest
{
    /**
     * Initializes a new instance of the AiBcrParseRequest class.
     **/
    public AiBcrParseRequest()
    {
    }

    /**
     * Initializes a new instance of the AiBcrParseRequest class.   
     * @param file File to parse
     * @param countries Comma-separated codes of countries.
     * @param languages Comma-separated ISO-639 codes of languages (either 639-1 or 639-3; i.e. \&quot;it\&quot; or \&quot;ita\&quot; for Italian); it&#39;s \&quot;\&quot; by default.             
     * @param isSingle Determines that image contains single VCard or more.
     **/
    public AiBcrParseRequest(byte[] file, String countries, String languages, Boolean isSingle)             
    {
        this.file = file;
        this.countries = countries;
        this.languages = languages;
        this.isSingle = isSingle;
    }
        
    private byte[] file;

    /**
     * Getter for: File to parse
     **/
    public byte[] getFile() {
        return file;
    }

    /**
     * Setter for: File to parse
     **/
    public void setFile(byte[] value) {
        this.file = value;
    }

    /**
     * Setter for: File to parse
     **/
    public AiBcrParseRequest file(byte[] value) {
        this.file = value;
        return this;
    }

    private String countries;

    /**
     * Getter for: Comma-separated codes of countries.
     **/
    public String getCountries() {
        return countries;
    }

    /**
     * Setter for: Comma-separated codes of countries.
     **/
    public void setCountries(String value) {
        this.countries = value;
    }

    /**
     * Setter for: Comma-separated codes of countries.
     **/
    public AiBcrParseRequest countries(String value) {
        this.countries = value;
        return this;
    }

    private String languages;

    /**
     * Getter for: Comma-separated ISO-639 codes of languages (either 639-1 or 639-3; i.e. \"it\" or \"ita\" for Italian); it's \"\" by default.             
     **/
    public String getLanguages() {
        return languages;
    }

    /**
     * Setter for: Comma-separated ISO-639 codes of languages (either 639-1 or 639-3; i.e. \"it\" or \"ita\" for Italian); it's \"\" by default.             
     **/
    public void setLanguages(String value) {
        this.languages = value;
    }

    /**
     * Setter for: Comma-separated ISO-639 codes of languages (either 639-1 or 639-3; i.e. \"it\" or \"ita\" for Italian); it's \"\" by default.             
     **/
    public AiBcrParseRequest languages(String value) {
        this.languages = value;
        return this;
    }

    private Boolean isSingle;

    /**
     * Getter for: Determines that image contains single VCard or more.
     **/
    public Boolean getIsSingle() {
        return isSingle;
    }

    /**
     * Setter for: Determines that image contains single VCard or more.
     **/
    public void setIsSingle(Boolean value) {
        this.isSingle = value;
    }

    /**
     * Setter for: Determines that image contains single VCard or more.
     **/
    public AiBcrParseRequest isSingle(Boolean value) {
        this.isSingle = value;
        return this;
    }

}


