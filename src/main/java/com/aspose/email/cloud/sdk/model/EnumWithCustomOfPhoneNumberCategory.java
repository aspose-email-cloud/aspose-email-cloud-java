/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EnumWithCustomOfPhoneNumberCategory.java">
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
 * EnumWithCustomOfPhoneNumberCategory
 */
public class EnumWithCustomOfPhoneNumberCategory {
  @JsonProperty("value")
  private String value = null;
  @JsonProperty("description")
  private String description = null;

  /**
   * Set value and return this.
   * @param value Phone number category. Enum, available values: Custom, Home, Work, Office, Mobile, Fax, HomeFax, WorkFax, Pager, Car, Isdn, Telex, Callback, Radio, Company, TtyTdd, Assistant, Primary
   * @return this
  **/
  public EnumWithCustomOfPhoneNumberCategory value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Phone number category. Enum, available values: Custom, Home, Work, Office, Mobile, Fax, HomeFax, WorkFax, Pager, Car, Isdn, Telex, Callback, Radio, Company, TtyTdd, Assistant, Primary
   * @return value
  **/
  public String getValue() {
    return value;
  }  

  /**
   * Set value.
   * @param value Phone number category. Enum, available values: Custom, Home, Work, Office, Mobile, Fax, HomeFax, WorkFax, Pager, Car, Isdn, Telex, Callback, Radio, Company, TtyTdd, Assistant, Primary
  **/
  public void setValue(String value) {
    this.value = value;
  }


  /**
   * Set description and return this.
   * @param description 
   * @return this
  **/
  public EnumWithCustomOfPhoneNumberCategory description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }  

  /**
   * Set description.
   * @param description 
  **/
  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    EnumWithCustomOfPhoneNumberCategory enumWithCustomOfPhoneNumberCategory = (EnumWithCustomOfPhoneNumberCategory) o;
    return ObjectUtils.equals(this.value, enumWithCustomOfPhoneNumberCategory.value) &&
    ObjectUtils.equals(this.description, enumWithCustomOfPhoneNumberCategory.description);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(value, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnumWithCustomOfPhoneNumberCategory {\n");
    
    sb.append("    value: ").append(toIndentedString(getValue())).append("\n");
    sb.append("    description: ").append(toIndentedString(getDescription())).append("\n");
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

  public EnumWithCustomOfPhoneNumberCategory() {
    super();
  }

  /**
   * Initializes a new instance of the EnumWithCustomOfPhoneNumberCategory
   * @param value Phone number category. Enum, available values: Custom, Home, Work, Office, Mobile, Fax, HomeFax, WorkFax, Pager, Car, Isdn, Telex, Callback, Radio, Company, TtyTdd, Assistant, Primary
   * @param description 
   */
  public EnumWithCustomOfPhoneNumberCategory(
    String value,
    String description
  ) {
    super();
    setValue(value);
    setDescription(description);
  }

}

