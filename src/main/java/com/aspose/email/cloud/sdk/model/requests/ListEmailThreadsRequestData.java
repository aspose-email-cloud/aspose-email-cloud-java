
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ListEmailThreadsRequestData.java">
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
* Class that holds parameters for EmailApi.listEmailThreads request invocation.
**/   
public class ListEmailThreadsRequestData
{
    /**
    * Initializes a new instance of the ListEmailThreadsRequestData class.   
    * @param folder A folder in email account.             
    * @param firstAccount Email account
    * @param secondAccount Additional email account (for example, firstAccount could be IMAP, and second one could be SMTP)             
    * @param storage Storage name where account file(s) located
    * @param storageFolder Folder in storage where account file(s) located
    * @param updateFolderCache This parameter is only used in accounts with CacheFile. If true - get new messages and update threads cache for given folder. If false, get only threads from cache without any calls to an email account             
    * @param messagesCacheLimit Limit messages cache size if CacheFile is used. Ignored in accounts without limits support             
    **/
    public ListEmailThreadsRequestData(String folder, String firstAccount, String secondAccount, String storage, String storageFolder, Boolean updateFolderCache, Integer messagesCacheLimit)             
    {
        this.folder = folder;
        this.firstAccount = firstAccount;
        this.secondAccount = secondAccount;
        this.storage = storage;
        this.storageFolder = storageFolder;
        this.updateFolderCache = updateFolderCache;
        this.messagesCacheLimit = messagesCacheLimit;
    }
        
    /**
    * A folder in email account.             
    **/
    public String folder;

    /**
    * Email account
    **/
    public String firstAccount;

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
    * This parameter is only used in accounts with CacheFile. If true - get new messages and update threads cache for given folder. If false, get only threads from cache without any calls to an email account             
    **/
    public Boolean updateFolderCache;

    /**
    * Limit messages cache size if CacheFile is used. Ignored in accounts without limits support             
    **/
    public Integer messagesCacheLimit;
}

