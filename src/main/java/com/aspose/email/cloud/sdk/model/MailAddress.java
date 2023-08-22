/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MailAddress.java">
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
 * Represents the address of a message.
 */
public class MailAddress {
  @JsonProperty("displayName")
  private String displayName = null;
  @JsonProperty("address")
  private String address = null;
  @JsonProperty("participationStatus")
  private String participationStatus = null;
  @JsonProperty("originalAddressString")
  private String originalAddressString = null;

  /**
   * Set displayName and return this.
   * @param displayName Display name             
   * @return this
  **/
  public MailAddress displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Display name             
   * @return displayName
  **/
  public String getDisplayName() {
    return displayName;
  }  

  /**
   * Set displayName.
   * @param displayName Display name             
  **/
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  /**
   * Set address and return this.
   * @param address Address             
   * @return this
  **/
  public MailAddress address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Address             
   * @return address
  **/
  public String getAddress() {
    return address;
  }  

  /**
   * Set address.
   * @param address Address             
  **/
  public void setAddress(String address) {
    this.address = address;
  }


  /**
   * Set participationStatus and return this.
   * @param participationStatus Identifies the participation status for the calendar user. Enum, available values: NeedsAction, Accepted, Declined, Tentative, Delegated
   * @return this
  **/
  public MailAddress participationStatus(String participationStatus) {
    this.participationStatus = participationStatus;
    return this;
  }

  /**
   * Identifies the participation status for the calendar user. Enum, available values: NeedsAction, Accepted, Declined, Tentative, Delegated
   * @return participationStatus
  **/
  public String getParticipationStatus() {
    return participationStatus;
  }  

  /**
   * Set participationStatus.
   * @param participationStatus Identifies the participation status for the calendar user. Enum, available values: NeedsAction, Accepted, Declined, Tentative, Delegated
  **/
  public void setParticipationStatus(String participationStatus) {
    this.participationStatus = participationStatus;
  }


  /**
   * Set originalAddressString and return this.
   * @param originalAddressString The original e-mail address string             
   * @return this
  **/
  public MailAddress originalAddressString(String originalAddressString) {
    this.originalAddressString = originalAddressString;
    return this;
  }

  /**
   * The original e-mail address string             
   * @return originalAddressString
  **/
  public String getOriginalAddressString() {
    return originalAddressString;
  }  

  /**
   * Set originalAddressString.
   * @param originalAddressString The original e-mail address string             
  **/
  public void setOriginalAddressString(String originalAddressString) {
    this.originalAddressString = originalAddressString;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    MailAddress mailAddress = (MailAddress) o;
    return ObjectUtils.equals(this.displayName, mailAddress.displayName) &&
    ObjectUtils.equals(this.address, mailAddress.address) &&
    ObjectUtils.equals(this.participationStatus, mailAddress.participationStatus) &&
    ObjectUtils.equals(this.originalAddressString, mailAddress.originalAddressString);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(displayName, address, participationStatus, originalAddressString);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailAddress {\n");
    
    sb.append("    displayName: ").append(toIndentedString(getDisplayName())).append("\n");
    sb.append("    address: ").append(toIndentedString(getAddress())).append("\n");
    sb.append("    participationStatus: ").append(toIndentedString(getParticipationStatus())).append("\n");
    sb.append("    originalAddressString: ").append(toIndentedString(getOriginalAddressString())).append("\n");
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

  public MailAddress() {
    super();
  }

  /**
   * Initializes a new instance of the MailAddress
   * @param displayName Display name             
   * @param address Address             
   * @param participationStatus Identifies the participation status for the calendar user. Enum, available values: NeedsAction, Accepted, Declined, Tentative, Delegated
   * @param originalAddressString The original e-mail address string             
   */
  public MailAddress(
    String displayName,
    String address,
    String participationStatus,
    String originalAddressString
  ) {
    super();
    setDisplayName(displayName);
    setAddress(address);
    setParticipationStatus(participationStatus);
    setOriginalAddressString(originalAddressString);
  }

}

