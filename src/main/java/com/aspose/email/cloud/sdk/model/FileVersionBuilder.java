/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="FileVersionBuilder.java">
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

    import org.apache.commons.lang3.ObjectUtils;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.*;
import com.google.gson.*;
import com.google.gson.stream.*;
import java.io.*;

/**
 *  FileVersion builder.
 */
public class FileVersionBuilder {
    private FileVersion model;
    public FileVersionBuilder(FileVersion model) {
        this.model = model;
    }

    /**
     * Build FileVersion instance.
     */
    public FileVersion build() {
        FileVersion tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set FileVersion.name and return builder.
     * @param name File or folder name.
     * @return builder
    **/
    public FileVersionBuilder name(String name) {
        this.model.name(name);
        return this;
    }
    /**
     * Set FileVersion.isFolder and return builder.
     * @param isFolder True if it is a folder.
     * @return builder
    **/
    public FileVersionBuilder isFolder(Boolean isFolder) {
        this.model.isFolder(isFolder);
        return this;
    }
    /**
     * Set FileVersion.modifiedDate and return builder.
     * @param modifiedDate File or folder last modified DateTime.
     * @return builder
    **/
    public FileVersionBuilder modifiedDate(Date modifiedDate) {
        this.model.modifiedDate(modifiedDate);
        return this;
    }
    /**
     * Set FileVersion.size and return builder.
     * @param size File or folder size.
     * @return builder
    **/
    public FileVersionBuilder size(Long size) {
        this.model.size(size);
        return this;
    }
    /**
     * Set FileVersion.path and return builder.
     * @param path File or folder path.
     * @return builder
    **/
    public FileVersionBuilder path(String path) {
        this.model.path(path);
        return this;
    }
    /**
     * Set FileVersion.versionId and return builder.
     * @param versionId File Version ID.
     * @return builder
    **/
    public FileVersionBuilder versionId(String versionId) {
        this.model.versionId(versionId);
        return this;
    }
    /**
     * Set FileVersion.isLatest and return builder.
     * @param isLatest Specifies whether the file is (true) or is not (false) the latest version of an file.
     * @return builder
    **/
    public FileVersionBuilder isLatest(Boolean isLatest) {
        this.model.isLatest(isLatest);
        return this;
    }
}
