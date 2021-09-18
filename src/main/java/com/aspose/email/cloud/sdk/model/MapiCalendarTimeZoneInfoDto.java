/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiCalendarTimeZoneInfoDto.java">
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
 * Represents the mapi calendar time zone rule.             
 */
public class MapiCalendarTimeZoneInfoDto {
  @JsonProperty("bias")
  private Integer bias = null;
  @JsonProperty("daylightBias")
  private Integer daylightBias = null;
  @JsonProperty("daylightDate")
  private MapiCalendarTimeZoneRuleDto daylightDate = null;
  @JsonProperty("standardBias")
  private Integer standardBias = null;
  @JsonProperty("standardDate")
  private MapiCalendarTimeZoneRuleDto standardDate = null;
  @JsonProperty("timeZoneFlags")
  private List<String> timeZoneFlags = null;
  @JsonProperty("year")
  private Integer year = null;

  /**
   * Set bias and return this.
   * @param bias Time zone&#39;s offset in minutes from UTC.             
   * @return this
  **/
  public MapiCalendarTimeZoneInfoDto bias(Integer bias) {
    this.bias = bias;
    return this;
  }

  /**
   * Time zone&#39;s offset in minutes from UTC.             
   * @return bias
  **/
  public Integer getBias() {
    return bias;
  }  

  /**
   * Set bias.
   * @param bias Time zone&#39;s offset in minutes from UTC.             
  **/
  public void setBias(Integer bias) {
    this.bias = bias;
  }


  /**
   * Set daylightBias and return this.
   * @param daylightBias Offset in minutes from lBias during daylight saving time.             
   * @return this
  **/
  public MapiCalendarTimeZoneInfoDto daylightBias(Integer daylightBias) {
    this.daylightBias = daylightBias;
    return this;
  }

  /**
   * Offset in minutes from lBias during daylight saving time.             
   * @return daylightBias
  **/
  public Integer getDaylightBias() {
    return daylightBias;
  }  

  /**
   * Set daylightBias.
   * @param daylightBias Offset in minutes from lBias during daylight saving time.             
  **/
  public void setDaylightBias(Integer daylightBias) {
    this.daylightBias = daylightBias;
  }


  /**
   * Set daylightDate and return this.
   * @param daylightDate Date and local time that indicate when to begin using the DaylightBias.             
   * @return this
  **/
  public MapiCalendarTimeZoneInfoDto daylightDate(MapiCalendarTimeZoneRuleDto daylightDate) {
    this.daylightDate = daylightDate;
    return this;
  }

  /**
   * Date and local time that indicate when to begin using the DaylightBias.             
   * @return daylightDate
  **/
  public MapiCalendarTimeZoneRuleDto getDaylightDate() {
    return daylightDate;
  }  

  /**
   * Set daylightDate.
   * @param daylightDate Date and local time that indicate when to begin using the DaylightBias.             
  **/
  public void setDaylightDate(MapiCalendarTimeZoneRuleDto daylightDate) {
    this.daylightDate = daylightDate;
  }


  /**
   * Set standardBias and return this.
   * @param standardBias Offset in minutes from lBias during standard time.             
   * @return this
  **/
  public MapiCalendarTimeZoneInfoDto standardBias(Integer standardBias) {
    this.standardBias = standardBias;
    return this;
  }

  /**
   * Offset in minutes from lBias during standard time.             
   * @return standardBias
  **/
  public Integer getStandardBias() {
    return standardBias;
  }  

  /**
   * Set standardBias.
   * @param standardBias Offset in minutes from lBias during standard time.             
  **/
  public void setStandardBias(Integer standardBias) {
    this.standardBias = standardBias;
  }


  /**
   * Set standardDate and return this.
   * @param standardDate Date and local time that indicate when to begin using the StandardBias.             
   * @return this
  **/
  public MapiCalendarTimeZoneInfoDto standardDate(MapiCalendarTimeZoneRuleDto standardDate) {
    this.standardDate = standardDate;
    return this;
  }

  /**
   * Date and local time that indicate when to begin using the StandardBias.             
   * @return standardDate
  **/
  public MapiCalendarTimeZoneRuleDto getStandardDate() {
    return standardDate;
  }  

  /**
   * Set standardDate.
   * @param standardDate Date and local time that indicate when to begin using the StandardBias.             
  **/
  public void setStandardDate(MapiCalendarTimeZoneRuleDto standardDate) {
    this.standardDate = standardDate;
  }


  /**
   * Set timeZoneFlags and return this.
   * @param timeZoneFlags Individual bit flags that specify information about this TimeZoneRule.              Items: Enumerates the individual bit flags that specify information about TimeZoneRule./nEnum, available values: TzRuleFlagRecurCurrentTzReg, TzRuleFlagEffectiveTzReg
   * @return this
  **/
  public MapiCalendarTimeZoneInfoDto timeZoneFlags(List<String> timeZoneFlags) {
    this.timeZoneFlags = timeZoneFlags;
    return this;
  }
  /**
   * Add an item to timeZoneFlags and return this.
   * @param timeZoneFlagsItem An item of: Individual bit flags that specify information about this TimeZoneRule.             
   * @return this
  **/
  public MapiCalendarTimeZoneInfoDto addTimeZoneFlagsItem(String timeZoneFlagsItem) {
    if (this.timeZoneFlags == null) {
      this.timeZoneFlags = new ArrayList<String>();
    }
    this.timeZoneFlags.add(timeZoneFlagsItem);
    return this;
  }

