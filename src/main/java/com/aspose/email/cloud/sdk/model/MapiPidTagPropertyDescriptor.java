/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiPidTagPropertyDescriptor.java">
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
 * A property that is defined by a 16-bit property ID and a 16-bit property type. The property ID for a tagged property is in the range 0x001 - 0x7FFF. Property IDs in the range 0x8000 - 0x8FFF are reserved for assignment to named properties             
 */
public class MapiPidTagPropertyDescriptor extends MapiPidPropertyDescriptor {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("tag")
  private Long tag = null;

  /**
   * Set id and return this.
   * @param id An unsigned 16-bit quantity that identifies a tagged property. Property IDs are not necessarily unique. With the exception of property IDs in the range from 0x6800 to 0x7BFF, the combination of property ID and data type are unique. Property IDs in the range from 0x6800 to 0x7BFF are defined by the message class.             
   * @return this
  **/
  public MapiPidTagPropertyDescriptor id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * An unsigned 16-bit quantity that identifies a tagged property. Property IDs are not necessarily unique. With the exception of property IDs in the range from 0x6800 to 0x7BFF, the combination of property ID and data type are unique. Property IDs in the range from 0x6800 to 0x7BFF are defined by the message class.             
   * @return id
  **/
  public Integer getId() {
    return id;
  }  

  /**
   * Set id.
   * @param id An unsigned 16-bit quantity that identifies a tagged property. Property IDs are not necessarily unique. With the exception of property IDs in the range from 0x6800 to 0x7BFF, the combination of property ID and data type are unique. Property IDs in the range from 0x6800 to 0x7BFF are defined by the message class.             
  **/
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Set tag and return this.
   * @param tag A property tag is a 32-bit number that contains a unique property identifier in bits 16 through 31 and a property type in bits 0 through 15.             
   * @return this
  **/
  public MapiPidTagPropertyDescriptor tag(Long tag) {
    this.tag = tag;
    return this;
  }

  /**
   * A property tag is a 32-bit number that contains a unique property identifier in bits 16 through 31 and a property type in bits 0 through 15.             
   * @return tag
  **/
  public Long getTag() {
    return tag;
  }  

  /**
   * Set tag.
   * @param tag A property tag is a 32-bit number that contains a unique property identifier in bits 16 through 31 and a property type in bits 0 through 15.             
  **/
  public void setTag(Long tag) {
    this.tag = tag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    MapiPidTagPropertyDescriptor mapiPidTagPropertyDescriptor = (MapiPidTagPropertyDescriptor) o;
    return ObjectUtils.equals(this.id, mapiPidTagPropertyDescriptor.id) &&
    ObjectUtils.equals(this.tag, mapiPidTagPropertyDescriptor.tag) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(id, tag, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapiPidTagPropertyDescriptor {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    discriminator: ").append(toIndentedString(getDiscriminator())).append("\n");
    sb.append("    canonicalName: ").append(toIndentedString(getCanonicalName())).append("\n");
    sb.append("    dataType: ").append(toIndentedString(getDataType())).append("\n");
    sb.append("    multipleValuesDataType: ").append(toIndentedString(isMultipleValuesDataType())).append("\n");
    sb.append("    name: ").append(toIndentedString(getName())).append("\n");
    sb.append("    id: ").append(toIndentedString(getId())).append("\n");
    sb.append("    tag: ").append(toIndentedString(getTag())).append("\n");
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

  public MapiPidTagPropertyDescriptor() {
    super();
  }

  /**
   * Initializes a new instance of the MapiPidTagPropertyDescriptor
   * @param canonicalName The name used to refer to the property in the documentation. The prefix of the canonical name identifies the basic characteristics of a property to the implementer. The canonical naming structure uses three categories that are denoted by the following prefixes to the canonical property name: * PidLid prefix: Properties identified by an unsigned 32-bit quantity along with a property set. * PidName prefix: Properties identified by a string name along with a property set. * PidTag prefix: Properties identified by an unsigned 16-bit quantity.             
   * @param dataType [MS-OXCDATA]: Data Structures Enum, available values: Unspecified, Null, Integer16, Integer32, Floating32, Floating64, Currency, FloatingTime, ErrorCode, Boolean, Integer64, String, String8, Time, Guid, ServerId, Restriction, RuleAction, Binary, MultipleInteger16, MultipleInteger32, MultipleFloating32, MultipleFloating64, MultipleCurrency, MultipleFloatingTime, MultipleBoolean, MultipleInteger64, MultipleString, MultipleString8, MultipleTime, MultipleGuid, MultipleBinary, Object
   * @param multipleValuesDataType Indicates if data type contains of multiple values             
   * @param name A string that identifies the property             
   * @param id An unsigned 16-bit quantity that identifies a tagged property. Property IDs are not necessarily unique. With the exception of property IDs in the range from 0x6800 to 0x7BFF, the combination of property ID and data type are unique. Property IDs in the range from 0x6800 to 0x7BFF are defined by the message class.             
   * @param tag A property tag is a 32-bit number that contains a unique property identifier in bits 16 through 31 and a property type in bits 0 through 15.             
   */
  public MapiPidTagPropertyDescriptor(
    //,
    String canonicalName,
    String dataType,
    Boolean multipleValuesDataType,
    String name,
    Integer id,
    Long tag
  ) {
    super();
    setCanonicalName(canonicalName);
    setDataType(dataType);
    setMultipleValuesDataType(multipleValuesDataType);
    setName(name);
    setId(id);
    setTag(tag);
  }

}

