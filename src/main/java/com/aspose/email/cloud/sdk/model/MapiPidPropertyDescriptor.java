/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiPidPropertyDescriptor.java">
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
 * Mapi pid property descriptor base class             
 */
public class MapiPidPropertyDescriptor extends MapiPropertyDescriptor {
  @JsonProperty("canonicalName")
  private String canonicalName = null;

  @JsonProperty("dataType")
  private String dataType = null;

  @JsonProperty("multipleValuesDataType")
  private Boolean multipleValuesDataType = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Set canonicalName and return this.
   * @param canonicalName The name used to refer to the property in the documentation. The prefix of the canonical name identifies the basic characteristics of a property to the implementer. The canonical naming structure uses three categories that are denoted by the following prefixes to the canonical property name: * PidLid prefix: Properties identified by an unsigned 32-bit quantity along with a property set. * PidName prefix: Properties identified by a string name along with a property set. * PidTag prefix: Properties identified by an unsigned 16-bit quantity.             
   * @return this
  **/
  public MapiPidPropertyDescriptor canonicalName(String canonicalName) {
    this.canonicalName = canonicalName;
    return this;
  }

  /**
   * The name used to refer to the property in the documentation. The prefix of the canonical name identifies the basic characteristics of a property to the implementer. The canonical naming structure uses three categories that are denoted by the following prefixes to the canonical property name: * PidLid prefix: Properties identified by an unsigned 32-bit quantity along with a property set. * PidName prefix: Properties identified by a string name along with a property set. * PidTag prefix: Properties identified by an unsigned 16-bit quantity.             
   * @return canonicalName
  **/
  public String getCanonicalName() {
    return canonicalName;
  }  

  /**
   * Set canonicalName.
   * @param canonicalName The name used to refer to the property in the documentation. The prefix of the canonical name identifies the basic characteristics of a property to the implementer. The canonical naming structure uses three categories that are denoted by the following prefixes to the canonical property name: * PidLid prefix: Properties identified by an unsigned 32-bit quantity along with a property set. * PidName prefix: Properties identified by a string name along with a property set. * PidTag prefix: Properties identified by an unsigned 16-bit quantity.             
  **/
  public void setCanonicalName(String canonicalName) {
    this.canonicalName = canonicalName;
  }

  /**
   * Set dataType and return this.
   * @param dataType [MS-OXCDATA]: Data Structures Enum, available values: Unspecified, Null, Integer16, Integer32, Floating32, Floating64, Currency, FloatingTime, ErrorCode, Boolean, Integer64, String, String8, Time, Guid, ServerId, Restriction, RuleAction, Binary, MultipleInteger16, MultipleInteger32, MultipleFloating32, MultipleFloating64, MultipleCurrency, MultipleFloatingTime, MultipleBoolean, MultipleInteger64, MultipleString, MultipleString8, MultipleTime, MultipleGuid, MultipleBinary, Object
   * @return this
  **/
  public MapiPidPropertyDescriptor dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * [MS-OXCDATA]: Data Structures Enum, available values: Unspecified, Null, Integer16, Integer32, Floating32, Floating64, Currency, FloatingTime, ErrorCode, Boolean, Integer64, String, String8, Time, Guid, ServerId, Restriction, RuleAction, Binary, MultipleInteger16, MultipleInteger32, MultipleFloating32, MultipleFloating64, MultipleCurrency, MultipleFloatingTime, MultipleBoolean, MultipleInteger64, MultipleString, MultipleString8, MultipleTime, MultipleGuid, MultipleBinary, Object
   * @return dataType
  **/
  public String getDataType() {
    return dataType;
  }  

