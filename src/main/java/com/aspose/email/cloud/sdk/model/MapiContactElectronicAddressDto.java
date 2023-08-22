/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiContactElectronicAddressDto.java">
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
 * Refers to the group of properties that define the e-mail address or fax address for a contact.             
 */
public class MapiContactElectronicAddressDto {
  @JsonProperty("addressType")
  private String addressType = null;
  @JsonProperty("displayName")
  private String displayName = null;
  @JsonProperty("emailAddress")
  private String emailAddress = null;
  @JsonProperty("faxNumber")
  private String faxNumber = null;
  @JsonProperty("isEmpty")
  private Boolean isEmpty = null;
  @JsonProperty("originalDisplayName")
  private String originalDisplayName = null;

  /**
   * Set addressType and return this.
   * @param addressType Address type of an electronic address
   * @return this
  **/
  public MapiContactElectronicAddressDto addressType(String addressType) {
    this.addressType = addressType;
    return this;
  }

  /**
   * Address type of an electronic address
   * @return addressType
  **/
  public String getAddressType() {
    return addressType;
  }  

  /**
   * Set addressType.
   * @param addressType Address type of an electronic address
  **/
  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }


  /**
   * Set displayName and return this.
   * @param displayName User-readable display name for the e-mail address
   * @return this
  **/
  public MapiContactElectronicAddressDto displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * User-readable display name for the e-mail address
   * @return displayName
  **/
  public String getDisplayName() {
    return displayName;
  }  

  /**
   * Set displayName.
   * @param displayName User-readable display name for the e-mail address
  **/
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  /**
   * Set emailAddress and return this.
   * @param emailAddress E-mail address of the contact
   * @return this
  **/
  public MapiContactElectronicAddressDto emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * E-mail address of the contact
   * @return emailAddress
  **/
  public String getEmailAddress() {
    return emailAddress;
  }  

  /**
   * Set emailAddress.
   * @param emailAddress E-mail address of the contact
  **/
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  /**
   * Set faxNumber and return this.
   * @param faxNumber Telephone number of the mail user&#39;s primary fax machine
   * @return this
  **/
  public MapiContactElectronicAddressDto faxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }

  /**
   * Telephone number of the mail user&#39;s primary fax machine
   * @return faxNumber
  **/
  public String getFaxNumber() {
    return faxNumber;
  }  

  /**
   * Set faxNumber.
   * @param faxNumber Telephone number of the mail user&#39;s primary fax machine
  **/
  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }


  /**
   * Set isEmpty and return this.
   * @param isEmpty Shows if MapiContactElectronicAddress is empty
   * @return this
  **/
  public MapiContactElectronicAddressDto isEmpty(Boolean isEmpty) {
    this.isEmpty = isEmpty;
    return this;
  }

  /**
   * Shows if MapiContactElectronicAddress is empty
   * @return isEmpty
  **/
  public Boolean isIsEmpty() {
    return isEmpty;
  }  

  /**
   * Set isEmpty.
   * @param isEmpty Shows if MapiContactElectronicAddress is empty
  **/
  public void setIsEmpty(Boolean isEmpty) {
    this.isEmpty = isEmpty;
  }


  /**
   * Set originalDisplayName and return this.
   * @param originalDisplayName SMTP e-mail address that corresponds to the e-mail address for the Contact object.
   * @return this
  **/
  public MapiContactElectronicAddressDto originalDisplayName(String originalDisplayName) {
    this.originalDisplayName = originalDisplayName;
    return this;
  }

  /**
   * SMTP e-mail address that corresponds to the e-mail address for the Contact object.
   * @return originalDisplayName
  **/
  public String getOriginalDisplayName() {
    return originalDisplayName;
  }  

  /**
   * Set originalDisplayName.
   * @param originalDisplayName SMTP e-mail address that corresponds to the e-mail address for the Contact object.
  **/
  public void setOriginalDisplayName(String originalDisplayName) {
    this.originalDisplayName = originalDisplayName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    MapiContactElectronicAddressDto mapiContactElectronicAddressDto = (MapiContactElectronicAddressDto) o;
    return ObjectUtils.equals(this.addressType, mapiContactElectronicAddressDto.addressType) &&
    ObjectUtils.equals(this.displayName, mapiContactElectronicAddressDto.displayName) &&
    ObjectUtils.equals(this.emailAddress, mapiContactElectronicAddressDto.emailAddress) &&
    ObjectUtils.equals(this.faxNumber, mapiContactElectronicAddressDto.faxNumber) &&
    ObjectUtils.equals(this.isEmpty, mapiContactElectronicAddressDto.isEmpty) &&
    ObjectUtils.equals(this.originalDisplayName, mapiContactElectronicAddressDto.originalDisplayName);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(addressType, displayName, emailAddress, faxNumber, isEmpty, originalDisplayName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapiContactElectronicAddressDto {\n");
    
    sb.append("    addressType: ").append(toIndentedString(getAddressType())).append("\n");
    sb.append("    displayName: ").append(toIndentedString(getDisplayName())).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(getEmailAddress())).append("\n");
    sb.append("    faxNumber: ").append(toIndentedString(getFaxNumber())).append("\n");
    sb.append("    isEmpty: ").append(toIndentedString(isIsEmpty())).append("\n");
    sb.append("    originalDisplayName: ").append(toIndentedString(getOriginalDisplayName())).append("\n");
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

  public MapiContactElectronicAddressDto() {
    super();
  }

  /**
   * Initializes a new instance of the MapiContactElectronicAddressDto
   * @param addressType Address type of an electronic address
   * @param displayName User-readable display name for the e-mail address
   * @param emailAddress E-mail address of the contact
   * @param faxNumber Telephone number of the mail user&#39;s primary fax machine
   * @param isEmpty Shows if MapiContactElectronicAddress is empty
   * @param originalDisplayName SMTP e-mail address that corresponds to the e-mail address for the Contact object.
   */
  public MapiContactElectronicAddressDto(
    String addressType,
    String displayName,
    String emailAddress,
    String faxNumber,
    Boolean isEmpty,
    String originalDisplayName
  ) {
    super();
    setAddressType(addressType);
    setDisplayName(displayName);
    setEmailAddress(emailAddress);
    setFaxNumber(faxNumber);
    setIsEmpty(isEmpty);
    setOriginalDisplayName(originalDisplayName);
  }

}

