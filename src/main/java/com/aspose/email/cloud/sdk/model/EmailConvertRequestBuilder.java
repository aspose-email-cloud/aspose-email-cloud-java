/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmailConvertRequestBuilder.java">
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
 *  EmailConvertRequest builder.
 */
public class EmailConvertRequestBuilder {
    private EmailConvertRequest model;
    public EmailConvertRequestBuilder(EmailConvertRequest model) {
        this.model = model;
    }

    /**
     * Build EmailConvertRequest instance.
     */
    public EmailConvertRequest build() {
        EmailConvertRequest tempModel = model;
        model = null;
        return tempModel;
    }

    /**
     * Setter for: File format to convert to Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft
     **/
    public EmailConvertRequestBuilder fromFormat(String fromFormat) {
        this.model.fromFormat(fromFormat);
        return this;
    }
    /**
     * Setter for: File format to convert from Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft
     **/
    public EmailConvertRequestBuilder toFormat(String toFormat) {
        this.model.toFormat(toFormat);
        return this;
    }
    /**
     * Setter for: File to convert
     **/
    public EmailConvertRequestBuilder file(byte[] file) {
        this.model.file(file);
        return this;
    }
}
