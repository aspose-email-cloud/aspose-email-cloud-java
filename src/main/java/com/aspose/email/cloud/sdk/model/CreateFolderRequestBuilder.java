/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CreateFolderRequestBuilder.java">
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
 *  CreateFolderRequest builder.
 */
public class CreateFolderRequestBuilder {
    private final CreateFolderRequest model;
    public CreateFolderRequestBuilder(CreateFolderRequest model) {
        this.model = model;
    }

    /**
     * Build CreateFolderRequest instance.
     */
    public CreateFolderRequest build() {
        CreateFolderRequest tempModel = model;
        model = null;
        return tempModel;
    }

    /**
     * Setter for: Folder path to create e.g. 'folder_1/folder_2/'
     **/
    public CreateFolderRequestBuilder path(String path) {
        this.model.path(path);
        return this;
    }
    /**
     * Setter for: Storage name
     **/
    public CreateFolderRequestBuilder storageName(String storageName) {
        this.model.storageName(storageName);
        return this;
    }
}
