/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CalendarDtoAlternateRq.java">
*   Copyright (c) 2018-2019 Aspose Pty Ltd. All rights reserved.
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
 * iCalendar document as AlternateView request             
 */
public class CalendarDtoAlternateRq {
  @JsonProperty("value")
  private CalendarDto value = null;

  @JsonProperty("action")
  private String action = null;

  @JsonProperty("sequenceId")
  private String sequenceId = null;

  public CalendarDtoAlternateRq value(CalendarDto value) {
    this.value = value;
    return this;
  }

  /**
   * iCalendar document model             
   * @return value
  **/
  public CalendarDto getValue() {
    return value;
  }  

  public void setValue(CalendarDto value) {
    this.value = value;
  }

  public CalendarDtoAlternateRq action(String action) {
    this.action = action;
    return this;
  }

  /**
   * iCalendar actions. Enum, available values: Create, Update, Cancel
   * @return action
  **/
  public String getAction() {
    return action;
  }  

  public void setAction(String action) {
    this.action = action;
  }

  public CalendarDtoAlternateRq sequenceId(String sequenceId) {
    this.sequenceId = sequenceId;
    return this;
  }

  /**
   * iCalendar sequence id             
   * @return sequenceId
  **/
  public String getSequenceId() {
    return sequenceId;
  }  

  public void setSequenceId(String sequenceId) {
    this.sequenceId = sequenceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    CalendarDtoAlternateRq calendarDtoAlternateRq = (CalendarDtoAlternateRq) o;
    return ObjectUtils.equals(this.value, calendarDtoAlternateRq.value) &&
    ObjectUtils.equals(this.action, calendarDtoAlternateRq.action) &&
    ObjectUtils.equals(this.sequenceId, calendarDtoAlternateRq.sequenceId);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(value, action, sequenceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarDtoAlternateRq {\n");
    
    sb.append("    value: ").append(toIndentedString(getValue())).append("\n");
    sb.append("    action: ").append(toIndentedString(getAction())).append("\n");
    sb.append("    sequenceId: ").append(toIndentedString(getSequenceId())).append("\n");
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

  public CalendarDtoAlternateRq() {
    super();
  }

  /**
   * Initializes a new instance of the CalendarDtoAlternateRq
   * @param value iCalendar document model             
   * @param action iCalendar actions. Enum, available values: Create, Update, Cancel
   * @param sequenceId iCalendar sequence id             
   */
  public CalendarDtoAlternateRq(CalendarDto value, String action, String sequenceId) {
    super();
    setValue(value);
    setAction(action);
    setSequenceId(sequenceId);
  }

}

