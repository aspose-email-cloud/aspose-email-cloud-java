/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiContactOtherPropertySetDto.java">
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
 * The properties are used to specify additional properties of contact.             
 */
public class MapiContactOtherPropertySetDto {
  @JsonProperty("_private")
  private Boolean _private = null;
  @JsonProperty("journal")
  private Boolean journal = null;
  @JsonProperty("reminderTime")
  private Date reminderTime = null;
  @JsonProperty("reminderTopic")
  private String reminderTopic = null;
  @JsonProperty("userField1")
  private String userField1 = null;
  @JsonProperty("userField2")
  private String userField2 = null;
  @JsonProperty("userField3")
  private String userField3 = null;
  @JsonProperty("userField4")
  private String userField4 = null;

  /**
   * Set _private and return this.
   * @param _private Indicates whether the end-user wants this message object hidden from other users who have access to the message object.             
   * @return this
  **/
  public MapiContactOtherPropertySetDto _private(Boolean _private) {
    this._private = _private;
    return this;
  }

  /**
   * Indicates whether the end-user wants this message object hidden from other users who have access to the message object.             
   * @return _private
  **/
  public Boolean isPrivate() {
    return _private;
  }  

  /**
   * Set _private.
   * @param _private Indicates whether the end-user wants this message object hidden from other users who have access to the message object.             
  **/
  public void setPrivate(Boolean _private) {
    this._private = _private;
  }


  /**
   * Set journal and return this.
   * @param journal Specifies whether to create a journal for each action associated with this contact.             
   * @return this
  **/
  public MapiContactOtherPropertySetDto journal(Boolean journal) {
    this.journal = journal;
    return this;
  }

  /**
   * Specifies whether to create a journal for each action associated with this contact.             
   * @return journal
  **/
  public Boolean isJournal() {
    return journal;
  }  

  /**
   * Set journal.
   * @param journal Specifies whether to create a journal for each action associated with this contact.             
  **/
  public void setJournal(Boolean journal) {
    this.journal = journal;
  }


  /**
   * Set reminderTime and return this.
   * @param reminderTime Specifies the initial signal time for a reminder.             
   * @return this
  **/
  public MapiContactOtherPropertySetDto reminderTime(Date reminderTime) {
    this.reminderTime = reminderTime;
    return this;
  }

  /**
   * Specifies the initial signal time for a reminder.             
   * @return reminderTime
  **/
  public Date getReminderTime() {
    return reminderTime;
  }  

  /**
   * Set reminderTime.
   * @param reminderTime Specifies the initial signal time for a reminder.             
  **/
  public void setReminderTime(Date reminderTime) {
    this.reminderTime = reminderTime;
  }


  /**
   * Set reminderTopic and return this.
   * @param reminderTopic Represents the status of a meeting request.             
   * @return this
  **/
  public MapiContactOtherPropertySetDto reminderTopic(String reminderTopic) {
    this.reminderTopic = reminderTopic;
    return this;
  }

  /**
   * Represents the status of a meeting request.             
   * @return reminderTopic
  **/
  public String getReminderTopic() {
    return reminderTopic;
  }  

  /**
   * Set reminderTopic.
   * @param reminderTopic Represents the status of a meeting request.             
  **/
  public void setReminderTopic(String reminderTopic) {
    this.reminderTopic = reminderTopic;
  }


  /**
   * Set userField1 and return this.
   * @param userField1 Specifies the first field on the contact that is intended for miscellaneous use for the contact.             
   * @return this
  **/
  public MapiContactOtherPropertySetDto userField1(String userField1) {
    this.userField1 = userField1;
    return this;
  }

  /**
   * Specifies the first field on the contact that is intended for miscellaneous use for the contact.             
   * @return userField1
  **/
  public String getUserField1() {
    return userField1;
  }  

  /**
   * Set userField1.
   * @param userField1 Specifies the first field on the contact that is intended for miscellaneous use for the contact.             
  **/
  public void setUserField1(String userField1) {
    this.userField1 = userField1;
  }


  /**
   * Set userField2 and return this.
   * @param userField2 Specifies the second field on the contact that is intended for miscellaneous use for the contact.             
   * @return this
  **/
  public MapiContactOtherPropertySetDto userField2(String userField2) {
    this.userField2 = userField2;
    return this;
  }

  /**
   * Specifies the second field on the contact that is intended for miscellaneous use for the contact.             
   * @return userField2
  **/
  public String getUserField2() {
    return userField2;
  }  

  /**
   * Set userField2.
   * @param userField2 Specifies the second field on the contact that is intended for miscellaneous use for the contact.             
  **/
  public void setUserField2(String userField2) {
    this.userField2 = userField2;
  }


