/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ContactGetAsFileRequest.java">
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
 * Class that holds parameters for ContactApi.getAsFile request invocation.
 **/   
public class ContactGetAsFileRequest
{
    /**
     * Initializes a new instance of the ContactGetAsFileRequest class.
     **/
    public ContactGetAsFileRequest()
    {
    }

    /**
     * Initializes a new instance of the ContactGetAsFileRequest class.   
     * @param fileName Calendar document file name
     * @param toFormat File format. Enum, available values: VCard, WebDav, Msg
     * @param fromFormat File format to convert from. Enum, available values: VCard, WebDav, Msg
     * @param storage Storage name
     * @param folder Path to folder in storage
     **/
    public ContactGetAsFileRequest(String fileName, String toFormat, String fromFormat, String storage, String folder)             
    {
        this.fileName = fileName;
        this.toFormat = toFormat;
        this.fromFormat = fromFormat;
        this.storage = storage;
        this.folder = folder;
    }
        
    private String fileName;

    /**
     * Getter for: Calendar document file name
     **/
    public String getFileName() {
        return fileName;
    }

    /**
     * Setter for: Calendar document file name
     **/
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Setter for: Calendar document file name
     **/
    public ContactGetAsFileRequest fileName(String value) {
        this.fileName = value;
        return this;
    }

    private String toFormat;

    /**
     * Getter for: File format. Enum, available values: VCard, WebDav, Msg
     **/
    public String getToFormat() {
        return toFormat;
    }

    /**
     * Setter for: File format. Enum, available values: VCard, WebDav, Msg
     **/
    public void setToFormat(String value) {
        this.toFormat = value;
    }

    /**
     * Setter for: File format. Enum, available values: VCard, WebDav, Msg
     **/
    public ContactGetAsFileRequest toFormat(String value) {
        this.toFormat = value;
        return this;
    }

    private String fromFormat;

    /**
     * Getter for: File format to convert from. Enum, available values: VCard, WebDav, Msg
     **/
    public String getFromFormat() {
        return fromFormat;
    }

    /**
     * Setter for: File format to convert from. Enum, available values: VCard, WebDav, Msg
     **/
    public void setFromFormat(String value) {
        this.fromFormat = value;
    }

    /**
     * Setter for: File format to convert from. Enum, available values: VCard, WebDav, Msg
     **/
    public ContactGetAsFileRequest fromFormat(String value) {
        this.fromFormat = value;
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
    public ContactGetAsFileRequest storage(String value) {
        this.storage = value;
        return this;
    }

    private String folder;

    /**
     * Getter for: Path to folder in storage
     **/
    public String getFolder() {
        return folder;
    }

    /**
     * Setter for: Path to folder in storage
     **/
    public void setFolder(String value) {
        this.folder = value;
    }

    /**
     * Setter for: Path to folder in storage
     **/
    public ContactGetAsFileRequest folder(String value) {
        this.folder = value;
        return this;
    }

}

