/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmailAddress.java">
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
  @JsonProperty("originalAddressString")
  private String originalAddressString = null;

  /**
   * Set category and return this.
   * @param category Address category.             
   * @return this
  **/
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

  /**
   * Set category.
   * @param category Address category.             
  **/
  public void setCategory(EnumWithCustomOfEmailAddressCategory category) {
    this.category = category;
  }


  /**
   * Set displayName and return this.
   * @param displayName Display name.             
   * @return this
  **/
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

  /**
   * Set displayName.
   * @param displayName Display name.             
  **/
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  /**
   * Set preferred and return this.
   * @param preferred Defines whether email address is preferred.             
   * @return this
  **/
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

  /**
   * Set preferred.
   * @param preferred Defines whether email address is preferred.             
  **/
  public void setPreferred(Boolean preferred) {
    this.preferred = preferred;
  }


  /**
   * Set routingType and return this.
   * @param routingType A routing type for an email.             
   * @return this
  **/
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

  /**
   * Set routingType.
   * @param routingType A routing type for an email.             
  **/
  public void setRoutingType(String routingType) {
    this.routingType = routingType;
  }


  /**
   * Set address and return this.
   * @param address Email address.             
   * @return this
  **/
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

  /**
   * Set address.
   * @param address Email address.             
  **/
  public void setAddress(String address) {
    this.address = address;
  }


  /**
   * Set originalAddressString and return this.
   * @param originalAddressString The original e-mail address string             
   * @return this
  **/
  public EmailAddress originalAddressString(String originalAddressString) {
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
    EmailAddress emailAddress = (EmailAddress) o;
    return ObjectUtils.equals(this.category, emailAddress.category) &&
    ObjectUtils.equals(this.displayName, emailAddress.displayName) &&
    ObjectUtils.equals(this.preferred, emailAddress.preferred) &&
    ObjectUtils.equals(this.routingType, emailAddress.routingType) &&
    ObjectUtils.equals(this.address, emailAddress.address) &&
    ObjectUtils.equals(this.originalAddressString, emailAddress.originalAddressString);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(category, displayName, preferred, routingType, address, originalAddressString);
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
   * @param originalAddressString The original e-mail address string             
   */
  public EmailAddress(
    EnumWithCustomOfEmailAddressCategory category,
    String displayName,
    Boolean preferred,
    String routingType,
    String address,
    String originalAddressString
  ) {
    super();
    setCategory(category);
    setDisplayName(displayName);
    setPreferred(preferred);
    setRoutingType(routingType);
    setAddress(address);
    setOriginalAddressString(originalAddressString);
  }

}

