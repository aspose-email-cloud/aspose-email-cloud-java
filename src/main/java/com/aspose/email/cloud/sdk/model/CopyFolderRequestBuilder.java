/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CopyFolderRequestBuilder.java">
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
 *  CopyFolderRequest builder.
 */
public class CopyFolderRequestBuilder {
    private CopyFolderRequest model;
    public CopyFolderRequestBuilder(CopyFolderRequest model) {
        this.model = model;
    }

    /**
     * Build CopyFolderRequest instance.
     */
    public CopyFolderRequest build() {
        CopyFolderRequest tempModel = model;
        model = null;
        return tempModel;
    }

    /**
     * Setter for: Source folder path e.g. '/src'
     **/
    public CopyFolderRequestBuilder srcPath(String srcPath) {
        this.model.srcPath(srcPath);
        return this;
    }
    /**
     * Setter for: Destination folder path e.g. '/dst'
     **/
    public CopyFolderRequestBuilder destPath(String destPath) {
        this.model.destPath(destPath);
        return this;
    }
    /**
     * Setter for: Source storage name
     **/
    public CopyFolderRequestBuilder srcStorageName(String srcStorageName) {
        this.model.srcStorageName(srcStorageName);
        return this;
    }
    /**
     * Setter for: Destination storage name
     **/
    public CopyFolderRequestBuilder destStorageName(String destStorageName) {
        this.model.destStorageName(destStorageName);
        return this;
    }
}
