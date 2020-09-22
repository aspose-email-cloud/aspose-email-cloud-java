/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ClientThreadSetIsReadRequestBuilder.java">
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
 *  ClientThreadSetIsReadRequest builder.
 */
public class ClientThreadSetIsReadRequestBuilder {
    private final ClientThreadSetIsReadRequest model;
    public ClientThreadSetIsReadRequestBuilder(ClientThreadSetIsReadRequest model) {
        this.model = model;
    }

    /**
     * Build ClientThreadSetIsReadRequest instance.
     */
    public ClientThreadSetIsReadRequest build() {
        return model;
    }
    /**
     * Set ClientThreadSetIsReadRequest.accountLocation and return builder.
     * @param accountLocation Email client account configuration location on storage.             
     * @return builder
    **/
    public ClientThreadSetIsReadRequestBuilder accountLocation(StorageFileLocation accountLocation) {
        this.model.accountLocation(accountLocation);
        return this;
    }
    /**
     * Set ClientThreadSetIsReadRequest.threadId and return builder.
     * @param threadId Thread identifier.             
     * @return builder
    **/
    public ClientThreadSetIsReadRequestBuilder threadId(String threadId) {
        this.model.threadId(threadId);
        return this;
    }
    /**
     * Set ClientThreadSetIsReadRequest.isRead and return builder.
     * @param isRead Message is read flag.             
     * @return builder
    **/
    public ClientThreadSetIsReadRequestBuilder isRead(Boolean isRead) {
        this.model.isRead(isRead);
        return this;
    }
    /**
     * Set ClientThreadSetIsReadRequest.folder and return builder.
     * @param folder Folder on email server, where thread is stored.             
     * @return builder
    **/
    public ClientThreadSetIsReadRequestBuilder folder(String folder) {
        this.model.folder(folder);
        return this;
    }
}
