
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ListEmailFoldersRequestData.java">
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
* Class that holds parameters for EmailApi.listEmailFolders request invocation.
**/   
public class ListEmailFoldersRequestData
{
    /**
    * Initializes a new instance of the ListEmailFoldersRequestData class.   
    * @param firstAccount Email account
    * @param secondAccount Additional email account (should be specified for POP/IMAP accounts and should be SMTP account)
    * @param storage Storage name where account file(s) located
    * @param storageFolder Folder in storage where account file(s) located
    * @param parentFolder Folder in which subfolders should be listed
    **/
    public ListEmailFoldersRequestData(String firstAccount, String secondAccount, String storage, String storageFolder, String parentFolder)             
    {
        this.firstAccount = firstAccount;
        this.secondAccount = secondAccount;
        this.storage = storage;
        this.storageFolder = storageFolder;
        this.parentFolder = parentFolder;
    }
        
    /**
    * Email account
    **/
    public String firstAccount;

    /**
    * Additional email account (should be specified for POP/IMAP accounts and should be SMTP account)
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
    * Folder in which subfolders should be listed
    **/
    public String parentFolder;
}