  /**
   * Individual bit flags that specify information about this TimeZoneRule.              Items: Enumerates the individual bit flags that specify information about TimeZoneRule./nEnum, available values: TzRuleFlagRecurCurrentTzReg, TzRuleFlagEffectiveTzReg
   * @return timeZoneFlags
  **/
  public List<String> getTimeZoneFlags() {
    return timeZoneFlags;
  }  

  /**
   * Set timeZoneFlags.
   * @param timeZoneFlags Individual bit flags that specify information about this TimeZoneRule.              Items: Enumerates the individual bit flags that specify information about TimeZoneRule./nEnum, available values: TzRuleFlagRecurCurrentTzReg, TzRuleFlagEffectiveTzReg
  **/
  public void setTimeZoneFlags(List<String> timeZoneFlags) {
    this.timeZoneFlags = timeZoneFlags;
  }


  /**
   * Set year and return this.
   * @param year Year in which this rule is scheduled to take effect.             
   * @return this
  **/
  public MapiCalendarTimeZoneInfoDto year(Integer year) {
    this.year = year;
    return this;
  }

  /**
   * Year in which this rule is scheduled to take effect.             
   * @return year
  **/
  public Integer getYear() {
    return year;
  }  

  /**
   * Set year.
   * @param year Year in which this rule is scheduled to take effect.             
  **/
  public void setYear(Integer year) {
    this.year = year;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    MapiCalendarTimeZoneInfoDto mapiCalendarTimeZoneInfoDto = (MapiCalendarTimeZoneInfoDto) o;
    return ObjectUtils.equals(this.bias, mapiCalendarTimeZoneInfoDto.bias) &&
    ObjectUtils.equals(this.daylightBias, mapiCalendarTimeZoneInfoDto.daylightBias) &&
    ObjectUtils.equals(this.daylightDate, mapiCalendarTimeZoneInfoDto.daylightDate) &&
    ObjectUtils.equals(this.standardBias, mapiCalendarTimeZoneInfoDto.standardBias) &&
    ObjectUtils.equals(this.standardDate, mapiCalendarTimeZoneInfoDto.standardDate) &&
    ObjectUtils.equals(this.timeZoneFlags, mapiCalendarTimeZoneInfoDto.timeZoneFlags) &&
    ObjectUtils.equals(this.year, mapiCalendarTimeZoneInfoDto.year);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(bias, daylightBias, daylightDate, standardBias, standardDate, timeZoneFlags, year);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapiCalendarTimeZoneInfoDto {\n");
    
    sb.append("    bias: ").append(toIndentedString(getBias())).append("\n");
    sb.append("    daylightBias: ").append(toIndentedString(getDaylightBias())).append("\n");
    sb.append("    daylightDate: ").append(toIndentedString(getDaylightDate())).append("\n");
    sb.append("    standardBias: ").append(toIndentedString(getStandardBias())).append("\n");
    sb.append("    standardDate: ").append(toIndentedString(getStandardDate())).append("\n");
    sb.append("    timeZoneFlags: ").append(toIndentedString(getTimeZoneFlags())).append("\n");
    sb.append("    year: ").append(toIndentedString(getYear())).append("\n");
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

  public MapiCalendarTimeZoneInfoDto() {
    super();
  }

  /**
   * Initializes a new instance of the MapiCalendarTimeZoneInfoDto
   * @param bias Time zone&#39;s offset in minutes from UTC.             
   * @param daylightBias Offset in minutes from lBias during daylight saving time.             
   * @param daylightDate Date and local time that indicate when to begin using the DaylightBias.             
   * @param standardBias Offset in minutes from lBias during standard time.             
   * @param standardDate Date and local time that indicate when to begin using the StandardBias.             
   * @param timeZoneFlags Individual bit flags that specify information about this TimeZoneRule.              Items: Enumerates the individual bit flags that specify information about TimeZoneRule./nEnum, available values: TzRuleFlagRecurCurrentTzReg, TzRuleFlagEffectiveTzReg
   * @param year Year in which this rule is scheduled to take effect.             
   */
  public MapiCalendarTimeZoneInfoDto(
    Integer bias,
    Integer daylightBias,
    MapiCalendarTimeZoneRuleDto daylightDate,
    Integer standardBias,
    MapiCalendarTimeZoneRuleDto standardDate,
    List<String> timeZoneFlags,
    Integer year
  ) {
    super();
    setBias(bias);
    setDaylightBias(daylightBias);
    setDaylightDate(daylightDate);
    setStandardBias(standardBias);
    setStandardDate(standardDate);
    setTimeZoneFlags(timeZoneFlags);
    setYear(year);
  }

}

