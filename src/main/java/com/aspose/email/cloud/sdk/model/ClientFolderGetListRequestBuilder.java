/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ClientFolderGetListRequestBuilder.java">
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
 *  ClientFolderGetListRequest builder.
 */
public class ClientFolderGetListRequestBuilder {
    private final ClientFolderGetListRequest model;
    public ClientFolderGetListRequestBuilder(ClientFolderGetListRequest model) {
        this.model = model;
    }

    /**
     * Build ClientFolderGetListRequest instance.
     */
    public ClientFolderGetListRequest build() {
        ClientFolderGetListRequest tempModel = model;
        model = null;
        return tempModel;
    }

    /**
     * Setter for: Email account
     **/
    public ClientFolderGetListRequestBuilder account(String account) {
        this.model.account(account);
        return this;
    }
    /**
     * Setter for: Storage name where account file located
     **/
    public ClientFolderGetListRequestBuilder storage(String storage) {
        this.model.storage(storage);
        return this;
    }
    /**
     * Setter for: Folder in storage where account file located
     **/
    public ClientFolderGetListRequestBuilder accountStorageFolder(String accountStorageFolder) {
        this.model.accountStorageFolder(accountStorageFolder);
        return this;
    }
    /**
     * Setter for: Folder in which subfolders should be listed
     **/
    public ClientFolderGetListRequestBuilder parentFolder(String parentFolder) {
        this.model.parentFolder(parentFolder);
        return this;
    }
}
