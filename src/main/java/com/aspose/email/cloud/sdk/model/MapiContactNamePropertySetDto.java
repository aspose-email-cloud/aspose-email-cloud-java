/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiContactNamePropertySetDto.java">
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
 * The properties are used to specify the name of the person represented by the contact             
 */
public class MapiContactNamePropertySetDto {
  @JsonProperty("displayName")
  private String displayName = null;
  @JsonProperty("displayNamePrefix")
  private String displayNamePrefix = null;
  @JsonProperty("fileUnder")
  private String fileUnder = null;
  @JsonProperty("fileUnderId")
  private Long fileUnderId = null;
  @JsonProperty("generation")
  private String generation = null;
  @JsonProperty("givenName")
  private String givenName = null;
  @JsonProperty("initials")
  private String initials = null;
  @JsonProperty("middleName")
  private String middleName = null;
  @JsonProperty("nickname")
  private String nickname = null;
  @JsonProperty("surname")
  private String surname = null;

  /**
   * Set displayName and return this.
   * @param displayName Full name of the contact             
   * @return this
  **/
  public MapiContactNamePropertySetDto displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Full name of the contact             
   * @return displayName
  **/
  public String getDisplayName() {
    return displayName;
  }  

  /**
   * Set displayName.
   * @param displayName Full name of the contact             
  **/
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  /**
   * Set displayNamePrefix and return this.
   * @param displayNamePrefix Title of the contact             
   * @return this
  **/
  public MapiContactNamePropertySetDto displayNamePrefix(String displayNamePrefix) {
    this.displayNamePrefix = displayNamePrefix;
    return this;
  }

  /**
   * Title of the contact             
   * @return displayNamePrefix
  **/
  public String getDisplayNamePrefix() {
    return displayNamePrefix;
  }  

  /**
   * Set displayNamePrefix.
   * @param displayNamePrefix Title of the contact             
  **/
  public void setDisplayNamePrefix(String displayNamePrefix) {
    this.displayNamePrefix = displayNamePrefix;
  }


  /**
   * Set fileUnder and return this.
   * @param fileUnder Name under which to file this contact when displaying a list of contacts             
   * @return this
  **/
  public MapiContactNamePropertySetDto fileUnder(String fileUnder) {
    this.fileUnder = fileUnder;
    return this;
  }

  /**
   * Name under which to file this contact when displaying a list of contacts             
   * @return fileUnder
  **/
  public String getFileUnder() {
    return fileUnder;
  }  

  /**
   * Set fileUnder.
   * @param fileUnder Name under which to file this contact when displaying a list of contacts             
  **/
  public void setFileUnder(String fileUnder) {
    this.fileUnder = fileUnder;
  }


  /**
   * Set fileUnderId and return this.
   * @param fileUnderId Value specifying how to generate and recompute the property when other properties are changed             
   * @return this
  **/
  public MapiContactNamePropertySetDto fileUnderId(Long fileUnderId) {
    this.fileUnderId = fileUnderId;
    return this;
  }

  /**
   * Value specifying how to generate and recompute the property when other properties are changed             
   * @return fileUnderId
  **/
  public Long getFileUnderId() {
    return fileUnderId;
  }  

  /**
   * Set fileUnderId.
   * @param fileUnderId Value specifying how to generate and recompute the property when other properties are changed             
  **/
  public void setFileUnderId(Long fileUnderId) {
    this.fileUnderId = fileUnderId;
  }


  /**
   * Set generation and return this.
   * @param generation Generation suffix of the contact             
   * @return this
  **/
  public MapiContactNamePropertySetDto generation(String generation) {
    this.generation = generation;
    return this;
  }

  /**
   * Generation suffix of the contact             
   * @return generation
  **/
  public String getGeneration() {
    return generation;
  }  

  /**
   * Set generation.
   * @param generation Generation suffix of the contact             
  **/
  public void setGeneration(String generation) {
    this.generation = generation;
  }


  /**
   * Set givenName and return this.
   * @param givenName Given name (first name) of the contact             
   * @return this
  **/
  public MapiContactNamePropertySetDto givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

  /**
   * Given name (first name) of the contact             
   * @return givenName
  **/
  public String getGivenName() {
    return givenName;
  }  

