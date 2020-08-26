/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="DeleteFolderRequest.java">
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
 * Class that holds parameters for FolderApi.deleteFolder request invocation.
 **/   
public class DeleteFolderRequest
{
    /**
     * Initializes a new instance of the DeleteFolderRequest class.
     **/
    public DeleteFolderRequest()
    {
    }

    /**
     * Initializes a new instance of the DeleteFolderRequest class.   
     * @param path 
     * @param storageName 
     * @param recursive 
     **/
    public DeleteFolderRequest(String path, String storageName, Boolean recursive)             
    {
        this.path = path;
        this.storageName = storageName;
        this.recursive = recursive;
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
    public DeleteFolderRequest path(String value) {
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
    public DeleteFolderRequest storageName(String value) {
        this.storageName = value;
        return this;
    }

    private Boolean recursive;

    /**
     * Gets recursive
     **/
    public Boolean getRecursive() {
        return recursive;
    }

    /**
     * Sets recursive
     **/
    public void setRecursive(Boolean value) {
        this.recursive = value;
    }

    /**
     * Sets recursive
     **/
    public DeleteFolderRequest recursive(Boolean value) {
        this.recursive = value;
        return this;
    }

}

