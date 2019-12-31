
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AiNameGenderizeRequestData.java">
*   Copyright (c) 2018-2019 Aspose Pty Ltd. All rights reserved.
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

package com.aspose.email.cloud.sdk.model.requests;
import com.aspose.email.cloud.sdk.model.*;

/**
* Class that holds parameters for EmailApi.aiNameGenderize request invocation.
**/   
public class AiNameGenderizeRequestData
{
    /**
    * Initializes a new instance of the AiNameGenderizeRequestData class.   
    * @param name A name to parse (required)
    * @param language An ISO-639 code of the language; either 639-1 or 639-3 (e.g. \&quot;it\&quot; or \&quot;ita\&quot; for Italian)
    * @param location A geographic code such as an ISO-3166 two letter country code, for example \&quot;FR\&quot; for France
    * @param encoding A character encoding name
    * @param script A writing system code; starts with the ISO-15924 script name
    * @param style Name writing style. Enum, available values: Formal, Informal, Legal, Academic
    **/
    public AiNameGenderizeRequestData(String name, String language, String location, String encoding, String script, String style)             
    {
        this.name = name;
        this.language = language;
        this.location = location;
        this.encoding = encoding;
        this.script = script;
        this.style = style;
    }
        
    /**
    * A name to parse (required)
    **/
    public String name;

    /**
    * An ISO-639 code of the language; either 639-1 or 639-3 (e.g. \"it\" or \"ita\" for Italian)
    **/
    public String language;

    /**
    * A geographic code such as an ISO-3166 two letter country code, for example \"FR\" for France
    **/
    public String location;

    /**
    * A character encoding name
    **/
    public String encoding;

    /**
    * A writing system code; starts with the ISO-15924 script name
    **/
    public String script;

    /**
    * Name writing style. Enum, available values: Formal, Informal, Legal, Academic
    **/
    public String style;
}

