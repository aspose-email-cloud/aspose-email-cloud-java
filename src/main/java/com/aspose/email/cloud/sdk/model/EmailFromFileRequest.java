/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmailFromFileRequest.java">
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
 * Class that holds parameters for EmailApi.fromFile request invocation.
 **/   
public class EmailFromFileRequest
{
    /**
     * Initializes a new instance of the EmailFromFileRequest class.
     **/
    public EmailFromFileRequest()
    {
    }

    /**
     * Initializes a new instance of the EmailFromFileRequest class.   
     * @param format Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft
     * @param file File to convert
     **/
    public EmailFromFileRequest(String format, byte[] file)             
    {
        this.format = format;
        this.file = file;
    }
        
    private String format;

    /**
     * Getter for: Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft
     **/
    public String getFormat() {
        return format;
    }

    /**
     * Setter for: Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft
     **/
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Setter for: Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft
     **/
    public EmailFromFileRequest format(String value) {
        this.format = value;
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
    public EmailFromFileRequest file(byte[] value) {
        this.file = value;
        return this;
    }

}

