/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AiNameParseEmailAddressRequest.java">
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
 * Class that holds parameters for AiNameApi.parseEmailAddress request invocation.
 **/   
public class AiNameParseEmailAddressRequest
{
    /**
     * Initializes a new instance of the AiNameParseEmailAddressRequest class.
     **/
    public AiNameParseEmailAddressRequest()
    {
    }

    /**
     * Initializes a new instance of the AiNameParseEmailAddressRequest class.   
     * @param emailAddress Email address to parse.
     * @param language An ISO-639 code of the language; either 639-1 or 639-3 (e.g. \&quot;it\&quot; or \&quot;ita\&quot; for Italian).             
     * @param location A geographic code such as an ISO-3166 two letter country code, for example \&quot;FR\&quot; for France.             
     * @param encoding A character encoding name.
     * @param script A writing system code; starts with the ISO-15924 script name.
     * @param style Name writing style. Enum, available values: Formal, Informal, Legal, Academic
     **/
    public AiNameParseEmailAddressRequest(String emailAddress, String language, String location, String encoding, String script, String style)             
    {
        this.emailAddress = emailAddress;
        this.language = language;
        this.location = location;
        this.encoding = encoding;
        this.script = script;
        this.style = style;
    }
        
    private String emailAddress;

    /**
     * Getter for: Email address to parse.
     **/
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Setter for: Email address to parse.
     **/
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Setter for: Email address to parse.
     **/
    public AiNameParseEmailAddressRequest emailAddress(String value) {
        this.emailAddress = value;
        return this;
    }

    private String language;

    /**
     * Getter for: An ISO-639 code of the language; either 639-1 or 639-3 (e.g. \"it\" or \"ita\" for Italian).             
     **/
    public String getLanguage() {
        return language;
    }

    /**
     * Setter for: An ISO-639 code of the language; either 639-1 or 639-3 (e.g. \"it\" or \"ita\" for Italian).             
     **/
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Setter for: An ISO-639 code of the language; either 639-1 or 639-3 (e.g. \"it\" or \"ita\" for Italian).             
     **/
    public AiNameParseEmailAddressRequest language(String value) {
        this.language = value;
        return this;
    }

    private String location;

    /**
     * Getter for: A geographic code such as an ISO-3166 two letter country code, for example \"FR\" for France.             
     **/
    public String getLocation() {
        return location;
    }

    /**
     * Setter for: A geographic code such as an ISO-3166 two letter country code, for example \"FR\" for France.             
     **/
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Setter for: A geographic code such as an ISO-3166 two letter country code, for example \"FR\" for France.             
     **/
    public AiNameParseEmailAddressRequest location(String value) {
        this.location = value;
        return this;
    }

    private String encoding;

    /**
     * Getter for: A character encoding name.
     **/
    public String getEncoding() {
        return encoding;
    }

    /**
     * Setter for: A character encoding name.
     **/
    public void setEncoding(String value) {
        this.encoding = value;
    }

    /**
     * Setter for: A character encoding name.
     **/
    public AiNameParseEmailAddressRequest encoding(String value) {
        this.encoding = value;
        return this;
    }

    private String script;

    /**
     * Getter for: A writing system code; starts with the ISO-15924 script name.
     **/
    public String getScript() {
        return script;
    }

    /**
     * Setter for: A writing system code; starts with the ISO-15924 script name.
     **/
    public void setScript(String value) {
        this.script = value;
    }

    /**
     * Setter for: A writing system code; starts with the ISO-15924 script name.
     **/
    public AiNameParseEmailAddressRequest script(String value) {
        this.script = value;
        return this;
    }

    private String style;

    /**
     * Getter for: Name writing style. Enum, available values: Formal, Informal, Legal, Academic
     **/
    public String getStyle() {
        return style;
    }

    /**
     * Setter for: Name writing style. Enum, available values: Formal, Informal, Legal, Academic
     **/
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Setter for: Name writing style. Enum, available values: Formal, Informal, Legal, Academic
     **/
    public AiNameParseEmailAddressRequest style(String value) {
        this.style = value;
        return this;
    }

}


