/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ClientMessageMoveRequestBuilder.java">
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
 *  ClientMessageMoveRequest builder.
 */
public class ClientMessageMoveRequestBuilder {
    private ClientMessageMoveRequest model;
    public ClientMessageMoveRequestBuilder(ClientMessageMoveRequest model) {
        this.model = model;
    }

    /**
     * Build ClientMessageMoveRequest instance.
     */
    public ClientMessageMoveRequest build() {
        ClientMessageMoveRequest tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set ClientMessageMoveRequest.accountLocation and return builder.
     * @param accountLocation Email client account configuration location on storage.             
     * @return builder
    **/
    public ClientMessageMoveRequestBuilder accountLocation(StorageFileLocation accountLocation) {
        this.model.accountLocation(accountLocation);
        return this;
    }
    /**
     * Set ClientMessageMoveRequest.messageId and return builder.
     * @param messageId Message identifier.             
     * @return builder
    **/
    public ClientMessageMoveRequestBuilder messageId(String messageId) {
        this.model.messageId(messageId);
        return this;
    }
    /**
     * Set ClientMessageMoveRequest.sourceFolder and return builder.
     * @param sourceFolder Folder to move message from.             
     * @return builder
    **/
    public ClientMessageMoveRequestBuilder sourceFolder(String sourceFolder) {
        this.model.sourceFolder(sourceFolder);
        return this;
    }
    /**
     * Set ClientMessageMoveRequest.destinationFolder and return builder.
     * @param destinationFolder Folder to move message to.             
     * @return builder
    **/
    public ClientMessageMoveRequestBuilder destinationFolder(String destinationFolder) {
        this.model.destinationFolder(destinationFolder);
        return this;
    }
}
