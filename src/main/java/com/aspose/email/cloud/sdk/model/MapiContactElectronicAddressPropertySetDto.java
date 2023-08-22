/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiContactElectronicAddressPropertySetDto.java">
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
 * Specify properties for up to three different e-mail addresses (Email1, Email2, and Email3) and three different fax addresses (Primary Fax, Business Fax, and Home Fax)             
 */
public class MapiContactElectronicAddressPropertySetDto {
  @JsonProperty("businessFax")
  private MapiContactElectronicAddressDto businessFax = null;
  @JsonProperty("defaultEmailAddress")
  private MapiContactElectronicAddressDto defaultEmailAddress = null;
  @JsonProperty("email1")
  private MapiContactElectronicAddressDto email1 = null;
  @JsonProperty("email2")
  private MapiContactElectronicAddressDto email2 = null;
  @JsonProperty("email3")
  private MapiContactElectronicAddressDto email3 = null;
  @JsonProperty("homeFax")
  private MapiContactElectronicAddressDto homeFax = null;
  @JsonProperty("isEmpty")
  private Boolean isEmpty = null;
  @JsonProperty("primaryFax")
  private MapiContactElectronicAddressDto primaryFax = null;
  @JsonProperty("useAutocomplete")
  private Boolean useAutocomplete = null;

  /**
   * Set businessFax and return this.
   * @param businessFax Refers to the group of properties that define the business fax address for a contact.
   * @return this
  **/
  public MapiContactElectronicAddressPropertySetDto businessFax(MapiContactElectronicAddressDto businessFax) {
    this.businessFax = businessFax;
    return this;
  }

  /**
   * Refers to the group of properties that define the business fax address for a contact.
   * @return businessFax
  **/
  public MapiContactElectronicAddressDto getBusinessFax() {
    return businessFax;
  }  

  /**
   * Set businessFax.
   * @param businessFax Refers to the group of properties that define the business fax address for a contact.
  **/
  public void setBusinessFax(MapiContactElectronicAddressDto businessFax) {
    this.businessFax = businessFax;
  }


  /**
   * Set defaultEmailAddress and return this.
   * @param defaultEmailAddress Default value of electronic address Uses when user does not set any electronic address if UseAutocomplete property is set &#39;true&#39;             
   * @return this
  **/
  public MapiContactElectronicAddressPropertySetDto defaultEmailAddress(MapiContactElectronicAddressDto defaultEmailAddress) {
    this.defaultEmailAddress = defaultEmailAddress;
    return this;
  }

  /**
   * Default value of electronic address Uses when user does not set any electronic address if UseAutocomplete property is set &#39;true&#39;             
   * @return defaultEmailAddress
  **/
  public MapiContactElectronicAddressDto getDefaultEmailAddress() {
    return defaultEmailAddress;
  }  

  /**
   * Set defaultEmailAddress.
   * @param defaultEmailAddress Default value of electronic address Uses when user does not set any electronic address if UseAutocomplete property is set &#39;true&#39;             
  **/
  public void setDefaultEmailAddress(MapiContactElectronicAddressDto defaultEmailAddress) {
    this.defaultEmailAddress = defaultEmailAddress;
  }


  /**
   * Set email1 and return this.
   * @param email1 Refers to the group of properties that define the first e-mail address for a contact.             
   * @return this
  **/
  public MapiContactElectronicAddressPropertySetDto email1(MapiContactElectronicAddressDto email1) {
    this.email1 = email1;
    return this;
  }

  /**
   * Refers to the group of properties that define the first e-mail address for a contact.             
   * @return email1
  **/
  public MapiContactElectronicAddressDto getEmail1() {
    return email1;
  }  

  /**
   * Set email1.
   * @param email1 Refers to the group of properties that define the first e-mail address for a contact.             
  **/
  public void setEmail1(MapiContactElectronicAddressDto email1) {
    this.email1 = email1;
  }


  /**
   * Set email2 and return this.
   * @param email2 Refers to the group of properties that define the second e-mail address for a contact.             
   * @return this
  **/
  public MapiContactElectronicAddressPropertySetDto email2(MapiContactElectronicAddressDto email2) {
    this.email2 = email2;
    return this;
  }

