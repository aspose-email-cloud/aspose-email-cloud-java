/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AiNameFormatRequest.java">
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
 * Class that holds parameters for AiNameApi.format request invocation.
 **/   
public class AiNameFormatRequest
{
    /**
     * Initializes a new instance of the AiNameFormatRequest class.
     **/
    public AiNameFormatRequest()
    {
    }

    /**
     * Initializes a new instance of the AiNameFormatRequest class.   
     * @param name A name to format.
     * @param language An ISO-639 code of the language; either 639-1 or 639-3 (e.g. \&quot;it\&quot; or \&quot;ita\&quot; for Italian).             
     * @param location A geographic code such as an ISO-3166 two letter country code, for example \&quot;FR\&quot; for France.             
     * @param encoding A character encoding name.
     * @param script A writing system code; starts with the ISO-15924 script name.
     * @param format Format of the name. Predefined format can be used by ID, or custom format can be specified. Predefined formats:      /format/default/ (&#x3D; &#39;%t%F%m%N%L%p&#39;)     /format/FN+LN/ (&#x3D; &#39;%F%L&#39;)     /format/title+FN+LN/ (&#x3D; &#39;%t%F%L&#39;)     /format/FN+MN+LN/ (&#x3D; &#39;%F%M%N%L&#39;)     /format/title+FN+MN+LN/ (&#x3D; &#39;%t%F%M%N%L&#39;)     /format/FN+MI+LN/ (&#x3D; &#39;%F%m%N%L&#39;)     /format/title+FN+MI+LN/ (&#x3D; &#39;%t%F%m%N%L&#39;)     /format/LN/ (&#x3D; &#39;%L&#39;)     /format/title+LN/ (&#x3D; &#39;%t%L&#39;)     /format/LN+FN+MN/ (&#x3D; &#39;%L,%F%M%N&#39;)     /format/LN+title+FN+MN/ (&#x3D; &#39;%L,%t%F%M%N&#39;)     /format/LN+FN+MI/ (&#x3D; &#39;%L,%F%m%N&#39;)     /format/LN+title+FN+MI/ (&#x3D; &#39;%L,%t%F%m%N&#39;)  Custom format string - custom combination of characters and the next term placeholders:      &#39;%t&#39; - Title (prefix)     &#39;%F&#39; - First name     &#39;%f&#39; - First initial     &#39;%M&#39; - Middle name(s)     &#39;%m&#39; - Middle initial(s)     &#39;%N&#39; - Nickname     &#39;%L&#39; - Last name     &#39;%l&#39; - Last initial     &#39;%p&#39; - Postfix  If no value for format option was provided, its default value is &#39;%t%F%m%N%L%p&#39;             
     * @param style Name writing style. Enum, available values: Formal, Informal, Legal, Academic
     **/
    public AiNameFormatRequest(String name, String language, String location, String encoding, String script, String format, String style)             
    {
        this.name = name;
        this.language = language;
        this.location = location;
        this.encoding = encoding;
        this.script = script;
        this.format = format;
        this.style = style;
    }
        
    private String name;

    /**
     * Getter for: A name to format.
     **/
    public String getName() {
        return name;
    }

