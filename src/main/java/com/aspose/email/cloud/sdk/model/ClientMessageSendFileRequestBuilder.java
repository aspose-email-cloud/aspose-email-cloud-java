/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ClientMessageSendFileRequestBuilder.java">
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
 *  ClientMessageSendFileRequest builder.
 */
public class ClientMessageSendFileRequestBuilder {
    private ClientMessageSendFileRequest model;
    public ClientMessageSendFileRequestBuilder(ClientMessageSendFileRequest model) {
        this.model = model;
    }

    /**
     * Build ClientMessageSendFileRequest instance.
     */
    public ClientMessageSendFileRequest build() {
        ClientMessageSendFileRequest tempModel = model;
        model = null;
        return tempModel;
    }

    /**
     * Setter for: Email account
     **/
    public ClientMessageSendFileRequestBuilder account(String account) {
        this.model.account(account);
        return this;
    }
    /**
     * Setter for: File to send
     **/
    public ClientMessageSendFileRequestBuilder file(byte[] file) {
        this.model.file(file);
        return this;
    }
    /**
     * Setter for: Storage name where account file located.
     **/
    public ClientMessageSendFileRequestBuilder storage(String storage) {
        this.model.storage(storage);
        return this;
    }
    /**
     * Setter for: Folder in storage where account file located.
     **/
    public ClientMessageSendFileRequestBuilder accountStorageFolder(String accountStorageFolder) {
        this.model.accountStorageFolder(accountStorageFolder);
        return this;
    }
    /**
     * Setter for: Email file format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft
     **/
    public ClientMessageSendFileRequestBuilder format(String format) {
        this.model.format(format);
        return this;
    }
}