  /**
   * Refers to the group of properties that define the second e-mail address for a contact.             
   * @return email2
  **/
  public MapiContactElectronicAddressDto getEmail2() {
    return email2;
  }  

  /**
   * Set email2.
   * @param email2 Refers to the group of properties that define the second e-mail address for a contact.             
  **/
  public void setEmail2(MapiContactElectronicAddressDto email2) {
    this.email2 = email2;
  }


  /**
   * Set email3 and return this.
   * @param email3 Refers to the group of properties that define the third e-mail address for a contact.             
   * @return this
  **/
  public MapiContactElectronicAddressPropertySetDto email3(MapiContactElectronicAddressDto email3) {
    this.email3 = email3;
    return this;
  }

  /**
   * Refers to the group of properties that define the third e-mail address for a contact.             
   * @return email3
  **/
  public MapiContactElectronicAddressDto getEmail3() {
    return email3;
  }  

  /**
   * Set email3.
   * @param email3 Refers to the group of properties that define the third e-mail address for a contact.             
  **/
  public void setEmail3(MapiContactElectronicAddressDto email3) {
    this.email3 = email3;
  }


  /**
   * Set homeFax and return this.
   * @param homeFax Refers to the group of properties that define the home fax address for a contact.             
   * @return this
  **/
  public MapiContactElectronicAddressPropertySetDto homeFax(MapiContactElectronicAddressDto homeFax) {
    this.homeFax = homeFax;
    return this;
  }

  /**
   * Refers to the group of properties that define the home fax address for a contact.             
   * @return homeFax
  **/
  public MapiContactElectronicAddressDto getHomeFax() {
    return homeFax;
  }  

  /**
   * Set homeFax.
   * @param homeFax Refers to the group of properties that define the home fax address for a contact.             
  **/
  public void setHomeFax(MapiContactElectronicAddressDto homeFax) {
    this.homeFax = homeFax;
  }


  /**
   * Set isEmpty and return this.
   * @param isEmpty Shows if MapiContactElectronicAddressPropertySetDto is empty
   * @return this
  **/
  public MapiContactElectronicAddressPropertySetDto isEmpty(Boolean isEmpty) {
    this.isEmpty = isEmpty;
    return this;
  }

  /**
   * Shows if MapiContactElectronicAddressPropertySetDto is empty
   * @return isEmpty
  **/
  public Boolean isIsEmpty() {
    return isEmpty;
  }  

  /**
   * Set isEmpty.
   * @param isEmpty Shows if MapiContactElectronicAddressPropertySetDto is empty
  **/
  public void setIsEmpty(Boolean isEmpty) {
    this.isEmpty = isEmpty;
  }


  /**
   * Set primaryFax and return this.
   * @param primaryFax Refers to the group of properties that define the primary fax address for a contact.             
   * @return this
  **/
  public MapiContactElectronicAddressPropertySetDto primaryFax(MapiContactElectronicAddressDto primaryFax) {
    this.primaryFax = primaryFax;
    return this;
  }

  /**
   * Refers to the group of properties that define the primary fax address for a contact.             
   * @return primaryFax
  **/
  public MapiContactElectronicAddressDto getPrimaryFax() {
    return primaryFax;
  }  

  /**
   * Set primaryFax.
   * @param primaryFax Refers to the group of properties that define the primary fax address for a contact.             
  **/
  public void setPrimaryFax(MapiContactElectronicAddressDto primaryFax) {
    this.primaryFax = primaryFax;
  }


  /**
   * Set useAutocomplete and return this.
   * @param useAutocomplete Indicates that one electronic address is completed automatically in case if user does not set any electronic address             
   * @return this
  **/
  public MapiContactElectronicAddressPropertySetDto useAutocomplete(Boolean useAutocomplete) {
    this.useAutocomplete = useAutocomplete;
    return this;
  }

  /**
   * Indicates that one electronic address is completed automatically in case if user does not set any electronic address             
   * @return useAutocomplete
  **/
  public Boolean isUseAutocomplete() {
    return useAutocomplete;
  }  

