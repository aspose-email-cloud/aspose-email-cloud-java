
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="GetContactListRequestData.java">
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
* Class that holds parameters for EmailApi.getContactList request invocation.
**/   
public class GetContactListRequestData
{
    /**
    * Initializes a new instance of the GetContactListRequestData class.   
    * @param format Contact document format. Enum, available values: VCard, WebDav, Msg
    * @param folder Path to folder in storage
    * @param storage Storage name
    * @param itemsPerPage Count of items on page
    * @param pageNumber Page number
    **/
    public GetContactListRequestData(String format, String folder, String storage, Integer itemsPerPage, Integer pageNumber)             
    {
        this.format = format;
        this.folder = folder;
        this.storage = storage;
        this.itemsPerPage = itemsPerPage;
        this.pageNumber = pageNumber;
    }
        
    /**
    * Contact document format. Enum, available values: VCard, WebDav, Msg
    **/
    public String format;

    /**
    * Path to folder in storage
    **/
    public String folder;

    /**
    * Storage name
    **/
    public String storage;

    /**
    * Count of items on page
    **/
    public Integer itemsPerPage;

    /**
    * Page number
    **/
    public Integer pageNumber;
}

