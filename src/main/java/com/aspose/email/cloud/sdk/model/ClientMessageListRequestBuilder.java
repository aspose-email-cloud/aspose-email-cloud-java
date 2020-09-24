/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ClientMessageListRequestBuilder.java">
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
 *  ClientMessageListRequest builder.
 */
public class ClientMessageListRequestBuilder {
    private final ClientMessageListRequest model;
    public ClientMessageListRequestBuilder(ClientMessageListRequest model) {
        this.model = model;
    }

    /**
     * Build ClientMessageListRequest instance.
     */
    public ClientMessageListRequest build() {
        ClientMessageListRequest tempModel = model;
        model = null;
        return tempModel;
    }

    /**
     * Setter for: A folder in email account
     **/
    public ClientMessageListRequestBuilder folder(String folder) {
        this.model.folder(folder);
        return this;
    }
    /**
     * Setter for: Email account
     **/
    public ClientMessageListRequestBuilder account(String account) {
        this.model.account(account);
        return this;
    }
    /**
     * Setter for: A MailQuery search string
     **/
    public ClientMessageListRequestBuilder queryString(String queryString) {
        this.model.queryString(queryString);
        return this;
    }
    /**
     * Setter for: Storage name where account file located
     **/
    public ClientMessageListRequestBuilder storage(String storage) {
        this.model.storage(storage);
        return this;
    }
    /**
     * Setter for: Folder in storage where account file located
     **/
    public ClientMessageListRequestBuilder accountStorageFolder(String accountStorageFolder) {
        this.model.accountStorageFolder(accountStorageFolder);
        return this;
    }
    /**
     * Setter for: Specifies that should message be searched in subfolders recursively
     **/
    public ClientMessageListRequestBuilder recursive(Boolean recursive) {
        this.model.recursive(recursive);
        return this;
    }
    /**
     * Setter for: MailMessageBase type. Using this property you can get messages in different formats (as EmailDto, MapiMessageDto or a file represented as Base64 string).              Enum, available values: Dto, Mapi, Base64
     **/
    public ClientMessageListRequestBuilder type(String type) {
        this.model.type(type);
        return this;
    }
    /**
     * Setter for: Base64 data format. Used only if type is set to Base64. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft
     **/
    public ClientMessageListRequestBuilder format(String format) {
        this.model.format(format);
        return this;
    }
}
