/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiPidPropertyDescriptorBuilder.java">
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
 *  MapiPidPropertyDescriptor builder.
 */
public class MapiPidPropertyDescriptorBuilder {
    private final MapiPidPropertyDescriptor model;
    public MapiPidPropertyDescriptorBuilder(MapiPidPropertyDescriptor model) {
        this.model = model;
    }

    public MapiPidPropertyDescriptor build() {
        return model;
    }
    public MapiPidPropertyDescriptorBuilder canonicalName(String canonicalName) {
        this.model.canonicalName(canonicalName);
        return this;
    }
    public MapiPidPropertyDescriptorBuilder dataType(String dataType) {
        this.model.dataType(dataType);
        return this;
    }
    public MapiPidPropertyDescriptorBuilder multipleValuesDataType(Boolean multipleValuesDataType) {
        this.model.multipleValuesDataType(multipleValuesDataType);
        return this;
    }
    public MapiPidPropertyDescriptorBuilder name(String name) {
        this.model.name(name);
        return this;
    }
}
