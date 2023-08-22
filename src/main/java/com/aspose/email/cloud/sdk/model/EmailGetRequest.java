/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmailGetRequest.java">
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
 * Class that holds parameters for EmailApi.get request invocation.
 **/   
public class EmailGetRequest
{
    /**
     * Initializes a new instance of the EmailGetRequest class.
     **/
    public EmailGetRequest()
    {
    }

    /**
     * Initializes a new instance of the EmailGetRequest class.   
     * @param format Email document format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft
     * @param fileName Email document file name.
     * @param folder Path to folder in storage.
     * @param storage Storage name.
     **/
    public EmailGetRequest(String format, String fileName, String folder, String storage)             
    {
        this.format = format;
        this.fileName = fileName;
        this.folder = folder;
        this.storage = storage;
    }
        
    private String format;

    /**
     * Getter for: Email document format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft
     **/
    public String getFormat() {
        return format;
    }

    /**
     * Setter for: Email document format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft
     **/
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Setter for: Email document format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft
     **/
    public EmailGetRequest format(String value) {
        this.format = value;
        return this;
    }

    private String fileName;

    /**
     * Getter for: Email document file name.
     **/
    public String getFileName() {
        return fileName;
    }

    /**
     * Setter for: Email document file name.
     **/
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Setter for: Email document file name.
     **/
    public EmailGetRequest fileName(String value) {
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
    public EmailGetRequest folder(String value) {
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
    public EmailGetRequest storage(String value) {
        this.storage = value;
        return this;
    }

}

