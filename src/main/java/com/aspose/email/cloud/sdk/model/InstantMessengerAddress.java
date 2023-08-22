/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="InstantMessengerAddress.java">
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
 * Instant messenger address.             
 */
public class InstantMessengerAddress {
  @JsonProperty("category")
  private EnumWithCustomOfInstantMessengerCategory category = null;
  @JsonProperty("address")
  private String address = null;
  @JsonProperty("preferred")
  private Boolean preferred = null;

  /**
   * Set category and return this.
   * @param category Address category.             
   * @return this
  **/
  public InstantMessengerAddress category(EnumWithCustomOfInstantMessengerCategory category) {
    this.category = category;
    return this;
  }

  /**
   * Address category.             
   * @return category
  **/
  public EnumWithCustomOfInstantMessengerCategory getCategory() {
    return category;
  }  

  /**
   * Set category.
   * @param category Address category.             
  **/
  public void setCategory(EnumWithCustomOfInstantMessengerCategory category) {
    this.category = category;
  }


  /**
   * Set address and return this.
   * @param address Address.             
   * @return this
  **/
  public InstantMessengerAddress address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Address.             
   * @return address
  **/
  public String getAddress() {
    return address;
  }  

  /**
   * Set address.
   * @param address Address.             
  **/
  public void setAddress(String address) {
    this.address = address;
  }


  /**
   * Set preferred and return this.
   * @param preferred Determines whether this address is preferred.             
   * @return this
  **/
  public InstantMessengerAddress preferred(Boolean preferred) {
    this.preferred = preferred;
    return this;
  }

  /**
   * Determines whether this address is preferred.             
   * @return preferred
  **/
  public Boolean isPreferred() {
    return preferred;
  }  

  /**
   * Set preferred.
   * @param preferred Determines whether this address is preferred.             
  **/
  public void setPreferred(Boolean preferred) {
    this.preferred = preferred;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    InstantMessengerAddress instantMessengerAddress = (InstantMessengerAddress) o;
    return ObjectUtils.equals(this.category, instantMessengerAddress.category) &&
    ObjectUtils.equals(this.address, instantMessengerAddress.address) &&
    ObjectUtils.equals(this.preferred, instantMessengerAddress.preferred);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(category, address, preferred);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstantMessengerAddress {\n");
    
    sb.append("    category: ").append(toIndentedString(getCategory())).append("\n");
    sb.append("    address: ").append(toIndentedString(getAddress())).append("\n");
    sb.append("    preferred: ").append(toIndentedString(isPreferred())).append("\n");
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

  public InstantMessengerAddress() {
    super();
  }

  /**
   * Initializes a new instance of the InstantMessengerAddress
   * @param category Address category.             
   * @param address Address.             
   * @param preferred Determines whether this address is preferred.             
   */
  public InstantMessengerAddress(
    EnumWithCustomOfInstantMessengerCategory category,
    String address,
    Boolean preferred
  ) {
    super();
    setCategory(category);
    setAddress(address);
    setPreferred(preferred);
  }

}

