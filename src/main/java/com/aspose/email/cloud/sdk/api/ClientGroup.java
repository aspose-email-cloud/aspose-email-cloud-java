/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmailCloud.java">
*   Copyright (c) 2020 Aspose Pty Ltd. All rights reserved.
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

package com.aspose.email.cloud.sdk.api;

import com.aspose.email.cloud.sdk.model.*;
import com.aspose.email.cloud.sdk.invoker.*;
import com.aspose.email.cloud.sdk.invoker.internal.*;
import com.aspose.email.cloud.sdk.invoker.internal.requesthandlers.*;
import java.io.*;

import java.util.HashMap;

/**
 * Builtin Email client operations.             
 */
public class ClientGroup {

    private ClientAccountApi account;

    private ClientFolderApi folder;

    private ClientMessageApi message;

    private ClientThreadApi thread;



    /**
     *  Email server account for built-in client operations.             
     */
    public ClientAccountApi Account() {
        return account;
    }

    /**
     *  Email client folder operations.             
     */
    public ClientFolderApi Folder() {
        return folder;
    }

    /**
     *  Email client message operations.             
     */
    public ClientMessageApi Message() {
        return message;
    }

    /**
     *  Email client thread operations.             
     */
    public ClientThreadApi Thread() {
        return thread;
    }


    ClientGroup(ApiInvoker apiInvoker, Configuration configuration)
    {
    
        account = new ClientAccountApi(apiInvoker, configuration);
    
        folder = new ClientFolderApi(apiInvoker, configuration);
    
        message = new ClientMessageApi(apiInvoker, configuration);
    
        thread = new ClientThreadApi(apiInvoker, configuration);
    
    }
}
