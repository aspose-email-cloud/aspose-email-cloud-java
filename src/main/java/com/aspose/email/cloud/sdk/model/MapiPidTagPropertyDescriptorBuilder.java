/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiPidTagPropertyDescriptorBuilder.java">
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
 *  MapiPidTagPropertyDescriptor builder.
 */
public class MapiPidTagPropertyDescriptorBuilder {
    private MapiPidTagPropertyDescriptor model;
    public MapiPidTagPropertyDescriptorBuilder(MapiPidTagPropertyDescriptor model) {
        this.model = model;
    }

    /**
     * Build MapiPidTagPropertyDescriptor instance.
     */
    public MapiPidTagPropertyDescriptor build() {
        MapiPidTagPropertyDescriptor tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set MapiPidTagPropertyDescriptor.canonicalName and return builder.
     * @param canonicalName The name used to refer to the property in the documentation. The prefix of the canonical name identifies the basic characteristics of a property to the implementer. The canonical naming structure uses three categories that are denoted by the following prefixes to the canonical property name: * PidLid prefix: Properties identified by an unsigned 32-bit quantity along with a property set. * PidName prefix: Properties identified by a string name along with a property set. * PidTag prefix: Properties identified by an unsigned 16-bit quantity.             
     * @return builder
    **/
    public MapiPidTagPropertyDescriptorBuilder canonicalName(String canonicalName) {
        this.model.canonicalName(canonicalName);
        return this;
    }
    /**
     * Set MapiPidTagPropertyDescriptor.dataType and return builder.
     * @param dataType [MS-OXCDATA]: Data Structures. Enum, available values: Unspecified, Null, Integer16, Integer32, Floating32, Floating64, Currency, FloatingTime, ErrorCode, Boolean, Integer64, String, String8, Time, Guid, ServerId, Restriction, RuleAction, Binary, MultipleInteger16, MultipleInteger32, MultipleFloating32, MultipleFloating64, MultipleCurrency, MultipleFloatingTime, MultipleBoolean, MultipleInteger64, MultipleString, MultipleString8, MultipleTime, MultipleGuid, MultipleBinary, Object
     * @return builder
    **/
    public MapiPidTagPropertyDescriptorBuilder dataType(String dataType) {
        this.model.dataType(dataType);
        return this;
    }
    /**
     * Set MapiPidTagPropertyDescriptor.multipleValuesDataType and return builder.
     * @param multipleValuesDataType Indicates if data type contains of multiple values             
     * @return builder
    **/
    public MapiPidTagPropertyDescriptorBuilder multipleValuesDataType(Boolean multipleValuesDataType) {
        this.model.multipleValuesDataType(multipleValuesDataType);
        return this;
    }
    /**
     * Set MapiPidTagPropertyDescriptor.name and return builder.
     * @param name A string that identifies the property             
     * @return builder
    **/
    public MapiPidTagPropertyDescriptorBuilder name(String name) {
        this.model.name(name);
        return this;
    }
    /**
     * Set MapiPidTagPropertyDescriptor.id and return builder.
     * @param id An unsigned 16-bit quantity that identifies a tagged property. Property IDs are not necessarily unique. With the exception of property IDs in the range from 0x6800 to 0x7BFF, the combination of property ID and data type are unique. Property IDs in the range from 0x6800 to 0x7BFF are defined by the message class.             
     * @return builder
    **/
    public MapiPidTagPropertyDescriptorBuilder id(Integer id) {
        this.model.id(id);
        return this;
    }
    /**
     * Set MapiPidTagPropertyDescriptor.tag and return builder.
     * @param tag A property tag is a 32-bit number that contains a unique property identifier in bits 16 through 31 and a property type in bits 0 through 15.             
     * @return builder
    **/
    public MapiPidTagPropertyDescriptorBuilder tag(Long tag) {
        this.model.tag(tag);
        return this;
    }
}
