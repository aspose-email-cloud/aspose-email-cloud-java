
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ContactConvertRequest.java">
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
 * Class that holds parameters for ContactApi.convert request invocation.
 **/   
public class ContactConvertRequest
{
    /**
     * Initializes a new instance of the ContactConvertRequest class.
     **/
    public ContactConvertRequest()
    {
    }

    /**
     * Initializes a new instance of the ContactConvertRequest class.   
     * @param toFormat File format to convert to Enum, available values: VCard, WebDav, Msg
     * @param fromFormat File format to convert from Enum, available values: VCard, WebDav, Msg
     * @param file File to convert
     **/
    public ContactConvertRequest(String toFormat, String fromFormat, byte[] file)             
    {
        this.toFormat = toFormat;
        this.fromFormat = fromFormat;
        this.file = file;
    }
        
    private String toFormat;

    /**
     * Getter for: File format to convert to Enum, available values: VCard, WebDav, Msg
     **/
    public String getToFormat() {
        return toFormat;
    }

    /**
     * Setter for: File format to convert to Enum, available values: VCard, WebDav, Msg
     **/
    public void setToFormat(String value) {
        this.toFormat = value;
    }

    /**
     * Setter for: File format to convert to Enum, available values: VCard, WebDav, Msg
     **/
    public ContactConvertRequest toFormat(String value) {
        this.toFormat = value;
        return this;
    }

    private String fromFormat;

    /**
     * Getter for: File format to convert from Enum, available values: VCard, WebDav, Msg
     **/
    public String getFromFormat() {
        return fromFormat;
    }

    /**
     * Setter for: File format to convert from Enum, available values: VCard, WebDav, Msg
     **/
    public void setFromFormat(String value) {
        this.fromFormat = value;
    }

    /**
     * Setter for: File format to convert from Enum, available values: VCard, WebDav, Msg
     **/
    public ContactConvertRequest fromFormat(String value) {
        this.fromFormat = value;
        return this;
    }

    private byte[] file;

    /**
     * Getter for: File to convert
     **/
    public byte[] getFile() {
        return file;
    }

    /**
     * Setter for: File to convert
     **/
    public void setFile(byte[] value) {
        this.file = value;
    }

    /**
     * Setter for: File to convert
     **/
    public ContactConvertRequest file(byte[] value) {
        this.file = value;
        return this;
    }

}

