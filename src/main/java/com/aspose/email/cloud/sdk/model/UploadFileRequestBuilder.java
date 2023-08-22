/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="UploadFileRequestBuilder.java">
*   Copyright (c) 2018-2023 Aspose Pty Ltd. All rights reserved.
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
 *  UploadFileRequest builder.
 */
public class UploadFileRequestBuilder {
    private UploadFileRequest model;
    public UploadFileRequestBuilder(UploadFileRequest model) {
        this.model = model;
    }

    /**
     * Build UploadFileRequest instance.
     */
    public UploadFileRequest build() {
        UploadFileRequest tempModel = model;
        model = null;
        return tempModel;
    }

    /**
     * Setter for: Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext             If the content is multipart and path does not contains the file name it tries to get them from filename parameter             from Content-Disposition header.             
     **/
    public UploadFileRequestBuilder path(String path) {
        this.model.path(path);
        return this;
    }
    /**
     * Setter for: File to upload
     **/
    public UploadFileRequestBuilder file(byte[] file) {
        this.model.file(file);
        return this;
    }
    /**
     * Setter for: Storage name
     **/
    public UploadFileRequestBuilder storageName(String storageName) {
        this.model.storageName(storageName);
        return this;
    }
}
