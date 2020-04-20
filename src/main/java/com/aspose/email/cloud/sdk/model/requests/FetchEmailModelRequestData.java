
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="FetchEmailModelRequestData.java">
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
* Class that holds parameters for EmailApi.fetchEmailModel request invocation.
**/   
public class FetchEmailModelRequestData
{
    /**
    * Initializes a new instance of the FetchEmailModelRequestData class.   
    * @param messageId Message identifier
    * @param firstAccount Email account
    * @param secondAccount Additional email account (for example, firstAccount could be IMAP, and second one could be SMTP)             
    * @param folder Account folder to fetch from (should be specified for some protocols such as IMAP)             
    * @param storage Storage name where account file(s) located
    * @param storageFolder Folder in storage where account file(s) located
    **/
    public FetchEmailModelRequestData(String messageId, String firstAccount, String secondAccount, String folder, String storage, String storageFolder)             
    {
        this.messageId = messageId;
        this.firstAccount = firstAccount;
        this.secondAccount = secondAccount;
        this.folder = folder;
        this.storage = storage;
        this.storageFolder = storageFolder;
    }
        
    /**
    * Message identifier
    **/
    public String messageId;

    /**
    * Email account
    **/
    public String firstAccount;

    /**
    * Additional email account (for example, firstAccount could be IMAP, and second one could be SMTP)             
    **/
    public String secondAccount;

    /**
    * Account folder to fetch from (should be specified for some protocols such as IMAP)             
    **/
    public String folder;

    /**
    * Storage name where account file(s) located
    **/
    public String storage;

    /**
    * Folder in storage where account file(s) located
    **/
    public String storageFolder;
}

