/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AttachmentBaseBuilder.java">
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

import java.util.List;

/**
 *  AttachmentBase builder.
 */
public class AttachmentBaseBuilder {
    private final AttachmentBase model;
    public AttachmentBaseBuilder(AttachmentBase model) {
        this.model = model;
    }

    public AttachmentBase build() {
        return model;
    }
    public AttachmentBaseBuilder base64Data(String base64Data) {
        this.model.base64Data(base64Data);
        return this;
    }
    public AttachmentBaseBuilder contentId(String contentId) {
        this.model.contentId(contentId);
        return this;
    }
    public AttachmentBaseBuilder contentType(ContentType contentType) {
        this.model.contentType(contentType);
        return this;
    }
    public AttachmentBaseBuilder headers(Map<String, String> headers) {
        this.model.headers(headers);
        return this;
    }
}
