
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ListEmailModelsRequestData.java">
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
* Class that holds parameters for EmailApi.listEmailModels request invocation.
**/   
public class ListEmailModelsRequestData
{
    /**
    * Initializes a new instance of the ListEmailModelsRequestData class.   
    * @param folder A folder in email account
    * @param firstAccount Email account
    * @param queryString A MailQuery search string
    * @param secondAccount Additional email account (for example, firstAccount could be IMAP, and second one could be SMTP)             
    * @param storage Storage name where account file(s) located
    * @param storageFolder Folder in storage where account file(s) located
    * @param recursive Specifies that should message be searched in subfolders recursively
    **/
    public ListEmailModelsRequestData(String folder, String firstAccount, String queryString, String secondAccount, String storage, String storageFolder, Boolean recursive)             
    {
        this.folder = folder;
        this.firstAccount = firstAccount;
        this.queryString = queryString;
        this.secondAccount = secondAccount;
        this.storage = storage;
        this.storageFolder = storageFolder;
        this.recursive = recursive;
    }
        
    /**
    * A folder in email account
    **/
    public String folder;

    /**
    * Email account
    **/
    public String firstAccount;

    /**
    * A MailQuery search string
    **/
    public String queryString;

    /**
    * Additional email account (for example, firstAccount could be IMAP, and second one could be SMTP)             
    **/
    public String secondAccount;

    /**
    * Storage name where account file(s) located
    **/
    public String storage;

    /**
    * Folder in storage where account file(s) located
    **/
    public String storageFolder;

    /**
    * Specifies that should message be searched in subfolders recursively
    **/
    public Boolean recursive;
}