  /**
   * Set dataType.
   * @param dataType [MS-OXCDATA]: Data Structures Enum, available values: Unspecified, Null, Integer16, Integer32, Floating32, Floating64, Currency, FloatingTime, ErrorCode, Boolean, Integer64, String, String8, Time, Guid, ServerId, Restriction, RuleAction, Binary, MultipleInteger16, MultipleInteger32, MultipleFloating32, MultipleFloating64, MultipleCurrency, MultipleFloatingTime, MultipleBoolean, MultipleInteger64, MultipleString, MultipleString8, MultipleTime, MultipleGuid, MultipleBinary, Object
  **/
  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  /**
   * Set multipleValuesDataType and return this.
   * @param multipleValuesDataType Indicates if data type contains of multiple values             
   * @return this
  **/
  public MapiPidPropertyDescriptor multipleValuesDataType(Boolean multipleValuesDataType) {
    this.multipleValuesDataType = multipleValuesDataType;
    return this;
  }

  /**
   * Indicates if data type contains of multiple values             
   * @return multipleValuesDataType
  **/
  public Boolean isMultipleValuesDataType() {
    return multipleValuesDataType;
  }  

  /**
   * Set multipleValuesDataType.
   * @param multipleValuesDataType Indicates if data type contains of multiple values             
  **/
  public void setMultipleValuesDataType(Boolean multipleValuesDataType) {
    this.multipleValuesDataType = multipleValuesDataType;
  }

  /**
   * Set name and return this.
   * @param name A string that identifies the property             
   * @return this
  **/
  public MapiPidPropertyDescriptor name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A string that identifies the property             
   * @return name
  **/
  public String getName() {
    return name;
  }  

  /**
   * Set name.
   * @param name A string that identifies the property             
  **/
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    MapiPidPropertyDescriptor mapiPidPropertyDescriptor = (MapiPidPropertyDescriptor) o;
    return ObjectUtils.equals(this.canonicalName, mapiPidPropertyDescriptor.canonicalName) &&
    ObjectUtils.equals(this.dataType, mapiPidPropertyDescriptor.dataType) &&
    ObjectUtils.equals(this.multipleValuesDataType, mapiPidPropertyDescriptor.multipleValuesDataType) &&
    ObjectUtils.equals(this.name, mapiPidPropertyDescriptor.name) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(canonicalName, dataType, multipleValuesDataType, name, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapiPidPropertyDescriptor {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    discriminator: ").append(toIndentedString(getDiscriminator())).append("\n");
    sb.append("    canonicalName: ").append(toIndentedString(getCanonicalName())).append("\n");
    sb.append("    dataType: ").append(toIndentedString(getDataType())).append("\n");
    sb.append("    multipleValuesDataType: ").append(toIndentedString(isMultipleValuesDataType())).append("\n");
    sb.append("    name: ").append(toIndentedString(getName())).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public MapiPidPropertyDescriptor() {
    super();
  }

  /**
   * Initializes a new instance of the MapiPidPropertyDescriptor
   * @param discriminator 
   * @param canonicalName The name used to refer to the property in the documentation. The prefix of the canonical name identifies the basic characteristics of a property to the implementer. The canonical naming structure uses three categories that are denoted by the following prefixes to the canonical property name: * PidLid prefix: Properties identified by an unsigned 32-bit quantity along with a property set. * PidName prefix: Properties identified by a string name along with a property set. * PidTag prefix: Properties identified by an unsigned 16-bit quantity.             
   * @param dataType [MS-OXCDATA]: Data Structures Enum, available values: Unspecified, Null, Integer16, Integer32, Floating32, Floating64, Currency, FloatingTime, ErrorCode, Boolean, Integer64, String, String8, Time, Guid, ServerId, Restriction, RuleAction, Binary, MultipleInteger16, MultipleInteger32, MultipleFloating32, MultipleFloating64, MultipleCurrency, MultipleFloatingTime, MultipleBoolean, MultipleInteger64, MultipleString, MultipleString8, MultipleTime, MultipleGuid, MultipleBinary, Object
   * @param multipleValuesDataType Indicates if data type contains of multiple values             
   * @param name A string that identifies the property             
   */
  public MapiPidPropertyDescriptor(String discriminator, String canonicalName, String dataType, Boolean multipleValuesDataType, String name) {
    super();
    setDiscriminator(discriminator);
    setCanonicalName(canonicalName);
    setDataType(dataType);
    setMultipleValuesDataType(multipleValuesDataType);
    setName(name);
  }

}

