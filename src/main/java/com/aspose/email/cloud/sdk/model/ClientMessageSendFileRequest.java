
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ClientMessageSendFileRequest.java">
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
* Class that holds parameters for ClientMessageApi.clientMessageSendFile request invocation.
**/   
public class ClientMessageSendFileRequest
{
    /**
    * Initializes a new instance of the ClientMessageSendFileRequest class.   
    * @param account Email account
    * @param file File to send
    * @param storage Storage name where account file located.
    * @param accountStorageFolder Folder in storage where account file located.
    * @param format Email file format Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef
    **/
    public ClientMessageSendFileRequest(String account, byte[] file, String storage, String accountStorageFolder, String format)             
    {
        this.account = account;
        this.File = file;
        this.storage = storage;
        this.accountStorageFolder = accountStorageFolder;
        this.format = format;
    }
        
    /**
    * Email account
    **/
    public String account;

    /**
    * File to send
    **/
    public byte[] File;

    /**
    * Storage name where account file located.
    **/
    public String storage;

    /**
    * Folder in storage where account file located.
    **/
    public String accountStorageFolder;

    /**
    * Email file format Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef
    **/
    public String format;
}
