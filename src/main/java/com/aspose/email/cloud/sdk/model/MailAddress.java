/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MailAddress.java">
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
 * Represents the address of a message.
 */
public class MailAddress {
  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("address")
  private String address = null;

  @JsonProperty("participationStatus")
  private String participationStatus = null;

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

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

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

  public void setAddress(String address) {
    this.address = address;
  }

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

  public void setParticipationStatus(String participationStatus) {
    this.participationStatus = participationStatus;
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
    ObjectUtils.equals(this.participationStatus, mailAddress.participationStatus);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(displayName, address, participationStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailAddress {\n");
    
    sb.append("    displayName: ").append(toIndentedString(getDisplayName())).append("\n");
    sb.append("    address: ").append(toIndentedString(getAddress())).append("\n");
    sb.append("    participationStatus: ").append(toIndentedString(getParticipationStatus())).append("\n");
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
   */
  public MailAddress(String displayName, String address, String participationStatus) {
    super();
    setDisplayName(displayName);
    setAddress(address);
    setParticipationStatus(participationStatus);
  }

}

