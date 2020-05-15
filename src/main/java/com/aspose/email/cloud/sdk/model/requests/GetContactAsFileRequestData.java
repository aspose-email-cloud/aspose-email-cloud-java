
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="GetContactAsFileRequestData.java">
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
* Class that holds parameters for EmailApi.getContactAsFile request invocation.
**/   
public class GetContactAsFileRequestData
{
    /**
    * Initializes a new instance of the GetContactAsFileRequestData class.   
    * @param fileName Calendar document file name
    * @param destinationFormat File format Enum, available values: VCard, WebDav, Msg
    * @param format File format to convert from Enum, available values: VCard, WebDav, Msg
    * @param storage Storage name
    * @param folder Path to folder in storage
    **/
    public GetContactAsFileRequestData(String fileName, String destinationFormat, String format, String storage, String folder)             
    {
        this.fileName = fileName;
        this.destinationFormat = destinationFormat;
        this.format = format;
        this.storage = storage;
        this.folder = folder;
    }
        
    /**
    * Calendar document file name
    **/
    public String fileName;

    /**
    * File format Enum, available values: VCard, WebDav, Msg
    **/
    public String destinationFormat;

    /**
    * File format to convert from Enum, available values: VCard, WebDav, Msg
    **/
    public String format;

    /**
    * Storage name
    **/
    public String storage;

    /**
    * Path to folder in storage
    **/
    public String folder;
}

