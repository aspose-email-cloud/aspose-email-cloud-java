
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="GetEmailThreadRequestData.java">
*   Copyright (c) 2018-2019 Aspose Pty Ltd. All rights reserved.
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

package com.aspose.email.cloud.sdk.model.requests;
import com.aspose.email.cloud.sdk.model.*;

/**
* Class that holds parameters for EmailApi.getEmailThread request invocation.
**/   
public class GetEmailThreadRequestData
{
    /**
    * Initializes a new instance of the GetEmailThreadRequestData class.   
    * @param threadId Thread identifier
    * @param firstAccount Email account
    * @param secondAccount Additional email account (for example, firstAccount could be IMAP, and second one could be SMTP)             
    * @param folder Specifies account folder to get thread from (required for some account types, such as EWS)             
    * @param storage Storage name where account file(s) located
    * @param storageFolder Folder in storage where account file(s) located
    **/
    public GetEmailThreadRequestData(String threadId, String firstAccount, String secondAccount, String folder, String storage, String storageFolder)             
    {
        this.threadId = threadId;
        this.firstAccount = firstAccount;
        this.secondAccount = secondAccount;
        this.folder = folder;
        this.storage = storage;
        this.storageFolder = storageFolder;
    }
        
    /**
    * Thread identifier
    **/
    public String threadId;

    /**
    * Email account
    **/
    public String firstAccount;

    /**
    * Additional email account (for example, firstAccount could be IMAP, and second one could be SMTP)             
    **/
    public String secondAccount;

    /**
    * Specifies account folder to get thread from (required for some account types, such as EWS)             
    **/
    public String folder;

    /**
    * Storage name where account file(s) located
    **/
    public String storage;

    /**
    * Folder in storage where account file(s) located
    **/
    public String storageFolder;
}

