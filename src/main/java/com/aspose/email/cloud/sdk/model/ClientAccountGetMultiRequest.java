/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ClientAccountGetMultiRequest.java">
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
 * Class that holds parameters for ClientAccountApi.getMulti request invocation.
 **/   
public class ClientAccountGetMultiRequest
{
    /**
     * Initializes a new instance of the ClientAccountGetMultiRequest class.
     **/
    public ClientAccountGetMultiRequest()
    {
    }

    /**
     * Initializes a new instance of the ClientAccountGetMultiRequest class.   
     * @param fileName File name on storage
     * @param folder Folder on storage
     * @param storage Storage name
     **/
    public ClientAccountGetMultiRequest(String fileName, String folder, String storage)             
    {
        this.fileName = fileName;
        this.folder = folder;
        this.storage = storage;
    }
        
    private String fileName;

    /**
     * Getter for: File name on storage
     **/
    public String getFileName() {
        return fileName;
    }

    /**
     * Setter for: File name on storage
     **/
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Setter for: File name on storage
     **/
    public ClientAccountGetMultiRequest fileName(String value) {
        this.fileName = value;
        return this;
    }

    private String folder;

    /**
     * Getter for: Folder on storage
     **/
    public String getFolder() {
        return folder;
    }

    /**
     * Setter for: Folder on storage
     **/
    public void setFolder(String value) {
        this.folder = value;
    }

    /**
     * Setter for: Folder on storage
     **/
    public ClientAccountGetMultiRequest folder(String value) {
        this.folder = value;
        return this;
    }

    private String storage;

    /**
     * Getter for: Storage name
     **/
    public String getStorage() {
        return storage;
    }

    /**
     * Setter for: Storage name
     **/
    public void setStorage(String value) {
        this.storage = value;
    }

    /**
     * Setter for: Storage name
     **/
    public ClientAccountGetMultiRequest storage(String value) {
        this.storage = value;
        return this;
    }

}


