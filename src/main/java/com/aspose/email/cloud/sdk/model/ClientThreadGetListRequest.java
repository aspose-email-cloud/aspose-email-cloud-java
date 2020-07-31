
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ClientThreadGetListRequest.java">
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

package com.aspose.email.cloud.sdk.model;

/**
 * Class that holds parameters for ClientThreadApi.getList request invocation.
 **/   
public class ClientThreadGetListRequest
{
    /**
     * Initializes a new instance of the ClientThreadGetListRequest class.
     **/
    public ClientThreadGetListRequest()
    {
    }

    /**
     * Initializes a new instance of the ClientThreadGetListRequest class.   
     * @param folder A folder in email account.             
     * @param account Email account
     * @param storage Storage name where account file located
     * @param accountStorageFolder Folder in storage where account file located
     * @param updateFolderCache This parameter is only used in accounts with CacheFile. If true - get new messages and update threads cache for given folder. If false, get only threads from cache without any calls to an email account             
     * @param messagesCacheLimit Limit messages cache size if CacheFile is used. Ignored in accounts without limits support             
     **/
    public ClientThreadGetListRequest(String folder, String account, String storage, String accountStorageFolder, Boolean updateFolderCache, Integer messagesCacheLimit)             
    {
        this.folder = folder;
        this.account = account;
        this.storage = storage;
        this.accountStorageFolder = accountStorageFolder;
        this.updateFolderCache = updateFolderCache;
        this.messagesCacheLimit = messagesCacheLimit;
    }
        
    private String folder;

    /**
     * Getter for: A folder in email account.             
     **/
    public String getFolder() {
        return folder;
    }

    /**
     * Setter for: A folder in email account.             
     **/
    public void setFolder(String value) {
        this.folder = value;
    }

    /**
     * Setter for: A folder in email account.             
     **/
    public ClientThreadGetListRequest folder(String value) {
        this.folder = value;
        return this;
    }

    private String account;

    /**
     * Getter for: Email account
     **/
    public String getAccount() {
        return account;
    }

    /**
     * Setter for: Email account
     **/
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Setter for: Email account
     **/
    public ClientThreadGetListRequest account(String value) {
        this.account = value;
        return this;
    }

    private String storage;

    /**
     * Getter for: Storage name where account file located
     **/
    public String getStorage() {
        return storage;
    }

    /**
     * Setter for: Storage name where account file located
     **/
    public void setStorage(String value) {
        this.storage = value;
    }

    /**
     * Setter for: Storage name where account file located
     **/
    public ClientThreadGetListRequest storage(String value) {
        this.storage = value;
        return this;
    }

    private String accountStorageFolder;

    /**
     * Getter for: Folder in storage where account file located
     **/
    public String getAccountStorageFolder() {
        return accountStorageFolder;
    }

    /**
     * Setter for: Folder in storage where account file located
     **/
    public void setAccountStorageFolder(String value) {
        this.accountStorageFolder = value;
    }

    /**
     * Setter for: Folder in storage where account file located
     **/
    public ClientThreadGetListRequest accountStorageFolder(String value) {
        this.accountStorageFolder = value;
        return this;
    }

    private Boolean updateFolderCache;

    /**
     * Getter for: This parameter is only used in accounts with CacheFile. If true - get new messages and update threads cache for given folder. If false, get only threads from cache without any calls to an email account             
     **/
    public Boolean getUpdateFolderCache() {
        return updateFolderCache;
    }

    /**
     * Setter for: This parameter is only used in accounts with CacheFile. If true - get new messages and update threads cache for given folder. If false, get only threads from cache without any calls to an email account             
     **/
    public void setUpdateFolderCache(Boolean value) {
        this.updateFolderCache = value;
    }

    /**
     * Setter for: This parameter is only used in accounts with CacheFile. If true - get new messages and update threads cache for given folder. If false, get only threads from cache without any calls to an email account             
     **/
    public ClientThreadGetListRequest updateFolderCache(Boolean value) {
        this.updateFolderCache = value;
        return this;
    }

    private Integer messagesCacheLimit;

    /**
     * Getter for: Limit messages cache size if CacheFile is used. Ignored in accounts without limits support             
     **/
    public Integer getMessagesCacheLimit() {
        return messagesCacheLimit;
    }

    /**
     * Setter for: Limit messages cache size if CacheFile is used. Ignored in accounts without limits support             
     **/
    public void setMessagesCacheLimit(Integer value) {
        this.messagesCacheLimit = value;
    }

    /**
     * Setter for: Limit messages cache size if CacheFile is used. Ignored in accounts without limits support             
     **/
    public ClientThreadGetListRequest messagesCacheLimit(Integer value) {
        this.messagesCacheLimit = value;
        return this;
    }

}

