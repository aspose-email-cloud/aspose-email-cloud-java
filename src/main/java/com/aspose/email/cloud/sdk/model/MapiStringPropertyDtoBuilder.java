/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiStringPropertyDtoBuilder.java">
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
 *  MapiStringPropertyDto builder.
 */
public class MapiStringPropertyDtoBuilder {
    private final MapiStringPropertyDto model;
    public MapiStringPropertyDtoBuilder(MapiStringPropertyDto model) {
        this.model = model;
    }

    /**
     * Build MapiStringPropertyDto instance.
     */
    public MapiStringPropertyDto build() {
        return model;
    }
    /**
     * Set MapiStringPropertyDto.descriptor and return builder.
     * @param descriptor Property descriptor             
     * @return builder
    **/
    public MapiStringPropertyDtoBuilder descriptor(MapiPropertyDescriptor descriptor) {
        this.model.descriptor(descriptor);
        return this;
    }
    /**
     * Set MapiStringPropertyDto.value and return builder.
     * @param value Property value             
     * @return builder
    **/
    public MapiStringPropertyDtoBuilder value(String value) {
        this.model.value(value);
        return this;
    }
}
