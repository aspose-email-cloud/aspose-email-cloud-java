/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="TaskRegeneratingPatternDto.java">
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
 * Represents the regenerating recurrence pattern that specifies how many days, weeks, months or years after the completion of the current task the next occurrence will be due.             
 */
public class TaskRegeneratingPatternDto extends RecurrencePatternDto {
  @JsonProperty("regeneratingType")
  private String regeneratingType = null;

  /**
   * Set regeneratingType and return this.
   * @param regeneratingType Enumerates the types of regenerating pattern. Enum, available values: Daily, Weekly, Monthly, Yearly
   * @return this
  **/
  public TaskRegeneratingPatternDto regeneratingType(String regeneratingType) {
    this.regeneratingType = regeneratingType;
    return this;
  }

  /**
   * Enumerates the types of regenerating pattern. Enum, available values: Daily, Weekly, Monthly, Yearly
   * @return regeneratingType
  **/
  public String getRegeneratingType() {
    return regeneratingType;
  }  

  /**
   * Set regeneratingType.
   * @param regeneratingType Enumerates the types of regenerating pattern. Enum, available values: Daily, Weekly, Monthly, Yearly
  **/
  public void setRegeneratingType(String regeneratingType) {
    this.regeneratingType = regeneratingType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    TaskRegeneratingPatternDto taskRegeneratingPatternDto = (TaskRegeneratingPatternDto) o;
    return ObjectUtils.equals(this.regeneratingType, taskRegeneratingPatternDto.regeneratingType) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(regeneratingType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskRegeneratingPatternDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    interval: ").append(toIndentedString(getInterval())).append("\n");
    sb.append("    occurs: ").append(toIndentedString(getOccurs())).append("\n");
    sb.append("    endDate: ").append(toIndentedString(getEndDate())).append("\n");
    sb.append("    weekStart: ").append(toIndentedString(getWeekStart())).append("\n");
    sb.append("    discriminator: ").append(toIndentedString(getDiscriminator())).append("\n");
    sb.append("    regeneratingType: ").append(toIndentedString(getRegeneratingType())).append("\n");
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

  public TaskRegeneratingPatternDto() {
    super();
  }

  /**
   * Initializes a new instance of the TaskRegeneratingPatternDto
   * @param interval Number of recurrence units.             
   * @param occurs Number of occurrences of the recurrence pattern.             
   * @param endDate End date.             
   * @param weekStart Represents the day of the week. Enum, available values: None, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday, Day, WeekDay, WeekendDay
   * @param discriminator 
   * @param regeneratingType Enumerates the types of regenerating pattern. Enum, available values: Daily, Weekly, Monthly, Yearly
   */
  public TaskRegeneratingPatternDto(Integer interval, Integer occurs, Date endDate, String weekStart, String discriminator, String regeneratingType) {
    super();
    setInterval(interval);
    setOccurs(occurs);
    setEndDate(endDate);
    setWeekStart(weekStart);
    setDiscriminator(discriminator);
    setRegeneratingType(regeneratingType);
  }

}

