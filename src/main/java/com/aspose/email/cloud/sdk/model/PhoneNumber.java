/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="PhoneNumber.java">
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
 * A phone number.             
 */
public class PhoneNumber {
  @JsonProperty("category")
  private EnumWithCustomOfPhoneNumberCategory category = null;

  @JsonProperty("number")
  private String number = null;

  @JsonProperty("preferred")
  private Boolean preferred = null;

  /**
   * Set category and return this.
   * @param category Phone number category.             
   * @return this
  **/
  public PhoneNumber category(EnumWithCustomOfPhoneNumberCategory category) {
    this.category = category;
    return this;
  }

  /**
   * Phone number category.             
   * @return category
  **/
  public EnumWithCustomOfPhoneNumberCategory getCategory() {
    return category;
  }  

  /**
   * Set category.
   * @param category Phone number category.             
  **/
  public void setCategory(EnumWithCustomOfPhoneNumberCategory category) {
    this.category = category;
  }

  /**
   * Set number and return this.
   * @param number Phone number.             
   * @return this
  **/
  public PhoneNumber number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Phone number.             
   * @return number
  **/
  public String getNumber() {
    return number;
  }  

  /**
   * Set number.
   * @param number Phone number.             
  **/
  public void setNumber(String number) {
    this.number = number;
  }

  /**
   * Set preferred and return this.
   * @param preferred Defines whether phone number is preferred.             
   * @return this
  **/
  public PhoneNumber preferred(Boolean preferred) {
    this.preferred = preferred;
    return this;
  }

  /**
   * Defines whether phone number is preferred.             
   * @return preferred
  **/
  public Boolean isPreferred() {
    return preferred;
  }  

  /**
   * Set preferred.
   * @param preferred Defines whether phone number is preferred.             
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
    PhoneNumber phoneNumber = (PhoneNumber) o;
    return ObjectUtils.equals(this.category, phoneNumber.category) &&
    ObjectUtils.equals(this.number, phoneNumber.number) &&
    ObjectUtils.equals(this.preferred, phoneNumber.preferred);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(category, number, preferred);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumber {\n");
    
    sb.append("    category: ").append(toIndentedString(getCategory())).append("\n");
    sb.append("    number: ").append(toIndentedString(getNumber())).append("\n");
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

  public PhoneNumber() {
    super();
  }

  /**
   * Initializes a new instance of the PhoneNumber
   * @param category Phone number category.             
   * @param number Phone number.             
   * @param preferred Defines whether phone number is preferred.             
   */
  public PhoneNumber(EnumWithCustomOfPhoneNumberCategory category, String number, Boolean preferred) {
    super();
    setCategory(category);
    setNumber(number);
    setPreferred(preferred);
  }

}

