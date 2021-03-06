/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiCalendarGetRequest.java">
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
 * Class that holds parameters for MapiCalendarApi.get request invocation.
 **/   
public class MapiCalendarGetRequest
{
    /**
     * Initializes a new instance of the MapiCalendarGetRequest class.
     **/
    public MapiCalendarGetRequest()
    {
    }

    /**
     * Initializes a new instance of the MapiCalendarGetRequest class.   
     * @param fileName Calendar file name in storage.
     * @param folder Path to folder in storage.
     * @param storage Storage name.
     **/
    public MapiCalendarGetRequest(String fileName, String folder, String storage)             
    {
        this.fileName = fileName;
        this.folder = folder;
        this.storage = storage;
    }
        
    private String fileName;

    /**
     * Getter for: Calendar file name in storage.
     **/
    public String getFileName() {
        return fileName;
    }

    /**
     * Setter for: Calendar file name in storage.
     **/
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Setter for: Calendar file name in storage.
     **/
    public MapiCalendarGetRequest fileName(String value) {
        this.fileName = value;
        return this;
    }

    private String folder;

    /**
     * Getter for: Path to folder in storage.
     **/
    public String getFolder() {
        return folder;
    }

    /**
     * Setter for: Path to folder in storage.
     **/
    public void setFolder(String value) {
        this.folder = value;
    }

    /**
     * Setter for: Path to folder in storage.
     **/
    public MapiCalendarGetRequest folder(String value) {
        this.folder = value;
        return this;
    }

    private String storage;

    /**
     * Getter for: Storage name.
     **/
    public String getStorage() {
        return storage;
    }

    /**
     * Setter for: Storage name.
     **/
    public void setStorage(String value) {
        this.storage = value;
    }

    /**
     * Setter for: Storage name.
     **/
    public MapiCalendarGetRequest storage(String value) {
        this.storage = value;
        return this;
    }

}