    /**
     * Setter for: A name to format.
     **/
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Setter for: A name to format.
     **/
    public AiNameFormatRequest name(String value) {
        this.name = value;
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
    public AiNameFormatRequest language(String value) {
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
    public AiNameFormatRequest location(String value) {
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
    public AiNameFormatRequest encoding(String value) {
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
    public AiNameFormatRequest script(String value) {
        this.script = value;
        return this;
    }

    private String format;

    /**
     * Getter for: Format of the name. Predefined format can be used by ID, or custom format can be specified. Predefined formats:      /format/default/ (= '%t%F%m%N%L%p')     /format/FN+LN/ (= '%F%L')     /format/title+FN+LN/ (= '%t%F%L')     /format/FN+MN+LN/ (= '%F%M%N%L')     /format/title+FN+MN+LN/ (= '%t%F%M%N%L')     /format/FN+MI+LN/ (= '%F%m%N%L')     /format/title+FN+MI+LN/ (= '%t%F%m%N%L')     /format/LN/ (= '%L')     /format/title+LN/ (= '%t%L')     /format/LN+FN+MN/ (= '%L,%F%M%N')     /format/LN+title+FN+MN/ (= '%L,%t%F%M%N')     /format/LN+FN+MI/ (= '%L,%F%m%N')     /format/LN+title+FN+MI/ (= '%L,%t%F%m%N')  Custom format string - custom combination of characters and the next term placeholders:      '%t' - Title (prefix)     '%F' - First name     '%f' - First initial     '%M' - Middle name(s)     '%m' - Middle initial(s)     '%N' - Nickname     '%L' - Last name     '%l' - Last initial     '%p' - Postfix  If no value for format option was provided, its default value is '%t%F%m%N%L%p'             
     **/
    public String getFormat() {
        return format;
    }

    /**
     * Setter for: Format of the name. Predefined format can be used by ID, or custom format can be specified. Predefined formats:      /format/default/ (= '%t%F%m%N%L%p')     /format/FN+LN/ (= '%F%L')     /format/title+FN+LN/ (= '%t%F%L')     /format/FN+MN+LN/ (= '%F%M%N%L')     /format/title+FN+MN+LN/ (= '%t%F%M%N%L')     /format/FN+MI+LN/ (= '%F%m%N%L')     /format/title+FN+MI+LN/ (= '%t%F%m%N%L')     /format/LN/ (= '%L')     /format/title+LN/ (= '%t%L')     /format/LN+FN+MN/ (= '%L,%F%M%N')     /format/LN+title+FN+MN/ (= '%L,%t%F%M%N')     /format/LN+FN+MI/ (= '%L,%F%m%N')     /format/LN+title+FN+MI/ (= '%L,%t%F%m%N')  Custom format string - custom combination of characters and the next term placeholders:      '%t' - Title (prefix)     '%F' - First name     '%f' - First initial     '%M' - Middle name(s)     '%m' - Middle initial(s)     '%N' - Nickname     '%L' - Last name     '%l' - Last initial     '%p' - Postfix  If no value for format option was provided, its default value is '%t%F%m%N%L%p'             
     **/
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Setter for: Format of the name. Predefined format can be used by ID, or custom format can be specified. Predefined formats:      /format/default/ (= '%t%F%m%N%L%p')     /format/FN+LN/ (= '%F%L')     /format/title+FN+LN/ (= '%t%F%L')     /format/FN+MN+LN/ (= '%F%M%N%L')     /format/title+FN+MN+LN/ (= '%t%F%M%N%L')     /format/FN+MI+LN/ (= '%F%m%N%L')     /format/title+FN+MI+LN/ (= '%t%F%m%N%L')     /format/LN/ (= '%L')     /format/title+LN/ (= '%t%L')     /format/LN+FN+MN/ (= '%L,%F%M%N')     /format/LN+title+FN+MN/ (= '%L,%t%F%M%N')     /format/LN+FN+MI/ (= '%L,%F%m%N')     /format/LN+title+FN+MI/ (= '%L,%t%F%m%N')  Custom format string - custom combination of characters and the next term placeholders:      '%t' - Title (prefix)     '%F' - First name     '%f' - First initial     '%M' - Middle name(s)     '%m' - Middle initial(s)     '%N' - Nickname     '%L' - Last name     '%l' - Last initial     '%p' - Postfix  If no value for format option was provided, its default value is '%t%F%m%N%L%p'             
     **/
    public AiNameFormatRequest format(String value) {
        this.format = value;
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
    public AiNameFormatRequest style(String value) {
        this.style = value;
        return this;
    }

}

