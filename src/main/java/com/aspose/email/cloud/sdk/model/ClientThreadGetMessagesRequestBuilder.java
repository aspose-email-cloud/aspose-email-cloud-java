/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ClientThreadGetMessagesRequestBuilder.java">
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
 *  ClientThreadGetMessagesRequest builder.
 */
public class ClientThreadGetMessagesRequestBuilder {
    private ClientThreadGetMessagesRequest model;
    public ClientThreadGetMessagesRequestBuilder(ClientThreadGetMessagesRequest model) {
        this.model = model;
    }

    /**
     * Build ClientThreadGetMessagesRequest instance.
     */
    public ClientThreadGetMessagesRequest build() {
        ClientThreadGetMessagesRequest tempModel = model;
        model = null;
        return tempModel;
    }

    /**
     * Setter for: Thread identifier
     **/
    public ClientThreadGetMessagesRequestBuilder threadId(String threadId) {
        this.model.threadId(threadId);
        return this;
    }
    /**
     * Setter for: Email account
     **/
    public ClientThreadGetMessagesRequestBuilder account(String account) {
        this.model.account(account);
        return this;
    }
    /**
     * Setter for: Specifies account folder to get thread from             
     **/
    public ClientThreadGetMessagesRequestBuilder folder(String folder) {
        this.model.folder(folder);
        return this;
    }
    /**
     * Setter for: Storage name where account file located
     **/
    public ClientThreadGetMessagesRequestBuilder storage(String storage) {
        this.model.storage(storage);
        return this;
    }
    /**
     * Setter for: Folder in storage where account file located
     **/
    public ClientThreadGetMessagesRequestBuilder accountStorageFolder(String accountStorageFolder) {
        this.model.accountStorageFolder(accountStorageFolder);
        return this;
    }
}
