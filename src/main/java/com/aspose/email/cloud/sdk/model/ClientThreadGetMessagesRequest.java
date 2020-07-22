
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
        
    /**
    * Thread identifier
    **/
    public String threadId;

    /**
    * Email account
    **/
    public String account;

    /**
    * Specifies account folder to get thread from             
    **/
    public String folder;

    /**
    * Storage name where account file located
    **/
    public String storage;

    /**
    * Folder in storage where account file located
    **/
    public String accountStorageFolder;
}
