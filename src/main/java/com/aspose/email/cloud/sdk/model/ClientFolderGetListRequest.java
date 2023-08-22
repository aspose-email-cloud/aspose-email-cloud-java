/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ClientFolderGetListRequest.java">
*   Copyright (c) 2018-2023 Aspose Pty Ltd. All rights reserved.
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
 * Class that holds parameters for ClientFolderApi.getList request invocation.
 **/   
public class ClientFolderGetListRequest
{
    /**
     * Initializes a new instance of the ClientFolderGetListRequest class.
     **/
    public ClientFolderGetListRequest()
    {
    }

    /**
     * Initializes a new instance of the ClientFolderGetListRequest class.   
     * @param account Email account
     * @param storage Storage name where account file located
     * @param accountStorageFolder Folder in storage where account file located
     * @param parentFolder Folder in which subfolders should be listed
     **/
    public ClientFolderGetListRequest(String account, String storage, String accountStorageFolder, String parentFolder)             
    {
        this.account = account;
        this.storage = storage;
        this.accountStorageFolder = accountStorageFolder;
        this.parentFolder = parentFolder;
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
    public ClientFolderGetListRequest account(String value) {
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
    public ClientFolderGetListRequest storage(String value) {
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
    public ClientFolderGetListRequest accountStorageFolder(String value) {
        this.accountStorageFolder = value;
        return this;
    }

    private String parentFolder;

    /**
     * Getter for: Folder in which subfolders should be listed
     **/
    public String getParentFolder() {
        return parentFolder;
    }

    /**
     * Setter for: Folder in which subfolders should be listed
     **/
    public void setParentFolder(String value) {
        this.parentFolder = value;
    }

    /**
     * Setter for: Folder in which subfolders should be listed
     **/
    public ClientFolderGetListRequest parentFolder(String value) {
        this.parentFolder = value;
        return this;
    }

}


