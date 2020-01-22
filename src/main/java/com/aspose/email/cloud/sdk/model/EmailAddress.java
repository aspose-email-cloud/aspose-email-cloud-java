/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmailAddress.java">
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
 * Email address.             
 */
public class EmailAddress {
  @JsonProperty("category")
  private EnumWithCustomOfEmailAddressCategory category = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("preferred")
  private Boolean preferred = null;

  @JsonProperty("routingType")
  private String routingType = null;

  @JsonProperty("address")
  private String address = null;

  public EmailAddress category(EnumWithCustomOfEmailAddressCategory category) {
    this.category = category;
    return this;
  }

  /**
   * Address category.             
   * @return category
  **/
  public EnumWithCustomOfEmailAddressCategory getCategory() {
    return category;
  }  

  public void setCategory(EnumWithCustomOfEmailAddressCategory category) {
    this.category = category;
  }

  public EmailAddress displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Display name.             
   * @return displayName
  **/
  public String getDisplayName() {
    return displayName;
  }  

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public EmailAddress preferred(Boolean preferred) {
    this.preferred = preferred;
    return this;
  }

  /**
   * Defines whether email address is preferred.             
   * @return preferred
  **/
  public Boolean isPreferred() {
    return preferred;
  }  

  public void setPreferred(Boolean preferred) {
    this.preferred = preferred;
  }

  public EmailAddress routingType(String routingType) {
    this.routingType = routingType;
    return this;
  }

  /**
   * A routing type for an email.             
   * @return routingType
  **/
  public String getRoutingType() {
    return routingType;
  }  

  public void setRoutingType(String routingType) {
    this.routingType = routingType;
  }

  public EmailAddress address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Email address.             
   * @return address
  **/
  public String getAddress() {
    return address;
  }  

  public void setAddress(String address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    EmailAddress emailAddress = (EmailAddress) o;
    return ObjectUtils.equals(this.category, emailAddress.category) &&
    ObjectUtils.equals(this.displayName, emailAddress.displayName) &&
    ObjectUtils.equals(this.preferred, emailAddress.preferred) &&
    ObjectUtils.equals(this.routingType, emailAddress.routingType) &&
    ObjectUtils.equals(this.address, emailAddress.address);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(category, displayName, preferred, routingType, address);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailAddress {\n");
    
    sb.append("    category: ").append(toIndentedString(getCategory())).append("\n");
    sb.append("    displayName: ").append(toIndentedString(getDisplayName())).append("\n");
    sb.append("    preferred: ").append(toIndentedString(isPreferred())).append("\n");
    sb.append("    routingType: ").append(toIndentedString(getRoutingType())).append("\n");
    sb.append("    address: ").append(toIndentedString(getAddress())).append("\n");
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

  public EmailAddress() {
    super();
  }

  /**
   * Initializes a new instance of the EmailAddress
   * @param category Address category.             
   * @param displayName Display name.             
   * @param preferred Defines whether email address is preferred.             
   * @param routingType A routing type for an email.             
   * @param address Email address.             
   */
  public EmailAddress(EnumWithCustomOfEmailAddressCategory category, String displayName, Boolean preferred, String routingType, String address) {
    super();
    setCategory(category);
    setDisplayName(displayName);
    setPreferred(preferred);
    setRoutingType(routingType);
    setAddress(address);
  }

}

