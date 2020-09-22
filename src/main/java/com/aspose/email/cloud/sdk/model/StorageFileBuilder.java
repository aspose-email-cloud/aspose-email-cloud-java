/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="StorageFileBuilder.java">
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
 *  StorageFile builder.
 */
public class StorageFileBuilder {
    private final StorageFile model;
    public StorageFileBuilder(StorageFile model) {
        this.model = model;
    }

    public StorageFile build() {
        return model;
    }
    public StorageFileBuilder name(String name) {
        this.model.name(name);
        return this;
    }
    public StorageFileBuilder isFolder(Boolean isFolder) {
        this.model.isFolder(isFolder);
        return this;
    }
    public StorageFileBuilder modifiedDate(Date modifiedDate) {
        this.model.modifiedDate(modifiedDate);
        return this;
    }
    public StorageFileBuilder size(Long size) {
        this.model.size(size);
        return this;
    }
    public StorageFileBuilder path(String path) {
        this.model.path(path);
        return this;
    }
}
