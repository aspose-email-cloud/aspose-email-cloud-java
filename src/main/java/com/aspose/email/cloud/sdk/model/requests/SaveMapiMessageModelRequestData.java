
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="SaveMapiMessageModelRequestData.java">
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

package com.aspose.email.cloud.sdk.model.requests;
import com.aspose.email.cloud.sdk.model.*;

/**
* Class that holds parameters for EmailApi.saveMapiMessageModel request invocation.
**/   
public class SaveMapiMessageModelRequestData
{
    /**
    * Initializes a new instance of the SaveMapiMessageModelRequestData class.   
    * @param format File format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html
    * @param name Message file name in storage.
    * @param rq Message create/update request.
    **/
    public SaveMapiMessageModelRequestData(String format, String name, StorageModelRqOfMapiMessageDto rq)             
    {
        this.format = format;
        this.name = name;
        this.rq = rq;
    }
        
    /**
    * File format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html
    **/
    public String format;

    /**
    * Message file name in storage.
    **/
    public String name;

    /**
    * Message create/update request.
    **/
    public StorageModelRqOfMapiMessageDto rq;
}