  /**
   * Set givenName.
   * @param givenName Given name (first name) of the contact             
  **/
  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }


  /**
   * Set initials and return this.
   * @param initials Initials of the contact             
   * @return this
  **/
  public MapiContactNamePropertySetDto initials(String initials) {
    this.initials = initials;
    return this;
  }

  /**
   * Initials of the contact             
   * @return initials
  **/
  public String getInitials() {
    return initials;
  }  

  /**
   * Set initials.
   * @param initials Initials of the contact             
  **/
  public void setInitials(String initials) {
    this.initials = initials;
  }


  /**
   * Set middleName and return this.
   * @param middleName Middle name of the contact             
   * @return this
  **/
  public MapiContactNamePropertySetDto middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Middle name of the contact             
   * @return middleName
  **/
  public String getMiddleName() {
    return middleName;
  }  

  /**
   * Set middleName.
   * @param middleName Middle name of the contact             
  **/
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }


  /**
   * Set nickname and return this.
   * @param nickname Nickname of the contact             
   * @return this
  **/
  public MapiContactNamePropertySetDto nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

  /**
   * Nickname of the contact             
   * @return nickname
  **/
  public String getNickname() {
    return nickname;
  }  

  /**
   * Set nickname.
   * @param nickname Nickname of the contact             
  **/
  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  /**
   * Set surname and return this.
   * @param surname Surname (family name) of the contact             
   * @return this
  **/
  public MapiContactNamePropertySetDto surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Surname (family name) of the contact             
   * @return surname
  **/
  public String getSurname() {
    return surname;
  }  

  /**
   * Set surname.
   * @param surname Surname (family name) of the contact             
  **/
  public void setSurname(String surname) {
    this.surname = surname;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    MapiContactNamePropertySetDto mapiContactNamePropertySetDto = (MapiContactNamePropertySetDto) o;
    return ObjectUtils.equals(this.displayName, mapiContactNamePropertySetDto.displayName) &&
    ObjectUtils.equals(this.displayNamePrefix, mapiContactNamePropertySetDto.displayNamePrefix) &&
    ObjectUtils.equals(this.fileUnder, mapiContactNamePropertySetDto.fileUnder) &&
    ObjectUtils.equals(this.fileUnderId, mapiContactNamePropertySetDto.fileUnderId) &&
    ObjectUtils.equals(this.generation, mapiContactNamePropertySetDto.generation) &&
    ObjectUtils.equals(this.givenName, mapiContactNamePropertySetDto.givenName) &&
    ObjectUtils.equals(this.initials, mapiContactNamePropertySetDto.initials) &&
    ObjectUtils.equals(this.middleName, mapiContactNamePropertySetDto.middleName) &&
    ObjectUtils.equals(this.nickname, mapiContactNamePropertySetDto.nickname) &&
    ObjectUtils.equals(this.surname, mapiContactNamePropertySetDto.surname);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(displayName, displayNamePrefix, fileUnder, fileUnderId, generation, givenName, initials, middleName, nickname, surname);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapiContactNamePropertySetDto {\n");
    
    sb.append("    displayName: ").append(toIndentedString(getDisplayName())).append("\n");
    sb.append("    displayNamePrefix: ").append(toIndentedString(getDisplayNamePrefix())).append("\n");
    sb.append("    fileUnder: ").append(toIndentedString(getFileUnder())).append("\n");
    sb.append("    fileUnderId: ").append(toIndentedString(getFileUnderId())).append("\n");
    sb.append("    generation: ").append(toIndentedString(getGeneration())).append("\n");
    sb.append("    givenName: ").append(toIndentedString(getGivenName())).append("\n");
    sb.append("    initials: ").append(toIndentedString(getInitials())).append("\n");
    sb.append("    middleName: ").append(toIndentedString(getMiddleName())).append("\n");
    sb.append("    nickname: ").append(toIndentedString(getNickname())).append("\n");
    sb.append("    surname: ").append(toIndentedString(getSurname())).append("\n");
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

  public MapiContactNamePropertySetDto() {
    super();
  }

  /**
   * Initializes a new instance of the MapiContactNamePropertySetDto
   * @param displayName Full name of the contact             
   * @param displayNamePrefix Title of the contact             
   * @param fileUnder Name under which to file this contact when displaying a list of contacts             
   * @param fileUnderId Value specifying how to generate and recompute the property when other properties are changed             
   * @param generation Generation suffix of the contact             
   * @param givenName Given name (first name) of the contact             
   * @param initials Initials of the contact             
   * @param middleName Middle name of the contact             
   * @param nickname Nickname of the contact             
   * @param surname Surname (family name) of the contact             
   */
  public MapiContactNamePropertySetDto(
    String displayName,
    String displayNamePrefix,
    String fileUnder,
    Long fileUnderId,
    String generation,
    String givenName,
    String initials,
    String middleName,
    String nickname,
    String surname
  ) {
    super();
    setDisplayName(displayName);
    setDisplayNamePrefix(displayNamePrefix);
    setFileUnder(fileUnder);
    setFileUnderId(fileUnderId);
    setGeneration(generation);
    setGivenName(givenName);
    setInitials(initials);
    setMiddleName(middleName);
    setNickname(nickname);
    setSurname(surname);
  }

}

