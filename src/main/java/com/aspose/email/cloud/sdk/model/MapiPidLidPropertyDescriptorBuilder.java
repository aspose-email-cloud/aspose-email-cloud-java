/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiPidLidPropertyDescriptorBuilder.java">
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
 *  MapiPidLidPropertyDescriptor builder.
 */
public class MapiPidLidPropertyDescriptorBuilder {
    private final MapiPidLidPropertyDescriptor model;
    public MapiPidLidPropertyDescriptorBuilder(MapiPidLidPropertyDescriptor model) {
        this.model = model;
    }

    /**
     * Build MapiPidLidPropertyDescriptor instance.
     */
    public MapiPidLidPropertyDescriptor build() {
        MapiPidLidPropertyDescriptor tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set MapiPidLidPropertyDescriptor.canonicalName and return builder.
     * @param canonicalName The name used to refer to the property in the documentation. The prefix of the canonical name identifies the basic characteristics of a property to the implementer. The canonical naming structure uses three categories that are denoted by the following prefixes to the canonical property name: * PidLid prefix: Properties identified by an unsigned 32-bit quantity along with a property set. * PidName prefix: Properties identified by a string name along with a property set. * PidTag prefix: Properties identified by an unsigned 16-bit quantity.             
     * @return builder
    **/
    public MapiPidLidPropertyDescriptorBuilder canonicalName(String canonicalName) {
        this.model.canonicalName(canonicalName);
        return this;
    }
    /**
     * Set MapiPidLidPropertyDescriptor.dataType and return builder.
     * @param dataType [MS-OXCDATA]: Data Structures Enum, available values: Unspecified, Null, Integer16, Integer32, Floating32, Floating64, Currency, FloatingTime, ErrorCode, Boolean, Integer64, String, String8, Time, Guid, ServerId, Restriction, RuleAction, Binary, MultipleInteger16, MultipleInteger32, MultipleFloating32, MultipleFloating64, MultipleCurrency, MultipleFloatingTime, MultipleBoolean, MultipleInteger64, MultipleString, MultipleString8, MultipleTime, MultipleGuid, MultipleBinary, Object
     * @return builder
    **/
    public MapiPidLidPropertyDescriptorBuilder dataType(String dataType) {
        this.model.dataType(dataType);
        return this;
    }
    /**
     * Set MapiPidLidPropertyDescriptor.multipleValuesDataType and return builder.
     * @param multipleValuesDataType Indicates if data type contains of multiple values             
     * @return builder
    **/
    public MapiPidLidPropertyDescriptorBuilder multipleValuesDataType(Boolean multipleValuesDataType) {
        this.model.multipleValuesDataType(multipleValuesDataType);
        return this;
    }
    /**
     * Set MapiPidLidPropertyDescriptor.name and return builder.
     * @param name A string that identifies the property             
     * @return builder
    **/
    public MapiPidLidPropertyDescriptorBuilder name(String name) {
        this.model.name(name);
        return this;
    }
    /**
     * Set MapiPidLidPropertyDescriptor.longId and return builder.
     * @param longId An unsigned 32-bit quantity that, along with the property set, identifies a named property.             
     * @return builder
    **/
    public MapiPidLidPropertyDescriptorBuilder longId(Long longId) {
        this.model.longId(longId);
        return this;
    }
    /**
     * Set MapiPidLidPropertyDescriptor.propertySet and return builder.
     * @param propertySet A GUID that identifies a group of properties with a similar purpose.             
     * @return builder
    **/
    public MapiPidLidPropertyDescriptorBuilder propertySet(String propertySet) {
        this.model.propertySet(propertySet);
        return this;
    }
}
