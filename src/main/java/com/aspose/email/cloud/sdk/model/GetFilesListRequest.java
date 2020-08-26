/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="GetFilesListRequest.java">
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
 * Class that holds parameters for FolderApi.getFilesList request invocation.
 **/   
public class GetFilesListRequest
{
    /**
     * Initializes a new instance of the GetFilesListRequest class.
     **/
    public GetFilesListRequest()
    {
    }

    /**
     * Initializes a new instance of the GetFilesListRequest class.   
     * @param path Folder path e.g. &#39;/folder&#39;
     * @param storageName Storage name
     **/
    public GetFilesListRequest(String path, String storageName)             
    {
        this.path = path;
        this.storageName = storageName;
    }
        
    private String path;

    /**
     * Getter for: Folder path e.g. '/folder'
     **/
    public String getPath() {
        return path;
    }

    /**
     * Setter for: Folder path e.g. '/folder'
     **/
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Setter for: Folder path e.g. '/folder'
     **/
    public GetFilesListRequest path(String value) {
        this.path = value;
        return this;
    }

    private String storageName;

    /**
     * Getter for: Storage name
     **/
    public String getStorageName() {
        return storageName;
    }

    /**
     * Setter for: Storage name
     **/
    public void setStorageName(String value) {
        this.storageName = value;
    }

    /**
     * Setter for: Storage name
     **/
    public GetFilesListRequest storageName(String value) {
        this.storageName = value;
        return this;
    }

}

