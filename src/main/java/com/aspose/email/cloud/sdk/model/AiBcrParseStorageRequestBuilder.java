/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AiBcrParseStorageRequestBuilder.java">
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
 *  AiBcrParseStorageRequest builder.
 */
public class AiBcrParseStorageRequestBuilder {
    private final AiBcrParseStorageRequest model;
    public AiBcrParseStorageRequestBuilder(AiBcrParseStorageRequest model) {
        this.model = model;
    }

    public AiBcrParseStorageRequest build() {
        return model;
    }
    public AiBcrParseStorageRequestBuilder outFolder(StorageFolderLocation outFolder) {
        this.model.outFolder(outFolder);
        return this;
    }
    public AiBcrParseStorageRequestBuilder images(List<AiBcrImageStorageFile> images) {
        this.model.images(images);
        return this;
    }
    public AiBcrParseStorageRequestBuilder options(AiBcrOptions options) {
        this.model.options(options);
        return this;
    }
}
