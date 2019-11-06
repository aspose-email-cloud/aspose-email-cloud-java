
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AddCalendarAttachmentRequestData.java">
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
* Class that holds parameters for EmailApi.addCalendarAttachment request invocation.
**/   
public class AddCalendarAttachmentRequestData
{
    /**
    * Initializes a new instance of the AddCalendarAttachmentRequestData class.   
    * @param name Calendar file name in storage
    * @param attachment Attachment file name in storage
    * @param request Storage name and folder path for calendar and attachment files
    **/
    public AddCalendarAttachmentRequestData(String name, String attachment, AddAttachmentRequest request)             
    {
        this.name = name;
        this.attachment = attachment;
        this.request = request;
    }
        
    /**
    * Calendar file name in storage
    **/
    public String name;

    /**
    * Attachment file name in storage
    **/
    public String attachment;

    /**
    * Storage name and folder path for calendar and attachment files
    **/
    public AddAttachmentRequest request;
}

