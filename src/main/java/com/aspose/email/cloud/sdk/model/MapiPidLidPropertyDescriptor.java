/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiPidLidPropertyDescriptor.java">
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
 * Property identified by an unsigned 32-bit quantity along with a property set             
 */
public class MapiPidLidPropertyDescriptor extends MapiPidPropertyDescriptor {
  @JsonProperty("longId")
  private Long longId = null;
  @JsonProperty("propertySet")
  private String propertySet = null;

  /**
   * Set longId and return this.
   * @param longId An unsigned 32-bit quantity that, along with the property set, identifies a named property.             
   * @return this
  **/
  public MapiPidLidPropertyDescriptor longId(Long longId) {
    this.longId = longId;
    return this;
  }

  /**
   * An unsigned 32-bit quantity that, along with the property set, identifies a named property.             
   * @return longId
  **/
  public Long getLongId() {
    return longId;
  }  

  /**
   * Set longId.
   * @param longId An unsigned 32-bit quantity that, along with the property set, identifies a named property.             
  **/
  public void setLongId(Long longId) {
    this.longId = longId;
  }


  /**
   * Set propertySet and return this.
   * @param propertySet A GUID that identifies a group of properties with a similar purpose.             
   * @return this
  **/
  public MapiPidLidPropertyDescriptor propertySet(String propertySet) {
    this.propertySet = propertySet;
    return this;
  }

  /**
   * A GUID that identifies a group of properties with a similar purpose.             
   * @return propertySet
  **/
  public String getPropertySet() {
    return propertySet;
  }  

  /**
   * Set propertySet.
   * @param propertySet A GUID that identifies a group of properties with a similar purpose.             
  **/
  public void setPropertySet(String propertySet) {
    this.propertySet = propertySet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    MapiPidLidPropertyDescriptor mapiPidLidPropertyDescriptor = (MapiPidLidPropertyDescriptor) o;
    return ObjectUtils.equals(this.longId, mapiPidLidPropertyDescriptor.longId) &&
    ObjectUtils.equals(this.propertySet, mapiPidLidPropertyDescriptor.propertySet) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(longId, propertySet, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapiPidLidPropertyDescriptor {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    discriminator: ").append(toIndentedString(getDiscriminator())).append("\n");
    sb.append("    canonicalName: ").append(toIndentedString(getCanonicalName())).append("\n");
    sb.append("    dataType: ").append(toIndentedString(getDataType())).append("\n");
    sb.append("    multipleValuesDataType: ").append(toIndentedString(isMultipleValuesDataType())).append("\n");
    sb.append("    name: ").append(toIndentedString(getName())).append("\n");
    sb.append("    longId: ").append(toIndentedString(getLongId())).append("\n");
    sb.append("    propertySet: ").append(toIndentedString(getPropertySet())).append("\n");
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

  public MapiPidLidPropertyDescriptor() {
    super();
  }

  /**
   * Initializes a new instance of the MapiPidLidPropertyDescriptor
   * @param canonicalName The name used to refer to the property in the documentation. The prefix of the canonical name identifies the basic characteristics of a property to the implementer. The canonical naming structure uses three categories that are denoted by the following prefixes to the canonical property name: * PidLid prefix: Properties identified by an unsigned 32-bit quantity along with a property set. * PidName prefix: Properties identified by a string name along with a property set. * PidTag prefix: Properties identified by an unsigned 16-bit quantity.             
   * @param dataType [MS-OXCDATA]: Data Structures./nEnum, available values: Unspecified, Null, Integer16, Integer32, Floating32, Floating64, Currency, FloatingTime, ErrorCode, Boolean, Integer64, String, String8, Time, Guid, ServerId, Restriction, RuleAction, Binary, MultipleInteger16, MultipleInteger32, MultipleFloating32, MultipleFloating64, MultipleCurrency, MultipleFloatingTime, MultipleBoolean, MultipleInteger64, MultipleString, MultipleString8, MultipleTime, MultipleGuid, MultipleBinary, Object
   * @param multipleValuesDataType Indicates if data type contains of multiple values             
   * @param name A string that identifies the property             
   * @param longId An unsigned 32-bit quantity that, along with the property set, identifies a named property.             
   * @param propertySet A GUID that identifies a group of properties with a similar purpose.             
   */
  public MapiPidLidPropertyDescriptor(
    //,
    String canonicalName,
    String dataType,
    Boolean multipleValuesDataType,
    String name,
    Long longId,
    String propertySet
  ) {
    super();
    setCanonicalName(canonicalName);
    setDataType(dataType);
    setMultipleValuesDataType(multipleValuesDataType);
    setName(name);
    setLongId(longId);
    setPropertySet(propertySet);
  }

}

