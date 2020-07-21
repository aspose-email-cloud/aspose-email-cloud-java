
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
* Class that holds parameters for ClientMessageApi.clientMessageList request invocation.
**/   
public class ClientMessageListRequest
{
    /**
    * Initializes a new instance of the ClientMessageListRequest class.   
    * @param folder A folder in email account
    * @param account Email account
    * @param queryString A MailQuery search string
    * @param storage Storage name where account file located
    * @param accountStorageFolder Folder in storage where account file located
    * @param recursive Specifies that should message be searched in subfolders recursively
    * @param type MailMessageBase type. Using this property you can get messages in different formats (as EmailDto, MapiMessageDto or a file represented as Base64 string).              Enum, available values: Dto, Mapi, Base64
    * @param format Base64 data format. Used only if type is set to Base64. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef
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
        
    /**
    * A folder in email account
    **/
    public String folder;

    /**
    * Email account
    **/
    public String account;

    /**
    * A MailQuery search string
    **/
    public String queryString;

    /**
    * Storage name where account file located
    **/
    public String storage;

    /**
    * Folder in storage where account file located
    **/
    public String accountStorageFolder;

    /**
    * Specifies that should message be searched in subfolders recursively
    **/
    public Boolean recursive;

    /**
    * MailMessageBase type. Using this property you can get messages in different formats (as EmailDto, MapiMessageDto or a file represented as Base64 string).              Enum, available values: Dto, Mapi, Base64
    **/
    public String type;

    /**
    * Base64 data format. Used only if type is set to Base64. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef
    **/
    public String format;
}

