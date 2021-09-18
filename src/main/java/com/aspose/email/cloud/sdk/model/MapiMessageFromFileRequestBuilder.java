/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiMessageFromFileRequestBuilder.java">
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
 *  MapiMessageFromFileRequest builder.
 */
public class MapiMessageFromFileRequestBuilder {
    private MapiMessageFromFileRequest model;
    public MapiMessageFromFileRequestBuilder(MapiMessageFromFileRequest model) {
        this.model = model;
    }

    /**
     * Build MapiMessageFromFileRequest instance.
     */
    public MapiMessageFromFileRequest build() {
        MapiMessageFromFileRequest tempModel = model;
        model = null;
        return tempModel;
    }

    /**
     * Setter for: File format./nEnum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft
     **/
    public MapiMessageFromFileRequestBuilder format(String format) {
        this.model.format(format);
        return this;
    }
    /**
     * Setter for: File to convert
     **/
    public MapiMessageFromFileRequestBuilder file(byte[] file) {
        this.model.file(file);
        return this;
    }
}
