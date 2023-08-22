/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MoveFolderRequest.java">
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

/**
 * Class that holds parameters for FolderApi.moveFolder request invocation.
 **/   
public class MoveFolderRequest
{
    /**
     * Initializes a new instance of the MoveFolderRequest class.
     **/
    public MoveFolderRequest()
    {
    }

    /**
     * Initializes a new instance of the MoveFolderRequest class.   
     * @param srcPath Folder path to move e.g. &#39;/folder&#39;
     * @param destPath Destination folder path to move to e.g &#39;/dst&#39;
     * @param srcStorageName Source storage name
     * @param destStorageName Destination storage name
     **/
    public MoveFolderRequest(String srcPath, String destPath, String srcStorageName, String destStorageName)             
    {
        this.srcPath = srcPath;
        this.destPath = destPath;
        this.srcStorageName = srcStorageName;
        this.destStorageName = destStorageName;
    }
        
    private String srcPath;

    /**
     * Getter for: Folder path to move e.g. '/folder'
     **/
    public String getSrcPath() {
        return srcPath;
    }

    /**
     * Setter for: Folder path to move e.g. '/folder'
     **/
    public void setSrcPath(String value) {
        this.srcPath = value;
    }

    /**
     * Setter for: Folder path to move e.g. '/folder'
     **/
    public MoveFolderRequest srcPath(String value) {
        this.srcPath = value;
        return this;
    }

    private String destPath;

    /**
     * Getter for: Destination folder path to move to e.g '/dst'
     **/
    public String getDestPath() {
        return destPath;
    }

    /**
     * Setter for: Destination folder path to move to e.g '/dst'
     **/
    public void setDestPath(String value) {
        this.destPath = value;
    }

    /**
     * Setter for: Destination folder path to move to e.g '/dst'
     **/
    public MoveFolderRequest destPath(String value) {
        this.destPath = value;
        return this;
    }

    private String srcStorageName;

    /**
     * Getter for: Source storage name
     **/
    public String getSrcStorageName() {
        return srcStorageName;
    }

    /**
     * Setter for: Source storage name
     **/
    public void setSrcStorageName(String value) {
        this.srcStorageName = value;
    }

    /**
     * Setter for: Source storage name
     **/
    public MoveFolderRequest srcStorageName(String value) {
        this.srcStorageName = value;
        return this;
    }

    private String destStorageName;

    /**
     * Getter for: Destination storage name
     **/
    public String getDestStorageName() {
        return destStorageName;
    }

    /**
     * Setter for: Destination storage name
     **/
    public void setDestStorageName(String value) {
        this.destStorageName = value;
    }

    /**
     * Setter for: Destination storage name
     **/
    public MoveFolderRequest destStorageName(String value) {
        this.destStorageName = value;
        return this;
    }

}


