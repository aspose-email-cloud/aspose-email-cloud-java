/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ContentTypeBuilder.java">
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
 *  ContentType builder.
 */
public class ContentTypeBuilder {
    private final ContentType model;
    public ContentTypeBuilder(ContentType model) {
        this.model = model;
    }

    public ContentType build() {
        return model;
    }
    public ContentTypeBuilder boundary(String boundary) {
        this.model.boundary(boundary);
        return this;
    }
    public ContentTypeBuilder charSet(String charSet) {
        this.model.charSet(charSet);
        return this;
    }
    public ContentTypeBuilder mediaType(String mediaType) {
        this.model.mediaType(mediaType);
        return this;
    }
    public ContentTypeBuilder name(String name) {
        this.model.name(name);
        return this;
    }
    public ContentTypeBuilder parameters(List<ContentTypeParameter> parameters) {
        this.model.parameters(parameters);
        return this;
    }
}
