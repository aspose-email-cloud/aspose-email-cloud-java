/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiCalendarTimeZoneDto.java">
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
 * Represents the mapi calendar time zone information.             
 */
public class MapiCalendarTimeZoneDto {
  @JsonProperty("keyName")
  private String keyName = null;

  @JsonProperty("timeZoneRules")
  private List<MapiCalendarTimeZoneInfoDto> timeZoneRules = null;

  /**
   * Set keyName and return this.
   * @param keyName Human-readable description of the time zone.             
   * @return this
  **/
  public MapiCalendarTimeZoneDto keyName(String keyName) {
    this.keyName = keyName;
    return this;
  }

  /**
   * Human-readable description of the time zone.             
   * @return keyName
  **/
  public String getKeyName() {
    return keyName;
  }  

  /**
   * Set keyName.
   * @param keyName Human-readable description of the time zone.             
  **/
  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }

  /**
   * Set timeZoneRules and return this.
   * @param timeZoneRules Time zone rules             
   * @return this
  **/
  public MapiCalendarTimeZoneDto timeZoneRules(List<MapiCalendarTimeZoneInfoDto> timeZoneRules) {
    this.timeZoneRules = timeZoneRules;
    return this;
  }
  /**
   * Add an item to timeZoneRules and return this.
   * @param timeZoneRulesItem An item of: Time zone rules             
   * @return this
  **/
  public MapiCalendarTimeZoneDto addTimeZoneRulesItem(MapiCalendarTimeZoneInfoDto timeZoneRulesItem) {
    if (this.timeZoneRules == null) {
      this.timeZoneRules = new ArrayList<MapiCalendarTimeZoneInfoDto>();
    }
    this.timeZoneRules.add(timeZoneRulesItem);
    return this;
  }

  /**
   * Time zone rules             
   * @return timeZoneRules
  **/
  public List<MapiCalendarTimeZoneInfoDto> getTimeZoneRules() {
    return timeZoneRules;
  }  

  /**
   * Set timeZoneRules.
   * @param timeZoneRules Time zone rules             
  **/
  public void setTimeZoneRules(List<MapiCalendarTimeZoneInfoDto> timeZoneRules) {
    this.timeZoneRules = timeZoneRules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    MapiCalendarTimeZoneDto mapiCalendarTimeZoneDto = (MapiCalendarTimeZoneDto) o;
    return ObjectUtils.equals(this.keyName, mapiCalendarTimeZoneDto.keyName) &&
    ObjectUtils.equals(this.timeZoneRules, mapiCalendarTimeZoneDto.timeZoneRules);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(keyName, timeZoneRules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapiCalendarTimeZoneDto {\n");
    
    sb.append("    keyName: ").append(toIndentedString(getKeyName())).append("\n");
    sb.append("    timeZoneRules: ").append(toIndentedString(getTimeZoneRules())).append("\n");
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

  public MapiCalendarTimeZoneDto() {
    super();
  }

  /**
   * Initializes a new instance of the MapiCalendarTimeZoneDto
   * @param keyName Human-readable description of the time zone.             
   * @param timeZoneRules Time zone rules             
   */
  public MapiCalendarTimeZoneDto(
    String keyName,
    List<MapiCalendarTimeZoneInfoDto> timeZoneRules
  ) {
    super();
    setKeyName(keyName);
    setTimeZoneRules(timeZoneRules);
  }

}

