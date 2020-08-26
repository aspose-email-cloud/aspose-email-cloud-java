/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ClientThreadGetMessagesRequest.java">
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
 * Class that holds parameters for ClientThreadApi.getMessages request invocation.
 **/   
public class ClientThreadGetMessagesRequest
{
    /**
     * Initializes a new instance of the ClientThreadGetMessagesRequest class.
     **/
    public ClientThreadGetMessagesRequest()
    {
    }

    /**
     * Initializes a new instance of the ClientThreadGetMessagesRequest class.   
     * @param threadId Thread identifier
     * @param account Email account
     * @param folder Specifies account folder to get thread from             
     * @param storage Storage name where account file located
     * @param accountStorageFolder Folder in storage where account file located
     **/
    public ClientThreadGetMessagesRequest(String threadId, String account, String folder, String storage, String accountStorageFolder)             
    {
        this.threadId = threadId;
        this.account = account;
        this.folder = folder;
        this.storage = storage;
        this.accountStorageFolder = accountStorageFolder;
    }
        
    private String threadId;

    /**
     * Getter for: Thread identifier
     **/
    public String getThreadId() {
        return threadId;
    }

    /**
     * Setter for: Thread identifier
     **/
    public void setThreadId(String value) {
        this.threadId = value;
    }

    /**
     * Setter for: Thread identifier
     **/
    public ClientThreadGetMessagesRequest threadId(String value) {
        this.threadId = value;
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
    public ClientThreadGetMessagesRequest account(String value) {
        this.account = value;
        return this;
    }

    private String folder;

    /**
     * Getter for: Specifies account folder to get thread from             
     **/
    public String getFolder() {
        return folder;
    }

    /**
     * Setter for: Specifies account folder to get thread from             
     **/
    public void setFolder(String value) {
        this.folder = value;
    }

    /**
     * Setter for: Specifies account folder to get thread from             
     **/
    public ClientThreadGetMessagesRequest folder(String value) {
        this.folder = value;
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
    public ClientThreadGetMessagesRequest storage(String value) {
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
    public ClientThreadGetMessagesRequest accountStorageFolder(String value) {
        this.accountStorageFolder = value;
        return this;
    }

}
