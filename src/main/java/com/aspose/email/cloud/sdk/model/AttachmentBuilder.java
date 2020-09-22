/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AttachmentBuilder.java">
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
 *  Attachment builder.
 */
public class AttachmentBuilder {
    private final Attachment model;
    public AttachmentBuilder(Attachment model) {
        this.model = model;
    }

    public Attachment build() {
        return model;
    }
    public AttachmentBuilder base64Data(String base64Data) {
        this.model.base64Data(base64Data);
        return this;
    }
    public AttachmentBuilder contentId(String contentId) {
        this.model.contentId(contentId);
        return this;
    }
    public AttachmentBuilder contentType(ContentType contentType) {
        this.model.contentType(contentType);
        return this;
    }
    public AttachmentBuilder headers(Map<String, String> headers) {
        this.model.headers(headers);
        return this;
    }
    public AttachmentBuilder contentDisposition(String contentDisposition) {
        this.model.contentDisposition(contentDisposition);
        return this;
    }
    public AttachmentBuilder isEmbeddedMessage(Boolean isEmbeddedMessage) {
        this.model.isEmbeddedMessage(isEmbeddedMessage);
        return this;
    }
    public AttachmentBuilder name(String name) {
        this.model.name(name);
        return this;
    }
    public AttachmentBuilder nameEncoding(String nameEncoding) {
        this.model.nameEncoding(nameEncoding);
        return this;
    }
    public AttachmentBuilder preferredTextEncoding(String preferredTextEncoding) {
        this.model.preferredTextEncoding(preferredTextEncoding);
        return this;
    }
}
