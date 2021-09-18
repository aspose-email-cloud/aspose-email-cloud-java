/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ClientMessageListRequest.java">
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
 * Class that holds parameters for ClientMessageApi.list request invocation.
 **/   
public class ClientMessageListRequest
{
    /**
     * Initializes a new instance of the ClientMessageListRequest class.
     **/
    public ClientMessageListRequest()
    {
    }

    /**
     * Initializes a new instance of the ClientMessageListRequest class.   
     * @param folder A folder in email account
     * @param account Email account
     * @param queryString A MailQuery search string
     * @param storage Storage name where account file located
     * @param accountStorageFolder Folder in storage where account file located
     * @param recursive Specifies that should message be searched in subfolders recursively
     * @param type MailMessageBase type. Using this property you can get messages in different formats (as EmailDto, MapiMessageDto or a file represented as Base64 string)./nEnum, available values: Dto, Mapi, Base64
     * @param format Base64 data format. Used only if type is set to Base64./nEnum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft
     **/
    public ClientMessageListRequest(String folder, String account, String queryString, String storage, String accountStorageFolder, Boolean recursive, String type, String format)             
    {
        this.folder = folder;
        this.account = account;
        this.queryString = queryString;
        this.storage = storage;
        this.accountStorageFolder = accountStorageFolder;
        this.recursive = recursive;
        this.type = type;
        this.format = format;
    }
        
    private String folder;

    /**
     * Getter for: A folder in email account
     **/
    public String getFolder() {
        return folder;
    }

    /**
     * Setter for: A folder in email account
     **/
    public void setFolder(String value) {
        this.folder = value;
    }

    /**
     * Setter for: A folder in email account
     **/
    public ClientMessageListRequest folder(String value) {
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
    public ClientMessageListRequest account(String value) {
        this.account = value;
        return this;
    }

    private String queryString;

    /**
     * Getter for: A MailQuery search string
     **/
    public String getQueryString() {
        return queryString;
    }

    /**
     * Setter for: A MailQuery search string
     **/
    public void setQueryString(String value) {
        this.queryString = value;
    }

    /**
     * Setter for: A MailQuery search string
     **/
    public ClientMessageListRequest queryString(String value) {
        this.queryString = value;
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
    public ClientMessageListRequest storage(String value) {
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
    public ClientMessageListRequest accountStorageFolder(String value) {
        this.accountStorageFolder = value;
        return this;
    }

    private Boolean recursive;

    /**
     * Getter for: Specifies that should message be searched in subfolders recursively
     **/
    public Boolean getRecursive() {
        return recursive;
    }

    /**
     * Setter for: Specifies that should message be searched in subfolders recursively
     **/
    public void setRecursive(Boolean value) {
        this.recursive = value;
    }

    /**
     * Setter for: Specifies that should message be searched in subfolders recursively
     **/
    public ClientMessageListRequest recursive(Boolean value) {
        this.recursive = value;
        return this;
    }

    private String type;

    /**
     * Getter for: MailMessageBase type. Using this property you can get messages in different formats (as EmailDto, MapiMessageDto or a file represented as Base64 string)./nEnum, available values: Dto, Mapi, Base64
     **/
    public String getType() {
        return type;
    }

    /**
     * Setter for: MailMessageBase type. Using this property you can get messages in different formats (as EmailDto, MapiMessageDto or a file represented as Base64 string)./nEnum, available values: Dto, Mapi, Base64
     **/
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Setter for: MailMessageBase type. Using this property you can get messages in different formats (as EmailDto, MapiMessageDto or a file represented as Base64 string)./nEnum, available values: Dto, Mapi, Base64
     **/
    public ClientMessageListRequest type(String value) {
        this.type = value;
        return this;
    }

    private String format;

    /**
     * Getter for: Base64 data format. Used only if type is set to Base64./nEnum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft
     **/
    public String getFormat() {
        return format;
    }

    /**
     * Setter for: Base64 data format. Used only if type is set to Base64./nEnum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft
     **/
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Setter for: Base64 data format. Used only if type is set to Base64./nEnum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft
     **/
    public ClientMessageListRequest format(String value) {
        this.format = value;
        return this;
    }

}