  /**
   * Set useAutocomplete.
   * @param useAutocomplete Indicates that one electronic address is completed automatically in case if user does not set any electronic address             
  **/
  public void setUseAutocomplete(Boolean useAutocomplete) {
    this.useAutocomplete = useAutocomplete;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    MapiContactElectronicAddressPropertySetDto mapiContactElectronicAddressPropertySetDto = (MapiContactElectronicAddressPropertySetDto) o;
    return ObjectUtils.equals(this.businessFax, mapiContactElectronicAddressPropertySetDto.businessFax) &&
    ObjectUtils.equals(this.defaultEmailAddress, mapiContactElectronicAddressPropertySetDto.defaultEmailAddress) &&
    ObjectUtils.equals(this.email1, mapiContactElectronicAddressPropertySetDto.email1) &&
    ObjectUtils.equals(this.email2, mapiContactElectronicAddressPropertySetDto.email2) &&
    ObjectUtils.equals(this.email3, mapiContactElectronicAddressPropertySetDto.email3) &&
    ObjectUtils.equals(this.homeFax, mapiContactElectronicAddressPropertySetDto.homeFax) &&
    ObjectUtils.equals(this.isEmpty, mapiContactElectronicAddressPropertySetDto.isEmpty) &&
    ObjectUtils.equals(this.primaryFax, mapiContactElectronicAddressPropertySetDto.primaryFax) &&
    ObjectUtils.equals(this.useAutocomplete, mapiContactElectronicAddressPropertySetDto.useAutocomplete);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(businessFax, defaultEmailAddress, email1, email2, email3, homeFax, isEmpty, primaryFax, useAutocomplete);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapiContactElectronicAddressPropertySetDto {\n");
    
    sb.append("    businessFax: ").append(toIndentedString(getBusinessFax())).append("\n");
    sb.append("    defaultEmailAddress: ").append(toIndentedString(getDefaultEmailAddress())).append("\n");
    sb.append("    email1: ").append(toIndentedString(getEmail1())).append("\n");
    sb.append("    email2: ").append(toIndentedString(getEmail2())).append("\n");
    sb.append("    email3: ").append(toIndentedString(getEmail3())).append("\n");
    sb.append("    homeFax: ").append(toIndentedString(getHomeFax())).append("\n");
    sb.append("    isEmpty: ").append(toIndentedString(isIsEmpty())).append("\n");
    sb.append("    primaryFax: ").append(toIndentedString(getPrimaryFax())).append("\n");
    sb.append("    useAutocomplete: ").append(toIndentedString(isUseAutocomplete())).append("\n");
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

  public MapiContactElectronicAddressPropertySetDto() {
    super();
  }

  /**
   * Initializes a new instance of the MapiContactElectronicAddressPropertySetDto
   * @param businessFax Refers to the group of properties that define the business fax address for a contact.
   * @param defaultEmailAddress Default value of electronic address Uses when user does not set any electronic address if UseAutocomplete property is set &#39;true&#39;             
   * @param email1 Refers to the group of properties that define the first e-mail address for a contact.             
   * @param email2 Refers to the group of properties that define the second e-mail address for a contact.             
   * @param email3 Refers to the group of properties that define the third e-mail address for a contact.             
   * @param homeFax Refers to the group of properties that define the home fax address for a contact.             
   * @param isEmpty Shows if MapiContactElectronicAddressPropertySetDto is empty
   * @param primaryFax Refers to the group of properties that define the primary fax address for a contact.             
   * @param useAutocomplete Indicates that one electronic address is completed automatically in case if user does not set any electronic address             
   */
  public MapiContactElectronicAddressPropertySetDto(
    MapiContactElectronicAddressDto businessFax,
    MapiContactElectronicAddressDto defaultEmailAddress,
    MapiContactElectronicAddressDto email1,
    MapiContactElectronicAddressDto email2,
    MapiContactElectronicAddressDto email3,
    MapiContactElectronicAddressDto homeFax,
    Boolean isEmpty,
    MapiContactElectronicAddressDto primaryFax,
    Boolean useAutocomplete
  ) {
    super();
    setBusinessFax(businessFax);
    setDefaultEmailAddress(defaultEmailAddress);
    setEmail1(email1);
    setEmail2(email2);
    setEmail3(email3);
    setHomeFax(homeFax);
    setIsEmpty(isEmpty);
    setPrimaryFax(primaryFax);
    setUseAutocomplete(useAutocomplete);
  }

}

