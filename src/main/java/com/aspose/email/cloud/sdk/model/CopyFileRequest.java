/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CopyFileRequest.java">
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
 * Class that holds parameters for FileApi.copyFile request invocation.
 **/   
public class CopyFileRequest
{
    /**
     * Initializes a new instance of the CopyFileRequest class.
     **/
    public CopyFileRequest()
    {
    }

    /**
     * Initializes a new instance of the CopyFileRequest class.   
     * @param srcPath 
     * @param destPath 
     * @param srcStorageName 
     * @param destStorageName 
     * @param versionId 
     **/
    public CopyFileRequest(String srcPath, String destPath, String srcStorageName, String destStorageName, String versionId)             
    {
        this.srcPath = srcPath;
        this.destPath = destPath;
        this.srcStorageName = srcStorageName;
        this.destStorageName = destStorageName;
        this.versionId = versionId;
    }
        
    private String srcPath;

    /**
     * Gets srcPath
     **/
    public String getSrcPath() {
        return srcPath;
    }

    /**
     * Sets srcPath
     **/
    public void setSrcPath(String value) {
        this.srcPath = value;
    }

    /**
     * Sets srcPath
     **/
    public CopyFileRequest srcPath(String value) {
        this.srcPath = value;
        return this;
    }

    private String destPath;

    /**
     * Gets destPath
     **/
    public String getDestPath() {
        return destPath;
    }

    /**
     * Sets destPath
     **/
    public void setDestPath(String value) {
        this.destPath = value;
    }

    /**
     * Sets destPath
     **/
    public CopyFileRequest destPath(String value) {
        this.destPath = value;
        return this;
    }

    private String srcStorageName;

    /**
     * Gets srcStorageName
     **/
    public String getSrcStorageName() {
        return srcStorageName;
    }

    /**
     * Sets srcStorageName
     **/
    public void setSrcStorageName(String value) {
        this.srcStorageName = value;
    }

    /**
     * Sets srcStorageName
     **/
    public CopyFileRequest srcStorageName(String value) {
        this.srcStorageName = value;
        return this;
    }

    private String destStorageName;

    /**
     * Gets destStorageName
     **/
    public String getDestStorageName() {
        return destStorageName;
    }

    /**
     * Sets destStorageName
     **/
    public void setDestStorageName(String value) {
        this.destStorageName = value;
    }

    /**
     * Sets destStorageName
     **/
    public CopyFileRequest destStorageName(String value) {
        this.destStorageName = value;
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
    public CopyFileRequest versionId(String value) {
        this.versionId = value;
        return this;
    }

}

