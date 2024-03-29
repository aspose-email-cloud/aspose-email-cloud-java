/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmailGetAsFileRequestBuilder.java">
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
 *  EmailGetAsFileRequest builder.
 */
public class EmailGetAsFileRequestBuilder {
    private EmailGetAsFileRequest model;
    public EmailGetAsFileRequestBuilder(EmailGetAsFileRequest model) {
        this.model = model;
    }

    /**
     * Build EmailGetAsFileRequest instance.
     */
    public EmailGetAsFileRequest build() {
        EmailGetAsFileRequest tempModel = model;
        model = null;
        return tempModel;
    }

    /**
     * Setter for: Email document file name
     **/
    public EmailGetAsFileRequestBuilder fileName(String fileName) {
        this.model.fileName(fileName);
        return this;
    }
    /**
     * Setter for: File format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft
     **/
    public EmailGetAsFileRequestBuilder format(String format) {
        this.model.format(format);
        return this;
    }
    /**
     * Setter for: Storage name
     **/
    public EmailGetAsFileRequestBuilder storage(String storage) {
        this.model.storage(storage);
        return this;
    }
    /**
     * Setter for: Path to folder in storage
     **/
    public EmailGetAsFileRequestBuilder folder(String folder) {
        this.model.folder(folder);
        return this;
    }
}
