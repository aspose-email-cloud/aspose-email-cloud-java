/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiElectronicAddressDto.java">
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
 * Refers to the group of properties that define the e-mail address or fax address.             
 */
public class MapiElectronicAddressDto {
  @JsonProperty("addressType")
  private String addressType = null;
  @JsonProperty("emailAddress")
  private String emailAddress = null;
  @JsonProperty("displayName")
  private String displayName = null;
  @JsonProperty("faxNumber")
  private String faxNumber = null;
  @JsonProperty("originalDisplayName")
  private String originalDisplayName = null;

  /**
   * Set addressType and return this.
   * @param addressType Address type.             
   * @return this
  **/
  public MapiElectronicAddressDto addressType(String addressType) {
    this.addressType = addressType;
    return this;
  }

  /**
   * Address type.             
   * @return addressType
  **/
  public String getAddressType() {
    return addressType;
  }  

  /**
   * Set addressType.
   * @param addressType Address type.             
  **/
  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }


  /**
   * Set emailAddress and return this.
   * @param emailAddress Email address.             
   * @return this
  **/
  public MapiElectronicAddressDto emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Email address.             
   * @return emailAddress
  **/
  public String getEmailAddress() {
    return emailAddress;
  }  

  /**
   * Set emailAddress.
   * @param emailAddress Email address.             
  **/
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  /**
   * Set displayName and return this.
   * @param displayName User-readable display name for the e-mail address.             
   * @return this
  **/
  public MapiElectronicAddressDto displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * User-readable display name for the e-mail address.             
   * @return displayName
  **/
  public String getDisplayName() {
    return displayName;
  }  

  /**
   * Set displayName.
   * @param displayName User-readable display name for the e-mail address.             
  **/
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  /**
   * Set faxNumber and return this.
   * @param faxNumber Telephone number of the mail user&#39;s primary fax machine.             
   * @return this
  **/
  public MapiElectronicAddressDto faxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }

  /**
   * Telephone number of the mail user&#39;s primary fax machine.             
   * @return faxNumber
  **/
  public String getFaxNumber() {
    return faxNumber;
  }  

  /**
   * Set faxNumber.
   * @param faxNumber Telephone number of the mail user&#39;s primary fax machine.             
  **/
  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }


  /**
   * Set originalDisplayName and return this.
   * @param originalDisplayName SMTP e-mail address that  corresponds to the e-mail address.             
   * @return this
  **/
  public MapiElectronicAddressDto originalDisplayName(String originalDisplayName) {
    this.originalDisplayName = originalDisplayName;
    return this;
  }

  /**
   * SMTP e-mail address that  corresponds to the e-mail address.             
   * @return originalDisplayName
  **/
  public String getOriginalDisplayName() {
    return originalDisplayName;
  }  

  /**
   * Set originalDisplayName.
   * @param originalDisplayName SMTP e-mail address that  corresponds to the e-mail address.             
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
    MapiElectronicAddressDto mapiElectronicAddressDto = (MapiElectronicAddressDto) o;
    return ObjectUtils.equals(this.addressType, mapiElectronicAddressDto.addressType) &&
    ObjectUtils.equals(this.emailAddress, mapiElectronicAddressDto.emailAddress) &&
    ObjectUtils.equals(this.displayName, mapiElectronicAddressDto.displayName) &&
    ObjectUtils.equals(this.faxNumber, mapiElectronicAddressDto.faxNumber) &&
    ObjectUtils.equals(this.originalDisplayName, mapiElectronicAddressDto.originalDisplayName);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(addressType, emailAddress, displayName, faxNumber, originalDisplayName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapiElectronicAddressDto {\n");
    
    sb.append("    addressType: ").append(toIndentedString(getAddressType())).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(getEmailAddress())).append("\n");
    sb.append("    displayName: ").append(toIndentedString(getDisplayName())).append("\n");
    sb.append("    faxNumber: ").append(toIndentedString(getFaxNumber())).append("\n");
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

  public MapiElectronicAddressDto() {
    super();
  }

  /**
   * Initializes a new instance of the MapiElectronicAddressDto
   * @param addressType Address type.             
   * @param emailAddress Email address.             
   * @param displayName User-readable display name for the e-mail address.             
   * @param faxNumber Telephone number of the mail user&#39;s primary fax machine.             
   * @param originalDisplayName SMTP e-mail address that  corresponds to the e-mail address.             
   */
  public MapiElectronicAddressDto(
    String addressType,
    String emailAddress,
    String displayName,
    String faxNumber,
    String originalDisplayName
  ) {
    super();
    setAddressType(addressType);
    setEmailAddress(emailAddress);
    setDisplayName(displayName);
    setFaxNumber(faxNumber);
    setOriginalDisplayName(originalDisplayName);
  }

}

