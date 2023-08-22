/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AiNameMatchRequest.java">
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
 * Class that holds parameters for AiNameApi.match request invocation.
 **/   
public class AiNameMatchRequest
{
    /**
     * Initializes a new instance of the AiNameMatchRequest class.
     **/
    public AiNameMatchRequest()
    {
    }

    /**
     * Initializes a new instance of the AiNameMatchRequest class.   
     * @param name A name to match.
     * @param otherName Another name to match.
     * @param language An ISO-639 code of the language; either 639-1 or 639-3 (e.g. \&quot;it\&quot; or \&quot;ita\&quot; for Italian).             
     * @param location A geographic code such as an ISO-3166 two letter country code, for example \&quot;FR\&quot; for France.             
     * @param encoding A character encoding name.
     * @param script A writing system code; starts with the ISO-15924 script name.
     * @param style Name writing style. Enum, available values: Formal, Informal, Legal, Academic
     **/
    public AiNameMatchRequest(String name, String otherName, String language, String location, String encoding, String script, String style)             
    {
        this.name = name;
        this.otherName = otherName;
        this.language = language;
        this.location = location;
        this.encoding = encoding;
        this.script = script;
        this.style = style;
    }
        
    private String name;

    /**
     * Getter for: A name to match.
     **/
    public String getName() {
        return name;
    }

    /**
     * Setter for: A name to match.
     **/
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Setter for: A name to match.
     **/
    public AiNameMatchRequest name(String value) {
        this.name = value;
        return this;
    }

    private String otherName;

    /**
     * Getter for: Another name to match.
     **/
    public String getOtherName() {
        return otherName;
    }

    /**
     * Setter for: Another name to match.
     **/
    public void setOtherName(String value) {
        this.otherName = value;
    }

    /**
     * Setter for: Another name to match.
     **/
    public AiNameMatchRequest otherName(String value) {
        this.otherName = value;
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
    public AiNameMatchRequest language(String value) {
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
    public AiNameMatchRequest location(String value) {
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
    public AiNameMatchRequest encoding(String value) {
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
    public AiNameMatchRequest script(String value) {
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
    public AiNameMatchRequest style(String value) {
        this.style = value;
        return this;
    }

}

