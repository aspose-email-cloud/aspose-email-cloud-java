/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiRecipientDto.java">
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
 * Represents the recipient information in the Microsoft Outlook Message.             
 */
public class MapiRecipientDto {
  @JsonProperty("emailAddress")
  private String emailAddress = null;

  @JsonProperty("addressType")
  private String addressType = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("recipientType")
  private String recipientType = null;

  /**
   * Set emailAddress and return this.
   * @param emailAddress Email address of the message recipient or sender.             
   * @return this
  **/
  public MapiRecipientDto emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Email address of the message recipient or sender.             
   * @return emailAddress
  **/
  public String getEmailAddress() {
    return emailAddress;
  }  

  /**
   * Set emailAddress.
   * @param emailAddress Email address of the message recipient or sender.             
  **/
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  /**
   * Set addressType and return this.
   * @param addressType Type of the address of the message recipient or sender.             
   * @return this
  **/
  public MapiRecipientDto addressType(String addressType) {
    this.addressType = addressType;
    return this;
  }

  /**
   * Type of the address of the message recipient or sender.             
   * @return addressType
  **/
  public String getAddressType() {
    return addressType;
  }  

  /**
   * Set addressType.
   * @param addressType Type of the address of the message recipient or sender.             
  **/
  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }

  /**
   * Set displayName and return this.
   * @param displayName Display name of the message recipient or sender.             
   * @return this
  **/
  public MapiRecipientDto displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Display name of the message recipient or sender.             
   * @return displayName
  **/
  public String getDisplayName() {
    return displayName;
  }  

  /**
   * Set displayName.
   * @param displayName Display name of the message recipient or sender.             
  **/
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * Set recipientType and return this.
   * @param recipientType Represent the PR_RECIPIENT_TYPE property which contains the recipient type for a message recipient. Enum, available values: Unknown, MapiBcc, MapiCc, MapiP1, MapiSubmitted, MapiTo
   * @return this
  **/
  public MapiRecipientDto recipientType(String recipientType) {
    this.recipientType = recipientType;
    return this;
  }

  /**
   * Represent the PR_RECIPIENT_TYPE property which contains the recipient type for a message recipient. Enum, available values: Unknown, MapiBcc, MapiCc, MapiP1, MapiSubmitted, MapiTo
   * @return recipientType
  **/
  public String getRecipientType() {
    return recipientType;
  }  

  /**
   * Set recipientType.
   * @param recipientType Represent the PR_RECIPIENT_TYPE property which contains the recipient type for a message recipient. Enum, available values: Unknown, MapiBcc, MapiCc, MapiP1, MapiSubmitted, MapiTo
  **/
  public void setRecipientType(String recipientType) {
    this.recipientType = recipientType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    MapiRecipientDto mapiRecipientDto = (MapiRecipientDto) o;
    return ObjectUtils.equals(this.emailAddress, mapiRecipientDto.emailAddress) &&
    ObjectUtils.equals(this.addressType, mapiRecipientDto.addressType) &&
    ObjectUtils.equals(this.displayName, mapiRecipientDto.displayName) &&
    ObjectUtils.equals(this.recipientType, mapiRecipientDto.recipientType);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(emailAddress, addressType, displayName, recipientType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapiRecipientDto {\n");
    
    sb.append("    emailAddress: ").append(toIndentedString(getEmailAddress())).append("\n");
    sb.append("    addressType: ").append(toIndentedString(getAddressType())).append("\n");
    sb.append("    displayName: ").append(toIndentedString(getDisplayName())).append("\n");
    sb.append("    recipientType: ").append(toIndentedString(getRecipientType())).append("\n");
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

  public MapiRecipientDto() {
    super();
  }

  /**
   * Initializes a new instance of the MapiRecipientDto
   * @param emailAddress Email address of the message recipient or sender.             
   * @param addressType Type of the address of the message recipient or sender.             
   * @param displayName Display name of the message recipient or sender.             
   * @param recipientType Represent the PR_RECIPIENT_TYPE property which contains the recipient type for a message recipient. Enum, available values: Unknown, MapiBcc, MapiCc, MapiP1, MapiSubmitted, MapiTo
   */
  public MapiRecipientDto(
    String emailAddress,
    String addressType,
    String displayName,
    String recipientType
  ) {
    super();
    setEmailAddress(emailAddress);
    setAddressType(addressType);
    setDisplayName(displayName);
    setRecipientType(recipientType);
  }

}

