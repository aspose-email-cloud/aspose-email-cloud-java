/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="FileVersionBuilder.java">
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
 *  FileVersion builder.
 */
public class FileVersionBuilder {
    private final FileVersion model;
    public FileVersionBuilder(FileVersion model) {
        this.model = model;
    }

    public FileVersion build() {
        return model;
    }
    public FileVersionBuilder name(String name) {
        this.model.name(name);
        return this;
    }
    public FileVersionBuilder isFolder(Boolean isFolder) {
        this.model.isFolder(isFolder);
        return this;
    }
    public FileVersionBuilder modifiedDate(Date modifiedDate) {
        this.model.modifiedDate(modifiedDate);
        return this;
    }
    public FileVersionBuilder size(Long size) {
        this.model.size(size);
        return this;
    }
    public FileVersionBuilder path(String path) {
        this.model.path(path);
        return this;
    }
    public FileVersionBuilder versionId(String versionId) {
        this.model.versionId(versionId);
        return this;
    }
    public FileVersionBuilder isLatest(Boolean isLatest) {
        this.model.isLatest(isLatest);
        return this;
    }
}
