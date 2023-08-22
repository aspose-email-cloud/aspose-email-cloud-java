/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ClientMessageAppendFileRequest.java">
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
 * Class that holds parameters for ClientMessageApi.appendFile request invocation.
 **/   
public class ClientMessageAppendFileRequest
{
    /**
     * Initializes a new instance of the ClientMessageAppendFileRequest class.
     **/
    public ClientMessageAppendFileRequest()
    {
    }

    /**
     * Initializes a new instance of the ClientMessageAppendFileRequest class.   
     * @param account Email account.
     * @param file Message file to append.
     * @param storage Storage name where account file located.
     * @param accountStorageFolder Folder in storage where account file located.
     * @param format Email file format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft
     * @param folder Path to folder on email server to append message to.
     * @param markAsSent Determines that appended message should be market as sent or not.
     **/
    public ClientMessageAppendFileRequest(String account, byte[] file, String storage, String accountStorageFolder, String format, String folder, Boolean markAsSent)             
    {
        this.account = account;
        this.file = file;
        this.storage = storage;
        this.accountStorageFolder = accountStorageFolder;
        this.format = format;
        this.folder = folder;
        this.markAsSent = markAsSent;
    }
        
    private String account;

    /**
     * Getter for: Email account.
     **/
    public String getAccount() {
        return account;
    }

    /**
     * Setter for: Email account.
     **/
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Setter for: Email account.
     **/
    public ClientMessageAppendFileRequest account(String value) {
        this.account = value;
        return this;
    }

    private byte[] file;

    /**
     * Getter for: Message file to append.
     **/
    public byte[] getFile() {
        return file;
    }

    /**
     * Setter for: Message file to append.
     **/
    public void setFile(byte[] value) {
        this.file = value;
    }

    /**
     * Setter for: Message file to append.
     **/
    public ClientMessageAppendFileRequest file(byte[] value) {
        this.file = value;
        return this;
    }

    private String storage;

    /**
     * Getter for: Storage name where account file located.
     **/
    public String getStorage() {
        return storage;
    }

    /**
     * Setter for: Storage name where account file located.
     **/
    public void setStorage(String value) {
        this.storage = value;
    }

    /**
     * Setter for: Storage name where account file located.
     **/
    public ClientMessageAppendFileRequest storage(String value) {
        this.storage = value;
        return this;
    }

    private String accountStorageFolder;

    /**
     * Getter for: Folder in storage where account file located.
     **/
    public String getAccountStorageFolder() {
        return accountStorageFolder;
    }

    /**
     * Setter for: Folder in storage where account file located.
     **/
    public void setAccountStorageFolder(String value) {
        this.accountStorageFolder = value;
    }

    /**
     * Setter for: Folder in storage where account file located.
     **/
    public ClientMessageAppendFileRequest accountStorageFolder(String value) {
        this.accountStorageFolder = value;
        return this;
    }

    private String format;

    /**
     * Getter for: Email file format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft
     **/
    public String getFormat() {
        return format;
    }

    /**
     * Setter for: Email file format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft
     **/
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Setter for: Email file format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft
     **/
    public ClientMessageAppendFileRequest format(String value) {
        this.format = value;
        return this;
    }

    private String folder;

    /**
     * Getter for: Path to folder on email server to append message to.
     **/
    public String getFolder() {
        return folder;
    }

    /**
     * Setter for: Path to folder on email server to append message to.
     **/
    public void setFolder(String value) {
        this.folder = value;
    }

    /**
     * Setter for: Path to folder on email server to append message to.
     **/
    public ClientMessageAppendFileRequest folder(String value) {
        this.folder = value;
        return this;
    }

    private Boolean markAsSent;

    /**
     * Getter for: Determines that appended message should be market as sent or not.
     **/
    public Boolean getMarkAsSent() {
        return markAsSent;
    }

    /**
     * Setter for: Determines that appended message should be market as sent or not.
     **/
    public void setMarkAsSent(Boolean value) {
        this.markAsSent = value;
    }

    /**
     * Setter for: Determines that appended message should be market as sent or not.
     **/
    public ClientMessageAppendFileRequest markAsSent(Boolean value) {
        this.markAsSent = value;
        return this;
    }

}

