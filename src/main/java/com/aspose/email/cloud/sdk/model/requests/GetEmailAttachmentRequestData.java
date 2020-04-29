
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="GetEmailAttachmentRequestData.java">
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
* Class that holds parameters for EmailApi.getEmailAttachment request invocation.
**/   
public class GetEmailAttachmentRequestData
{
    /**
    * Initializes a new instance of the GetEmailAttachmentRequestData class.   
    * @param attachment Attachment name
    * @param fileName Email document file name
    * @param storage Storage name
    * @param folder Path to folder in storage
    **/
    public GetEmailAttachmentRequestData(String attachment, String fileName, String storage, String folder)             
    {
        this.attachment = attachment;
        this.fileName = fileName;
        this.storage = storage;
        this.folder = folder;
    }
        
    /**
    * Attachment name
    **/
    public String attachment;

    /**
    * Email document file name
    **/
    public String fileName;

    /**
    * Storage name
    **/
    public String storage;

    /**
    * Path to folder in storage
    **/
    public String folder;
}