  /**
   * Set userField3 and return this.
   * @param userField3 Specifies the third field on the contact that is intended for miscellaneous use for the contact.             
   * @return this
  **/
  public MapiContactOtherPropertySetDto userField3(String userField3) {
    this.userField3 = userField3;
    return this;
  }

  /**
   * Specifies the third field on the contact that is intended for miscellaneous use for the contact.             
   * @return userField3
  **/
  public String getUserField3() {
    return userField3;
  }  

  /**
   * Set userField3.
   * @param userField3 Specifies the third field on the contact that is intended for miscellaneous use for the contact.             
  **/
  public void setUserField3(String userField3) {
    this.userField3 = userField3;
  }


  /**
   * Set userField4 and return this.
   * @param userField4 Specifies the forth field on the contact that is intended for miscellaneous use for the contact.             
   * @return this
  **/
  public MapiContactOtherPropertySetDto userField4(String userField4) {
    this.userField4 = userField4;
    return this;
  }

  /**
   * Specifies the forth field on the contact that is intended for miscellaneous use for the contact.             
   * @return userField4
  **/
  public String getUserField4() {
    return userField4;
  }  

  /**
   * Set userField4.
   * @param userField4 Specifies the forth field on the contact that is intended for miscellaneous use for the contact.             
  **/
  public void setUserField4(String userField4) {
    this.userField4 = userField4;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    MapiContactOtherPropertySetDto mapiContactOtherPropertySetDto = (MapiContactOtherPropertySetDto) o;
    return ObjectUtils.equals(this._private, mapiContactOtherPropertySetDto._private) &&
    ObjectUtils.equals(this.journal, mapiContactOtherPropertySetDto.journal) &&
    ObjectUtils.equals(this.reminderTime, mapiContactOtherPropertySetDto.reminderTime) &&
    ObjectUtils.equals(this.reminderTopic, mapiContactOtherPropertySetDto.reminderTopic) &&
    ObjectUtils.equals(this.userField1, mapiContactOtherPropertySetDto.userField1) &&
    ObjectUtils.equals(this.userField2, mapiContactOtherPropertySetDto.userField2) &&
    ObjectUtils.equals(this.userField3, mapiContactOtherPropertySetDto.userField3) &&
    ObjectUtils.equals(this.userField4, mapiContactOtherPropertySetDto.userField4);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(_private, journal, reminderTime, reminderTopic, userField1, userField2, userField3, userField4);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapiContactOtherPropertySetDto {\n");
    
    sb.append("    _private: ").append(toIndentedString(isPrivate())).append("\n");
    sb.append("    journal: ").append(toIndentedString(isJournal())).append("\n");
    sb.append("    reminderTime: ").append(toIndentedString(getReminderTime())).append("\n");
    sb.append("    reminderTopic: ").append(toIndentedString(getReminderTopic())).append("\n");
    sb.append("    userField1: ").append(toIndentedString(getUserField1())).append("\n");
    sb.append("    userField2: ").append(toIndentedString(getUserField2())).append("\n");
    sb.append("    userField3: ").append(toIndentedString(getUserField3())).append("\n");
    sb.append("    userField4: ").append(toIndentedString(getUserField4())).append("\n");
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

  public MapiContactOtherPropertySetDto() {
    super();
  }

  /**
   * Initializes a new instance of the MapiContactOtherPropertySetDto
   * @param _private Indicates whether the end-user wants this message object hidden from other users who have access to the message object.             
   * @param journal Specifies whether to create a journal for each action associated with this contact.             
   * @param reminderTime Specifies the initial signal time for a reminder.             
   * @param reminderTopic Represents the status of a meeting request.             
   * @param userField1 Specifies the first field on the contact that is intended for miscellaneous use for the contact.             
   * @param userField2 Specifies the second field on the contact that is intended for miscellaneous use for the contact.             
   * @param userField3 Specifies the third field on the contact that is intended for miscellaneous use for the contact.             
   * @param userField4 Specifies the forth field on the contact that is intended for miscellaneous use for the contact.             
   */
  public MapiContactOtherPropertySetDto(
    Boolean _private,
    Boolean journal,
    Date reminderTime,
    String reminderTopic,
    String userField1,
    String userField2,
    String userField3,
    String userField4
  ) {
    super();
    setPrivate(_private);
    setJournal(journal);
    setReminderTime(reminderTime);
    setReminderTopic(reminderTopic);
    setUserField1(userField1);
    setUserField2(userField2);
    setUserField3(userField3);
    setUserField4(userField4);
  }

}

