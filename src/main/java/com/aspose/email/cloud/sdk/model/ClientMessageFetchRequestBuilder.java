/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ClientMessageFetchRequestBuilder.java">
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
 *  ClientMessageFetchRequest builder.
 */
public class ClientMessageFetchRequestBuilder {
    private ClientMessageFetchRequest model;
    public ClientMessageFetchRequestBuilder(ClientMessageFetchRequest model) {
        this.model = model;
    }

    /**
     * Build ClientMessageFetchRequest instance.
     */
    public ClientMessageFetchRequest build() {
        ClientMessageFetchRequest tempModel = model;
        model = null;
        return tempModel;
    }

    /**
     * Setter for: Message identifier
     **/
    public ClientMessageFetchRequestBuilder messageId(String messageId) {
        this.model.messageId(messageId);
        return this;
    }
    /**
     * Setter for: Email account
     **/
    public ClientMessageFetchRequestBuilder account(String account) {
        this.model.account(account);
        return this;
    }
    /**
     * Setter for: Account folder to fetch from (should be specified for some protocols such as IMAP)             
     **/
    public ClientMessageFetchRequestBuilder folder(String folder) {
        this.model.folder(folder);
        return this;
    }
    /**
     * Setter for: Storage name where account file located.
     **/
    public ClientMessageFetchRequestBuilder storage(String storage) {
        this.model.storage(storage);
        return this;
    }
    /**
     * Setter for: Folder in storage where account file located.
     **/
    public ClientMessageFetchRequestBuilder accountStorageFolder(String accountStorageFolder) {
        this.model.accountStorageFolder(accountStorageFolder);
        return this;
    }
    /**
     * Setter for: MailMessageBase type. Using this property you can fetch message in different formats (as EmailDto, MapiMessageDto or a file represented as Base64 string). Enum, available values: Dto, Mapi, Base64
     **/
    public ClientMessageFetchRequestBuilder type(String type) {
        this.model.type(type);
        return this;
    }
    /**
     * Setter for: Base64 data format. Used only if type is set to Base64. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft
     **/
    public ClientMessageFetchRequestBuilder format(String format) {
        this.model.format(format);
        return this;
    }
}
