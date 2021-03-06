/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ClientMessageAppendRequestBuilder.java">
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

    import org.apache.commons.lang3.ObjectUtils;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.*;
import com.google.gson.*;
import com.google.gson.stream.*;
import java.io.*;

/**
 *  ClientMessageAppendRequest builder.
 */
public class ClientMessageAppendRequestBuilder {
    private ClientMessageAppendRequest model;
    public ClientMessageAppendRequestBuilder(ClientMessageAppendRequest model) {
        this.model = model;
    }

    /**
     * Build ClientMessageAppendRequest instance.
     */
    public ClientMessageAppendRequest build() {
        ClientMessageAppendRequest tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set ClientMessageAppendRequest.accountLocation and return builder.
     * @param accountLocation Email client account configuration location on storage.             
     * @return builder
    **/
    public ClientMessageAppendRequestBuilder accountLocation(StorageFileLocation accountLocation) {
        this.model.accountLocation(accountLocation);
        return this;
    }
    /**
     * Set ClientMessageAppendRequest.folder and return builder.
     * @param folder Path to folder on email server to append message to.             
     * @return builder
    **/
    public ClientMessageAppendRequestBuilder folder(String folder) {
        this.model.folder(folder);
        return this;
    }
    /**
     * Set ClientMessageAppendRequest.message and return builder.
     * @param message Message to append.             
     * @return builder
    **/
    public ClientMessageAppendRequestBuilder message(MailMessageBase message) {
        this.model.message(message);
        return this;
    }
    /**
     * Set ClientMessageAppendRequest.markAsSent and return builder.
     * @param markAsSent Determines that appended message should be market as sent or not.             
     * @return builder
    **/
    public ClientMessageAppendRequestBuilder markAsSent(Boolean markAsSent) {
        this.model.markAsSent(markAsSent);
        return this;
    }
}
