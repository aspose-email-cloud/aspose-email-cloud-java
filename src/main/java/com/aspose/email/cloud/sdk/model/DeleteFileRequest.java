/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="DeleteFileRequest.java">
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
 * Class that holds parameters for FileApi.deleteFile request invocation.
 **/   
public class DeleteFileRequest
{
    /**
     * Initializes a new instance of the DeleteFileRequest class.
     **/
    public DeleteFileRequest()
    {
    }

    /**
     * Initializes a new instance of the DeleteFileRequest class.   
     * @param path 
     * @param storageName 
     * @param versionId 
     **/
    public DeleteFileRequest(String path, String storageName, String versionId)             
    {
        this.path = path;
        this.storageName = storageName;
        this.versionId = versionId;
    }
        
    private String path;

    /**
     * Gets path
     **/
    public String getPath() {
        return path;
    }

    /**
     * Sets path
     **/
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Sets path
     **/
    public DeleteFileRequest path(String value) {
        this.path = value;
        return this;
    }

    private String storageName;

    /**
     * Gets storageName
     **/
    public String getStorageName() {
        return storageName;
    }

    /**
     * Sets storageName
     **/
    public void setStorageName(String value) {
        this.storageName = value;
    }

    /**
     * Sets storageName
     **/
    public DeleteFileRequest storageName(String value) {
        this.storageName = value;
        return this;
    }

    private String versionId;

    /**
     * Gets versionId
     **/
    public String getVersionId() {
        return versionId;
    }

    /**
     * Sets versionId
     **/
    public void setVersionId(String value) {
        this.versionId = value;
    }

    /**
     * Sets versionId
     **/
    public DeleteFileRequest versionId(String value) {
        this.versionId = value;
        return this;
    }

}

