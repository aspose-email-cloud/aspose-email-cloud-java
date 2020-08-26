/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="UploadFileRequest.java">
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
 * Class that holds parameters for FileApi.uploadFile request invocation.
 **/   
public class UploadFileRequest
{
    /**
     * Initializes a new instance of the UploadFileRequest class.
     **/
    public UploadFileRequest()
    {
    }

    /**
     * Initializes a new instance of the UploadFileRequest class.   
     * @param path 
     * @param file File to upload
     * @param storageName 
     **/
    public UploadFileRequest(String path, byte[] file, String storageName)             
    {
        this.path = path;
        this.file = file;
        this.storageName = storageName;
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
    public UploadFileRequest path(String value) {
        this.path = value;
        return this;
    }

    private byte[] file;

    /**
     * Getter for: File to upload
     **/
    public byte[] getFile() {
        return file;
    }

    /**
     * Setter for: File to upload
     **/
    public void setFile(byte[] value) {
        this.file = value;
    }

    /**
     * Setter for: File to upload
     **/
    public UploadFileRequest file(byte[] value) {
        this.file = value;
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
    public UploadFileRequest storageName(String value) {
        this.storageName = value;
        return this;
    }

}
