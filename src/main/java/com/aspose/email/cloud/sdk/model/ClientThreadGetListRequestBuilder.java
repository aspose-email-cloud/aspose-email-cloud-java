/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ClientThreadGetListRequestBuilder.java">
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
 *  ClientThreadGetListRequest builder.
 */
public class ClientThreadGetListRequestBuilder {
    private ClientThreadGetListRequest model;
    public ClientThreadGetListRequestBuilder(ClientThreadGetListRequest model) {
        this.model = model;
    }

    /**
     * Build ClientThreadGetListRequest instance.
     */
    public ClientThreadGetListRequest build() {
        ClientThreadGetListRequest tempModel = model;
        model = null;
        return tempModel;
    }

    /**
     * Setter for: A folder in email account.             
     **/
    public ClientThreadGetListRequestBuilder folder(String folder) {
        this.model.folder(folder);
        return this;
    }
    /**
     * Setter for: Email account
     **/
    public ClientThreadGetListRequestBuilder account(String account) {
        this.model.account(account);
        return this;
    }
    /**
     * Setter for: Storage name where account file located
     **/
    public ClientThreadGetListRequestBuilder storage(String storage) {
        this.model.storage(storage);
        return this;
    }
    /**
     * Setter for: Folder in storage where account file located
     **/
    public ClientThreadGetListRequestBuilder accountStorageFolder(String accountStorageFolder) {
        this.model.accountStorageFolder(accountStorageFolder);
        return this;
    }
    /**
     * Setter for: This parameter is only used in accounts with CacheFile. If true - get new messages and update threads cache for given folder. If false, get only threads from cache without any calls to an email account             
     **/
    public ClientThreadGetListRequestBuilder updateFolderCache(Boolean updateFolderCache) {
        this.model.updateFolderCache(updateFolderCache);
        return this;
    }
    /**
     * Setter for: Limit messages cache size if CacheFile is used. Ignored in accounts without limits support             
     **/
    public ClientThreadGetListRequestBuilder messagesCacheLimit(Integer messagesCacheLimit) {
        this.model.messagesCacheLimit(messagesCacheLimit);
        return this;
    }
}
